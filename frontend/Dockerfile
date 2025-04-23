FROM node:16 as build-stage
WORKDIR /app
COPY . .
RUN npm install && npm run build

FROM nginx:1.27.5
COPY --from=build-stage /app/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf

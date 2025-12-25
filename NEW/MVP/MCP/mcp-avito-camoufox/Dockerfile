# Avito Camoufox Service
# Multi-account Avito with isolated browser fingerprints

FROM python:3.11-slim

# Install system dependencies for Camoufox/Firefox
RUN apt-get update && apt-get install -y \
    wget \
    curl \
    xvfb \
    libgtk-3-0 \
    libdbus-glib-1-2 \
    libxt6 \
    libx11-xcb1 \
    libasound2 \
    libpci3 \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Copy requirements first (for caching)
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Download Camoufox Firefox build
RUN camoufox fetch

# Copy application code
COPY *.py .
COPY config.json .

# Create data directory
RUN mkdir -p /data/avito-camoufox

# Environment
ENV PYTHONUNBUFFERED=1
ENV DATA_DIR=/data/avito-camoufox

EXPOSE 8793

CMD ["python", "server.py"]

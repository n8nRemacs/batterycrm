# Browser Service - Multi-tenant headless browser
FROM mcr.microsoft.com/playwright/python:v1.40.0-focal

WORKDIR /app

# Install dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy application
COPY . .

# Create data directory
RUN mkdir -p /data/browser-service

# Environment
ENV DATA_DIR=/data/browser-service
ENV PORT=8792
ENV PYTHONUNBUFFERED=1

# Expose port
EXPOSE 8792

# Health check
HEALTHCHECK --interval=30s --timeout=10s --start-period=10s --retries=3 \
    CMD python -c "import httpx; httpx.get('http://localhost:8792/health')" || exit 1

# Run server
CMD ["python", "server.py"]

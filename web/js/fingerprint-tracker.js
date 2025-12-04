/**
 * Eldoleado Fingerprint Tracker
 * Collects browser fingerprint and sends to backend for client identification
 *
 * Usage:
 *   <script src="/js/fingerprint-tracker.js"></script>
 *   <script>
 *     EldoleadoTracker.init({
 *       endpoint: 'https://n8n.n8nsrv.ru/webhook/fingerprint/track',
 *       tenantId: 'your-tenant-uuid'
 *     });
 *   </script>
 */

(function(window) {
  'use strict';

  const EldoleadoTracker = {
    config: {
      endpoint: '',
      tenantId: '',
      debug: false
    },

    /**
     * Initialize tracker
     */
    init: function(options) {
      this.config = Object.assign(this.config, options);

      if (!this.config.endpoint || !this.config.tenantId) {
        console.error('EldoleadoTracker: endpoint and tenantId required');
        return;
      }

      // Collect and send fingerprint on page load
      this.collectAndSend();
    },

    /**
     * Collect fingerprint components
     */
    collectFingerprint: function() {
      const components = {};

      // Screen info
      components.screen = {
        width: screen.width,
        height: screen.height,
        colorDepth: screen.colorDepth,
        pixelRatio: window.devicePixelRatio || 1
      };

      // Timezone
      components.timezone = Intl.DateTimeFormat().resolvedOptions().timeZone;
      components.timezoneOffset = new Date().getTimezoneOffset();

      // Language
      components.language = navigator.language;
      components.languages = navigator.languages ? navigator.languages.join(',') : '';

      // Platform
      components.platform = navigator.platform;
      components.userAgent = navigator.userAgent;
      components.vendor = navigator.vendor;

      // Hardware
      components.hardwareConcurrency = navigator.hardwareConcurrency || 0;
      components.deviceMemory = navigator.deviceMemory || 0;

      // Touch support
      components.touchSupport = 'ontouchstart' in window || navigator.maxTouchPoints > 0;
      components.maxTouchPoints = navigator.maxTouchPoints || 0;

      // Canvas fingerprint
      components.canvas = this.getCanvasFingerprint();

      // WebGL info
      components.webgl = this.getWebGLInfo();

      // Fonts (basic detection)
      components.fonts = this.detectFonts();

      // Audio context fingerprint
      components.audio = this.getAudioFingerprint();

      // Session storage test
      components.sessionStorage = this.testStorage('sessionStorage');
      components.localStorage = this.testStorage('localStorage');

      // Plugins (limited in modern browsers)
      components.plugins = this.getPlugins();

      // Do Not Track
      components.doNotTrack = navigator.doNotTrack || 'unspecified';

      // Cookie enabled
      components.cookieEnabled = navigator.cookieEnabled;

      return components;
    },

    /**
     * Canvas fingerprint
     */
    getCanvasFingerprint: function() {
      try {
        const canvas = document.createElement('canvas');
        const ctx = canvas.getContext('2d');
        canvas.width = 200;
        canvas.height = 50;

        // Draw text
        ctx.textBaseline = 'top';
        ctx.font = '14px Arial';
        ctx.fillStyle = '#f60';
        ctx.fillRect(125, 1, 62, 20);
        ctx.fillStyle = '#069';
        ctx.fillText('Eldoleado,FP', 2, 15);
        ctx.fillStyle = 'rgba(102, 204, 0, 0.7)';
        ctx.fillText('Eldoleado,FP', 4, 17);

        // Get data URL and hash it
        const dataURL = canvas.toDataURL();
        return this.hashCode(dataURL);
      } catch (e) {
        return 'not_supported';
      }
    },

    /**
     * WebGL info
     */
    getWebGLInfo: function() {
      try {
        const canvas = document.createElement('canvas');
        const gl = canvas.getContext('webgl') || canvas.getContext('experimental-webgl');

        if (!gl) return { supported: false };

        const debugInfo = gl.getExtension('WEBGL_debug_renderer_info');

        return {
          supported: true,
          vendor: debugInfo ? gl.getParameter(debugInfo.UNMASKED_VENDOR_WEBGL) : gl.getParameter(gl.VENDOR),
          renderer: debugInfo ? gl.getParameter(debugInfo.UNMASKED_RENDERER_WEBGL) : gl.getParameter(gl.RENDERER),
          version: gl.getParameter(gl.VERSION)
        };
      } catch (e) {
        return { supported: false };
      }
    },

    /**
     * Font detection (basic)
     */
    detectFonts: function() {
      const baseFonts = ['monospace', 'sans-serif', 'serif'];
      const testFonts = [
        'Arial', 'Arial Black', 'Comic Sans MS', 'Courier New', 'Georgia',
        'Impact', 'Lucida Console', 'Lucida Sans Unicode', 'Palatino Linotype',
        'Tahoma', 'Times New Roman', 'Trebuchet MS', 'Verdana',
        'Calibri', 'Cambria', 'Consolas', 'Segoe UI'
      ];

      const detected = [];
      const span = document.createElement('span');
      span.style.position = 'absolute';
      span.style.left = '-9999px';
      span.style.fontSize = '72px';
      span.innerHTML = 'mmmmmmmmmmlli';
      document.body.appendChild(span);

      const baseWidths = {};
      for (const base of baseFonts) {
        span.style.fontFamily = base;
        baseWidths[base] = span.offsetWidth;
      }

      for (const font of testFonts) {
        for (const base of baseFonts) {
          span.style.fontFamily = `'${font}', ${base}`;
          if (span.offsetWidth !== baseWidths[base]) {
            detected.push(font);
            break;
          }
        }
      }

      document.body.removeChild(span);
      return detected.join(',');
    },

    /**
     * Audio fingerprint
     */
    getAudioFingerprint: function() {
      try {
        const AudioContext = window.OfflineAudioContext || window.webkitOfflineAudioContext;
        if (!AudioContext) return 'not_supported';

        const context = new AudioContext(1, 44100, 44100);
        const oscillator = context.createOscillator();
        oscillator.type = 'triangle';
        oscillator.frequency.setValueAtTime(10000, context.currentTime);

        const compressor = context.createDynamicsCompressor();
        compressor.threshold.setValueAtTime(-50, context.currentTime);
        compressor.knee.setValueAtTime(40, context.currentTime);
        compressor.ratio.setValueAtTime(12, context.currentTime);
        compressor.attack.setValueAtTime(0, context.currentTime);
        compressor.release.setValueAtTime(0.25, context.currentTime);

        oscillator.connect(compressor);
        compressor.connect(context.destination);
        oscillator.start(0);
        context.startRendering();

        return 'audio_supported';
      } catch (e) {
        return 'not_supported';
      }
    },

    /**
     * Storage test
     */
    testStorage: function(type) {
      try {
        const storage = window[type];
        const x = '__storage_test__';
        storage.setItem(x, x);
        storage.removeItem(x);
        return true;
      } catch (e) {
        return false;
      }
    },

    /**
     * Get plugins
     */
    getPlugins: function() {
      if (!navigator.plugins) return '';
      const plugins = [];
      for (let i = 0; i < navigator.plugins.length; i++) {
        plugins.push(navigator.plugins[i].name);
      }
      return plugins.join(',');
    },

    /**
     * Simple hash function
     */
    hashCode: function(str) {
      let hash = 0;
      for (let i = 0; i < str.length; i++) {
        const char = str.charCodeAt(i);
        hash = ((hash << 5) - hash) + char;
        hash = hash & hash;
      }
      return hash.toString(16);
    },

    /**
     * Generate fingerprint hash from components
     */
    generateHash: function(components) {
      const str = JSON.stringify(components);
      // Simple hash - in production use SHA-256
      let hash = 0;
      for (let i = 0; i < str.length; i++) {
        const char = str.charCodeAt(i);
        hash = ((hash << 5) - hash) + char;
        hash = hash & hash;
      }
      // Convert to positive hex string
      return (hash >>> 0).toString(16).padStart(8, '0');
    },

    /**
     * Get short link code from URL if present
     */
    getShortLinkCode: function() {
      // Check URL parameter
      const urlParams = new URLSearchParams(window.location.search);
      const code = urlParams.get('slc'); // short link code
      if (code) return code;

      // Check referrer for /s/CODE pattern
      const referrer = document.referrer;
      const match = referrer.match(/\/s\/([a-zA-Z0-9]+)/);
      if (match) return match[1];

      // Check localStorage for recent code
      const stored = localStorage.getItem('eld_slc');
      if (stored) {
        const data = JSON.parse(stored);
        // Valid for 30 minutes
        if (Date.now() - data.time < 30 * 60 * 1000) {
          return data.code;
        }
      }

      return null;
    },

    /**
     * Store short link code
     */
    storeShortLinkCode: function(code) {
      if (code) {
        localStorage.setItem('eld_slc', JSON.stringify({
          code: code,
          time: Date.now()
        }));
      }
    },

    /**
     * Collect and send fingerprint
     */
    collectAndSend: function() {
      const self = this;

      // Wait for DOM ready
      if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', function() {
          self._doCollectAndSend();
        });
      } else {
        self._doCollectAndSend();
      }
    },

    _doCollectAndSend: function() {
      const components = this.collectFingerprint();
      const hash = this.generateHash(components);
      const shortLinkCode = this.getShortLinkCode();

      // Store code if present in URL
      const urlCode = new URLSearchParams(window.location.search).get('slc');
      if (urlCode) {
        this.storeShortLinkCode(urlCode);
      }

      const payload = {
        fingerprint_hash: hash,
        components: components,
        short_link_code: shortLinkCode,
        url: window.location.href,
        referrer: document.referrer,
        tenant_id: this.config.tenantId,
        timestamp: new Date().toISOString()
      };

      if (this.config.debug) {
        console.log('EldoleadoTracker payload:', payload);
      }

      // Send to backend
      fetch(this.config.endpoint, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(payload),
        keepalive: true
      }).then(function(response) {
        if (self.config.debug) {
          console.log('EldoleadoTracker sent:', response.status);
        }
      }).catch(function(error) {
        if (self.config.debug) {
          console.error('EldoleadoTracker error:', error);
        }
      });

      // Store fingerprint locally for future reference
      localStorage.setItem('eld_fp', hash);
    },

    /**
     * Get stored fingerprint hash
     */
    getStoredFingerprint: function() {
      return localStorage.getItem('eld_fp');
    }
  };

  // Export
  window.EldoleadoTracker = EldoleadoTracker;

})(window);

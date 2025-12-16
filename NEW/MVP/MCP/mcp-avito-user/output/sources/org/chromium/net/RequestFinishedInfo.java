package org.chromium.net;

import j.P;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public abstract class RequestFinishedInfo {
    public static final int CANCELED = 2;
    public static final int FAILED = 1;
    public static final int SUCCEEDED = 0;

    public static abstract class Listener {
        private final Executor mExecutor;

        public Listener(Executor executor) {
            if (executor == null) {
                throw new IllegalStateException("Executor must not be null");
            }
            this.mExecutor = executor;
        }

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public abstract void onRequestFinished(RequestFinishedInfo requestFinishedInfo);
    }

    public static abstract class Metrics {
        @P
        public abstract Date getConnectEnd();

        @P
        public abstract Date getConnectStart();

        @P
        public abstract Date getDnsEnd();

        @P
        public abstract Date getDnsStart();

        @P
        public abstract Date getPushEnd();

        @P
        public abstract Date getPushStart();

        @P
        public abstract Long getReceivedByteCount();

        @P
        public abstract Date getRequestEnd();

        @P
        public abstract Date getRequestStart();

        @P
        public abstract Date getResponseStart();

        @P
        public abstract Date getSendingEnd();

        @P
        public abstract Date getSendingStart();

        @P
        public abstract Long getSentByteCount();

        public abstract boolean getSocketReused();

        @P
        public abstract Date getSslEnd();

        @P
        public abstract Date getSslStart();

        @P
        public abstract Long getTotalTimeMs();

        @P
        public abstract Long getTtfbMs();
    }

    public abstract Collection<Object> getAnnotations();

    @P
    public abstract CronetException getException();

    public abstract int getFinishedReason();

    public abstract Metrics getMetrics();

    @P
    public abstract UrlResponseInfo getResponseInfo();

    public abstract String getUrl();
}

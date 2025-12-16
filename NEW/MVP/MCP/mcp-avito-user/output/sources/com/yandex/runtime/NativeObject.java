package com.yandex.runtime;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class NativeObject {
    private boolean canBeDeletedInBackground;
    private long nativeObject;

    public static final class Cleaner implements Runnable {
        private final long nativeObject;

        public Cleaner(long j12) {
            this.nativeObject = j12;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeObject.deleteNative(this.nativeObject);
        }
    }

    public NativeObject(long j12, boolean z12) {
        this.nativeObject = j12;
        this.canBeDeletedInBackground = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void deleteNative(long j12);

    public void finalize() {
        if (isEmpty()) {
            return;
        }
        if (this.canBeDeletedInBackground) {
            deleteNative(this.nativeObject);
        } else {
            new Handler(Looper.getMainLooper()).post(new Cleaner(this.nativeObject));
        }
        this.nativeObject = 0L;
    }

    public boolean isEmpty() {
        return this.nativeObject == 0;
    }

    public long release() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot release native object outside the UI thread");
        }
        long j12 = this.nativeObject;
        this.nativeObject = 0L;
        return j12;
    }

    public void reset() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot reset native object outside the UI thread");
        }
        deleteNative(this.nativeObject);
        this.nativeObject = 0L;
    }
}

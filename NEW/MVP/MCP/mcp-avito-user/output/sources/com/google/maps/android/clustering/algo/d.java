package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.b;

/* compiled from: PreCachingAlgorithmDecorator.java */
/* loaded from: classes6.dex */
public class d<T extends com.google.maps.android.clustering.b> implements com.google.maps.android.clustering.algo.a<T> {

    /* compiled from: PreCachingAlgorithmDecorator.java */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            throw null;
        }
    }
}

package com.google.common.util.concurrent;

import bZ0.InterfaceC25600a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: ListenerCallQueue.java */
@InterfaceC37531b0
@XY0.d
@XY0.c
/* loaded from: classes6.dex */
final class G0<L> {

    /* renamed from: a, reason: collision with root package name */
    public final List<b<L>> f360530a = Collections.synchronizedList(new ArrayList());

    /* compiled from: ListenerCallQueue.java */
    public interface a<L> {
    }

    /* compiled from: ListenerCallQueue.java */
    public static final class b<L> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC25600a
        public boolean f360531b;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                synchronized (this) {
                    com.google.common.base.M.q(this.f360531b);
                    throw null;
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    this.f360531b = false;
                    throw th2;
                }
            }
        }
    }

    static {
        Logger.getLogger(G0.class.getName());
    }
}

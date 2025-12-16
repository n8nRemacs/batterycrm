package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.I;
import j.P;

/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes6.dex */
public interface i {

    /* compiled from: AudioRendererEventListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Handler f343996a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final i f343997b;

        public a(@P Handler handler, @P i iVar) {
            if (iVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f343996a = handler;
            this.f343997b = iVar;
        }

        public final void a(com.google.android.exoplayer2.decoder.f fVar) {
            synchronized (fVar) {
            }
            Handler handler = this.f343996a;
            if (handler != null) {
                handler.post(new h(this, fVar, 1));
            }
        }
    }

    default void L2(String str) {
    }

    default void b1(Exception exc) {
    }

    default void f3(long j12) {
    }

    default void l2(Exception exc) {
    }

    default void md(com.google.android.exoplayer2.decoder.f fVar) {
    }

    default void onSkipSilenceEnabledChanged(boolean z12) {
    }

    default void u8(com.google.android.exoplayer2.decoder.f fVar) {
    }

    default void M7(I i12, @P com.google.android.exoplayer2.decoder.h hVar) {
    }

    default void F2(int i12, long j12, long j13) {
    }

    default void d2(long j12, long j13, String str) {
    }
}

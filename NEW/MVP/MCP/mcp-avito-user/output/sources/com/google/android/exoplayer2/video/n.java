package com.google.android.exoplayer2.video;

import android.os.Handler;
import com.google.android.exoplayer2.I;
import j.P;

/* compiled from: VideoRendererEventListener.java */
/* loaded from: classes6.dex */
public interface n {

    /* compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Handler f348318a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final n f348319b;

        public a(@P Handler handler, @P n nVar) {
            this.f348318a = handler;
            this.f348319b = nVar;
        }
    }

    default void I2(String str) {
    }

    default void Yd(com.google.android.exoplayer2.decoder.f fVar) {
    }

    default void g3(Exception exc) {
    }

    default void g9(com.google.android.exoplayer2.decoder.f fVar) {
    }

    default void onVideoSizeChanged(o oVar) {
    }

    default void R2(int i12, long j12) {
    }

    default void Yc(I i12, @P com.google.android.exoplayer2.decoder.h hVar) {
    }

    default void a2(long j12, Object obj) {
    }

    default void g2(int i12, long j12) {
    }

    default void E2(long j12, long j13, String str) {
    }
}

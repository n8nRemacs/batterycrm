package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.util.C36605v;
import j.P;
import java.util.List;

/* compiled from: ExoTrackSelection.java */
/* loaded from: classes6.dex */
public interface k extends o {

    /* compiled from: ExoTrackSelection.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final V f347268a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f347269b;

        public a(int i12, V v12, int[] iArr) {
            if (iArr.length == 0) {
                C36605v.a("Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f347268a = v12;
            this.f347269b = iArr;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    public interface b {
    }

    void N();

    int a();

    I c();

    void e(float f12);

    void j();

    default boolean l(long j12, com.google.android.exoplayer2.source.chunk.e eVar, List<? extends com.google.android.exoplayer2.source.chunk.m> list) {
        return false;
    }

    int m(long j12, List<? extends com.google.android.exoplayer2.source.chunk.m> list);

    void n(long j12, long j13, long j14, List<? extends com.google.android.exoplayer2.source.chunk.m> list, com.google.android.exoplayer2.source.chunk.n[] nVarArr);

    int o();

    boolean p(int i12, long j12);

    boolean q(int i12, long j12);

    @P
    Object r();

    int s();

    default void g() {
    }

    default void k() {
    }

    default void f(boolean z12) {
    }
}

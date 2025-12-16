package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.audio.C36506d;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.W;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.trackselection.m;
import com.google.android.exoplayer2.upstream.InterfaceC36574d;
import j.InterfaceC42153i;
import j.P;

/* compiled from: TrackSelector.java */
/* loaded from: classes6.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    @P
    public a f347334a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public InterfaceC36574d f347335b;

    /* compiled from: TrackSelector.java */
    public interface a {
        void a();
    }

    public r a() {
        return r.f347281B;
    }

    public abstract void b(@P m.a aVar);

    @InterfaceC42153i
    public void c() {
        this.f347334a = null;
        this.f347335b = null;
    }

    public abstract u d(i0[] i0VarArr, W w12, y.b bVar, s0 s0Var);

    public void e(C36506d c36506d) {
    }

    public void f(r rVar) {
    }
}

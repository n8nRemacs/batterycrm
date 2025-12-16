package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.p;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: SingleSampleMediaSource.java */
/* loaded from: classes6.dex */
public final class T extends AbstractC36538a {

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.p f346132i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC36583m.a f346133j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.I f346134k;

    /* renamed from: l, reason: collision with root package name */
    public final long f346135l;

    /* renamed from: m, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.z f346136m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f346137n;

    /* renamed from: o, reason: collision with root package name */
    public final Q f346138o;

    /* renamed from: p, reason: collision with root package name */
    public final com.google.android.exoplayer2.O f346139p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.upstream.M f346140q;

    /* compiled from: SingleSampleMediaSource.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC36583m.a f346141a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.z f346142b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f346143c;

        public b(InterfaceC36583m.a aVar) {
            aVar.getClass();
            this.f346141a = aVar;
            this.f346142b = new com.google.android.exoplayer2.upstream.x();
            this.f346143c = true;
        }
    }

    public T(String str, O.l lVar, InterfaceC36583m.a aVar, long j12, com.google.android.exoplayer2.upstream.z zVar, boolean z12, Object obj, a aVar2) {
        this.f346133j = aVar;
        this.f346135l = j12;
        this.f346136m = zVar;
        this.f346137n = z12;
        O.c cVar = new O.c();
        cVar.f343535b = Uri.EMPTY;
        String string = lVar.f343587a.toString();
        string.getClass();
        cVar.f343534a = string;
        cVar.f343541h = AbstractC37401r1.v(AbstractC37401r1.E(lVar));
        cVar.f343543j = obj;
        com.google.android.exoplayer2.O oA2 = cVar.a();
        this.f346139p = oA2;
        I.b bVar = new I.b();
        bVar.f343504k = (String) com.google.common.base.D.a(lVar.f343588b, "text/x-unknown");
        bVar.f343496c = lVar.f343589c;
        bVar.f343497d = lVar.f343590d;
        bVar.f343498e = lVar.f343591e;
        bVar.f343495b = lVar.f343592f;
        String str2 = lVar.f343593g;
        bVar.f343494a = str2 == null ? str : str2;
        this.f346134k = bVar.a();
        p.b bVar2 = new p.b();
        bVar2.f347939a = lVar.f343587a;
        bVar2.f347947i = 1;
        this.f346132i = bVar2.a();
        this.f346138o = new Q(-9223372036854775807L, -9223372036854775807L, j12, j12, 0L, 0L, true, false, false, null, oA2, null);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void B(@j.P com.google.android.exoplayer2.upstream.M m12) {
        this.f346140q = m12;
        C(this.f346138o);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final InterfaceC36559w c(y.b bVar, InterfaceC36572b interfaceC36572b, long j12) {
        com.google.android.exoplayer2.upstream.M m12 = this.f346140q;
        A.a aVarY = y(bVar);
        return new S(this.f346132i, this.f346133j, m12, this.f346134k, this.f346135l, this.f346136m, aVarY, this.f346137n);
    }

    @Override // com.google.android.exoplayer2.source.y
    public final com.google.android.exoplayer2.O getMediaItem() {
        return this.f346139p;
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void t(InterfaceC36559w interfaceC36559w) {
        ((S) interfaceC36559w).f346119j.e(null);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC36538a
    public final void D() {
    }

    @Override // com.google.android.exoplayer2.source.y
    public final void maybeThrowSourceInfoRefreshError() {
    }
}

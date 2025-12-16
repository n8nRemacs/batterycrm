package com.google.android.datatransport.runtime;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.google.android.datatransport.runtime.b;
import com.google.android.datatransport.runtime.c;

/* compiled from: TransportImpl.java */
/* loaded from: classes10.dex */
final class t<T> implements com.google.android.datatransport.g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final r f343285a;

    /* renamed from: b, reason: collision with root package name */
    public final String f343286b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.c f343287c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.datatransport.f<T, byte[]> f343288d;

    /* renamed from: e, reason: collision with root package name */
    public final v f343289e;

    public t(r rVar, String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.f fVar, v vVar) {
        this.f343285a = rVar;
        this.f343286b = str;
        this.f343287c = cVar;
        this.f343288d = fVar;
        this.f343289e = vVar;
    }

    @Override // com.google.android.datatransport.g
    public final void a(com.google.android.datatransport.d<T> dVar) {
        b(dVar, new C31685o(25));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.datatransport.g
    public final void b(com.google.android.datatransport.d<T> dVar, com.google.android.datatransport.i iVar) {
        c.b bVar = new c.b();
        r rVar = this.f343285a;
        if (rVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        bVar.f343118a = rVar;
        bVar.f343120c = dVar;
        bVar.f343119b = this.f343286b;
        com.google.android.datatransport.f<T, byte[]> fVar = this.f343288d;
        if (fVar == null) {
            throw new NullPointerException("Null transformer");
        }
        bVar.f343121d = fVar;
        bVar.f343122e = this.f343287c;
        String strQ = bVar.f343122e == null ? androidx.appcompat.app.r.q("", " encoding") : "";
        if (!strQ.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }
        c cVar = new c(bVar.f343118a, bVar.f343119b, bVar.f343120c, bVar.f343121d, bVar.f343122e, null);
        v vVar = this.f343289e;
        com.google.android.datatransport.d<?> dVar2 = cVar.f343115c;
        r rVarE = cVar.f343113a.e(dVar2.c());
        b.C10562b c10562b = (b.C10562b) j.a();
        c10562b.f343082d = Long.valueOf(vVar.f343293a.O());
        c10562b.f343083e = Long.valueOf(vVar.f343294b.O());
        c10562b.g(cVar.f343114b);
        c10562b.f343081c = new i(cVar.f343117e, cVar.f343116d.apply(dVar2.b()));
        c10562b.f343080b = dVar2.a();
        vVar.f343295c.a(rVarE, c10562b.b(), iVar);
    }
}

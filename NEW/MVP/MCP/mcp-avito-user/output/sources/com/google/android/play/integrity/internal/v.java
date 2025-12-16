package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class v extends o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f358927c;

    public v(y yVar) {
        this.f358927c = yVar;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() {
        z zVar = this.f358927c.f358928b;
        zVar.f358931b.a("unlinkToDeath", new Object[0]);
        zVar.f358942m.asBinder().unlinkToDeath(zVar.f358939j, 0);
        zVar.f358942m = null;
        zVar.f358936g = false;
    }
}

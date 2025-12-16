package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
final class s extends o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f358924c;

    public s(z zVar) {
        this.f358924c = zVar;
    }

    @Override // com.google.android.play.integrity.internal.o
    public final void b() {
        z zVar = this.f358924c;
        if (zVar.f358942m != null) {
            zVar.f358931b.a("Unbind from service.", new Object[0]);
            zVar.f358930a.unbindService(zVar.f358941l);
            zVar.f358936g = false;
            zVar.f358942m = null;
            zVar.f358941l = null;
        }
        zVar.d();
    }
}

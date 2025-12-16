package com.google.android.exoplayer2.text;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes6.dex */
class f extends m {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f346908g;

    public f(g gVar) {
        this.f346908g = gVar;
    }

    @Override // com.google.android.exoplayer2.decoder.g
    public final void h() {
        g gVar = this.f346908g;
        synchronized (gVar.f344243b) {
            this.f344210b = 0;
            this.f346916e = null;
            int i12 = gVar.f344249h;
            gVar.f344249h = i12 + 1;
            gVar.f344247f[i12] = this;
            if (!gVar.f344244c.isEmpty() && gVar.f344249h > 0) {
                gVar.f344243b.notify();
            }
        }
    }
}

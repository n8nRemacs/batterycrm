package androidx.media3.extractor.text;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes.dex */
class c extends i {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f51146g;

    public c(d dVar) {
        this.f51146g = dVar;
    }

    @Override // androidx.media3.decoder.f
    public final void h() {
        d dVar = this.f51146g;
        synchronized (dVar.f48344b) {
            this.f48328b = 0;
            this.f51301e = null;
            int i12 = dVar.f48350h;
            dVar.f48350h = i12 + 1;
            dVar.f48348f[i12] = this;
            if (!dVar.f48345c.isEmpty() && dVar.f48350h > 0) {
                dVar.f48344b.notify();
            }
        }
    }
}

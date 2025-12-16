package androidx.media3.session;

import android.os.Handler;

/* compiled from: PlayerWrapper.java */
/* loaded from: classes.dex */
class F1 extends androidx.media.J {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Handler f52045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G1 f52046h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(G1 g12, int i12, int i13, int i14, String str, Handler handler) {
        super(i12, i13, str, i14);
        this.f52046h = g12;
        this.f52045g = handler;
    }

    @Override // androidx.media.J
    public final void b(int i12) {
        androidx.media3.common.util.M.I(this.f52045g, new E1(i12, 1, this));
    }

    @Override // androidx.media.J
    public final void c(int i12) {
        androidx.media3.common.util.M.I(this.f52045g, new E1(i12, 0, this));
    }
}

package Fc1;

import feedback.shared.sdk.api.network.entities.Copyright;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class W implements InterfaceC13687o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Copyright f5264a;

    public W(Copyright copyright) {
        this.f5264a = copyright;
    }

    @Override // Fc1.InterfaceC13687o0
    @Y61.l
    public final C13614g a() {
        String imageUrl;
        Copyright copyright = this.f5264a;
        if (copyright == null || (imageUrl = copyright.getImageUrl()) == null) {
            return null;
        }
        return new C13614g(imageUrl);
    }

    @Override // Fc1.InterfaceC13687o0
    public final boolean b() {
        Copyright copyright = this.f5264a;
        if (copyright != null) {
            return copyright.isShow();
        }
        return false;
    }

    @Override // Fc1.InterfaceC13687o0
    @Y61.l
    public final String c() {
        Copyright copyright = this.f5264a;
        if (copyright != null) {
            return copyright.getHref();
        }
        return null;
    }
}

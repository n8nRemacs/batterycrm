package com.avito.android.iac_avcalls.impl_module.platform_v1;

import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41772e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class b implements InterfaceC41772e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f164586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f164587d;

    public /* synthetic */ b(d dVar, String str, int i12) {
        this.f164585b = i12;
        this.f164586c = dVar;
        this.f164587d = str;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41772e
    public final void e(InterfaceC41770c interfaceC41770c) {
        switch (this.f164585b) {
            case 0:
                this.f164586c.f164595a.a().e(this.f164587d, new com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d(interfaceC41770c));
                break;
            case 1:
                this.f164586c.f164595a.a().m(this.f164587d, new com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d(interfaceC41770c));
                break;
            default:
                this.f164586c.f164595a.a().l(this.f164587d, new com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d(interfaceC41770c));
                break;
        }
    }
}

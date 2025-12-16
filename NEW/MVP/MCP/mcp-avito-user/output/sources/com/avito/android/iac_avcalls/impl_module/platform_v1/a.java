package com.avito.android.iac_avcalls.impl_module.platform_v1;

import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41772e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements InterfaceC41772e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f164526c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IacPiiString f164527d;

    public /* synthetic */ a(d dVar, IacPiiString iacPiiString, int i12) {
        this.f164525b = i12;
        this.f164526c = dVar;
        this.f164527d = iacPiiString;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41772e
    public final void e(InterfaceC41770c interfaceC41770c) {
        switch (this.f164525b) {
            case 0:
                this.f164526c.f164595a.a().j(this.f164527d.unwrap(), new com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d(interfaceC41770c));
                break;
            default:
                this.f164526c.f164595a.a().k(this.f164527d.unwrap(), new com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d(interfaceC41770c));
                break;
        }
    }
}

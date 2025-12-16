package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressListLink;
import kotlin.G0;
import kotlin.Metadata;
import sv.C48421d;
import yA0.InterfaceC50095c;

/* compiled from: SxAddressListDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class A extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f292761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SxAddressListLink f292762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b12, SxAddressListLink sxAddressListLink) {
        super(0);
        this.f292761l = b12;
        this.f292762m = sxAddressListLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        B b12 = this.f292761l;
        InterfaceC50095c interfaceC50095c = b12.f292764h;
        SxAddressListLink sxAddressListLink = this.f292762m;
        b12.f292765i.J(interfaceC50095c.e(b12.f292763g, sxAddressListLink.f67559b, sxAddressListLink.f67560c), C48421d.a(b12), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}

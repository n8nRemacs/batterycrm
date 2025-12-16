package com.avito.android.user_address.deeplink;

import com.avito.android.deep_linking.links.UserAddressLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: UserAddressAddNewRealtyAddressDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_address.deeplink.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35340a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35341b f307215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UserAddressAddNewRealtyAddressLink f307216m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35340a(C35341b c35341b, UserAddressAddNewRealtyAddressLink userAddressAddNewRealtyAddressLink) {
        super(0);
        this.f307215l = c35341b;
        this.f307216m = userAddressAddNewRealtyAddressLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C35341b c35341b = this.f307215l;
        UserAddressAddNewRealtyAddressLink userAddressAddNewRealtyAddressLink = this.f307216m;
        c35341b.f307218g.J(c35341b.f307217f.f(userAddressAddNewRealtyAddressLink.f307213b, UserAddressLink.BottomSheetState.COLLAPSED, null, userAddressAddNewRealtyAddressLink.f307214c, true), C48421d.a(c35341b), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}

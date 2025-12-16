package com.avito.android.cart.deep_link;

import android.net.Uri;
import com.avito.android.analytics.screens.CartScreen;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.util.A4;
import com.avito.android.util.C35809h6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sv.C48421d;

/* compiled from: CartLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f115299l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CartLink f115300m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, CartLink cartLink) {
        super(0);
        this.f115299l = aVar;
        this.f115300m = cartLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f115299l;
        aVar.f115293g.J(aVar.f115295i.a(new BeduinV2PageDeepLink(C35809h6.d(Uri.parse("api/3/cart/items"), A4.j(A4.f318516a, this.f115300m.f133088b)).toString(), CartScreen.f90312d.f90471b, true, false, false, null, null, null, false, 480, null)), C48421d.a(aVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}

package com.avito.android.cart_similar_items.deep_link;

import Ju.AbstractC14250d;
import android.content.Intent;
import com.avito.android.Z0;
import com.avito.android.deeplink_handler.view.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import sv.C48421d;

/* compiled from: CartSimilarItemsLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f115720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CartSimilarItemsLink f115721m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, CartSimilarItemsLink cartSimilarItemsLink) {
        super(0);
        this.f115720l = dVar;
        this.f115721m = cartSimilarItemsLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f115720l;
        CartSimilarItemsLink cartSimilarItemsLink = this.f115721m;
        Intent intentA = dVar.f115722f.a(cartSimilarItemsLink.f115713b, cartSimilarItemsLink.f115714c, cartSimilarItemsLink.f115715d, cartSimilarItemsLink.f115716e);
        Z0 z02 = dVar.f115726j;
        z02.getClass();
        n<Object> nVar = Z0.f67595D[9];
        boolean zBooleanValue = ((Boolean) z02.f67609l.a().invoke()).booleanValue();
        a.InterfaceC4053a interfaceC4053a = dVar.f115723g;
        if (zBooleanValue) {
            interfaceC4053a.J(intentA, C48421d.a(dVar), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            interfaceC4053a.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
            dVar.j(AbstractC14250d.c.f9171c);
        }
        return G0.f406611a;
    }
}

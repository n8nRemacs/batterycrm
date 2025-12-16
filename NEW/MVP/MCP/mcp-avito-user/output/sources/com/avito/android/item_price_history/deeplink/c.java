package com.avito.android.item_price_history.deeplink;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: ItemPriceHistoryDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_price_history/deeplink/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/item_price_history/deeplink/ItemPriceHistoryLink;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<ItemPriceHistoryLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.favorite.h f173669g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f173670h;

    @Inject
    public c(@k com.avito.android.favorite.h hVar, @k a.d dVar, @k R0 r02) {
        super(r02);
        this.f173669g = hVar;
        this.f173670h = dVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((ItemPriceHistoryLink) deepLink, bundle, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.item_price_history.deeplink.ItemPriceHistoryLink r6, @Y61.l android.os.Bundle r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.avito.android.item_price_history.deeplink.a
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.item_price_history.deeplink.a r0 = (com.avito.android.item_price_history.deeplink.a) r0
            int r1 = r0.f173665v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173665v = r1
            goto L18
        L13:
            com.avito.android.item_price_history.deeplink.a r0 = new com.avito.android.item_price_history.deeplink.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f173663t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f173665v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            android.os.Bundle r7 = r0.f173662s
            com.avito.android.item_price_history.deeplink.ItemPriceHistoryLink r6 = r0.f173661r
            com.avito.android.item_price_history.deeplink.c r0 = r0.f173660q
            kotlin.C42729a0.b(r8)
            goto L5b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r8)
            r8 = 0
            if (r7 == 0) goto L43
            java.lang.String r2 = "key.item_price_history_is_favorite"
            boolean r8 = r7.getBoolean(r2, r8)
        L43:
            java.lang.String r2 = r6.f173656b
            com.avito.android.favorite.h r4 = r5.f173669g
            io.reactivex.rxjava3.internal.operators.single.W r8 = r4.b(r2, r8)
            r0.f173660q = r5
            r0.f173661r = r6
            r0.f173662s = r7
            r0.f173665v = r3
            java.lang.Object r8 = kotlinx.coroutines.rx3.C43292o.b(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r0 = r5
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.avito.android.deeplink_handler.view.a$d r1 = r0.f173670h
            com.avito.android.item_price_history.deeplink.b r2 = new com.avito.android.item_price_history.deeplink.b
            r2.<init>(r7, r6, r8)
            java.lang.String r6 = "fragment_tag.item_price_history"
            r1.D0(r6, r2)
            Ju.d$c r6 = Ju.AbstractC14250d.c.f9171c
            r0.j(r6)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.item_price_history.deeplink.c.o(com.avito.android.item_price_history.deeplink.ItemPriceHistoryLink, android.os.Bundle, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

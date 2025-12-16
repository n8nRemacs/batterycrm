package com.avito.android.cart_snippet_actions;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartActionsAnalyticsInteractorImpl.kt */
@h31.j
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/b;", "Lcom/avito/android/cart_snippet_actions/a;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f116155a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f116156b;

    @Inject
    public b(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f116155a = interfaceC28373a;
        this.f116156b = e12;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // com.avito.android.cart_snippet_actions.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k java.util.Map<java.lang.String, ? extends java.util.List<? extends com.avito.android.cart_snippet_actions.models.CartItemQuantityChange>> r17, @Y61.k com.avito.android.cart_recommendations.model.FromPage r18, @Y61.l java.lang.String r19, boolean r20, @Y61.l com.avito.android.cart_recommendations.model.Srcp r21, @Y61.l java.util.Map<java.lang.String, ? extends java.lang.Object> r22) {
        /*
            r16 = this;
            r0 = r16
            java.util.Set r1 = r17.entrySet()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = kotlin.collections.C42745f0.E(r3)
            com.avito.android.cart_snippet_actions.models.CartItemQuantityChange r3 = (com.avito.android.cart_snippet_actions.models.CartItemQuantityChange) r3
            boolean r4 = r3 instanceof com.avito.android.cart_snippet_actions.models.CartItemQuantityChange.WithPosition
            r5 = 0
            if (r4 != 0) goto L29
            r4 = r5
            goto L2a
        L29:
            r4 = r3
        L2a:
            com.avito.android.cart_snippet_actions.models.CartItemQuantityChange$WithPosition r4 = (com.avito.android.cart_snippet_actions.models.CartItemQuantityChange.WithPosition) r4
            if (r4 == 0) goto L30
            java.lang.Integer r5 = r4.f116270f
        L30:
            r10 = r5
            int r4 = r3.getF116267c()
            if (r4 != 0) goto L3f
            int r3 = r3.getF116268d()
            r4 = 1
            if (r3 != r4) goto L3f
            goto L40
        L3f:
            r4 = 0
        L40:
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = kotlin.collections.C42745f0.Q(r3)
            com.avito.android.cart_snippet_actions.models.CartItemQuantityChange r3 = (com.avito.android.cart_snippet_actions.models.CartItemQuantityChange) r3
            int r7 = r3.getF116268d()
            java.lang.Object r2 = r2.getKey()
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            com.avito.android.account.E r2 = r0.f116156b
            java.lang.String r2 = r2.a()
            if (r2 != 0) goto L61
            java.lang.String r2 = ""
        L61:
            r11 = r2
            com.avito.android.analytics.a r2 = r0.f116155a
            if (r4 == 0) goto L7a
            sn.a r3 = new sn.a
            r6 = r3
            r8 = r18
            r9 = r21
            r13 = r19
            r14 = r22
            r15 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.c(r3)
            goto La
        L7a:
            sn.b r3 = new sn.b
            r6 = r3
            r8 = r18
            r9 = r21
            r13 = r19
            r14 = r22
            r15 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.c(r3)
            goto La
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cart_snippet_actions.b.a(java.util.Map, com.avito.android.cart_recommendations.model.FromPage, java.lang.String, boolean, com.avito.android.cart_recommendations.model.Srcp, java.util.Map):void");
    }
}

package com.avito.android.cart_snippet_actions.feature;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tn.InterfaceC48692a;
import tn.InterfaceC48693b;
import tn.InterfaceC48694c;

/* compiled from: CartSnippetActionsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/p;", "Lcom/avito/android/arch/mvi/q;", "Ltn/a;", "Ltn/b;", "Ltn/d;", "Ltn/c;", "Lcom/avito/android/cart_snippet_actions/feature/CartSnippetActionsFeatureBuilder;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p extends com.avito.android.arch.mvi.q<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c> {

    /* compiled from: CartSnippetActionsFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ltn/a;", "Ltn/b;", "Ltn/d;", "Ltn/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f116243l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ w f116244m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ s f116245n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, s sVar, w wVar) {
            super(1);
            this.f116243l = kVar;
            this.f116244m = wVar;
            this.f116245n = sVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c> qVar) {
            com.avito.android.arch.mvi.q<InterfaceC48692a, InterfaceC48693b, tn.d, InterfaceC48694c> qVar2 = qVar;
            qVar2.f92009e = this.f116243l;
            qVar2.f92011g = this.f116244m;
            qVar2.f92010f = this.f116245n;
            AW.f fVar = AW.f.f434a;
            com.avito.android.arch.mvi.log.g.f91991f.getClass();
            qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public p(@Y61.k k kVar, @Y61.k s sVar, @Y61.k w wVar) {
        super("CartSnippetActions", tn.d.f439431j, new a(kVar, sVar, wVar));
        tn.d.f439430i.getClass();
    }
}

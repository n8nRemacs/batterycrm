package com.avito.android.seller_promotions.mvi;

import Nq0.C14603a;
import Oq0.c;
import Oq0.d;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import com.avito.android.seller_promotions.model.SellerPromotionsArguments;
import com.avito.android.seller_promotions.mvi.entity.SellerPromotionsInternalAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43200s1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SellerPromotionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LOq0/d;", "Lcom/avito/android/seller_promotions/mvi/entity/SellerPromotionsInternalAction;", "LOq0/g;", "a", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.seller_promotions.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34670a implements com.avito.android.arch.mvi.a<Oq0.d, SellerPromotionsInternalAction, Oq0.g> {

    /* renamed from: a, reason: collision with root package name */
    public final int f267926a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B f267927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f267928c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f267929d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f267930e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SellerPromotionsArguments f267931f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f267932g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.a f267933h;

    /* compiled from: SellerPromotionsActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/a$a;", "", "a", "b", "c", "Lcom/avito/android/seller_promotions/mvi/a$a$a;", "Lcom/avito/android/seller_promotions/mvi/a$a$b;", "Lcom/avito/android/seller_promotions/mvi/a$a$c;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.seller_promotions.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC8012a {

        /* compiled from: SellerPromotionsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/a$a$a;", "Lcom/avito/android/seller_promotions/mvi/a$a;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.seller_promotions.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C8013a implements InterfaceC8012a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C8013a f267934a = new C8013a();
        }

        /* compiled from: SellerPromotionsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/a$a$b;", "Lcom/avito/android/seller_promotions/mvi/a$a;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.seller_promotions.mvi.a$a$b */
        public static final class b implements InterfaceC8012a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f267935a = new b();
        }

        /* compiled from: SellerPromotionsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/mvi/a$a$c;", "Lcom/avito/android/seller_promotions/mvi/a$a;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.seller_promotions.mvi.a$a$c */
        public static final class c implements InterfaceC8012a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f267936a = new c();
        }
    }

    @Inject
    public C34670a(int i12, @Y61.k B b12, @Y61.k com.avito.android.favorite.h hVar, @Y61.k R0 r02, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar2, @Y61.k SellerPromotionsArguments sellerPromotionsArguments, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.cart_snippet_actions.a aVar) {
        this.f267926a = i12;
        this.f267927b = b12;
        this.f267928c = hVar;
        this.f267929d = r02;
        this.f267930e = hVar2;
        this.f267931f = sellerPromotionsArguments;
        this.f267932g = interfaceC35745a5;
        this.f267933h = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43160i interfaceC43160iC = C43175k.C(new r(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, q.f268032l));
        ArrayList arrayList = new ArrayList();
        return C43175k.N(C43175k.C(new p(2, null), C43175k.I(this.f267929d.c(), C43175k.B(new j(arrayList, this, aVar, null), C43175k.p(new C34677h(new C43200s1(arrayList, new C34676g(c43197r1), new C34678i(3, null))), s.f268047a)))), kotlinx.coroutines.rx3.y.a(com.avito.android.cart_snippet_actions.utils.h.a(kotlinx.coroutines.rx3.y.b(new C34672c(new C34671b(c43197r1))), this.f267932g, this.f267930e, new LinkedHashMap(), C34673d.f267947l, new C34675f(this))), interfaceC43160iC);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C43152f0 b(@Y61.k Oq0.d dVar, @Y61.k Oq0.g gVar) {
        InterfaceC43160i interfaceC43160iW;
        C43210w c43210w;
        if (dVar.equals(d.h.f12586a)) {
            interfaceC43160iW = C43175k.G(new k(this, null));
        } else if (dVar.equals(d.f.f12584a)) {
            interfaceC43160iW = C43175k.G(new l(this, null));
        } else if (dVar.equals(d.i.f12587a)) {
            interfaceC43160iW = C43175k.I(this.f267929d.a(), C43175k.G(new m(gVar, this, null)));
        } else {
            boolean zEquals = dVar.equals(d.j.f12588a);
            B b12 = this.f267927b;
            if (zEquals) {
                interfaceC43160iW = b12.a();
            } else {
                if (dVar.equals(d.e.f12583a)) {
                    c43210w = new C43210w(SellerPromotionsInternalAction.CloseScreen.f267960b);
                } else if (dVar instanceof d.l) {
                    interfaceC43160iW = new C43210w(new SellerPromotionsInternalAction.UpdateCartIconState(((d.l) dVar).f12591a));
                } else if (dVar.equals(d.c.f12578a)) {
                    SellerPromotionsArguments sellerPromotionsArguments = this.f267931f;
                    c43210w = new C43210w(new SellerPromotionsInternalAction.OpenDeepLink(new CartLink(sellerPromotionsArguments.f267883h, SearchParamsSegmentParser.INSTANCE.fromParam(sellerPromotionsArguments.f267882g).getCartSegment())));
                } else if (dVar instanceof d.b) {
                    d.b bVar = (d.b) dVar;
                    interfaceC43160iW = new C43210w(new SellerPromotionsInternalAction.OpenAdvertDetails(bVar.f12572a, null, bVar.f12575d, new C14603a(bVar.f12573b, ScreenSource.SELLER_PROMOTIONS.f251784d, bVar.f12577f, bVar.f12576e, bVar.f12574c)));
                } else {
                    boolean z12 = dVar instanceof d.a;
                    int i12 = 1;
                    if (z12) {
                        d.a aVar = (d.a) dVar;
                        if (dVar instanceof d.C0811d) {
                            i12 = ((d.C0811d) dVar).f12581c;
                        } else if (!z12) {
                            throw new IllegalStateException("Only ChangeItemQuantity and AddItemToCart actions are expected");
                        }
                        interfaceC43160iW = new C43210w(new SellerPromotionsInternalAction.ChangeItemQuantity(aVar.f12570a, i12));
                    } else {
                        boolean z13 = dVar instanceof d.C0811d;
                        if (z13) {
                            d.C0811d c0811d = (d.C0811d) dVar;
                            if (z13) {
                                i12 = ((d.C0811d) dVar).f12581c;
                            } else if (!z12) {
                                throw new IllegalStateException("Only ChangeItemQuantity and AddItemToCart actions are expected");
                            }
                            interfaceC43160iW = new C43210w(new SellerPromotionsInternalAction.ChangeItemQuantity(c0811d.f12579a, i12));
                        } else if (dVar instanceof d.k) {
                            interfaceC43160iW = C43175k.G(new n(this, dVar, null));
                        } else {
                            if (!(dVar instanceof d.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC43160iW = gVar.f12620f instanceof c.C0810c ? C43175k.w() : b12.d(this.f267926a, gVar.f12619e);
                        }
                    }
                }
                interfaceC43160iW = c43210w;
            }
        }
        return new C43152f0(interfaceC43160iW, new o(3, null));
    }
}

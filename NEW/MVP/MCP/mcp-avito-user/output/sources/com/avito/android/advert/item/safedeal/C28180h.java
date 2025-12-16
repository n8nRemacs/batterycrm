package com.avito.android.advert.item.safedeal;

import Ev.InterfaceC13531b;
import android.os.Bundle;
import android.os.Parcelable;
import co0.InterfaceC27233b;
import com.avito.android.R;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.InterfaceC27811a;
import com.avito.android.advert.item.InterfaceC27816b0;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert.item.safedeal.X;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.advert_details_items.sellerprofile.InterfaceC28280j;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.util.g;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.remote.sticky_block.StickyBlock;
import com.avito.android.safedeal.remote.model.SafeDealPaymentBlockResponse;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.O2;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.internal.operators.maybe.c0;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.kotlin.A1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import k4.InterfaceC42497a;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: AdvertSafeDealPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/h;", "Lcom/avito/android/advert/item/safedeal/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.safedeal.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28180h implements InterfaceC28173a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f78812A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsStyle f78813B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f78814C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public Bundle f78815D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<QuantityChange> f78816E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public AtomicReference f78817F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public ArrayList f78818G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public SafeDealPaymentBlockResponse f78819H;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f78820a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f78821b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f78822c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f78823d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.S f78824e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27811a f78825f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28280j f78826g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f78827h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.favorites.a f78828i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final I6.a f78829j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27233b f78830k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.safedeal.trust_factors.a f78831l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f78832m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N f78833n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final S f78834o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.real_one_click_payment_block.c f78835p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f78836q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.trust_factors.a f78837r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Object, G0> f78838s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Y f78839t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.free_delivery.d f78840u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public I1 f78841v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Z0 f78842w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f78843x = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f78844y = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f78845z;

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "isFavorite", "apply", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.h$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f78846b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$CombinedButtons;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.h$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f78847l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final TrustFactorsComponent.CombinedButtons invoke(TrustFactorsComponent.CombinedButtons combinedButtons) {
            TrustFactorsComponent.CombinedButtons combinedButtons2 = combinedButtons;
            return TrustFactorsComponent.CombinedButtons.a(combinedButtons2, SafeDeal.Component.CombinedButtons.a(combinedButtons2.f84259b, null, null, null, 61));
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f78848l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "Unable to write the stock to cartStorage", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "components", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.h$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<List<? extends TrustFactorsComponent>, List<? extends TrustFactorsComponent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TrustFactorsComponent.ExpandableListItem f78849l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TrustFactorsComponent.ExpandableListItem f78850m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TrustFactorsComponent.ExpandableListItem expandableListItem, TrustFactorsComponent.ExpandableListItem expandableListItem2) {
            super(1);
            this.f78849l = expandableListItem;
            this.f78850m = expandableListItem2;
        }

        @Override // Y41.l
        public final List<? extends TrustFactorsComponent> invoke(List<? extends TrustFactorsComponent> list) {
            List<? extends TrustFactorsComponent> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (Parcelable parcelable : list2) {
                if (kotlin.jvm.internal.L.f(parcelable, this.f78849l)) {
                    parcelable = this.f78850m;
                }
                arrayList.add(parcelable);
            }
            return arrayList;
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$CombinedButtons;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.h$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CartItemInfo f78851l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f78852m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i12, CartItemInfo cartItemInfo) {
            super(1);
            this.f78851l = cartItemInfo;
            this.f78852m = i12;
        }

        @Override // Y41.l
        public final TrustFactorsComponent.CombinedButtons invoke(TrustFactorsComponent.CombinedButtons combinedButtons) {
            Integer num;
            TrustFactorsComponent.CombinedButtons combinedButtons2 = combinedButtons;
            SafeDeal.Component.CombinedButtons combinedButtons3 = combinedButtons2.f84259b;
            SafeDeal.Component.CombinedButtons.CartButton cartButton = combinedButtons3.getCartButton();
            CartItemInfo cartItemInfo = this.f78851l;
            return TrustFactorsComponent.CombinedButtons.a(combinedButtons2, SafeDeal.Component.CombinedButtons.a(combinedButtons3, null, SafeDeal.Component.CombinedButtons.CartButton.a(cartButton, null, null, (cartItemInfo == null || (num = cartItemInfo.f176569c) == null) ? combinedButtons2.f84259b.getCartButton().getMaxQuantity() : num.intValue(), this.f78852m, 19), null, 55));
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$f */
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C28180h.this.C(C28182j.f78886l);
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/advert/item/safedeal/free_delivery/f;", "result", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<TypedResult<com.avito.android.advert.item.safedeal.free_delivery.f>, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(TypedResult<com.avito.android.advert.item.safedeal.free_delivery.f> typedResult) {
            TypedResult<com.avito.android.advert.item.safedeal.free_delivery.f> typedResult2 = typedResult;
            boolean z12 = typedResult2 instanceof TypedResult.Success;
            C28180h c28180h = C28180h.this;
            if (z12) {
                com.avito.android.advert.item.safedeal.free_delivery.f fVar = (com.avito.android.advert.item.safedeal.free_delivery.f) ((TypedResult.Success) typedResult2).getResult();
                c28180h.C(new C28183k(fVar));
                I1 i12 = c28180h.f78841v;
                if (i12 != null) {
                    i12.X(com.avito.android.printable_text.b.f(fVar.f78811c), com.avito.android.printable_text.b.c(R.string.advert_details_free_delivery_request_feedback_action, new Serializable[0]), new C28184l(c28180h, fVar));
                }
            } else {
                if (!(typedResult2 instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult2;
                ApiException apiExceptionA = C35936s.a(error.getError(), error.getCause());
                c28180h.C(C28185m.f78890l);
                I1 i13 = c28180h.f78841v;
                if (i13 != null) {
                    g.a.a(i13, com.avito.android.printable_text.b.f(com.avito.android.error.z.l(apiExceptionA)), ToastBarPosition.f181046d, new f.c(apiExceptionA), 62);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockResponse;", "response", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$h, reason: collision with other inner class name */
    public static final class C2327h<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f78856c;

        public C2327h(AdvertDetails advertDetails) {
            this.f78856c = advertDetails;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC27816b0 interfaceC27816b0Z;
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            AdvertDetails advertDetails = this.f78856c;
            C28180h c28180h = C28180h.this;
            if (!z12) {
                if (!(typedResult instanceof TypedResult.Error) || (interfaceC27816b0Z = c28180h.z(advertDetails)) == null) {
                    return;
                }
                interfaceC27816b0Z.c(PaymentBlockItemState.HideBlock.f78909b);
                return;
            }
            TypedResult.Success success = (TypedResult.Success) typedResult;
            c28180h.f78819H = (SafeDealPaymentBlockResponse) success.getResult();
            InterfaceC27816b0 interfaceC27816b0Z2 = c28180h.z(advertDetails);
            if (interfaceC27816b0Z2 != null) {
                interfaceC27816b0Z2.c(new PaymentBlockItemState.ShowPaymentBlock((SafeDealPaymentBlockResponse) success.getResult(), null, 2, null));
            }
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$i */
    public static final class i<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f78858c;

        public i(AdvertDetails advertDetails) {
            this.f78858c = advertDetails;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC27816b0 interfaceC27816b0Z = C28180h.this.z(this.f78858c);
            if (interfaceC27816b0Z != null) {
                interfaceC27816b0Z.c(PaymentBlockItemState.HideBlock.f78909b);
            }
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "kotlin.jvm.PlatformType", "quantityChange", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$j */
    public static final class j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f78859b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28180h f78860c;

        public j(C28180h c28180h, AtomicBoolean atomicBoolean) {
            this.f78859b = atomicBoolean;
            this.f78860c = c28180h;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f78859b.set(true);
            this.f78860c.C(new E((QuantityChange) obj));
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "acc", "quantityChange", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.h$k */
    public static final class k<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T1, T2, R> f78861b = new k<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            List list = (List) obj;
            list.add((QuantityChange) obj2);
            return list;
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.h$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<List<QuantityChange>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f78862l = new l();

        public l() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(List<QuantityChange> list) {
            return Boolean.valueOf(list.isEmpty());
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$m */
    public static final class m<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f78863b;

        public m(AtomicBoolean atomicBoolean) {
            this.f78863b = atomicBoolean;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f78863b.set(false);
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "quantityLog", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/l0;", "Lcom/avito/android/remote/safedeal/a;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$n */
    public static final class n<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f78865c;

        public n(AtomicBoolean atomicBoolean) {
            this.f78865c = atomicBoolean;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
        @Override // l41.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object apply(java.lang.Object r13) {
            /*
                r12 = this;
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r0 = kotlin.collections.C42745f0.E(r13)
                com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange r0 = (com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange) r0
                java.lang.Object r1 = kotlin.collections.C42745f0.Q(r13)
                com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange r1 = (com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange) r1
                r13.clear()
                com.avito.android.advert.item.safedeal.h r13 = com.avito.android.advert.item.safedeal.C28180h.this
                com.avito.android.advert_details.AdvertDetailsStyle r2 = r13.f78813B
                r3 = 0
                if (r2 == 0) goto L23
                com.avito.android.advert.advert_details_style.b r2 = com.avito.android.advert.advert_details_style.c.a(r2)
                com.avito.android.advert.advert_details_style.b$a r2 = r2.f68639h
                if (r2 == 0) goto L23
                java.lang.Object r2 = r2.f68644a
                goto L24
            L23:
                r2 = r3
            L24:
                if (r2 != 0) goto L2a
                java.util.Map r2 = kotlin.collections.P0.c()
            L2a:
                com.avito.android.remote.model.AdvertDetails r4 = r13.f78814C
                if (r4 == 0) goto L68
                com.avito.android.remote.safedeal.SafeDeal r4 = r4.getSafeDeal()
                if (r4 == 0) goto L68
                java.util.List r4 = r4.getComponents()
                if (r4 == 0) goto L5a
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L42:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L51
                java.lang.Object r5 = r4.next()
                boolean r6 = r5 instanceof com.avito.android.remote.safedeal.SafeDeal.Component.CombinedButtons
                if (r6 == 0) goto L42
                goto L52
            L51:
                r5 = r3
            L52:
                boolean r4 = r5 instanceof com.avito.android.remote.safedeal.SafeDeal.Component.CombinedButtons
                if (r4 != 0) goto L57
                r5 = r3
            L57:
                com.avito.android.remote.safedeal.SafeDeal$Component$CombinedButtons r5 = (com.avito.android.remote.safedeal.SafeDeal.Component.CombinedButtons) r5
                goto L5b
            L5a:
                r5 = r3
            L5b:
                if (r5 == 0) goto L62
                com.avito.android.delivery_combined_buttons_public.CombinedButtonsData r4 = R9.a.a(r5)
                goto L63
            L62:
                r4 = r3
            L63:
                if (r4 == 0) goto L68
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f134962j
                goto L69
            L68:
                r4 = r3
            L69:
                if (r4 != 0) goto L6f
                java.util.Map r4 = kotlin.collections.P0.c()
            L6f:
                java.util.LinkedHashMap r11 = kotlin.collections.P0.k(r2, r4)
                int r8 = r1.f79077c
                com.avito.android.remote.model.AdvertDetails r2 = r13.f78814C
                if (r2 == 0) goto L83
                com.avito.android.remote.model.AdvertSeller r2 = r2.getSeller()
                if (r2 == 0) goto L83
                java.lang.String r3 = r2.getUserKey()
            L83:
                r9 = r3
                int r2 = r0.f79076b
                if (r2 != 0) goto L8e
                int r2 = r1.f79077c
                if (r2 <= 0) goto L8e
                r2 = 1
                goto L8f
            L8e:
                r2 = 0
            L8f:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
                com.avito.android.advert.item.safedeal.S r2 = r13.f78834o
                com.avito.android.advert.item.safedeal.V r6 = r2.f78763a
                r6.getClass()
                com.avito.android.advert.item.safedeal.U r3 = new com.avito.android.advert.item.safedeal.U
                java.lang.String r7 = r13.f78820a
                r5 = r3
                r5.<init>()
                io.reactivex.rxjava3.internal.operators.single.e r4 = new io.reactivex.rxjava3.internal.operators.single.e
                r4.<init>(r3)
                com.avito.android.advert.item.safedeal.Q r3 = new com.avito.android.advert.item.safedeal.Q
                r3.<init>(r2)
                io.reactivex.rxjava3.internal.operators.single.y r2 = r4.n(r3)
                io.reactivex.rxjava3.internal.operators.single.y r2 = com.avito.android.util.rx3.g1.a(r2)
                com.avito.android.util.a5 r3 = r13.f78823d
                io.reactivex.rxjava3.core.H r4 = r3.a()
                io.reactivex.rxjava3.internal.operators.single.W r2 = r2.z(r4)
                io.reactivex.rxjava3.core.H r3 = r3.e()
                io.reactivex.rxjava3.internal.operators.single.S r2 = r2.s(r3)
                com.avito.android.advert.item.safedeal.G r3 = new com.avito.android.advert.item.safedeal.G
                r3.<init>(r13, r1)
                io.reactivex.rxjava3.internal.operators.single.u r2 = r2.k(r3)
                com.avito.android.advert.item.safedeal.F r3 = new com.avito.android.advert.item.safedeal.F
                java.util.concurrent.atomic.AtomicBoolean r4 = r12.f78865c
                r3.<init>()
                io.reactivex.rxjava3.internal.operators.single.v r4 = new io.reactivex.rxjava3.internal.operators.single.v
                r4.<init>(r2, r3)
                com.avito.android.advert.item.safedeal.J r2 = new com.avito.android.advert.item.safedeal.J
                r2.<init>(r13, r0)
                io.reactivex.rxjava3.internal.operators.single.q r13 = r4.i(r2)
                com.avito.android.advert.item.safedeal.K r2 = new com.avito.android.advert.item.safedeal.K
                r2.<init>(r0, r1)
                io.reactivex.rxjava3.internal.operators.single.O r13 = r13.r(r2)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.safedeal.C28180h.n.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/l0;", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "Lcom/avito/android/remote/safedeal/a;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/l0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$o */
    public static final class o<T> implements l41.g {
        public o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Z0 z02;
            C42829l0 c42829l0 = (C42829l0) obj;
            QuantityChange quantityChange = (QuantityChange) c42829l0.f406871b;
            QuantityChange quantityChange2 = (QuantityChange) c42829l0.f406872c;
            com.avito.android.remote.safedeal.a aVar = (com.avito.android.remote.safedeal.a) c42829l0.f406873d;
            int i12 = quantityChange2.f79077c;
            C28180h c28180h = C28180h.this;
            AdvertDetailsStyle advertDetailsStyle = c28180h.f78813B;
            if (advertDetailsStyle != null) {
                c28180h.f78822c.t7(i12, com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68642k);
            }
            if (quantityChange.f79076b == 0 && quantityChange2.f79077c > 0) {
                AdvertDetails advertDetails = c28180h.f78814C;
                X xA2 = c28180h.f78839t.a(aVar, advertDetails != null ? advertDetails.getFromSegment() : null, c28180h.f78821b);
                if (xA2 instanceof X.a) {
                    Z0 z03 = c28180h.f78842w;
                    if (z03 != null) {
                        InterfaceC28173a.InterfaceC2325a.C2326a.a(z03, ((X.a) xA2).f78777a, null, 6);
                        return;
                    }
                    return;
                }
                if (!(xA2 instanceof X.b) || (z02 = c28180h.f78842w) == null) {
                    return;
                }
                z02.z(((X.b) xA2).f78778a);
            }
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.h$p */
    public static final class p<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final p<T> f78867b = new p<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: AdvertSafeDealPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.safedeal.h$q */
    public static final class q extends kotlin.jvm.internal.N implements Y41.l<List<? extends TrustFactorsComponent>, List<? extends TrustFactorsComponent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f78868l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Y41.l<? super TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> lVar) {
            super(1);
            this.f78868l = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final List<? extends TrustFactorsComponent> invoke(List<? extends TrustFactorsComponent> list) {
            List<? extends TrustFactorsComponent> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (TrustFactorsComponent trustFactorsComponent : list2) {
                if (trustFactorsComponent instanceof TrustFactorsComponent.CombinedButtons) {
                    trustFactorsComponent = (TrustFactorsComponent) this.f78868l.invoke(trustFactorsComponent);
                }
                arrayList.add(trustFactorsComponent);
            }
            return arrayList;
        }
    }

    @Inject
    public C28180h(@Y61.k @InterfaceC30174s String str, @C27710t.InterfaceC2166t @Y61.l String str2, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.advert.item.S s5, @Y61.k InterfaceC27811a interfaceC27811a, @Y61.k InterfaceC28280j interfaceC28280j, @Y61.k InterfaceC28265d interfaceC28265d, @Y61.k com.avito.android.advert.favorites.a aVar2, @Y61.k I6.a aVar3, @Y61.k InterfaceC27233b interfaceC27233b, @Y61.k com.avito.android.advert_core.safedeal.trust_factors.a aVar4, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, @Y61.k com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12, @Y61.k S s12, @Y61.k com.avito.android.advert.item.safedeal.real_one_click_payment_block.c cVar, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.advert.item.safedeal.trust_factors.a aVar5, @C27710t.a @Y61.k Y41.l<Object, G0> lVar, @Y61.k Y y12, @Y61.k com.avito.android.advert.item.safedeal.free_delivery.d dVar) {
        this.f78820a = str;
        this.f78821b = str2;
        this.f78822c = aVar;
        this.f78823d = interfaceC35745a5;
        this.f78824e = s5;
        this.f78825f = interfaceC27811a;
        this.f78826g = interfaceC28280j;
        this.f78827h = interfaceC28265d;
        this.f78828i = aVar2;
        this.f78829j = aVar3;
        this.f78830k = interfaceC27233b;
        this.f78831l = aVar4;
        this.f78832m = hVar;
        this.f78833n = n12;
        this.f78834o = s12;
        this.f78835p = cVar;
        this.f78836q = e12;
        this.f78837r = aVar5;
        this.f78838s = lVar;
        this.f78839t = y12;
        this.f78840u = dVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f78845z = cVar2;
        this.f78812A = new C41981q0(cVar2);
        this.f78816E = new com.jakewharton.rxrelay3.c<>();
        this.f78817F = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        this.f78818G = new ArrayList();
    }

    public static void y(C28180h c28180h, DeepLink deepLink) {
        Z0 z02 = c28180h.f78842w;
        if (z02 != null) {
            InterfaceC28173a.InterfaceC2325a.C2326a.a(z02, deepLink, null, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A() {
        /*
            r3 = this;
            com.avito.android.advert_core.safedeal.trust_factors.a r0 = r3.f78831l
            java.util.List<? extends com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent> r1 = r0.f84276a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L14
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L14
            goto L29
        L14:
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent r2 = (com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent) r2
            boolean r2 = r2 instanceof com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent.CombinedButtons
            if (r2 == 0) goto L18
            goto L4f
        L29:
            java.util.List<? extends com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent> r0 = r0.f84277b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L3b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3b
            goto L51
        L3b:
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent r1 = (com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent) r1
            boolean r1 = r1 instanceof com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent.CombinedButtons
            if (r1 == 0) goto L3f
        L4f:
            r0 = 1
            goto L52
        L51:
            r0 = 0
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.safedeal.C28180h.A():boolean");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void B() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f78817F.dispose();
        io.reactivex.rxjava3.internal.operators.mixed.x xVar = new io.reactivex.rxjava3.internal.operators.mixed.x(C35896f0.e(this.f78816E.K(new j(this, atomicBoolean)).o0(this.f78818G, k.f78861b), l.f78862l).y(700L, TimeUnit.MILLISECONDS, this.f78823d.c()).K(new m(atomicBoolean)), new n(atomicBoolean));
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        Objects.requireNonNull(rVar, "predicate is null");
        this.f78817F = (AtomicReference) new io.reactivex.rxjava3.internal.operators.observable.Z0(xVar, rVar).v0(new o(), p.f78867b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public final void C(Y41.l<? super TrustFactorsComponent.CombinedButtons, TrustFactorsComponent.CombinedButtons> lVar) {
        q qVar = new q(lVar);
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f78831l;
        List<? extends TrustFactorsComponent> listInvoke = qVar.invoke(aVar.f84276a);
        aVar.f84276a = listInvoke;
        aVar.f84277b = qVar.invoke(aVar.f84277b);
        this.f78838s.invoke(new InterfaceC42497a.n(listInvoke));
        InterfaceC27816b0 interfaceC27816b0Z = z(this.f78814C);
        if (interfaceC27816b0Z != null) {
            interfaceC27816b0Z.d(listInvoke, true);
        }
        this.f78826g.K();
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    @Y61.k
    /* renamed from: D, reason: from getter */
    public final C41981q0 getF78812A() {
        return this.f78812A;
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    @Y61.k
    public final Bundle H() {
        Bundle bundle = new Bundle();
        com.avito.android.util.G.e("quantityChangesLog", bundle, this.f78818G);
        return bundle;
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void a(@Y61.l String str) {
        this.f78833n.oe(str, null);
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void b(@Y61.l Bundle bundle) {
        Collection parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("quantityChangesLog") : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = C42784z0.f406748b;
        }
        this.f78818G = new ArrayList(parcelableArrayList);
        B();
        this.f78815D = bundle;
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.d
    public final void c(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        Z0 z02 = this.f78842w;
        if (z02 != null) {
            InterfaceC28173a.InterfaceC2325a.C2326a.a(z02, deepLink, bundle, 4);
        }
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void c0() {
        this.f78842w = null;
        this.f78844y.e();
    }

    @Override // com.avito.android.advert.item.safedeal.info.f.b
    public final void d(@Y61.k DeepLink deepLink) {
        y(this, deepLink);
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.d
    public final void e(@Y61.k DeepLink deepLink) {
        y(this, deepLink);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void e0() {
        this.f78843x.e();
        this.f78817F.dispose();
        this.f78841v = null;
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Bundle getF78815D() {
        return this.f78815D;
    }

    @Override // com.avito.android.advert_core.safedeal.h.a
    public final void g(@Y61.k DeepLink deepLink) {
        y(this, deepLink);
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void h() {
        this.f78843x.b(A1.g(this.f78840u.a(this.f78820a).s(this.f78823d.e()).j(new f()), null, new g(), 1));
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.d
    public final void i(@Y61.k String str, @Y61.k String str2, @Y61.l SafeDeal.TooltipData.Event event) {
        this.f78829j.a(str2);
        if (event != null) {
            this.f78822c.O(new ParametrizedEvent(event.getId(), event.getVersion(), event.getParams()));
        }
        InterfaceC27816b0 interfaceC27816b0Z = z(this.f78814C);
        if (interfaceC27816b0Z != null) {
            interfaceC27816b0Z.f(str);
        }
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.d
    public final void j(@Y61.k DeepLink deepLink) {
        y(this, deepLink);
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void j0(@Y61.k Z0 z02) {
        this.f78842w = z02;
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void k(@Y61.l I1 i12) {
        this.f78841v = i12;
        io.reactivex.rxjava3.disposables.d dVarS0 = this.f78830k.c().s0();
        io.reactivex.rxjava3.disposables.c cVar = this.f78843x;
        cVar.b(dVarS0);
        B();
        InterfaceC28265d interfaceC28265d = this.f78827h;
        io.reactivex.rxjava3.internal.operators.observable.W wN2 = interfaceC28265d.getF83157A().N(C28175c.f78787b);
        V2 v22 = V2.f318762a;
        cVar.b(A1.h(wN2, new C28176d(1, v22, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new C28177e(this), 2));
        cVar.b(A1.h(interfaceC28265d.getF83159C(), new C28179g(1, v22, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new C28178f(1, this, C28180h.class, "handleCombinedButtonsAction", "handleCombinedButtonsAction(Lcom/avito/android/delivery_combined_buttons_public/CombinedButtonsAction;)V", 0), 2));
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void l(@Y61.k AdvertDetails advertDetails) {
        Object next;
        final SafeDeal.Component.CombinedButtons.CartButton cartButton;
        SafeDeal safeDeal = advertDetails.getSafeDeal();
        List<SafeDeal.Component> components = safeDeal != null ? safeDeal.getComponents() : null;
        if (components == null) {
            components = C42784z0.f406748b;
        }
        List<SafeDeal.Component> list = components;
        StickyBlock stickyBlock = advertDetails.getStickyBlock();
        List<SafeDeal.Component> components2 = stickyBlock != null ? stickyBlock.getComponents() : null;
        if (components2 == null) {
            components2 = C42784z0.f406748b;
        }
        Iterator it = C42745f0.h0(components2, list).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof SafeDeal.Component.CombinedButtons) {
                    break;
                }
            }
        }
        if (!(next instanceof SafeDeal.Component.CombinedButtons)) {
            next = null;
        }
        SafeDeal.Component.CombinedButtons combinedButtons = (SafeDeal.Component.CombinedButtons) next;
        if (combinedButtons == null || (cartButton = combinedButtons.getCartButton()) == null) {
            return;
        }
        this.f78843x.b(A1.f(new io.reactivex.rxjava3.internal.operators.completable.r(new Callable() { // from class: com.avito.android.advert.item.safedeal.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SafeDeal.Component.CombinedButtons.CartButton cartButton2 = cartButton;
                CartItemInfo cartItemInfo = new CartItemInfo(cartButton2.getQuantity(), Integer.valueOf(cartButton2.getMaxQuantity()));
                C28180h c28180h = this.f78785b;
                c28180h.f78832m.b(c28180h.f78820a, cartItemInfo);
                return G0.f406611a;
            }
        }).x(this.f78823d.a()), c.f78848l, null, 2));
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void m() {
        SafeDeal safeDeal;
        SafeDeal.ReturnCheckoutDialog returnCheckoutDialog;
        AdvertDetails advertDetails;
        AdvertDetailsStyle advertDetailsStyle;
        AdvertDetails advertDetails2;
        AdvertDetails advertDetails3 = this.f78814C;
        if (advertDetails3 == null || (safeDeal = advertDetails3.getSafeDeal()) == null || (returnCheckoutDialog = safeDeal.getReturnCheckoutDialog()) == null) {
            return;
        }
        boolean z12 = returnCheckoutDialog instanceof SafeDeal.ReturnCheckoutDialog.DefaultDialog;
        io.reactivex.rxjava3.disposables.c cVar = this.f78844y;
        if (z12) {
            SafeDeal.ReturnCheckoutDialog.DefaultDialog defaultDialog = (SafeDeal.ReturnCheckoutDialog.DefaultDialog) returnCheckoutDialog;
            Z0 z02 = this.f78842w;
            if (z02 == null || (advertDetails2 = this.f78814C) == null) {
                return;
            }
            cVar.b(x(v(advertDetails2, defaultDialog.getBlockAllItemsTime(), defaultDialog.getBlockItemTime()), advertDetails2.getId()).h(new C28188p(z02, defaultDialog)).m(new C28189q(z02, defaultDialog, this)));
            return;
        }
        if (returnCheckoutDialog instanceof SafeDeal.ReturnCheckoutDialog.AddToFavoriteDialog) {
            SafeDeal.ReturnCheckoutDialog.AddToFavoriteDialog addToFavoriteDialog = (SafeDeal.ReturnCheckoutDialog.AddToFavoriteDialog) returnCheckoutDialog;
            Z0 z03 = this.f78842w;
            if (z03 == null || (advertDetails = this.f78814C) == null || (advertDetailsStyle = this.f78813B) == null) {
                return;
            }
            cVar.b(x(v(advertDetails, addToFavoriteDialog.getBlockAllItemsTime(), addToFavoriteDialog.getBlockItemTime()), advertDetails.getId()).h(new C28186n(z03, addToFavoriteDialog)).m(new C28187o(this, advertDetailsStyle, advertDetails)));
            return;
        }
        if (returnCheckoutDialog instanceof SafeDeal.ReturnCheckoutDialog.ChatDialog) {
            SafeDeal.ReturnCheckoutDialog.ChatDialog chatDialog = (SafeDeal.ReturnCheckoutDialog.ChatDialog) returnCheckoutDialog;
            Z0 z04 = this.f78842w;
            if (z04 == null) {
                return;
            }
            cVar.b(x(v(advertDetails3, chatDialog.getBlockAllItemsTime(), chatDialog.getBlockItemTime()), advertDetails3.getId()).h(new r(z04, chatDialog)).m(new C28190s(this, advertDetails3)));
        }
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void n(@Y61.l AdvertDetailsStyle advertDetailsStyle) {
        this.f78813B = advertDetailsStyle;
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void o(@Y61.l AdvertDetails advertDetails) {
        SafeDeal safeDeal;
        if (((advertDetails == null || (safeDeal = advertDetails.getSafeDeal()) == null) ? false : kotlin.jvm.internal.L.f(safeDeal.getShouldShowRealOneClickSlider(), Boolean.TRUE)) && this.f78819H == null) {
            com.avito.android.advert.item.safedeal.real_one_click_payment_block.c cVar = this.f78835p;
            cVar.getClass();
            this.f78843x.b(new C42007e(new com.avito.android.advert.deeplinks.delivery.p(cVar, this.f78820a, this.f78821b, 2)).z(cVar.f78920b.a()).s(this.f78823d.e()).x(new C2327h(advertDetails), new i(advertDetails)));
        }
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void p(@Y61.l AdvertDetails advertDetails) {
        this.f78814C = advertDetails;
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void q() {
        Integer num;
        if (A()) {
            CartItemInfo cartItemInfo = this.f78832m.get(this.f78820a);
            if (cartItemInfo == null || (num = cartItemInfo.f176569c) == null || num.intValue() != 0) {
                C(new e(cartItemInfo != null ? cartItemInfo.f176568b : 0, cartItemInfo));
            } else {
                this.f78845z.accept(G0.f406611a);
            }
        }
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.h.b
    public final void r(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str) {
        Z0 z02 = this.f78842w;
        if (z02 != null) {
            z02.w(bundle, deepLink, str);
        }
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void s(@Y61.k InterfaceC13531b interfaceC13531b) {
        if (interfaceC13531b instanceof InterfaceC13531b.C0266b) {
            InterfaceC13531b.C0266b c0266b = (InterfaceC13531b.C0266b) interfaceC13531b;
            DeepLink deepLink = c0266b.f4375a;
            Z0 z02 = this.f78842w;
            if (z02 != null) {
                InterfaceC28173a.InterfaceC2325a.C2326a.a(z02, deepLink, c0266b.f4376b, 4);
                return;
            }
            return;
        }
        if (!(interfaceC13531b instanceof InterfaceC13531b.c)) {
            if (interfaceC13531b instanceof InterfaceC13531b.a) {
                C(b.f78847l);
            }
        } else {
            InterfaceC13531b.c cVar = (InterfaceC13531b.c) interfaceC13531b;
            QuantityChange quantityChange = new QuantityChange(cVar.f4377a, cVar.f4378b, cVar.f4379c);
            if (this.f78836q.b()) {
                this.f78816E.accept(quantityChange);
            } else {
                y(this, new AuthenticateLink(AuthSource.f92733w, false, (DeepLink) null, 6, (C42822w) null));
            }
        }
    }

    @Override // com.avito.android.advert.item.safedeal.trust_factors.d
    public final void t(@Y61.k TrustFactorsComponent.ExpandableListItem expandableListItem) {
        SafeDeal.Component.ExpandableListItem expandableListItemA = SafeDeal.Component.ExpandableListItem.a(expandableListItem.f84262b, !r0.f254348b);
        d dVar = new d(expandableListItem, new TrustFactorsComponent.ExpandableListItem(expandableListItemA, expandableListItem.f84263c));
        com.avito.android.advert_core.safedeal.trust_factors.a aVar = this.f78831l;
        List<? extends TrustFactorsComponent> listInvoke = dVar.invoke(aVar.f84276a);
        aVar.f84276a = listInvoke;
        this.f78838s.invoke(new InterfaceC42497a.n(listInvoke));
        InterfaceC27816b0 interfaceC27816b0Z = z(this.f78814C);
        if (interfaceC27816b0Z != null) {
            interfaceC27816b0Z.d(listInvoke, false);
        }
        String analyticsId = expandableListItemA.getAnalyticsId();
        if (analyticsId != null) {
            this.f78822c.E4(analyticsId, expandableListItemA.f254348b);
        }
    }

    @Override // com.avito.android.advert.item.safedeal.real_one_click_payment_block.h.b
    public final void u(@Y61.k ParametrizedEvent parametrizedEvent) {
        this.f78822c.O(parametrizedEvent);
    }

    public final io.reactivex.rxjava3.core.I<Boolean> v(AdvertDetails advertDetails, long j12, long j13) {
        if (!this.f78830k.d(j12, advertDetails.getId())) {
            return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
        }
        CartItemInfo cartItemInfo = this.f78832m.get(advertDetails.getId());
        if (cartItemInfo != null && cartItemInfo.f176568b > 0) {
            return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
        }
        return this.f78828i.b(advertDetails.getId(), advertDetails.getIsFavorite()).r(a.f78846b);
    }

    @Override // com.avito.android.advert.item.safedeal.InterfaceC28173a
    public final void w(@Y61.k io.reactivex.rxjava3.core.z<C43501a> zVar) {
        io.reactivex.rxjava3.disposables.d dVarT0 = zVar.N(C28191t.f79027b).d0(C28192u.f79251b).j0(this.f78823d.e()).t0(new C28194w(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f78843x;
        cVar.b(dVarT0);
        cVar.b(zVar.N(C28195x.f79256b).t0(new C28196y(this)));
        cVar.b(zVar.N(C28197z.f79258b).N(A.f78723b).t0(new B(this)));
        cVar.b(zVar.N(L.f78738b).t0(new M(this)));
        cVar.b(zVar.N(C.f78725b).t0(new D(this)));
    }

    public final c0 x(io.reactivex.rxjava3.core.I i12, String str) {
        return new io.reactivex.rxjava3.internal.operators.single.D(i12, new C28181i(this, str)).k(this.f78823d.e());
    }

    public final InterfaceC27816b0 z(AdvertDetails advertDetails) {
        if (advertDetails == null || !advertDetails.getRenderByBeduin()) {
            return O2.a(advertDetails != null ? advertDetails.getBlocks() : null) ? this.f78825f : this.f78824e;
        }
        return null;
    }
}

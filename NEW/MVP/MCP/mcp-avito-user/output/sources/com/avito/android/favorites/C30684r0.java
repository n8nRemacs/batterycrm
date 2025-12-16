package com.avito.android.favorites;

import Hd.C13979c;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import androidx.appcompat.app.l;
import androidx.compose.runtime.C22026a;
import androidx.core.os.C22777e;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import bD.InterfaceC25497b;
import bj0.InterfaceC25663c;
import cU0.InterfaceC27108f;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.advertising.CommercialLoadingItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.j;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogLink;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.bxcontent.Q1;
import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deep_linking.links.ClickStreamLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.InterfaceC30264p;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.favorites.InterfaceC30665h1;
import com.avito.android.favorites.InterfaceC30683q0;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.skeleton.SkeletonFavoriteAdvertItem;
import com.avito.android.favorites.adapter.error.FavoriteErrorItem;
import com.avito.android.favorites.adapter.loading.FavoriteLoadingItem;
import com.avito.android.favorites.adapter.promo_banner_with_benefits.PromoBannerRecallWithBenefitsItem;
import com.avito.android.favorites.adapter.promo_banner_with_description.PromoBannerRecallWithDescriptionItem;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.related_products.bottom_sheet.RelatedProductsBottomSheetDeeplinkArgs;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.remote.model.FavoritesSearchWidget;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ShowOnlyActiveFavoritesSwitchInfo;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.vertical_main.avito_blog.blog_items_list.AvitoBlogArticleItem;
import com.avito.android.similar_adverts.SimilarAdvertsDialog;
import com.avito.android.user_favorites.InterfaceC35724i;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.L4;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import iT.C41343c;
import iT.InterfaceC41341a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import lW.InterfaceC43691a;
import t3.InterfaceC48488t;
import ur.InterfaceC49101b;
import wn.C49654a;

/* compiled from: FavoritesListPresenter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/r0;", "Lcom/avito/android/favorites/q0;", "LiT/a;", "d", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.r0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30684r0 implements InterfaceC30683q0, InterfaceC41341a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final YC.a f157430A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final InterfaceC35724i f157431B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final u3.h<SimpleTestGroup> f157432C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final String f157433D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final FavoritesSpace f157434E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final C41343c f157435F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final Set<String> f157436G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25663c f157437H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final aU0.b f157438I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.n f157439J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.j f157440K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_info_toast_bar.interactor.g f157441L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ProgressInfoToastBarPresenter f157442M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final Q1 f157443N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final AD.a f157444O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final TC.a f157445P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f157446Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f157447R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f157448S = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C43238h f157449T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f157450U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f157451V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.serp.adapter.S> f157452W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f157453X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public x1 f157454Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public FavoritesFragment f157455Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.l
    public List<? extends FavoriteListItem> f157456a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30681p0 f157457b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public CategoryState f157458b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f157459c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public OrderState f157460c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f157461d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public String f157462d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30610d0 f157463e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public ShowOnlyActiveFavoritesSwitchInfo f157464e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.e f157465f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f157466f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25497b f157467g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final BK0.a<AbstractC30688d> f157468g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RC.a f157469h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public String f157470h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f157471i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f157472i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30605b1 f157473j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public FavoritesSearchWidget f157474j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f157475k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f157476k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.e f157477l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final ArrayList f157478l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final AD.a f157479m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final String f157480m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorites.ux_feedback.b f157481n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f157482n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33034d f157483o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<CartItemQuantityChange> f157484o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.find.o f157485p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public AtomicReference f157486p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f157487q;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final Z1<Boolean> f157488q0;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f157489r;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final Z1<Boolean> f157490r0;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f157491s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f157492s0;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f157493t;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f157494t0;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f157495u;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.favorites.compose.search.f> f157496u0;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.e f157497v;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.favorites.compose.search.f> f157498v0;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N f157499w;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C30689e f157500w0;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.a f157501x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sales_items.a f157502y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sales_items.m f157503z;

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$A */
    public static final class A extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final A f157504l = new A();

        public A() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("FavoritesListPresenter", "event handling error - UpdateError", th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorites/r0$d$b;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/favorites/r0$d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$B */
    public static final class B extends kotlin.jvm.internal.N implements Y41.l<AbstractC30688d.b, kotlin.G0> {
        public B() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(AbstractC30688d.b bVar) {
            C30684r0 c30684r0 = C30684r0.this;
            c30684r0.J();
            Throwable th2 = bVar.f157515a;
            PrintableText printableTextA = InterfaceC35741a1.a.a(c30684r0.f157471i, th2, null, null, 6);
            x1 x1Var = c30684r0.f157454Y;
            if (x1Var != null) {
                InterfaceC30665h1.a.a(x1Var, printableTextA, th2, null, 4);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$C */
    public static final class C extends kotlin.jvm.internal.N implements Y41.l<kotlin.G0, kotlin.G0> {
        public C() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(kotlin.G0 g02) {
            C30684r0 c30684r0 = C30684r0.this;
            FavoritesFragment favoritesFragment = c30684r0.f157455Z;
            if (favoritesFragment != null) {
                InterfaceC30683q0.c.a.a(favoritesFragment, new CartLink(null, c30684r0.f157434E.f156270c), null, 6);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$D */
    public static final class D extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final D f157507l = new D();

        public D() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("FavoritesListPresenter", "remove advert error", th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$E */
    public static final class E extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FavoriteAdvertItem f157509m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(FavoriteAdvertItem favoriteAdvertItem) {
            super(0);
            this.f157509m = favoriteAdvertItem;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C30684r0.H(C30684r0.this, Collections.singletonList(this.f157509m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/avito/android/lib/beduin_v2/repository/domain/cart_items/model/CartItemInfo;", "kotlin.jvm.PlatformType", "itemsStocks", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$F */
    public static final class F<T> implements l41.g {
        public F() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Map map = (Map) obj;
            C30684r0 c30684r0 = C30684r0.this;
            List<? extends FavoriteListItem> list = c30684r0.f157456a0;
            ArrayList arrayList = null;
            if (list != null) {
                List<? extends FavoriteListItem> list2 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (com.avito.conveyor_item.a aVarA : list2) {
                    if (aVarA instanceof FavoriteAdvertItem) {
                        CartItemInfo cartItemInfo = (CartItemInfo) map.get(((FavoriteAdvertItem) aVarA).f156404b);
                        FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVarA;
                        aVarA = FavoriteAdvertItem.a(favoriteAdvertItem, com.avito.android.cart_snippet_actions.utils.i.a(favoriteAdvertItem.f156419q, cartItemInfo), null, -32769);
                    }
                    arrayList2.add(aVarA);
                }
                arrayList = arrayList2;
            }
            c30684r0.f157456a0 = arrayList;
            c30684r0.O();
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.r0$a, reason: case insensitive filesystem */
    public /* synthetic */ class C30685a extends kotlin.jvm.internal.H implements Y41.l<Throwable, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVC/a;", "event", "Lkotlin/G0;", "invoke", "(LVC/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$b, reason: case insensitive filesystem */
    public static final class C30686b extends kotlin.jvm.internal.N implements Y41.l<VC.a, kotlin.G0> {
        public C30686b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(VC.a r11) {
            /*
                r10 = this;
                VC.a r11 = (VC.a) r11
                boolean r0 = r11 instanceof VC.a.C1165a
                r1 = 0
                com.avito.android.favorites.r0 r2 = com.avito.android.favorites.C30684r0.this
                if (r0 == 0) goto L1b
                r2.f157466f0 = r1
                com.avito.android.favorites.r0$d$b r0 = new com.avito.android.favorites.r0$d$b
                VC.a$a r11 = (VC.a.C1165a) r11
                java.lang.Throwable r11 = r11.f16990a
                r0.<init>(r11)
                BK0.a<com.avito.android.favorites.r0$d> r11 = r2.f157468g0
                r11.onNext(r0)
                goto Lcd
            L1b:
                boolean r0 = r11 instanceof VC.a.b
                if (r0 == 0) goto L2c
                r3 = r11
                VC.a$b r3 = (VC.a.b) r3
                java.lang.String r4 = r2.f157462d0
                java.lang.String r3 = r3.f16991a
                boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
                if (r3 != 0) goto Lcd
            L2c:
                if (r0 == 0) goto L44
                boolean r3 = r2.f157466f0
                if (r3 == 0) goto L44
                r2.f157466f0 = r1
                com.avito.android.favorites.r0$d$a r0 = new com.avito.android.favorites.r0$d$a
                VC.a$b r11 = (VC.a.b) r11
                java.lang.String r11 = r11.f16991a
                r0.<init>(r11)
                BK0.a<com.avito.android.favorites.r0$d> r11 = r2.f157468g0
                r11.onNext(r0)
                goto Lcd
            L44:
                if (r0 == 0) goto L61
                r1 = r11
                VC.a$b r1 = (VC.a.b) r1
                java.util.List<java.lang.String> r3 = r1.f16993c
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L61
                BK0.a<com.avito.android.favorites.r0$d> r11 = r2.f157468g0
                com.avito.android.favorites.r0$d$a r0 = new com.avito.android.favorites.r0$d$a
                java.lang.String r1 = r1.f16991a
                r0.<init>(r1)
                r11.onNext(r0)
                goto Lcd
            L61:
                if (r0 == 0) goto Lcd
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                VC.a$b r11 = (VC.a.b) r11
                java.util.List<java.lang.String> r1 = r11.f16992b
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L72:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = r11.f16991a
                if (r3 == 0) goto Lc8
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                java.util.List<? extends com.avito.android.favorites.adapter.FavoriteListItem> r5 = r2.f157456a0
                r6 = 0
                if (r5 == 0) goto Lab
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L8b:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto La7
                java.lang.Object r7 = r5.next()
                r8 = r7
                com.avito.android.favorites.adapter.FavoriteListItem r8 = (com.avito.android.favorites.adapter.FavoriteListItem) r8
                boolean r9 = r8 instanceof com.avito.android.favorites.adapter.advert.FavoriteAdvertItem
                if (r9 == 0) goto L8b
                com.avito.android.favorites.adapter.advert.FavoriteAdvertItem r8 = (com.avito.android.favorites.adapter.advert.FavoriteAdvertItem) r8
                java.lang.String r8 = r8.f156404b
                boolean r8 = kotlin.jvm.internal.L.f(r8, r3)
                if (r8 == 0) goto L8b
                goto La8
            La7:
                r7 = r6
            La8:
                com.avito.android.favorites.adapter.FavoriteListItem r7 = (com.avito.android.favorites.adapter.FavoriteListItem) r7
                goto Lac
            Lab:
                r7 = r6
            Lac:
                boolean r3 = r7 instanceof com.avito.android.favorites.adapter.advert.FavoriteAdvertItem
                if (r3 == 0) goto Lb3
                r6 = r7
                com.avito.android.favorites.adapter.advert.FavoriteAdvertItem r6 = (com.avito.android.favorites.adapter.advert.FavoriteAdvertItem) r6
            Lb3:
                if (r6 != 0) goto Lc0
                com.avito.android.favorites.r0$d$a r11 = new com.avito.android.favorites.r0$d$a
                r11.<init>(r4)
                BK0.a<com.avito.android.favorites.r0$d> r0 = r2.f157468g0
                r0.onNext(r11)
                goto Lcd
            Lc0:
                boolean r3 = r6.f156394F
                if (r3 == 0) goto L72
                r0.add(r6)
                goto L72
            Lc8:
                r2.f157462d0 = r4
                com.avito.android.favorites.C30684r0.H(r2, r0)
            Lcd:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.C30684r0.C30686b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.r0$c, reason: case insensitive filesystem */
    public /* synthetic */ class C30687c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ContactSource> f157513a = kotlin.enums.c.a(ContactSource.values());
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/favorites/r0$d;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/favorites/r0$d$a;", "Lcom/avito/android/favorites/r0$d$b;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.r0$d, reason: case insensitive filesystem */
    public static abstract class AbstractC30688d {

        /* compiled from: FavoritesListPresenter.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/r0$d$a;", "Lcom/avito/android/favorites/r0$d;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorites.r0$d$a */
        public static final /* data */ class a extends AbstractC30688d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f157514a;

            public a(@Y61.k String str) {
                super(null);
                this.f157514a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f157514a, ((a) obj).f157514a);
            }

            public final int hashCode() {
                return this.f157514a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("RefreshScreen(eventId="), this.f157514a, ')');
            }
        }

        /* compiled from: FavoritesListPresenter.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/r0$d$b;", "Lcom/avito/android/favorites/r0$d;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorites.r0$d$b */
        public static final /* data */ class b extends AbstractC30688d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Throwable f157515a;

            public b(@Y61.k Throwable th2) {
                super(null);
                this.f157515a = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f157515a, ((b) obj).f157515a);
            }

            public final int hashCode() {
                return this.f157515a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowSyncError(error="), this.f157515a, ')');
            }
        }

        public /* synthetic */ AbstractC30688d(C42822w c42822w) {
            this();
        }

        public AbstractC30688d() {
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/util/P2;", "", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "apply", "(J)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$f, reason: case insensitive filesystem */
    public static final class C30690f<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f157518c;

        public C30690f(String str) {
            this.f157518c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Boolean value;
            String str;
            ((Number) obj).longValue();
            C30684r0 c30684r0 = C30684r0.this;
            InterfaceC30681p0 interfaceC30681p0 = c30684r0.f157457b;
            CategoryState categoryState = c30684r0.f157458b0;
            String str2 = categoryState.f156206b;
            Map mapSingletonMap = str2 != null ? Collections.singletonMap(str2, Integer.valueOf(categoryState.f156207c)) : kotlin.collections.P0.c();
            OrderState orderState = c30684r0.f157460c0;
            String str3 = orderState.f156313b;
            Map mapC = (str3 == null || (str = orderState.f156314c) == null) ? kotlin.collections.P0.c() : Collections.singletonMap(str3, str);
            if (c30684r0.f157464e0 != null) {
                value = c30684r0.f157490r0.getValue();
                value.getClass();
            } else {
                value = null;
            }
            return interfaceC30681p0.g(mapSingletonMap, mapC, value, this.f157518c);
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "it", "", "test", "(Lcom/avito/android/util/P2;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$g, reason: case insensitive filesystem */
    public static final class C30691g<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f157519b;

        public C30691g(boolean z12) {
            this.f157519b = z12;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return !(((P2) obj) instanceof P2.c) || this.f157519b;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "loadingState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$h */
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12;
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.b) {
                List list = (List) ((P2.b) p22).f318720a;
                C30684r0 c30684r0 = C30684r0.this;
                kotlinx.coroutines.N0 n02 = c30684r0.f157494t0;
                if (n02 != null) {
                    ((kotlinx.coroutines.V0) n02).c(null);
                }
                c30684r0.f157494t0 = null;
                long jD2 = c30684r0.f157439J.d();
                Iterator it = list.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                        break;
                    } else {
                        if (((FavoriteListItem) it.next()) instanceof CommercialLoadingItem) {
                            i12 = i13;
                            break;
                        }
                        i13++;
                    }
                }
                if (i12 == -1) {
                    c30684r0.f157492s0 = false;
                    return;
                }
                c30684r0.f157492s0 = true;
                Object objK = C42745f0.K(i12, list);
                CommercialLoadingItem commercialLoadingItem = objK instanceof CommercialLoadingItem ? (CommercialLoadingItem) objK : null;
                if (commercialLoadingItem == null) {
                    return;
                }
                c30684r0.f157494t0 = C43259k.d(c30684r0.f157449T, null, null, new K0(c30684r0, commercialLoadingItem, jD2, i12, null), 3);
            }
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("FavoritesListPresenter", "load favorites error", th2);
            C30684r0 c30684r0 = C30684r0.this;
            c30684r0.J();
            x1 x1Var = c30684r0.f157454Y;
            if (x1Var != null) {
                x1Var.q("");
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "loadingState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<P2<? super List<? extends FavoriteListItem>>, kotlin.G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(P2<? super List<? extends FavoriteListItem>> p22) {
            x1 x1Var;
            P2<? super List<? extends FavoriteListItem>> p23 = p22;
            boolean z12 = p23 instanceof P2.a;
            C30684r0 c30684r0 = C30684r0.this;
            if (z12) {
                c30684r0.f157467g.h();
                P2.a aVar = (P2.a) p23;
                c30684r0.J();
                x1 x1Var2 = c30684r0.f157454Y;
                if (x1Var2 != null) {
                    x1Var2.l(false);
                }
                com.avito.android.error.z.g(aVar.f318719a, new J0(c30684r0, aVar), null, null, null, null, 30);
                c30684r0.f157467g.g(aVar.f318719a);
            } else if (p23 instanceof P2.b) {
                c30684r0.f157467g.h();
                c30684r0.f157456a0 = (List) ((P2.b) p23).f318720a;
                c30684r0.O();
                c30684r0.f157467g.k();
                List<? extends FavoriteListItem> list = c30684r0.f157456a0;
                c30684r0.f157481n.b(!(list == null || list.isEmpty()));
            } else if (p23.equals(P2.c.f318721a) && (x1Var = c30684r0.f157454Y) != null) {
                x1Var.t2();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("FavoritesListPresenter", "get categories error", th2);
            C30684r0 c30684r0 = C30684r0.this;
            c30684r0.J();
            x1 x1Var = c30684r0.f157454Y;
            if (x1Var != null) {
                x1Var.q("");
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/FavoriteItemsWidgets;", "result", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/FavoriteItemsWidgets;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.l<FavoriteItemsWidgets, kotlin.G0> {
        public l() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:137:0x014f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x017a A[LOOP:3: B:70:0x0174->B:72:0x017a, LOOP_END] */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.remote.model.FavoriteItemsWidgets r27) {
            /*
                Method dump skipped, instructions count: 677
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.C30684r0.l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$m */
    public static final class m extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final m f157525l = new m();

        public m() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "FavoritesListPresenter", th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasNotSyncedItems", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$n */
    public static final class n extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C30684r0 c30684r0 = C30684r0.this;
            if (zBooleanValue) {
                c30684r0.f157466f0 = true;
                FavoritesFragment favoritesFragment = c30684r0.f157455Z;
                if (favoritesFragment != null) {
                    favoritesFragment.F5();
                }
            } else {
                C30684r0.L(c30684r0, true, 6);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$o */
    public static final class o extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final o f157527l = new o();

        public o() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "FavoritesListPresenter", th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasNotSyncedItems", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$p */
    public static final class p extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C30684r0 c30684r0 = C30684r0.this;
            if (zBooleanValue) {
                c30684r0.f157466f0 = true;
                FavoritesFragment favoritesFragment = c30684r0.f157455Z;
                if (favoritesFragment != null) {
                    favoritesFragment.F5();
                }
            } else {
                c30684r0.M();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$q */
    public static final class q<T> implements l41.g {
        public q() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            x1 x1Var = C30684r0.this.f157454Y;
            if (x1Var != null) {
                x1Var.t2();
            }
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$r */
    public static final class r extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public r() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            C30684r0 c30684r0 = C30684r0.this;
            x1 x1Var = c30684r0.f157454Y;
            if (x1Var != null) {
                x1Var.e();
            }
            x1 x1Var2 = c30684r0.f157454Y;
            if (x1Var2 != null) {
                InterfaceC30665h1.a.a(x1Var2, InterfaceC35741a1.a.a(c30684r0.f157471i, th3, null, null, 6), th3, null, 4);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$s */
    public static final class s extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public s() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            x1 x1Var;
            C30684r0 c30684r0 = C30684r0.this;
            c30684r0.f157456a0 = null;
            c30684r0.f157458b0 = new CategoryState(null, 0, null, null, 15, null);
            c30684r0.f157460c0 = new OrderState(null, null, null, null, false, 31, null);
            x1 x1Var2 = c30684r0.f157454Y;
            if (x1Var2 != null) {
                x1Var2.m(null, false);
            }
            c30684r0.O();
            c30684r0.N();
            if (c30684r0.f157447R.c() && (x1Var = c30684r0.f157454Y) != null) {
                InterfaceC30665h1.a.a(x1Var, com.avito.android.printable_text.b.c(R.string.favorites_removed_all, new Serializable[0]), null, null, 6);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$t */
    public static final class t<T> implements l41.g {
        public t() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            x1 x1Var = C30684r0.this.f157454Y;
            if (x1Var != null) {
                x1Var.t2();
            }
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$u */
    public static final class u extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public u() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            C30684r0 c30684r0 = C30684r0.this;
            x1 x1Var = c30684r0.f157454Y;
            if (x1Var != null) {
                x1Var.e();
            }
            x1 x1Var2 = c30684r0.f157454Y;
            if (x1Var2 != null) {
                InterfaceC30665h1.a.a(x1Var2, InterfaceC35741a1.a.a(c30684r0.f157471i, th3, null, null, 6), th3, null, 4);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$v */
    public static final class v extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public v() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r5 = this;
                com.avito.android.favorites.r0 r0 = com.avito.android.favorites.C30684r0.this
                r0.M()
                java.util.List<? extends com.avito.android.favorites.adapter.FavoriteListItem> r1 = r0.f157456a0
                r2 = 0
                if (r1 == 0) goto L43
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r3 = r1 instanceof java.util.Collection
                if (r3 == 0) goto L1a
                r3 = r1
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L1a
                goto L35
            L1a:
                java.util.Iterator r1 = r1.iterator()
            L1e:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r1.next()
                com.avito.android.favorites.adapter.FavoriteListItem r3 = (com.avito.android.favorites.adapter.FavoriteListItem) r3
                boolean r4 = r3 instanceof com.avito.android.favorites.adapter.advert.FavoriteAdvertItem
                if (r4 == 0) goto L43
                com.avito.android.favorites.adapter.advert.FavoriteAdvertItem r3 = (com.avito.android.favorites.adapter.advert.FavoriteAdvertItem) r3
                boolean r3 = r3.f156411i
                if (r3 != 0) goto L43
                goto L1e
            L35:
                com.avito.android.favorites.x1 r1 = r0.f157454Y
                if (r1 == 0) goto L3c
                r1.o(r2)
            L3c:
                com.avito.android.favorites.x1 r1 = r0.f157454Y
                if (r1 == 0) goto L43
                r1.g()
            L43:
                ur.b r1 = r0.f157447R
                boolean r1 = r1.c()
                if (r1 == 0) goto L5d
                com.avito.android.favorites.x1 r0 = r0.f157454Y
                if (r0 == 0) goto L5d
                r1 = 2131953879(0x7f1308d7, float:1.9544241E38)
                java.io.Serializable[] r2 = new java.io.Serializable[r2]
                com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.c(r1, r2)
                r2 = 6
                r3 = 0
                com.avito.android.favorites.InterfaceC30665h1.a.a(r0, r1, r3, r3, r2)
            L5d:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.C30684r0.v.invoke():java.lang.Object");
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$w */
    public static final class w extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final w f157535l = new w();

        public w() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "FavoritesListPresenter", th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasNotSyncedItems", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$x */
    public static final class x extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public x() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C30684r0 c30684r0 = C30684r0.this;
            if (zBooleanValue) {
                c30684r0.f157466f0 = true;
                FavoritesFragment favoritesFragment = c30684r0.f157455Z;
                if (favoritesFragment != null) {
                    favoritesFragment.F5();
                }
            } else {
                x1 x1Var = c30684r0.f157454Y;
                if (x1Var != null) {
                    x1Var.t2();
                }
                c30684r0.M();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$y */
    public static final class y extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final y f157537l = new y();

        public y() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            V2.f318762a.a("FavoritesListPresenter", "update finished error", th2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorites/r0$d$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/favorites/r0$d$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.r0$z */
    public static final class z extends kotlin.jvm.internal.N implements Y41.l<AbstractC30688d.a, kotlin.G0> {
        public z() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(AbstractC30688d.a aVar) {
            String str = aVar.f157514a;
            C30684r0 c30684r0 = C30684r0.this;
            c30684r0.f157462d0 = str;
            c30684r0.M();
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public C30684r0(@Y61.k InterfaceC30681p0 interfaceC30681p0, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.util.R0 r02, @Y61.k InterfaceC30610d0 interfaceC30610d0, @Y61.k com.avito.android.analytics.provider.e eVar, @Y61.k InterfaceC25497b interfaceC25497b, @Y61.k RC.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC30605b1 interfaceC30605b1, @Y61.l Kundle kundle, @Y61.k com.avito.android.favorite.h hVar, @J40.b @Y61.k com.avito.android.onboarding_manager.e eVar2, @Y61.k AD.a aVar2, @Y61.k com.avito.android.favorites.ux_feedback.b bVar, @Y61.k InterfaceC33034d interfaceC33034d, @Y61.k com.avito.android.location.find.o oVar, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k com.avito.android.advert_collection_toast.b bVar2, @Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar2, @Y61.k com.avito.android.cart_snippet_actions.e eVar3, @Y61.k com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12, @Y61.k com.avito.android.cart_snippet_actions.a aVar4, @Y61.k com.avito.android.sales_items.a aVar5, @Y61.k com.avito.android.sales_items.m mVar, @Y61.k YC.a aVar6, @Y61.l InterfaceC35724i interfaceC35724i, @InterfaceC48488t @Y61.k u3.h<SimpleTestGroup> hVar3, @Y61.l @InterfaceC30264p String str, @Y61.k FavoritesSpace favoritesSpace, @Y61.k C41343c c41343c, @Y61.k Set<String> set, @Y61.k InterfaceC25663c interfaceC25663c, @Y61.l Integer num, @Y61.k aU0.b bVar3, @Y61.k com.avito.android.advertising.loaders.n nVar, @Y61.k com.avito.android.advertising.loaders.j jVar, @Y61.k com.avito.android.progress_info_toast_bar.interactor.g gVar, @Y61.k ProgressInfoToastBarPresenter progressInfoToastBarPresenter, @Y61.k Q1 q12, @Y61.k AD.a aVar7, @Y61.k TC.a aVar8, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k InterfaceC49101b interfaceC49101b) {
        CategoryState categoryState;
        String strG;
        OrderState orderState;
        this.f157457b = interfaceC30681p0;
        this.f157459c = interfaceC35745a5;
        this.f157461d = r02;
        this.f157463e = interfaceC30610d0;
        this.f157465f = eVar;
        this.f157467g = interfaceC25497b;
        this.f157469h = aVar;
        this.f157471i = interfaceC35741a1;
        this.f157473j = interfaceC30605b1;
        this.f157475k = hVar;
        this.f157477l = eVar2;
        this.f157479m = aVar2;
        this.f157481n = bVar;
        this.f157483o = interfaceC33034d;
        this.f157485p = oVar;
        this.f157487q = interfaceC43691a;
        this.f157489r = aVar3;
        this.f157491s = bVar2;
        this.f157493t = e12;
        this.f157495u = hVar2;
        this.f157497v = eVar3;
        this.f157499w = n12;
        this.f157501x = aVar4;
        this.f157502y = aVar5;
        this.f157503z = mVar;
        this.f157430A = aVar6;
        this.f157431B = interfaceC35724i;
        this.f157432C = hVar3;
        this.f157433D = str;
        this.f157434E = favoritesSpace;
        this.f157435F = c41343c;
        this.f157436G = set;
        this.f157437H = interfaceC25663c;
        this.f157438I = bVar3;
        this.f157439J = nVar;
        this.f157440K = jVar;
        this.f157441L = gVar;
        this.f157442M = progressInfoToastBarPresenter;
        this.f157443N = q12;
        this.f157444O = aVar7;
        this.f157445P = aVar8;
        this.f157446Q = xVar;
        this.f157447R = interfaceC49101b;
        this.f157449T = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((kotlinx.coroutines.V0) kotlinx.coroutines.t1.b(), r02.b()));
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f157450U = cVar;
        this.f157451V = new io.reactivex.rxjava3.disposables.c();
        this.f157452W = new com.jakewharton.rxrelay3.c<>();
        if (kundle == null || (categoryState = (CategoryState) kundle.d("category_state")) == null) {
            categoryState = new CategoryState(null, num != null ? num.intValue() : 0, num, null, 9, null);
        }
        this.f157458b0 = categoryState;
        this.f157460c0 = (kundle == null || (orderState = (OrderState) kundle.d("order_state")) == null) ? new OrderState(null, null, null, null, false, 31, null) : orderState;
        this.f157462d0 = (kundle == null || (strG = kundle.g("sync_completed_event_id")) == null) ? "" : strG;
        this.f157464e0 = kundle != null ? (ShowOnlyActiveFavoritesSwitchInfo) kundle.d("show_only_active_favorites_switch_value") : null;
        this.f157468g0 = new BK0.a<>();
        this.f157470h0 = kundle != null ? kundle.g(ChannelContext.Item.USER_ID) : null;
        Map mapF = kundle != null ? kundle.f("initial_item_changes") : null;
        this.f157472i0 = new LinkedHashMap(mapF == null ? kotlin.collections.P0.c() : mapF);
        this.f157474j0 = kundle != null ? (FavoritesSearchWidget) kundle.d("search_widget") : null;
        List listE = kundle != null ? kundle.e("initial_cart_items_changes") : null;
        this.f157478l0 = new ArrayList(listE == null ? C42784z0.f406748b : listE);
        this.f157480m0 = UUID.randomUUID().toString();
        this.f157484o0 = new io.reactivex.rxjava3.subjects.e<>();
        this.f157486p0 = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        Boolean bool = Boolean.FALSE;
        this.f157488q0 = p2.a(bool);
        this.f157490r0 = p2.a(bool);
        String strG2 = kundle != null ? kundle.g("searchQuery") : null;
        strG2 = strG2 == null ? "" : strG2;
        FavoritesSearchWidget favoritesSearchWidget = this.f157474j0;
        String placeholder = favoritesSearchWidget != null ? favoritesSearchWidget.getPlaceholder() : null;
        Z1<com.avito.android.favorites.compose.search.f> z1A = p2.a(new com.avito.android.favorites.compose.search.f(strG2, placeholder != null ? placeholder : "", false, null, null, null, 60, null));
        this.f157496u0 = z1A;
        this.f157498v0 = C43175k.b(z1A);
        this.f157500w0 = new C30689e();
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(interfaceC30681p0.j().D(io.reactivex.rxjava3.internal.functions.a.f401991a).j0(interfaceC35745a5.e()), new C30685a(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new C30686b(), 2));
    }

    public static final void H(C30684r0 c30684r0, List list) {
        List<? extends FavoriteListItem> list2 = c30684r0.f157456a0;
        if (list2 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.avito.android.serp.adapter.L l12 = (com.avito.android.serp.adapter.L) it.next();
                l12.setFavorite(!l12.getF107475k());
                Iterator<? extends FavoriteListItem> it2 = list2.iterator();
                int i12 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i12 = -1;
                        break;
                    } else if (kotlin.jvm.internal.L.f(it2.next().getF201958b(), l12.getF201958b())) {
                        break;
                    } else {
                        i12++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i12);
                if (i12 == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    FavoriteListItem favoriteListItem = list2.get(iIntValue);
                    com.avito.android.serp.adapter.S s5 = favoriteListItem instanceof com.avito.android.serp.adapter.S ? (com.avito.android.serp.adapter.S) favoriteListItem : null;
                    if (s5 != null) {
                        s5.setFavorite(l12.getF107475k());
                    }
                    x1 x1Var = c30684r0.f157454Y;
                    if (x1Var != null) {
                        x1Var.C3(iIntValue);
                    }
                }
                List<CategoryChipable> list3 = c30684r0.f157458b0.f156209e;
                ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
                for (CategoryChipable categoryChipable : list3) {
                    int i13 = categoryChipable.f156200b;
                    Integer f268423b0 = l12.getF268423b0();
                    if ((f268423b0 != null && i13 == f268423b0.intValue()) || categoryChipable.f156200b == 0) {
                        int i14 = categoryChipable.f156202d + (l12.getF107475k() ? 1 : -1);
                        categoryChipable = new CategoryChipable(categoryChipable.f156200b, categoryChipable.f156201c, i14 < 0 ? 0 : i14, categoryChipable.f156203e, categoryChipable.f156204f, categoryChipable.f156205g);
                    }
                    arrayList.add(categoryChipable);
                }
                c30684r0.f157458b0 = CategoryState.a(c30684r0.f157458b0, null, 0, arrayList, 7);
            }
            c30684r0.N();
        }
    }

    public static /* synthetic */ void L(C30684r0 c30684r0, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            z12 = true;
        }
        c30684r0.K(null, null, z12);
    }

    @Override // com.avito.android.favorites.adapter.loading.c.a
    public final void A(@Y61.k Uri uri) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f157453X;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f157453X = io.reactivex.rxjava3.kotlin.A1.h(this.f157457b.b(uri).j0(this.f157459c.e()), new L0(this), new M0(this, uri), 2);
    }

    @Override // rn0.InterfaceC47691c
    public final void B(@Y61.k DeepLink deepLink) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, null, 2);
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void C(@Y61.k String str) {
        this.f157469h.i0(str);
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            SimilarAdvertsDialog.a.a(SimilarAdvertsDialog.f283776w0, str).show(favoritesFragment.getChildFragmentManager(), (String) null);
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void D(@Y61.k DeepLink deepLink, @Y61.k String str) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, null, 6);
        }
        this.f157469h.l0(str, deepLink.getPath());
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void E(@Y61.k DeepLink deepLink) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, null, 6);
        }
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final InterfaceC27108f Ed() {
        return this.f157435F.f398527c;
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void F(@Y61.k String str, @Y61.k String str2) {
        this.f157469h.k0(str, str2);
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z H4() {
        return this.f157435F.f398526b;
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void Ic(@Y61.l OrderEntity orderEntity) {
        Object next;
        String str;
        String str2 = orderEntity != null ? orderEntity.f156311b : null;
        if (kotlin.jvm.internal.L.f(str2, this.f157460c0.f156314c)) {
            return;
        }
        boolean zF2 = kotlin.jvm.internal.L.f(str2, "distance__asc");
        io.reactivex.rxjava3.disposables.c cVar = this.f157448S;
        com.avito.android.sales_items.m mVar = this.f157503z;
        if (zF2) {
            mVar.f(false);
            x1 x1Var = this.f157454Y;
            if (x1Var != null) {
                x1Var.t2();
            }
            FindLocationPage findLocationPage = FindLocationPage.f181725c;
            this.f157487q.e("favorites");
            cVar.b(this.f157483o.g());
            return;
        }
        mVar.f(false);
        OrderState orderState = this.f157460c0;
        if (orderEntity == null || (str = orderEntity.f156311b) == null) {
            List<OrderEntity> list = orderState.f156316e;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((OrderEntity) next).f156311b, orderState.f156315d)) {
                        break;
                    }
                }
            }
            OrderEntity orderEntity2 = (OrderEntity) next;
            if (orderEntity2 == null) {
                orderEntity2 = (OrderEntity) C42745f0.G(list);
            }
            str = orderEntity2 != null ? orderEntity2.f156311b : null;
        }
        OrderState orderStateA = OrderState.a(orderState, str, false, 29);
        this.f157460c0 = orderStateA;
        x1 x1Var2 = this.f157454Y;
        if (x1Var2 != null) {
            OrderEntity orderEntityC = orderStateA.c();
            x1Var2.m(orderEntityC != null ? orderEntityC.f156312c : null, this.f157460c0.f156317f);
        }
        cVar.b(io.reactivex.rxjava3.kotlin.A1.e(this.f157457b.e(), m.f157525l, new n()));
    }

    public final void J() {
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            x1Var.f157608l.setRefreshing(false);
        }
        x1 x1Var2 = this.f157454Y;
        if (x1Var2 != null) {
            x1Var2.e();
        }
    }

    public final void K(Integer num, String str, boolean z12) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f157453X;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        long jIntValue = num != null ? num.intValue() : 0L;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f157459c;
        this.f157453X = io.reactivex.rxjava3.kotlin.A1.h(io.reactivex.rxjava3.core.z.F0(jIntValue, timeUnit, interfaceC35745a5.c()).T(new C30690f(str), Integer.MAX_VALUE).N(new C30691g(z12)).x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).K(new h()), new i(), new j(), 2);
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    @Y61.k
    /* renamed from: Kd, reason: from getter */
    public final C30689e getF157500w0() {
        return this.f157500w0;
    }

    public final void M() {
        this.f157448S.b(io.reactivex.rxjava3.kotlin.A1.e(this.f157457b.a().s(this.f157459c.e()), new k(), new l()));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[EDGE_INSN: B:74:0x00c1->B:39:0x00c1 BREAK  A[LOOP:1: B:29:0x007a->B:75:?]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.C30684r0.N():void");
    }

    public final void O() {
        List<? extends FavoriteListItem> list;
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            List list2 = this.f157456a0;
            if (list2 == null) {
                list2 = C42784z0.f406748b;
            }
            boolean f157492s0 = x1Var.f157600d.getF157492s0();
            com.avito.konveyor.item_visibility_tracker.b bVar = x1Var.f157604h;
            boolean z12 = f157492s0 && !bVar.f();
            if (z12) {
                bVar.c(new UV0.c(list2));
            }
            com.avito.konveyor.adapter.a aVar = x1Var.f157601e;
            com.avito.konveyor.util.a.a(aVar, list2);
            RecyclerView recyclerView = x1Var.f157609m;
            if (recyclerView.getAdapter() == null) {
                recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar, x1Var.f157602f));
            } else {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
            if (z12) {
                bVar.a(recyclerView, null);
            }
        }
        if (this.f157498v0.getValue().f156881a.length() <= 0 || !((list = this.f157456a0) == null || list.isEmpty())) {
            List<? extends FavoriteListItem> list3 = this.f157456a0;
            if (list3 == null || list3.isEmpty()) {
                x1 x1Var2 = this.f157454Y;
                if (x1Var2 != null) {
                    if (x1Var2.f157606j) {
                        D6.H(x1Var2.f157622z);
                    } else {
                        D6.H(x1Var2.f157610n);
                    }
                }
                boolean z13 = !this.f157458b0.f156209e.isEmpty();
                x1 x1Var3 = this.f157454Y;
                if (x1Var3 != null) {
                    x1Var3.l(z13);
                }
                x1 x1Var4 = this.f157454Y;
                if (x1Var4 != null) {
                    x1Var4.k(z13);
                }
                P(false);
            } else {
                x1 x1Var5 = this.f157454Y;
                if (x1Var5 != null) {
                    x1Var5.d();
                }
                x1 x1Var6 = this.f157454Y;
                if (x1Var6 != null) {
                    x1Var6.l(true);
                }
                x1 x1Var7 = this.f157454Y;
                if (x1Var7 != null) {
                    x1Var7.k(true);
                }
                P(false);
            }
        } else {
            x1 x1Var8 = this.f157454Y;
            if (x1Var8 != null) {
                x1Var8.d();
            }
            x1 x1Var9 = this.f157454Y;
            if (x1Var9 != null) {
                x1Var9.l(true);
            }
            x1 x1Var10 = this.f157454Y;
            if (x1Var10 != null) {
                x1Var10.k(true);
            }
            P(true);
        }
        J();
        C43259k.d(this.f157449T, null, null, new Y0(this, null), 3);
    }

    public final void P(boolean z12) {
        com.avito.android.favorites.compose.search.f value;
        com.avito.android.favorites.compose.search.f fVar;
        String title;
        String subtitle;
        FavoritesSearchWidget favoritesSearchWidget;
        FavoritesSearchWidget favoritesSearchWidget2;
        FavoritesSearchWidget.NotFoundInfo notFoundInfo;
        FavoritesSearchWidget.NotFoundInfo notFoundInfo2;
        FavoritesSearchWidget.NotFoundInfo notFoundInfo3;
        FavoritesSearchWidget.NotFoundInfo notFoundInfo4;
        Z1<com.avito.android.favorites.compose.search.f> z13 = this.f157496u0;
        do {
            value = z13.getValue();
            fVar = value;
            FavoritesSearchWidget favoritesSearchWidget3 = this.f157474j0;
            title = (favoritesSearchWidget3 == null || (notFoundInfo4 = favoritesSearchWidget3.getNotFoundInfo()) == null) ? null : notFoundInfo4.getTitle();
            FavoritesSearchWidget favoritesSearchWidget4 = this.f157474j0;
            subtitle = (favoritesSearchWidget4 == null || (notFoundInfo3 = favoritesSearchWidget4.getNotFoundInfo()) == null) ? null : notFoundInfo3.getSubtitle();
            favoritesSearchWidget = this.f157474j0;
        } while (!z13.N3(value, com.avito.android.favorites.compose.search.f.a(fVar, null, null, false, title, subtitle, ((((favoritesSearchWidget == null || (notFoundInfo2 = favoritesSearchWidget.getNotFoundInfo()) == null) ? null : notFoundInfo2.getButtonDeepLink()) instanceof NoMatchLink) || (favoritesSearchWidget2 = this.f157474j0) == null || (notFoundInfo = favoritesSearchWidget2.getNotFoundInfo()) == null) ? null : notFoundInfo.getButtonTitle(), 7)));
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            x1Var.f157621y.setVisibility(z12 ? 0 : 8);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.util.Map] */
    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void Rc(@Y61.k x1 x1Var) {
        this.f157454Y = x1Var;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f157489r.d9().t0(new N0(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f157448S;
        cVar.b(dVarT0);
        AD.a aVar = this.f157479m;
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = AD.a.f216k[1];
        if (((Boolean) aVar.f217b.a().invoke()).booleanValue()) {
            cVar.b(io.reactivex.rxjava3.kotlin.A1.h(this.f157481n.a(), null, null, 7));
        }
        this.f157502y.b();
        io.reactivex.rxjava3.internal.operators.observable.L lM2 = this.f157493t.m();
        final V2 v22 = V2.f318762a;
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(lM2, new A0(1, v22, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new B0(this), 2));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(C35896f0.e(x1Var.f157596B, new C0(this)), null, new D0(this), 3));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(x1Var.f157597C, null, new E0(this), 3));
        if (this.f157458b0.f156209e.isEmpty() && this.f157460c0.f156316e.isEmpty()) {
            x1 x1Var2 = this.f157454Y;
            if (x1Var2 != null) {
                x1Var2.t2();
            }
            M();
        } else {
            N();
            OrderEntity orderEntityC = this.f157460c0.c();
            x1Var.m(orderEntityC != null ? orderEntityC.f156312c : null, this.f157460c0.f156317f);
            if (this.f157456a0 != null) {
                O();
            } else {
                L(this, false, 7);
            }
        }
        l0.h hVar = new l0.h();
        hVar.f406842b = kotlin.collections.P0.c();
        ArrayList arrayList = this.f157478l0;
        l41.c cVar2 = F0.f156216b;
        io.reactivex.rxjava3.subjects.e<CartItemQuantityChange> eVar = this.f157484o0;
        io.reactivex.rxjava3.internal.operators.observable.W wE2 = C35896f0.e(eVar.o0(arrayList, cVar2), G0.f156274l);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f157459c;
        cVar.b(wE2.y(500L, timeUnit, interfaceC35745a5.c()).d0(new H0(this)).j0(interfaceC35745a5.e()).v0(new I0(this, hVar), new l41.g() { // from class: com.avito.android.favorites.s0
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(com.avito.android.cart_snippet_actions.utils.h.a(eVar.d0(C30695t0.f157544b), this.f157459c, this.f157495u, this.f157472i0, new C30697u0(this), new C30701w0(this, x1Var, hVar)), new C30703x0(1, v22, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), null, 6));
        C43238h c43238h = this.f157449T;
        InterfaceC35724i interfaceC35724i = this.f157431B;
        if (interfaceC35724i != null) {
            C43175k.K(new C43197r1(new C30705y0(x1Var, null), interfaceC35724i.p4()), c43238h);
        } else {
            x1Var.p(true);
        }
        C43175k.K(new C43197r1(new C30707z0(2, this, C30684r0.class, "updateRelatedProductsEntryPointState", "updateRelatedProductsEntryPointState(Lcom/avito/android/related_products/EntryPointStateChange;)V", 4), this.f157437H.a()), c43238h);
        x1Var.n(this.f157474j0 != null);
        x1Var.i(this.f157498v0.getValue().f156881a.length() > 0);
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void S() {
        this.f157487q.f(null, "PERMISSION DENIED");
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            x1Var.e();
        }
        this.f157448S.b(this.f157483o.h());
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void T3(@Y61.k FavoritesFragment favoritesFragment) {
        this.f157455Z = favoritesFragment;
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void V3() {
        InterfaceC30605b1 interfaceC30605b1 = this.f157473j;
        this.f157456a0 = interfaceC30605b1.b();
        interfaceC30605b1.a();
    }

    @Override // rn0.e
    public final void W(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource, @Y61.l ScreenIdField screenIdField, @Y61.l String str2) {
        boolean z12 = deepLink instanceof ClickStreamLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f157489r;
        String str3 = null;
        Boolean boolValueOf = null;
        str3 = null;
        if (z12) {
            ClickStreamLink clickStreamLink = (ClickStreamLink) deepLink;
            clickStreamLink.getClass();
            b.a.a(aVar, ClickStreamLink.a(clickStreamLink, null), null, null, 6);
            DeepLink deepLink2 = clickStreamLink.f133110e;
            if (deepLink2 != null) {
                W(str, deepLink2, contactSource, null, null);
                return;
            }
            return;
        }
        boolean z13 = true;
        if (deepLink instanceof PhoneRequestLink) {
            PhoneRequestLink phoneRequestLink = (PhoneRequestLink) deepLink;
            Bundle bundleB = C22777e.b(new kotlin.Q("key_advert_id", str), new kotlin.Q("key_phone_request_link_contact_source_ordinal", Integer.valueOf(contactSource.ordinal())));
            C13979c.f7563a.getClass();
            bundleB.putBoolean("PhoneRequestLink.ManualMode", true);
            String str4 = contactSource.f89926c == 3 ? "item_feed_photo" : null;
            if (str4 != null) {
                bundleB.putString("PhoneRequestLink.IacOverrideScenario", str4);
            }
            b.a.a(aVar, phoneRequestLink, null, bundleB, 2);
            return;
        }
        boolean z14 = deepLink instanceof PhoneLink;
        boolean z15 = contactSource.f89925b;
        RC.a aVar2 = this.f157469h;
        if (z14) {
            PhoneLink phoneLink = (PhoneLink) deepLink;
            PhoneLink.Call call = phoneLink instanceof PhoneLink.Call ? (PhoneLink.Call) phoneLink : null;
            aVar2.Y(str, call != null ? call.f133575d : null, z15);
            FavoritesFragment favoritesFragment = this.f157455Z;
            if (favoritesFragment != null) {
                P0 p02 = new P0(this, phoneLink, str);
                com.avito.android.lib.deprecated_design.dialog.p pVar = com.avito.android.lib.deprecated_design.dialog.p.f177947a;
                androidx.appcompat.app.l lVar = favoritesFragment.f156243Y0;
                pVar.getClass();
                if (lVar == null || !lVar.isShowing()) {
                    L4 l42 = favoritesFragment.f156236R0;
                    androidx.appcompat.app.l lVarCreate = new l.a(favoritesFragment.requireContext()).setTitle(R.string.phone).setMessage((l42 != null ? l42 : null).a(phoneLink.getF133573b())).setPositiveButton(R.string.call, new DialogInterfaceOnClickListenerC30673l0(p02, 0)).setOnCancelListener(new com.avito.android.advert.item.Y0(1)).create();
                    favoritesFragment.f156243Y0 = lVarCreate;
                    if (lVarCreate != null) {
                        com.avito.android.lib.util.g.a(lVarCreate);
                    }
                } else {
                    z13 = false;
                }
                boolValueOf = Boolean.valueOf(z13);
            }
            if (kotlin.jvm.internal.L.f(boolValueOf, Boolean.TRUE)) {
                aVar2.k(str);
                return;
            }
            return;
        }
        if (deepLink instanceof AnonymousNumberDialogLink) {
            AnonymousNumberDialogLink anonymousNumberDialogLink = (AnonymousNumberDialogLink) deepLink;
            DeepLink deepLink3 = anonymousNumberDialogLink.f91273f;
            if (deepLink3 instanceof PhoneLink.Call) {
                str3 = ((PhoneLink.Call) deepLink3).f133575d;
            } else if (deepLink3 instanceof ClickStreamLink) {
                DeepLink deepLink4 = ((ClickStreamLink) deepLink3).f133110e;
                PhoneLink.Call call2 = deepLink4 instanceof PhoneLink.Call ? (PhoneLink.Call) deepLink4 : null;
                if (call2 != null) {
                    str3 = call2.f133575d;
                }
            }
            aVar2.Y(str, str3, z15);
            Bundle bundle = new Bundle();
            bundle.putString("key_advert_id", str);
            bundle.putString("key_source_name", "button");
            FavoritesFragment favoritesFragment2 = this.f157455Z;
            if (favoritesFragment2 != null) {
                InterfaceC30683q0.c.a.a(favoritesFragment2, anonymousNumberDialogLink, bundle, 2);
                return;
            }
            return;
        }
        if (deepLink instanceof JobApplyCreateLink) {
            kotlinx.coroutines.N0 n02 = this.f157476k0;
            if (n02 != null) {
                n02.c(null);
            }
            com.avito.android.progress_info_toast_bar.interactor.g gVar = this.f157441L;
            String str5 = this.f157480m0;
            this.f157476k0 = C43175k.K(new C43197r1(new X0(2, this, C30684r0.class, "onVacancyRespond", "onVacancyRespond(Ljava/lang/String;)V", 4), gVar.b(str5)), this.f157449T);
            gVar.a(str, str5);
            JobApplyCreateLink jobApplyCreateLink = (JobApplyCreateLink) deepLink;
            this.f157469h.h0(jobApplyCreateLink.f134079b, contactSource, jobApplyCreateLink.f134080c.f133132d, screenIdField, str2);
            b.a.a(aVar, deepLink, null, null, 6);
            return;
        }
        if (!(deepLink instanceof CreateChannelLink)) {
            FavoritesFragment favoritesFragment3 = this.f157455Z;
            if (favoritesFragment3 != null) {
                InterfaceC30683q0.c.a.a(favoritesFragment3, deepLink, null, 6);
                return;
            }
            return;
        }
        FavoritesFragment favoritesFragment4 = this.f157455Z;
        if (favoritesFragment4 != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment4, deepLink, null, 6);
        }
        CreateChannelLink createChannelLink = (CreateChannelLink) deepLink;
        this.f157469h.h0(createChannelLink.f133130b, contactSource, createChannelLink.f133132d, screenIdField, str2);
    }

    @Override // com.avito.android.favorites.InterfaceC30665h1.b
    public final void W1() {
        this.f157448S.b(io.reactivex.rxjava3.kotlin.A1.e(this.f157457b.e(), w.f157535l, new x()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.favorites.InterfaceC30665h1.b
    public final void X1() {
        this.f157486p0.dispose();
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            MenuItem menuItemA = x1Var.f157599c.a();
            this.f157486p0 = io.reactivex.rxjava3.kotlin.A1.h(menuItemA != null ? x1Var.f157603g.b(menuItemA) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b, null, new C(), 3);
        }
    }

    @Override // com.avito.android.favorites.InterfaceC30665h1.b
    public final void Y1() {
        this.f157448S.b(io.reactivex.rxjava3.kotlin.A1.d(this.f157457b.f().q(this.f157459c.e()).n(new t()), new u(), new v()));
    }

    @Override // com.avito.android.favorites.InterfaceC30665h1.b
    public final void Z1(@Y61.k RecyclerView recyclerView) {
        this.f157467g.b(recyclerView);
    }

    @Override // com.avito.android.favorites.compose.only_active_switch.j
    @Y61.k
    public final n2<Boolean> a() {
        return this.f157488q0;
    }

    @Override // com.avito.android.favorites.InterfaceC30665h1.b
    public final void a2() {
        this.f157448S.b(io.reactivex.rxjava3.kotlin.A1.d(this.f157457b.i().q(this.f157459c.e()).n(new q()), new r(), new s()));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void b(int i12, int i13, @Y61.k String str, int i14) {
        List<? extends FavoriteListItem> list = this.f157456a0;
        if (list == null) {
            return;
        }
        this.f157484o0.onNext(new CartItemQuantityChange.Default(str, i12, i13, i14));
        List<? extends FavoriteListItem> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (com.avito.conveyor_item.a aVarA : list2) {
            if ((aVarA instanceof FavoriteAdvertItem) && kotlin.jvm.internal.L.f(((FavoriteAdvertItem) aVarA).f156404b, str)) {
                FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVarA;
                Stepper stepper = favoriteAdvertItem.f156419q;
                aVarA = FavoriteAdvertItem.a(favoriteAdvertItem, stepper != null ? Stepper.a(stepper, i13, C49654a.a(i13, stepper.f116272c), 22) : null, null, -32769);
            }
            arrayList.add(aVarA);
        }
        this.f157456a0 = arrayList;
        O();
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void b0(@Y61.k ActivityC22955m activityC22955m) {
        this.f157448S.b(io.reactivex.rxjava3.kotlin.A1.h(new C41936b0(this.f157485p.b(activityC22955m, (4 & 2) == 0, (4 & 4) == 0).K(new R0(this)), new S0(this)).j0(this.f157459c.e()), new T0(this), new U0(this), 2));
    }

    @Override // com.avito.android.favorites.InterfaceC30665h1.b
    public final void b2() {
        this.f157448S.b(io.reactivex.rxjava3.kotlin.A1.e(this.f157457b.e(), o.f157527l, new p()));
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void c0() {
        this.f157455Z = null;
    }

    @Override // com.avito.android.favorites.InterfaceC30665h1.b
    /* renamed from: c2, reason: from getter */
    public final boolean getF157492s0() {
        return this.f157492s0;
    }

    @Override // rn0.InterfaceC47691c
    public final void d(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle, @Y61.l Boolean bool, @Y61.l String str) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            favoritesFragment.g(bundle, deepLink, str);
        }
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    @Y61.k
    public final Kundle d0() {
        this.f157473j.c(this.f157456a0);
        Kundle kundle = new Kundle();
        kundle.j(this.f157460c0, "order_state");
        kundle.j(this.f157458b0, "category_state");
        kundle.m("sync_completed_event_id", this.f157462d0);
        kundle.j(this.f157464e0, "show_only_active_favorites_switch_value");
        kundle.m(ChannelContext.Item.USER_ID, this.f157470h0);
        kundle.l("initial_item_changes", this.f157472i0);
        kundle.k("initial_cart_items_changes", this.f157478l0);
        kundle.j(this.f157474j0, "search_widget");
        kundle.m("searchQuery", this.f157498v0.getValue().f156881a);
        return kundle;
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void e(@Y61.k DeepLink deepLink) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, null, 6);
        }
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void e0() {
        this.f157448S.e();
        kotlinx.coroutines.Q0.d(this.f157449T.f411905b);
        io.reactivex.rxjava3.internal.observers.y yVar = this.f157453X;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        kotlinx.coroutines.N0 n02 = this.f157494t0;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(null);
        }
        this.f157494t0 = null;
        this.f157454Y = null;
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void e1(@Y61.l String str) {
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            x1Var.e();
        }
        x1 x1Var2 = this.f157454Y;
        if (x1Var2 != null) {
            InterfaceC30665h1.a.a(x1Var2, com.avito.android.printable_text.b.f(this.f157463e.f()), null, null, 6);
        }
        if (str != null) {
            this.f157487q.f(null, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // com.avito.android.favorites.adapter.error.c.a
    public final void g(@Y61.k Uri uri) {
        ?? arrayList;
        List<? extends FavoriteListItem> list = this.f157456a0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                FavoriteListItem favoriteListItem = (FavoriteListItem) obj;
                if (!(favoriteListItem instanceof FavoriteLoadingItem) && !(favoriteListItem instanceof FavoriteErrorItem) && !(favoriteListItem instanceof SkeletonFavoriteAdvertItem)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        this.f157456a0 = C42745f0.i0(new FavoriteLoadingItem(uri), (Collection) arrayList);
        O();
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void h(@Y61.k DeepLink deepLink) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, null, 6);
        }
    }

    @Override // com.avito.android.favorites.compose.only_active_switch.j
    public final void i() {
        ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo = this.f157464e0;
        if (showOnlyActiveFavoritesSwitchInfo != null) {
            boolean value = showOnlyActiveFavoritesSwitchInfo.getValue();
            InterfaceC30681p0 interfaceC30681p0 = this.f157457b;
            boolean z12 = !interfaceC30681p0.h(value);
            interfaceC30681p0.d(z12);
            this.f157490r0.setValue(Boolean.valueOf(z12));
            L(this, false, 7);
        }
    }

    @Override // com.avito.android.favorites.compose.only_active_switch.j
    public final void j() {
        this.f157488q0.setValue(Boolean.FALSE);
        this.f157477l.a("active_only_tooltip_onboarding", true);
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void j4() {
        io.reactivex.rxjava3.internal.operators.single.G g12 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC30668j(this, 2));
        InterfaceC35745a5 interfaceC35745a5 = this.f157459c;
        io.reactivex.rxjava3.internal.operators.single.S s5 = g12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e());
        F f12 = new F();
        final V2 v22 = V2.f318762a;
        this.f157448S.b(s5.x(f12, new l41.g() { // from class: com.avito.android.favorites.r0.G
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void l(@Y61.k FavoriteAdvertItem favoriteAdvertItem) {
        Object next;
        String str;
        this.f157491s.c(favoriteAdvertItem);
        Iterator<T> it = this.f157458b0.f156209e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CategoryChipable) next).f156200b == this.f157458b0.f156207c) {
                    break;
                }
            }
        }
        CategoryChipable categoryChipable = (CategoryChipable) next;
        boolean z12 = favoriteAdvertItem.f156394F;
        DeepLink deepLink = favoriteAdvertItem.f156415m;
        if (deepLink != null) {
            AdvertDetailsLink advertDetailsLink = deepLink instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLink : null;
            str = advertDetailsLink != null ? advertDetailsLink.f132948c : null;
        } else {
            str = null;
        }
        this.f157448S.b(io.reactivex.rxjava3.kotlin.A1.d(this.f157457b.c(favoriteAdvertItem.f156404b, z12, str, favoriteAdvertItem.f156396H, categoryChipable != null ? categoryChipable.f156203e : null).q(this.f157459c.e()), D.f157507l, new E(favoriteAdvertItem)));
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void mb(@Y61.k String str, @Y61.l String str2, boolean z12) {
        List<? extends FavoriteListItem> list;
        com.avito.conveyor_item.a aVarA;
        if (str.equals("pp_banner_confirmation_state")) {
            List<? extends FavoriteListItem> list2 = this.f157456a0;
            if (list2 == null) {
                return;
            }
            List<? extends FavoriteListItem> list3 = list2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (com.avito.conveyor_item.a aVarA2 : list3) {
                if (aVarA2 instanceof PromoBannerRecallWithDescriptionItem) {
                    aVarA2 = PromoBannerRecallWithDescriptionItem.a((PromoBannerRecallWithDescriptionItem) aVarA2, z12, false, 767);
                } else if (aVarA2 instanceof PromoBannerRecallWithBenefitsItem) {
                    aVarA2 = PromoBannerRecallWithBenefitsItem.a((PromoBannerRecallWithBenefitsItem) aVarA2, z12, false, 6143);
                }
                arrayList.add(aVarA2);
            }
            this.f157456a0 = arrayList;
            O();
            return;
        }
        if (!str.equals("pp_closed_state") || str2 == null || (list = this.f157456a0) == null) {
            return;
        }
        List<? extends FavoriteListItem> list4 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
        boolean z13 = false;
        for (com.avito.conveyor_item.a aVar : list4) {
            if (aVar instanceof PromoBannerRecallWithDescriptionItem) {
                if (kotlin.jvm.internal.L.f(((PromoBannerRecallWithDescriptionItem) aVar).f156760b, str2)) {
                    aVarA = PromoBannerRecallWithDescriptionItem.a((PromoBannerRecallWithDescriptionItem) aVar, false, z12, 511);
                    aVar = aVarA;
                    z13 = true;
                } else {
                    aVar = (PromoBannerRecallWithDescriptionItem) aVar;
                }
            } else if (aVar instanceof PromoBannerRecallWithBenefitsItem) {
                if (kotlin.jvm.internal.L.f(((PromoBannerRecallWithBenefitsItem) aVar).f156715b, str2)) {
                    aVarA = PromoBannerRecallWithBenefitsItem.a((PromoBannerRecallWithBenefitsItem) aVar, false, z12, 4095);
                    aVar = aVarA;
                    z13 = true;
                } else {
                    aVar = (PromoBannerRecallWithBenefitsItem) aVar;
                }
            }
            arrayList2.add(aVar);
        }
        this.f157456a0 = arrayList2;
        if (z13) {
            this.f157430A.a(str2);
        }
        O();
    }

    @Override // rn0.InterfaceC47691c
    public final void n(@Y61.k DeepLink deepLink) {
        M();
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, null, 6);
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void o(@Y61.k AutotekaPurchaseAction autotekaPurchaseAction) {
        AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParamsB = com.avito.android.autoteka.helpers.b.b(com.avito.android.autoteka.helpers.b.f96647a, autotekaPurchaseAction, FromBlock.f96092l, null);
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, autotekaChoosingPurchaseButtonParamsB.f97068b, null, 6);
        }
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void onCleared() {
        this.f157450U.e();
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void onPause() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f157482n0;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f157442M.onPause();
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void onResume() {
        ProgressInfoToastBarPresenter progressInfoToastBarPresenter = this.f157442M;
        progressInfoToastBarPresenter.onResume();
        this.f157482n0 = (io.reactivex.rxjava3.internal.observers.y) progressInfoToastBarPresenter.getF231563e().j0(this.f157459c.e()).v0(new V0(this), W0.f156335b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void p(@Y61.k DeepLink deepLink) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, C22777e.b(new kotlin.Q("related_products_bottom_sheet_deeplink_args", new RelatedProductsBottomSheetDeeplinkArgs(this.f157436G))), 2);
        }
    }

    @Override // rn0.InterfaceC47691c
    public final void q(@Y61.k DeepLink deepLink, @Y61.l Boolean bool) {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            InterfaceC30683q0.c.a.a(favoritesFragment, deepLink, null, 2);
        }
    }

    @Override // com.avito.android.favorites.compose.empty_favorites_global.g
    public final void r() {
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            com.avito.android.L l12 = favoritesFragment.f156238T0;
            if (l12 == null) {
                l12 = null;
            }
            favoritesFragment.startActivity(L.a.a(l12, null, 3));
        }
    }

    @Override // com.avito.android.favorites.compose.only_active_switch.j
    @Y61.k
    public final n2<Boolean> s() {
        return this.f157490r0;
    }

    @Override // com.avito.android.favorites.compose.search.y
    public final void t(@Y61.k String str) {
        com.avito.android.favorites.compose.search.f value;
        Z1<com.avito.android.favorites.compose.search.f> z12 = this.f157496u0;
        do {
            value = z12.getValue();
        } while (!z12.N3(value, com.avito.android.favorites.compose.search.f.a(value, str, null, false, null, null, null, 62)));
        if (str.length() > 0) {
            int length = str.length();
            FavoritesSearchWidget favoritesSearchWidget = this.f157474j0;
            if (length < (favoritesSearchWidget != null ? favoritesSearchWidget.getMinLength() : 3)) {
                return;
            }
        }
        FavoritesSearchWidget favoritesSearchWidget2 = this.f157474j0;
        K(favoritesSearchWidget2 != null ? Integer.valueOf(favoritesSearchWidget2.getSearchDelay()) : null, str, false);
    }

    @Override // com.avito.android.favorites.compose.search.y
    public final void u() {
        com.avito.android.favorites.compose.search.f value;
        Z1<com.avito.android.favorites.compose.search.f> z12 = this.f157496u0;
        do {
            value = z12.getValue();
        } while (!z12.N3(value, com.avito.android.favorites.compose.search.f.a(value, null, null, true, null, null, null, 59)));
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            x1Var.i(true);
        }
        this.f157469h.j0();
    }

    @Override // com.avito.android.favorites.compose.search.y
    @Y61.k
    public final n2<com.avito.android.favorites.compose.search.f> v() {
        return this.f157498v0;
    }

    @Override // com.avito.android.favorites.InterfaceC30683q0
    public final void w(boolean z12) {
        List<? extends FavoriteListItem> list = this.f157456a0;
        boolean z13 = list == null || list.isEmpty();
        com.avito.android.favorites.ux_feedback.b bVar = this.f157481n;
        bVar.b(!z13);
        bVar.c(z12);
        io.reactivex.rxjava3.disposables.c cVar = this.f157451V;
        if (!z12) {
            cVar.e();
            this.f157487q.g();
            return;
        }
        BK0.a<AbstractC30688d> aVar = this.f157468g0;
        aVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.M0 m02 = new io.reactivex.rxjava3.internal.operators.observable.M0(aVar);
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(m02.k0(AbstractC30688d.a.class), y.f157537l, new z(), 2));
        cVar.b(io.reactivex.rxjava3.kotlin.A1.h(m02.k0(AbstractC30688d.b.class).j0(this.f157459c.e()), A.f157504l, new B(), 2));
        cVar.b(m02.N0());
        FavoritesFragment favoritesFragment = this.f157455Z;
        if (favoritesFragment != null) {
            favoritesFragment.F5();
        }
    }

    @Override // com.avito.android.favorites.compose.search.y
    public final void x() {
        com.avito.android.favorites.compose.search.f value;
        Z1<com.avito.android.favorites.compose.search.f> z12 = this.f157496u0;
        do {
            value = z12.getValue();
        } while (!z12.N3(value, com.avito.android.favorites.compose.search.f.a(value, "", null, false, null, null, null, 58)));
        x1 x1Var = this.f157454Y;
        if (x1Var != null) {
            x1Var.i(false);
        }
        L(this, false, 6);
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void y(@Y61.k FavoriteAdvertItem favoriteAdvertItem, @Y61.l Image image) {
        DeepLink deepLink = favoriteAdvertItem.f156415m;
        if (deepLink == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("title", favoriteAdvertItem.f156405c);
        bundle.putParcelable("tree_parent", new TreeClickStreamParent(this.f157465f.a(), "FAVORITE_ITEMS", null, null));
        bundle.putString("key_category_id", String.valueOf(favoriteAdvertItem.f156413k));
        bundle.putLong("click_time", SystemClock.elapsedRealtime());
        bundle.putString("price", favoriteAdvertItem.f156406d);
        bundle.putBoolean("active", favoriteAdvertItem.f156411i);
        String str = favoriteAdvertItem.f156407e;
        if (str != null) {
            bundle.putString("old_price", str);
        }
        if (image != null) {
            bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
        }
        b.a.a(this.f157489r, deepLink, null, bundle, 2);
    }

    @Override // com.avito.android.favorites.compose.search.y
    public final void z() {
        FavoritesSearchWidget.NotFoundInfo notFoundInfo;
        DeepLink buttonDeepLink;
        FavoritesSearchWidget favoritesSearchWidget = this.f157474j0;
        if (favoritesSearchWidget == null || (notFoundInfo = favoritesSearchWidget.getNotFoundInfo()) == null || (buttonDeepLink = notFoundInfo.getButtonDeepLink()) == null) {
            return;
        }
        b.a.a(this.f157489r, buttonDeepLink, null, null, 6);
    }

    /* compiled from: FavoritesListPresenter.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/favorites/r0$e", "Lcom/avito/android/favorites/q0$b;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.r0$e, reason: case insensitive filesystem */
    public static final class C30689e implements InterfaceC30683q0.b {
        public C30689e() {
        }

        @Override // ob.InterfaceC44739c
        public final void C1(@Y61.k BannerInfo bannerInfo, int i12) {
            j.a.c(C30684r0.this.f157440K, bannerInfo, i12, null, 12);
        }

        @Override // ob.InterfaceC44739c
        public final void J4(@Y61.k BannerInfo bannerInfo, int i12) {
            j.a.b(C30684r0.this.f157440K, bannerInfo, i12);
        }

        @Override // com.avito.android.favorite.u
        public final void Ld(@Y61.k com.avito.android.serp.adapter.S s5, @Y61.l AbstractC30567a abstractC30567a) {
            C30684r0 c30684r0 = C30684r0.this;
            c30684r0.f157491s.b(s5.getF201958b(), s5.getF107475k());
            c30684r0.f157452W.accept(s5);
            c30684r0.f157448S.b(com.avito.android.util.rx3.S0.a(c30684r0.f157475k.g(s5.getF201958b(), abstractC30567a == null ? new AbstractC30567a.m(s5.getF73318b()) : abstractC30567a, s5.getF107475k(), s5.getF73319c(), null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : c30684r0.f157433D, (2016 & 1024) != 0)));
        }

        @Override // com.avito.android.serp.adapter.InterfaceC34863v
        public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
            Bundle bundle = new Bundle();
            bundle.putString("title", advertItem.f268428d);
            C30684r0 c30684r0 = C30684r0.this;
            bundle.putParcelable("tree_parent", new TreeClickStreamParent(c30684r0.f157465f.a(), "FAVORITE_ITEMS", null, null));
            bundle.putString("key_category_id", String.valueOf(advertItem.f268420a0));
            bundle.putLong("click_time", SystemClock.elapsedRealtime());
            bundle.putString("price", advertItem.f268440i);
            bundle.putBoolean("active", advertItem.f268376E);
            String str = advertItem.f268446l;
            if (str != null) {
                bundle.putString("old_price", str);
            }
            if (image != null) {
                bundle.putParcelable("image", new DimmedImage(image, null, 2, null));
            }
            b.a.a(c30684r0.f157489r, advertItem.f268396O, null, bundle, 2);
        }

        @Override // ob.InterfaceC44746j
        public final void A(@Y61.k String str) {
        }

        @Override // La.g
        public final void ic(@Y61.k String str) {
        }

        @Override // com.avito.android.serp.adapter.K
        public final void p9(@Y61.k DeepLink deepLink) {
        }

        @Override // com.avito.android.serp.adapter.constructor.q
        public final void i(@Y61.k DeepLink deepLink, @Y61.k String str) {
        }

        @Override // com.avito.android.serp.adapter.constructor.q
        public final void y(@Y61.k DeepLink deepLink, @Y61.k String str) {
        }
    }

    @Override // rn0.InterfaceC47692d
    public final void f(@Y61.k AvitoBlogArticleItem avitoBlogArticleItem) {
    }

    @Override // com.avito.android.async_phone.InterfaceC28615a
    public final void G(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.k ContactSource contactSource) {
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k com.avito.android.serp.adapter.S s5, @Y61.l AbstractC30567a abstractC30567a) {
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.a
    public final void Sa(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource) {
    }
}

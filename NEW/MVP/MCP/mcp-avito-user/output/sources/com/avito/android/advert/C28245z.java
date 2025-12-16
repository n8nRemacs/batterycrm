package com.avito.android.advert;

import Fc1.E0;
import W9.a;
import W9.b;
import Xq.C17037a;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.advert.AdvertDetailsToolbarAuthData;
import com.avito.android.advert.advert_details_style.b;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.analytics.toolbar.BackFromPage;
import com.avito.android.advert_core.ux_feedback.AdvertDetailsRemoteFeedbackEvent;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.authorization.AuthSource;
import com.avito.android.comparison.remote.model.FromPage;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertComparison;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.toggle_comparison_state.s;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35838l3;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.ux.feedback.remote.UxFeedbackConfig;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import mU.C44012a;
import ur.InterfaceC49101b;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/z;", "Lcom/avito/android/advert/x;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28245z implements InterfaceC28243x {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public Z0 f81075A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f81076B = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f81077C = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public AdvertDetails f81078D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public String f81079E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final C35792f5 f81080F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f81081G;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f81082a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.sharing.a f81083b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C44012a f81084c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.favorites.a f81085d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f81086e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f81087f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.toggle_comparison_state.l f81088g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C17037a f81089h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f81090i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f81091j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28240u f81092k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f81093l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C29640d f81094m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_apprater.g f81095n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final W9.c f81096o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f81097p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f81098q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f81099r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delayed_ux_feedback.d f81100s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C35838l3 f81101t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final B2 f81102u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.advert_details_popup.a f81103v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f81104w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_favorites_toast.a f81105x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final AD.a f81106y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public d0 f81107z;

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.toggle_comparison_state.a f81109m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.toggle_comparison_state.a aVar) {
            super(0);
            this.f81109m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a.a(C28245z.this.f81097p, this.f81109m.f301570c, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$b */
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f81111c;

        public b(String str) {
            this.f81111c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C28245z c28245z = C28245z.this;
            C44012a c44012a = c28245z.f81084c;
            AdvertDetails advertDetails = c28245z.f81078D;
            C44012a.a(c44012a, advertDetails != null ? advertDetails.getId() : null, this.f81111c, null, 4);
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$c */
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f81113c;

        public c(String str) {
            this.f81113c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C28245z c28245z = C28245z.this;
            Z0 z02 = c28245z.f81075A;
            if (z02 != null) {
                z02.g(null, new CartLink(c28245z.f81079E, this.f81113c), null);
            }
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.z$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<View> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            d0 d0Var = C28245z.this.f81107z;
            if (d0Var != null) {
                return d0Var.getView();
            }
            return null;
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "alpha", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<Float, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            d0 d0Var = C28245z.this.f81107z;
            if (d0Var != null) {
                d0Var.Bc(fFloatValue);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$f */
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f81116b;

        public f(d0 d0Var) {
            this.f81116b = d0Var;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f81116b.Ic(false);
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/toggle_comparison_state/s;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/toggle_comparison_state/s;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$g */
    public static final class g<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f81118c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdvertDetails f81119d;

        public g(d0 d0Var, AdvertDetails advertDetails) {
            this.f81118c = d0Var;
            this.f81119d = advertDetails;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.toggle_comparison_state.s sVar = (com.avito.android.toggle_comparison_state.s) obj;
            C28245z c28245z = C28245z.this;
            c28245z.getClass();
            boolean z12 = sVar instanceof s.a;
            d0 d0Var = this.f81118c;
            AdvertDetails advertDetails = this.f81119d;
            if (z12) {
                AdvertComparison comparison = advertDetails.getComparison();
                if (comparison != null) {
                    comparison.setAdded(Boolean.TRUE);
                }
                d0Var.Wc(true);
                c28245z.c(d0Var, ((s.a) sVar).f301632a.f301622a);
            } else if (sVar instanceof s.b) {
                c28245z.c(d0Var, ((s.b) sVar).f301634a.f301622a);
            } else if (sVar instanceof s.d) {
                AdvertComparison comparison2 = advertDetails.getComparison();
                if (comparison2 != null) {
                    comparison2.setAdded(Boolean.FALSE);
                }
                d0Var.Wc(false);
                c28245z.c(d0Var, ((s.d) sVar).f301639a);
            } else {
                if (!(sVar instanceof s.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th2 = ((s.c) sVar).f301637b;
                String message = th2.getMessage();
                InterfaceC28240u interfaceC28240u = c28245z.f81092k;
                if (message == null) {
                    message = interfaceC28240u.a();
                }
                d0Var.ad(message, interfaceC28240u.k(), th2, new A(c28245z, d0Var, advertDetails, sVar));
            }
            G0 g02 = G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$h */
    public static final class h<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f81121c;

        public h(d0 d0Var) {
            this.f81121c = d0Var;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C28245z.b(C28245z.this, this.f81121c, (Throwable) obj);
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFavorite", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$i */
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f81122b;

        public i(d0 d0Var) {
            this.f81122b = d0Var;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f81122b.setFavorite(((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.z$j */
    public static final class j<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f81124c;

        public j(d0 d0Var) {
            this.f81124c = d0Var;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C28245z.b(C28245z.this, this.f81124c, (Throwable) obj);
        }
    }

    @Inject
    public C28245z(@C27710t.InterfaceC2166t @Y61.l String str, @Y61.k com.avito.android.advert_core.analytics.sharing.a aVar, @Y61.k C44012a c44012a, @Y61.k com.avito.android.advert.favorites.a aVar2, @Y61.k com.avito.android.advert_collection_toast.b bVar, @Y61.k com.avito.android.advert.viewed.d dVar, @Y61.k com.avito.android.toggle_comparison_state.l lVar, @Y61.k C17037a c17037a, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28240u interfaceC28240u, @Y61.k com.avito.android.advert_core.analytics.a aVar3, @Y61.k C29640d c29640d, @Y61.k com.avito.android.favorite_apprater.g gVar, @Y61.k W9.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar4, @Y61.l @C27710t.v String str2, @Y61.k com.avito.android.account.E e12, @C27710t.w @Y61.l Kundle kundle, @Y61.k com.avito.android.delayed_ux_feedback.d dVar2, @Y61.k C35838l3 c35838l3, @Y61.k B2 b22, @Y61.k com.avito.android.advert.advert_details_popup.a aVar5, @Y61.k InterfaceC49101b interfaceC49101b, @Y61.k com.avito.android.advert_favorites_toast.a aVar6, @Y61.k AD.a aVar7) {
        List listE;
        this.f81082a = str;
        this.f81083b = aVar;
        this.f81084c = c44012a;
        this.f81085d = aVar2;
        this.f81086e = bVar;
        this.f81087f = dVar;
        this.f81088g = lVar;
        this.f81089h = c17037a;
        this.f81090i = interfaceC35741a1;
        this.f81091j = interfaceC35745a5;
        this.f81092k = interfaceC28240u;
        this.f81093l = aVar3;
        this.f81094m = c29640d;
        this.f81095n = gVar;
        this.f81096o = cVar;
        this.f81097p = aVar4;
        this.f81098q = str2;
        this.f81099r = e12;
        this.f81100s = dVar2;
        this.f81101t = c35838l3;
        this.f81102u = b22;
        this.f81103v = aVar5;
        this.f81104w = interfaceC49101b;
        this.f81105x = aVar6;
        this.f81106y = aVar7;
        this.f81080F = new C35792f5(str);
        this.f81081G = (kundle == null || (listE = kundle.e("AUTH_SUCCESS_DATA_STATE")) == null) ? new LinkedHashSet() : C42745f0.O0(listE);
    }

    public static final void b(C28245z c28245z, d0 d0Var, Throwable th2) {
        d0Var.Vc(InterfaceC35741a1.a.a(c28245z.f81090i, th2, null, null, 6), th2);
    }

    @Override // com.avito.android.advert.navbar.b
    public final void a(@Y61.l Long l12) {
        d0 d0Var = this.f81107z;
        if (d0Var != null) {
            d0Var.Ec(l12);
        }
    }

    public final void c(d0 d0Var, com.avito.android.toggle_comparison_state.a aVar) {
        String str = aVar.f301569b;
        int length = str.length();
        String str2 = aVar.f301568a;
        if (length == 0 && str2.length() == 0) {
            return;
        }
        d0Var.Yc(new a(aVar), str, str2);
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    public final void c0() {
        this.f81075A = null;
    }

    public final void d(AdvertDetailsStyle advertDetailsStyle, AdvertNavBarStyle advertNavBarStyle) {
        if (advertNavBarStyle != null) {
            d0 d0Var = this.f81107z;
            if (d0Var != null) {
                d0Var.Qc(advertNavBarStyle.getBackgroundColor(), advertNavBarStyle.getElementsColor(), advertNavBarStyle.getNavigationIcon());
                return;
            }
            return;
        }
        b.c.a aVar = com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle).f68634c.f68651c;
        d0 d0Var2 = this.f81107z;
        if (d0Var2 != null) {
            d0Var2.Cc(aVar.f68653a, aVar.f68654b);
        }
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("AUTH_SUCCESS_DATA_STATE", C42745f0.M0(this.f81081G));
        return kundle;
    }

    public final void e(d0 d0Var, AdvertDetails advertDetails, boolean z12) {
        Boolean boolIsAdded;
        if (!this.f81099r.b()) {
            Z0 z02 = this.f81075A;
            if (z02 != null) {
                AuthSource authSource = AuthSource.f92694c;
                z02.m(AdvertDetailsToolbarAuthData.ComparisonButton.f68532b, "cmp");
                return;
            }
            return;
        }
        String id2 = advertDetails.getId();
        String categoryId = advertDetails.getCategoryId();
        if (categoryId == null) {
            categoryId = "";
        }
        String str = categoryId;
        AdvertComparison comparison = advertDetails.getComparison();
        boolean zBooleanValue = (comparison == null || (boolIsAdded = comparison.isAdded()) == null) ? false : boolIsAdded.booleanValue();
        FromPage[] fromPageArr = FromPage.f124197b;
        new C42023v(this.f81088g.a(new com.avito.android.toggle_comparison_state.p(id2, str, this.f81082a, "item", zBooleanValue, z12)).s(this.f81091j.e()).j(new f(d0Var)), new E0(d0Var, 3)).x(new g(d0Var, advertDetails), new h(d0Var));
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    public final void e0() {
        this.f81076B.e();
        this.f81077C.e();
        this.f81107z = null;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public final void f(d0 d0Var, AdvertDetails advertDetails) {
        this.f81076B.b(this.f81085d.b(advertDetails.getId(), advertDetails.getIsFavorite()).s(this.f81091j.e()).x(new i(d0Var), new j(d0Var)));
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    public final void j0(@Y61.k Z0 z02) {
        this.f81075A = z02;
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    public final void k0(@Y61.l Parcelable parcelable) {
        if (parcelable instanceof AdvertDetailsToolbarAuthData) {
            this.f81081G.add(parcelable);
        }
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    public final void l0(@Y61.k InterfaceC31171n interfaceC31171n) {
        d0 d0Var = this.f81107z;
        if (d0Var != null) {
            d0Var.Ac(interfaceC31171n, this.f81104w.d());
        }
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    public final void m0(@Y61.k d0 d0Var, @Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.l AdvertNavBarStyle advertNavBarStyle) {
        this.f81107z = d0Var;
        d(advertDetailsStyle, advertNavBarStyle);
        d0 d0Var2 = this.f81107z;
        if (d0Var2 != null) {
            d0Var2.Kc(advertNavBarStyle != null ? advertNavBarStyle.getLogo() : null, new B(advertNavBarStyle, this));
        }
        this.f81077C.b(d0Var.Rc().j0(this.f81091j.e()).v0(new V(this, d0Var), W.f68575b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    @Y61.k
    public final com.avito.android.advert.navbar.c n0(@Y61.k com.avito.konveyor.a aVar) {
        return new com.avito.android.advert.navbar.c(new d(), C42745f0.U(Integer.valueOf(aVar.Y(com.avito.android.advert_details_items.price.realty.a.class)), Integer.valueOf(aVar.Y(com.avito.android.advert_details_items.price.redesigned.e.class)), Integer.valueOf(aVar.Y(com.avito.android.advert_details_items.price.a.class)), Integer.valueOf(aVar.Y(com.avito.android.advert_details_items.price.redesigned.a.class))), C42745f0.U(Integer.valueOf(aVar.Y(com.avito.android.advert_details_items.title.a.class)), Integer.valueOf(aVar.Y(com.avito.android.advert_details_items.title.restyle.a.class))), new e());
    }

    @Override // com.avito.android.advert.InterfaceC28243x
    public final void o0(boolean z12) {
        AdvertDetails advertDetails = this.f81078D;
        if (advertDetails != null) {
            this.f81093l.L4(advertDetails.getId(), z12, BackFromPage.f82882b);
            b.C1259b c1259b = b.C1259b.f17811b;
            UxFeedbackConfig uxFeedbackConfig = advertDetails.getUxFeedbackConfig();
            W9.c cVar = this.f81096o;
            cVar.a(c1259b, uxFeedbackConfig);
            AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
            cVar.b(new a.C1256a(adjustParameters != null ? adjustParameters.getVerticalAlias() : null, advertDetails, null));
            this.f81100s.ga(AdvertDetailsRemoteFeedbackEvent.f84398c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0350  */
    @Override // com.avito.android.advert.InterfaceC28243x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(@Y61.k com.avito.android.advert_details.AdvertDetailsStyle r17, @Y61.k com.avito.android.remote.model.AdvertDetails r18, @Y61.l java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.C28245z.p0(com.avito.android.advert_details.AdvertDetailsStyle, com.avito.android.remote.model.AdvertDetails, java.lang.String, boolean):void");
    }
}

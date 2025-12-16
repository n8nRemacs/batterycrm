package com.avito.android.extended_profile;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.C22777e;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import arrow.core.AbstractC23662a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.component.toast.util.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.extended_profile_widgets.adapter.base_info_ml.BaseInfoMlItem;
import com.avito.android.extended_profile_widgets.adapter.contact_bar.ContactBarItem;
import com.avito.android.extended_profile_widgets.adapter.floating_buy_block.FloatingBuyBlockWidgetItem;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.public_profile.ui.tab.TabItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.search.filter.InterfaceC34598u;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.O2;
import com.avito.android.util.P5;
import com.avito.android.util.y6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import fA.C40269b;
import fA.InterfaceC40265a;
import fA.InterfaceC40270c;
import gF.InterfaceC40577a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import ob.C44745i;

/* compiled from: ExtendedProfileMviView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/A;", "Lcom/avito/android/component/toast/util/g;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements com.avito.android.component.toast.util.g {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public BeduinView f149216A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f149217B;

    /* renamed from: C, reason: collision with root package name */
    public final ProfileSearchInputView f149218C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public Boolean f149219D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public Boolean f149220E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.n f149221F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final KE.a f149222G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.subscriptions_settings.j f149223H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final QH.b f149224I;

    /* renamed from: J, reason: collision with root package name */
    public final int f149225J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.b f149226K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C44745i f149227L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final MB.a f149228M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f149229N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final H2 f149230O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f149231P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public List<TabItem> f149232Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public SearchParams f149233R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f149234S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i f149235T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public Parcelable f149236U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public Integer f149237V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final d f149238W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f149239X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public cU.s f149240Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f149241Z;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileFragment f149242b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f149243c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final X f149244d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f149245e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f149246f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem>> f149247g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<TabPagerAdapter> f149248h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f149249i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem>> f149250j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_phone_dialog.c f149251k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31062w f149252l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40577a f149253m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34598u f149254n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f149255o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f149256p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c f149257q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f149258r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ZS.b f149259s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f149260t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Context f149261u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f149262v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Toolbar f149263w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final AvitoTabLayout f149264x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final ViewPager f149265y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final View f149266z;

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            A a12 = A.this;
            a12.f149231P = zBooleanValue;
            a12.e();
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<Object, G0> {
        public final void f(@Y61.k Object obj) {
            androidx.view.y f21241d;
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.g gVar;
            A a12 = (A) this.receiver;
            a12.getClass();
            if (!(obj instanceof InterfaceC40270c)) {
                boolean z12 = obj instanceof BeduinOneTimeEvent;
                return;
            }
            InterfaceC40270c interfaceC40270c = (InterfaceC40270c) obj;
            if (interfaceC40270c instanceof InterfaceC40270c.b) {
                for (String str : ((InterfaceC40270c.b) interfaceC40270c).f395745a) {
                    com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVar = a12.f149235T;
                    if (iVar != null && (gVar = iVar.f151395h) != null) {
                        int i12 = 0;
                        for (Object obj2 : (Iterable) gVar.f151385w) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            if (kotlin.jvm.internal.L.f(((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k) obj2).getId(), str)) {
                                com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.d dVar = gVar.f151383u;
                                if (dVar == null) {
                                    dVar = null;
                                }
                                dVar.notifyItemChanged(i12);
                            }
                            i12 = i13;
                        }
                    }
                }
                return;
            }
            boolean z13 = interfaceC40270c instanceof InterfaceC40270c.C11132c;
            ExtendedProfileFragment extendedProfileFragment = a12.f149242b;
            if (z13) {
                InterfaceC40270c.C11132c c11132c = (InterfaceC40270c.C11132c) interfaceC40270c;
                Intent intentA = a12.f149253m.a(c11132c.f395747b, c11132c.f395746a);
                intentA.setFlags(603979776);
                extendedProfileFragment.startActivity(intentA);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.h) {
                InterfaceC40270c.h hVar = (InterfaceC40270c.h) interfaceC40270c;
                Intent intentB = a12.f149254n.b(hVar.f395754a, (512 & 2) != 0 ? null : null, (512 & 4) != 0 ? null : null, (512 & 8) != 0 ? false : false, hVar.f395756c, (512 & 32) != 0 ? null : extendedProfileFragment.q5(), (512 & 64) != 0 ? null : null, (512 & 128) != 0 ? null : null, hVar.f395755b);
                if (extendedProfileFragment.q5() != null) {
                    extendedProfileFragment.C5(UpdateStatusCode.DialogButton.CONFIRM, intentB);
                    return;
                } else {
                    extendedProfileFragment.startActivityForResult(intentB, UpdateStatusCode.DialogButton.CONFIRM);
                    return;
                }
            }
            boolean z14 = interfaceC40270c instanceof InterfaceC40270c.i;
            InterfaceC35845m2 interfaceC35845m2 = a12.f149255o;
            if (z14) {
                InterfaceC40270c.i iVar2 = (InterfaceC40270c.i) interfaceC40270c;
                extendedProfileFragment.startActivity(Intent.createChooser(interfaceC35845m2.d(iVar2.f395758b, iVar2.f395757a), extendedProfileFragment.getString(R.string.extended_profile_share)));
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.p) {
                InterfaceC40270c.p pVar = (InterfaceC40270c.p) interfaceC40270c;
                MenuItem menuItemFindItem = a12.f149263w.getMenu().findItem(R.id.menu_share);
                if (menuItemFindItem == null) {
                    throw new IllegalArgumentException("Toolbar was not inflated");
                }
                menuItemFindItem.setVisible(pVar.f395767a);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.k) {
                InterfaceC40270c.k kVar = (InterfaceC40270c.k) interfaceC40270c;
                c.a.a(a12.f149246f, kVar.f395760a, 0, null, null, kVar.f395761b, kVar.f395762c, 62);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.j) {
                com.avito.android.extended_profile_ui_components.p pVar2 = com.avito.android.extended_profile_ui_components.p.f153373a;
                Throwable th2 = ((InterfaceC40270c.j) interfaceC40270c).f395759a;
                pVar2.getClass();
                com.avito.android.extended_profile_ui_components.j jVarA = com.avito.android.extended_profile_ui_components.p.a(a12.f149256p.o(new AbstractC23662a.b(th2)).f90898b, th2);
                ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                f.c.f125255c.getClass();
                c.a.a(a12.f149246f, jVarA.f153349a, 0, null, null, toastBarPosition, f.c.a.a(null, th2), 42);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.a) {
                if (extendedProfileFragment.q5() != null) {
                    extendedProfileFragment.r5();
                    return;
                }
                ActivityC22955m activityC22955mL1 = extendedProfileFragment.l1();
                if (activityC22955mL1 == null || (f21241d = activityC22955mL1.getF21241d()) == null) {
                    return;
                }
                f21241d.c();
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.g) {
                extendedProfileFragment.startActivity(interfaceC35845m2.a());
                return;
            }
            boolean z15 = interfaceC40270c instanceof InterfaceC40270c.e;
            InterfaceC31062w interfaceC31062w = a12.f149252l;
            if (z15) {
                InterfaceC40270c.e eVar = (InterfaceC40270c.e) interfaceC40270c;
                interfaceC31062w.y1(eVar.f395749a.f283232g, eVar.f395750b, null, null);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.f) {
                InterfaceC40270c.f fVar = (InterfaceC40270c.f) interfaceC40270c;
                interfaceC31062w.o1(null, fVar.f395752b, fVar.f395751a, null);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.o) {
                a12.g(((InterfaceC40270c.o) interfaceC40270c).f395766a);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.l) {
                ru.avito.component.dialog.c cVar = ru.avito.component.dialog.c.f430348a;
                C c12 = new C(a12);
                cVar.getClass();
                ru.avito.component.dialog.c.a(a12.f149261u, c12);
                return;
            }
            if (interfaceC40270c instanceof InterfaceC40270c.m) {
                a12.f149244d.accept(new InterfaceC40047a.e(((InterfaceC40270c.m) interfaceC40270c).f395764a, a12.f149259s));
            } else if (interfaceC40270c instanceof InterfaceC40270c.n) {
                a12.f();
            } else if (interfaceC40270c instanceof InterfaceC40270c.d) {
                extendedProfileFragment.getParentFragmentManager().o0(C22777e.b(new kotlin.Q("extended_profile_tabs_result_bundle_navigation_deeplink", ((InterfaceC40270c.d) interfaceC40270c).f395748a)), "extended_profile_tab_result");
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj) {
            f(obj);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.l<C40269b, G0> {
        /* JADX WARN: Removed duplicated region for block: B:114:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x021a  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(fA.C40269b r22) {
            /*
                Method dump skipped, instructions count: 849
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.A.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile/A$d", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends RecyclerView.r {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            A.this.e();
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            A.this.f149244d.accept(new InterfaceC40265a.l(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            RecyclerView recyclerViewA;
            Boolean bool2 = bool;
            boolean zBooleanValue = bool2.booleanValue();
            A a12 = A.this;
            if (!kotlin.jvm.internal.L.f(a12.f149220E, bool2)) {
                a12.f149220E = bool2;
                a12.f149226K.f151354b = (zBooleanValue || kotlin.jvm.internal.L.f(a12.f149219D, Boolean.TRUE)) ? Integer.valueOf(a12.f149225J) : null;
                BeduinView beduinView = a12.f149216A;
                if (beduinView != null && (recyclerViewA = CA.b.a(beduinView)) != null) {
                    C35976x4.b(recyclerViewA);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            A.this.f149244d.accept(new InterfaceC40265a.i(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            RecyclerView recyclerViewA;
            Boolean bool2 = bool;
            boolean zBooleanValue = bool2.booleanValue();
            A a12 = A.this;
            if (!kotlin.jvm.internal.L.f(a12.f149219D, bool2)) {
                a12.f149219D = bool2;
                a12.f149226K.f151354b = (zBooleanValue || kotlin.jvm.internal.L.f(a12.f149220E, Boolean.TRUE)) ? Integer.valueOf(a12.f149225J) : null;
                BeduinView beduinView = a12.f149216A;
                if (beduinView != null && (recyclerViewA = CA.b.a(beduinView)) != null) {
                    C35976x4.b(recyclerViewA);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileMviView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            A.this.f149244d.accept(new InterfaceC40265a.C40268d(false));
            return G0.f406611a;
        }
    }

    public A(@Y61.k ExtendedProfileFragment extendedProfileFragment, @Y61.k View view, @Y61.k X x12, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.component.toast.util.c cVar, @Y61.k gD.f fVar, int i12, @Y61.k QH.b bVar, @Y61.k h31.e<com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem>> eVar, @Y61.k h31.e<TabPagerAdapter> eVar2, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k h31.e<com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem>> eVar3, @Y61.k com.avito.android.extended_profile_phone_dialog.c cVar2, @Y61.k InterfaceC31062w interfaceC31062w, @Y61.k InterfaceC40577a interfaceC40577a, @Y61.k InterfaceC34598u interfaceC34598u, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c cVar3, @Y61.k com.avito.konveyor.a aVar2, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar2, @Y61.k ZS.b bVar3, @Y61.k com.avito.beduin.v2.engine.component.B b12) {
        this.f149242b = extendedProfileFragment;
        this.f149243c = view;
        this.f149244d = x12;
        this.f149245e = interfaceC22983P;
        this.f149246f = cVar;
        this.f149247g = eVar;
        this.f149248h = eVar2;
        this.f149249i = aVar;
        this.f149250j = eVar3;
        this.f149251k = cVar2;
        this.f149252l = interfaceC31062w;
        this.f149253m = interfaceC40577a;
        this.f149254n = interfaceC34598u;
        this.f149255o = interfaceC35845m2;
        this.f149256p = screenPerformanceTracker;
        this.f149257q = cVar3;
        this.f149258r = bVar2;
        this.f149259s = bVar3;
        this.f149260t = b12;
        this.f149261u = view.getContext();
        View viewFindViewById = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f149262v = swipeRefreshLayout;
        View viewFindViewById2 = view.findViewById(R.id.toolbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById2;
        this.f149263w = toolbar;
        View viewFindViewById3 = view.findViewById(R.id.adverts_tabs);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.AvitoTabLayout");
        }
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) viewFindViewById3;
        this.f149264x = avitoTabLayout;
        View viewFindViewById4 = view.findViewById(R.id.adverts_viewpager);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        ViewPager viewPager = (ViewPager) viewFindViewById4;
        this.f149265y = viewPager;
        View viewFindViewById5 = view.findViewById(R.id.adverts_tabs_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f149266z = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.extended_profile_content_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f149217B = (FrameLayout) viewFindViewById6;
        ProfileSearchInputView profileSearchInputView = (ProfileSearchInputView) view.findViewById(R.id.extended_profile_top_search_bar);
        this.f149218C = profileSearchInputView;
        this.f149221F = new com.avito.android.extended_profile_ui_components.n(view, new g(), new h());
        this.f149222G = new KE.a(view, new e(), new f());
        com.avito.android.subscriptions_settings.j jVar2 = new com.avito.android.subscriptions_settings.j(view.getContext(), screenPerformanceTracker);
        this.f149223H = jVar2;
        this.f149224I = bVar;
        int iD2 = com.avito.android.actions_sheet.a.d(view, R.dimen.extended_profile_horizontal_margin);
        int iD3 = com.avito.android.actions_sheet.a.d(view, R.dimen.extended_profile_grid_adverts_horizontal_margin);
        this.f149225J = y6.b(132);
        this.f149226K = new com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.b();
        this.f149227L = new C44745i(iD2);
        this.f149228M = new MB.a(aVar2, i12, iD2, iD3);
        this.f149229N = new com.avito.android.extended_profile_ui_components.l(new i(), view);
        this.f149232Q = C42784z0.f406748b;
        this.f149238W = new d();
        kotlin.reflect.n<Object> nVar = gD.f.f396389r[7];
        this.f149239X = ((Boolean) fVar.f396396h.a().invoke()).booleanValue();
        new GridLayoutManager(i12, 1).f53667M = bVar;
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new C30487z(this));
        swipeRefreshLayout.setOnChildScrollUpCallback(new C30487z(this));
        toolbar.m(R.menu.extended_profile_menu);
        P5.f(toolbar, R.attr.black);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.avito.android.extended_profile.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f150539b.f149244d.accept(InterfaceC40265a.h.f395722a);
            }
        });
        profileSearchInputView.setAdapter(jVar);
        profileSearchInputView.setSuggestsEnabled(true);
        C43175k.K(new C43197r1(new H(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.g())), C22981N.a(interfaceC22983P.getLifecycle()));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new I(this, null), C43175k.r(kotlinx.coroutines.rx3.y.a(profileSearchInputView.h()))));
        C43175k.K(new C43197r1(new J(this, null), kotlinx.coroutines.rx3.y.a(profileSearchInputView.f153404v)), C22981N.a(interfaceC22983P.getLifecycle()));
        com.avito.android.lib.design.tab_layout.util.b.a(viewPager, avitoTabLayout);
        viewPager.c(new G(this));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new D(this, null), jVar2.f291542q));
        com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983P, new C43197r1(new E(this, null), jVar2.f291543r));
        C43175k.K(new C43197r1(new F(this, null), jVar2.f291544s), C22981N.a(interfaceC22983P.getLifecycle()));
        cVar.d(jVar2);
        C43175k.K(new C43197r1(new V(this, null), C43175k.N(new S(kotlinx.coroutines.rx3.y.a(interfaceC31062w.getF172393J()), this), new T(kotlinx.coroutines.rx3.y.a(interfaceC31062w.getF172392I())), new U(kotlinx.coroutines.rx3.y.a(interfaceC31062w.getF172395L())))), C22981N.a(interfaceC22983P.getLifecycle()));
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.menu_share);
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Toolbar was not inflated");
        }
        com.avito.android.ui.d.a(menuItemFindItem, new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.extended_profile.v
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f150536b.f149244d.accept(InterfaceC40265a.r.f395732a);
                return true;
            }
        });
        this.f149230O = K2.b(view, new a());
        com.avito.android.arch.mvi.android.f.a(x12, extendedProfileFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, new b(1, this, A.class, "handleOneTimeEvent", "handleOneTimeEvent(Ljava/lang/Object;)V", 0), new c(1, this, A.class, "render", "render(Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileCombinedState;)V", 0));
    }

    @Override // com.avito.android.component.toast.util.g
    public final void a(@Y61.k PrintableText printableText, int i12, @Y61.l String str, @Y61.l Y41.a aVar, @Y61.k ToastBarPosition toastBarPosition, @Y61.k com.avito.android.component.toast.f fVar) {
        com.avito.android.component.toast.c.e(com.avito.android.component.toast.c.f125244a, this.f149243c, i12 != 0 ? com.avito.android.printable_text.b.c(i12, new Serializable[0]) : printableText, null, (str == null || aVar == null) ? C42784z0.f406748b : Collections.singletonList(new c.a.C3719a(str, true, null, new P(aVar), 4, null)), null, fVar, 2750, toastBarPosition, false, false, null, null, this.f149256p, 3978);
    }

    public final void b() {
        View view = this.f149266z;
        if (view.getVisibility() == 0) {
            D6.w(view);
            if (O2.a(this.f149232Q)) {
                C42784z0 c42784z0 = C42784z0.f406748b;
                this.f149232Q = c42784z0;
                this.f149250j.get().E5(c42784z0);
                this.f149248h.get().h();
                this.f149247g.get().d();
            }
        }
    }

    public final void c() {
        this.f149221F.b();
        this.f149222G.b();
        b();
        this.f149262v.setRefreshing(false);
        D6.w(this.f149216A);
    }

    public final void d(boolean z12) {
        if (this.f149239X) {
            ExtendedProfileFragment extendedProfileFragment = this.f149242b;
            if (!extendedProfileFragment.isAdded() || extendedProfileFragment.isDetached() || extendedProfileFragment.getView() == null || !extendedProfileFragment.getViewLifecycleOwner().getLifecycle().getF46705d().a(Lifecycle.State.f46682e)) {
                return;
            }
            extendedProfileFragment.getParentFragmentManager().o0(C22777e.b(new kotlin.Q("extended_profile_tabs_result_bundle_floating_buttons", Boolean.valueOf(z12))), "extended_profile_tab_floating_buttons_result");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        RecyclerView recyclerViewA;
        FloatingBuyBlockWidgetItem floatingBuyBlockWidgetItem;
        kotlin.Q q12;
        Object next;
        BeduinView beduinView = this.f149216A;
        if (beduinView == null || (recyclerViewA = CA.b.a(beduinView)) == null) {
            return;
        }
        RecyclerView.m layoutManager = recyclerViewA.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        com.avito.android.extended_profile.data.b bVar = this.f149244d.getState().getValue().f395742a.f150240b;
        List<QH.a> listB = bVar != null ? bVar.b() : null;
        if (listB != null) {
            Iterator<T> it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next instanceof FloatingBuyBlockWidgetItem) {
                        break;
                    }
                }
            }
            if (!(next instanceof FloatingBuyBlockWidgetItem)) {
                next = null;
            }
            floatingBuyBlockWidgetItem = (FloatingBuyBlockWidgetItem) next;
        } else {
            floatingBuyBlockWidgetItem = null;
        }
        KE.a aVar = this.f149222G;
        com.avito.android.extended_profile_ui_components.n nVar = this.f149221F;
        if (floatingBuyBlockWidgetItem != null) {
            if (this.f149231P) {
                aVar.b();
            } else {
                aVar.a();
            }
            nVar.b();
            d(true);
            return;
        }
        aVar.b();
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVar = this.f149235T;
        List<com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k> listO = iVar != null ? iVar.o() : null;
        if (listO == null) {
            listO = C42784z0.f406748b;
        }
        Iterator<com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k> it2 = listO.iterator();
        boolean zBooleanValue = false;
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            }
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k next2 = it2.next();
            if ((next2 instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u) && (((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u) next2).f151421a instanceof ContactBarItem)) {
                break;
            } else {
                i12++;
            }
        }
        Iterator<com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k> it3 = listO.iterator();
        int i13 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i13 = -1;
                break;
            }
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.k next3 = it3.next();
            if ((next3 instanceof com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u) && (((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.u) next3).f151421a instanceof BaseInfoMlItem)) {
                break;
            } else {
                i13++;
            }
        }
        if (i12 > -1) {
            RecyclerView.C cQ2 = recyclerViewA.Q(i12, false);
            com.avito.android.extended_profile_widgets.adapter.contact_bar.f fVar = cQ2 instanceof com.avito.android.extended_profile_widgets.adapter.contact_bar.f ? (com.avito.android.extended_profile_widgets.adapter.contact_bar.f) cQ2 : null;
            q12 = new kotlin.Q(Integer.valueOf(i12), Integer.valueOf(fVar != null ? fVar.Jb() : 0));
        } else if (i13 > -1) {
            RecyclerView.C cQ3 = recyclerViewA.Q(i13, false);
            com.avito.android.extended_profile_widgets.adapter.base_info_ml.j jVar = cQ3 instanceof com.avito.android.extended_profile_widgets.adapter.base_info_ml.j ? (com.avito.android.extended_profile_widgets.adapter.base_info_ml.j) cQ3 : null;
            q12 = new kotlin.Q(Integer.valueOf(i13), Integer.valueOf(jVar != null ? jVar.Jb() : 0));
        } else {
            q12 = new kotlin.Q(null, 0);
        }
        Integer num = (Integer) q12.f406619b;
        int iIntValue = ((Number) q12.f406620c).intValue();
        Integer num2 = num == null ? this.f149237V : num;
        if (num != null) {
            this.f149237V = num2;
        }
        int iK1 = linearLayoutManager.K1();
        if (num2 == null || this.f149231P) {
            nVar.b();
        } else if (iK1 > num2.intValue()) {
            nVar.a();
            Boolean bool = nVar.f153369e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (iK1 != num2.intValue() || iIntValue >= 1) {
            Boolean bool2 = nVar.f153369e;
            Boolean bool3 = Boolean.FALSE;
            if (!kotlin.jvm.internal.L.f(bool2, bool3)) {
                nVar.f153369e = bool3;
                ((h) nVar.f153366b).invoke(bool3);
                A0 a0A = C22823h0.a(nVar.f153367c);
                a0A.g(y6.e(com.avito.android.extended_profile_ui_components.o.f153371a));
                a0A.c(100L);
                a0A.d(new LinearInterpolator());
                a0A.h(new com.avito.android.extended_profile_ui_components.m(nVar, 0));
                a0A.f();
            }
        } else {
            nVar.a();
            Boolean bool4 = nVar.f153369e;
            if (bool4 != null) {
                zBooleanValue = bool4.booleanValue();
            }
        }
        d(zBooleanValue);
    }

    public final void f() {
        C40269b value = this.f149244d.getState().getValue();
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVar = this.f149235T;
        if (iVar != null) {
            com.avito.android.extended_profile.data.b bVar = value.f395742a.f150240b;
            List<com.avito.android.extended_profile.data.g> list = bVar != null ? bVar.f149466a : null;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            RunnableC28882d runnableC28882d = new RunnableC28882d(4, this, value);
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.g gVar = iVar.f151395h;
            if (gVar != null) {
                gVar.f151384v = list;
                gVar.u(runnableC28882d);
                gVar.f151386x = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.List<? extends QH.a> r19) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.A.g(java.util.List):void");
    }
}

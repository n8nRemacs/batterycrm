package com.avito.android.shortcut_navigation_bar;

import Aw0.InterfaceC13094a;
import Jd0.C14188a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23494e;
import androidx.transition.C23503n;
import cU0.InterfaceC27108f;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC30265q;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.lib.design.tab_layout.c;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.SellerElement;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.Tab;
import com.avito.android.remote.model.search.TabsConfig;
import com.avito.android.remote.model.search.TopWidget;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.adapter.ClarifyButtonItem;
import com.avito.android.shortcut_navigation_bar.adapter.CollapsedShortcutItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItemImpl;
import com.avito.android.shortcut_navigation_bar.adapter.skeleton.ScrollLinearLayoutManager;
import com.avito.android.shortcut_navigation_bar.analytics.InlineFiltersGeo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.U2;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import iw.C42120a;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import yw0.InterfaceC50315a;
import zw0.C50639c;
import zw0.InterfaceC50637a;

/* compiled from: ShortcutNavigationBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/p;", "Lcom/avito/android/shortcut_navigation_bar/m;", "Lyw0/a;", "b", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C34999p implements InterfaceC34996m, InterfaceC50315a {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final View f283446A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f283447B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final View f283448C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f283449D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.beduin_v2.feature.item.a f283450E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.tab_layout.c f283451F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final TabGroup f283452G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.design.tab_layout.c f283453H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Chips f283454I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final View f283455J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f283456K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final View f283457L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final Group f283458M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final TextView f283459N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final ImageView f283460O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final View f283461P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final View f283462Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final View f283463R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final View f283464S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f283465T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f283466U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f283467V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f283468W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public Object f283469X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.d f283470Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f283471Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final ScrollLinearLayoutManager f283472a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f283473b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final C43238h f283474b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.util.text.a f283475c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ShortcutNavigationItem> f283476c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.onboarding_manager.a f283477d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<z0> f283478d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f283479e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InlineFiltersGeo> f283480e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.onboarding_manager.e f283481f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f283482f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f283483g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final e2 f283484g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final b f283485h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final androidx.transition.T f283486h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.feature.item.b f283487i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final androidx.transition.T f283488i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f283489j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final ClarifyButtonItem f283490j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13094a f283491k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f283492k0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f283493l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f283494l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Y41.a<View> f283495m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final g f283496m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final View f283497n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z f283498o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27108f f283499p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f283500q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Rect f283501r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f283502s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C34989f f283503t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C34995l f283504u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final TextView f283505v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final View f283506w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final Input f283507x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final TextView f283508y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final View f283509z;

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/shortcut_navigation_bar/p$a", "Lcom/avito/android/recycler/data_aware/a;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$a */
    public static final class a implements com.avito.android.recycler.data_aware.a {
        @Override // com.avito.android.recycler.data_aware.a
        @Y61.l
        public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
            boolean z12;
            if (kotlin.jvm.internal.L.f(aVar != null ? Long.valueOf(aVar.getF78300d()) : null, aVar2 != null ? Long.valueOf(aVar2.getF78300d()) : null) && (aVar instanceof CollapsedShortcutItem) && (aVar2 instanceof CollapsedShortcutItem) && (z12 = ((CollapsedShortcutItem) aVar2).f283222p) != ((CollapsedShortcutItem) aVar).f283222p) {
                return new C34984a(z12);
            }
            return null;
        }
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/p$b;", "", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$b */
    public interface b {
        @Y61.l
        Integer a();

        @Y61.l
        Integer b();

        @Y61.l
        Integer c();

        @Y61.l
        Integer d();

        @Y61.l
        Integer e();

        @Y61.l
        Integer m();
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f283510a;

        static {
            int[] iArr = new int[TabsConfig.Style.values().length];
            try {
                iArr[TabsConfig.Style.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TabsConfig.Style.Chips.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TabsConfig.Style.WithBottomLineLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f283510a = iArr;
        }
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f283512m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12) {
            super(0);
            this.f283512m = z12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.l<? super Boolean, G0> lVar = C34999p.this.f283492k0;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(this.f283512m));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chip", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<com.avito.android.lib.design.chips.h, Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<z0> f283516m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<z0> list) {
            super(2);
            this.f283516m = list;
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.chips.h hVar, Boolean bool) {
            int i12;
            com.avito.android.lib.design.chips.h hVar2 = hVar;
            bool.booleanValue();
            Object obj = null;
            ItemChipable itemChipable = hVar2 instanceof ItemChipable ? (ItemChipable) hVar2 : null;
            if (itemChipable != null) {
                C34999p c34999p = C34999p.this;
                c34999p.f283454I.N0(hVar2);
                List<z0> list = this.f283516m;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    i12 = itemChipable.f178762b;
                    if (!zHasNext) {
                        break;
                    }
                    z0 z0Var = (z0) it.next();
                    arrayList.add(new z0(z0Var.f283593b, z0Var.f283594c, ((int) z0Var.getF78300d()) == i12, z0Var.f283596e, z0Var.f283597f, z0Var.f283598g, z0Var.f283599h));
                }
                c34999p.f283454I.setState(c34999p.c(arrayList));
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((int) ((z0) next).getF78300d()) == i12) {
                        obj = next;
                        break;
                    }
                }
                z0 z0Var2 = (z0) obj;
                if (z0Var2 != null) {
                    c34999p.f283478d0.accept(z0Var2);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/shortcut_navigation_bar/p$g", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$g */
    public static final class g implements com.avito.android.lib.design.tab_group.layout.b {
        public g() {
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@Y61.l d.c cVar) {
            if (cVar != null) {
                int i12 = cVar.f180792b;
                Y41.l<? super Integer, G0> lVar = C34999p.this.f283494l0;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i12));
                }
            }
        }
    }

    /* compiled from: Views.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$h */
    public static final class h implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f283518b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C34999p f283519c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TopWidget f283520d;

        public h(View view, C34999p c34999p, TopWidget topWidget) {
            this.f283518b = view;
            this.f283519c = c34999p;
            this.f283520d = topWidget;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            C34999p c34999p = this.f283519c;
            InterfaceC13094a interfaceC13094a = c34999p.f283491k;
            FrameLayout frameLayout = c34999p.f283449D;
            int measuredHeight = frameLayout.getMeasuredHeight();
            TopWidget topWidget = this.f283520d;
            interfaceC13094a.c(measuredHeight, topWidget != null ? topWidget.getMarginBottom() : null);
            frameLayout.setMinimumHeight(0);
            this.f283518b.removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ OnboardingType f283522m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Filter.Onboarding f283523n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283524o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283525p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283526q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(OnboardingType onboardingType, Filter.Onboarding onboarding, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
            super(0);
            this.f283522m = onboardingType;
            this.f283523n = onboarding;
            this.f283524o = aVar;
            this.f283525p = aVar2;
            this.f283526q = aVar3;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Filter.Onboarding onboarding = this.f283523n;
            Y41.a<G0> aVar = this.f283524o;
            Y41.a<G0> aVar2 = this.f283525p;
            Y41.a<G0> aVar3 = this.f283526q;
            C34999p c34999p = C34999p.this;
            c34999p.j("big_filters_onboarding_id", this.f283522m, new A(c34999p, onboarding, aVar, aVar2, aVar3));
            return G0.f406611a;
        }
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f283528m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Filter.Onboarding f283529n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ OnboardingType f283530o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f283531p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283532q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283533r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283534s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, Filter.Onboarding onboarding, OnboardingType onboardingType, boolean z12, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
            super(0);
            this.f283528m = str;
            this.f283529n = onboarding;
            this.f283530o = onboardingType;
            this.f283531p = z12;
            this.f283532q = aVar;
            this.f283533r = aVar2;
            this.f283534s = aVar3;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Object next;
            View viewZ;
            OnboardingType onboardingType = this.f283530o;
            C34999p c34999p = C34999p.this;
            if (c34999p.l("inline_filters_target_tap_onboarding", onboardingType)) {
                RecyclerView recyclerView = c34999p.f283447B;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                int i12 = 0;
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                l0.f fVar = new l0.f();
                fVar.f406840b = -1;
                Iterator it = ((Iterable) c34999p.f283469X).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ShortcutNavigationItem shortcutNavigationItem = (ShortcutNavigationItem) next;
                    InlineFilterNavigationItem inlineFilterNavigationItem = shortcutNavigationItem instanceof InlineFilterNavigationItem ? (InlineFilterNavigationItem) shortcutNavigationItem : null;
                    String str = inlineFilterNavigationItem != null ? inlineFilterNavigationItem.f283228c : null;
                    String str2 = this.f283528m;
                    if (kotlin.jvm.internal.L.f(str, str2)) {
                        break;
                    }
                    ShortcutNavigationItemImpl shortcutNavigationItemImpl = shortcutNavigationItem instanceof ShortcutNavigationItemImpl ? (ShortcutNavigationItemImpl) shortcutNavigationItem : null;
                    if (kotlin.jvm.internal.L.f(shortcutNavigationItemImpl != null ? shortcutNavigationItemImpl.f283246e : null, str2)) {
                        break;
                    }
                }
                ShortcutNavigationItem shortcutNavigationItem2 = (ShortcutNavigationItem) next;
                Long lValueOf = shortcutNavigationItem2 != null ? Long.valueOf(shortcutNavigationItem2.getF78300d()) : null;
                while (true) {
                    if (i12 >= itemCount) {
                        break;
                    }
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    if (kotlin.jvm.internal.L.f(adapter2 != null ? Long.valueOf(adapter2.getItemId(i12)) : null, lValueOf)) {
                        fVar.f406840b = i12;
                        break;
                    }
                    i12++;
                }
                if (fVar.f406840b != -1) {
                    Y41.a<G0> aVar = this.f283532q;
                    Filter.Onboarding onboarding = this.f283529n;
                    C35003u c35003u = new C35003u(aVar, c34999p, onboarding);
                    C35002t c35002t = new C35002t(this.f283531p, c34999p, fVar, this.f283533r);
                    RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    kotlin.ranges.l lVar = new kotlin.ranges.l(linearLayoutManager != null ? linearLayoutManager.H1() : -1, linearLayoutManager != null ? linearLayoutManager.L1() : -1, 1);
                    boolean zH2 = lVar.h(fVar.f406840b);
                    Y41.a<G0> aVar2 = this.f283534s;
                    if (zH2) {
                        int i13 = fVar.f406840b;
                        RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 != null && (viewZ = layoutManager2.Z(i13)) != null) {
                            c34999p.j("inline_filters_target_tap_onboarding", onboardingType, new C35004v(viewZ, onboarding, c35002t, c35003u, aVar2));
                        }
                    } else {
                        recyclerView.F0(fVar.f406840b);
                        recyclerView.o(new C35001s(lVar, fVar, c34999p, onboarding, onboardingType, c35003u, c35002t, aVar2));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C34999p f283535l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f283536m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Y41.a aVar, C34999p c34999p) {
            super(0);
            this.f283535l = c34999p;
            this.f283536m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            OnboardingType onboardingType = OnboardingType.f209409b;
            Y41.a<G0> aVar = this.f283536m;
            C34999p c34999p = this.f283535l;
            c34999p.j("on_result_onboarding", onboardingType, new L(aVar, c34999p));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34999p(@Y61.k View view, @Y61.l com.avito.android.util.text.a aVar, @Y61.l com.avito.android.onboarding_manager.a aVar2, @Y61.k FragmentManager fragmentManager, @Y61.l com.avito.android.onboarding_manager.e eVar, @Y61.k com.avito.android.onboarding_manager.f fVar, @Y61.l b bVar, @Y61.k com.avito.android.lib.beduin_v2.feature.item.b bVar2, @Y61.k Screen screen, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC13094a interfaceC13094a, boolean z12, @Y61.l Y41.a<? extends View> aVar3, @Y61.l View view2, @Y61.k com.avito.beduin.v2.engine.component.z zVar, @Y61.k InterfaceC27108f interfaceC27108f, @Y61.k C36135w2 c36135w2) throws Resources.NotFoundException, BlueprintCollisionException {
        Integer numC;
        Integer numB;
        Integer numE;
        Integer numD;
        Integer numA;
        this.f283473b = view;
        this.f283475c = aVar;
        this.f283477d = aVar2;
        this.f283479e = fragmentManager;
        this.f283481f = eVar;
        this.f283483g = fVar;
        this.f283485h = bVar;
        this.f283487i = bVar2;
        this.f283489j = screenPerformanceTracker;
        this.f283491k = interfaceC13094a;
        this.f283493l = z12;
        this.f283495m = aVar3;
        this.f283497n = view2;
        this.f283498o = zVar;
        this.f283499p = interfaceC27108f;
        this.f283500q = c36135w2;
        this.f283501r = new Rect();
        this.f283502s = new com.jakewharton.rxrelay3.c<>();
        this.f283503t = new C34989f(view);
        this.f283504u = new C34995l(view);
        TextView textView = (TextView) view.findViewById(R.id.shortcuts_header);
        this.f283505v = textView;
        this.f283506w = view.findViewById(R.id.top_entry_point);
        this.f283507x = (Input) view.findViewById(R.id.top_entry_point_input);
        TextView textView2 = (TextView) view.findViewById(R.id.shortcuts_geo_header);
        this.f283508y = textView2;
        this.f283509z = view.findViewById(R.id.shortcuts_header_skeleton);
        this.f283446A = view.findViewById(R.id.shortcut_block);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.shortcuts_recycler_view);
        this.f283447B = recyclerView;
        this.f283448C = view.findViewById(R.id.show_all_categories);
        View viewFindViewById = view.findViewById(R.id.top_widget_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f283449D = frameLayout;
        this.f283450E = interfaceC13094a.b() ? bVar2.a(new ZS.b(screen, Owners.f210448U, "topWidget"), frameLayout, interfaceC27108f, screenPerformanceTracker, zVar, interfaceC13094a.d()) : null;
        View viewFindViewById2 = view.findViewById(R.id.tabs_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_layout.TabLayout");
        }
        this.f283451F = (com.avito.android.lib.design.tab_layout.c) viewFindViewById2;
        this.f283452G = (TabGroup) view.findViewById(R.id.new_bottom_tabs_container);
        this.f283453H = (com.avito.android.lib.design.tab_layout.c) view.findViewById(R.id.bottom_tabs_container);
        View viewFindViewById3 = view.findViewById(R.id.chips_tabs_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.ui.Chips");
        }
        Chips chips = (Chips) viewFindViewById3;
        g.b bVar3 = com.avito.android.lib.design.chips.ui.g.f178794f;
        Context context = chips.getContext();
        int iJ2 = C35835l0.j(R.attr.chipsSmall, chips.getContext());
        bVar3.getClass();
        chips.setStyle(g.b.c(iJ2, context));
        this.f283454I = chips;
        View viewFindViewById4 = view.findViewById(R.id.upper_horizontal_block);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283455J = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.upper_block);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById5;
        this.f283456K = viewGroup;
        View viewFindViewById6 = view.findViewById(R.id.geo_click_zone);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283457L = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.geo_group);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f283458M = (Group) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.geo_address);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f283459N = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.arrow_icon);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f283460O = (ImageView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.filters_click_zone);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283461P = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.filters_badge_counter);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283462Q = viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.left_block);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283463R = viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.right_block);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283464S = viewFindViewById13;
        this.f283468W = true;
        this.f283469X = C42784z0.f406748b;
        recyclerView.getContext();
        ScrollLinearLayoutManager scrollLinearLayoutManager = new ScrollLinearLayoutManager(0, false);
        scrollLinearLayoutManager.f283335G = true;
        this.f283472a0 = scrollLinearLayoutManager;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f283474b0 = kotlinx.coroutines.U.a(kotlinx.coroutines.internal.K.f411877a);
        this.f283476c0 = new com.jakewharton.rxrelay3.c<>();
        this.f283478d0 = new com.jakewharton.rxrelay3.c<>();
        new com.jakewharton.rxrelay3.c();
        this.f283480e0 = new com.jakewharton.rxrelay3.c<>();
        this.f283482f0 = new com.jakewharton.rxrelay3.c<>();
        this.f283484g0 = f2.b(0, 1, BufferOverflow.f410778c, 1);
        view.getContext().getResources().getDimensionPixelSize(R.dimen.shortcut_top_padding_with_logo_toolbar);
        view.getContext().getResources().getDimensionPixelSize(R.dimen.shortcut_top_padding_with_search_with_action_title_toolbar);
        androidx.transition.T t12 = new androidx.transition.T();
        t12.E(200L);
        t12.Q(0);
        t12.q(recyclerView);
        t12.N(new C23494e());
        t12.N(new androidx.transition.J(48));
        t12.N(new C23503n(1));
        this.f283486h0 = t12;
        androidx.transition.T t13 = new androidx.transition.T();
        t13.E(200L);
        t13.Q(0);
        t13.q(recyclerView);
        t13.N(new C23494e());
        t13.N(new androidx.transition.J(80));
        t13.N(new C23503n(2));
        this.f283488i0 = t13;
        this.f283490j0 = new ClarifyButtonItem("clarify", "", null, null, false, 8, null);
        this.f283496m0 = new g();
        recyclerView.setLayoutManager(scrollLinearLayoutManager);
        recyclerView.l(new y0(recyclerView.getResources(), 0, 0, 0, 14, null), -1);
        recyclerView.l(new com.avito.android.shortcut_navigation_bar.adapter.tag.e(recyclerView.getResources()), -1);
        recyclerView.l(new com.avito.android.shortcut_navigation_bar.adapter.tag.b(recyclerView.getResources()), -1);
        recyclerView.l(new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.j(recyclerView.getResources(), (bVar == null || (numA = bVar.a()) == null) ? recyclerView.getResources().getDimensionPixelOffset(R.dimen.horizontal_chips_edge_offset) : numA.intValue()), -1);
        m();
        if (bVar != null && (numD = bVar.d()) != null) {
            D6.f(viewGroup, numD.intValue(), 0, 0, 0, 14);
        }
        if (bVar != null && (numE = bVar.e()) != null) {
            D6.f(viewGroup, 0, 0, numE.intValue(), 0, 11);
        }
        if (bVar != null && (numB = bVar.b()) != null) {
            D6.c(viewFindViewById12, Integer.valueOf(numB.intValue()), null, null, null, 14);
        }
        if (bVar != null && (numC = bVar.c()) != null) {
            D6.c(viewFindViewById13, null, null, Integer.valueOf(numC.intValue()), null, 11);
        }
        com.avito.konveyor.a aVarF = f();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarF, aVarF, null, 4, null);
        this.f283471Z = new com.avito.konveyor.adapter.j(hVar, aVarF);
        recyclerView.setItemAnimator(null);
        if (textView2 != null) {
            D6.c(textView2, null, null, null, Integer.valueOf(y6.b(4)), 7);
        }
        this.f283470Y = new com.avito.android.recycler.data_aware.d(new C14188a(this, 6), hVar, new com.avito.android.recycler.data_aware.i(new x0(), new com.avito.android.recycler.data_aware.j(), true, new a()));
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        i(androidx.core.content.d.getColor(view.getContext(), R.color.common_old_background));
        view.setClickable(true);
        D6.f(recyclerView, y6.b(-2), 0, y6.b(-2), 0, 10);
    }

    public static boolean g(InlineActions inlineActions) {
        if (inlineActions == null) {
            return false;
        }
        InlineAction inlineAction = inlineActions.f283126b;
        InlineAction.Predefined predefined = inlineAction instanceof InlineAction.Predefined ? (InlineAction.Predefined) inlineAction : null;
        InlineAction inlineAction2 = inlineActions.f283127c;
        InlineAction.Predefined predefined2 = inlineAction2 instanceof InlineAction.Predefined ? (InlineAction.Predefined) inlineAction2 : null;
        InlineAction.Predefined.Type type = predefined != null ? predefined.f283116g : null;
        InlineAction.Predefined.Type type2 = InlineAction.Predefined.Type.f283123b;
        return (type == type2) || ((predefined2 != null ? predefined2.f283116g : null) == type2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.l
    public final View Aq() {
        return this.f283473b.findViewById(R.id.filters_text);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> Ct() {
        return this.f283504u.f283430i;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Df(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k View view, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        com.avito.android.onboarding_manager.a aVar3;
        if (l("entry_point_onboarding", OnboardingType.f209409b) && (aVar3 = this.f283477d) != null) {
            aVar3.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new D(aVar, aVar2, view, onboarding, this));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void E30(@Y61.k C42120a c42120a) {
        View view = this.f283506w;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = c42120a.f405390b;
            view.setLayoutParams(layoutParams);
        }
        if (view != null) {
            D6.c(view, Integer.valueOf(c42120a.f405389a), null, null, null, 14);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void EH(@Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        com.avito.android.onboarding_manager.a aVar4;
        if (l("big_filters_onboarding_id", onboardingType) && (aVar4 = this.f283477d) != null) {
            aVar4.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new i(onboardingType, onboarding, aVar, aVar3, aVar2));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void HQ(@Y61.k BxContentBusiness360.ReplaceMain.Onboarding onboarding, @Y61.k Y41.a aVar) {
        com.avito.android.onboarding_manager.a aVar2;
        if (l("replace_main_onboarding_id", OnboardingType.f209409b) && (aVar2 = this.f283477d) != null) {
            aVar2.a(onboarding.getShowId(), Integer.valueOf(onboarding.getPriority()), Integer.valueOf(onboarding.getShowCount()), new N(this, onboarding, aVar));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void J50(@Y61.l InlineActions inlineActions) {
        Integer numA;
        Integer numA2;
        this.f283467V = g(inlineActions);
        C34989f c34989f = this.f283503t;
        c34989f.getClass();
        InlineAction inlineAction = inlineActions != null ? inlineActions.f283126b : null;
        InlineAction.Predefined predefined = inlineAction instanceof InlineAction.Predefined ? (InlineAction.Predefined) inlineAction : null;
        InlineAction inlineAction2 = inlineActions != null ? inlineActions.f283127c : null;
        InlineAction.Predefined predefined2 = inlineAction2 instanceof InlineAction.Predefined ? (InlineAction.Predefined) inlineAction2 : null;
        InlineAction.Predefined.State state = predefined != null ? predefined.f283117h : null;
        InlineAction.Predefined.State state2 = InlineAction.Predefined.State.f283120d;
        boolean z12 = state == state2;
        boolean z13 = (predefined2 != null ? predefined2.f283117h : null) == state2;
        View view = c34989f.f283388b;
        D6.w(view);
        ImageView imageView = c34989f.f283389c;
        imageView.setImageDrawable(null);
        TextView textView = c34989f.f283390d;
        if (!z12) {
            I5.a(textView, null, false);
        }
        D6.w(c34989f.f283391e);
        View view2 = c34989f.f283392f;
        D6.w(view2);
        ImageView imageView2 = c34989f.f283393g;
        imageView2.setImageDrawable(null);
        TextView textView2 = c34989f.f283394h;
        if (!z13) {
            I5.a(textView2, null, false);
        }
        D6.w(c34989f.f283395i);
        if (inlineActions == null) {
            return;
        }
        InlineAction inlineAction3 = inlineActions.f283126b;
        if (inlineAction3 != null) {
            if (inlineAction3 instanceof InlineAction.InlineFilter) {
                InlineAction.InlineFilter inlineFilter = (InlineAction.InlineFilter) inlineAction3;
                String str = inlineFilter.f283108b;
                if (str != null && (numA2 = com.avito.android.lib.util.q.a(str)) != null) {
                    imageView.setImageDrawable(C35835l0.h(numA2.intValue(), imageView.getContext()));
                    D6.H(imageView);
                }
                I5.a(textView, inlineFilter.f283109c, false);
                view.setOnClickListener(new ViewOnClickListenerC34987d(c34989f, inlineAction3, 0));
                D6.H(view);
            } else if (inlineAction3 instanceof InlineAction.Predefined) {
                c34989f.a(inlineAction3);
            }
        }
        InlineAction inlineAction4 = inlineActions.f283127c;
        if (inlineAction4 != null) {
            if (inlineAction4 instanceof InlineAction.InlineFilter) {
                InlineAction.InlineFilter inlineFilter2 = (InlineAction.InlineFilter) inlineAction4;
                String str2 = inlineFilter2.f283108b;
                if (str2 != null && (numA = com.avito.android.lib.util.q.a(str2)) != null) {
                    imageView2.setImageDrawable(C35835l0.h(numA.intValue(), imageView2.getContext()));
                    D6.H(imageView2);
                }
                I5.a(textView2, inlineFilter2.f283109c, false);
                view2.setOnClickListener(new ViewOnClickListenerC34987d(c34989f, inlineAction4, 1));
                D6.H(view2);
            } else if (inlineAction4 instanceof InlineAction.Predefined) {
                c34989f.b(inlineAction4);
            }
        }
        D6.G(c34989f.f283387a, inlineActions.f283129e);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void JY(@Y61.k EntryPoint.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        com.avito.android.onboarding_manager.a aVar3;
        if (l("entry_point_onboarding", OnboardingType.f209409b) && (aVar3 = this.f283477d) != null) {
            aVar3.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new d0(this, onboarding, aVar, aVar2));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void MR(@Y61.k List list, boolean z12) {
        this.f283472a0.f283335G = true;
        RS(null, null, null, C35006x.f283585l, C35007y.f283586l, null, null, null, null, null, list, C42784z0.f406748b, null, z12);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Ml(@Y61.k NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding) {
        com.avito.android.onboarding_manager.a aVar;
        if (l("search_with_action_title_onboarding", OnboardingType.f209409b) && (aVar = this.f283477d) != null) {
            aVar.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new U(this, onboarding));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void OM(boolean z12) {
        RecyclerView recyclerView = this.f283447B;
        if (z12) {
            recyclerView.F0(0);
        } else {
            recyclerView.A0(0);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final d2<kotlin.Q<String, SectionTagPayload>> QZ() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void R00(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013e  */
    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RS(@Y61.l com.avito.android.remote.model.search.TopWidget r28, @Y61.l com.avito.android.remote.model.search.TabsConfig r29, @Y61.l com.avito.android.remote.model.search.EntryPoint r30, @Y61.k Y41.a<kotlin.G0> r31, @Y61.k Y41.a<kotlin.G0> r32, @Y61.l java.lang.String r33, @Y61.l com.avito.android.deep_linking.links.DeepLink r34, @Y61.l java.lang.Integer r35, @Y61.l com.avito.android.remote.model.search.HeaderSubtitle r36, @Y61.l java.lang.Integer r37, @Y61.k java.util.List<? extends com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem> r38, @Y61.k java.util.List<com.avito.android.shortcut_navigation_bar.z0> r39, @Y61.l java.lang.Boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.shortcut_navigation_bar.C34999p.RS(com.avito.android.remote.model.search.TopWidget, com.avito.android.remote.model.search.TabsConfig, com.avito.android.remote.model.search.EntryPoint, Y41.a, Y41.a, java.lang.String, com.avito.android.deep_linking.links.DeepLink, java.lang.Integer, com.avito.android.remote.model.search.HeaderSubtitle, java.lang.Integer, java.util.List, java.util.List, java.lang.Boolean, boolean):void");
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> TJ() {
        return this.f283503t.f283399m;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void TP(@Y61.k ShortcutNavigationItem shortcutNavigationItem) {
        this.f283476c0.accept(shortcutNavigationItem);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void VA(@Y61.k TopWidget.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        com.avito.android.onboarding_manager.a aVar3;
        if (l("top_widget_onboarding", OnboardingType.f209409b) && (aVar3 = this.f283477d) != null) {
            aVar3.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new h0(this, onboarding, aVar, aVar2));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InlineFiltersGeo> Vl() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void WC(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void Xk(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k Y41.a aVar) {
        com.avito.android.onboarding_manager.a aVar2;
        if (l("inline_filters_geo_onboarding_id", OnboardingType.f209409b) && (aVar2 = this.f283477d) != null) {
            aVar2.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new H(this, onboarding, str, aVar));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void ZN(@Y61.l InlineActions inlineActions) {
        InlineAction inlineAction;
        this.f283467V = g(inlineActions);
        C34989f c34989f = this.f283503t;
        if (inlineActions != null) {
            c34989f.getClass();
            inlineAction = inlineActions.f283126b;
        } else {
            inlineAction = null;
        }
        c34989f.a(inlineAction);
        c34989f.b(inlineActions != null ? inlineActions.f283127c : null);
    }

    public final void a(boolean z12, boolean z13) {
        View view = this.f283473b;
        if (z12 && !D6.y(view)) {
            D6.H(view);
            D6.c(this.f283447B, null, 0, null, null, 13);
        } else if (!z12 && D6.y(view)) {
            D6.c(this.f283447B, null, Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(R.dimen.redesigned_inlines_geo_hidden_margin_top)), null, null, 13);
        }
        C34995l c34995l = this.f283504u;
        int i12 = z12 ? 0 : -(c34995l.f283428g != null ? c34995l.f283422a.getMeasuredHeight() : view.getMeasuredHeight());
        d dVar = new d(z12);
        ViewPropertyAnimator duration = view.animate().translationY(i12).setDuration(z13 ? 300L : 0L);
        duration.withStartAction(new U2(1, dVar));
        duration.start();
    }

    public final void b(com.avito.android.lib.design.tab_layout.c cVar, List<z0> list) {
        cVar.f180837F.clear();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            z0 z0Var = (z0) obj;
            c.i iVarK = cVar.k();
            iVarK.c(z0Var.f283593b);
            ArrayList<c.i> arrayList = cVar.f180847b;
            cVar.b(iVarK, arrayList.size(), arrayList.isEmpty());
            if (z0Var.f283595d) {
                cVar.q(cVar.j(i12), true);
                this.f283465T = true;
            }
            i12 = i13;
        }
        cVar.a(new e(list));
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void bM(boolean z12) {
        View view = this.f283473b;
        if (view instanceof ViewGroup) {
            D6.w(this.f283449D);
            C34995l c34995l = this.f283504u;
            D6.G(c34995l.f283422a, c34995l.f283428g != null);
            ViewGroup viewGroup = this.f283456K;
            if (viewGroup.getVisibility() == 8) {
                return;
            }
            if (z12) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                androidx.transition.Q.b(viewGroup2);
                androidx.transition.Q.a(viewGroup2, this.f283488i0);
            }
            D6.w(viewGroup);
            if (this.f283468W && this.f283467V) {
                return;
            }
            D6.w(this.f283503t.f283387a);
        }
    }

    public final ChipsState c(List<z0> list) {
        ChipsState.DisplayType displayType = ChipsState.DisplayType.f178758d;
        List<z0> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (z0 z0Var : list2) {
            int id2 = (int) z0Var.getF78300d();
            String str = z0Var.f283593b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new ItemChipable(id2, null, null, null, z0Var.f283595d, null, str, false, false, 430, null));
        }
        return new ChipsState(0, displayType, null, arrayList, new f(list), 1, null);
    }

    @Y61.l
    public final Integer e() {
        b bVar = this.f283485h;
        return (bVar != null ? bVar.m() : null) != null ? bVar.m() : Integer.valueOf((int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(this.f283473b, R.dimen.redesign_shortcuts_top_margin));
    }

    @Y61.k
    public com.avito.konveyor.a f() throws BlueprintCollisionException {
        com.avito.android.shortcut_navigation_bar.adapter.category_node.b bVar = new com.avito.android.shortcut_navigation_bar.adapter.category_node.b(this);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.s sVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.s(this);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.m mVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.m(this, this.f283477d, this.f283481f, this.f283483g);
        View view = this.f283473b;
        InterfaceC50637a interfaceC50637aA = ((InterfaceC30265q) C29972i.a(C29972i.b(view.getContext()), InterfaceC30265q.class)).Gk().orElse(new C50639c()).a(view.getContext());
        com.avito.android.shortcut_navigation_bar.adapter.skeleton.a aVar = new com.avito.android.shortcut_navigation_bar.adapter.skeleton.a(new com.avito.android.shortcut_navigation_bar.adapter.skeleton.b());
        com.avito.android.shortcut_navigation_bar.adapter.skeleton.c cVar = new com.avito.android.shortcut_navigation_bar.adapter.skeleton.c(new com.avito.android.shortcut_navigation_bar.adapter.skeleton.b());
        com.avito.android.shortcut_navigation_bar.adapter.tag.d dVar = new com.avito.android.shortcut_navigation_bar.adapter.tag.d(new com.avito.android.shortcut_navigation_bar.adapter.tag.g(this));
        com.avito.android.shortcut_navigation_bar.adapter.tag.a aVar2 = new com.avito.android.shortcut_navigation_bar.adapter.tag.a(new com.avito.android.shortcut_navigation_bar.adapter.tag.g(this));
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.i iVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.i(mVar, interfaceC50637aA);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.p pVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.p(sVar, interfaceC50637aA);
        com.avito.android.shortcut_navigation_bar.adapter.category_node.a aVar3 = new com.avito.android.shortcut_navigation_bar.adapter.category_node.a(bVar);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.w wVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.w(sVar, interfaceC50637aA);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(cVar);
        c10493a.b(dVar);
        c10493a.b(aVar2);
        c10493a.b(iVar);
        c10493a.b(aVar3);
        c10493a.b(pVar);
        c10493a.b(wVar);
        return c10493a.a();
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    /* renamed from: ff, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF283478d0() {
        return this.f283478d0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void fk(@Y61.l Boolean bool, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.onboarding_manager.a aVar2;
        if (!kotlin.jvm.internal.L.f(bool, Boolean.TRUE)) {
            aVar.invoke();
        } else if (l("on_result_onboarding", OnboardingType.f209409b) && (aVar2 = this.f283477d) != null) {
            aVar2.a(UUID.randomUUID().toString(), Integer.valueOf(BeduinInputModel.MIN_TEXT_VERSION), null, new k(aVar, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public final void h(int i12) {
        if (((Collection) this.f283469X).isEmpty() || i12 < 0 || i12 >= this.f283469X.size()) {
            return;
        }
        this.f283476c0.accept(this.f283469X.get(i12));
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> hY() {
        View view = this.f283448C;
        return view != null ? C37722i.a(view) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
    }

    public final void i(@InterfaceC42156l int i12) {
        this.f283473b.setBackgroundColor(i12);
    }

    public final void j(String str, OnboardingType onboardingType, Y41.a<G0> aVar) {
        if (!this.f283479e.V() && l(str, onboardingType)) {
            aVar.invoke();
        }
    }

    public final void k(String str, String str2) {
        com.avito.android.onboarding_manager.a aVar;
        com.avito.android.onboarding_manager.e eVar = this.f283481f;
        if (eVar != null) {
            eVar.a(str, false);
        }
        if (str2 == null || (aVar = this.f283477d) == null) {
            return;
        }
        aVar.f209413a.e(str2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void kF() {
        View view = this.f283473b;
        view.measure(View.MeasureSpec.makeMeasureSpec(C35835l0.i(view.getContext()).widthPixels, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final boolean l(String str, OnboardingType onboardingType) {
        boolean z12 = false;
        com.avito.android.onboarding_manager.e eVar = this.f283481f;
        if (eVar != null && !eVar.b(str, onboardingType)) {
            z12 = true;
        }
        return !z12;
    }

    public void m() {
        D6.f(this.f283473b.findViewById(R.id.shortcuts_container), 0, e().intValue(), 0, 0, 13);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void nV(boolean z12) {
        View view = this.f283473b;
        if (view instanceof ViewGroup) {
            com.avito.android.lib.beduin_v2.feature.item.a aVar = this.f283450E;
            if (aVar != null && aVar.getF87123d()) {
                D6.H(this.f283449D);
            }
            D6.w(this.f283504u.f283422a);
            ViewGroup viewGroup = this.f283456K;
            if (viewGroup.getVisibility() == 0) {
                return;
            }
            if (z12) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                androidx.transition.Q.b(viewGroup2);
                androidx.transition.Q.a(viewGroup2, this.f283486h0);
            }
            D6.H(viewGroup);
            if (this.f283468W && !this.f283467V) {
                D6.H(this.f283503t.f283387a);
            }
            D6.c(this.f283447B, null, 0, null, null, 13);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<ShortcutNavigationItem> pu() {
        throw null;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void q00(@Y61.k String str, @Y61.k Filter.Onboarding onboarding, @Y61.k OnboardingType onboardingType, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        com.avito.android.onboarding_manager.a aVar4;
        if (l("inline_filters_target_tap_onboarding", onboardingType) && (aVar4 = this.f283477d) != null) {
            aVar4.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new j(str, onboarding, onboardingType, z12, aVar, aVar2, aVar3));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> s60() {
        C41981q0 c41981q0 = this.f283503t.f283401o;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c41981q0.getClass();
        return c41981q0.C0(1000L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b);
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> sA() {
        return this.f283503t.f283400n;
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void w50(@Y61.l final PinnedItem pinnedItem) {
        final C34995l c34995l = this.f283504u;
        c34995l.f283428g = pinnedItem;
        ViewGroup viewGroup = c34995l.f283422a;
        if (pinnedItem == null) {
            D6.w(viewGroup);
            return;
        }
        C35949t5.c(c34995l.f283423b, com.avito.android.image_loader.b.b(pinnedItem.f283167b), null, null, null, 14);
        c34995l.f283424c.setText(pinnedItem.f283168c);
        SellerElement.DeveloperInfo developerInfo = pinnedItem.f283169d;
        I5.a(c34995l.f283425d, developerInfo != null ? developerInfo.getAsDescription(c34995l.f283427f) : null, false);
        final int i12 = 0;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.shortcut_navigation_bar.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        DeepLink deepLink = pinnedItem.f283170e;
                        if (deepLink != null) {
                            c34995l.f283429h.accept(deepLink);
                            break;
                        }
                        break;
                    default:
                        DeepLink deepLink2 = pinnedItem.f283170e;
                        if (deepLink2 != null) {
                            c34995l.f283429h.accept(deepLink2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        c34995l.f283426e.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.shortcut_navigation_bar.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        DeepLink deepLink = pinnedItem.f283170e;
                        if (deepLink != null) {
                            c34995l.f283429h.accept(deepLink);
                            break;
                        }
                        break;
                    default:
                        DeepLink deepLink2 = pinnedItem.f283170e;
                        if (deepLink2 != null) {
                            c34995l.f283429h.accept(deepLink2);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xL(@Y61.k BxContentBusiness360.ReplaceMain.ToastReplaceMain toastReplaceMain, @Y61.k Y41.a aVar) {
        com.avito.android.onboarding_manager.a aVar2;
        if (l("replace_main_toast_onboarding_id", OnboardingType.f209409b) && (aVar2 = this.f283477d) != null) {
            aVar2.a(toastReplaceMain.getShowId(), Integer.valueOf(toastReplaceMain.getPriority()), Integer.valueOf(toastReplaceMain.getShowCount()), new P(this, toastReplaceMain, aVar));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void xU(@Y61.k NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2) {
        com.avito.android.onboarding_manager.a aVar3;
        if (l("nav_bar_left_icon_onboarding", OnboardingType.f209409b) && (aVar3 = this.f283477d) != null) {
            aVar3.a(navigationIconOnboarding.getOnceShowId(), navigationIconOnboarding.getPriority(), null, new K(this, navigationIconOnboarding, aVar, aVar2));
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.InterfaceC34996m
    public final void zw(@Y61.k Tab.Onboarding onboarding, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k String str, int i12) {
        OnboardingType onboardingType = OnboardingType.f209409b;
        C36135w2 c36135w2 = this.f283500q;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[45];
        boolean zBooleanValue = ((Boolean) c36135w2.f327473P.a().invoke()).booleanValue();
        com.avito.android.onboarding_manager.a aVar4 = this.f283477d;
        if (zBooleanValue) {
            if (this.f283452G == null || !l("tab_onboarding", onboardingType) || aVar4 == null) {
                return;
            }
            aVar4.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new X(this, i12, onboarding, aVar, aVar3, aVar2));
            return;
        }
        if (this.f283453H == null || !l("tab_onboarding", onboardingType) || str.length() == 0 || aVar4 == null) {
            return;
        }
        aVar4.a(onboarding.getOnceShowId(), onboarding.getPriority(), null, new a0(this, str, onboarding, aVar, aVar3, aVar2));
    }

    /* compiled from: ShortcutNavigationBar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/shortcut_navigation_bar/p$e", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.p$e */
    public static final class e implements c.f {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<z0> f283514b;

        public e(List<z0> list) {
            this.f283514b = list;
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void c(@Y61.k c.i iVar) {
            C34999p c34999p = C34999p.this;
            if (c34999p.f283465T) {
                c34999p.f283478d0.accept(this.f283514b.get(iVar.f180895d));
            }
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void b() {
        }

        @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
        public final void a(@Y61.k c.i iVar) {
        }
    }

    public /* synthetic */ C34999p(View view, com.avito.android.util.text.a aVar, com.avito.android.onboarding_manager.a aVar2, FragmentManager fragmentManager, com.avito.android.onboarding_manager.e eVar, com.avito.android.onboarding_manager.f fVar, b bVar, com.avito.android.lib.beduin_v2.feature.item.b bVar2, Screen screen, ScreenPerformanceTracker screenPerformanceTracker, InterfaceC13094a interfaceC13094a, boolean z12, Y41.a aVar3, View view2, com.avito.beduin.v2.engine.component.z zVar, InterfaceC27108f interfaceC27108f, C36135w2 c36135w2, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? null : aVar2, fragmentManager, (i12 & 16) != 0 ? null : eVar, fVar, (i12 & 64) != 0 ? null : bVar, bVar2, screen, screenPerformanceTracker, interfaceC13094a, (i12 & 2048) != 0 ? false : z12, (i12 & 4096) != 0 ? null : aVar3, (i12 & 8192) != 0 ? null : view2, zVar, interfaceC27108f, c36135w2);
    }
}

package com.avito.android.tariff_cpt.info;

import Cd.C13243a;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.tariff_cpt.info.CptInfoV2Fragment;
import com.avito.android.tariff_cpt.info.di.e;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import yC0.InterfaceC50099a;
import yC0.InterfaceC50100b;
import yC0.c;
import z1.AbstractC50339a;
import zC0.C50438c;

/* compiled from: CptInfoV2Fragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/info/CptInfoV2Fragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CptInfoV2Fragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f298114A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.tariff_cpt.info.f f298115n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f298116o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f298117p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f298118q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f298119r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f298120s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final GridLayoutManager f298121t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.ui.screen.fragment.bottom_sheet.e f298122u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public TextView f298123v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public Button f298124w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.progress_overlay.l f298125x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public ShimmerLayout f298126y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public SwipeRefreshLayout f298127z0;

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/info/CptInfoV2Fragment$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff_cpt/info/CptInfoV2Fragment$b", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends GridLayoutManager.c {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int f(int i12) {
            com.avito.konveyor.adapter.d dVar = CptInfoV2Fragment.this.f298117p0;
            if (dVar == null) {
                dVar = null;
            }
            TV0.a aVar = (TV0.a) C42745f0.K(i12, dVar.f53650c.f53994f);
            if (aVar instanceof com.avito.android.tariff_cpt.info.ui.items.card.a) {
                return ((com.avito.android.tariff_cpt.info.ui.items.card.a) aVar).f298269c;
            }
            return 2;
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC50100b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50100b interfaceC50100b) {
            InterfaceC50100b interfaceC50100b2 = interfaceC50100b;
            CptInfoV2Fragment cptInfoV2Fragment = (CptInfoV2Fragment) this.receiver;
            a aVar = CptInfoV2Fragment.f298114A0;
            cptInfoV2Fragment.getClass();
            if (interfaceC50100b2 instanceof InterfaceC50100b.a) {
                ActivityC22955m activityC22955mL1 = cptInfoV2Fragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
            } else if (interfaceC50100b2 instanceof InterfaceC50100b.c) {
                SwipeRefreshLayout swipeRefreshLayout = cptInfoV2Fragment.f298127z0;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                Throwable th2 = ((InterfaceC50100b.c) interfaceC50100b2).f442977a;
                com.avito.android.component.toast.c.c(cVar, cptInfoV2Fragment, com.avito.android.printable_text.b.f(z.l(th2)), null, null, new f.c(th2), 0, ToastBarPosition.f181046d, 942);
            } else if (interfaceC50100b2 instanceof InterfaceC50100b.C12893b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = cptInfoV2Fragment.f298119r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC50100b.C12893b) interfaceC50100b2).f442976a, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<yC0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(yC0.c cVar) {
            c.d dVar;
            iC0.e eVar;
            c.d dVar2;
            yC0.c cVar2 = cVar;
            CptInfoV2Fragment cptInfoV2Fragment = (CptInfoV2Fragment) this.receiver;
            a aVar = CptInfoV2Fragment.f298114A0;
            cptInfoV2Fragment.getClass();
            Throwable th2 = cVar2.f442984f;
            boolean z12 = false;
            if (th2 != null) {
                com.avito.android.progress_overlay.l lVar = cptInfoV2Fragment.f298125x0;
                if (lVar != null) {
                    lVar.a(z.l(th2));
                }
                ShimmerLayout shimmerLayout = cptInfoV2Fragment.f298126y0;
                if (shimmerLayout != null) {
                    D6.w(shimmerLayout);
                    shimmerLayout.d();
                }
                SwipeRefreshLayout swipeRefreshLayout = cptInfoV2Fragment.f298127z0;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                D6.w(cptInfoV2Fragment.f298123v0);
                D6.w(cptInfoV2Fragment.f298124w0);
            } else if (cVar2.f442985g) {
                com.avito.android.progress_overlay.l lVar2 = cptInfoV2Fragment.f298125x0;
                if (lVar2 != null) {
                    lVar2.k(null);
                }
                ShimmerLayout shimmerLayout2 = cptInfoV2Fragment.f298126y0;
                if (shimmerLayout2 != null) {
                    D6.H(shimmerLayout2);
                    shimmerLayout2.c();
                }
                D6.w(cptInfoV2Fragment.f298123v0);
                D6.w(cptInfoV2Fragment.f298124w0);
            } else {
                com.avito.android.progress_overlay.l lVar3 = cptInfoV2Fragment.f298125x0;
                if (lVar3 != null) {
                    lVar3.j();
                }
                ShimmerLayout shimmerLayout3 = cptInfoV2Fragment.f298126y0;
                if (shimmerLayout3 != null) {
                    D6.w(shimmerLayout3);
                    shimmerLayout3.d();
                }
                SwipeRefreshLayout swipeRefreshLayout2 = cptInfoV2Fragment.f298127z0;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                TextView textView = cptInfoV2Fragment.f298123v0;
                c.e eVar2 = cVar2.f442980b;
                if (textView != null) {
                    textView.setText(eVar2 != null ? eVar2.f442997a : null);
                    D6.G(textView, eVar2 != null && eVar2.f442999c);
                }
                Button button = cptInfoV2Fragment.f298124w0;
                if (button != null) {
                    Drawable drawableH = (eVar2 == null || (dVar2 = eVar2.f442998b) == null) ? null : C35835l0.h(dVar2.f442994a, button.getContext());
                    if (drawableH != null) {
                        button.setImageDrawable(drawableH);
                    }
                    ColorStateList colorStateListB = (eVar2 == null || (dVar = eVar2.f442998b) == null || (eVar = dVar.f442995b) == null) ? null : eVar.b(button.getContext());
                    if (colorStateListB != null) {
                        button.setIconColor(colorStateListB);
                    }
                    if (eVar2 != null && eVar2.f442999c) {
                        z12 = true;
                    }
                    D6.G(button, z12);
                }
                com.avito.konveyor.adapter.d dVar3 = cptInfoV2Fragment.f298117p0;
                if (dVar3 == null) {
                    dVar3 = null;
                }
                dVar3.l(cVar2.f442981c, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CptInfoV2Fragment.f298114A0;
            CptInfoV2Fragment.this.q5().accept(new InterfaceC50099a.b(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CptInfoV2Fragment.f298114A0;
            CptInfoV2Fragment.this.q5().accept(new InterfaceC50099a.g(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<String, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = CptInfoV2Fragment.f298114A0;
            CptInfoV2Fragment.this.q5().accept(new InterfaceC50099a.d(str));
            return G0.f406611a;
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<DeepLink, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = CptInfoV2Fragment.f298114A0;
            CptInfoV2Fragment.this.q5().accept(new InterfaceC50099a.c(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f298133l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f298133l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f298133l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CptInfoV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f298135l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f298135l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f298135l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f298136l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f298136l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f298136l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f298137l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f298137l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f298137l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CptInfoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/tariff_cpt/info/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.tariff_cpt.info.e> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.tariff_cpt.info.e invoke() {
            com.avito.android.tariff_cpt.info.f fVar = CptInfoV2Fragment.this.f298115n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.tariff_cpt.info.e) fVar.get();
        }
    }

    public CptInfoV2Fragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f298120s0 = new O0(m0.f406844a.b(com.avito.android.tariff_cpt.info.e.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.f53667M = new b();
        this.f298121t0 = gridLayoutManager;
        this.f298122u0 = new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.e(this, 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f298116o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.cpt_info_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i12 = 0;
        ((Toolbar) view.findViewById(R.id.cpt_info_toolbar)).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_cpt.info.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CptInfoV2Fragment f298140c;

            {
                this.f298140c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CptInfoV2Fragment cptInfoV2Fragment = this.f298140c;
                switch (i12) {
                    case 0:
                        CptInfoV2Fragment.a aVar = CptInfoV2Fragment.f298114A0;
                        cptInfoV2Fragment.q5().accept(InterfaceC50099a.C12892a.f442966a);
                        break;
                    default:
                        CptInfoV2Fragment.a aVar2 = CptInfoV2Fragment.f298114A0;
                        cptInfoV2Fragment.q5().accept(InterfaceC50099a.f.f442971a);
                        break;
                }
            }
        });
        this.f298123v0 = (TextView) view.findViewById(R.id.cpt_info_title);
        Button button = (Button) view.findViewById(R.id.cpt_info_help_view);
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.tariff_cpt.info.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CptInfoV2Fragment f298140c;

            {
                this.f298140c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CptInfoV2Fragment cptInfoV2Fragment = this.f298140c;
                switch (i13) {
                    case 0:
                        CptInfoV2Fragment.a aVar = CptInfoV2Fragment.f298114A0;
                        cptInfoV2Fragment.q5().accept(InterfaceC50099a.C12892a.f442966a);
                        break;
                    default:
                        CptInfoV2Fragment.a aVar2 = CptInfoV2Fragment.f298114A0;
                        cptInfoV2Fragment.q5().accept(InterfaceC50099a.f.f442971a);
                        break;
                }
            }
        });
        this.f298124w0 = button;
        this.f298126y0 = (ShimmerLayout) view.findViewById(R.id.cpt_info_shimmer_container);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.cpt_info_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 3));
        this.f298127z0 = swipeRefreshLayout;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cpt_info_items_view);
        com.avito.konveyor.adapter.d dVar = this.f298117p0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.setLayoutManager(this.f298121t0);
        com.avito.konveyor.a aVar = this.f298118q0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView.l(new C50438c(aVar), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f298116o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        recyclerView.setOnScrollChangeListener(this.f298122u0);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.cpt_info_content_container), R.id.cpt_info_refresh_layout, null, R.layout.tariff_cpt_network_problem_view, 0, 4, null);
        lVar.f231600j = new com.avito.android.tariff_cpt.info.b(this);
        this.f298125x0 = lVar;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f298116o0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, CptInfoV2Fragment.class, "handleEvent", "handleEvent(Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2OneTimeEvent;)V", 0), new d(1, this, CptInfoV2Fragment.class, "render", "render(Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2State;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f298116o0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        e.a aVarA = com.avito.android.tariff_cpt.info.di.l.a();
        com.avito.android.tariff_cpt.common.di.d dVar = (com.avito.android.tariff_cpt.common.di.d) C29972i.a(C29972i.b(this), Object.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarC = s.c(this);
        Bundle arguments = getArguments();
        aVarA.a(dVar, interfaceC39417aB, rVarC, arguments != null ? arguments.getString("tariff_cpt_extra_remote_context") : null, new e(), new f(), new g(), new h()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f298116o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f298116o0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final com.avito.android.tariff_cpt.info.e q5() {
        return (com.avito.android.tariff_cpt.info.e) this.f298120s0.getValue();
    }
}

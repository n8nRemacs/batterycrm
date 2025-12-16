package com.avito.android.vas_union;

import Cd.C13243a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.vas_union.VasUnionV2Fragment;
import com.avito.android.vas_union.ui.items.tabs.c;
import com.avito.android.vas_union.ui.items.vas_bundle.c;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import qM0.C47322c;
import qM0.InterfaceC47320a;
import qM0.InterfaceC47321b;
import uM0.C48921a;
import v50.C49166b;
import w50.InterfaceC49447a;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: VasUnionV2Fragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_union/VasUnionV2Fragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasUnionV2Fragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f323084D0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public MnzFloatingFooter f323085A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public C49899a f323086B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final b f323087C0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_union.j f323088n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f323089o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f323090p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f323091q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f323092r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f323093s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f323094t0;

    /* renamed from: u0, reason: collision with root package name */
    public xZ.e f323095u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f323096v0;

    /* renamed from: w0, reason: collision with root package name */
    public Toolbar f323097w0;

    /* renamed from: x0, reason: collision with root package name */
    public ProgressBarRe23 f323098x0;

    /* renamed from: y0, reason: collision with root package name */
    public Button f323099y0;

    /* renamed from: z0, reason: collision with root package name */
    public RecyclerView f323100z0;

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/vas_union/VasUnionV2Fragment$a;", "", "<init>", "()V", "", "KEY_CHECKOUT_CONTEXT", "Ljava/lang/String;", "KEY_CLOSABLE", "KEY_ITEM_ID", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_union/VasUnionV2Fragment$b", "Landroidx/activity/x;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = VasUnionV2Fragment.f323084D0;
            VasUnionV2Fragment.this.q5().accept(InterfaceC47320a.C12323a.f429205a);
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC47321b, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(InterfaceC47321b interfaceC47321b) {
            InterfaceC47321b interfaceC47321b2 = interfaceC47321b;
            VasUnionV2Fragment vasUnionV2Fragment = (VasUnionV2Fragment) this.receiver;
            a aVar = VasUnionV2Fragment.f323084D0;
            vasUnionV2Fragment.getClass();
            if (interfaceC47321b2 instanceof InterfaceC47321b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = vasUnionV2Fragment.f323092r0;
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = aVar2 != null ? aVar2 : null;
                InterfaceC47321b.c cVar = (InterfaceC47321b.c) interfaceC47321b2;
                Bundle bundle = new Bundle();
                Integer num = cVar.f429220b;
                if (num != null) {
                    bundle.putInt("vas_union_key_button_id", num.intValue());
                }
                bundle.putString("vas_union_key_bundle_id", cVar.f429221c);
                Integer num2 = cVar.f429222d;
                if (num2 != null) {
                    bundle.putInt("vas_union_key_slug", num2.intValue());
                }
                G0 g02 = G0.f406611a;
                aVar3.r6(bundle, cVar.f429219a, "vas_union_request_key");
            } else if (interfaceC47321b2 instanceof InterfaceC47321b.a) {
                b bVar = vasUnionV2Fragment.f323087C0;
                bVar.d(false);
                ActivityC22955m activityC22955mL1 = vasUnionV2Fragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
                bVar.d(true);
            } else if (interfaceC47321b2 instanceof InterfaceC47321b.C12324b) {
                ActivityC22955m activityC22955mL12 = vasUnionV2Fragment.l1();
                InterfaceC49447a interfaceC49447a = activityC22955mL12 instanceof InterfaceC49447a ? (InterfaceC49447a) activityC22955mL12 : null;
                if (interfaceC49447a != null) {
                    interfaceC49447a.r1();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<C47322c, G0> {
        public final void f(@Y61.k C47322c c47322c) {
            Float progress;
            Button button;
            VasUnionV2Fragment vasUnionV2Fragment = (VasUnionV2Fragment) this.receiver;
            a aVar = VasUnionV2Fragment.f323084D0;
            vasUnionV2Fragment.getClass();
            if (c47322c.f429226c) {
                Toolbar toolbar = vasUnionV2Fragment.f323097w0;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbar.setNavigationIcon(c47322c.f429229f);
                xZ.e eVar = vasUnionV2Fragment.f323095u0;
                if (eVar == null) {
                    eVar = null;
                }
                eVar.c();
                ProgressBarRe23 progressBarRe23 = vasUnionV2Fragment.f323098x0;
                if (progressBarRe23 == null) {
                    progressBarRe23 = null;
                }
                D6.w(progressBarRe23);
                Button button2 = vasUnionV2Fragment.f323099y0;
                if (button2 == null) {
                    button2 = null;
                }
                D6.w(button2);
                MnzFloatingFooter mnzFloatingFooter = vasUnionV2Fragment.f323085A0;
                D6.w(mnzFloatingFooter != null ? mnzFloatingFooter : null);
                return;
            }
            Throwable th2 = c47322c.f429227d;
            if (th2 != null) {
                xZ.e eVar2 = vasUnionV2Fragment.f323095u0;
                if (eVar2 == null) {
                    eVar2 = null;
                }
                eVar2.d(z.l(th2));
                ProgressBarRe23 progressBarRe232 = vasUnionV2Fragment.f323098x0;
                if (progressBarRe232 == null) {
                    progressBarRe232 = null;
                }
                D6.w(progressBarRe232);
                Button button3 = vasUnionV2Fragment.f323099y0;
                if (button3 == null) {
                    button3 = null;
                }
                D6.w(button3);
                MnzFloatingFooter mnzFloatingFooter2 = vasUnionV2Fragment.f323085A0;
                D6.w(mnzFloatingFooter2 != null ? mnzFloatingFooter2 : null);
                return;
            }
            if (c47322c.f429239p) {
                Integer num = c47322c.f429240q;
                if (num != null) {
                    int iIntValue = num.intValue();
                    View view = vasUnionV2Fragment.getView();
                    if (view == null || (button = (Button) view.findViewById(iIntValue)) == null) {
                        return;
                    }
                    button.setLoading(true);
                    return;
                }
                return;
            }
            xZ.e eVar3 = vasUnionV2Fragment.f323095u0;
            if (eVar3 == null) {
                eVar3 = null;
            }
            eVar3.b();
            uZ.e eVar4 = c47322c.f429228e;
            if (eVar4 != null && (progress = eVar4.getProgress()) != null) {
                float fFloatValue = progress.floatValue();
                ProgressBarRe23 progressBarRe233 = vasUnionV2Fragment.f323098x0;
                if (progressBarRe233 == null) {
                    progressBarRe233 = null;
                }
                progressBarRe233.setProgress(fFloatValue);
            }
            ProgressBarRe23 progressBarRe234 = vasUnionV2Fragment.f323098x0;
            if (progressBarRe234 == null) {
                progressBarRe234 = null;
            }
            D6.G(progressBarRe234, (eVar4 != null ? eVar4.getProgress() : null) != null);
            Button button4 = vasUnionV2Fragment.f323099y0;
            if (button4 == null) {
                button4 = null;
            }
            com.avito.android.mnz_common.extensions.i.a(button4, eVar4 != null ? eVar4.getButton() : null);
            com.avito.konveyor.adapter.d dVar = vasUnionV2Fragment.f323091q0;
            if (dVar == null) {
                dVar = null;
            }
            dVar.l(c47322c.f429232i, null);
            MnzFloatingFooter mnzFloatingFooter3 = vasUnionV2Fragment.f323085A0;
            if (mnzFloatingFooter3 == null) {
                mnzFloatingFooter3 = null;
            }
            D6.H(mnzFloatingFooter3);
            MnzFloatingFooter mnzFloatingFooter4 = vasUnionV2Fragment.f323085A0;
            MnzFloatingFooter mnzFloatingFooter5 = mnzFloatingFooter4 == null ? null : mnzFloatingFooter4;
            com.avito.android.util.text.a aVar2 = vasUnionV2Fragment.f323094t0;
            mnzFloatingFooter5.c(c47322c.f429237n, c47322c.f429238o, aVar2 != null ? aVar2 : null, new com.avito.android.vas_union.d(vasUnionV2Fragment), new com.avito.android.vas_union.e(vasUnionV2Fragment));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C47322c c47322c) {
            f(c47322c);
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = VasUnionV2Fragment.f323084D0;
            VasUnionV2Fragment.this.q5().accept(new InterfaceC47320a.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_union/ui/items/tabs/c$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_union/ui/items/tabs/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<c.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(c.a aVar) {
            a aVar2 = VasUnionV2Fragment.f323084D0;
            VasUnionV2Fragment.this.q5().accept(new InterfaceC47320a.j(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Integer, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            a aVar = VasUnionV2Fragment.f323084D0;
            VasUnionV2Fragment.this.q5().accept(new InterfaceC47320a.h(iIntValue));
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_select/c$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_union/ui/items/vas_performance_select/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<c.a, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(c.a aVar) {
            a aVar2 = VasUnionV2Fragment.f323084D0;
            VasUnionV2Fragment.this.q5().accept(new InterfaceC47320a.g(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_bundle/c$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_union/ui/items/vas_bundle/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<c.a, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(c.a aVar) {
            a aVar2 = VasUnionV2Fragment.f323084D0;
            VasUnionV2Fragment.this.q5().accept(new InterfaceC47320a.b(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f323107l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f323107l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f323107l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VasUnionV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f323109l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f323109l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f323109l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f323110l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f323110l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f323110l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f323111l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f323111l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f323111l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VasUnionV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/vas_union/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/vas_union/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.vas_union.i> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.vas_union.i invoke() {
            com.avito.android.vas_union.j jVar = VasUnionV2Fragment.this.f323088n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.vas_union.i) jVar.get();
        }
    }

    public VasUnionV2Fragment() {
        super(R.layout.vas_union_v2_fragment);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f323089o0 = new O0(m0.f406844a.b(com.avito.android.vas_union.i.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f323087C0 = new b();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.employee_stub_impl.view.a(this, (com.avito.android.deeplink_handler.view.impl.i) super.e5(), 5);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f323090p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        this.f323096v0 = view.findViewById(R.id.vas_union_v2_skeleton_item);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vas_union_v2_content_container);
        View view2 = this.f323096v0;
        if (view2 == null) {
            view2 = null;
        }
        final int i12 = 0;
        this.f323095u0 = new xZ.e(viewGroup, new View.OnClickListener(this) { // from class: com.avito.android.vas_union.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VasUnionV2Fragment f323116c;

            {
                this.f323116c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                VasUnionV2Fragment vasUnionV2Fragment = this.f323116c;
                switch (i12) {
                    case 0:
                        VasUnionV2Fragment.a aVar = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.d.f429209a);
                        break;
                    case 1:
                        VasUnionV2Fragment.a aVar2 = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.C12323a.f429205a);
                        break;
                    default:
                        VasUnionV2Fragment.a aVar3 = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.f.f429211a);
                        break;
                }
            }
        }, view2);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.mnz_toolbar);
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_union.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VasUnionV2Fragment f323116c;

            {
                this.f323116c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                VasUnionV2Fragment vasUnionV2Fragment = this.f323116c;
                switch (i13) {
                    case 0:
                        VasUnionV2Fragment.a aVar = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.d.f429209a);
                        break;
                    case 1:
                        VasUnionV2Fragment.a aVar2 = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.C12323a.f429205a);
                        break;
                    default:
                        VasUnionV2Fragment.a aVar3 = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.f.f429211a);
                        break;
                }
            }
        });
        this.f323097w0 = toolbar;
        this.f323098x0 = (ProgressBarRe23) view.findViewById(R.id.mnz_navigation_progress_bar);
        Button button = (Button) view.findViewById(R.id.mnz_help_button);
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_union.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VasUnionV2Fragment f323116c;

            {
                this.f323116c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                VasUnionV2Fragment vasUnionV2Fragment = this.f323116c;
                switch (i14) {
                    case 0:
                        VasUnionV2Fragment.a aVar = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.d.f429209a);
                        break;
                    case 1:
                        VasUnionV2Fragment.a aVar2 = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.C12323a.f429205a);
                        break;
                    default:
                        VasUnionV2Fragment.a aVar3 = VasUnionV2Fragment.f323084D0;
                        vasUnionV2Fragment.q5().accept(InterfaceC47320a.f.f429211a);
                        break;
                }
            }
        });
        this.f323099y0 = button;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.vas_union_v2_recycler_view);
        recyclerView.setItemAnimator(null);
        com.avito.konveyor.adapter.d dVar = this.f323091q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C48921a(), -1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f323090p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        this.f323100z0 = recyclerView;
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.vas_union_v2_floating_footer);
        mnzFloatingFooter.addOnLayoutChangeListener(new com.avito.android.util.bottom_gap.a(this, 2));
        this.f323085A0 = mnzFloatingFooter;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f323090p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, VasUnionV2Fragment.class, "handleEvent", "handleEvent(Lcom/avito/android/vas_union/mvi/entity/VasUnionV2OneTimeEvent;)V", 0), new d(1, this, VasUnionV2Fragment.class, "render", "render(Lcom/avito/android/vas_union/mvi/entity/VasUnionV2State;)V", 0));
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f323087C0);
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f323090p0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.vas_union.di.c.a().a((com.avito.android.vas_union.di.n) C29972i.a(C29972i.b(this), com.avito.android.vas_union.di.n.class), cv.c.b(this), s.c(this), C49166b.b(this), com.avito.android.mnz_common.extensions.d.c(this, "vas_union_v2_key_item_id"), com.avito.android.mnz_common.extensions.d.c(this, "vas_union_v2_key_checkout_context"), com.avito.android.mnz_common.extensions.d.a(this, "vas_union_v2_key_closable"), new e(), new f(), new g(), new h(), new i()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f323090p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f323090p0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f323092r0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final com.avito.android.vas_union.i q5() {
        return (com.avito.android.vas_union.i) this.f323089o0.getValue();
    }
}

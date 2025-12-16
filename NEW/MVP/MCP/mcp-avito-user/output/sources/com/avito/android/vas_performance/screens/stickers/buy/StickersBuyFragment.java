package com.avito.android.vas_performance.screens.stickers.buy;

import Cd.C13243a;
import KL0.a;
import KL0.b;
import KL0.c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
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
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.vas_performance.screens.stickers.buy.StickersBuyFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47312b;
import qK0.C47313c;
import v50.C49166b;
import w50.InterfaceC49447a;
import xZ.C49899a;
import z1.AbstractC50339a;

/* compiled from: StickersBuyFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/StickersBuyFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StickersBuyFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public static final a f320573L0;

    /* renamed from: M0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f320574M0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f320575A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f320576B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f320577C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f320578D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f320579E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public ProgressBar f320580F0;

    /* renamed from: G0, reason: collision with root package name */
    public InterfaceC49447a f320581G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.vas_performance.screens.stickers.buy.a f320582H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public C49899a f320583I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f320584J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final e f320585K0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f320586n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_performance.screens.stickers.buy.j f320587o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f320588p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f320589q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f320590r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f320591s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.vas_performance.screens.common_item.a f320592t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f320593u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f320594v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f320595w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47312b f320596x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f320597y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f320598z0;

    /* compiled from: StickersBuyFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/StickersBuyFragment$a;", "", "<init>", "()V", "", "KEY_CHECKOUT_CONTEXT", "Ljava/lang/String;", "KEY_CLOSEABLE", "KEY_CURRENT_FLOW", "KEY_ITEM_ID", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Bundle arguments = StickersBuyFragment.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("closable") : true);
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/a;", "sticker", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar) {
            a aVar2 = StickersBuyFragment.f320573L0;
            StickersBuyFragment.this.u5().accept(new a.d(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/a;", "sticker", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar) {
            a aVar2 = StickersBuyFragment.f320573L0;
            StickersBuyFragment.this.u5().accept(new a.e(aVar));
            return G0.f406611a;
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_performance/screens/stickers/buy/StickersBuyFragment$e", "Landroidx/activity/x;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends x {
        public e() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = StickersBuyFragment.f320573L0;
            StickersBuyFragment.this.u5().accept(a.C0566a.f9395a);
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<KL0.b, G0> {
        public final void f(@Y61.k KL0.b bVar) {
            StickersBuyFragment stickersBuyFragment = (StickersBuyFragment) this.receiver;
            a aVar = StickersBuyFragment.f320573L0;
            stickersBuyFragment.getClass();
            if (bVar instanceof b.a) {
                if (((Boolean) stickersBuyFragment.f320584J0.getValue()).booleanValue() || ((b.a) bVar).f9400a) {
                    InterfaceC49447a interfaceC49447a = stickersBuyFragment.f320581G0;
                    (interfaceC49447a != null ? interfaceC49447a : null).r1();
                    return;
                }
                e eVar = stickersBuyFragment.f320585K0;
                eVar.d(false);
                ActivityC22955m activityC22955mL1 = stickersBuyFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
                eVar.d(true);
                return;
            }
            if (bVar instanceof b.C0567b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = stickersBuyFragment.f320595w0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((b.C0567b) bVar).f9401a, null, null, 6);
                return;
            }
            if (bVar instanceof b.c) {
                b.c cVar = (b.c) bVar;
                com.avito.android.vas_performance.screens.stickers.buy.a aVar3 = stickersBuyFragment.f320582H0;
                if (aVar3 != null) {
                    aVar3.r();
                }
                Context contextRequireContext = stickersBuyFragment.requireContext();
                ScreenPerformanceTracker screenPerformanceTracker = stickersBuyFragment.f320593u0;
                ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
                com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar4 = cVar.f9402a;
                com.avito.android.vas_performance.screens.stickers.buy.f fVar = new com.avito.android.vas_performance.screens.stickers.buy.f(stickersBuyFragment, aVar4);
                com.avito.android.vas_performance.screens.stickers.buy.a aVar5 = new com.avito.android.vas_performance.screens.stickers.buy.a(contextRequireContext, 0, 2, null);
                aVar5.f320611E = fVar;
                screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
                com.avito.android.lib.design.bottom_sheet.j.c(aVar5, aVar4.f320662c, true, 0, 0, 0, 120);
                q qVar = aVar5.f178530x;
                if (qVar != null) {
                    qVar.D(true);
                }
                View viewInflate = LayoutInflater.from(contextRequireContext).inflate(R.layout.dialog_vas_sticker_buyer_description, (ViewGroup) null, false);
                aVar5.setContentView(viewInflate);
                D6.c(aVar5.findViewById(R.id.bottom_sheet_right_cross_header), null, Integer.valueOf(y6.b(18)), null, null, 13);
                View viewFindViewById = viewInflate.findViewById(R.id.description);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                ((TextView) viewFindViewById).setText(aVar4.f320664e);
                View viewFindViewById2 = viewInflate.findViewById(R.id.select);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                ((Button) viewFindViewById2).setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(aVar5, 5));
                ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
                stickersBuyFragment.f320582H0 = aVar5;
                com.avito.android.lib.util.g.a(aVar5);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(KL0.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<KL0.c, G0> {
        public final void f(@Y61.k KL0.c cVar) {
            G0 g02;
            G0 g03;
            MnzFloatingFooter mnzFloatingFooter;
            c.b.a aVar;
            G0 g04;
            Integer num;
            Button button;
            StickersBuyFragment stickersBuyFragment = (StickersBuyFragment) this.receiver;
            a aVar2 = StickersBuyFragment.f320573L0;
            stickersBuyFragment.getClass();
            c.b bVar = cVar.f9410g;
            if (bVar != null && (num = bVar.f9416d) != null) {
                int iIntValue = num.intValue();
                View view = stickersBuyFragment.getView();
                if (view != null && (button = (Button) view.findViewById(iIntValue)) != null) {
                    button.setLoading(bVar.f9415c);
                }
            }
            if (cVar.f9406c != null) {
                stickersBuyFragment.s5().a("");
                return;
            }
            if (cVar.f9405b) {
                stickersBuyFragment.s5().k(null);
                return;
            }
            stickersBuyFragment.s5().j();
            boolean z12 = (bVar != null ? bVar.f9413a : null) != null;
            stickersBuyFragment.q5().setVisibility(!z12 ? 0 : 8);
            C47313c c47313c = stickersBuyFragment.f320576B0;
            kotlin.reflect.n<Object>[] nVarArr = StickersBuyFragment.f320574M0;
            kotlin.reflect.n<Object> nVar = nVarArr[4];
            ((com.avito.android.mnz_common.ui.MnzFloatingFooter) c47313c.a()).setVisibility(z12 ? 0 : 8);
            Float f12 = cVar.f9409f;
            if (f12 != null) {
                float fFloatValue = f12.floatValue();
                ProgressBar progressBar = stickersBuyFragment.f320580F0;
                if (progressBar != null) {
                    progressBar.setProgress(fFloatValue);
                }
                D6.H(stickersBuyFragment.f320580F0);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                D6.w(stickersBuyFragment.f320580F0);
            }
            com.avito.konveyor.adapter.a aVar3 = stickersBuyFragment.f320586n0;
            if (aVar3 == null) {
                aVar3 = null;
            }
            aVar3.c(new UV0.c(cVar.f9408e));
            com.avito.konveyor.adapter.j jVar = stickersBuyFragment.f320589q0;
            if (jVar == null) {
                jVar = null;
            }
            jVar.notifyDataSetChanged();
            C47313c c47313c2 = stickersBuyFragment.f320598z0;
            c.C0568c c0568c = cVar.f9411h;
            if (c0568c != null) {
                kotlin.reflect.n<Object> nVar2 = nVarArr[2];
                D6.G((View) c47313c2.a(), true);
                AttributedText attributedText = c0568c.f9420b;
                if (attributedText != null) {
                    C47313c c47313c3 = stickersBuyFragment.f320577C0;
                    kotlin.reflect.n<Object> nVar3 = nVarArr[5];
                    com.avito.android.util.text.j.c((TextView) c47313c3.a(), attributedText, null);
                }
                Integer num2 = c0568c.f9419a;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    D6.G(stickersBuyFragment.r5(), true);
                    stickersBuyFragment.r5().setImageDrawable(C35835l0.h(iIntValue2, stickersBuyFragment.r5().getContext()));
                    g04 = G0.f406611a;
                } else {
                    g04 = null;
                }
                if (g04 == null) {
                    D6.w(stickersBuyFragment.r5());
                }
                D6.D(stickersBuyFragment.q5(), R.drawable.bg_avito_bottom_sheet);
                g03 = G0.f406611a;
            } else {
                g03 = null;
            }
            if (g03 == null) {
                kotlin.reflect.n<Object> nVar4 = nVarArr[2];
                D6.w((View) c47313c2.a());
                D6.D(stickersBuyFragment.q5(), R.drawable.bg_white_gradient);
            }
            if (bVar != null && (aVar = bVar.f9414b) != null) {
                C47313c c47313c4 = stickersBuyFragment.f320597y0;
                kotlin.reflect.n<Object> nVar5 = nVarArr[1];
                com.avito.android.lib.design.button.b.a((Button) c47313c4.a(), aVar.f9417a, false);
                kotlin.reflect.n<Object> nVar6 = nVarArr[1];
                ((Button) c47313c4.a()).setAppearanceFromAttr(aVar.f9418b);
            }
            if (bVar == null || (mnzFloatingFooter = bVar.f9413a) == null) {
                return;
            }
            kotlin.reflect.n<Object> nVar7 = nVarArr[4];
            com.avito.android.mnz_common.ui.MnzFloatingFooter mnzFloatingFooter2 = (com.avito.android.mnz_common.ui.MnzFloatingFooter) c47313c.a();
            com.avito.android.util.text.a aVar4 = stickersBuyFragment.f320594v0;
            mnzFloatingFooter2.d(mnzFloatingFooter, aVar4 != null ? aVar4 : null, new com.avito.android.vas_performance.screens.stickers.buy.d(stickersBuyFragment), new com.avito.android.vas_performance.screens.stickers.buy.e(stickersBuyFragment));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(KL0.c cVar) {
            f(cVar);
            return G0.f406611a;
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StickersBuyFragment.f320573L0;
            StickersBuyFragment.this.u5().accept(a.c.f9397a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f320604l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f320604l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f320604l);
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
            return StickersBuyFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f320606l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f320606l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f320606l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f320607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f320607l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f320607l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f320608l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f320608l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f320608l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StickersBuyFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/vas_performance/screens/stickers/buy/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.vas_performance.screens.stickers.buy.i> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.vas_performance.screens.stickers.buy.i invoke() {
            com.avito.android.vas_performance.screens.stickers.buy.j jVar = StickersBuyFragment.this.f320587o0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.vas_performance.screens.stickers.buy.i) jVar.get();
        }
    }

    static {
        Y y12 = new Y(StickersBuyFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f320574M0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyFragment.class, "infoSection", "getInfoSection()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyFragment.class, "footerContainer", "getFooterContainer()Landroid/view/ViewGroup;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyFragment.class, "floatingFooter", "getFloatingFooter()Lcom/avito/android/mnz_common/ui/MnzFloatingFooter;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyFragment.class, "infoText", "getInfoText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyFragment.class, "infoIcon", "getInfoIcon()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StickersBuyFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var)};
        f320573L0 = new a(null);
    }

    public StickersBuyFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f320588p0 = new O0(m0.f406844a.b(com.avito.android.vas_performance.screens.stickers.buy.i.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f320596x0 = new C47312b(null, 1, null);
        this.f320597y0 = new C47313c(null, 1, null);
        this.f320598z0 = new C47313c(null, 1, null);
        this.f320575A0 = new C47313c(null, 1, null);
        this.f320576B0 = new C47313c(null, 1, null);
        this.f320577C0 = new C47313c(null, 1, null);
        this.f320578D0 = new C47313c(null, 1, null);
        this.f320579E0 = new C47313c(null, 1, null);
        this.f320584J0 = C42727D.c(new b());
        this.f320585K0 = new e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        String string;
        String string2;
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("checkout_context")) == null) {
            throw new IllegalStateException("checkoutContext must not be null");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("item_id")) == null) {
            throw new IllegalStateException("itemId must not be null");
        }
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f320581G0 = interfaceC49447a;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.vas_performance.screens.stickers.buy.di.a.a().a(string2, string, s.c(this), new c(), new d(), (LL0.c) C29972i.a(C29972i.b(this), LL0.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f320591s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f320595w0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f320591s0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f320591s0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, u5(), new f(1, this, StickersBuyFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyOneTimeEvent;)V", 0), new g(1, this, StickersBuyFragment.class, "render", "render(Lcom/avito/android/vas_performance/screens/stickers/buy/mvi/entity/StickersBuyState;)V", 0));
        return layoutInflater.inflate(R.layout.stickers_vas_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.vas_performance.screens.stickers.buy.a aVar = this.f320582H0;
        if (aVar != null) {
            aVar.r();
        }
        this.f320582H0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        y f21241d;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.placeholder);
        InterfaceC28373a interfaceC28373a = this.f320590r0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler_view, interfaceC28373a != null ? interfaceC28373a : null, 0, 0, 24, null);
        C47313c c47313c = this.f320579E0;
        kotlin.reflect.n<Object>[] nVarArr = f320574M0;
        kotlin.reflect.n<Object> nVar = nVarArr[7];
        c47313c.b(this, lVar);
        s5().f231600j = new h();
        this.f320580F0 = (ProgressBar) view.findViewById(R.id.stickers_navigation_progress_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        this.f320596x0.b(this, recyclerView);
        Button button = (Button) view.findViewById(R.id.continue_button);
        C47313c c47313c2 = this.f320597y0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c2.b(this, button);
        View viewFindViewById = view.findViewById(R.id.info_section_group);
        C47313c c47313c3 = this.f320598z0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c3.b(this, viewFindViewById);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.footer_container);
        C47313c c47313c4 = this.f320575A0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, viewGroup2);
        com.avito.android.mnz_common.ui.MnzFloatingFooter mnzFloatingFooter = (com.avito.android.mnz_common.ui.MnzFloatingFooter) view.findViewById(R.id.stickers_vas_floating_footer);
        C47313c c47313c5 = this.f320576B0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[4];
        c47313c5.b(this, mnzFloatingFooter);
        TextView textView = (TextView) view.findViewById(R.id.info_text);
        C47313c c47313c6 = this.f320577C0;
        kotlin.reflect.n<Object> nVar7 = nVarArr[5];
        c47313c6.b(this, textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.info_icon);
        C47313c c47313c7 = this.f320578D0;
        kotlin.reflect.n<Object> nVar8 = nVarArr[6];
        c47313c7.b(this, imageView);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(((Boolean) this.f320584J0.getValue()).booleanValue() ? R.drawable.ic_close_24_black : R.drawable.ic_back_24);
        final int i12 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.screens.stickers.buy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyFragment f320613c;

            {
                this.f320613c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StickersBuyFragment stickersBuyFragment = this.f320613c;
                switch (i12) {
                    case 0:
                        StickersBuyFragment.a aVar = StickersBuyFragment.f320573L0;
                        stickersBuyFragment.u5().accept(new a.b(view2.getId()));
                        break;
                    default:
                        StickersBuyFragment.a aVar2 = StickersBuyFragment.f320573L0;
                        stickersBuyFragment.u5().accept(a.C0566a.f9395a);
                        break;
                }
            }
        });
        RecyclerView recyclerViewT5 = t5();
        com.avito.konveyor.adapter.j jVar = this.f320589q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewT5.setAdapter(jVar);
        RecyclerView recyclerViewT52 = t5();
        com.avito.android.vas_performance.screens.common_item.a aVar = this.f320592t0;
        if (aVar == null) {
            aVar = null;
        }
        recyclerViewT52.l(aVar, -1);
        final int i13 = 0;
        q5().addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.screens.stickers.buy.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyFragment f320615c;

            {
                this.f320615c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23) {
                StickersBuyFragment stickersBuyFragment = this.f320615c;
                switch (i13) {
                    case 0:
                        StickersBuyFragment.a aVar2 = StickersBuyFragment.f320573L0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a = stickersBuyFragment.f320583I0;
                            if (c49899a != null) {
                                stickersBuyFragment.t5().r0(c49899a);
                            }
                            C49899a c49899a2 = new C49899a(view2.getHeight());
                            stickersBuyFragment.t5().l(c49899a2, -1);
                            stickersBuyFragment.f320583I0 = c49899a2;
                            break;
                        }
                        break;
                    default:
                        StickersBuyFragment.a aVar3 = StickersBuyFragment.f320573L0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a3 = stickersBuyFragment.f320583I0;
                            if (c49899a3 != null) {
                                stickersBuyFragment.t5().r0(c49899a3);
                            }
                            C49899a c49899a4 = new C49899a(view2.getHeight());
                            stickersBuyFragment.t5().l(c49899a4, -1);
                            stickersBuyFragment.f320583I0 = c49899a4;
                            break;
                        }
                        break;
                }
            }
        });
        kotlin.reflect.n<Object> nVar9 = nVarArr[4];
        com.avito.android.mnz_common.ui.MnzFloatingFooter mnzFloatingFooter2 = (com.avito.android.mnz_common.ui.MnzFloatingFooter) c47313c5.a();
        final int i14 = 1;
        mnzFloatingFooter2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.screens.stickers.buy.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyFragment f320615c;

            {
                this.f320615c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i142, int i15, int i16, int i17, int i18, int i19, int i22, int i23) {
                StickersBuyFragment stickersBuyFragment = this.f320615c;
                switch (i14) {
                    case 0:
                        StickersBuyFragment.a aVar2 = StickersBuyFragment.f320573L0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a = stickersBuyFragment.f320583I0;
                            if (c49899a != null) {
                                stickersBuyFragment.t5().r0(c49899a);
                            }
                            C49899a c49899a2 = new C49899a(view2.getHeight());
                            stickersBuyFragment.t5().l(c49899a2, -1);
                            stickersBuyFragment.f320583I0 = c49899a2;
                            break;
                        }
                        break;
                    default:
                        StickersBuyFragment.a aVar3 = StickersBuyFragment.f320573L0;
                        if (view2.getHeight() > 0) {
                            C49899a c49899a3 = stickersBuyFragment.f320583I0;
                            if (c49899a3 != null) {
                                stickersBuyFragment.t5().r0(c49899a3);
                            }
                            C49899a c49899a4 = new C49899a(view2.getHeight());
                            stickersBuyFragment.t5().l(c49899a4, -1);
                            stickersBuyFragment.f320583I0 = c49899a4;
                            break;
                        }
                        break;
                }
            }
        });
        kotlin.reflect.n<Object> nVar10 = nVarArr[1];
        Button button2 = (Button) c47313c2.a();
        final int i15 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.screens.stickers.buy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StickersBuyFragment f320613c;

            {
                this.f320613c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StickersBuyFragment stickersBuyFragment = this.f320613c;
                switch (i15) {
                    case 0:
                        StickersBuyFragment.a aVar2 = StickersBuyFragment.f320573L0;
                        stickersBuyFragment.u5().accept(new a.b(view2.getId()));
                        break;
                    default:
                        StickersBuyFragment.a aVar22 = StickersBuyFragment.f320573L0;
                        stickersBuyFragment.u5().accept(a.C0566a.f9395a);
                        break;
                }
            }
        });
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f320585K0);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f320591s0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    public final ViewGroup q5() {
        C47313c c47313c = this.f320575A0;
        kotlin.reflect.n<Object> nVar = f320574M0[3];
        return (ViewGroup) c47313c.a();
    }

    public final ImageView r5() {
        C47313c c47313c = this.f320578D0;
        kotlin.reflect.n<Object> nVar = f320574M0[6];
        return (ImageView) c47313c.a();
    }

    public final com.avito.android.progress_overlay.l s5() {
        C47313c c47313c = this.f320579E0;
        kotlin.reflect.n<Object> nVar = f320574M0[7];
        return (com.avito.android.progress_overlay.l) c47313c.a();
    }

    public final RecyclerView t5() {
        kotlin.reflect.n<Object> nVar = f320574M0[0];
        return (RecyclerView) this.f320596x0.a();
    }

    public final com.avito.android.vas_performance.screens.stickers.buy.i u5() {
        return (com.avito.android.vas_performance.screens.stickers.buy.i) this.f320588p0.getValue();
    }
}

package com.avito.android.str_calendar.seller.reject;

import Cd.C13243a;
import Ly0.InterfaceC14455a;
import Ly0.InterfaceC14456b;
import Y41.l;
import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.StrSellerCalendarRejectScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.str_calendar.seller.reject.StrCalendarRejectFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.I5;
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
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: StrCalendarRejectFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/StrCalendarRejectFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrCalendarRejectFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f288015x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f288016y0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.reject.e f288017n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f288018o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f288019p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f288020q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.core.c f288021r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final C47313c f288022s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C47313c f288023t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f288024u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f288025v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f288026w0;

    /* compiled from: StrCalendarRejectFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/StrCalendarRejectFragment$a;", "", "<init>", "()V", "", "REJECT_INFO_CANT_BE_NULL_ERROR", "Ljava/lang/String;", "REJECT_INFO_KEY", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrCalendarRejectFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC14456b, G0> {
        public final void f(@k InterfaceC14456b interfaceC14456b) {
            StrCalendarRejectFragment strCalendarRejectFragment = (StrCalendarRejectFragment) this.receiver;
            a aVar = StrCalendarRejectFragment.f288015x0;
            strCalendarRejectFragment.getClass();
            if (!(interfaceC14456b instanceof InterfaceC14456b.C0651b)) {
                if (interfaceC14456b instanceof InterfaceC14456b.a) {
                    C43259k.d(C22981N.a(strCalendarRejectFragment.getLifecycle()), null, null, new com.avito.android.str_calendar.seller.reject.b(strCalendarRejectFragment, null), 3);
                }
            } else {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = strCalendarRejectFragment.f288020q0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC14456b.C0651b) interfaceC14456b).f10309a, null, null, 6);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC14456b interfaceC14456b) {
            f(interfaceC14456b);
            return G0.f406611a;
        }
    }

    /* compiled from: StrCalendarRejectFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLy0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LLy0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Ly0.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Ly0.c cVar) {
            StrCalendarRejectFragment strCalendarRejectFragment = StrCalendarRejectFragment.this;
            C47313c c47313c = strCalendarRejectFragment.f288023t0;
            n<Object>[] nVarArr = StrCalendarRejectFragment.f288016y0;
            n<Object> nVar = nVarArr[1];
            TextView textView = (TextView) c47313c.a();
            Ly0.d dVar = cVar.f10312c;
            I5.a(textView, dVar.f10313a, false);
            C47313c c47313c2 = strCalendarRejectFragment.f288024u0;
            n<Object> nVar2 = nVarArr[2];
            I5.a((TextView) c47313c2.a(), dVar.f10314b, false);
            C47313c c47313c3 = strCalendarRejectFragment.f288025v0;
            n<Object> nVar3 = nVarArr[3];
            I5.a((TextView) c47313c3.a(), dVar.f10315c, false);
            C47313c c47313c4 = strCalendarRejectFragment.f288026w0;
            n<Object> nVar4 = nVarArr[4];
            com.avito.android.lib.design.button.b.a((Button) c47313c4.a(), dVar.f10316d, false);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f288028l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f288028l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f288028l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrCalendarRejectFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f288030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f288030l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f288030l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288031l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f288031l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f288032l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f288032l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f288032l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrCalendarRejectFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/reject/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_calendar/seller/reject/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.str_calendar.seller.reject.d> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_calendar.seller.reject.d invoke() {
            com.avito.android.str_calendar.seller.reject.e eVar = StrCalendarRejectFragment.this.f288017n0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.str_calendar.seller.reject.d) eVar.get();
        }
    }

    static {
        Y y12 = new Y(StrCalendarRejectFragment.class, "closeButton", "getCloseButton()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f288016y0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(StrCalendarRejectFragment.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StrCalendarRejectFragment.class, "rejectTitleView", "getRejectTitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StrCalendarRejectFragment.class, "rejectSubtitleView", "getRejectSubtitleView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(StrCalendarRejectFragment.class, "buttonView", "getButtonView()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f288015x0 = new a(null);
    }

    public StrCalendarRejectFragment() {
        super(R.layout.str_calendar_reject_info_fragment);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f288018o0 = new O0(m0.f406844a.b(com.avito.android.str_calendar.seller.reject.d.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f288022s0 = new C47313c(null, 1, null);
        this.f288023t0 = new C47313c(null, 1, null);
        this.f288024u0 = new C47313c(null, 1, null);
        this.f288025v0 = new C47313c(null, 1, null);
        this.f288026w0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f288019p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f288019p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        View viewFindViewById = view.findViewById(R.id.close_button);
        C47313c c47313c = this.f288022s0;
        n<Object>[] nVarArr = f288016y0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, viewFindViewById);
        TextView textView = (TextView) view.findViewById(R.id.title_text_view);
        C47313c c47313c2 = this.f288023t0;
        n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.reject_title);
        C47313c c47313c3 = this.f288024u0;
        n<Object> nVar3 = nVarArr[2];
        c47313c3.b(this, textView2);
        TextView textView3 = (TextView) view.findViewById(R.id.reject_subtitle);
        C47313c c47313c4 = this.f288025v0;
        n<Object> nVar4 = nVarArr[3];
        c47313c4.b(this, textView3);
        Button button = (Button) view.findViewById(R.id.button);
        C47313c c47313c5 = this.f288026w0;
        n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, button);
        n<Object> nVar6 = nVarArr[0];
        final int i12 = 0;
        ((View) c47313c.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.seller.reject.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrCalendarRejectFragment f288035c;

            {
                this.f288035c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrCalendarRejectFragment strCalendarRejectFragment = this.f288035c;
                switch (i12) {
                    case 0:
                        StrCalendarRejectFragment.a aVar = StrCalendarRejectFragment.f288015x0;
                        ((d) strCalendarRejectFragment.f288018o0.getValue()).accept(InterfaceC14455a.C0650a.f10306a);
                        break;
                    default:
                        StrCalendarRejectFragment.a aVar2 = StrCalendarRejectFragment.f288015x0;
                        ((d) strCalendarRejectFragment.f288018o0.getValue()).accept(InterfaceC14455a.b.f10307a);
                        break;
                }
            }
        });
        n<Object> nVar7 = nVarArr[4];
        final int i13 = 1;
        ((Button) c47313c5.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_calendar.seller.reject.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrCalendarRejectFragment f288035c;

            {
                this.f288035c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrCalendarRejectFragment strCalendarRejectFragment = this.f288035c;
                switch (i13) {
                    case 0:
                        StrCalendarRejectFragment.a aVar = StrCalendarRejectFragment.f288015x0;
                        ((d) strCalendarRejectFragment.f288018o0.getValue()).accept(InterfaceC14455a.C0650a.f10306a);
                        break;
                    default:
                        StrCalendarRejectFragment.a aVar2 = StrCalendarRejectFragment.f288015x0;
                        ((d) strCalendarRejectFragment.f288018o0.getValue()).accept(InterfaceC14455a.b.f10307a);
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f288019p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.str_calendar.seller.reject.d) this.f288018o0.getValue(), new b(1, this, StrCalendarRejectFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_calendar/seller/reject/mvi/entity/StrCalendarRejectOneTimeEvent;)V", 0), new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            StrSellerCalendarRejectInfo strSellerCalendarRejectInfo = (StrSellerCalendarRejectInfo) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("reject_info", StrSellerCalendarRejectInfo.class) : arguments.getParcelable("reject_info"));
            if (strSellerCalendarRejectInfo != null) {
                com.avito.android.str_calendar.seller.reject.di.a.a().a((com.avito.android.str_calendar.seller.reject.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.reject.di.c.class), (com.avito.android.str_calendar.seller.core.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.core.di.c.class), cv.c.b(this), new C28478k(StrSellerCalendarRejectScreen.f90518d, s.c(this), null, 4, null), strSellerCalendarRejectInfo).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f288019p0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                return;
            }
        }
        throw new IllegalStateException("rejectInfo should not be null");
    }
}

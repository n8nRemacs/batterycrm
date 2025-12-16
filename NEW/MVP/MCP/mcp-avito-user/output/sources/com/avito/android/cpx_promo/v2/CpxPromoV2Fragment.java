package com.avito.android.cpx_promo.v2;

import Cd.C13243a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import androidx.view.y;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import com.avito.android.cpx_promo.v2.CpxPromoV2Fragment;
import com.avito.android.cpx_promo.v2.compose.a;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import com.avito.android.cpx_promo.v2.mvi.entity.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V0;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import js.C42419a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ks.InterfaceC43492a;
import v50.C49166b;
import z1.AbstractC50339a;

/* compiled from: CpxPromoV2Fragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpx_promo/v2/CpxPromoV2Fragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoV2Fragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final b f127346s0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public r f127347n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f127348o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f127349p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f127350q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final d f127351r0;

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/v2/CpxPromoV2Fragment$a;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        @Y61.k
        public final Input f127352A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.k
        public final TextView f127353B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.k
        public final ComposeView f127354C;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ShimmerLayout f127355a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final xZ.e f127356b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final FrameLayout f127357c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ScrollView f127358d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final NavBar f127359e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Button f127360f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final TextView f127361g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final TextView f127362h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final TextView f127363i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final SegmentedControl f127364j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final ComposeView f127365k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final TextView f127366l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final Chips f127367m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final TextView f127368n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final Input f127369o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public final TextView f127370p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        public final TextView f127371q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.k
        public final LinearLayout f127372r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.k
        public final Slider f127373s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.k
        public final Slider f127374t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.k
        public final TextView f127375u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.k
        public final LinearLayout f127376v;

        /* renamed from: w, reason: collision with root package name */
        @Y61.k
        public final TextView f127377w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.k
        public final TextView f127378x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.k
        public final LinearLayout f127379y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.k
        public final TextView f127380z;

        public a(@Y61.k ShimmerLayout shimmerLayout, @Y61.k xZ.e eVar, @Y61.k FrameLayout frameLayout, @Y61.k ScrollView scrollView, @Y61.k NavBar navBar, @Y61.k Button button, @Y61.k TextView textView, @Y61.k TextView textView2, @Y61.k TextView textView3, @Y61.k SegmentedControl segmentedControl, @Y61.k ComposeView composeView, @Y61.k TextView textView4, @Y61.k Chips chips, @Y61.k TextView textView5, @Y61.k Input input, @Y61.k TextView textView6, @Y61.k TextView textView7, @Y61.k LinearLayout linearLayout, @Y61.k ImageView imageView, @Y61.k Slider slider, @Y61.k Slider slider2, @Y61.k TextView textView8, @Y61.k LinearLayout linearLayout2, @Y61.k TextView textView9, @Y61.k TextView textView10, @Y61.k LinearLayout linearLayout3, @Y61.k TextView textView11, @Y61.k Input input2, @Y61.k TextView textView12, @Y61.k ComposeView composeView2) {
            this.f127355a = shimmerLayout;
            this.f127356b = eVar;
            this.f127357c = frameLayout;
            this.f127358d = scrollView;
            this.f127359e = navBar;
            this.f127360f = button;
            this.f127361g = textView;
            this.f127362h = textView2;
            this.f127363i = textView3;
            this.f127364j = segmentedControl;
            this.f127365k = composeView;
            this.f127366l = textView4;
            this.f127367m = chips;
            this.f127368n = textView5;
            this.f127369o = input;
            this.f127370p = textView6;
            this.f127371q = textView7;
            this.f127372r = linearLayout;
            this.f127373s = slider;
            this.f127374t = slider2;
            this.f127375u = textView8;
            this.f127376v = linearLayout2;
            this.f127377w = textView9;
            this.f127378x = textView10;
            this.f127379y = linearLayout3;
            this.f127380z = textView11;
            this.f127352A = input2;
            this.f127353B = textView12;
            this.f127354C = composeView2;
        }
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/cpx_promo/v2/CpxPromoV2Fragment$b;", "", "<init>", "()V", "", "ARG_CONTEXT", "Ljava/lang/String;", "ARG_CURRENT_FLOW", "ARG_ITEM_ID", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f127382m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeepLink deepLink) {
            super(0);
            this.f127382m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = CpxPromoV2Fragment.f127346s0;
            CpxPromoV2Fragment.this.r5().accept(new a.m(this.f127382m));
            return G0.f406611a;
        }
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cpx_promo/v2/CpxPromoV2Fragment$d", "Landroidx/activity/x;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends x {
        public d() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            CpxPromoV2Fragment cpxPromoV2Fragment = CpxPromoV2Fragment.this;
            b bVar = CpxPromoV2Fragment.f127346s0;
            cpxPromoV2Fragment.r5().accept(a.C3795a.f127689a);
        }
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<CpxPromoV2State, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f127385m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a aVar) {
            super(1);
            this.f127385m = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(CpxPromoV2State cpxPromoV2State) {
            CpxPromoV2State cpxPromoV2State2 = cpxPromoV2State;
            b bVar = CpxPromoV2Fragment.f127346s0;
            CpxPromoV2Fragment cpxPromoV2Fragment = CpxPromoV2Fragment.this;
            boolean z12 = cpxPromoV2State2.f127624b;
            a aVar = this.f127385m;
            xZ.e eVar = aVar.f127356b;
            ScrollView scrollView = aVar.f127358d;
            FrameLayout frameLayout = aVar.f127357c;
            ShimmerLayout shimmerLayout = aVar.f127355a;
            if (z12) {
                D6.H(shimmerLayout);
                shimmerLayout.c();
                D6.w(frameLayout);
                D6.w(scrollView);
                eVar.c();
            } else {
                String str = cpxPromoV2State2.f127625c;
                if (str == null || str.length() == 0) {
                    D6.w(shimmerLayout);
                    shimmerLayout.d();
                    D6.H(scrollView);
                    D6.H(frameLayout);
                    eVar.b();
                    com.avito.android.cpx_promo.v2.m mVar = new com.avito.android.cpx_promo.v2.m(cpxPromoV2Fragment);
                    NavBar navBar = aVar.f127359e;
                    int i12 = NavBar.f179818g;
                    navBar.c(R.attr.ic_arrowBack24, mVar);
                    Button button = aVar.f127360f;
                    com.avito.android.lib.design.button.b.a(button, cpxPromoV2State2.f127627e, false);
                    navBar.setActions(button);
                    Object obj = null;
                    com.avito.android.util.text.j.a(aVar.f127361g, cpxPromoV2State2.f127628f, null);
                    com.avito.android.util.text.j.a(aVar.f127362h, cpxPromoV2State2.f127629g, null);
                    CpxPromoV2State.f fVar = cpxPromoV2State2.f127630h;
                    C42419a c42419a = fVar.f127667a;
                    TextView textView = aVar.f127363i;
                    cpxPromoV2Fragment.q5(textView, c42419a);
                    SegmentedControl segmentedControl = aVar.f127364j;
                    ArrayList arrayList = fVar.f127668b;
                    if (arrayList != null) {
                        segmentedControl.q(fVar.f127669c ? 0 : arrayList.size() - 1, arrayList);
                    }
                    boolean z13 = fVar.f127670d;
                    textView.setVisibility(z13 ? 0 : 8);
                    segmentedControl.setVisibility(z13 ? 0 : 8);
                    CpxPromoV2State.c cVar = cpxPromoV2State2.f127631i;
                    boolean z14 = cVar.f127653a;
                    a.b bVar2 = cVar.f127654b;
                    int i13 = (!z14 || bVar2 == null) ? 8 : 0;
                    ComposeView composeView = aVar.f127365k;
                    composeView.setVisibility(i13);
                    if (bVar2 != null) {
                        composeView.setContent(new C22096n(1715418048, new com.avito.android.cpx_promo.v2.g(cVar, cpxPromoV2Fragment), true));
                    }
                    CpxPromoV2State.b bVar3 = cpxPromoV2State2.f127632j;
                    boolean z15 = bVar3.f127649a;
                    Chips chips = aVar.f127367m;
                    TextView textView2 = aVar.f127366l;
                    if (z15) {
                        D6.H(textView2);
                        D6.H(chips);
                        cpxPromoV2Fragment.q5(textView2, bVar3.f127650b);
                        ?? r52 = bVar3.f127651c;
                        chips.setData(r52);
                        Iterator it = ((Iterable) r52).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((CpxPromoV2State.a) next).f127647b == bVar3.f127652d) {
                                obj = next;
                                break;
                            }
                        }
                        CpxPromoV2State.a aVar2 = (CpxPromoV2State.a) obj;
                        if (aVar2 != null) {
                            chips.q(aVar2, false);
                            G0 g02 = G0.f406611a;
                        }
                    } else {
                        D6.w(textView2);
                        D6.w(chips);
                        G0 g03 = G0.f406611a;
                    }
                    Slider slider = aVar.f127373s;
                    Context context = slider.getContext();
                    CpxPromoV2State.g gVar = cpxPromoV2State2.f127633k;
                    cpxPromoV2Fragment.q5(aVar.f127368n, gVar.f127671a);
                    Input input = aVar.f127369o;
                    Input.t(input, gVar.f127673c, false, 6);
                    input.setHint(gVar.f127686p);
                    I5.a(aVar.f127370p, gVar.f127674d, false);
                    I5.a(aVar.f127377w, gVar.f127677g, false);
                    TextView textView3 = aVar.f127378x;
                    String str2 = gVar.f127678h;
                    I5.a(textView3, str2, false);
                    LinearLayout linearLayout = aVar.f127376v;
                    Integer num = gVar.f127679i;
                    if (num != null) {
                        linearLayout.getBackground().setTint(C35835l0.d(num.intValue(), context));
                    }
                    D6.G(linearLayout, str2 != null);
                    boolean z16 = gVar.f127676f;
                    String str3 = gVar.f127675e;
                    boolean z17 = (z16 || str3 == null || str3.length() == 0) ? false : true;
                    D6.G(aVar.f127372r, z17);
                    cpxPromoV2Fragment.r5().accept(new a.k(z17));
                    I5.a(aVar.f127371q, str3, false);
                    int iD2 = C35835l0.d(gVar.f127680j, context);
                    slider.setThumbTintList(ColorStateList.valueOf(iD2));
                    slider.setTrackActiveTintList(ColorStateList.valueOf(iD2));
                    float f12 = gVar.f127681k;
                    slider.setValueTo(f12);
                    slider.setValue(gVar.f127682l);
                    Integer num2 = gVar.f127687q;
                    int i14 = num2 != null ? 0 : 8;
                    Slider slider2 = aVar.f127374t;
                    slider2.setVisibility(i14);
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        slider2.setValueTo(f12);
                        slider2.setValue(iIntValue);
                    }
                    I5.a(aVar.f127375u, gVar.f127688r, false);
                    aVar.f127354C.setContent(new C22096n(-385783895, new com.avito.android.cpx_promo.v2.l(cpxPromoV2State2.f127635m, aVar, cpxPromoV2Fragment), true));
                    CpxPromoV2State.e eVar2 = cpxPromoV2State2.f127634l;
                    boolean z18 = eVar2.f127655a;
                    LinearLayout linearLayout2 = aVar.f127379y;
                    if (z18) {
                        D6.H(linearLayout2);
                        cpxPromoV2Fragment.q5(aVar.f127380z, eVar2.f127657c);
                        Input input2 = aVar.f127352A;
                        input2.setHint(eVar2.f127660f);
                        Input.t(input2, eVar2.f127658d, false, 6);
                        input2.setState(C42745f0.L0(eVar2.f127661g));
                        TextView textView4 = aVar.f127353B;
                        String str4 = eVar2.f127662h;
                        I5.a(textView4, str4, false);
                        Integer num3 = eVar2.f127663i;
                        if (num3 != null) {
                            int iIntValue2 = num3.intValue();
                            Context context2 = cpxPromoV2Fragment.getContext();
                            if (context2 != null) {
                                textView4.setTextColor(C35835l0.d(iIntValue2, context2));
                            }
                        }
                        textView4.setVisibility((str4 == null || str4.length() == 0) ? 8 : 0);
                    } else {
                        D6.w(linearLayout2);
                    }
                } else {
                    D6.w(shimmerLayout);
                    shimmerLayout.d();
                    D6.H(frameLayout);
                    D6.w(scrollView);
                    eVar.d(str);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "segmentPosition", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<Integer, CharSequence, G0> {
        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, CharSequence charSequence) {
            int iIntValue = num.intValue();
            b bVar = CpxPromoV2Fragment.f127346s0;
            CpxPromoV2Fragment.this.r5().accept(new a.i(iIntValue == 0));
            return G0.f406611a;
        }
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<InterfaceC43492a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC43492a interfaceC43492a) {
            Bundle bundle;
            InterfaceC43492a interfaceC43492a2 = interfaceC43492a;
            CpxPromoV2Fragment cpxPromoV2Fragment = (CpxPromoV2Fragment) this.receiver;
            b bVar = CpxPromoV2Fragment.f127346s0;
            cpxPromoV2Fragment.getClass();
            if (interfaceC43492a2 instanceof InterfaceC43492a.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = cpxPromoV2Fragment.f127349p0;
                if (aVar == null) {
                    aVar = null;
                }
                InterfaceC43492a.b bVar2 = (InterfaceC43492a.b) interfaceC43492a2;
                CpxPromoPriceInputContent cpxPromoPriceInputContent = bVar2.f413254b;
                if (cpxPromoPriceInputContent != null) {
                    bundle = new Bundle();
                    bundle.putParcelable("cpx_promo_price_input_content", cpxPromoPriceInputContent);
                } else {
                    bundle = null;
                }
                b.a.a(aVar, bVar2.f413253a, null, bundle, 2);
            } else if (interfaceC43492a2 instanceof InterfaceC43492a.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                ApiError apiError = ((InterfaceC43492a.c) interfaceC43492a2).f413255a;
                com.avito.android.component.toast.c.c(cVar, cpxPromoV2Fragment, com.avito.android.printable_text.b.f(z.k(apiError)), null, null, new f.c(apiError), 0, ToastBarPosition.f181046d, 942);
            } else {
                if (!(interfaceC43492a2 instanceof InterfaceC43492a.C11761a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d dVar = cpxPromoV2Fragment.f127351r0;
                dVar.d(false);
                ActivityC22955m activityC22955mL1 = cpxPromoV2Fragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
                dVar.d(true);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f127388l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f127388l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f127388l);
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
            return CpxPromoV2Fragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f127390l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f127390l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f127390l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f127391l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f127391l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f127391l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f127392l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f127392l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f127392l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/v2/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cpx_promo/v2/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<q> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = CpxPromoV2Fragment.this.f127347n0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    public CpxPromoV2Fragment() {
        super(R.layout.cpx_promo_v2_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f127348o0 = new O0(m0.f406844a.b(q.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f127351r0 = new d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f127350q0;
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
        View viewInflate = getLayoutInflater().inflate(R.layout.view_cpx_promo_help_button, (ViewGroup) null);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.cpx_promo_content_container);
        final int i12 = 0;
        xZ.e eVar = new xZ.e(frameLayout, new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.v2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoV2Fragment f127397c;

            {
                this.f127397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoV2Fragment cpxPromoV2Fragment = this.f127397c;
                switch (i12) {
                    case 0:
                        CpxPromoV2Fragment.b bVar = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.h.f127695a);
                        break;
                    case 1:
                        CpxPromoV2Fragment.b bVar2 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoV2Fragment.b bVar3 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.e.f127693a);
                        break;
                    case 3:
                        CpxPromoV2Fragment.b bVar4 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.j.f127697a);
                        break;
                    case 4:
                        CpxPromoV2Fragment.b bVar5 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.g());
                        break;
                    default:
                        CpxPromoV2Fragment.b bVar6 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        }, null, 4, null);
        ShimmerLayout shimmerLayout = (ShimmerLayout) view.findViewById(R.id.cpx_promo_loading_container);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.cpx_promo_content_scroll);
        NavBar navBar = (NavBar) view.findViewById(R.id.cpx_promo_nav_bar);
        Button button = (Button) viewInflate.findViewById(R.id.cpx_promo_help_button);
        TextView textView = (TextView) view.findViewById(R.id.cpx_promo_title);
        TextView textView2 = (TextView) view.findViewById(R.id.cpx_promo_subtitle);
        TextView textView3 = (TextView) view.findViewById(R.id.cpx_promo_segmented_control_title);
        SegmentedControl segmentedControl = (SegmentedControl) view.findViewById(R.id.cpx_promo_segmented_control_mode);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.cpx_promo_cashback_banner_view);
        TextView textView4 = (TextView) view.findViewById(R.id.cpx_promo_budget_title);
        Chips chips = (Chips) view.findViewById(R.id.cpx_promo_budget_chips);
        TextView textView5 = (TextView) view.findViewById(R.id.cpx_promo_slider_title);
        Input input = (Input) view.findViewById(R.id.cpx_promo_slider_input);
        TextView textView6 = (TextView) view.findViewById(R.id.cpx_promo_slider_description);
        TextView textView7 = (TextView) view.findViewById(R.id.cpx_promo_slider_info);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cpx_promo_slider_info_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.cpx_promo_slider_info_close);
        Slider slider = (Slider) view.findViewById(R.id.cpx_promo_slider);
        Slider slider2 = (Slider) view.findViewById(R.id.cpx_promo_slider_cashback);
        TextView textView8 = (TextView) view.findViewById(R.id.cpx_promo_cashback_bonuses);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.cpx_promo_trigger_info_container);
        TextView textView9 = (TextView) view.findViewById(R.id.cpx_promo_trigger_info_title);
        TextView textView10 = (TextView) view.findViewById(R.id.cpx_promo_trigger_info_description);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.cpx_promo_limit_container);
        TextView textView11 = (TextView) view.findViewById(R.id.cpx_promo_limit_title);
        Input input2 = (Input) view.findViewById(R.id.cpx_promo_limit_input);
        a aVar = new a(shimmerLayout, eVar, frameLayout, scrollView, navBar, button, textView, textView2, textView3, segmentedControl, composeView, textView4, chips, textView5, input, textView6, textView7, linearLayout, imageView, slider, slider2, textView8, linearLayout2, textView9, textView10, linearLayout3, textView11, input2, (TextView) view.findViewById(R.id.cpx_promo_limit_hint), (ComposeView) view.findViewById(R.id.cpx_promo_compose_view_footer));
        segmentedControl.setOnSegmentClickListener(new f());
        chips.setChipsSelectedListener(new g());
        slider.y(new com.avito.android.cpx_promo.impl.b(this, 1));
        Drawable drawable = androidx.core.content.d.getDrawable(slider2.getContext(), R.drawable.cpx_promo_v2_slider_cashback_thumb);
        if (drawable != null) {
            slider2.setCustomThumbDrawable(drawable);
        }
        ComponentType componentType = ComponentType.f179284e;
        input.setComponentType(componentType);
        final int i13 = 1;
        input.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.v2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoV2Fragment f127397c;

            {
                this.f127397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoV2Fragment cpxPromoV2Fragment = this.f127397c;
                switch (i13) {
                    case 0:
                        CpxPromoV2Fragment.b bVar = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.h.f127695a);
                        break;
                    case 1:
                        CpxPromoV2Fragment.b bVar2 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoV2Fragment.b bVar3 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.e.f127693a);
                        break;
                    case 3:
                        CpxPromoV2Fragment.b bVar4 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.j.f127697a);
                        break;
                    case 4:
                        CpxPromoV2Fragment.b bVar5 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.g());
                        break;
                    default:
                        CpxPromoV2Fragment.b bVar6 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.v2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoV2Fragment f127397c;

            {
                this.f127397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoV2Fragment cpxPromoV2Fragment = this.f127397c;
                switch (i14) {
                    case 0:
                        CpxPromoV2Fragment.b bVar = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.h.f127695a);
                        break;
                    case 1:
                        CpxPromoV2Fragment.b bVar2 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoV2Fragment.b bVar3 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.e.f127693a);
                        break;
                    case 3:
                        CpxPromoV2Fragment.b bVar4 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.j.f127697a);
                        break;
                    case 4:
                        CpxPromoV2Fragment.b bVar5 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.g());
                        break;
                    default:
                        CpxPromoV2Fragment.b bVar6 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i15 = 3;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.v2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoV2Fragment f127397c;

            {
                this.f127397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoV2Fragment cpxPromoV2Fragment = this.f127397c;
                switch (i15) {
                    case 0:
                        CpxPromoV2Fragment.b bVar = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.h.f127695a);
                        break;
                    case 1:
                        CpxPromoV2Fragment.b bVar2 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoV2Fragment.b bVar3 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.e.f127693a);
                        break;
                    case 3:
                        CpxPromoV2Fragment.b bVar4 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.j.f127697a);
                        break;
                    case 4:
                        CpxPromoV2Fragment.b bVar5 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.g());
                        break;
                    default:
                        CpxPromoV2Fragment.b bVar6 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i16 = 4;
        input2.setClearButtonClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.v2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoV2Fragment f127397c;

            {
                this.f127397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoV2Fragment cpxPromoV2Fragment = this.f127397c;
                switch (i16) {
                    case 0:
                        CpxPromoV2Fragment.b bVar = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.h.f127695a);
                        break;
                    case 1:
                        CpxPromoV2Fragment.b bVar2 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoV2Fragment.b bVar3 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.e.f127693a);
                        break;
                    case 3:
                        CpxPromoV2Fragment.b bVar4 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.j.f127697a);
                        break;
                    case 4:
                        CpxPromoV2Fragment.b bVar5 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.g());
                        break;
                    default:
                        CpxPromoV2Fragment.b bVar6 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        input2.setClearButtonVisibleUnfocused(true);
        input2.setComponentType(componentType);
        final int i17 = 5;
        input2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.v2.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoV2Fragment f127397c;

            {
                this.f127397c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoV2Fragment cpxPromoV2Fragment = this.f127397c;
                switch (i17) {
                    case 0:
                        CpxPromoV2Fragment.b bVar = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.h.f127695a);
                        break;
                    case 1:
                        CpxPromoV2Fragment.b bVar2 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoV2Fragment.b bVar3 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.e.f127693a);
                        break;
                    case 3:
                        CpxPromoV2Fragment.b bVar4 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(a.j.f127697a);
                        break;
                    case 4:
                        CpxPromoV2Fragment.b bVar5 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.g());
                        break;
                    default:
                        CpxPromoV2Fragment.b bVar6 = CpxPromoV2Fragment.f127346s0;
                        cpxPromoV2Fragment.r5().accept(new a.f(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f127351r0);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f127350q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, r5(), new h(1, this, CpxPromoV2Fragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2OneTimeEvent;)V", 0), new e(aVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f127350q0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg.context") : null;
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("arg.item_id") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString("arg.current_flow") : null;
        if (string3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.cpx_promo.v2.di.k.a().a((com.avito.android.cpx_promo.v2.di.f) C29972i.a(C29972i.b(this), Object.class), s.c(this), cv.c.b(this), string, string2, string3).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f127350q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f127350q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f127349p0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final void q5(TextView textView, C42419a c42419a) {
        C42419a.C11586a c11586a;
        Integer numA;
        com.avito.android.util.text.j.a(textView, c42419a != null ? c42419a.f405840a : null, null);
        if (c42419a == null || (c11586a = c42419a.f405841b) == null) {
            return;
        }
        Integer numA2 = com.avito.android.lib.util.q.a(c11586a.f405842a);
        Drawable drawableH = numA2 != null ? C35835l0.h(numA2.intValue(), textView.getContext()) : null;
        wZ.k kVar = c11586a.f405843b;
        if (kVar != null && (numA = kVar.a(textView.getContext())) != null) {
            int iIntValue = numA.intValue();
            if (drawableH != null) {
                V0.a(drawableH, iIntValue);
            }
        }
        I5.d(textView, null, drawableH, 11);
        textView.setGravity(16);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(R.dimen.cpx_promo_title_icon_padding));
        DeepLink deepLink = c11586a.f405844c;
        if (deepLink != null) {
            I5.b(textView, new c(deepLink));
        }
    }

    public final q r5() {
        return (q) this.f127348o0.getValue();
    }

    /* compiled from: CpxPromoV2Fragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cpx_promo/v2/CpxPromoV2Fragment$g", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements Chips.c {
        public g() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            b bVar = CpxPromoV2Fragment.f127346s0;
            CpxPromoV2Fragment.this.r5().accept(new a.b((CpxPromoV2State.a) hVar));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}

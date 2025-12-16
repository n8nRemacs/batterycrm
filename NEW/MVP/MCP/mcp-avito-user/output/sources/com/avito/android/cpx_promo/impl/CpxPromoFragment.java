package com.avito.android.cpx_promo.impl;

import Cd.r;
import Y41.p;
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
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
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
import com.avito.android.cpx_promo.impl.CpxPromoFragment;
import com.avito.android.cpx_promo.impl.h;
import com.avito.android.cpx_promo.impl.interactor.model.AttributedTextWithIcon;
import com.avito.android.cpx_promo.impl.interactor.model.CpxPromoButton;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import com.avito.android.cpx_promo.impl.mvi.entity.a;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
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
import com.avito.android.lib.util.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V0;
import com.google.android.material.slider.Slider;
import es.InterfaceC40150a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;
import v50.C49166b;
import z1.AbstractC50339a;

/* compiled from: CpxPromoFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpx_promo/impl/CpxPromoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final b f126889s0 = new b(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h.a f126890n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f126891o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f126892p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f126893q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final d f126894r0;

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/CpxPromoFragment$a;", "", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ShimmerLayout f126895a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final xZ.e f126896b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ScrollView f126897c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final FrameLayout f126898d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final NavBar f126899e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Button f126900f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final TextView f126901g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final TextView f126902h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final TextView f126903i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final SegmentedControl f126904j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final TextView f126905k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final Chips f126906l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final TextView f126907m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final Input f126908n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final TextView f126909o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public final TextView f126910p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.k
        public final LinearLayout f126911q;

        /* renamed from: r, reason: collision with root package name */
        @Y61.k
        public final Slider f126912r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.k
        public final Button f126913s;

        /* renamed from: t, reason: collision with root package name */
        @Y61.k
        public final Button f126914t;

        /* renamed from: u, reason: collision with root package name */
        @Y61.k
        public final LinearLayout f126915u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.k
        public final TextView f126916v;

        /* renamed from: w, reason: collision with root package name */
        @Y61.k
        public final Input f126917w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.k
        public final TextView f126918x;

        public a(@Y61.k ShimmerLayout shimmerLayout, @Y61.k xZ.e eVar, @Y61.k ScrollView scrollView, @Y61.k FrameLayout frameLayout, @Y61.k NavBar navBar, @Y61.k Button button, @Y61.k TextView textView, @Y61.k TextView textView2, @Y61.k TextView textView3, @Y61.k SegmentedControl segmentedControl, @Y61.k TextView textView4, @Y61.k Chips chips, @Y61.k TextView textView5, @Y61.k Input input, @Y61.k TextView textView6, @Y61.k TextView textView7, @Y61.k LinearLayout linearLayout, @Y61.k ImageView imageView, @Y61.k Slider slider, @Y61.k Button button2, @Y61.k Button button3, @Y61.k LinearLayout linearLayout2, @Y61.k TextView textView8, @Y61.k Input input2, @Y61.k TextView textView9) {
            this.f126895a = shimmerLayout;
            this.f126896b = eVar;
            this.f126897c = scrollView;
            this.f126898d = frameLayout;
            this.f126899e = navBar;
            this.f126900f = button;
            this.f126901g = textView;
            this.f126902h = textView2;
            this.f126903i = textView3;
            this.f126904j = segmentedControl;
            this.f126905k = textView4;
            this.f126906l = chips;
            this.f126907m = textView5;
            this.f126908n = input;
            this.f126909o = textView6;
            this.f126910p = textView7;
            this.f126911q = linearLayout;
            this.f126912r = slider;
            this.f126913s = button2;
            this.f126914t = button3;
            this.f126915u = linearLayout2;
            this.f126916v = textView8;
            this.f126917w = input2;
            this.f126918x = textView9;
        }
    }

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/cpx_promo/impl/CpxPromoFragment$b;", "", "<init>", "()V", "", "ARG_CONTEXT", "Ljava/lang/String;", "ARG_CURRENT_FLOW", "ARG_ITEM_ID", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f126920m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeepLink deepLink) {
            super(0);
            this.f126920m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = CpxPromoFragment.f126889s0;
            CpxPromoFragment.this.r5().accept(new a.m(this.f126920m));
            return G0.f406611a;
        }
    }

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cpx_promo/impl/CpxPromoFragment$d", "Landroidx/activity/x;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends x {
        public d() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            CpxPromoFragment cpxPromoFragment = CpxPromoFragment.this;
            b bVar = CpxPromoFragment.f126889s0;
            cpxPromoFragment.r5().accept(a.C3785a.f127157a);
        }
    }

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC40150a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40150a interfaceC40150a) {
            Bundle bundle;
            InterfaceC40150a interfaceC40150a2 = interfaceC40150a;
            CpxPromoFragment cpxPromoFragment = (CpxPromoFragment) this.receiver;
            b bVar = CpxPromoFragment.f126889s0;
            cpxPromoFragment.getClass();
            if (interfaceC40150a2 instanceof InterfaceC40150a.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = cpxPromoFragment.f126892p0;
                if (aVar == null) {
                    aVar = null;
                }
                InterfaceC40150a.b bVar2 = (InterfaceC40150a.b) interfaceC40150a2;
                CpxPromoPriceInputContent cpxPromoPriceInputContent = bVar2.f395404b;
                if (cpxPromoPriceInputContent != null) {
                    bundle = new Bundle();
                    bundle.putParcelable("cpx_promo_price_input_content", cpxPromoPriceInputContent);
                } else {
                    bundle = null;
                }
                b.a.a(aVar, bVar2.f395403a, null, bundle, 2);
            } else if (interfaceC40150a2 instanceof InterfaceC40150a.c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                ApiError apiError = ((InterfaceC40150a.c) interfaceC40150a2).f395405a;
                com.avito.android.component.toast.c.c(cVar, cpxPromoFragment, com.avito.android.printable_text.b.f(z.k(apiError)), null, null, new f.c(apiError), 0, ToastBarPosition.f181046d, 942);
            } else {
                if (!(interfaceC40150a2 instanceof InterfaceC40150a.C11108a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d dVar = cpxPromoFragment.f126894r0;
                dVar.d(false);
                ActivityC22955m activityC22955mL1 = cpxPromoFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                }
                dVar.d(true);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<CpxPromoState, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f126923m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar) {
            super(1);
            this.f126923m = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(CpxPromoState cpxPromoState) {
            CpxPromoState cpxPromoState2 = cpxPromoState;
            b bVar = CpxPromoFragment.f126889s0;
            CpxPromoFragment cpxPromoFragment = CpxPromoFragment.this;
            boolean z12 = cpxPromoState2.f127109b;
            a aVar = this.f126923m;
            xZ.e eVar = aVar.f126896b;
            FrameLayout frameLayout = aVar.f126898d;
            ShimmerLayout shimmerLayout = aVar.f126895a;
            if (z12) {
                D6.H(shimmerLayout);
                shimmerLayout.c();
                D6.w(frameLayout);
                eVar.c();
            } else {
                ScrollView scrollView = aVar.f126897c;
                String str = cpxPromoState2.f127110c;
                if (str == null || str.length() == 0) {
                    D6.w(shimmerLayout);
                    shimmerLayout.d();
                    D6.H(frameLayout);
                    D6.H(scrollView);
                    eVar.b();
                    com.avito.android.cpx_promo.impl.d dVar = new com.avito.android.cpx_promo.impl.d(cpxPromoFragment);
                    NavBar navBar = aVar.f126899e;
                    int i12 = NavBar.f179818g;
                    navBar.c(R.attr.ic_arrowBack24, dVar);
                    Button button = aVar.f126900f;
                    com.avito.android.lib.design.button.b.a(button, cpxPromoState2.f127112e, false);
                    navBar.setActions(button);
                    com.avito.android.util.text.j.a(aVar.f126901g, cpxPromoState2.f127113f, null);
                    com.avito.android.util.text.j.a(aVar.f126902h, cpxPromoState2.f127114g, null);
                    CpxPromoState.SegmentedControlState segmentedControlState = cpxPromoState2.f127115h;
                    AttributedTextWithIcon attributedTextWithIcon = segmentedControlState.f127141b;
                    TextView textView = aVar.f126903i;
                    cpxPromoFragment.q5(textView, attributedTextWithIcon);
                    SegmentedControl segmentedControl = aVar.f126904j;
                    ArrayList arrayList = segmentedControlState.f127142c;
                    if (arrayList != null) {
                        segmentedControl.q(segmentedControlState.f127143d ? 0 : arrayList.size() - 1, arrayList);
                    }
                    boolean z13 = segmentedControlState.f127144e;
                    textView.setVisibility(z13 ? 0 : 8);
                    segmentedControl.setVisibility(z13 ? 0 : 8);
                    CpxPromoState.BudgetState budgetState = cpxPromoState2.f127116i;
                    boolean z14 = budgetState.f127122b;
                    Chips chips = aVar.f126906l;
                    TextView textView2 = aVar.f126905k;
                    if (z14) {
                        D6.H(textView2);
                        D6.H(chips);
                        cpxPromoFragment.q5(textView2, budgetState.f127123c);
                        chips.setData(budgetState.f127124d);
                        CpxPromoState.BudgetChip budgetChip = budgetState.f127125e;
                        if (budgetChip != null) {
                            chips.q(budgetChip, false);
                            G0 g02 = G0.f406611a;
                        }
                    } else {
                        D6.w(textView2);
                        D6.w(chips);
                        G0 g03 = G0.f406611a;
                    }
                    CpxPromoState.SliderState sliderState = cpxPromoState2.f127117j;
                    cpxPromoFragment.q5(aVar.f126907m, sliderState.f127145b);
                    Input.t(aVar.f126908n, sliderState.f127147d, false, 6);
                    I5.a(aVar.f126909o, sliderState.f127148e, false);
                    boolean z15 = sliderState.f127150g;
                    String str2 = sliderState.f127149f;
                    boolean z16 = (z15 || str2 == null || str2.length() == 0) ? false : true;
                    D6.G(aVar.f126911q, z16);
                    cpxPromoFragment.r5().accept(new a.k(z16));
                    I5.a(aVar.f126910p, str2, false);
                    int iD2 = C35835l0.d(sliderState.f127151h, cpxPromoFragment.requireContext());
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD2);
                    Slider slider = aVar.f126912r;
                    slider.setThumbTintList(colorStateListValueOf);
                    slider.setTrackActiveTintList(ColorStateList.valueOf(iD2));
                    slider.setValueTo(sliderState.f127152i);
                    slider.setValue(sliderState.f127153j);
                    CpxPromoState.ExpenseLimitState expenseLimitState = cpxPromoState2.f127118k;
                    boolean z17 = expenseLimitState.f127131b;
                    LinearLayout linearLayout = aVar.f126915u;
                    if (z17) {
                        D6.H(linearLayout);
                        cpxPromoFragment.q5(aVar.f126916v, expenseLimitState.f127132c);
                        Input input = aVar.f126917w;
                        input.setHint(expenseLimitState.f127135f);
                        Input.t(input, expenseLimitState.f127133d, false, 6);
                        List<Integer> list = expenseLimitState.f127136g;
                        input.setState(C42745f0.L0(list));
                        TextView textView3 = aVar.f126918x;
                        String str3 = expenseLimitState.f127137h;
                        I5.a(textView3, str3, false);
                        Input.f179303W.getClass();
                        textView3.setVisibility((L.f(list, C42756l.e0(Input.f179304a0)) || str3 == null || str3.length() == 0) ? 8 : 0);
                    } else {
                        D6.w(linearLayout);
                    }
                    CpxPromoState.ButtonState buttonState = cpxPromoState2.f127119l;
                    CpxPromoButton cpxPromoButton = buttonState.f127126b;
                    String title = cpxPromoButton != null ? cpxPromoButton.getTitle() : null;
                    Button button2 = aVar.f126913s;
                    com.avito.android.lib.design.button.b.a(button2, title, false);
                    button2.setVisibility(buttonState.f127127c ? 0 : 8);
                    CpxPromoButton cpxPromoButton2 = buttonState.f127128d;
                    String title2 = cpxPromoButton2 != null ? cpxPromoButton2.getTitle() : null;
                    Button button3 = aVar.f126914t;
                    com.avito.android.lib.design.button.b.a(button3, title2, false);
                    button3.setVisibility(buttonState.f127129e ? 0 : 8);
                    button3.setEnabled(buttonState.f127130f);
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

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "segmentPosition", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements p<Integer, CharSequence, G0> {
        public g() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, CharSequence charSequence) {
            int iIntValue = num.intValue();
            b bVar = CpxPromoFragment.f126889s0;
            CpxPromoFragment.this.r5().accept(new a.i(iIntValue == 0));
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f126927m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.l lVar) {
            super(0);
            this.f126927m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new r(CpxPromoFragment.this, this.f126927m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CpxPromoFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f126929l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f126929l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f126929l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126930l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126930l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f126930l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f126931l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f126931l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f126931l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/cpx_promo/impl/h;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/cpx_promo/impl/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.l<C23060r0, com.avito.android.cpx_promo.impl.h> {
        public n() {
            super(1);
        }

        @Override // Y41.l
        public final com.avito.android.cpx_promo.impl.h invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            h.a aVar = CpxPromoFragment.this.f126890n0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public CpxPromoFragment() {
        super(R.layout.fragment_cpx_promo);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f126891o0 = new O0(m0.f406844a.b(com.avito.android.cpx_promo.impl.h.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f126894r0 = new d();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f126893q0;
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
        xZ.e eVar = new xZ.e(frameLayout, new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i12) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
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
        TextView textView4 = (TextView) view.findViewById(R.id.cpx_promo_budget_title);
        Chips chips = (Chips) view.findViewById(R.id.cpx_promo_budget_chips);
        TextView textView5 = (TextView) view.findViewById(R.id.cpx_promo_slider_title);
        Input input = (Input) view.findViewById(R.id.cpx_promo_slider_input);
        TextView textView6 = (TextView) view.findViewById(R.id.cpx_promo_slider_description);
        TextView textView7 = (TextView) view.findViewById(R.id.cpx_promo_slider_info);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cpx_promo_slider_info_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.cpx_promo_slider_info_close);
        Slider slider = (Slider) view.findViewById(R.id.cpx_promo_slider);
        Button button2 = (Button) view.findViewById(R.id.cpx_promo_secondary_button);
        Button button3 = (Button) view.findViewById(R.id.cpx_promo_primary_button);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.cpx_promo_limit_container);
        TextView textView8 = (TextView) view.findViewById(R.id.cpx_promo_limit_title);
        Input input2 = (Input) view.findViewById(R.id.cpx_promo_limit_input);
        a aVar = new a(shimmerLayout, eVar, scrollView, frameLayout, navBar, button, textView, textView2, textView3, segmentedControl, textView4, chips, textView5, input, textView6, textView7, linearLayout, imageView, slider, button2, button3, linearLayout2, textView8, input2, (TextView) view.findViewById(R.id.cpx_promo_limit_hint));
        segmentedControl.setOnSegmentClickListener(new g());
        chips.setChipsSelectedListener(new h());
        slider.y(new com.avito.android.cpx_promo.impl.b(this, 0));
        ComponentType componentType = ComponentType.f179284e;
        input.setComponentType(componentType);
        final int i13 = 1;
        input.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i13) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i14) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i15 = 3;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i15) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i16 = 4;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i16) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i17 = 5;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i17) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        final int i18 = 6;
        input2.setClearButtonClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i18) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        input2.setClearButtonVisibleUnfocused(true);
        input2.setComponentType(componentType);
        final int i19 = 7;
        input2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cpx_promo.impl.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CpxPromoFragment f126936c;

            {
                this.f126936c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CpxPromoFragment cpxPromoFragment = this.f126936c;
                switch (i19) {
                    case 0:
                        CpxPromoFragment.b bVar = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.g.f127162a);
                        break;
                    case 1:
                        CpxPromoFragment.b bVar2 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127248b));
                        break;
                    case 2:
                        CpxPromoFragment.b bVar3 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.c.f127159a);
                        break;
                    case 3:
                        CpxPromoFragment.b bVar4 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.j.f127165a);
                        break;
                    case 4:
                        CpxPromoFragment.b bVar5 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.h.f127163a);
                        break;
                    case 5:
                        CpxPromoFragment.b bVar6 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(a.f.f127161a);
                        break;
                    case 6:
                        CpxPromoFragment.b bVar7 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.e());
                        break;
                    default:
                        CpxPromoFragment.b bVar8 = CpxPromoFragment.f126889s0;
                        cpxPromoFragment.r5().accept(new a.d(CpxPromoInputSource.f127249c));
                        break;
                }
            }
        });
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f126894r0);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f126893q0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker != null ? screenPerformanceTracker : null, r5(), new e(1, this, CpxPromoFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoOneTimeEvent;)V", 0), new f(aVar));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126893q0;
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
        com.avito.android.cpx_promo.impl.di.i.a().a((com.avito.android.cpx_promo.impl.di.d) C29972i.a(C29972i.b(this), Object.class), s.c(this), cv.c.b(this), string, string2, string3).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f126893q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f126893q0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.c(this, g5());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f126892p0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    public final void q5(TextView textView, AttributedTextWithIcon attributedTextWithIcon) {
        AttributedTextWithIcon.ClickableIcon clickableIcon;
        Drawable drawableH;
        com.avito.android.util.text.j.a(textView, attributedTextWithIcon != null ? attributedTextWithIcon.f126995b : null, null);
        if (attributedTextWithIcon == null || (clickableIcon = attributedTextWithIcon.f126996c) == null) {
            return;
        }
        Integer numA = q.a(clickableIcon.f126997b);
        if (numA == null || (drawableH = C35835l0.h(numA.intValue(), textView.getContext())) == null) {
            drawableH = null;
        } else {
            V0.a(drawableH, C48063a.f437606a.a(textView.getContext(), clickableIcon.f126998c));
        }
        I5.d(textView, null, drawableH, 11);
        textView.setGravity(16);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(R.dimen.cpx_promo_title_icon_padding));
        DeepLink deepLink = clickableIcon.f126999d;
        if (deepLink != null) {
            I5.b(textView, new c(deepLink));
        }
    }

    public final com.avito.android.cpx_promo.impl.h r5() {
        return (com.avito.android.cpx_promo.impl.h) this.f126891o0.getValue();
    }

    /* compiled from: CpxPromoFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cpx_promo/impl/CpxPromoFragment$h", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements Chips.c {
        public h() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            b bVar = CpxPromoFragment.f126889s0;
            CpxPromoFragment.this.r5().accept(new a.b((CpxPromoState.BudgetChip) hVar));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}

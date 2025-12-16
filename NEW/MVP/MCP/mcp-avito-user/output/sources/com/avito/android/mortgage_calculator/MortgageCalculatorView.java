package com.avito.android.mortgage_calculator;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import androidx.view.T0;
import androidx.view.V0;
import com.avito.android.di.C29972i;
import com.avito.android.mortgage_calculator.N;
import com.avito.android.mortgage_calculator.internal.S0;
import com.avito.android.mortgage_calculator.internal.mvi.entity.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: MortgageCalculatorView.kt */
@P
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/mortgage_calculator/MortgageCalculatorView;", "Landroid/widget/FrameLayout;", "Lh31/e;", "Lcom/avito/android/deeplink_handler/handler/composite/a;", "b", "Lh31/e;", "getDeeplinkHandler$_avito_mortgage_calculator_util", "()Lh31/e;", "setDeeplinkHandler$_avito_mortgage_calculator_util", "(Lh31/e;)V", "deeplinkHandler", "Ljavax/inject/Provider;", "Lcom/avito/android/mortgage_calculator/internal/S0;", "c", "Ljavax/inject/Provider;", "getViewModelProvider$_avito_mortgage_calculator_util", "()Ljavax/inject/Provider;", "setViewModelProvider$_avito_mortgage_calculator_util", "(Ljavax/inject/Provider;)V", "viewModelProvider", "Landroidx/lifecycle/T0;", "e", "Lkotlin/C;", "getClosestViewModelStoreOwner", "()Landroidx/lifecycle/T0;", "closestViewModelStoreOwner", "f", "Landroidx/lifecycle/O0;", "getViewModel", "()Lcom/avito/android/mortgage_calculator/internal/S0;", "viewModel", "Landroidx/lifecycle/P;", "getLifecycleOwner", "()Landroidx/lifecycle/P;", "lifecycleOwner", "LE10/c;", VoiceInfo.STATE, "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MortgageCalculatorView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f204050h = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Inject
    public h31.e<com.avito.android.deeplink_handler.handler.composite.a> deeplinkHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Inject
    public Provider<S0> viewModelProvider;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.view.n f204053d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C closestViewModelStoreOwner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final O0 viewModel;

    /* renamed from: g, reason: collision with root package name */
    public boolean f204056g;

    @X41.j
    public MortgageCalculatorView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T0 getClosestViewModelStoreOwner() {
        return (T0) this.closestViewModelStoreOwner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC22983P getLifecycleOwner() {
        return V0.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final S0 getViewModel() {
        return (S0) this.viewModel.getValue();
    }

    public final void d() {
        if (isAttachedToWindow()) {
            getViewModel().accept(b.C6098b.f204569b);
        } else {
            addOnAttachStateChangeListener(new a(this));
        }
    }

    @Y61.k
    public final h31.e<com.avito.android.deeplink_handler.handler.composite.a> getDeeplinkHandler$_avito_mortgage_calculator_util() {
        h31.e<com.avito.android.deeplink_handler.handler.composite.a> eVar = this.deeplinkHandler;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    @Y61.k
    public final Provider<S0> getViewModelProvider$_avito_mortgage_calculator_util() {
        Provider<S0> provider = this.viewModelProvider;
        if (provider != null) {
            return provider;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f204056g || getLifecycleOwner() == null) {
            return;
        }
        InterfaceC22983P lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner != null) {
            C43259k.d(C22981N.a(lifecycleOwner.getLifecycle()), null, null, new G(this, null), 3);
        }
        this.f204056g = true;
    }

    public final void setDeeplinkHandler$_avito_mortgage_calculator_util(@Y61.k h31.e<com.avito.android.deeplink_handler.handler.composite.a> eVar) {
        this.deeplinkHandler = eVar;
    }

    public final void setViewModelProvider$_avito_mortgage_calculator_util(@Y61.k Provider<S0> provider) {
        this.viewModelProvider = provider;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MortgageCalculatorView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        androidx.view.n nVar;
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        if (!(context instanceof androidx.view.n)) {
            for (Context baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                if (baseContext instanceof androidx.view.n) {
                    nVar = (androidx.view.n) baseContext;
                }
            }
            throw new IllegalStateException("No activity found");
        }
        nVar = (androidx.view.n) context;
        this.f204053d = nVar;
        this.closestViewModelStoreOwner = C42727D.c(new F(this));
        this.viewModel = new O0(m0.f406844a.b(S0.class), new J(this), new L(this), null, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N.d.f204059a, i12, i13);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        com.avito.android.mortgage_calculator.internal.di.a.a().a((com.avito.android.mortgage_calculator.internal.di.c) C29972i.a(C29972i.b(this), Object.class), ((InterfaceC39417a.b) C29972i.a(C29972i.b(this), InterfaceC39417a.b.class)).ol().a(new gv.e(this))).a(this);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
        composeView.setContent(new C22096n(427893268, new D(this, dimensionPixelOffset), true));
        Activity activityA = C35835l0.a(nVar);
        if (activityA != null) {
            K2.a(activityA, new E(this));
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MortgageCalculatorView f204058c;

        public a(MortgageCalculatorView mortgageCalculatorView) {
            this.f204058c = mortgageCalculatorView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            MortgageCalculatorView.this.removeOnAttachStateChangeListener(this);
            this.f204058c.getViewModel().accept(b.C6098b.f204569b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}

package com.avito.android.historical_suggests.suggest;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.p0;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.V0;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import oI.AbstractC44648a;
import vI.InterfaceC49216a;

/* compiled from: HistoricalSuggestsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/k;", "LoI/a;", "", "isVisible", "Lkotlin/G0;", "setContentVisibility", "(Z)V", "Ljavax/inject/Provider;", "Lcom/avito/android/historical_suggests/suggest/n;", "d", "Ljavax/inject/Provider;", "getViewModelProvider$_avito_historical_suggests_impl", "()Ljavax/inject/Provider;", "setViewModelProvider$_avito_historical_suggests_impl", "(Ljavax/inject/Provider;)V", "viewModelProvider", "Landroidx/lifecycle/T0;", "f", "Lkotlin/C;", "getClosestViewModelStoreOwner", "()Landroidx/lifecycle/T0;", "closestViewModelStoreOwner", "g", "Landroidx/lifecycle/O0;", "getViewModel", "()Lcom/avito/android/historical_suggests/suggest/n;", "viewModel", "Landroidx/lifecycle/P;", "getLifecycleOwner", "()Landroidx/lifecycle/P;", "lifecycleOwner", "LvI/c;", VoiceInfo.STATE, "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends AbstractC44648a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f162106i = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Inject
    @SuppressLint({"UiComponentLateinitVar"})
    public Provider<n> viewModelProvider;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public final androidx.view.n f162108e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C closestViewModelStoreOwner;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final O0 viewModel;

    /* renamed from: h, reason: collision with root package name */
    public boolean f162111h;

    /* compiled from: HistoricalSuggestsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                k kVar = k.this;
                com.akita.compose.theme.re23.c.a(false, r.c(-1477726588, new j(kVar, C22126m3.b(kVar.getViewModel().getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HistoricalSuggestsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Landroidx/lifecycle/T0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<T0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final T0 invoke() {
            k kVar = k.this;
            try {
                return p0.a(kVar);
            } catch (IllegalStateException unused) {
                return kVar.f162108e;
            }
        }
    }

    /* compiled from: HistoricalSuggestsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<S0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return k.this.getClosestViewModelStoreOwner().getF42820b();
        }
    }

    /* compiled from: HistoricalSuggestsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(new m(k.this));
        }
    }

    @X41.j
    public k(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12, int i13) {
        androidx.view.n nVar;
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
        this.f162108e = nVar;
        this.closestViewModelStoreOwner = C42727D.c(new b());
        this.viewModel = new O0(m0.f406844a.b(n.class), new c(), new d(), null, 8, null);
        com.avito.android.historical_suggests.suggest.di.a.a().a((com.avito.android.historical_suggests.suggest.di.c) C29972i.a(C29972i.b(this), Object.class)).a(this);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
        composeView.setContent(new C22096n(-1006206615, new a(), true));
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
    public final n getViewModel() {
        return (n) this.viewModel.getValue();
    }

    @Override // oI.AbstractC44648a
    public final void a(@Y61.k AddressParameter.Value value) {
        getViewModel().accept(new InterfaceC49216a.d(value));
    }

    public final void e(@Y61.l Long l12, boolean z12) {
        getViewModel().accept(new InterfaceC49216a.b(l12, z12));
    }

    @Y61.k
    public final Provider<n> getViewModelProvider$_avito_historical_suggests_impl() {
        Provider<n> provider = this.viewModelProvider;
        if (provider != null) {
            return provider;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f162111h || getLifecycleOwner() == null) {
            return;
        }
        InterfaceC22983P lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner != null) {
            C43259k.d(C22981N.a(lifecycleOwner.getLifecycle()), null, null, new l(this, null), 3);
        }
        this.f162111h = true;
    }

    @Override // oI.AbstractC44648a
    public void setContentVisibility(boolean isVisible) {
        getViewModel().accept(new InterfaceC49216a.e(isVisible));
    }

    public final void setViewModelProvider$_avito_historical_suggests_impl(@Y61.k Provider<n> provider) {
        this.viewModelProvider = provider;
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}

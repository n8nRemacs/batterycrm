package com.avito.android.beduin.v2.page.impl;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.P;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import com.avito.android.C29270c0;
import com.avito.android.beduin.v2.page.BaseBeduinV2TabPageFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.D6;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2TabPageFragmentDelegateImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/D;", "Lcom/avito/android/beduin/v2/page/p;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.beduin.v2.page.r
/* loaded from: classes11.dex */
public final class D implements com.avito.android.beduin.v2.page.p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29270c0 f104907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f104908b = C42727D.b(LazyThreadSafetyMode.f406616d, b.f104910l);

    /* compiled from: BeduinV2TabPageFragmentDelegateImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bundle f104909l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bundle bundle) {
            super(1);
            this.f104909l = bundle;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putAll(this.f104909l);
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2TabPageFragmentDelegateImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/B;", "invoke", "()Lcom/avito/android/beduin/v2/page/impl/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<B> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f104910l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final B invoke() {
            return new B();
        }
    }

    @Inject
    public D(@Y61.k C29270c0 c29270c0) {
        this.f104907a = c29270c0;
    }

    public final boolean a(BaseBeduinV2TabPageFragment baseBeduinV2TabPageFragment) {
        C29270c0 c29270c0 = this.f104907a;
        kotlin.reflect.n<Object> nVar = C29270c0.f113263t[9];
        return ((Boolean) c29270c0.f113273k.a().invoke()).booleanValue() && baseBeduinV2TabPageFragment.requireArguments().getBoolean("ignoreSafeArea", false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.beduin.v2.page.p
    public final void c(@Y61.k Bundle bundle) {
        bundle.putBoolean("scenario_status_bar_appearance_light", ((B) this.f104908b.getValue()).f104823a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.avito.android.beduin.v2.page.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.k android.os.Bundle r5, @Y61.k androidx.fragment.app.FragmentManager r6) {
        /*
            r4 = this;
            r0 = 2131364389(0x7f0a0a25, float:1.8348614E38)
            androidx.fragment.app.Fragment r1 = r6.G(r0)
            if (r1 != 0) goto L51
            java.lang.String r1 = "composeRenderer"
            r2 = 0
            boolean r1 = r5.getBoolean(r1, r2)
            if (r1 == 0) goto L32
            com.avito.android.c0 r1 = r4.f104907a
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.C29270c0.f113263t
            r3 = 14
            r2 = r2[r3]
            com.avito.android.A0$a r1 = r1.f113278p
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L32
            com.avito.android.beduin.v2.page.impl.compose.BeduinV2PageComposeFragment r1 = new com.avito.android.beduin.v2.page.impl.compose.BeduinV2PageComposeFragment
            r1.<init>()
            goto L3c
        L32:
            com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment$a r1 = com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment.f104859L0
            r1.getClass()
            com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment r1 = new com.avito.android.beduin.v2.page.impl.BeduinV2PageFragment
            r1.<init>()
        L3c:
            com.avito.android.beduin.v2.page.impl.D$a r2 = new com.avito.android.beduin.v2.page.impl.D$a
            r2.<init>(r5)
            r5 = -1
            com.avito.android.util.C35966w1.a(r1, r5, r2)
            androidx.fragment.app.H r5 = r6.e()
            r6 = 0
            r2 = 1
            r5.j(r0, r1, r6, r2)
            r5.e()
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.v2.page.impl.D.d(android.os.Bundle, androidx.fragment.app.FragmentManager):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.beduin.v2.page.p
    public final void e(@Y61.k BaseBeduinV2TabPageFragment baseBeduinV2TabPageFragment, @Y61.l Bundle bundle) {
        B b12 = (B) this.f104908b.getValue();
        Window window = baseBeduinV2TabPageFragment.requireActivity().getWindow();
        com.avito.android.lib.util.i.f181373a.getClass();
        b12.a(bundle, baseBeduinV2TabPageFragment, window, com.avito.android.lib.util.i.f181377e, a(baseBeduinV2TabPageFragment));
    }

    @Override // com.avito.android.beduin.v2.page.p
    public final void f(@Y61.k BaseBeduinV2TabPageFragment baseBeduinV2TabPageFragment, @Y61.k final View view) {
        com.avito.android.lib.util.i.f181373a.getClass();
        boolean z12 = com.avito.android.lib.util.i.f181377e;
        if (z12 && a(baseBeduinV2TabPageFragment)) {
            return;
        }
        if (z12 && !a(baseBeduinV2TabPageFragment)) {
            baseBeduinV2TabPageFragment.getClass();
            a.b.c(baseBeduinV2TabPageFragment, true);
            return;
        }
        if (z12 || !a(baseBeduinV2TabPageFragment)) {
            if (z12) {
                return;
            }
            a(baseBeduinV2TabPageFragment);
            return;
        }
        view.setSystemUiVisibility(1280);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final int i12 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        final int i13 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        final int i14 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        C22823h0.K(view, new M() { // from class: com.avito.android.beduin.v2.page.impl.C
            @Override // androidx.core.view.M
            public final J0 h(View view2, J0 j02) {
                C22771k c22771kE;
                J0 j0O = C22823h0.o(view);
                if (j0O != null && (c22771kE = j0O.e(135)) != null) {
                    D6.c(view2, Integer.valueOf(i13 - c22771kE.f44775a), null, Integer.valueOf(i14 - c22771kE.f44777c), Integer.valueOf(i12 - c22771kE.f44778d), 2);
                }
                return j02;
            }
        });
    }

    @Override // com.avito.android.beduin.v2.page.p
    public final void g(@Y61.k BaseBeduinV2TabPageFragment baseBeduinV2TabPageFragment) {
        Object objS = C42745f0.S(baseBeduinV2TabPageFragment.getChildFragmentManager().P());
        InterfaceC28868e interfaceC28868e = objS instanceof InterfaceC28868e ? (InterfaceC28868e) objS : null;
        if (interfaceC28868e != null) {
            interfaceC28868e.i0();
        }
    }

    @Override // com.avito.android.beduin.v2.page.p
    public final void h(@Y61.k BaseBeduinV2TabPageFragment baseBeduinV2TabPageFragment) {
        baseBeduinV2TabPageFragment.r5();
    }
}

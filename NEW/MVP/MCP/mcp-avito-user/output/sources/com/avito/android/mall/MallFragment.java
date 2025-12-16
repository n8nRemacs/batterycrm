package com.avito.android.mall;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.C31100l2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N;
import com.avito.android.mall.d;
import com.avito.android.mall.deeplink.MallArguments;
import com.avito.android.mall.di.b;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import com.yatatsu.powerwebview.PowerWebView;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import nU.InterfaceC44331a;

/* compiled from: MallFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/mall/MallFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/e;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "b", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MallFragment extends TabBaseFragment implements com.avito.android.bottom_navigation.ui.fragment.e, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.mall.webview.a f184237A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f184238B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f184239C0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f184240t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public d f184241u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.mall.viewmodel.a f184242v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f184243w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public N f184244x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.search.m f184245y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public LX.a f184246z0;

    /* compiled from: MallFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mall/MallFragment$a;", "", "<init>", "()V", "", "ARGUMENTS", "Ljava/lang/String;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MallFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mall/MallFragment$b;", "", "<init>", "()V", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    static {
        new a(null);
    }

    public MallFragment() {
        super(0, 1, null);
        this.f184240t0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.e
    public final boolean D3() {
        d dVar = this.f184241u0;
        if (dVar != null) {
            return dVar.f184250d.c();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_mall, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        d dVar = this.f184241u0;
        if (dVar != null) {
            com.avito.android.mall.viewmodel.a aVar = this.f184242v0;
            if (aVar == null) {
                aVar = null;
            }
            dVar.f184249c.saveState(aVar.F5());
            dVar.f184252f.e();
        }
        this.f184240t0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        L l12;
        super.onViewCreated(view, bundle);
        Bundle bundleRequireArguments = requireArguments();
        MallArguments mallArguments = (MallArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("mall_arguments", MallArguments.class) : bundleRequireArguments.getParcelable("mall_arguments"));
        N n12 = this.f184244x0;
        N n13 = n12 != null ? n12 : null;
        InterfaceC35745a5 interfaceC35745a5 = this.f184243w0;
        InterfaceC35745a5 interfaceC35745a52 = interfaceC35745a5 != null ? interfaceC35745a5 : null;
        com.avito.android.search.m mVar = this.f184245y0;
        com.avito.android.search.m mVar2 = mVar != null ? mVar : null;
        LX.a aVar = this.f184246z0;
        LX.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.mall.webview.a aVar3 = this.f184237A0;
        com.avito.android.mall.webview.a aVar4 = aVar3 != null ? aVar3 : null;
        String str = mallArguments != null ? mallArguments.f184257b : null;
        InterfaceC28373a interfaceC28373a = this.f184238B0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        com.avito.android.util.text.a aVar5 = this.f184239C0;
        d dVar = new d(view, this, n13, interfaceC35745a52, mVar2, aVar2, aVar4, str, interfaceC28373a2, aVar5 != null ? aVar5 : null);
        this.f184241u0 = dVar;
        com.avito.android.mall.viewmodel.a aVar6 = this.f184242v0;
        if (aVar6 == null) {
            aVar6 = null;
        }
        C31100l2 c31100l2 = dVar.f184253g;
        View viewB = c31100l2.b();
        io.reactivex.rxjava3.disposables.c cVar = dVar.f184252f;
        if (viewB != null && (l12 = dVar.f184254h) != null) {
            cVar.b(l12.c(viewB).t0(new e(aVar6)));
            G0 g02 = G0.f406611a;
        }
        cVar.b(c31100l2.f174866f.z().t0(new h(dVar, aVar6)));
        cVar.b(c31100l2.f174869i.t0(new i(aVar6)));
        cVar.b(c31100l2.f174870j.t0(new j(aVar6)));
        cVar.b(c31100l2.f174868h.t0(new k(aVar6)));
        aVar6.W().observe(this, new d.b(new l(dVar)));
        n13.f176464O.observe(this, new d.b(new f(dVar)));
        cVar.b(aVar6.Z7().t0(new g(dVar)));
        d dVar2 = this.f184241u0;
        if (dVar2 != null) {
            com.avito.android.mall.viewmodel.a aVar7 = this.f184242v0;
            Bundle bundleF5 = (aVar7 != null ? aVar7 : null).F5();
            PowerWebView powerWebView = dVar2.f184249c;
            powerWebView.restoreState(bundleF5);
            if (powerWebView.canGoBack()) {
                return;
            }
            dVar2.f184250d.d("https://m.avito.ru/webview/mall?from_page=" + dVar2.f184248b);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        b.a aVarA = com.avito.android.mall.di.a.a();
        aVarA.d(this);
        aVarA.c(requireActivity());
        aVarA.e((com.avito.android.mall.di.c) C29972i.a(C29972i.b(this), com.avito.android.mall.di.c.class));
        aVarA.a(cv.c.b(this));
        aVarA.b((InterfaceC44331a) C29972i.a(C29972i.b(this), InterfaceC44331a.class));
        aVarA.build().a(this);
    }
}

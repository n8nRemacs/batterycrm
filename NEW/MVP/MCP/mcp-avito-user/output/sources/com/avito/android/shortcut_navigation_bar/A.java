package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.shortcut_navigation_bar.m0;
import com.avito.android.util.A6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class A extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283074l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f283075m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283076n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283077o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283078p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C34999p c34999p, Filter.Onboarding onboarding, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
        super(0);
        this.f283074l = c34999p;
        this.f283075m = onboarding;
        this.f283076n = aVar;
        this.f283077o = aVar2;
        this.f283078p = aVar3;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m0 m0Var = m0.f283432a;
        C34999p c34999p = this.f283074l;
        View view = c34999p.f283461P;
        Y41.a<G0> aVar = this.f283078p;
        Filter.Onboarding onboarding = this.f283075m;
        C35008z c35008z = new C35008z(aVar, c34999p, onboarding);
        m0Var.getClass();
        t0 t0Var = new t0(onboarding, new m0.a(0, Integer.valueOf(y6.b(8)), Integer.valueOf(y6.b(2)), Integer.valueOf(y6.b(3)), Integer.valueOf(y6.b(3))), view, c35008z, this.f283076n, y6.b(14), this.f283077o);
        if (view.hasWindowFocus()) {
            t0Var.invoke();
        } else {
            A6.a(view.getViewTreeObserver(), new o0(t0Var, view));
        }
        return G0.f406611a;
    }
}

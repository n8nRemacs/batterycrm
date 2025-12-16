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
final class G extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34999p f283097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f283098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f283099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283100o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C34999p c34999p, Filter.Onboarding onboarding, String str, Y41.a<G0> aVar) {
        super(0);
        this.f283097l = c34999p;
        this.f283098m = onboarding;
        this.f283099n = str;
        this.f283100o = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m0 m0Var = m0.f283432a;
        C34999p c34999p = this.f283097l;
        View view = c34999p.f283457L;
        E e12 = new E(c34999p, this.f283099n);
        Y41.a<G0> aVar = this.f283100o;
        Filter.Onboarding onboarding = this.f283098m;
        F f12 = new F(aVar, c34999p, onboarding);
        m0Var.getClass();
        t0 t0Var = new t0(onboarding, new m0.a(y6.b(4), null, Integer.valueOf(y6.b(10)), Integer.valueOf(y6.b(3)), Integer.valueOf(y6.b(7)), 2, null), view, f12, e12, y6.b(12), null);
        if (view.hasWindowFocus()) {
            t0Var.invoke();
        } else {
            A6.a(view.getViewTreeObserver(), new o0(t0Var, view));
        }
        return G0.f406611a;
    }
}

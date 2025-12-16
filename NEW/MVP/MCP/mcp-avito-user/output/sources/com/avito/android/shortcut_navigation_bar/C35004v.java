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
/* renamed from: com.avito.android.shortcut_navigation_bar.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C35004v extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f283578l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f283579m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283580n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283581o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283582p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35004v(View view, Filter.Onboarding onboarding, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3) {
        super(0);
        this.f283578l = view;
        this.f283579m = onboarding;
        this.f283580n = aVar;
        this.f283581o = aVar2;
        this.f283582p = aVar3;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m0.f283432a.getClass();
        float fB2 = y6.b(16);
        m0.a aVar = new m0.a(y6.b(8), null, null, null, null, 30, null);
        Y41.a<G0> aVar2 = this.f283581o;
        Y41.a<G0> aVar3 = this.f283582p;
        View view = this.f283578l;
        t0 t0Var = new t0(this.f283579m, aVar, view, aVar2, this.f283580n, fB2, aVar3);
        if (view.hasWindowFocus()) {
            t0Var.invoke();
        } else {
            A6.a(view.getViewTreeObserver(), new o0(t0Var, view));
        }
        return G0.f406611a;
    }
}

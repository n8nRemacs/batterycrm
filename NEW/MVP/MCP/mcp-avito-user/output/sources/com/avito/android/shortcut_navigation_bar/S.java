package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.NavigationBarStyle;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class S extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f283175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding f283176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C34999p f283177n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(View view, NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding, C34999p c34999p) {
        super(0);
        this.f283175l = view;
        this.f283176m = onboarding;
        this.f283177n = c34999p;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m0 m0Var = m0.f283432a;
        C34999p c34999p = this.f283177n;
        NavigationBarStyle.DisplayType.SearchWithActionTitle.Onboarding onboarding = this.f283176m;
        Q q12 = new Q(c34999p, onboarding);
        m0Var.getClass();
        View view = this.f283175l;
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
        kVar.f181224j = new r.a(new i.a(new b.a()));
        com.avito.android.lib.design.tooltip.p.a(kVar, new v0(onboarding));
        kVar.f181225k = true;
        q12.invoke();
        kVar.f(view);
        return G0.f406611a;
    }
}

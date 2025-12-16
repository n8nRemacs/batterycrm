package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.remote.model.search.Tab;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f283201l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Tab.Onboarding f283202m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283203n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283204o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283205p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C34999p f283206q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(View view, Tab.Onboarding onboarding, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, C34999p c34999p) {
        super(0);
        this.f283201l = view;
        this.f283202m = onboarding;
        this.f283203n = aVar;
        this.f283204o = aVar2;
        this.f283205p = aVar3;
        this.f283206q = c34999p;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m0 m0Var = m0.f283432a;
        Y41.a<G0> aVar = this.f283205p;
        Tab.Onboarding onboarding = this.f283202m;
        m0Var.b(this.f283201l, onboarding, this.f283203n, new Y(aVar, this.f283206q, onboarding), this.f283204o, false);
        return G0.f406611a;
    }
}

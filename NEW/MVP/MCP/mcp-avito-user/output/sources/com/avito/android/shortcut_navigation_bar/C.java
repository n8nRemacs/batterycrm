package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.paranja.f;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.shortcut_navigation_bar.m0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class C extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f283082l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EntryPoint.Onboarding f283083m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283084n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283085o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C34999p f283086p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y41.a aVar, Y41.a aVar2, View view, EntryPoint.Onboarding onboarding, C34999p c34999p) {
        super(0);
        this.f283082l = view;
        this.f283083m = onboarding;
        this.f283084n = aVar;
        this.f283085o = aVar2;
        this.f283086p = c34999p;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m0 m0Var = m0.f283432a;
        Y41.a<G0> aVar = this.f283085o;
        EntryPoint.Onboarding onboarding = this.f283083m;
        B b12 = new B(aVar, this.f283086p, onboarding);
        m0Var.getClass();
        m0.b bVar = new m0.b(onboarding.getTitle(), onboarding.getText(), onboarding.getButtonTitle());
        float fB2 = y6.b(12);
        int iB2 = y6.b(8);
        f.a aVar2 = new f.a(iB2, iB2, iB2, iB2);
        m0.a(m0Var, this.f283082l, bVar, b12, r0.f283547l, this.f283084n, fB2, new r.d(null, 1, null), aVar2, 192);
        return G0.f406611a;
    }
}

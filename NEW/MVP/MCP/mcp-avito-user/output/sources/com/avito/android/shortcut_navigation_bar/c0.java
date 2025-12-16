package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.remote.model.search.EntryPoint;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f283370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EntryPoint.Onboarding f283371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283372n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283373o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C34999p f283374p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Y41.a aVar, Y41.a aVar2, View view, EntryPoint.Onboarding onboarding, C34999p c34999p) {
        super(0);
        this.f283370l = view;
        this.f283371m = onboarding;
        this.f283372n = aVar;
        this.f283373o = aVar2;
        this.f283374p = c34999p;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m0 m0Var = m0.f283432a;
        Y41.a<G0> aVar = this.f283373o;
        EntryPoint.Onboarding onboarding = this.f283371m;
        b0 b0Var = new b0(aVar, this.f283374p, onboarding);
        m0.c(m0Var, this.f283370l, onboarding, this.f283372n, b0Var);
        return G0.f406611a;
    }
}

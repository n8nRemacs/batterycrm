package com.avito.android.shortcut_navigation_bar;

import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.shortcut_navigation_bar.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C35003u extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34999p f283575m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f283576n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35003u(Y41.a<G0> aVar, C34999p c34999p, Filter.Onboarding onboarding) {
        super(0);
        this.f283574l = aVar;
        this.f283575m = c34999p;
        this.f283576n = onboarding;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f283574l.invoke();
        this.f283575m.k("inline_filters_target_tap_onboarding", this.f283576n.getOnceShowId());
        return G0.f406611a;
    }
}

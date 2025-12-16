package com.avito.android.shortcut_navigation_bar;

import com.avito.android.remote.model.NavigationBarStyle;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283105l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34999p f283106m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ NavigationBarStyle.NavigationIconOnboarding f283107n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Y41.a<G0> aVar, C34999p c34999p, NavigationBarStyle.NavigationIconOnboarding navigationIconOnboarding) {
        super(0);
        this.f283105l = aVar;
        this.f283106m = c34999p;
        this.f283107n = navigationIconOnboarding;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f283105l.invoke();
        this.f283106m.k("nav_bar_left_icon_onboarding", this.f283107n.getOnceShowId());
        return G0.f406611a;
    }
}

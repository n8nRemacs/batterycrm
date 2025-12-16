package com.avito.android.shortcut_navigation_bar;

import com.avito.android.remote.model.search.EntryPoint;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class B extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f283079l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34999p f283080m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ EntryPoint.Onboarding f283081n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Y41.a<G0> aVar, C34999p c34999p, EntryPoint.Onboarding onboarding) {
        super(0);
        this.f283079l = aVar;
        this.f283080m = c34999p;
        this.f283081n = onboarding;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f283079l.invoke();
        this.f283080m.k("entry_point_onboarding", this.f283081n.getOnceShowId());
        return G0.f406611a;
    }
}

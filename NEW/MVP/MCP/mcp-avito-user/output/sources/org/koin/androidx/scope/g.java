package org.koin.androidx.scope;

import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;

/* compiled from: ComponentActivityExt.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/androidx/scope/g;", "Landroidx/lifecycle/q;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.koin.core.scope.a f421411b;

    public g(org.koin.core.scope.a aVar) {
        this.f421411b = aVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f421411b.a();
    }
}

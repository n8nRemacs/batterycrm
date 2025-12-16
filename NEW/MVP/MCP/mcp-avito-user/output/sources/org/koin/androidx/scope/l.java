package org.koin.androidx.scope;

import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;

/* compiled from: LifecycleViewModelScopeDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/koin/androidx/scope/l;", "Landroidx/lifecycle/q;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class l implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f421416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f421417c;

    public l(r rVar, k kVar) {
        this.f421416b = rVar;
        this.f421417c = kVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onCreate(@Y61.k InterfaceC22983P interfaceC22983P) {
        r rVar = this.f421416b;
        org.koin.core.scope.a aVar = rVar.f421423E;
        k kVar = this.f421417c;
        if (aVar == null) {
            rVar.f421423E = kVar.f421414c.invoke(kVar.f421413b);
        }
    }
}

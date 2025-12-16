package com.avito.beduin.v2.repository.environment;

import androidx.view.InterfaceC22983P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AndroidEnvironmentClient.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/P;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroidx/lifecycle/P;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.l<InterfaceC22983P, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f338209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(1);
        this.f338209l = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC22983P interfaceC22983P) {
        interfaceC22983P.getLifecycle().a(this.f338209l);
        return G0.f406611a;
    }
}

package com.avito.android.vas_performance.screens.applied_services.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: AppliedServicesBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/vas_performance/screens/applied_services/mvi/entity/AppliedServicesInternalAction;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.b<AppliedServicesInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.screens.applied_services.domain.a f320268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f320269b;

    @Inject
    public d(@Y61.k com.avito.android.vas_performance.screens.applied_services.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f320268a = aVar;
        this.f320269b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AppliedServicesInternalAction> a() {
        return C43175k.N(new c(y.a(this.f320269b.d9())), this.f320268a.a());
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

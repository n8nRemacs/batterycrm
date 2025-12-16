package com.avito.android.publish.free_delivery.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FreeDeliveryBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/free_delivery/mvi/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/publish/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements com.avito.android.arch.mvi.b<FreeDeliveryInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.free_delivery.domain.a f235852a;

    @Inject
    public k(@Y61.k com.avito.android.publish.free_delivery.domain.a aVar) {
        this.f235852a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<FreeDeliveryInternalAction> a() {
        return this.f235852a.invoke();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}

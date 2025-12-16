package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity.UniversalDeliveryTypeCourierInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: UniversalDeliveryTypeCourierBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.arch.mvi.b<UniversalDeliveryTypeCourierInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalDeliveryTypeContent.Tab.Courier f256537a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f256538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.universal_delivery_type.courier.f f256539c;

    @Inject
    public f(@Y61.k UniversalDeliveryTypeContent.Tab.Courier courier, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.safedeal.universal_delivery_type.courier.f fVar) {
        this.f256537a = courier;
        this.f256538b = interfaceC40691b;
        this.f256539c = fVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UniversalDeliveryTypeCourierInternalAction> a() {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new c(this, null));
        com.avito.android.safedeal.universal_delivery_type.courier.f fVar = this.f256539c;
        return C43175k.N(interfaceC43160iG, new C1(y.a(fVar.f256500a.getF103348p()), y.a(fVar.f256501b.getF103348p()), new e(3, null)), C43175k.G(new d(y.a(this.f256538b.q()), null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f256538b.onCleared();
        return G0.f406611a;
    }
}

package gf0;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlot;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DeliveryReturnPolicySlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lgf0/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_return_policy/DeliveryReturnPolicySlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40674b extends k<DeliveryReturnPolicySlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryReturnPolicySlot f396684b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f396685c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f396686d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f396687e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40675c f396688f;

    @i31.c
    public C40674b(@InterfaceC41220a @Y61.k DeliveryReturnPolicySlot deliveryReturnPolicySlot, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.details.a aVar) {
        this.f396684b = deliveryReturnPolicySlot;
        this.f396685c = interfaceC33535v;
        this.f396686d = aVar;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        this.f396687e = cVar;
        this.f396688f = deliveryReturnPolicySlot.getHasRadioConfigField() ? new C40673a(deliveryReturnPolicySlot, cVar, aVar, interfaceC33535v) : new g(deliveryReturnPolicySlot, cVar, aVar, interfaceC33535v);
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f396687e;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        return this.f396688f.d(aVar);
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f e(@Y61.k ParameterSlot parameterSlot) {
        return this.f396688f.b(parameterSlot);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f396684b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        return this.f396688f.a();
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}

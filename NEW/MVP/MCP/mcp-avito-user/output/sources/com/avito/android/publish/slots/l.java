package com.avito.android.publish.slots;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery.CptUnswitchableDeliverySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlotConfig;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryDbsTogglesSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/l;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_dbs_toggles/DeliveryDbsTogglesSlot;", "Lcom/avito/android/publish/slots/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.android.category_parameters.j<DeliveryDbsTogglesSlot> implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryDbsTogglesSlot f244477b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f244478c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f244479d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f244480e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f244481f;

    @i31.c
    public l(@InterfaceC41220a @Y61.k DeliveryDbsTogglesSlot deliveryDbsTogglesSlot, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.details.a aVar) {
        this.f244477b = deliveryDbsTogglesSlot;
        this.f244478c = interfaceC33535v;
        this.f244479d = aVar;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244480e = cVar;
        this.f244481f = cVar;
        interfaceC33535v.f();
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.category_parameters.f> a() {
        return this.f244481f;
    }

    @Override // com.avito.android.publish.slots.k
    public final boolean b() {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlot = this.f244477b;
        BooleanParameter dbs = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getDbs();
        if (!((dbs == null || (bool3 = dbs.get_value()) == null) ? false : bool3.booleanValue())) {
            BooleanParameter rdbs = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getRdbs();
            if (!((rdbs == null || (bool2 = rdbs.get_value()) == null) ? false : bool2.booleanValue())) {
                BooleanParameter cdbs = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getCdbs();
                if (!((cdbs == null || (bool = cdbs.get_value()) == null) ? false : bool.booleanValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        Object next;
        DeliveryCncTogglesSlot deliveryCncTogglesSlot;
        CptUnswitchableDeliverySlot cptUnswitchableDeliverySlot;
        List<ParameterSlot> parameters;
        Object next2;
        SlotWidget<W> widget;
        DeliveryCncTogglesSlotConfig deliveryCncTogglesSlotConfig;
        BooleanParameter cncToggle;
        List<ParameterSlot> parameters2;
        Object next3;
        SlotWidget<W> widget2;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig;
        BooleanParameter courier;
        SlotWidget<W> widget3;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig2;
        BooleanParameter postamat;
        SlotWidget<W> widget4;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig3;
        BooleanParameter pvz;
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlot = this.f244477b;
        Iterator<T> it = deliveryDbsTogglesSlot.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ParameterSlot) next).getId(), aVar.getF8954b())) {
                break;
            }
        }
        BooleanParameter booleanParameter = next instanceof BooleanParameter ? (BooleanParameter) next : null;
        if (booleanParameter == null) {
            return f.c.f117644b;
        }
        if (aVar instanceof com.avito.android.items.b) {
            BooleanParameter dbs = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getDbs();
            boolean z12 = false;
            int iF2 = dbs != null ? L.f(dbs.get_value(), Boolean.TRUE) : 0;
            BooleanParameter rdbs = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getRdbs();
            if (rdbs != null ? L.f(rdbs.get_value(), Boolean.TRUE) : false) {
                iF2++;
            }
            BooleanParameter cdbs = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getCdbs();
            if (cdbs != null ? L.f(cdbs.get_value(), Boolean.TRUE) : false) {
                iF2++;
            }
            DeliveryTogglesSlot deliveryTogglesSlotJ = j();
            if ((deliveryTogglesSlotJ == null || (widget4 = deliveryTogglesSlotJ.getWidget()) == 0 || (deliveryTogglesSlotConfig3 = (DeliveryTogglesSlotConfig) widget4.getConfig()) == null || (pvz = deliveryTogglesSlotConfig3.getPvz()) == null) ? false : L.f(pvz.get_value(), Boolean.TRUE)) {
                iF2++;
            }
            DeliveryTogglesSlot deliveryTogglesSlotJ2 = j();
            if ((deliveryTogglesSlotJ2 == null || (widget3 = deliveryTogglesSlotJ2.getWidget()) == 0 || (deliveryTogglesSlotConfig2 = (DeliveryTogglesSlotConfig) widget3.getConfig()) == null || (postamat = deliveryTogglesSlotConfig2.getPostamat()) == null) ? false : L.f(postamat.get_value(), Boolean.TRUE)) {
                iF2++;
            }
            DeliveryTogglesSlot deliveryTogglesSlotJ3 = j();
            if ((deliveryTogglesSlotJ3 == null || (widget2 = deliveryTogglesSlotJ3.getWidget()) == 0 || (deliveryTogglesSlotConfig = (DeliveryTogglesSlotConfig) widget2.getConfig()) == null || (courier = deliveryTogglesSlotConfig.getCourier()) == null) ? false : L.f(courier.get_value(), Boolean.TRUE)) {
                iF2++;
            }
            com.avito.android.details.a aVar2 = this.f244479d;
            CategoryParameters categoryParametersC0 = aVar2.C0();
            if (categoryParametersC0 == null || (parameters2 = categoryParametersC0.getParameters()) == null) {
                deliveryCncTogglesSlot = null;
            } else {
                Iterator<T> it2 = parameters2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                    if (next3 instanceof DeliveryCncTogglesSlot) {
                        break;
                    }
                }
                if (!(next3 instanceof DeliveryCncTogglesSlot)) {
                    next3 = null;
                }
                deliveryCncTogglesSlot = (DeliveryCncTogglesSlot) next3;
            }
            if ((deliveryCncTogglesSlot == null || (widget = deliveryCncTogglesSlot.getWidget()) == 0 || (deliveryCncTogglesSlotConfig = (DeliveryCncTogglesSlotConfig) widget.getConfig()) == null || (cncToggle = deliveryCncTogglesSlotConfig.getCncToggle()) == null) ? false : L.f(cncToggle.get_value(), Boolean.TRUE)) {
                iF2++;
            }
            CategoryParameters categoryParametersC02 = aVar2.C0();
            if (categoryParametersC02 == null || (parameters = categoryParametersC02.getParameters()) == null) {
                cptUnswitchableDeliverySlot = null;
            } else {
                Iterator<T> it3 = parameters.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (next2 instanceof CptUnswitchableDeliverySlot) {
                        break;
                    }
                }
                if (!(next2 instanceof CptUnswitchableDeliverySlot)) {
                    next2 = null;
                }
                cptUnswitchableDeliverySlot = (CptUnswitchableDeliverySlot) next2;
            }
            if ((cptUnswitchableDeliverySlot != null) && iF2 == 0) {
                z12 = true;
            }
            String str = ((com.avito.android.items.b) aVar).f173927b;
            BooleanParameter dbs2 = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getDbs();
            boolean zF2 = L.f(str, dbs2 != null ? dbs2.getId() : null);
            InterfaceC33535v interfaceC33535v = this.f244478c;
            if (!zF2) {
                BooleanParameter rdbs2 = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getRdbs();
                if (!L.f(str, rdbs2 != null ? rdbs2.getId() : null)) {
                    BooleanParameter cdbs2 = ((DeliveryDbsTogglesSlotConfig) deliveryDbsTogglesSlot.getWidget().getConfig()).getCdbs();
                    if (L.f(str, cdbs2 != null ? cdbs2.getId() : null)) {
                        if (z12) {
                            booleanParameter.setValue(Boolean.TRUE);
                        } else {
                            com.avito.android.items.b bVar = (com.avito.android.items.b) aVar;
                            booleanParameter.setValue(Boolean.valueOf(bVar.f173929d));
                            interfaceC33535v.n(bVar.f173929d);
                        }
                    }
                } else if (z12) {
                    booleanParameter.setValue(Boolean.TRUE);
                } else {
                    com.avito.android.items.b bVar2 = (com.avito.android.items.b) aVar;
                    booleanParameter.setValue(Boolean.valueOf(bVar2.f173929d));
                    interfaceC33535v.S(bVar2.f173929d);
                }
            } else if (z12) {
                booleanParameter.setValue(Boolean.TRUE);
            } else {
                com.avito.android.items.b bVar3 = (com.avito.android.items.b) aVar;
                booleanParameter.setValue(Boolean.valueOf(bVar3.f173929d));
                interfaceC33535v.b0(bVar3.f173929d);
            }
            i();
            SlotType slotType = SlotType.DELIVERY_DBS_TOGGLES;
            f.b bVar4 = new f.b(slotType, null);
            com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = this.f244480e;
            cVar.accept(bVar4);
            if (!z12) {
                cVar.accept(new f.a(slotType, deliveryDbsTogglesSlot));
            }
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244477b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<G0>> h() {
        SlotType slotType = SlotType.DELIVERY_DBS_TOGGLES;
        f.b bVar = new f.b(slotType, null);
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = this.f244480e;
        cVar.accept(bVar);
        cVar.accept(new f.a(slotType, this.f244477b));
        return super.h();
    }

    public final DeliveryTogglesSlot j() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f244479d.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            return null;
        }
        Iterator<T> it = parameters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof DeliveryTogglesSlot) {
                break;
            }
        }
        return (DeliveryTogglesSlot) (next instanceof DeliveryTogglesSlot ? next : null);
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}

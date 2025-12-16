package jf0;

import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.blueprints.publish.delivery_toggles.DeliveryToggle;
import com.avito.android.blueprints.publish.delivery_toggles.DeliveryToggleType;
import com.avito.android.blueprints.publish.delivery_toggles.PublishDeliveryTogglesItem;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery.CptUnswitchableDeliverySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlotKt;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlotConfig;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import t3.l0;
import u3.l;

/* compiled from: DeliveryTogglesSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Ljf0/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_toggles/DeliveryTogglesSlot;", "Lcom/avito/android/publish/slots/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42368a extends k<DeliveryTogglesSlot> implements com.avito.android.publish.slots.k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryTogglesSlot f405749b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f405750c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f405751d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l<SimpleTestGroupWithNone> f405752e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<f> f405753f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f405754g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public DeliveryToggle f405755h;

    @i31.c
    public C42368a(@InterfaceC41220a @Y61.k DeliveryTogglesSlot deliveryTogglesSlot, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.details.a aVar, @l0 @Y61.k l<SimpleTestGroupWithNone> lVar) {
        this.f405749b = deliveryTogglesSlot;
        this.f405750c = interfaceC33535v;
        this.f405751d = aVar;
        this.f405752e = lVar;
        com.jakewharton.rxrelay3.c<f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f405753f = cVar;
        this.f405754g = cVar;
        interfaceC33535v.f();
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<f> a() {
        return this.f405754g;
    }

    @Override // com.avito.android.publish.slots.k
    public final boolean b() {
        Boolean bool;
        Boolean bool2 = q().get_value();
        if (!(bool2 != null ? bool2.booleanValue() : false)) {
            BooleanParameter booleanParameterP = p();
            if (!((booleanParameterP == null || (bool = booleanParameterP.get_value()) == null) ? false : bool.booleanValue())) {
                Boolean bool3 = m().get_value();
                if (!(bool3 != null ? bool3.booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
        BooleanParameter next;
        BooleanParameter booleanParameter;
        String str;
        BooleanParameter next2;
        if (n() != null && (aVar instanceof com.avito.android.publish.slots.delivery_addresses.item.c)) {
            r();
        }
        boolean zB2 = this.f405752e.f439745a.f439749b.b();
        DeliveryTogglesSlot deliveryTogglesSlot = this.f405749b;
        if (zB2 && (aVar instanceof PublishDeliveryTogglesItem) && L.f(deliveryTogglesSlot.getId(), aVar.getF268425c())) {
            DeliveryToggle deliveryToggle = ((PublishDeliveryTogglesItem) aVar).f106175d;
            if (deliveryToggle == null) {
                return f.c.f117644b;
            }
            this.f405755h = deliveryToggle;
            Iterator it = deliveryTogglesSlot.getParameters().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str = deliveryToggle.f106163b;
                if (!zHasNext) {
                    next2 = 0;
                    break;
                }
                next2 = it.next();
                if (L.f(((ParameterSlot) next2).getId(), str)) {
                    break;
                }
            }
            booleanParameter = next2 instanceof BooleanParameter ? next2 : null;
            if (booleanParameter == null) {
                return f.c.f117644b;
            }
            l(str, deliveryToggle.f106167f, booleanParameter);
        } else {
            if (!(aVar instanceof com.avito.android.items.b)) {
                return f.c.f117644b;
            }
            Iterator it2 = deliveryTogglesSlot.getParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = 0;
                    break;
                }
                next = it2.next();
                if (L.f(((ParameterSlot) next).getId(), aVar.getF268425c())) {
                    break;
                }
            }
            booleanParameter = next instanceof BooleanParameter ? next : null;
            if (booleanParameter == null) {
                return f.c.f117644b;
            }
            l(aVar.getF268425c(), ((com.avito.android.items.b) aVar).f173929d, booleanParameter);
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final f e(@Y61.k ParameterSlot parameterSlot) {
        if (n() != null && (parameterSlot instanceof DeliveryAddressesSlot)) {
            r();
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f405749b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        SlotType slotType = SlotType.DELIVERY_TOGGLES;
        f.b bVar = new f.b(slotType, null);
        com.jakewharton.rxrelay3.c<f> cVar = this.f405753f;
        cVar.accept(bVar);
        cVar.accept(new f.a(slotType, this.f405749b));
        return super.h();
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        Boolean value;
        boolean zB2 = this.f405752e.f439745a.f439749b.b();
        DeliveryTogglesSlot deliveryTogglesSlot = this.f405749b;
        boolean zBooleanValue = false;
        if (!zB2) {
            ArrayList arrayListB = C42756l.B(new BooleanParameter[]{((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPvz(), ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getCourier(), ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPostamat()});
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((BooleanParameter) next).get_value() != null) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                BooleanParameter booleanParameter = (BooleanParameter) it2.next();
                String id2 = booleanParameter.getId();
                String title = booleanParameter.getTitle();
                Boolean value2 = booleanParameter.getValue();
                arrayList2.add(new com.avito.android.items.b(id2, title, value2 != null ? value2.booleanValue() : false, booleanParameter.getSubtitle(), null, null, null, false, null, false, null, false, null, null, null, 32752, null));
            }
            return arrayList2;
        }
        kotlin.collections.builders.b bVarT = C42745f0.t();
        if (q().get_value() != null) {
            String id3 = q().getId();
            DeliveryToggleType deliveryToggleType = DeliveryToggleType.f106168b;
            String title2 = q().getTitle();
            AttributedText subtitle = q().getSubtitle();
            Boolean value3 = q().getValue();
            bVarT.add(new DeliveryToggle(id3, deliveryToggleType, title2, subtitle, value3 != null ? value3.booleanValue() : false));
        }
        if (m().get_value() != null) {
            String id4 = m().getId();
            DeliveryToggleType deliveryToggleType2 = DeliveryToggleType.f106169c;
            String title3 = m().getTitle();
            AttributedText subtitle2 = m().getSubtitle();
            Boolean value4 = m().getValue();
            bVarT.add(new DeliveryToggle(id4, deliveryToggleType2, title3, subtitle2, value4 != null ? value4.booleanValue() : false));
        }
        BooleanParameter booleanParameterP = p();
        if (booleanParameterP != null && booleanParameterP.get_value() != null) {
            BooleanParameter booleanParameterP2 = p();
            String id5 = booleanParameterP2 != null ? booleanParameterP2.getId() : null;
            String str = id5 == null ? "" : id5;
            DeliveryToggleType deliveryToggleType3 = DeliveryToggleType.f106170d;
            BooleanParameter booleanParameterP3 = p();
            String title4 = booleanParameterP3 != null ? booleanParameterP3.getTitle() : null;
            String str2 = title4 == null ? "" : title4;
            BooleanParameter booleanParameterP4 = p();
            AttributedText subtitle3 = booleanParameterP4 != null ? booleanParameterP4.getSubtitle() : null;
            BooleanParameter booleanParameterP5 = p();
            if (booleanParameterP5 != null && (value = booleanParameterP5.getValue()) != null) {
                zBooleanValue = value.booleanValue();
            }
            bVarT.add(new DeliveryToggle(str, deliveryToggleType3, str2, subtitle3, zBooleanValue));
        }
        return Collections.singletonList(new PublishDeliveryTogglesItem(deliveryTogglesSlot.getId(), C42745f0.p(bVarT), this.f405755h));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    public final void l(String str, boolean z12, BooleanParameter booleanParameter) {
        DeliveryCncTogglesSlot deliveryCncTogglesSlot;
        CptUnswitchableDeliverySlot cptUnswitchableDeliverySlot;
        ParameterSlot parameterSlot;
        ParameterSlot parameterSlot2;
        Object next;
        Object next2;
        DeliverySummarySlot deliverySummarySlot;
        List<ParameterSlot> parameters;
        Object next3;
        SlotWidget<W> widget;
        DeliveryCncTogglesSlotConfig deliveryCncTogglesSlotConfig;
        BooleanParameter cncToggle;
        List<ParameterSlot> parameters2;
        Object next4;
        SlotWidget<W> widget2;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig;
        BooleanParameter cdbs;
        SlotWidget<W> widget3;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig2;
        BooleanParameter rdbs;
        SlotWidget<W> widget4;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig3;
        BooleanParameter dbs;
        Boolean bool = q().get_value();
        Boolean bool2 = Boolean.TRUE;
        int iF2 = L.f(bool, bool2);
        BooleanParameter booleanParameterP = p();
        boolean z13 = false;
        if (booleanParameterP != null ? L.f(booleanParameterP.get_value(), bool2) : false) {
            iF2++;
        }
        int i12 = iF2;
        if (L.f(m().get_value(), bool2)) {
            i12 = iF2 + 1;
        }
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlotO = o();
        if ((deliveryDbsTogglesSlotO == null || (widget4 = deliveryDbsTogglesSlotO.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig3 = (DeliveryDbsTogglesSlotConfig) widget4.getConfig()) == null || (dbs = deliveryDbsTogglesSlotConfig3.getDbs()) == null) ? false : L.f(dbs.get_value(), bool2)) {
            i12++;
        }
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlotO2 = o();
        if ((deliveryDbsTogglesSlotO2 == null || (widget3 = deliveryDbsTogglesSlotO2.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig2 = (DeliveryDbsTogglesSlotConfig) widget3.getConfig()) == null || (rdbs = deliveryDbsTogglesSlotConfig2.getRdbs()) == null) ? false : L.f(rdbs.get_value(), bool2)) {
            i12++;
        }
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlotO3 = o();
        if ((deliveryDbsTogglesSlotO3 == null || (widget2 = deliveryDbsTogglesSlotO3.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig = (DeliveryDbsTogglesSlotConfig) widget2.getConfig()) == null || (cdbs = deliveryDbsTogglesSlotConfig.getCdbs()) == null) ? false : L.f(cdbs.get_value(), bool2)) {
            i12++;
        }
        com.avito.android.details.a aVar = this.f405751d;
        CategoryParameters categoryParametersC0 = aVar.C0();
        if (categoryParametersC0 == null || (parameters2 = categoryParametersC0.getParameters()) == null) {
            deliveryCncTogglesSlot = null;
        } else {
            Iterator<T> it = parameters2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it.next();
                    if (next4 instanceof DeliveryCncTogglesSlot) {
                        break;
                    }
                }
            }
            if (!(next4 instanceof DeliveryCncTogglesSlot)) {
                next4 = null;
            }
            deliveryCncTogglesSlot = (DeliveryCncTogglesSlot) next4;
        }
        if ((deliveryCncTogglesSlot == null || (widget = deliveryCncTogglesSlot.getWidget()) == 0 || (deliveryCncTogglesSlotConfig = (DeliveryCncTogglesSlotConfig) widget.getConfig()) == null || (cncToggle = deliveryCncTogglesSlotConfig.getCncToggle()) == null) ? false : L.f(cncToggle.get_value(), Boolean.TRUE)) {
            i12++;
        }
        CategoryParameters categoryParametersC02 = aVar.C0();
        if (categoryParametersC02 == null || (parameters = categoryParametersC02.getParameters()) == null) {
            cptUnswitchableDeliverySlot = null;
        } else {
            Iterator<T> it2 = parameters.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it2.next();
                    if (next3 instanceof CptUnswitchableDeliverySlot) {
                        break;
                    }
                }
            }
            if (!(next3 instanceof CptUnswitchableDeliverySlot)) {
                next3 = null;
            }
            cptUnswitchableDeliverySlot = (CptUnswitchableDeliverySlot) next3;
        }
        if ((cptUnswitchableDeliverySlot != null) && i12 == 0) {
            z13 = true;
        }
        boolean zF2 = L.f(str, q().getId());
        InterfaceC33535v interfaceC33535v = this.f405750c;
        if (zF2) {
            if (z13) {
                booleanParameter.setValue(Boolean.TRUE);
            } else {
                booleanParameter.setValue(Boolean.valueOf(z12));
                interfaceC33535v.J0(z12);
            }
            CategoryParameters categoryParametersC03 = aVar.C0();
            List<ParameterSlot> parameters3 = (categoryParametersC03 == null || (deliverySummarySlot = (DeliverySummarySlot) categoryParametersC03.getFirstParameterOfType(DeliverySummarySlot.class)) == null) ? null : deliverySummarySlot.getParameters();
            if (parameters3 != null) {
                Iterator<T> it3 = parameters3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (L.f(((ParameterSlot) next2).getId(), DeliverySummarySlotKt.PRICE_WITH_FEE)) {
                            break;
                        }
                    }
                }
                parameterSlot = (ParameterSlot) next2;
            } else {
                parameterSlot = null;
            }
            CharParameter charParameter = parameterSlot instanceof CharParameter ? (CharParameter) parameterSlot : null;
            if (parameters3 != null) {
                Iterator<T> it4 = parameters3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it4.next();
                        if (L.f(((ParameterSlot) next).getId(), DeliverySummarySlotKt.ORIGINAL_PRICE)) {
                            break;
                        }
                    }
                }
                parameterSlot2 = (ParameterSlot) next;
            } else {
                parameterSlot2 = null;
            }
            CharParameter charParameter2 = parameterSlot2 instanceof CharParameter ? (CharParameter) parameterSlot2 : null;
            if ((charParameter != null ? charParameter.getValue() : null) != null) {
                if ((charParameter2 != null ? charParameter2.getValue() : null) != null) {
                    CategoryParameters categoryParametersC04 = aVar.C0();
                    PriceParameter priceParameter = categoryParametersC04 != null ? (PriceParameter) ((CategoryParameter) categoryParametersC04.getFirstParameterOfType(PriceParameter.class)) : null;
                    if (z12) {
                        if (L.f(priceParameter != null ? priceParameter.getValue() : null, charParameter2.getValue()) && priceParameter != null) {
                            priceParameter.set_value(charParameter.get_value());
                        }
                    }
                    if (!z12) {
                        if (L.f(priceParameter != null ? priceParameter.getValue() : null, charParameter.getValue()) && priceParameter != null) {
                            priceParameter.set_value(charParameter2.getValue());
                        }
                    }
                }
            }
        } else if (!L.f(str, m().getId())) {
            BooleanParameter booleanParameterP2 = p();
            if (L.f(str, booleanParameterP2 != null ? booleanParameterP2.getId() : null)) {
                if (z13) {
                    booleanParameter.setValue(Boolean.TRUE);
                } else {
                    booleanParameter.setValue(Boolean.valueOf(z12));
                    interfaceC33535v.V(z12);
                }
            }
        } else if (z13) {
            booleanParameter.setValue(Boolean.TRUE);
        } else {
            booleanParameter.setValue(Boolean.valueOf(z12));
            interfaceC33535v.m0(z12);
        }
        i();
        SlotType slotType = SlotType.DELIVERY_TOGGLES;
        f.b bVar = new f.b(slotType, null);
        com.jakewharton.rxrelay3.c<f> cVar = this.f405753f;
        cVar.accept(bVar);
        if (z13) {
            return;
        }
        cVar.accept(new f.a(slotType, this.f405749b));
    }

    public final BooleanParameter m() {
        return ((DeliveryTogglesSlotConfig) this.f405749b.getWidget().getConfig()).getCourier();
    }

    public final DeliveryAddressesSlot n() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f405751d.C0();
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
            if (next instanceof DeliveryAddressesSlot) {
                break;
            }
        }
        return (DeliveryAddressesSlot) (next instanceof DeliveryAddressesSlot ? next : null);
    }

    public final DeliveryDbsTogglesSlot o() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f405751d.C0();
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
            if (next instanceof DeliveryDbsTogglesSlot) {
                break;
            }
        }
        return (DeliveryDbsTogglesSlot) (next instanceof DeliveryDbsTogglesSlot ? next : null);
    }

    public final BooleanParameter p() {
        return ((DeliveryTogglesSlotConfig) this.f405749b.getWidget().getConfig()).getPostamat();
    }

    public final BooleanParameter q() {
        return ((DeliveryTogglesSlotConfig) this.f405749b.getWidget().getConfig()).getPvz();
    }

    public final void r() {
        AddressInfo addressInfo;
        BooleanParameter postamat;
        List<AddressInfo> deliveryAddresses;
        Object next;
        SlotWidget<W> widget;
        DeliveryAddressesSlot deliveryAddressesSlotN = n();
        DeliveryAddressesSlotConfig deliveryAddressesSlotConfig = (deliveryAddressesSlotN == null || (widget = deliveryAddressesSlotN.getWidget()) == 0) ? null : (DeliveryAddressesSlotConfig) widget.getConfig();
        if (deliveryAddressesSlotConfig == null || (deliveryAddresses = deliveryAddressesSlotConfig.getDeliveryAddresses()) == null) {
            addressInfo = null;
        } else {
            Iterator<T> it = deliveryAddresses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int addressId = ((AddressInfo) next).getAddressId();
                Integer selectedAddressId = deliveryAddressesSlotConfig.getSelectedAddressId();
                if (selectedAddressId != null && addressId == selectedAddressId.intValue()) {
                    break;
                }
            }
            addressInfo = (AddressInfo) next;
        }
        boolean zF2 = addressInfo != null ? L.f(addressInfo.getDeliveryPvz(), Boolean.TRUE) : false;
        DeliveryTogglesSlot deliveryTogglesSlot = this.f405749b;
        if (zF2) {
            BooleanParameter pvz = ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPvz();
            Boolean bool = Boolean.TRUE;
            pvz.set_value(bool);
            if (((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPvz().getValue() == null) {
                ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPvz().setValue(bool);
            }
        } else {
            ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPvz().set_value((Boolean) null);
        }
        if (addressInfo != null ? L.f(addressInfo.getDeliveryCourier(), Boolean.TRUE) : false) {
            BooleanParameter courier = ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getCourier();
            Boolean bool2 = Boolean.TRUE;
            courier.set_value(bool2);
            if (((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getCourier().getValue() == null) {
                ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getCourier().setValue(bool2);
            }
        } else {
            ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getCourier().set_value((Boolean) null);
        }
        if (addressInfo != null ? L.f(addressInfo.getDeliveryPostamat(), Boolean.TRUE) : false) {
            BooleanParameter postamat2 = ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPostamat();
            if (postamat2 != null) {
                postamat2.set_value(Boolean.TRUE);
            }
            BooleanParameter postamat3 = ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPostamat();
            if ((postamat3 != null ? postamat3.getValue() : null) == null && (postamat = ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPostamat()) != null) {
                postamat.setValue(Boolean.TRUE);
            }
        } else {
            BooleanParameter postamat4 = ((DeliveryTogglesSlotConfig) deliveryTogglesSlot.getWidget().getConfig()).getPostamat();
            if (postamat4 != null) {
                postamat4.set_value((Boolean) null);
            }
        }
        i();
        SlotType slotType = SlotType.DELIVERY_TOGGLES;
        f.b bVar = new f.b(slotType, null);
        com.jakewharton.rxrelay3.c<f> cVar = this.f405753f;
        cVar.accept(bVar);
        cVar.accept(new f.a(slotType, deliveryTogglesSlot));
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}

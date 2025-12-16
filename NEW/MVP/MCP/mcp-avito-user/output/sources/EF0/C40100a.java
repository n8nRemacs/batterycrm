package ef0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.delivery_toggles.DeliveryToggle;
import com.avito.android.blueprints.publish.delivery_toggles.PublishDeliveryTogglesItem;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.j;
import com.avito.android.publish.C0;
import com.avito.android.publish.Q0;
import com.avito.android.publish.slots.PublishSlotBadResponse;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery.CptUnswitchableDeliveryConfig;
import com.avito.android.remote.model.category_parameters.slot.cpt_unswitchable_delivery.CptUnswitchableDeliverySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlotConfig;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CptUnswitchableDeliverySlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lef0/a;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/cpt_unswitchable_delivery/CptUnswitchableDeliverySlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ef0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40100a extends j<CptUnswitchableDeliverySlot> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CptUnswitchableDeliverySlot f395309b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f395310c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C0 f395311d;

    @i31.c
    public C40100a(@InterfaceC41220a @k CptUnswitchableDeliverySlot cptUnswitchableDeliverySlot, @k com.avito.android.details.a aVar, @k C0 c02) {
        this.f395309b = cptUnswitchableDeliverySlot;
        this.f395310c = aVar;
        this.f395311d = c02;
    }

    @Override // com.avito.android.category_parameters.j
    @k
    public final z<P2<SuccessResult>> c() {
        return z.c0((!n() || (m() == null && l() == null && j() == null)) ? new P2.b(new SuccessResult(null)) : new P2.a(new PublishSlotBadResponse(com.avito.android.printable_text.b.f(((CptUnswitchableDeliveryConfig) this.f395309b.getWidget().getConfig()).getErrorText()), null, SlotType.CPT_UNSWITCHABLE_DELIVERY, 2, null)));
    }

    @Override // com.avito.android.category_parameters.j
    @k
    public final f d(@k com.avito.conveyor_item.a aVar) {
        boolean zF2;
        SlotWidget<W> widget;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig;
        BooleanParameter courier;
        boolean zF3;
        SlotWidget<W> widget2;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig2;
        BooleanParameter postamat;
        boolean zF4;
        SlotWidget<W> widget3;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig;
        BooleanParameter dbs;
        boolean zF5;
        SlotWidget<W> widget4;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig2;
        BooleanParameter rdbs;
        boolean zF6;
        SlotWidget<W> widget5;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig3;
        BooleanParameter cdbs;
        SlotWidget<W> widget6;
        DeliveryCncTogglesSlotConfig deliveryCncTogglesSlotConfig;
        BooleanParameter cncToggle;
        SlotWidget<W> widget7;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig3;
        BooleanParameter pvz;
        boolean zF7;
        SlotWidget<W> widget8;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig4;
        BooleanParameter courier2;
        SlotWidget<W> widget9;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig5;
        BooleanParameter postamat2;
        SlotWidget<W> widget10;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig6;
        BooleanParameter pvz2;
        boolean z12 = aVar instanceof PublishDeliveryTogglesItem;
        CptUnswitchableDeliverySlot cptUnswitchableDeliverySlot = this.f395309b;
        C0 c02 = this.f395311d;
        boolean zF8 = true;
        String id2 = null;
        if (z12) {
            DeliveryToggle deliveryToggle = ((PublishDeliveryTogglesItem) aVar).f106175d;
            String str = deliveryToggle != null ? deliveryToggle.f106163b : null;
            DeliveryTogglesSlot deliveryTogglesSlotM = m();
            if (L.f(str, (deliveryTogglesSlotM == null || (widget10 = deliveryTogglesSlotM.getWidget()) == 0 || (deliveryTogglesSlotConfig6 = (DeliveryTogglesSlotConfig) widget10.getConfig()) == null || (pvz2 = deliveryTogglesSlotConfig6.getPvz()) == null) ? null : pvz2.getId())) {
                zF7 = true;
            } else {
                DeliveryTogglesSlot deliveryTogglesSlotM2 = m();
                zF7 = L.f(str, (deliveryTogglesSlotM2 == null || (widget8 = deliveryTogglesSlotM2.getWidget()) == 0 || (deliveryTogglesSlotConfig4 = (DeliveryTogglesSlotConfig) widget8.getConfig()) == null || (courier2 = deliveryTogglesSlotConfig4.getCourier()) == null) ? null : courier2.getId());
            }
            if (!zF7) {
                DeliveryTogglesSlot deliveryTogglesSlotM3 = m();
                if (deliveryTogglesSlotM3 != null && (widget9 = deliveryTogglesSlotM3.getWidget()) != 0 && (deliveryTogglesSlotConfig5 = (DeliveryTogglesSlotConfig) widget9.getConfig()) != null && (postamat2 = deliveryTogglesSlotConfig5.getPostamat()) != null) {
                    id2 = postamat2.getId();
                }
                zF8 = L.f(str, id2);
            }
            if (zF8 && n()) {
                String infoText = ((CptUnswitchableDeliveryConfig) cptUnswitchableDeliverySlot.getWidget().getConfig()).getInfoText();
                c02.getClass();
                c02.f231859W.setValue(new Q0.p(infoText));
            }
            return f.c.f117644b;
        }
        if (aVar instanceof com.avito.android.items.b) {
            String str2 = ((com.avito.android.items.b) aVar).f173927b;
            DeliveryTogglesSlot deliveryTogglesSlotM4 = m();
            if (L.f(str2, (deliveryTogglesSlotM4 == null || (widget7 = deliveryTogglesSlotM4.getWidget()) == 0 || (deliveryTogglesSlotConfig3 = (DeliveryTogglesSlotConfig) widget7.getConfig()) == null || (pvz = deliveryTogglesSlotConfig3.getPvz()) == null) ? null : pvz.getId())) {
                zF2 = true;
            } else {
                DeliveryTogglesSlot deliveryTogglesSlotM5 = m();
                zF2 = L.f(str2, (deliveryTogglesSlotM5 == null || (widget = deliveryTogglesSlotM5.getWidget()) == 0 || (deliveryTogglesSlotConfig = (DeliveryTogglesSlotConfig) widget.getConfig()) == null || (courier = deliveryTogglesSlotConfig.getCourier()) == null) ? null : courier.getId());
            }
            if (zF2) {
                zF3 = true;
            } else {
                DeliveryTogglesSlot deliveryTogglesSlotM6 = m();
                zF3 = L.f(str2, (deliveryTogglesSlotM6 == null || (widget2 = deliveryTogglesSlotM6.getWidget()) == 0 || (deliveryTogglesSlotConfig2 = (DeliveryTogglesSlotConfig) widget2.getConfig()) == null || (postamat = deliveryTogglesSlotConfig2.getPostamat()) == null) ? null : postamat.getId());
            }
            if (zF3) {
                zF4 = true;
            } else {
                DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL = l();
                zF4 = L.f(str2, (deliveryDbsTogglesSlotL == null || (widget3 = deliveryDbsTogglesSlotL.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig = (DeliveryDbsTogglesSlotConfig) widget3.getConfig()) == null || (dbs = deliveryDbsTogglesSlotConfig.getDbs()) == null) ? null : dbs.getId());
            }
            if (zF4) {
                zF5 = true;
            } else {
                DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL2 = l();
                zF5 = L.f(str2, (deliveryDbsTogglesSlotL2 == null || (widget4 = deliveryDbsTogglesSlotL2.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig2 = (DeliveryDbsTogglesSlotConfig) widget4.getConfig()) == null || (rdbs = deliveryDbsTogglesSlotConfig2.getRdbs()) == null) ? null : rdbs.getId());
            }
            if (zF5) {
                zF6 = true;
            } else {
                DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL3 = l();
                zF6 = L.f(str2, (deliveryDbsTogglesSlotL3 == null || (widget5 = deliveryDbsTogglesSlotL3.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig3 = (DeliveryDbsTogglesSlotConfig) widget5.getConfig()) == null || (cdbs = deliveryDbsTogglesSlotConfig3.getCdbs()) == null) ? null : cdbs.getId());
            }
            if (!zF6) {
                DeliveryCncTogglesSlot deliveryCncTogglesSlotJ = j();
                if (deliveryCncTogglesSlotJ != null && (widget6 = deliveryCncTogglesSlotJ.getWidget()) != 0 && (deliveryCncTogglesSlotConfig = (DeliveryCncTogglesSlotConfig) widget6.getConfig()) != null && (cncToggle = deliveryCncTogglesSlotConfig.getCncToggle()) != null) {
                    id2 = cncToggle.getId();
                }
                zF8 = L.f(str2, id2);
            }
            if (zF8 && n()) {
                String infoText2 = ((CptUnswitchableDeliveryConfig) cptUnswitchableDeliverySlot.getWidget().getConfig()).getInfoText();
                c02.getClass();
                c02.f231859W.setValue(new Q0.p(infoText2));
            }
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f395309b;
    }

    public final DeliveryCncTogglesSlot j() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f395310c.C0();
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
            if (next instanceof DeliveryCncTogglesSlot) {
                break;
            }
        }
        return (DeliveryCncTogglesSlot) (next instanceof DeliveryCncTogglesSlot ? next : null);
    }

    public final DeliveryDbsTogglesSlot l() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f395310c.C0();
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

    public final DeliveryTogglesSlot m() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f395310c.C0();
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

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n() {
        SlotWidget<W> widget;
        DeliveryCncTogglesSlotConfig deliveryCncTogglesSlotConfig;
        BooleanParameter cncToggle;
        SlotWidget<W> widget2;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig;
        BooleanParameter cdbs;
        SlotWidget<W> widget3;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig2;
        BooleanParameter rdbs;
        SlotWidget<W> widget4;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig3;
        BooleanParameter dbs;
        SlotWidget<W> widget5;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig;
        BooleanParameter courier;
        SlotWidget<W> widget6;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig2;
        BooleanParameter postamat;
        SlotWidget<W> widget7;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig3;
        BooleanParameter pvz;
        DeliveryTogglesSlot deliveryTogglesSlotM = m();
        int iF2 = (deliveryTogglesSlotM == null || (widget7 = deliveryTogglesSlotM.getWidget()) == 0 || (deliveryTogglesSlotConfig3 = (DeliveryTogglesSlotConfig) widget7.getConfig()) == null || (pvz = deliveryTogglesSlotConfig3.getPvz()) == null) ? 0 : L.f(pvz.get_value(), Boolean.TRUE);
        DeliveryTogglesSlot deliveryTogglesSlotM2 = m();
        if ((deliveryTogglesSlotM2 == null || (widget6 = deliveryTogglesSlotM2.getWidget()) == 0 || (deliveryTogglesSlotConfig2 = (DeliveryTogglesSlotConfig) widget6.getConfig()) == null || (postamat = deliveryTogglesSlotConfig2.getPostamat()) == null) ? false : L.f(postamat.get_value(), Boolean.TRUE)) {
            iF2++;
        }
        DeliveryTogglesSlot deliveryTogglesSlotM3 = m();
        if ((deliveryTogglesSlotM3 == null || (widget5 = deliveryTogglesSlotM3.getWidget()) == 0 || (deliveryTogglesSlotConfig = (DeliveryTogglesSlotConfig) widget5.getConfig()) == null || (courier = deliveryTogglesSlotConfig.getCourier()) == null) ? false : L.f(courier.get_value(), Boolean.TRUE)) {
            iF2++;
        }
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL = l();
        if ((deliveryDbsTogglesSlotL == null || (widget4 = deliveryDbsTogglesSlotL.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig3 = (DeliveryDbsTogglesSlotConfig) widget4.getConfig()) == null || (dbs = deliveryDbsTogglesSlotConfig3.getDbs()) == null) ? false : L.f(dbs.get_value(), Boolean.TRUE)) {
            iF2++;
        }
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL2 = l();
        if ((deliveryDbsTogglesSlotL2 == null || (widget3 = deliveryDbsTogglesSlotL2.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig2 = (DeliveryDbsTogglesSlotConfig) widget3.getConfig()) == null || (rdbs = deliveryDbsTogglesSlotConfig2.getRdbs()) == null) ? false : L.f(rdbs.get_value(), Boolean.TRUE)) {
            iF2++;
        }
        DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL3 = l();
        if ((deliveryDbsTogglesSlotL3 == null || (widget2 = deliveryDbsTogglesSlotL3.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig = (DeliveryDbsTogglesSlotConfig) widget2.getConfig()) == null || (cdbs = deliveryDbsTogglesSlotConfig.getCdbs()) == null) ? false : L.f(cdbs.get_value(), Boolean.TRUE)) {
            iF2++;
        }
        DeliveryCncTogglesSlot deliveryCncTogglesSlotJ = j();
        if ((deliveryCncTogglesSlotJ == null || (widget = deliveryCncTogglesSlotJ.getWidget()) == 0 || (deliveryCncTogglesSlotConfig = (DeliveryCncTogglesSlotConfig) widget.getConfig()) == null || (cncToggle = deliveryCncTogglesSlotConfig.getCncToggle()) == null) ? false : L.f(cncToggle.get_value(), Boolean.TRUE)) {
            iF2++;
        }
        return iF2 == 0;
    }
}

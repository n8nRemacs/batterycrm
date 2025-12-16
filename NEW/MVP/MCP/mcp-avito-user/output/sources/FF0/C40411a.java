package ff0;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.items.CheckBoxItemWithText;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.slots.PublishSlotBadResponse;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.DeliveryCncPropertiesParameter;
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
import io.reactivex.rxjava3.core.z;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryCncTogglesSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lff0/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_cnc/DeliveryCncTogglesSlot;", "Lcom/avito/android/publish/slots/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ff0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40411a extends k<DeliveryCncTogglesSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryCncTogglesSlot f396022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f396023c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f396024d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f396025e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<f> f396026f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f396027g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396028h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396029i;

    /* compiled from: DeliveryCncTogglesSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lff0/a$a;", "", "<init>", "()V", "", "ADDRESS_BOTTOM_MARGIN", "I", "", "ADDRESS_DESCRIPTION_ID_POSTFIX", "Ljava/lang/String;", "ADDRESS_DESCRIPTION_TOP_MARGIN", "ADDRESS_HEADER_ID_POSTFIX", "ADDRESS_TOP_MARGIN", "CHECKBOX_ENABLE_ALL_ID_POSTFIX", "DAY_RANGE_FOOTER_ID_POSTFIX", "DAY_RANGE_HEADER_ID_POSTFIX", "DEFAULT_DAYS_INPUT_MAX_LENGTH", "RANGE_INPUTS_MARGIN", "SLOT_BOTTOM_MARGIN", "SLOT_TOP_MARGIN", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"HardcodeStringDetector"})
    /* renamed from: ff0.a$a, reason: collision with other inner class name */
    public static final class C11166a {
        public /* synthetic */ C11166a(C42822w c42822w) {
            this();
        }

        public C11166a() {
        }
    }

    static {
        new C11166a(null);
    }

    @i31.c
    public C40411a(@InterfaceC41220a @Y61.k DeliveryCncTogglesSlot deliveryCncTogglesSlot, @Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k Q1 q12) {
        this.f396022b = deliveryCncTogglesSlot;
        this.f396023c = aVar;
        this.f396024d = interfaceC33535v;
        this.f396025e = q12;
        com.jakewharton.rxrelay3.c<f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f396026f = cVar;
        this.f396027g = cVar;
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<f> a() {
        return this.f396027g;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        DeliveryCncTogglesSlotConfig deliveryCncTogglesSlotConfig = (DeliveryCncTogglesSlotConfig) this.f396022b.getWidget().getConfig();
        if (!L.f(deliveryCncTogglesSlotConfig.getCncToggle().get_value(), Boolean.TRUE)) {
            return z.c0(new P2.b(new SuccessResult(null)));
        }
        DeliveryCncPropertiesParameter cncParameter = deliveryCncTogglesSlotConfig.getCncParameter();
        return (cncParameter == null || !cncParameter.hasError()) ? z.c0(new P2.b(new SuccessResult(null))) : z.c0(new P2.a(new PublishSlotBadResponse(com.avito.android.printable_text.a.a(R.string.fix_errors), null, SlotType.DELIVERY_CNC_TOGGLES, 2, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v45, types: [int] */
    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
        Object next;
        Object next2;
        DeliveryCncPropertiesParameter.CncProperties cncPropertiesCopy$default;
        Object next3;
        CptUnswitchableDeliverySlot cptUnswitchableDeliverySlot;
        DeliveryCncPropertiesParameter cncParameter;
        DeliveryCncPropertiesParameter.CncProperties value;
        List<ParameterSlot> parameters;
        Object next4;
        SlotWidget<W> widget;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig;
        BooleanParameter cdbs;
        SlotWidget<W> widget2;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig2;
        BooleanParameter rdbs;
        SlotWidget<W> widget3;
        DeliveryDbsTogglesSlotConfig deliveryDbsTogglesSlotConfig3;
        BooleanParameter dbs;
        SlotWidget<W> widget4;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig;
        BooleanParameter courier;
        SlotWidget<W> widget5;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig2;
        BooleanParameter postamat;
        SlotWidget<W> widget6;
        DeliveryTogglesSlotConfig deliveryTogglesSlotConfig3;
        BooleanParameter pvz;
        boolean z12 = aVar instanceof com.avito.android.items.b;
        DeliveryCncTogglesSlot deliveryCncTogglesSlot = this.f396022b;
        if (z12) {
            Iterator<T> it = deliveryCncTogglesSlot.getParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                if (L.f(((ParameterSlot) next3).getId(), ((com.avito.android.items.b) aVar).f173927b)) {
                    break;
                }
            }
            BooleanParameter booleanParameter = next3 instanceof BooleanParameter ? (BooleanParameter) next3 : null;
            if (booleanParameter == null) {
                return f.c.f117644b;
            }
            Boolean bool = ((DeliveryCncTogglesSlotConfig) deliveryCncTogglesSlot.getWidget().getConfig()).getCncToggle().get_value();
            Boolean bool2 = Boolean.TRUE;
            int iF2 = L.f(bool, bool2);
            DeliveryTogglesSlot deliveryTogglesSlotM = m();
            boolean z13 = false;
            if ((deliveryTogglesSlotM == null || (widget6 = deliveryTogglesSlotM.getWidget()) == 0 || (deliveryTogglesSlotConfig3 = (DeliveryTogglesSlotConfig) widget6.getConfig()) == null || (pvz = deliveryTogglesSlotConfig3.getPvz()) == null) ? false : L.f(pvz.get_value(), bool2)) {
                iF2++;
            }
            DeliveryTogglesSlot deliveryTogglesSlotM2 = m();
            if ((deliveryTogglesSlotM2 == null || (widget5 = deliveryTogglesSlotM2.getWidget()) == 0 || (deliveryTogglesSlotConfig2 = (DeliveryTogglesSlotConfig) widget5.getConfig()) == null || (postamat = deliveryTogglesSlotConfig2.getPostamat()) == null) ? false : L.f(postamat.get_value(), bool2)) {
                iF2++;
            }
            DeliveryTogglesSlot deliveryTogglesSlotM3 = m();
            if ((deliveryTogglesSlotM3 == null || (widget4 = deliveryTogglesSlotM3.getWidget()) == 0 || (deliveryTogglesSlotConfig = (DeliveryTogglesSlotConfig) widget4.getConfig()) == null || (courier = deliveryTogglesSlotConfig.getCourier()) == null) ? false : L.f(courier.get_value(), bool2)) {
                iF2++;
            }
            DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL = l();
            if ((deliveryDbsTogglesSlotL == null || (widget3 = deliveryDbsTogglesSlotL.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig3 = (DeliveryDbsTogglesSlotConfig) widget3.getConfig()) == null || (dbs = deliveryDbsTogglesSlotConfig3.getDbs()) == null) ? false : L.f(dbs.get_value(), bool2)) {
                iF2++;
            }
            DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL2 = l();
            if ((deliveryDbsTogglesSlotL2 == null || (widget2 = deliveryDbsTogglesSlotL2.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig2 = (DeliveryDbsTogglesSlotConfig) widget2.getConfig()) == null || (rdbs = deliveryDbsTogglesSlotConfig2.getRdbs()) == null) ? false : L.f(rdbs.get_value(), bool2)) {
                iF2++;
            }
            DeliveryDbsTogglesSlot deliveryDbsTogglesSlotL3 = l();
            if ((deliveryDbsTogglesSlotL3 == null || (widget = deliveryDbsTogglesSlotL3.getWidget()) == 0 || (deliveryDbsTogglesSlotConfig = (DeliveryDbsTogglesSlotConfig) widget.getConfig()) == null || (cdbs = deliveryDbsTogglesSlotConfig.getCdbs()) == null) ? false : L.f(cdbs.get_value(), bool2)) {
                iF2++;
            }
            CategoryParameters categoryParametersC0 = this.f396023c.C0();
            if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
                cptUnswitchableDeliverySlot = null;
            } else {
                Iterator<T> it2 = parameters.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it2.next();
                    if (next4 instanceof CptUnswitchableDeliverySlot) {
                        break;
                    }
                }
                if (!(next4 instanceof CptUnswitchableDeliverySlot)) {
                    next4 = null;
                }
                cptUnswitchableDeliverySlot = (CptUnswitchableDeliverySlot) next4;
            }
            if ((cptUnswitchableDeliverySlot != null) && iF2 == 0) {
                z13 = true;
            }
            if (z13) {
                booleanParameter.setValue(Boolean.TRUE);
            } else {
                com.avito.android.items.b bVar = (com.avito.android.items.b) aVar;
                booleanParameter.setValue(Boolean.valueOf(bVar.f173929d));
                Boolean bool3 = booleanParameter.get_value();
                Boolean bool4 = Boolean.FALSE;
                if (L.f(bool3, bool4) && (cncParameter = ((DeliveryCncTogglesSlotConfig) deliveryCncTogglesSlot.getWidget().getConfig()).getCncParameter()) != null) {
                    DeliveryCncPropertiesParameter cncParameter2 = ((DeliveryCncTogglesSlotConfig) deliveryCncTogglesSlot.getWidget().getConfig()).getCncParameter();
                    cncParameter.set_value((cncParameter2 == null || (value = cncParameter2.getValue()) == null) ? null : DeliveryCncPropertiesParameter.CncProperties.copy$default(value, null, null, null, bool4, 7, null));
                }
                this.f396024d.u0(bVar.f173929d);
            }
            i();
            SlotType slotType = SlotType.DELIVERY_CNC_TOGGLES;
            f.b bVar2 = new f.b(slotType, null);
            com.jakewharton.rxrelay3.c<f> cVar = this.f396026f;
            cVar.accept(bVar2);
            if (!z13) {
                cVar.accept(new f.a(slotType, deliveryCncTogglesSlot));
            }
        }
        if (aVar instanceof com.avito.android.publish.items.int_range.b) {
            Iterator<T> it3 = deliveryCncTogglesSlot.getParameters().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (L.f(((ParameterSlot) next2).getId(), ((com.avito.android.publish.items.int_range.b) aVar).f236964b)) {
                    break;
                }
            }
            DeliveryCncPropertiesParameter deliveryCncPropertiesParameter = next2 instanceof DeliveryCncPropertiesParameter ? (DeliveryCncPropertiesParameter) next2 : null;
            if (deliveryCncPropertiesParameter == null) {
                return f.c.f117644b;
            }
            DeliveryCncPropertiesParameter.CncProperties cncProperties = deliveryCncPropertiesParameter.get_value();
            if (cncProperties != null) {
                com.avito.android.publish.items.int_range.b bVar3 = (com.avito.android.publish.items.int_range.b) aVar;
                cncPropertiesCopy$default = DeliveryCncPropertiesParameter.CncProperties.copy$default(cncProperties, bVar3.f236965c.f236959a, bVar3.f236966d.f236959a, null, null, 12, null);
            } else {
                cncPropertiesCopy$default = null;
            }
            deliveryCncPropertiesParameter.setValue(cncPropertiesCopy$default);
            n(deliveryCncPropertiesParameter);
        }
        if (aVar instanceof CheckBoxItemWithText) {
            Iterator<T> it4 = deliveryCncTogglesSlot.getParameters().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (L.f(((ParameterSlot) next).getId() + "сncCheckboxEnableAll", ((CheckBoxItemWithText) aVar).f173886b)) {
                    break;
                }
            }
            DeliveryCncPropertiesParameter deliveryCncPropertiesParameter2 = next instanceof DeliveryCncPropertiesParameter ? (DeliveryCncPropertiesParameter) next : null;
            if (deliveryCncPropertiesParameter2 == null) {
                return f.c.f117644b;
            }
            DeliveryCncPropertiesParameter.CncProperties cncProperties2 = deliveryCncPropertiesParameter2.get_value();
            deliveryCncPropertiesParameter2.setValue(cncProperties2 != null ? DeliveryCncPropertiesParameter.CncProperties.copy$default(cncProperties2, null, null, null, Boolean.valueOf(((CheckBoxItemWithText) aVar).f173889e), 7, null) : null);
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f396022b;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<G0>> h() {
        DeliveryCncTogglesSlot deliveryCncTogglesSlot = this.f396022b;
        DeliveryCncPropertiesParameter cncParameter = ((DeliveryCncTogglesSlotConfig) deliveryCncTogglesSlot.getWidget().getConfig()).getCncParameter();
        if (cncParameter != null) {
            n(cncParameter);
        }
        SlotType slotType = SlotType.DELIVERY_CNC_TOGGLES;
        f.b bVar = new f.b(slotType, null);
        com.jakewharton.rxrelay3.c<f> cVar = this.f396026f;
        cVar.accept(bVar);
        cVar.accept(new f.a(slotType, deliveryCncTogglesSlot));
        return super.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ff0.C40411a.j():java.util.List");
    }

    public final DeliveryDbsTogglesSlot l() {
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f396023c.C0();
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
        CategoryParameters categoryParametersC0 = this.f396023c.C0();
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

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r3 > ((r1 == null || (r1 = r1.getLimitMax()) == null) ? Long.MAX_VALUE : r1.longValue())) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.avito.android.remote.model.category_parameters.DeliveryCncPropertiesParameter r9) {
        /*
            r8 = this;
            com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlot r0 = r8.f396022b
            com.avito.android.remote.model.category_parameters.slot.SlotWidget r0 = r0.getWidget()
            com.avito.android.remote.model.category_parameters.slot.SlotConfig r0 = r0.getConfig()
            com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlotConfig r0 = (com.avito.android.remote.model.category_parameters.slot.delivery_cnc.DeliveryCncTogglesSlotConfig) r0
            com.avito.android.remote.model.category_parameters.DeliveryCncPropertiesParameter$CncProperties r1 = r9.get_value()
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.Long r1 = r1.getMinDays()
            goto L19
        L18:
            r1 = r2
        L19:
            com.avito.android.remote.model.category_parameters.DeliveryCncPropertiesParameter$CncProperties r3 = r9.get_value()
            if (r3 == 0) goto L24
            java.lang.Long r3 = r3.getMaxDays()
            goto L25
        L24:
            r3 = r2
        L25:
            if (r1 == 0) goto L9c
            if (r3 != 0) goto L2b
            goto L9c
        L2b:
            long r4 = r1.longValue()
            long r6 = r3.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L4e
            com.avito.android.remote.model.category_parameters.slot.delivery_cnc.CncDaysRange r0 = r0.getDaysRange()
            if (r0 == 0) goto L41
            java.lang.String r2 = r0.getErrorRange()
        L41:
            if (r2 == 0) goto L4b
            com.avito.android.remote.model.category_parameters.base.HasError$Error$WithMessage r0 = new com.avito.android.remote.model.category_parameters.base.HasError$Error$WithMessage
            r0.<init>(r2)
        L48:
            r2 = r0
            goto Lb1
        L4b:
            com.avito.android.remote.model.category_parameters.base.HasError$Error$WithoutMessage r0 = com.avito.android.remote.model.category_parameters.base.HasError.Error.WithoutMessage.INSTANCE
            goto L48
        L4e:
            long r4 = r1.longValue()
            com.avito.android.remote.model.category_parameters.slot.delivery_cnc.CncDaysRange r1 = r0.getDaysRange()
            if (r1 == 0) goto L63
            java.lang.Long r1 = r1.getLimitMin()
            if (r1 == 0) goto L63
            long r6 = r1.longValue()
            goto L65
        L63:
            r6 = -9223372036854775808
        L65:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L87
            long r3 = r3.longValue()
            com.avito.android.remote.model.category_parameters.slot.delivery_cnc.CncDaysRange r1 = r0.getDaysRange()
            if (r1 == 0) goto L7e
            java.lang.Long r1 = r1.getLimitMax()
            if (r1 == 0) goto L7e
            long r5 = r1.longValue()
            goto L83
        L7e:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L83:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb1
        L87:
            com.avito.android.remote.model.category_parameters.slot.delivery_cnc.CncDaysRange r0 = r0.getDaysRange()
            if (r0 == 0) goto L91
            java.lang.String r2 = r0.getErrorLimit()
        L91:
            if (r2 == 0) goto L99
            com.avito.android.remote.model.category_parameters.base.HasError$Error$WithMessage r0 = new com.avito.android.remote.model.category_parameters.base.HasError$Error$WithMessage
            r0.<init>(r2)
            goto L48
        L99:
            com.avito.android.remote.model.category_parameters.base.HasError$Error$WithoutMessage r0 = com.avito.android.remote.model.category_parameters.base.HasError.Error.WithoutMessage.INSTANCE
            goto L48
        L9c:
            com.avito.android.remote.model.category_parameters.slot.delivery_cnc.CncDaysRange r0 = r0.getDaysRange()
            if (r0 == 0) goto La6
            java.lang.String r2 = r0.getErrorEmptyField()
        La6:
            if (r2 == 0) goto Lae
            com.avito.android.remote.model.category_parameters.base.HasError$Error$WithMessage r0 = new com.avito.android.remote.model.category_parameters.base.HasError$Error$WithMessage
            r0.<init>(r2)
            goto L48
        Lae:
            com.avito.android.remote.model.category_parameters.base.HasError$Error$WithoutMessage r0 = com.avito.android.remote.model.category_parameters.base.HasError.Error.WithoutMessage.INSTANCE
            goto L48
        Lb1:
            r9.setError(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ff0.C40411a.n(com.avito.android.remote.model.category_parameters.DeliveryCncPropertiesParameter):void");
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}

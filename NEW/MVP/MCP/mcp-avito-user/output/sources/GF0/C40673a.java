package gf0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlotConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryReturnPolicyRadioSlotDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgf0/a;", "Lgf0/c;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40673a implements InterfaceC40675c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeliveryReturnPolicySlot f396677a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f396678b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f396679c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC33535v f396680d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Boolean f396681e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Boolean f396682f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Boolean f396683g;

    /* compiled from: DeliveryReturnPolicyRadioSlotDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lgf0/a$a;", "", "<init>", "()V", "", "AVAILABILITY_CUSTOM_MADE_PRODUCT_VALUE", "Ljava/lang/String;", "AVAILABILITY_PARAM_ID", "POLICY_VALUE_14_DAYS", "POLICY_VALUE_DEFAULT", "POLICY_VALUE_NO_RETURN", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gf0.a$a, reason: collision with other inner class name */
    public static final class C11220a {
        public /* synthetic */ C11220a(C42822w c42822w) {
            this();
        }

        public C11220a() {
        }
    }

    static {
        new C11220a(null);
    }

    public C40673a(@k DeliveryReturnPolicySlot deliveryReturnPolicySlot, @k com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar, @k com.avito.android.details.a aVar, @k InterfaceC33535v interfaceC33535v) {
        this.f396677a = deliveryReturnPolicySlot;
        this.f396678b = cVar;
        this.f396679c = aVar;
        this.f396680d = interfaceC33535v;
        CategoryParameters categoryParametersC0 = aVar.C0();
        ParameterSlot parameterSlot = null;
        DeliveryTogglesSlot deliveryTogglesSlot = categoryParametersC0 != null ? (DeliveryTogglesSlot) categoryParametersC0.getFirstParameterOfType(DeliveryTogglesSlot.class) : null;
        if (deliveryTogglesSlot != null) {
            b(deliveryTogglesSlot);
        }
        CategoryParameters categoryParametersC02 = aVar.C0();
        if (categoryParametersC02 != null) {
            Iterator<ParameterSlot> it = categoryParametersC02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ParameterSlot next = it.next();
                ParameterSlot parameterSlot2 = next;
                if ((parameterSlot2 instanceof SelectParameter.Flat) && L.f(parameterSlot2.getId(), "112770")) {
                    parameterSlot = next;
                    break;
                }
            }
            parameterSlot = parameterSlot;
        }
        if (parameterSlot != null) {
            b(parameterSlot);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    @Override // gf0.InterfaceC40675c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> a() {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.C40673a.a():java.util.List");
    }

    @Override // gf0.InterfaceC40675c
    @k
    public final f.c b(@k ParameterSlot parameterSlot) {
        String value;
        boolean z12 = parameterSlot instanceof DeliveryTogglesSlot;
        InterfaceC33535v interfaceC33535v = this.f396680d;
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = this.f396678b;
        DeliveryReturnPolicySlot deliveryReturnPolicySlot = this.f396677a;
        if (z12) {
            Boolean bool = ((DeliveryTogglesSlotConfig) ((DeliveryTogglesSlot) parameterSlot).getWidget().getConfig()).getPvz().get_value();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Boolean boolIsDisabledWhenDeliveryServicesOff = ((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getIsDisabledWhenDeliveryServicesOff();
            boolean zBooleanValue2 = boolIsDisabledWhenDeliveryServicesOff != null ? boolIsDisabledWhenDeliveryServicesOff.booleanValue() : false;
            if (zBooleanValue2 && !L.f(this.f396683g, Boolean.valueOf(zBooleanValue))) {
                this.f396683g = Boolean.valueOf(zBooleanValue);
                cVar.accept(new f.b(SlotType.DELIVERY_RETURN_POLICY, null));
            } else if (!zBooleanValue2 && !L.f(this.f396682f, Boolean.valueOf(zBooleanValue))) {
                this.f396682f = Boolean.valueOf(zBooleanValue);
                SelectParameter.Flat returnPolicyRadioField = ((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getReturnPolicyRadioField();
                if (L.f(returnPolicyRadioField != null ? returnPolicyRadioField.get_value() : null, "14_days") && !zBooleanValue) {
                    SelectParameter.Flat returnPolicyRadioField2 = ((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getReturnPolicyRadioField();
                    if (returnPolicyRadioField2 != null) {
                        returnPolicyRadioField2.set_value("default");
                    }
                    interfaceC33535v.M0("default");
                }
                cVar.accept(new f.b(SlotType.DELIVERY_RETURN_POLICY, null));
            }
        }
        boolean z13 = parameterSlot instanceof SelectParameter.Flat;
        if (z13 && L.f(parameterSlot.getId(), "112770")) {
            boolean zF2 = L.f(((SelectParameter.Flat) parameterSlot).getValue(), "770306");
            if (!L.f(this.f396681e, Boolean.valueOf(zF2))) {
                this.f396681e = Boolean.valueOf(zF2);
                SelectParameter.Flat returnPolicyRadioField3 = ((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getReturnPolicyRadioField();
                if (L.f(returnPolicyRadioField3 != null ? returnPolicyRadioField3.get_value() : null, "no_return_dbs") && !zF2) {
                    SelectParameter.Flat returnPolicyRadioField4 = ((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getReturnPolicyRadioField();
                    if (returnPolicyRadioField4 != null) {
                        returnPolicyRadioField4.set_value("default");
                    }
                    interfaceC33535v.M0("default");
                }
                cVar.accept(new f.b(SlotType.DELIVERY_RETURN_POLICY, null));
            }
        }
        if (z13) {
            String id2 = parameterSlot.getId();
            SelectParameter.Flat returnPolicyRadioField5 = ((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getReturnPolicyRadioField();
            if (L.f(id2, returnPolicyRadioField5 != null ? returnPolicyRadioField5.getId() : null) && (value = ((SelectParameter.Flat) parameterSlot).getValue()) != null) {
                interfaceC33535v.M0(value);
            }
        }
        return f.c.f117644b;
    }

    @Override // gf0.InterfaceC40675c
    @k
    public final f.c d(@k com.avito.conveyor_item.a aVar) {
        return f.c.f117644b;
    }
}

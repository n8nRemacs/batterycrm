package gf0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.header.HeaderItem;
import com.avito.android.blueprints.publish.infomation.item.DisclaimerItem;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_return_policy.DeliveryReturnPolicySlotConfig;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_toggles.DeliveryTogglesSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryReturnPolicyToggleSlotDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgf0/g;", "Lgf0/c;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements InterfaceC40675c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeliveryReturnPolicySlot f396692a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f396693b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f396694c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC33535v f396695d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Boolean f396696e;

    /* compiled from: DeliveryReturnPolicyToggleSlotDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgf0/g$a;", "", "<init>", "()V", "", "DISCLAIMER_ID_POSTFIX", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(@k DeliveryReturnPolicySlot deliveryReturnPolicySlot, @k com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar, @k com.avito.android.details.a aVar, @k InterfaceC33535v interfaceC33535v) {
        this.f396692a = deliveryReturnPolicySlot;
        this.f396693b = cVar;
        this.f396694c = aVar;
        this.f396695d = interfaceC33535v;
        CategoryParameters categoryParametersC0 = aVar.C0();
        DeliveryTogglesSlot deliveryTogglesSlot = categoryParametersC0 != null ? (DeliveryTogglesSlot) categoryParametersC0.getFirstParameterOfType(DeliveryTogglesSlot.class) : null;
        if (deliveryTogglesSlot != null) {
            b(deliveryTogglesSlot);
        }
    }

    @Override // gf0.InterfaceC40675c
    @k
    public final List<com.avito.conveyor_item.a> a() {
        DeliveryReturnPolicySlot deliveryReturnPolicySlot = this.f396692a;
        DeliveryReturnPolicySlotConfig deliveryReturnPolicySlotConfig = (DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig();
        HeaderItem headerItem = new HeaderItem(deliveryReturnPolicySlot.getId(), deliveryReturnPolicySlotConfig.getTitle(), deliveryReturnPolicySlotConfig.getSubtitle(), deliveryReturnPolicySlotConfig.getBadgeText(), false, (Integer) null, (Integer) null, (SectionSeparatorSlotConfig.Tooltip) null, (Theme) null, (Boolean) null, false, 2032, (C42822w) null);
        String id2 = deliveryReturnPolicySlotConfig.getReturnPolicy().getId();
        Boolean value = deliveryReturnPolicySlotConfig.getReturnPolicy().getValue();
        boolean zBooleanValue = value != null ? value.booleanValue() : false;
        String title = deliveryReturnPolicySlotConfig.getReturnPolicy().getTitle();
        AttributedText subtitle = deliveryReturnPolicySlotConfig.getReturnPolicy().getSubtitle();
        DisplayingOptions displayingOptions = deliveryReturnPolicySlotConfig.getReturnPolicy().getDisplayingOptions();
        boolean hideTitle = displayingOptions != null ? displayingOptions.getHideTitle() : false;
        Boolean bool = this.f396696e;
        com.avito.android.items.b bVar = new com.avito.android.items.b(id2, title, zBooleanValue, subtitle, null, null, null, hideTitle, null, bool != null ? bool.booleanValue() : false, null, false, null, null, null, 32112, null);
        AttributedText disabledDeliveryMessage = deliveryReturnPolicySlotConfig.getDisabledDeliveryMessage();
        DisclaimerItem disclaimerItem = null;
        if (disabledDeliveryMessage != null) {
            DisclaimerItem disclaimerItem2 = new DisclaimerItem(deliveryReturnPolicySlot.getId() + "disabled_message", disabledDeliveryMessage, null, null, null, 0, null, 92, null);
            Boolean bool2 = this.f396696e;
            if (!(bool2 != null ? bool2.booleanValue() : false)) {
                disclaimerItem = disclaimerItem2;
            }
        }
        return C42756l.B(new com.avito.conveyor_item.a[]{headerItem, bVar, disclaimerItem});
    }

    @Override // gf0.InterfaceC40675c
    @k
    public final f.c b(@k ParameterSlot parameterSlot) {
        if (parameterSlot instanceof DeliveryTogglesSlot) {
            Boolean bool = ((DeliveryTogglesSlotConfig) ((DeliveryTogglesSlot) parameterSlot).getWidget().getConfig()).getPvz().get_value();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (!L.f(this.f396696e, Boolean.valueOf(zBooleanValue))) {
                this.f396696e = Boolean.valueOf(zBooleanValue);
                DeliveryReturnPolicySlot deliveryReturnPolicySlot = this.f396692a;
                if (L.f(((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getReturnPolicy().get_value(), Boolean.TRUE) && !zBooleanValue) {
                    ((DeliveryReturnPolicySlotConfig) deliveryReturnPolicySlot.getWidget().getConfig()).getReturnPolicy().setValue(Boolean.FALSE);
                }
                this.f396693b.accept(new f.b(SlotType.DELIVERY_RETURN_POLICY, null));
            }
        }
        return f.c.f117644b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // gf0.InterfaceC40675c
    @k
    public final f.c d(@k com.avito.conveyor_item.a aVar) {
        BooleanParameter next;
        Iterator it = this.f396692a.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            }
            next = it.next();
            if (L.f(((ParameterSlot) next).getId(), aVar.getF76517c())) {
                break;
            }
        }
        BooleanParameter booleanParameter = next instanceof BooleanParameter ? next : null;
        if (booleanParameter == null) {
            return f.c.f117644b;
        }
        if (aVar instanceof com.avito.android.items.b) {
            com.avito.android.items.b bVar = (com.avito.android.items.b) aVar;
            booleanParameter.setValue(Boolean.valueOf(bVar.f173929d));
            this.f396695d.K0(bVar.f173929d);
        }
        return f.c.f117644b;
    }
}

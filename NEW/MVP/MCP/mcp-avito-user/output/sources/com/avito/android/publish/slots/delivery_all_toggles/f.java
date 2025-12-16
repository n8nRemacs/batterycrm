package com.avito.android.publish.slots.delivery_all_toggles;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles.DeliveryAllTogglesSlot;
import i31.InterfaceC41220a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryAllTogglesWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/f;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_all_toggles/DeliveryAllTogglesSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends k<DeliveryAllTogglesSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryAllTogglesSlot f243464b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f243465c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f243466d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.delivery_all_toggles.b f243467e;

    /* compiled from: DeliveryAllTogglesWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f243465c.xe(null);
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryAllTogglesWrapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "id", "", "enabled", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, Boolean, G0> {
        public b() {
            super(2);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // Y41.p
        public final G0 invoke(String str, Boolean bool) {
            String str2 = str;
            Boolean bool2 = bool;
            boolean zBooleanValue = bool2.booleanValue();
            f fVar = f.this;
            CategoryParameters categoryParameters = fVar.f243465c.f231873k0;
            ParameterSlot parameterSlotFindParameter = categoryParameters != null ? categoryParameters.findParameter(str2) : null;
            BooleanParameter booleanParameter = parameterSlotFindParameter instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter : null;
            if (!(booleanParameter != null ? L.f(booleanParameter.get_value(), bool2) : false)) {
                if (booleanParameter != null) {
                    booleanParameter.set_value(bool2);
                }
                int iHashCode = str2.hashCode();
                InterfaceC33535v interfaceC33535v = fVar.f243466d;
                switch (iHashCode) {
                    case -1881734196:
                        if (str2.equals("deliveryDbsCourier")) {
                            interfaceC33535v.S(zBooleanValue);
                            break;
                        }
                        break;
                    case -1141448807:
                        if (str2.equals("deliveryCourier")) {
                            interfaceC33535v.m0(zBooleanValue);
                            break;
                        }
                        break;
                    case -947848415:
                        if (str2.equals("deliveryDbs")) {
                            interfaceC33535v.b0(zBooleanValue);
                            break;
                        }
                        break;
                    case -947836256:
                        if (str2.equals("deliveryPvz")) {
                            interfaceC33535v.J0(zBooleanValue);
                            break;
                        }
                        break;
                    case 100880915:
                        if (str2.equals("deliveryPostamat")) {
                            interfaceC33535v.V(zBooleanValue);
                            break;
                        }
                        break;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryAllTogglesWrapper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "id", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<String, Boolean> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(String str) {
            String str2 = str;
            CategoryParameters categoryParameters = f.this.f243465c.f231873k0;
            ParameterSlot parameterSlotFindParameter = categoryParameters != null ? categoryParameters.findParameter(str2) : null;
            BooleanParameter booleanParameter = parameterSlotFindParameter instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter : null;
            if (booleanParameter != null) {
                return booleanParameter.get_value();
            }
            return null;
        }
    }

    @i31.c
    public f(@InterfaceC41220a @Y61.k DeliveryAllTogglesSlot deliveryAllTogglesSlot, @Y61.k C0 c02, @Y61.k InterfaceC33535v interfaceC33535v) {
        this.f243464b = deliveryAllTogglesSlot;
        this.f243465c = c02;
        this.f243466d = interfaceC33535v;
        interfaceC33535v.f();
        this.f243467e = new com.avito.android.publish.slots.delivery_all_toggles.b(deliveryAllTogglesSlot);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243464b;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x01ea  */
    @Override // com.avito.android.category_parameters.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> j() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.delivery_all_toggles.f.j():java.util.List");
    }
}

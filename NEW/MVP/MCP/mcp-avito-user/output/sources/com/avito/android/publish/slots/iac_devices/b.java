package com.avito.android.publish.slots.iac_devices;

import Y61.l;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.iac_analytics.public_module.analytics_models.CallEnablingScenario;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.permissions.PermissionState;
import com.avito.android.publish.C0;
import com.avito.android.publish.deeplink.IacAnonymousInfoSheetShowDeeplink;
import com.avito.android.publish.details.iac.IacPermissionRequestSource;
import com.avito.android.publish.items.atributed_text.PublishAttributedTextItem;
import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import com.avito.android.publish.items.iac_for_pro.IacForProItem;
import com.avito.android.publish.items.mic_permission_block.MicPermissionBlockItem;
import com.avito.android.remote.H;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotType;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDeviceConfig;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.util.P2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import nJ.C44279n;
import nJ.C44283s;
import yc.C50213a;

/* compiled from: IacDevicesSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/iac_devices/IacDevicesSlot;", "a", "b", "c", "d", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends k<IacDevicesSlot> {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final List<String> f244065t;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IacDevicesSlot f244066b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final OL.a f244067c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f244068d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C50213a f244069e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.iac.a f244070f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q1 f244071g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Resources f244072h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.iac_devices.d f244073i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final H f244074j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f244075k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Integer f244076l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Theme f244077m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f244078n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f244079o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f244080p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f244081q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final CallEnablingScenario f244082r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f244083s;

    /* compiled from: IacDevicesSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/b$a;", "", "<init>", "()V", "", "MIC_PERMISSION_ITEM_ID_PERMISSION", "Ljava/lang/String;", "MIC_PERMISSION_ITEM_ID_SETTING", "SPAM_INFO_ITEM_ID", "", "gsmValues", "Ljava/util/List;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacDevicesSlotWrapper.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/b$b;", "Lcom/avito/android/publish/slots/iac_devices/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.slots.iac_devices.b$b, reason: collision with other inner class name */
    public final class C7313b implements com.avito.android.publish.slots.iac_devices.a {
        public C7313b() {
            throw null;
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final List<com.avito.conveyor_item.a> a() {
            return C42784z0.f406748b;
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final f b(@Y61.k ParameterSlot parameterSlot) {
            return f.c.f117644b;
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final C41998x0 c() {
            return z.c0(new P2.b(new SuccessResult(null)));
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
            return f.c.f117644b;
        }
    }

    /* compiled from: IacDevicesSlotWrapper.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/b$c;", "Lcom/avito/android/publish/slots/iac_devices/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c implements com.avito.android.publish.slots.iac_devices.a {

        /* compiled from: IacDevicesSlotWrapper.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[PermissionState.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    PermissionState permissionState = PermissionState.f215104b;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    PermissionState permissionState2 = PermissionState.f215104b;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public c() {
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final List<com.avito.conveyor_item.a> a() {
            b bVar = b.this;
            if (!bVar.f244079o) {
                return C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList();
            if (bVar.f244078n) {
                arrayList.add(b.m(bVar));
            }
            List<IacDeviceConfig> devices = ((IacDevicesSlotConfig) bVar.f244066b.getWidget().getConfig()).getDevices();
            if (devices == null) {
                devices = C42784z0.f406748b;
            }
            List<String> listO = bVar.o();
            if (listO == null) {
                listO = C42784z0.f406748b;
            }
            arrayList.add(new IacDevicesItem(IacDevicesSlot.SELECT_DEVICES_WIDGET_ID, null, bVar.f244073i.a(devices, listO), false, true, false, bVar.f244067c.h() && !bVar.f244075k, 2, null));
            b.l(bVar, arrayList);
            return arrayList;
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final f b(@Y61.k ParameterSlot parameterSlot) {
            if (!(parameterSlot instanceof ContactMethodSlot)) {
                return f.c.f117644b;
            }
            b.this.f244079o = C42745f0.r(b.f244065t, ((ContactMethodSlotConfig) ((ContactMethodSlot) parameterSlot).getWidget().getConfig()).getField().getValue());
            return new f.b(SlotType.IAC_DEVICES, null);
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final C41998x0 c() {
            Object bVar;
            b bVar2 = b.this;
            if (bVar2.f244079o && !bVar2.f244075k && bVar2.p()) {
                com.avito.android.publish.details.iac.a aVar = bVar2.f244070f;
                if (aVar.a()) {
                    int iOrdinal = aVar.c().ordinal();
                    if (iOrdinal == 0) {
                        bVar = new P2.b(new SuccessResult(null));
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new P2.b(new SuccessResult(null));
                    } else {
                        bVar = new P2.a(new IacPermissionsNotGrantedError(IacPermissionRequestSource.f234701b));
                    }
                    return z.c0(bVar);
                }
                if (aVar.d()) {
                    return z.c0(new P2.a(new IacPermissionsNotGrantedError(IacPermissionRequestSource.f234704e)));
                }
            }
            return z.c0(new P2.b(new SuccessResult(null)));
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
            Object next;
            if (!(aVar instanceof IacDevicesItem)) {
                return f.c.f117644b;
            }
            b bVar = b.this;
            Iterator<T> it = bVar.f244066b.getParameters().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((ParameterSlot) next).getId(), IacDevicesSlot.SELECT_DEVICES_WIDGET_ID)) {
                    break;
                }
            }
            MultiselectParameter multiselectParameter = next instanceof MultiselectParameter ? (MultiselectParameter) next : null;
            if (multiselectParameter != null) {
                multiselectParameter.set_value2((List<String>) bVar.f244073i.b(((IacDevicesItem) aVar).f236854d));
            }
            return new f.b(SlotType.IAC_DEVICES, null);
        }
    }

    /* compiled from: IacDevicesSlotWrapper.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/b$d;", "Lcom/avito/android/publish/slots/iac_devices/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d implements com.avito.android.publish.slots.iac_devices.a {
        public d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.avito.conveyor_item.a> a() {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.iac_devices.b.d.a():java.util.List");
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final f b(@Y61.k ParameterSlot parameterSlot) {
            if (!(parameterSlot instanceof ContactMethodSlot)) {
                return f.c.f117644b;
            }
            b.this.f244079o = C42745f0.r(b.f244065t, ((ContactMethodSlotConfig) ((ContactMethodSlot) parameterSlot).getWidget().getConfig()).getField().get_value());
            return new f.b(SlotType.IAC_DEVICES, null);
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final C41998x0 c() {
            b bVar = b.this;
            if (bVar.f244079o && e()) {
                return z.c0(new P2.a(new IacDevicesNoCheckedDeviceForProError(bVar.f244072h.getString(R.string.fix_errors))));
            }
            if (L.f(b.n(bVar), Boolean.TRUE) && bVar.f244070f.c() == PermissionState.f215105c && bVar.p()) {
                return z.c0(bVar.f244075k ? new P2.a(new IacPermissionsNotGrantedError(IacPermissionRequestSource.f234702c)) : new P2.a(new IacPermissionsNotGrantedError(IacPermissionRequestSource.f234701b)));
            }
            return z.c0(new P2.b(new SuccessResult(null)));
        }

        @Override // com.avito.android.publish.slots.iac_devices.a
        @Y61.k
        public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
            Object next;
            Object next2;
            if (aVar instanceof IacForProItem) {
                Iterator<T> it = b.this.f244066b.getParameters().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (L.f(((ParameterSlot) next2).getId(), IacDevicesSlot.IAC_PRO_CHOSEN_WIDGET_ID)) {
                        break;
                    }
                }
                BooleanParameter booleanParameter = next2 instanceof BooleanParameter ? (BooleanParameter) next2 : null;
                if (booleanParameter != null) {
                    booleanParameter.set_value(Boolean.valueOf(((IacForProItem) aVar).f236904c));
                }
                b bVar = b.this;
                bVar.f244068d.c(new C44283s(b.this.f244076l, bVar.f244069e.b(), b.this.f244069e.f443213e, b.this.f244069e.f443212d.name().toLowerCase(Locale.ROOT), ((IacForProItem) aVar).f236904c));
                return new f.b(SlotType.IAC_DEVICES, null);
            }
            if (!(aVar instanceof IacDevicesItem)) {
                return f.c.f117644b;
            }
            Iterator<T> it2 = b.this.f244066b.getParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (L.f(((ParameterSlot) next).getId(), IacDevicesSlot.SELECT_DEVICES_WIDGET_ID)) {
                    break;
                }
            }
            MultiselectParameter multiselectParameter = next instanceof MultiselectParameter ? (MultiselectParameter) next : null;
            if (multiselectParameter != null) {
                multiselectParameter.set_value2((List<String>) b.this.f244073i.b(((IacDevicesItem) aVar).f236854d));
            }
            return new f.b(SlotType.IAC_DEVICES, null);
        }

        public final boolean e() {
            List<String> list;
            List<String> list2 = b.f244065t;
            b bVar = b.this;
            return L.f(b.n(bVar), Boolean.TRUE) && ((list = bVar.o()) == null || list.isEmpty());
        }
    }

    /* compiled from: IacDevicesSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/publish/slots/iac_devices/a;", "invoke", "()Lcom/avito/android/publish/slots/iac_devices/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.publish.slots.iac_devices.a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.slots.iac_devices.a invoke() {
            b bVar = b.this;
            Boolean iacProUser = ((IacDevicesSlotConfig) bVar.f244066b.getWidget().getConfig()).getIacProUser();
            Boolean bool = Boolean.TRUE;
            boolean zF2 = L.f(iacProUser, bool);
            Q1 q12 = bVar.f244071g;
            if (!zF2) {
                q12.getClass();
                n<Object> nVar = Q1.f67448x0[15];
                if (!((Boolean) q12.f67506q.a().invoke()).booleanValue()) {
                    return bVar.new c();
                }
            }
            if (!L.f(((IacDevicesSlotConfig) bVar.f244066b.getWidget().getConfig()).getIacForPro(), bool)) {
                q12.getClass();
                n<Object> nVar2 = Q1.f67448x0[14];
                if (!((Boolean) q12.f67504p.a().invoke()).booleanValue()) {
                    return new C7313b();
                }
            }
            return bVar.new d();
        }
    }

    static {
        new a(null);
        f244065t = C42745f0.U("any", "phone");
    }

    @i31.c
    public b(@Y61.k com.avito.android.details.a aVar, @Y61.k C0 c02, @InterfaceC41220a @Y61.k IacDevicesSlot iacDevicesSlot, @Y61.k OL.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.avito.android.publish.details.iac.a aVar3, @Y61.k Q1 q12, @Y61.k Resources resources, @Y61.k com.avito.android.publish.iac_devices.d dVar, @Y61.k H h12) {
        SlotWidget<W> widget;
        ContactMethodSlotConfig contactMethodSlotConfig;
        SlotWidget<W> widget2;
        ContactMethodSlotConfig contactMethodSlotConfig2;
        SelectParameter.Flat field;
        String str;
        Navigation navigation2;
        this.f244066b = iacDevicesSlot;
        this.f244067c = aVar2;
        this.f244068d = interfaceC28373a;
        this.f244069e = c50213a;
        this.f244070f = aVar3;
        this.f244071g = q12;
        this.f244072h = resources;
        this.f244073i = dVar;
        this.f244074j = h12;
        boolean zBe = c02.Be();
        this.f244075k = zBe;
        CategoryParameters categoryParameters = c02.f231873k0;
        ContactMethodSlotType type = null;
        this.f244076l = (categoryParameters == null || (navigation2 = categoryParameters.getNavigation()) == null) ? null : navigation2.getCategoryId();
        this.f244077m = c02.ve();
        this.f244082r = zBe ? CallEnablingScenario.f164273b : CallEnablingScenario.f164274c;
        this.f244083s = C42727D.c(new e());
        CategoryParameters categoryParametersC0 = aVar.C0();
        ContactMethodSlot contactMethodSlot = categoryParametersC0 != null ? (ContactMethodSlot) categoryParametersC0.getFirstParameterOfType(ContactMethodSlot.class) : null;
        this.f244079o = (contactMethodSlot == null || (widget2 = contactMethodSlot.getWidget()) == 0 || (contactMethodSlotConfig2 = (ContactMethodSlotConfig) widget2.getConfig()) == null || (field = contactMethodSlotConfig2.getField()) == null || (str = field.get_value()) == null) ? false : f244065t.contains(str);
        if (contactMethodSlot != null && (widget = contactMethodSlot.getWidget()) != 0 && (contactMethodSlotConfig = (ContactMethodSlotConfig) widget.getConfig()) != null) {
            type = contactMethodSlotConfig.getType();
        }
        this.f244078n = type == ContactMethodSlotType.REDESIGN;
    }

    public static final void l(b bVar, ArrayList arrayList) {
        if ((!bVar.f244075k ? bVar.f244070f.c() == PermissionState.f215105c : bVar.f244070f.c().c()) && bVar.p()) {
            if (!bVar.f244080p) {
                InterfaceC28373a interfaceC28373a = bVar.f244068d;
                String strB = bVar.f244069e.b();
                String str = bVar.f244069e.f443213e;
                PermissionState permissionStateC = bVar.f244070f.c();
                permissionStateC.getClass();
                interfaceC28373a.c(new C44279n(strB, permissionStateC == PermissionState.f215106d ? CallsPopupType.f164278c : CallsPopupType.f164277b, str, bVar.f244082r));
                bVar.f244080p = true;
            }
            PermissionState permissionStateC2 = bVar.f244070f.c();
            permissionStateC2.getClass();
            if (permissionStateC2 == PermissionState.f215106d) {
                arrayList.add(new MicPermissionBlockItem("micPermissionSettingItemId", new MicPermissionBlockItem.Action.OpenSettings(bVar.f244075k), R.string.mic_permission_item_settings, bVar.f244077m));
            } else {
                arrayList.add(new MicPermissionBlockItem("micPermissionPermissionItemId", new MicPermissionBlockItem.Action.ShowSystemMicPermission(bVar.f244075k), R.string.mic_permission_item_allow, bVar.f244077m));
            }
        }
    }

    public static final PublishAttributedTextItem m(b bVar) {
        bVar.getClass();
        boolean zIsAvitoRe23 = Theme.INSTANCE.isAvitoRe23(bVar.f244077m);
        Resources resources = bVar.f244072h;
        return new PublishAttributedTextItem("spamInfoItemId", new AttributedText(resources.getString(R.string.iac_spam_info_text), Collections.singletonList(new DeepLinkAttribute(resources.getString(R.string.iac_spam_info_link_name), resources.getString(R.string.iac_spam_info_link_text), new IacAnonymousInfoSheetShowDeeplink(), null, null, null, 56, null)), 0, 4, null), zIsAvitoRe23 ? resources.getString(R.string.iac_spam_info_title) : null);
    }

    public static final Boolean n(b bVar) {
        Object next;
        Iterator<T> it = bVar.f244066b.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ParameterSlot) next).getId(), IacDevicesSlot.IAC_PRO_CHOSEN_WIDGET_ID)) {
                break;
            }
        }
        BooleanParameter booleanParameter = next instanceof BooleanParameter ? (BooleanParameter) next : null;
        if (booleanParameter != null) {
            return booleanParameter.get_value();
        }
        return null;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        return ((com.avito.android.publish.slots.iac_devices.a) this.f244083s.getValue()).c();
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
        return ((com.avito.android.publish.slots.iac_devices.a) this.f244083s.getValue()).d(aVar);
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final f e(@Y61.k ParameterSlot parameterSlot) {
        return ((com.avito.android.publish.slots.iac_devices.a) this.f244083s.getValue()).b(parameterSlot);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244066b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        return ((com.avito.android.publish.slots.iac_devices.a) this.f244083s.getValue()).a();
    }

    public final List<String> o() {
        Object next;
        Iterator<T> it = this.f244066b.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof MultiselectParameter) {
                break;
            }
        }
        if (!(next instanceof MultiselectParameter)) {
            next = null;
        }
        MultiselectParameter multiselectParameter = (MultiselectParameter) next;
        if (multiselectParameter != null) {
            return multiselectParameter.get_value();
        }
        return null;
    }

    public final boolean p() {
        List<String> listO = o();
        return listO != null && listO.contains(this.f244074j.getF253025a());
    }
}

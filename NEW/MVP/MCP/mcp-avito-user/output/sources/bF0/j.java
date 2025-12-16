package bf0;

import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import bf0.f;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.items.iac_for_pro.IacProBlockItem;
import com.avito.android.publish.slots.contact_method.ContactMethodEmptyException;
import com.avito.android.publish.slots.contact_method.info_item.ContactMethodInfoBlockItem;
import com.avito.android.publish.slots.contact_method.item.ContactMethodItem;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import nJ.C44283s;
import yc.C50213a;

/* compiled from: ContactMethodSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbf0/j;", "Lbf0/f;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ContactMethodSlot f57341a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f57342b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25642a f57343c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f57344d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final IacDevicesSlot f57345e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f57346f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f57347g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C50213a f57348h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final OL.a f57349i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f57350j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f57351k = i.a(f.a.a(this), NotificationsSettings.Section.SECTION_MESSENGER, "any");

    /* renamed from: l, reason: collision with root package name */
    public boolean f57352l = i.a(f.a.a(this), "phone", "any");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f57353m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final BooleanParameter f57354n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f57355o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f57356p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f57357q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f57358r;

    /* compiled from: ContactMethodSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbf0/j$a;", "", "<init>", "()V", "", "BANNER_MESSENGER_CALLS_ITEM_ID", "Ljava/lang/String;", "BANNER_ONLY_CALLS_ITEM_ID", "BANNER_ONLY_MESSENGER_ITEM_ID", "IAC_PRO_ENABLED_CHOSEN_ID", "", "MESSENGER_CALLS_BLOCK_SHOWING_MAX_TIMES", "I", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public j(@Y61.k ContactMethodSlot contactMethodSlot, @Y61.k com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar, @Y61.k InterfaceC25642a interfaceC25642a, @Y61.k Q1 q12, @l IacDevicesSlot iacDevicesSlot, boolean z12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k OL.a aVar, @l Integer num) {
        Parcelable parcelable;
        List<ParameterSlot> parameters;
        Object next;
        this.f57341a = contactMethodSlot;
        this.f57342b = cVar;
        this.f57343c = interfaceC25642a;
        this.f57344d = q12;
        this.f57345e = iacDevicesSlot;
        this.f57346f = z12;
        this.f57347g = interfaceC28373a;
        this.f57348h = c50213a;
        this.f57349i = aVar;
        this.f57350j = num;
        Boolean boolIsPhoneDisabled = ((ContactMethodSlotConfig) contactMethodSlot.getWidget().getConfig()).isPhoneDisabled();
        this.f57353m = boolIsPhoneDisabled != null ? boolIsPhoneDisabled.booleanValue() : false;
        if (iacDevicesSlot == null || (parameters = iacDevicesSlot.getParameters()) == null) {
            parcelable = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((ParameterSlot) next).getId(), IacDevicesSlot.IAC_PRO_CHOSEN_WIDGET_ID)) {
                        break;
                    }
                }
            }
            parcelable = (ParameterSlot) next;
        }
        BooleanParameter booleanParameter = parcelable instanceof BooleanParameter ? (BooleanParameter) parcelable : null;
        this.f57354n = booleanParameter;
        this.f57355o = booleanParameter != null ? L.f(booleanParameter.get_value(), Boolean.TRUE) : false;
    }

    public final Boolean a() {
        ParameterSlot parameterSlot;
        List<ParameterSlot> parameters;
        Object next;
        IacDevicesSlot iacDevicesSlot = this.f57345e;
        if (iacDevicesSlot == null || (parameters = iacDevicesSlot.getParameters()) == null) {
            parameterSlot = null;
        } else {
            Iterator<T> it = parameters.iterator();
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
            parameterSlot = (ParameterSlot) next;
        }
        BooleanParameter booleanParameter = parameterSlot instanceof BooleanParameter ? (BooleanParameter) parameterSlot : null;
        if (booleanParameter != null) {
            return booleanParameter.get_value();
        }
        return null;
    }

    @Override // bf0.f
    @Y61.k
    public final f.c b(@Y61.k ParameterSlot parameterSlot) {
        return f.c.f117644b;
    }

    @Override // bf0.f
    @Y61.k
    public final C41998x0 c() {
        Object bVar;
        if (this.f57351k || this.f57352l) {
            bVar = new P2.b(new SuccessResult(null));
        } else {
            this.f57356p = true;
            bVar = new P2.a(new ContactMethodEmptyException());
        }
        return z.c0(bVar);
    }

    @Override // bf0.f
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (!(aVar instanceof ContactMethodItem) || !L.f(((ContactMethodItem) aVar).f243284b, f.a.a(this).getId())) {
            if (!(aVar instanceof IacProBlockItem)) {
                return aVar instanceof ContactMethodInfoBlockItem ? new f.b(SlotType.CONTACT_METHOD, null) : f.c.f117644b;
            }
            BooleanParameter booleanParameter = this.f57354n;
            if (booleanParameter != null) {
                booleanParameter.set_value(Boolean.valueOf(((IacProBlockItem) aVar).getF236934c()));
            }
            this.f57347g.c(new C44283s(this.f57350j, this.f57348h.b(), this.f57348h.f443213e, this.f57348h.f443212d.name().toLowerCase(Locale.ROOT), ((IacProBlockItem) aVar).getF236934c()));
            return new f.b(SlotType.CONTACT_METHOD, null);
        }
        ContactMethodItem contactMethodItem = (ContactMethodItem) aVar;
        this.f57351k = contactMethodItem.f243287e;
        this.f57352l = contactMethodItem.f243289g;
        V2.f318762a.c("ContactSloWrapper", "consumeItemValueChange isMessengerChecked: " + this.f57351k + ", isPhoneChecked:" + this.f57352l, null);
        boolean z12 = contactMethodItem.f243287e;
        String str = (z12 && contactMethodItem.f243289g) ? "any" : (!z12 || contactMethodItem.f243289g) ? (z12 || !contactMethodItem.f243289g) ? null : "phone" : NotificationsSettings.Section.SECTION_MESSENGER;
        if (str != null) {
            f.a.a(this).setValue(str);
            this.f57342b.accept(new f.a(SlotType.CONTACT_METHOD, this.f57341a));
        }
        return new f.b(SlotType.CONTACT_METHOD, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    @Override // bf0.f
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList e(@Y61.l com.avito.android.remote.model.search.Theme r26) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bf0.j.e(com.avito.android.remote.model.search.Theme):java.util.ArrayList");
    }

    @Override // bf0.f
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final ContactMethodSlot getF58084a() {
        return this.f57341a;
    }
}

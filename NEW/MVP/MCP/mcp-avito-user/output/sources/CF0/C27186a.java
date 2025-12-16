package cf0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bf0.InterfaceC25642a;
import bf0.f;
import com.avito.android.R;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.items.alert_banner.AlertBannerItem;
import com.avito.android.publish.slots.contact_method.publish.item.ContactMethodSelect;
import com.avito.android.publish.slots.contact_method.publish.item.ContactMethodType;
import com.avito.android.publish.slots.contact_method.publish.item.PublishContactMethodItem;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.P2;
import com.jakewharton.rxrelay3.c;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishContactMethodSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcf0/a;", "Lbf0/f;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C27186a implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContactMethodSlot f58084a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c<com.avito.android.category_parameters.f> f58085b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC25642a f58086c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58087d;

    /* compiled from: PublishContactMethodSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcf0/a$a;", "", "<init>", "()V", "", "ALERT_BANNER_ID", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf0.a$a, reason: collision with other inner class name */
    public static final class C2055a {
        public /* synthetic */ C2055a(C42822w c42822w) {
            this();
        }

        public C2055a() {
        }
    }

    static {
        new C2055a(null);
    }

    public C27186a(@k ContactMethodSlot contactMethodSlot, @k c<com.avito.android.category_parameters.f> cVar, @k InterfaceC25642a interfaceC25642a, boolean z12) {
        this.f58084a = contactMethodSlot;
        this.f58085b = cVar;
        this.f58086c = interfaceC25642a;
        this.f58087d = z12;
    }

    @Override // bf0.f
    @k
    public final f.c b(@k ParameterSlot parameterSlot) {
        if (L.f(parameterSlot.getId(), f.a.a(this).getId()) && (parameterSlot instanceof ContactMethodSlot)) {
            f.a.a(this).setValue(((ContactMethodSlotConfig) ((ContactMethodSlot) parameterSlot).getWidget().getConfig()).getField().get_value());
            this.f58085b.accept(new f.a(SlotType.CONTACT_METHOD, this.f58084a));
        }
        return f.c.f117644b;
    }

    @Override // bf0.f
    @k
    public final C41998x0 c() {
        return z.c0(new P2.b(new SuccessResult(null)));
    }

    @Override // bf0.f
    @k
    public final com.avito.android.category_parameters.f d(@k com.avito.conveyor_item.a aVar) {
        if (!(aVar instanceof PublishContactMethodItem) || !L.f(aVar.getF76517c(), f.a.a(this).getId())) {
            return f.c.f117644b;
        }
        String str = ((PublishContactMethodItem) aVar).f243331d;
        if (str != null) {
            f.a.a(this).setValue(str);
            this.f58085b.accept(new f.a(SlotType.CONTACT_METHOD, this.f58084a));
        }
        return new f.b(SlotType.CONTACT_METHOD, null);
    }

    @Override // bf0.f
    @k
    public final ArrayList e(@l Theme theme) {
        boolean z12;
        ArrayList arrayList = new ArrayList();
        String id2 = f.a.a(this).getId();
        String title = f.a.a(this).getTitle();
        SelectParameter.Value selectedValue = f.a.a(this).getSelectedValue();
        String id3 = selectedValue != null ? selectedValue.getId() : null;
        List<SelectParameter.Value> values = f.a.a(this).getValues();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(values, 10));
        Iterator<T> it = values.iterator();
        while (true) {
            z12 = true;
            if (!it.hasNext()) {
                break;
            }
            SelectParameter.Value value = (SelectParameter.Value) it.next();
            arrayList2.add(new ContactMethodSelect(value.getId(), value.getTitle(), !value.getIsDisabled()));
        }
        List<SelectParameter.Value> values2 = f.a.a(this).getValues();
        if ((values2 instanceof Collection) && values2.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it2 = values2.iterator();
            while (it2.hasNext()) {
                if (!((SelectParameter.Value) it2.next()).getIsDisabled()) {
                    break;
                }
            }
            z12 = false;
        }
        arrayList.add(new PublishContactMethodItem(id2, title, id3, arrayList2, z12));
        if (!this.f58087d) {
            SelectParameter.Value selectedValue2 = f.a.a(this).getSelectedValue();
            String id4 = selectedValue2 != null ? selectedValue2.getId() : null;
            ContactMethodType contactMethodType = ContactMethodType.f243323c;
            if (L.f(id4, "phone")) {
                InterfaceC25642a interfaceC25642a = this.f58086c;
                arrayList.add(new AlertBannerItem("ALERT_BANNER_ID", interfaceC25642a.n(), interfaceC25642a.j(), R.attr.publish_alertBannerStyle_info, Integer.valueOf(R.drawable.common_ic_info_24), null));
            }
        }
        return arrayList;
    }

    @Override // bf0.f
    @k
    /* renamed from: f, reason: from getter */
    public final ContactMethodSlot getF58084a() {
        return this.f58084a;
    }
}

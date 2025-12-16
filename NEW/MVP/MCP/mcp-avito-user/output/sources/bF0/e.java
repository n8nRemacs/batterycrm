package bf0;

import JO.m;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bf0.f;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.items.alert_banner.AlertBannerItem;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.P2;
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

/* compiled from: ContactMethodSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbf0/e;", "Lbf0/f;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ContactMethodSlot f57335a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f57336b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25642a f57337c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57338d;

    /* compiled from: ContactMethodSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbf0/e$a;", "", "<init>", "()V", "", "ALERT_BANNER_ID", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public e(@Y61.k ContactMethodSlot contactMethodSlot, @Y61.k com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar, @Y61.k InterfaceC25642a interfaceC25642a, boolean z12) {
        this.f57335a = contactMethodSlot;
        this.f57336b = cVar;
        this.f57337c = interfaceC25642a;
        this.f57338d = z12;
    }

    @Override // bf0.f
    @Y61.k
    public final f.c b(@Y61.k ParameterSlot parameterSlot) {
        if (L.f(parameterSlot.getId(), f.a.a(this).getId()) && (parameterSlot instanceof ContactMethodSlot)) {
            f.a.a(this).setValue(((ContactMethodSlotConfig) ((ContactMethodSlot) parameterSlot).getWidget().getConfig()).getField().get_value());
            this.f57336b.accept(new f.a(SlotType.CONTACT_METHOD, this.f57335a));
        }
        return f.c.f117644b;
    }

    @Override // bf0.f
    @Y61.k
    public final C41998x0 c() {
        return z.c0(new P2.b(new SuccessResult(null)));
    }

    @Override // bf0.f
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        return f.c.f117644b;
    }

    @Override // bf0.f
    @Y61.k
    public final ArrayList e(@l Theme theme) {
        boolean z12;
        ArrayList arrayList = new ArrayList();
        String id2 = f.a.a(this).getId();
        String title = f.a.a(this).getTitle();
        SelectParameter.Value selectedValue = f.a.a(this).getSelectedValue();
        String title2 = selectedValue != null ? selectedValue.getTitle() : null;
        List<SelectParameter.Value> values = f.a.a(this).getValues();
        SelectParameter.Value selectedValue2 = f.a.a(this).getSelectedValue();
        List<String> list = i.f57340a;
        List<SelectParameter.Value> list2 = values;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (SelectParameter.Value value : list2) {
            arrayList2.add(i.b(value, L.f(selectedValue2, value)));
        }
        SelectParameter.Value selectedValue3 = f.a.a(this).getSelectedValue();
        m mVarB = selectedValue3 != null ? i.b(selectedValue3, true) : null;
        List<SelectParameter.Value> values2 = f.a.a(this).getValues();
        if ((values2 instanceof Collection) && values2.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it = values2.iterator();
            while (it.hasNext()) {
                if (!((SelectParameter.Value) it.next()).getIsDisabled()) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        arrayList.add(new ParameterElement.C.b(id2, title, null, title2, null, f.a.a(this).getDisplaying(), null, mVarB, arrayList2, null, null, true, z12, true, null, null, false, false, null, null, theme, false, false, false, null, null, null, null, null, 0, null, null, false, -1063340, 1, null));
        if (!this.f57338d) {
            SelectParameter.Value selectedValue4 = f.a.a(this).getSelectedValue();
            if (L.f(selectedValue4 != null ? selectedValue4.getId() : null, "phone")) {
                InterfaceC25642a interfaceC25642a = this.f57337c;
                arrayList.add(new AlertBannerItem("ALERT_BANNER_ID", interfaceC25642a.n(), interfaceC25642a.j(), R.attr.publish_alertBannerStyle_info, Integer.valueOf(R.drawable.common_ic_info_24), null));
            }
        }
        return arrayList;
    }

    @Override // bf0.f
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final ContactMethodSlot getF58084a() {
        return this.f57335a;
    }
}

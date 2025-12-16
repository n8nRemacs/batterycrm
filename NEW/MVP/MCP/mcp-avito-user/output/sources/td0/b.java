package Td0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacDevicesStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTd0/b;", "LTd0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IacDevicesSlot f15759a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public List<String> f15760b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Boolean f15761c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Boolean f15762d;

    public b(@k IacDevicesSlot iacDevicesSlot) {
        this.f15759a = iacDevicesSlot;
    }

    @Override // Td0.c
    public final void a() {
        Object next;
        Object next2;
        Object next3;
        IacDevicesSlot iacDevicesSlot = this.f15759a;
        Iterator<T> it = iacDevicesSlot.getParameters().iterator();
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
        BooleanParameter booleanParameter = next instanceof BooleanParameter ? (BooleanParameter) next : null;
        this.f15761c = booleanParameter != null ? booleanParameter.get_value() : null;
        Iterator<T> it2 = iacDevicesSlot.getParameters().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (L.f(((ParameterSlot) next2).getId(), IacDevicesSlot.IAC_UPDATED_BY_PRO_WIDGET_ID)) {
                    break;
                }
            }
        }
        BooleanParameter booleanParameter2 = next2 instanceof BooleanParameter ? (BooleanParameter) next2 : null;
        this.f15762d = booleanParameter2 != null ? booleanParameter2.get_value() : null;
        Iterator<T> it3 = iacDevicesSlot.getParameters().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (next3 instanceof MultiselectParameter) {
                    break;
                }
            }
        }
        if (!(next3 instanceof MultiselectParameter)) {
            next3 = null;
        }
        MultiselectParameter multiselectParameter = (MultiselectParameter) next3;
        this.f15760b = multiselectParameter != null ? (List) multiselectParameter.getValue() : null;
    }

    @Override // Td0.c
    public final void b() {
        Object next;
        Object next2;
        Object next3;
        IacDevicesSlot iacDevicesSlot = this.f15759a;
        Iterator<T> it = iacDevicesSlot.getParameters().iterator();
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
        BooleanParameter booleanParameter = next instanceof BooleanParameter ? (BooleanParameter) next : null;
        if (booleanParameter != null) {
            booleanParameter.set_value(this.f15761c);
        }
        Iterator<T> it2 = iacDevicesSlot.getParameters().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (L.f(((ParameterSlot) next2).getId(), IacDevicesSlot.IAC_UPDATED_BY_PRO_WIDGET_ID)) {
                    break;
                }
            }
        }
        BooleanParameter booleanParameter2 = next2 instanceof BooleanParameter ? (BooleanParameter) next2 : null;
        if (booleanParameter2 != null) {
            booleanParameter2.set_value(this.f15762d);
        }
        Iterator<T> it3 = iacDevicesSlot.getParameters().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (next3 instanceof MultiselectParameter) {
                    break;
                }
            }
        }
        MultiselectParameter multiselectParameter = (MultiselectParameter) (next3 instanceof MultiselectParameter ? next3 : null);
        if (multiselectParameter == null) {
            return;
        }
        multiselectParameter.setValue(this.f15760b);
    }
}

package Se0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodySide;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodySidePoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoGroupSlotsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSe0/b;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Se0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15178b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15178b f15105a = new C15178b();

    @k
    public static ArrayList a(@k CarBodyConditionSlot carBodyConditionSlot, @k List list) {
        List<CarBodySide> sides = ((CarBodyConditionSlotConfig) carBodyConditionSlot.getWidget().getConfig()).getSides();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sides.iterator();
        while (it.hasNext()) {
            C42745f0.h(((CarBodySide) it.next()).getPoints(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CarBodySidePoint carBodySidePoint = (CarBodySidePoint) it2.next();
            ArrayList arrayList3 = new ArrayList();
            for (String str : carBodySidePoint.getParams()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ParameterSlot parameterSlot = (ParameterSlot) it3.next();
                    if ((parameterSlot instanceof MultiselectParameter) && L.f(parameterSlot.getId(), str)) {
                        arrayList3.add(parameterSlot);
                    }
                }
            }
            C42745f0.h(arrayList3, arrayList2);
        }
        return arrayList2;
    }

    @k
    public static ArrayList b(@k List list, @k List list2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (L.f(((ParameterSlot) next).getId(), str)) {
                    break;
                }
            }
            ParameterSlot parameterSlot = (ParameterSlot) next;
            if (parameterSlot != null) {
                arrayList.add(parameterSlot);
            }
        }
        return arrayList;
    }
}

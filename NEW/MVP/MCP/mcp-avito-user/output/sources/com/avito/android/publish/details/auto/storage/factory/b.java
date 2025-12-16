package com.avito.android.publish.details.auto.storage.factory;

import Se0.C15178b;
import Td0.C15353a;
import Td0.d;
import Td0.e;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.car_body_condition.CarBodyConditionSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_info.ContactInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlot;
import com.avito.android.remote.model.category_parameters.slot.contact_method.ContactMethodSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.s0;

/* compiled from: InitialStoragesFactoryImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/auto/storage/factory/b;", "Lcom/avito/android/publish/details/auto/storage/factory/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.publish.details.auto.storage.factory.a
    @k
    public final Set<Td0.c> a(@l ParametersTree parametersTree, @l CategoryParameters categoryParameters) {
        if (parametersTree == null || categoryParameters == null) {
            return B0.f406639b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ParameterSlot parameterSlot : parametersTree) {
            if (parameterSlot instanceof SelectParameter) {
                arrayList.add(parameterSlot);
            } else if (parameterSlot instanceof MultiselectParameter) {
                arrayList2.add(parameterSlot);
            } else if (parameterSlot instanceof CarBodyConditionSlot) {
                C15178b c15178b = C15178b.f15105a;
                List<ParameterSlot> parameters = categoryParameters.getParameters();
                c15178b.getClass();
                arrayList2.addAll(C15178b.a((CarBodyConditionSlot) parameterSlot, parameters));
            } else if (parameterSlot instanceof ContactInfoSlot) {
                linkedHashSet.add(new C15353a((ContactInfoSlot) parameterSlot));
            } else if (parameterSlot instanceof IacDevicesSlot) {
                linkedHashSet.add(new Td0.b((IacDevicesSlot) parameterSlot));
            } else if (parameterSlot instanceof ContactMethodSlot) {
                arrayList.add(((ContactMethodSlotConfig) ((ContactMethodSlot) parameterSlot).getWidget().getConfig()).getField());
            }
        }
        linkedHashSet.add(new d(arrayList2));
        linkedHashSet.add(new e(arrayList));
        return linkedHashSet;
    }
}

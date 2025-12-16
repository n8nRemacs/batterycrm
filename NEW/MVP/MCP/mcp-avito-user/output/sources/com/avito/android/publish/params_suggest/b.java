package com.avito.android.publish.params_suggest;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ApplyParamsSuggestsInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/params_suggest/b;", "Lcom/avito/android/publish/params_suggest/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.avito.android.remote.model.category_parameters.CategoryParameters] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.avito.android.remote.model.category_parameters.CharParameter] */
    @Override // com.avito.android.publish.params_suggest.a
    @Y61.k
    public final CategoryParameters a(@Y61.k CategoryParameters categoryParameters, @Y61.k List<d> list) {
        MultiselectParameter multiselectParameter;
        ArrayList arrayList = new ArrayList();
        for (d dVar : list) {
            List<String> list2 = dVar.f238186b;
            if (list2 == null) {
                multiselectParameter = null;
            } else if (list2.size() == 1) {
                String str = dVar.f238185a;
                multiselectParameter = new CharParameter(str, str, false, false, null, null, null, (String) C42745f0.u0(list2), null, null, null, null, null, null, null, null, null, null, 262000, null);
            } else {
                multiselectParameter = new MultiselectParameter(dVar.f238185a, C42745f0.O(list2, null, null, null, null, 63), false, false, null, null, null, list2, null, C42784z0.f406748b, null, null, null, null, null, null, null, null, null, null, false, null, 4193280, null);
            }
            if (multiselectParameter != null) {
                arrayList.add(multiselectParameter);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ParameterSlot) it.next()).getId());
        }
        return categoryParameters.cloneWithNewParameters(arrayList, (String[]) arrayList2.toArray(new String[0]));
    }
}

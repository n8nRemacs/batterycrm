package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.step.validations.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ValidationUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_rating-form_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class v {
    @Y61.k
    public static final LinkedHashMap a(@Y61.k ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u.a aVar = (u.a) it.next();
            linkedHashMap.put(aVar.f249757a, new ValidationInfo(com.avito.android.printable_text.b.f(aVar.f249758b), aVar.f249760d, aVar.f249759c));
        }
        return linkedHashMap;
    }
}

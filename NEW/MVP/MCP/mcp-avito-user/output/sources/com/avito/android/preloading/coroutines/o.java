package com.avito.android.preloading.coroutines;

import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.preloading.coroutines.x;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: PreloadingPersistance.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_preloading-promise"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o {
    @Y61.k
    public static final <Params, Response> AbstractC33302a<Params, Response> a(@Y61.k String str, @Y61.k S0 s02, @Y61.k Y41.a<? extends AbstractC33302a<Params, Response>> aVar) {
        LinkedHashMap linkedHashMap = ((x) new P0(s02, new x.a(), null, 4, null).a(x.class)).f221848E;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = (AbstractC33302a) ((AbstractC33302a<Params, Response>) aVar.invoke());
            linkedHashMap.put(str, obj);
        }
        AbstractC33302a<Params, Response> abstractC33302a = obj instanceof AbstractC33302a ? (AbstractC33302a) obj : null;
        if (abstractC33302a != null) {
            return abstractC33302a;
        }
        throw new IllegalArgumentException("Type is stored by key doesn't match with required");
    }
}

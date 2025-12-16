package P91;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC42738c;

/* loaded from: classes9.dex */
public abstract class d {
    public static final boolean a(ru.mts.biometry.sdk.feature.document.intro.domain.d dVar) {
        List list = ru.mts.biometry.sdk.feature.document.intro.domain.d.f436442f;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractC42738c) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ru.mts.biometry.sdk.feature.document.intro.domain.d dVar2 = (ru.mts.biometry.sdk.feature.document.intro.domain.d) next;
            if (dVar2 == ru.mts.biometry.sdk.feature.document.intro.domain.d.f436439c || dVar2 == ru.mts.biometry.sdk.feature.document.intro.domain.d.f436440d) {
                arrayList.add(next);
            }
        }
        return arrayList.contains(dVar);
    }
}

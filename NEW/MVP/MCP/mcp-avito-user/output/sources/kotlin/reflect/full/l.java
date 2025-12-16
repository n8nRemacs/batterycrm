package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: KClasses.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class l {
    @Y61.k
    public static final ArrayList a(@Y61.k kotlin.reflect.d dVar) {
        Collection<kotlin.reflect.c<?>> collectionO0 = dVar.o0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionO0) {
            if (obj instanceof kotlin.reflect.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

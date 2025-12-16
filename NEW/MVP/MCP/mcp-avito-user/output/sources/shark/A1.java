package shark;

import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: GraphContext.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/A1;", "", "<init>", "()V", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f437944a = new LinkedHashMap();

    public final <T> T a(@Y61.k String str, @Y61.k Y41.a<? extends T> aVar) {
        LinkedHashMap linkedHashMap = this.f437944a;
        T t12 = (T) linkedHashMap.get(str);
        if (t12 != null) {
            return t12;
        }
        T tInvoke = aVar.invoke();
        linkedHashMap.put(str, tInvoke);
        return tInvoke;
    }
}

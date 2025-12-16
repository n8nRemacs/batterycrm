package io.ktor.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: StringValues.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/z0;", "", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface z0 {

    /* compiled from: StringValues.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/z0$a;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        static {
            new a();
            new D0(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: StringValues.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public static void a(@Y61.k z0 z0Var, @Y61.k Y41.p<? super String, ? super List<String>, kotlin.G0> pVar) {
            Iterator<T> it = z0Var.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                pVar.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }
    }

    @Y61.l
    List<String> a(@Y61.k String str);

    @Y61.k
    Set<Map.Entry<String, List<String>>> b();

    void c(@Y61.k Y41.p<? super String, ? super List<String>, kotlin.G0> pVar);

    /* renamed from: d */
    boolean getF400387c();

    @Y61.l
    String get(@Y61.k String str);

    boolean isEmpty();

    @Y61.k
    Set<String> names();
}

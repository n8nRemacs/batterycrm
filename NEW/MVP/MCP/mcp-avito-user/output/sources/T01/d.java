package t01;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f439020a = new ConcurrentHashMap(16);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f439021a;

        /* renamed from: b, reason: collision with root package name */
        public final long f439022b;

        public a(long j12, long j13) {
            this.f439021a = j12;
            this.f439022b = j13;
        }
    }

    public static a a(String str) {
        StringBuilder sb2 = new StringBuilder("map size of get is before:");
        ConcurrentHashMap concurrentHashMap = f439020a;
        sb2.append(concurrentHashMap.size());
        Logger.v("RequestUtil", sb2.toString());
        a aVar = (a) concurrentHashMap.get(str);
        Logger.v("RequestUtil", "map size of get is after:" + concurrentHashMap.size());
        return aVar;
    }

    public static void b(String str, a aVar) {
        StringBuilder sb2 = new StringBuilder("map size of put is before:");
        ConcurrentHashMap concurrentHashMap = f439020a;
        sb2.append(concurrentHashMap.size());
        Logger.v("RequestUtil", sb2.toString());
        concurrentHashMap.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after:" + concurrentHashMap.size());
    }
}

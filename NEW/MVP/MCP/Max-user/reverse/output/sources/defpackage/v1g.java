package defpackage;

import java.util.HashMap;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class v1g implements w1g {
    public final w1g a;
    public final HashMap b = new HashMap();

    public v1g(w1g w1gVar) {
        this.a = w1gVar;
    }

    @Override // defpackage.w1g
    public final ThreadFactory a(String str) {
        HashMap map = this.b;
        ThreadFactory threadFactory = (ThreadFactory) map.get(str);
        if (threadFactory != null) {
            return threadFactory;
        }
        ThreadFactory threadFactoryA = this.a.a(str);
        map.put(str, threadFactoryA);
        return threadFactoryA;
    }
}

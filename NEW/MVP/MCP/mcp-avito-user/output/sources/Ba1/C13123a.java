package Ba1;

import java.util.LinkedHashMap;

/* renamed from: Ba1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13123a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1496a = new LinkedHashMap();

    public final Object a(String str, Y41.a aVar) {
        long jNanoTime = System.nanoTime();
        Object objInvoke = aVar.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        long j12 = 1000;
        this.f1496a.put(str, Integer.valueOf((int) ((jNanoTime2 / j12) / j12)));
        return objInvoke;
    }
}

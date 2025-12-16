package com.huawei.updatesdk.b.g;

import android.os.AsyncTask;
import com.huawei.updatesdk.a.b.c.c.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static List<AsyncTask> f363853a = new CopyOnWriteArrayList();

    public static com.huawei.updatesdk.a.b.c.b a(com.huawei.updatesdk.b.b.c cVar, com.huawei.updatesdk.a.b.c.c.a aVar) {
        com.huawei.updatesdk.a.b.c.b bVar = new com.huawei.updatesdk.a.b.c.b(cVar, aVar);
        a(bVar, cVar);
        return bVar;
    }

    public static d a(com.huawei.updatesdk.a.b.c.c.c cVar) {
        return new com.huawei.updatesdk.a.b.c.b(cVar, null).c();
    }

    public static List<AsyncTask> a() {
        return f363853a;
    }

    public static void a(AsyncTask asyncTask) {
        if (asyncTask == null) {
            return;
        }
        for (AsyncTask asyncTask2 : f363853a) {
            if (asyncTask2 != null && (asyncTask2.getStatus() == AsyncTask.Status.FINISHED || asyncTask2.isCancelled())) {
                f363853a.remove(asyncTask);
            }
        }
        f363853a.add(asyncTask);
    }

    private static void a(com.huawei.updatesdk.a.b.c.b bVar, com.huawei.updatesdk.b.b.c cVar) {
        StringBuilder sb2 = new StringBuilder("executeTask, ActiveCount:");
        ThreadPoolExecutor threadPoolExecutor = c.f363854a;
        sb2.append(threadPoolExecutor.getActiveCount());
        sb2.append(", TaskCount:");
        sb2.append(threadPoolExecutor.getTaskCount());
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreAgent", sb2.toString());
        bVar.a(threadPoolExecutor);
    }
}

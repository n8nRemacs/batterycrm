package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o1a {
    public static final Object b = new Object();
    public static o1a c;
    public vl3 a;

    public static o1a c() {
        o1a o1aVar;
        synchronized (b) {
            s5j.i("MlKitContext has not been initialized", c != null);
            o1aVar = c;
            s5j.g(o1aVar);
        }
        return o1aVar;
    }

    public static o1a d(Context context, Executor executor) {
        o1a o1aVar;
        synchronized (b) {
            s5j.i("MlKitContext is already initialized", c == null);
            o1a o1aVar2 = new o1a();
            c = o1aVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListH = new py0(context, 10, new ukd(12, MlKitComponentDiscoveryService.class)).h();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            df3 df3Var = sl3.n;
            arrayList.addAll(arrayListH);
            arrayList2.add(cl3.c(context, Context.class, new Class[0]));
            arrayList2.add(cl3.c(o1aVar2, o1a.class, new Class[0]));
            vl3 vl3Var = new vl3(executor, arrayList, arrayList2, df3Var);
            o1aVar2.a = vl3Var;
            vl3Var.o(true);
            o1aVar = c;
        }
        return o1aVar;
    }

    public final Object a(Class cls) {
        s5j.i("MlKitContext has been deleted", c == this);
        s5j.g(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}

package XZ0;

import android.content.Context;
import com.huawei.agconnect.d;
import java.util.HashMap;

@Deprecated
/* loaded from: classes7.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f18925a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f18926b = new Object();

    public static a c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return d(context, context.getPackageName());
    }

    public static a d(Context context, String str) {
        a dVar;
        synchronized (f18926b) {
            try {
                HashMap map = f18925a;
                dVar = (a) map.get(str);
                if (dVar == null) {
                    dVar = new com.huawei.agconnect.config.a.d(context, str);
                    map.put(str, dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }
}

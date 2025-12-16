package V01;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static SharedPreferences f16867a;

    public static synchronized SharedPreferences a(Context context) {
        try {
            if (f16867a == null) {
                f16867a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16867a;
    }
}

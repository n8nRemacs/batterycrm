package nc1;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Z;

/* loaded from: classes9.dex */
public abstract class a {
    public static SharedPreferences a(b bVar, Context context, int i12, Y41.a aVar) {
        Object bVar2;
        int i13 = i12 + 1;
        if (10 == i13) {
            return null;
        }
        try {
            int i14 = Z.f406624c;
            bVar2 = (SharedPreferences) aVar.invoke();
        } catch (Throwable th2) {
            int i15 = Z.f406624c;
            bVar2 = new Z.b(th2);
        }
        boolean z12 = bVar2 instanceof Z.b;
        if (z12 && i13 > 3) {
            context.getSharedPreferences(context.getPackageName() + "session_store", 0).edit().clear().apply();
        }
        SharedPreferences sharedPreferences = (SharedPreferences) (z12 ? null : bVar2);
        return sharedPreferences != null ? sharedPreferences : bVar.a(context, i13, aVar);
    }
}

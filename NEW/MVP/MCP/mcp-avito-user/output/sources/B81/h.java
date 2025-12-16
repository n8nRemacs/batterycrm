package B81;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Z;

/* loaded from: classes9.dex */
public final class h implements nc1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f902a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f903b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f904c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42726C f905d;

    public h(Context context) {
        Object bVar;
        this.f902a = context;
        try {
            int i12 = Z.f406624c;
            MasterKey.d dVar = new MasterKey.d(context);
            dVar.b();
            bVar = dVar.a();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        this.f903b = bVar;
        this.f904c = nc1.a.a(this, this.f902a, 0, new g(this));
        this.f905d = C42727D.c(f.f900l);
    }

    @Override // nc1.b
    public final SharedPreferences a(Context context, int i12, Y41.a aVar) {
        return nc1.a.a(this, context, i12, aVar);
    }
}

package vc1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.MasterKey;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Z;

/* loaded from: classes9.dex */
public final class c implements nc1.b, Kc1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f440908a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f440909b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f440910c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42726C f440911d;

    public c(Context context) {
        Object bVar;
        this.f440908a = context;
        try {
            int i12 = Z.f406624c;
            MasterKey.d dVar = new MasterKey.d(context);
            dVar.b();
            bVar = dVar.a();
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        this.f440909b = bVar;
        this.f440910c = nc1.a.a(this, this.f440908a, 0, new b(this));
        this.f440911d = C42727D.c(a.f440906l);
    }

    @Override // nc1.b
    public final SharedPreferences a(Context context, int i12, Y41.a aVar) {
        return nc1.a.a(this, context, i12, aVar);
    }
}

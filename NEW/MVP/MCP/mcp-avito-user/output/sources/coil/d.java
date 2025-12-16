package coil;

import android.content.Context;
import coil.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Coil.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/d;", "", "<init>", "()V", "coil-singleton_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f58265a = new d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public static j f58266b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public static com.avito.android.coil.a f58267c;

    @X41.n
    @Y61.k
    public static final j a(@Y61.k Context context) {
        j jVarA = f58266b;
        if (jVarA == null) {
            synchronized (f58265a) {
                try {
                    jVarA = f58266b;
                    if (jVarA == null) {
                        com.avito.android.coil.a aVar = f58267c;
                        if (aVar == null || (jVarA = aVar.a()) == null) {
                            Object applicationContext = context.getApplicationContext();
                            k kVar = applicationContext instanceof k ? (k) applicationContext : null;
                            jVarA = kVar != null ? kVar.a() : new j.a(context).a();
                        }
                        f58267c = null;
                        f58266b = jVarA;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jVarA;
    }
}

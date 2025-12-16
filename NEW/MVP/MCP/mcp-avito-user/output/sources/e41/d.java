package E41;

import Y41.l;
import a.AbstractC19646l;
import android.content.res.Resources;
import kotlin.G0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;
import org.koin.core.instance.g;
import w71.C49464c;
import x71.f;

/* loaded from: classes8.dex */
public final class d extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public static final d f3762l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        t71.c cVar = (t71.c) obj;
        a aVar = a.f3759l;
        f.f442253e.getClass();
        C49464c c49464c = f.f442254f;
        Kind kind = Kind.f421443b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        n0 n0Var = m0.f406844a;
        g<?> gVarA = AbstractC19646l.a(new org.koin.core.definition.a(c49464c, n0Var.b(Resources.class), null, aVar, kind, c42784z0), cVar);
        boolean z12 = cVar.f439150a;
        if (z12) {
            cVar.b(gVarA);
        }
        g<?> gVarA2 = AbstractC19646l.a(new org.koin.core.definition.a(c49464c, n0Var.b(OkHttpClient.Builder.class), null, b.f3760l, kind, c42784z0), cVar);
        if (z12) {
            cVar.b(gVarA2);
        }
        g<?> gVarA3 = AbstractC19646l.a(new org.koin.core.definition.a(c49464c, n0Var.b(D81.c.class), null, c.f3761l, kind, c42784z0), cVar);
        if (z12) {
            cVar.b(gVarA3);
        }
        return G0.f406611a;
    }
}

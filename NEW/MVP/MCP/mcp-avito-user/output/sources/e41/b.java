package E41;

import Y41.p;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import okhttp3.OkHttpClient;
import z81.f;
import z81.j;

/* loaded from: classes8.dex */
public final class b extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public static final b f3760l = new b();

    public b() {
        super(2);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        ((j) ((f) ((org.koin.core.scope.a) obj).b(null, m0.f406844a.b(f.class), null))).f443873c.invoke(builder);
        return builder;
    }
}

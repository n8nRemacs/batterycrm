package z81;

import Y41.l;
import kotlin.jvm.internal.N;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class i extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f443870l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(1);
        this.f443870l = jVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return j.a(this.f443870l, (OkHttpClient.Builder) obj);
    }
}

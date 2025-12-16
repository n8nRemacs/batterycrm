package U51;

import Y41.l;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class c extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f16204l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar) {
        super(1);
        this.f16204l = hVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        ((io.ktor.client.engine.okhttp.e) obj).a(new b(this.f16204l));
        return G0.f406611a;
    }
}

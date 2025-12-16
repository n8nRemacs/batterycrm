package wa1;

import java.nio.FloatBuffer;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f441589l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FloatBuffer f441590m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, FloatBuffer floatBuffer) {
        super(0);
        this.f441589l = pVar;
        this.f441590m = floatBuffer;
    }

    @Override // Y41.a
    public final Object invoke() {
        p pVar = this.f441589l;
        pVar.f441616c.run(this.f441590m, pVar.f441619f);
        return G0.f406611a;
    }
}

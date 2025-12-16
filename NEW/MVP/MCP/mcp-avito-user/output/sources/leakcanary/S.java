package leakcanary;

import java.lang.reflect.InvocationTargetException;
import kotlin.G0;
import kotlin.Metadata;
import leakcanary.M;

/* compiled from: ServiceWatcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class S extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M.f f414028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f414029m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(M.f fVar, Object obj) {
        super(0);
        this.f414028l = fVar;
        this.f414029m = obj;
    }

    @Override // Y41.a
    public final G0 invoke() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        M.f fVar = this.f414028l;
        Q q12 = new Q(this);
        int i12 = M.f414009h;
        M.this.getClass();
        M.b(q12);
        return G0.f406611a;
    }
}

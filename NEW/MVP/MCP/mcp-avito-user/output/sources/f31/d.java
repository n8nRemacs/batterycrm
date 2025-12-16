package F31;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class d extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f4529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, int i12) {
        super(2);
        this.f4529l = bVar;
        this.f4530m = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f4530m | 1);
        e.a(this.f4529l, (A) obj, iA2);
        return G0.f406611a;
    }
}

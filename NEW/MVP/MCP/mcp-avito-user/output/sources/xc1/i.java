package xc1;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class i extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v.a f442585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f442586m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v.a aVar, int i12) {
        super(2);
        this.f442585l = aVar;
        this.f442586m = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f442586m | 1);
        j.a(this.f442585l, (A) obj, iA2);
        return G0.f406611a;
    }
}

package xc1;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f442587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f442588m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, int i12) {
        super(2);
        this.f442587l = vVar;
        this.f442588m = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f442588m | 1);
        l.a(this.f442587l, (A) obj, iA2);
        return G0.f406611a;
    }
}

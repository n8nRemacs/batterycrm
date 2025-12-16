package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class q extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10903l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10904m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10905n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i12, v vVar, String str) {
        super(2);
        this.f10903l = str;
        this.f10904m = vVar;
        this.f10905n = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f10905n | 1);
        s.n(this.f10903l, this.f10904m, (A) obj, iA2);
        return G0.f406611a;
    }
}

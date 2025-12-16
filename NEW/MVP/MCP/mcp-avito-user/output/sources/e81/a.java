package E81;

import Y41.q;
import androidx.compose.material3.C21914uj;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.jvm.internal.N;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public final class a extends N implements q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f3795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3796m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3797n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, long j12, int i12) {
        super(3);
        this.f3795l = str;
        this.f3796m = j12;
        this.f3797n = i12;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        A a12 = (A) obj2;
        if ((((Number) obj3).intValue() & 81) == 16 && a12.c()) {
            a12.f();
        } else {
            long j12 = AbstractC49426b.f441223t0;
            int i12 = this.f3797n;
            C21914uj.b(this.f3795l, null, this.f3796m, j12, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, a12, ((i12 >> 12) & 14) | 3072 | ((i12 >> 9) & 896), 0, 131058);
        }
        return G0.f406611a;
    }
}

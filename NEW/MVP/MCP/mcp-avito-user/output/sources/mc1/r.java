package Mc1;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class r extends N implements Y41.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10906l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10908n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10909o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10910p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, v vVar, long j12, int i12, int i13) {
        super(2);
        this.f10906l = str;
        this.f10907m = vVar;
        this.f10908n = j12;
        this.f10909o = i12;
        this.f10910p = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f10910p | 1);
        String str = this.f10906l;
        long j12 = this.f10908n;
        int i12 = this.f10909o;
        s.d(str, this.f10907m, j12, i12, (A) obj, iA2);
        return G0.f406611a;
    }
}

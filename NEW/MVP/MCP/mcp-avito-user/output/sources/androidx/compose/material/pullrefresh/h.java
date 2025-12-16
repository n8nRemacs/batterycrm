package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullRefreshIndicator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f33938l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f33939m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33940n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f33941o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f33942p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z12, t tVar, androidx.compose.ui.v vVar, long j12, long j13, int i12) {
        super(2);
        this.f33938l = z12;
        this.f33939m = tVar;
        this.f33940n = vVar;
        this.f33941o = j12;
        this.f33942p = j13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        androidx.compose.ui.v vVar = this.f33940n;
        long j12 = this.f33941o;
        j.a(this.f33938l, this.f33939m, vVar, j12, this.f33942p, a12, iA2);
        return G0.f406611a;
    }
}

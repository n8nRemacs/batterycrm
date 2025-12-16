package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class P4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f33046l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33047m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f33048n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.shape.e f33049o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f33050p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f33051q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K4 f33052r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P4(C22096n c22096n, Y41.a aVar, v.a aVar2, androidx.compose.foundation.shape.e eVar, long j12, long j13, K4 k42, int i12) {
        super(2);
        this.f33046l = c22096n;
        this.f33047m = aVar;
        this.f33048n = aVar2;
        this.f33049o = eVar;
        this.f33050p = j12;
        this.f33051q = j13;
        this.f33052r = k42;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(7);
        K4 k42 = this.f33052r;
        androidx.compose.foundation.shape.e eVar = this.f33049o;
        long j12 = this.f33050p;
        V4.a(this.f33046l, this.f33047m, this.f33048n, eVar, j12, this.f33051q, k42, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

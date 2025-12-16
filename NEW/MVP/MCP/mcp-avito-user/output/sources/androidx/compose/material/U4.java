package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: FloatingActionButton.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class U4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33243l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33244m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.shape.e f33245n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f33246o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f33247p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K4 f33248q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f33249r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f33250s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(Y41.a aVar, androidx.compose.ui.v vVar, androidx.compose.foundation.shape.e eVar, long j12, long j13, K4 k42, C22096n c22096n, int i12) {
        super(2);
        this.f33243l = aVar;
        this.f33244m = vVar;
        this.f33245n = eVar;
        this.f33246o = j12;
        this.f33247p = j13;
        this.f33248q = k42;
        this.f33249r = c22096n;
        this.f33250s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33250s | 1);
        C22096n c22096n = this.f33249r;
        long j12 = this.f33246o;
        long j13 = this.f33247p;
        V4.b(this.f33243l, this.f33244m, this.f33245n, j12, j13, this.f33248q, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

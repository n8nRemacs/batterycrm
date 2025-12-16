package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class J4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v.a f34911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f34912m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f34913n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f34914o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f34915p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f34916q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f34917r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(v.a aVar, Y41.p pVar, long j12, long j13, float f12, C22096n c22096n, int i12) {
        super(2);
        this.f34911l = aVar;
        this.f34912m = pVar;
        this.f34913n = j12;
        this.f34914o = j13;
        this.f34915p = f12;
        this.f34916q = c22096n;
        this.f34917r = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f34917r | 1);
        C22096n c22096n = this.f34916q;
        long j12 = this.f34913n;
        long j13 = this.f34914o;
        V4.a(this.f34911l, this.f34912m, j12, j13, this.f34915p, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

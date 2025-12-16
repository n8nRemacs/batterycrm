package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Surface.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class F9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f32633l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f32634m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f32635n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f32636o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f32637p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f32638q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f32639r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f32640s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F9(androidx.compose.ui.v vVar, androidx.compose.ui.graphics.h1 h1Var, long j12, long j13, float f12, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f32633l = vVar;
        this.f32634m = h1Var;
        this.f32635n = j12;
        this.f32636o = j13;
        this.f32637p = f12;
        this.f32638q = c22096n;
        this.f32639r = i12;
        this.f32640s = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f32639r | 1);
        C22096n c22096n = this.f32638q;
        long j12 = this.f32636o;
        M9.a(this.f32633l, this.f32634m, this.f32635n, j12, this.f32637p, c22096n, a12, iA2, this.f32640s);
        return kotlin.G0.f406611a;
    }
}

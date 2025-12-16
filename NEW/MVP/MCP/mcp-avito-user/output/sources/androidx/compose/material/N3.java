package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: Drawer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N3 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f32969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f32970m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f32971n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f32972o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f32973p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(boolean z12, Y41.a<kotlin.G0> aVar, Y41.a<Float> aVar2, long j12, int i12) {
        super(2);
        this.f32969l = z12;
        this.f32970m = aVar;
        this.f32971n = aVar2;
        this.f32972o = j12;
        this.f32973p = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f32973p | 1);
        Y41.a<Float> aVar = this.f32971n;
        long j12 = this.f32972o;
        V3.b(this.f32969l, this.f32970m, aVar, j12, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

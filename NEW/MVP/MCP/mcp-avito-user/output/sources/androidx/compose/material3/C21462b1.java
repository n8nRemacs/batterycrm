package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BasicTooltip.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21462b1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21459al f36069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q0 f36070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f36071n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f36072o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f36073p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f36074q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21462b1(C21459al c21459al, Q0 q02, kotlinx.coroutines.T t12, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f36069l = c21459al;
        this.f36070m = q02;
        this.f36071n = t12;
        this.f36072o = z12;
        this.f36073p = c22096n;
        this.f36074q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36074q | 1);
        C22096n c22096n = this.f36073p;
        kotlinx.coroutines.T t12 = this.f36071n;
        C21623i1.a(this.f36069l, this.f36070m, t12, this.f36072o, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

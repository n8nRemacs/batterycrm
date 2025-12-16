package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21327r9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f34026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f34027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.shape.e f34028n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f34029o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f34030p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f34031q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f34032r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f34033s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21327r9(androidx.compose.ui.v vVar, C22096n c22096n, androidx.compose.foundation.shape.e eVar, long j12, long j13, float f12, C22096n c22096n2, int i12) {
        super(2);
        this.f34026l = vVar;
        this.f34027m = c22096n;
        this.f34028n = eVar;
        this.f34029o = j12;
        this.f34030p = j13;
        this.f34031q = f12;
        this.f34032r = c22096n2;
        this.f34033s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f34033s | 1);
        C22096n c22096n = this.f34032r;
        long j12 = this.f34029o;
        long j13 = this.f34030p;
        C21434z9.a(this.f34026l, this.f34027m, this.f34028n, j12, j13, this.f34031q, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

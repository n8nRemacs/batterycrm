package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.t9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21356t9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U8 f34207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f34208m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.shape.e f34209n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f34210o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f34211p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f34212q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f34213r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f34214s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21356t9(U8 u82, androidx.compose.ui.v vVar, androidx.compose.foundation.shape.e eVar, long j12, long j13, long j14, float f12, int i12) {
        super(2);
        this.f34207l = u82;
        this.f34208m = vVar;
        this.f34209n = eVar;
        this.f34210o = j12;
        this.f34211p = j13;
        this.f34212q = j14;
        this.f34213r = f12;
        this.f34214s = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f34214s | 1);
        long j12 = this.f34210o;
        long j13 = this.f34211p;
        C21434z9.b(this.f34207l, this.f34208m, this.f34209n, j12, j13, this.f34212q, this.f34213r, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

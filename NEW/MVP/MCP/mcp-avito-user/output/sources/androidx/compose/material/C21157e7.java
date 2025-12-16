package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.e7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21157e7 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f33544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33545m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f33546n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f33547o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f33548p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f33549q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21157e7(float f12, androidx.compose.ui.v vVar, long j12, long j13, int i12, int i13) {
        super(2);
        this.f33544l = f12;
        this.f33545m = vVar;
        this.f33546n = j12;
        this.f33547o = j13;
        this.f33548p = i12;
        this.f33549q = i13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33549q | 1);
        androidx.compose.ui.v vVar = this.f33545m;
        long j12 = this.f33546n;
        C21105a7.b(this.f33544l, vVar, j12, this.f33547o, this.f33548p, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

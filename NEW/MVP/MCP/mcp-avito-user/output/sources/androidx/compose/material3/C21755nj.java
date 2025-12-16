package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.nj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21755nj extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21892tj f36914l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F8 f36915m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f36916n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f36917o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.q<F8, androidx.compose.runtime.A, Integer, androidx.compose.ui.graphics.T> f36918p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f36919q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f36920r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21755nj(C21892tj c21892tj, F8 f82, long j12, long j13, Y41.q qVar, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f36914l = c21892tj;
        this.f36915m = f82;
        this.f36916n = j12;
        this.f36917o = j13;
        this.f36918p = qVar;
        this.f36919q = z12;
        this.f36920r = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1769473);
        C22096n c22096n = this.f36920r;
        F8 f82 = this.f36915m;
        Y41.q<F8, androidx.compose.runtime.A, Integer, androidx.compose.ui.graphics.T> qVar = this.f36918p;
        this.f36914l.a(f82, this.f36916n, this.f36917o, qVar, this.f36919q, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

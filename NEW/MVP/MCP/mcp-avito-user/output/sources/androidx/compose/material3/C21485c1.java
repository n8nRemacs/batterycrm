package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: BasicTooltip.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21485c1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f36118l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q0 f36119m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36120n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f36121o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f36122p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21485c1(boolean z12, Q0 q02, androidx.compose.ui.v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f36118l = z12;
        this.f36119m = q02;
        this.f36120n = vVar;
        this.f36121o = c22096n;
        this.f36122p = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36122p | 1);
        C22096n c22096n = this.f36121o;
        Q0 q02 = this.f36119m;
        androidx.compose.ui.v vVar = this.f36120n;
        C21623i1.b(this.f36118l, q02, vVar, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

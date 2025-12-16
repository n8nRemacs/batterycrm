package androidx.compose.material3;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21569fg extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Xf f36346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.q<Xf, androidx.compose.runtime.A, Integer, kotlin.G0> f36348n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f36349o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21569fg(Xf xf2, androidx.compose.ui.v vVar, Y41.q qVar, int i12) {
        super(2);
        this.f36346l = xf2;
        this.f36347m = vVar;
        this.f36348n = qVar;
        this.f36349o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f36349o | 1);
        C21637ig.a(this.f36346l, this.f36347m, this.f36348n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

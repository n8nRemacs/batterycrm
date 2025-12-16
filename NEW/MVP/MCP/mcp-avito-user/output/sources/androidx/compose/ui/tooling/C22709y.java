package androidx.compose.ui.tooling;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Inspectable.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22709y extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f42831l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22709y(C22096n c22096n, int i12) {
        super(2);
        this.f42831l = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        C22096n c22096n = this.f42831l;
        androidx.compose.runtime.B bE2 = a12.E(-1669497937);
        int i12 = (bE2.B(null) ? 4 : 2) | iA2 | (bE2.u(c22096n) ? 32 : 16);
        if (bE2.p(i12 & 1, (i12 & 19) != 18)) {
            bE2.q();
            bE2.J();
            throw null;
        }
        bE2.f();
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C22709y(c22096n, iA2);
        }
        return G0.f406611a;
    }
}

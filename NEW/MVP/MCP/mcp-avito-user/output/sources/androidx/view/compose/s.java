package androidx.view.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReportDrawn.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i12) {
        super(2);
        this.f21209l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int i12 = this.f21209l | 1;
        B bE2 = a12.E(-1357012904);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            y.a(r.f21208l, bE2, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(i12);
        }
        return G0.f406611a;
    }
}

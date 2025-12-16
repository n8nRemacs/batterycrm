package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.C22039c2;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemContentFactory.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E {
    public static final void a(F f12, Object obj, int i12, Object obj2, androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(1439843069);
        if ((i13 & 6) == 0) {
            i14 = (bE2.B(f12) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= bE2.B(obj) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= bE2.m(i12) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= bE2.B(obj2) ? 2048 : 1024;
        }
        if (bE2.p(i14 & 1, (i14 & 1171) != 1170)) {
            ((androidx.compose.runtime.saveable.l) obj).b(obj2, androidx.compose.runtime.internal.r.c(980966366, new C(i12, f12, obj2), bE2), bE2, 48);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new D(f12, obj, i12, obj2, i13);
        }
    }
}

package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42784z0 f39811a = C42784z0.f406748b;

    static {
        m1.f39698b.getClass();
        n1.f39707b.getClass();
        androidx.compose.ui.graphics.E.f39229b.getClass();
        androidx.compose.ui.graphics.T.f39320b.getClass();
        J0.f39288b.getClass();
    }

    public static final boolean a(@Y61.l androidx.compose.ui.graphics.U u12) {
        if (u12 instanceof androidx.compose.ui.graphics.F) {
            androidx.compose.ui.graphics.F f12 = (androidx.compose.ui.graphics.F) u12;
            int i12 = f12.f39256d;
            E.a aVar = androidx.compose.ui.graphics.E.f39229b;
            aVar.getClass();
            if (androidx.compose.ui.graphics.E.a(i12, androidx.compose.ui.graphics.E.f39234g)) {
                return true;
            }
            int i13 = f12.f39256d;
            aVar.getClass();
            if (androidx.compose.ui.graphics.E.a(i13, androidx.compose.ui.graphics.E.f39232e)) {
                return true;
            }
        } else if (u12 == null) {
            return true;
        }
        return false;
    }
}

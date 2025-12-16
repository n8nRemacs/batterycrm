package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.foundation.R1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Magnifier.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21093y1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.semantics.E<Y41.a<l0.g>> f32323a = new androidx.compose.ui.semantics.E<>("MagnifierPositionInRoot", null, 2, null);

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static androidx.compose.ui.v b(v.a aVar, Y41.l lVar, Y41.l lVar2, R1 r12) {
        R1 r1A;
        androidx.compose.ui.unit.l.f42859b.getClass();
        long j12 = androidx.compose.ui.unit.l.f42860c;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        aVar2.getClass();
        float f12 = androidx.compose.ui.unit.h.f42851e;
        aVar2.getClass();
        if (!a()) {
            return aVar;
        }
        if (r12 == null) {
            R1.f26834a.getClass();
            r1A = R1.a.a();
        } else {
            r1A = r12;
        }
        MagnifierElement magnifierElement = new MagnifierElement(lVar, null, lVar2, Float.NaN, true, j12, f12, f12, true, r1A, null);
        aVar.getClass();
        return magnifierElement;
    }
}

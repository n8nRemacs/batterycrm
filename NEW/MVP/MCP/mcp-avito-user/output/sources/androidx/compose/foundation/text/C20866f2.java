package androidx.compose.foundation.text;

import androidx.compose.ui.text.C22578b;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: TextFieldDelegate.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20866f2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final String f30708a = C43066x.Z(10, "H");

    public static final long a(@Y61.k androidx.compose.ui.text.x0 x0Var, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k E.b bVar, @Y61.k String str, int i12) {
        C42784z0 c42784z0 = C42784z0.f406748b;
        androidx.compose.ui.text.style.s.f42720b.getClass();
        C22578b c22578bA = androidx.compose.ui.text.Q.a(str, x0Var, C22713c.b(0, 0, 15), dVar, bVar, c42784z0, i12, androidx.compose.ui.text.style.s.f42721c, 64);
        long jA2 = (V1.a(c22578bA.f42039a.c()) << 32) | (V1.a(c22578bA.getHeight()) & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return jA2;
    }
}

package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: CalendarModel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21738n2 {
    @InterfaceC21537e7
    @Y61.k
    public static final M3 a(@Y61.k String str) {
        String strX = C43066x.X(".", C43066x.a0(androidx.compose.foundation.H.k("y{1,4}", androidx.compose.foundation.H.k("M{1,2}", androidx.compose.foundation.H.k("d{1,2}", androidx.compose.foundation.H.k("[^dMy/\\-.]", str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false));
        int i12 = C43059p.b(new C43059p("[/\\-.]"), strX).getF410617c().a(0).f410613b.f406905b;
        return new M3(strX, strX.substring(i12, i12 + 1).charAt(0));
    }
}

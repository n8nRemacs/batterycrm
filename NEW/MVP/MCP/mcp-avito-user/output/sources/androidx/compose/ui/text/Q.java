package androidx.compose.ui.text;

import androidx.compose.ui.text.font.E;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: Paragraph.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {
    public static C22578b a(String str, x0 x0Var, long j12, androidx.compose.ui.unit.d dVar, E.b bVar, C42784z0 c42784z0, int i12, int i13, int i14) {
        return new C22578b(new androidx.compose.ui.text.platform.g(str, x0Var, (i14 & 32) != 0 ? C42784z0.f406748b : c42784z0, C42784z0.f406748b, bVar, dVar), i12, i13, j12, null);
    }

    public static final int b(float f12) {
        return (int) Math.ceil(f12);
    }
}

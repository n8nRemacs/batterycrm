package androidx.compose.ui.text.platform;

import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.G;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidMultiParagraphDraw.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final void a(G g12, M m12, J j12, float f12, f1 f1Var, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.graphics.drawscope.j jVar2, int i12) {
        ArrayList arrayList = g12.f41923h;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.text.M m13 = (androidx.compose.ui.text.M) arrayList.get(i13);
            m13.f41932a.w(m12, j12, f12, f1Var, jVar, jVar2, i12);
            m12.m(0.0f, m13.f41932a.getHeight());
        }
    }
}

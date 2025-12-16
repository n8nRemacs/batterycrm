package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.C22674v;
import androidx.compose.ui.text.W;
import androidx.compose.ui.text.Z;
import androidx.compose.ui.text.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {
    public static final boolean a(x0 x0Var) {
        W w12;
        Z z12 = x0Var.platformStyle;
        C22674v c22674vA = (z12 == null || (w12 = z12.f41972b) == null) ? null : C22674v.a(w12.f41968b);
        C22674v.f42730b.getClass();
        int i12 = C22674v.f42731c;
        boolean z13 = false;
        if (c22674vA != null && c22674vA.f42733a == i12) {
            z13 = true;
        }
        return !z13;
    }
}

package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.L;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: VisualTransformation.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/N;", "Landroidx/compose/ui/text/input/k0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N implements k0 {

    /* renamed from: c, reason: collision with root package name */
    public final char f42365c;

    public N() {
        this((char) 0, 1, null);
    }

    @Override // androidx.compose.ui.text.input.k0
    @Y61.k
    public final j0 c(@Y61.k C22602e c22602e) {
        C22602e c22602e2 = new C22602e(C43066x.Z(c22602e.f42127c.length(), String.valueOf(this.f42365c)), null, 2, null);
        L.f42358a.getClass();
        return new j0(c22602e2, L.a.f42360b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N) {
            return this.f42365c == ((N) obj).f42365c;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.f42365c);
    }

    public N(char c12, int i12, C42822w c42822w) {
        this.f42365c = (i12 & 1) != 0 ? (char) 8226 : c12;
    }
}

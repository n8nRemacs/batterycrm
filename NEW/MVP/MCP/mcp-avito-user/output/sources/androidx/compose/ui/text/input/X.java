package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;

/* compiled from: TextFieldValue.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X {
    @Y61.k
    public static final C22602e a(@Y61.k W w12) {
        C22602e c22602e = w12.f42383a;
        c22602e.getClass();
        long j12 = w12.f42384b;
        return c22602e.subSequence(v0.g(j12), v0.f(j12));
    }

    @Y61.k
    public static final C22602e b(@Y61.k W w12, int i12) {
        C22602e c22602e = w12.f42383a;
        long j12 = w12.f42384b;
        return c22602e.subSequence(v0.f(j12), Math.min(v0.f(j12) + i12, w12.f42383a.f42127c.length()));
    }

    @Y61.k
    public static final C22602e c(@Y61.k W w12, int i12) {
        C22602e c22602e = w12.f42383a;
        long j12 = w12.f42384b;
        return c22602e.subSequence(Math.max(0, v0.g(j12) - i12), v0.g(j12));
    }
}

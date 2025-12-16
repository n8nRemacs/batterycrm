package androidx.compose.ui.text.input;

import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22650p {
    public static final long a(long j12, long j13) {
        int iE2;
        int iG2 = v0.g(j12);
        int iF2 = v0.f(j12);
        if ((v0.g(j13) < v0.f(j12)) && (v0.g(j12) < v0.f(j13))) {
            if (v0.b(j13, j12)) {
                iG2 = v0.g(j13);
                iF2 = iG2;
            } else {
                if (v0.b(j12, j13)) {
                    iE2 = v0.e(j13);
                } else {
                    int iG3 = v0.g(j13);
                    if (iG2 >= v0.f(j13) || iG3 > iG2) {
                        iF2 = v0.g(j13);
                    } else {
                        iG2 = v0.g(j13);
                        iE2 = v0.e(j13);
                    }
                }
                iF2 -= iE2;
            }
        } else if (iF2 > v0.g(j13)) {
            iG2 -= v0.e(j13);
            iE2 = v0.e(j13);
            iF2 -= iE2;
        }
        return w0.a(iG2, iF2);
    }
}

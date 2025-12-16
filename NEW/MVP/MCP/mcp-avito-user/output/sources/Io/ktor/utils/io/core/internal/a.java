package io.ktor.utils.io.core.internal;

import Y61.k;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CharArraySequence.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/core/internal/a;", "", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a implements CharSequence {
    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        if (i12 < 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException(G.e(i12, "String index out of bounds: ", " > 0"));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return 0;
    }

    @Override // java.lang.CharSequence
    @k
    public final CharSequence subSequence(int i12, int i13) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "startIndex shouldn't be negative: ").toString());
        }
        if (i12 > 0) {
            throw new IllegalArgumentException(G.e(i12, "startIndex is too large: ", " > 0").toString());
        }
        if (i12 + i13 > 0) {
            throw new IllegalArgumentException(G.e(i13, "endIndex is too large: ", " > 0").toString());
        }
        if (i13 >= i12) {
            throw null;
        }
        throw new IllegalArgumentException(H.j(i12, i13, "endIndex should be greater or equal to startIndex: ", " > ").toString());
    }
}

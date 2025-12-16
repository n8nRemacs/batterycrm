package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: HeightInLinesModifier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "typeface", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20849b1 {
    public static final void a(int i12, int i13) {
        if (!(i12 > 0 && i13 > 0)) {
            androidx.compose.foundation.internal.e.a("both minLines " + i12 + " and maxLines " + i13 + " must be greater than zero");
        }
        if (i12 <= i13) {
            return;
        }
        androidx.compose.foundation.internal.e.a("minLines " + i12 + " must be less than or equal to maxLines " + i13);
    }
}

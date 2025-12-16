package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: HitTestResult.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22446y {
    public static final long a(float f12, boolean z12, boolean z13) {
        return (((z12 ? 1L : 0L) | (z13 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }
}

package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22376o {
    public static final float a(long j12, long j13) {
        return Math.min(Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }
}

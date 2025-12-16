package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: DragAndDrop.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {
    public static final long a(@Y61.k b bVar) {
        DragEvent dragEvent = bVar.f38999a;
        float x12 = dragEvent.getX();
        float y12 = dragEvent.getY();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(x12) << 32) | (Float.floatToRawIntBits(y12) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }
}

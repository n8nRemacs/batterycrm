package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PointerInteropUtils.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S {
    public static final void a(C22340s c22340s, long j12, Y41.l<? super MotionEvent, G0> lVar, boolean z12) {
        MotionEvent motionEventA = c22340s.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z12) {
            motionEventA.setAction(3);
        }
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i12), -Float.intBitsToFloat(i13));
        lVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13));
        motionEventA.setAction(action);
    }
}

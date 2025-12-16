package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.C22340s;
import kotlin.Metadata;

/* compiled from: TapGestureDetector.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20477l2 {
    public static final boolean a(@Y61.k C22340s c22340s) {
        MotionEvent motionEventA;
        return ((Build.VERSION.SDK_INT < 29 || (motionEventA = c22340s.a()) == null) ? 0 : motionEventA.getClassification()) == 2;
    }
}

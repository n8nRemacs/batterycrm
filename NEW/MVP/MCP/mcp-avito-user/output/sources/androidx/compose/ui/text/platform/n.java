package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidTextPaint.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {
    public static final void a(@Y61.k TextPaint textPaint, float f12) {
        if (Float.isNaN(f12)) {
            return;
        }
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f12 * 255));
    }
}

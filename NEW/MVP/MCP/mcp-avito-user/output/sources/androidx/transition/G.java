package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator.java */
/* loaded from: classes10.dex */
class G implements TypeEvaluator<Rect> {

    /* renamed from: a, reason: collision with root package name */
    public Rect f54647a;

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f12, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i12 = rect3.left + ((int) ((rect4.left - r0) * f12));
        int i13 = rect3.top + ((int) ((rect4.top - r1) * f12));
        int i14 = rect3.right + ((int) ((rect4.right - r2) * f12));
        int i15 = rect3.bottom + ((int) ((rect4.bottom - r6) * f12));
        Rect rect5 = this.f54647a;
        if (rect5 == null) {
            return new Rect(i12, i13, i14, i15);
        }
        rect5.set(i12, i13, i14, i15);
        return rect5;
    }
}

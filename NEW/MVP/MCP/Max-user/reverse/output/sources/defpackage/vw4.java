package defpackage;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.b;

/* loaded from: classes2.dex */
public abstract class vw4 {
    public static final Object a = ipi.b(2, new ps3(18));
    public static final Object b = ipi.b(2, new ps3(19));
    public static final Object c = ipi.b(2, new ps3(20));

    public static final int a(b bVar) {
        TypedValue typedValue = new TypedValue();
        if (bVar.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, bVar.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static final int b(int i) {
        return kti.d(i * d().getDisplayMetrics().density);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public static final float c() {
        return ((Number) c.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public static final Resources d() {
        return (Resources) a.getValue();
    }

    public static final float e(float f) {
        return TypedValue.applyDimension(2, f, d().getDisplayMetrics());
    }
}

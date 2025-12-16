package lY0;

import android.graphics.drawable.Drawable;
import android.util.Property;
import j.N;
import j.P;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty.java */
/* loaded from: classes6.dex */
public class f extends Property<Drawable, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f413886a = new f();

    public f() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    @P
    public final Integer get(@N Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(@N Drawable drawable, @N Integer num) {
        drawable.setAlpha(num.intValue());
    }
}

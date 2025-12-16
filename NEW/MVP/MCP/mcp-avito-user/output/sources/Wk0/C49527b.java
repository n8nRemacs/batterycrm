package wK0;

import Y61.l;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import wK0.C49529d;

/* compiled from: RoundStateDrawableV21.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwK0/b;", "LwK0/a;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wK0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49527b extends AbstractC49526a {
    public /* synthetic */ C49527b(ColorStateList colorStateList, ColorStateList colorStateList2, int i12, ColorStateList colorStateList3, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this(colorStateList, colorStateList2, i12, colorStateList3, i13, (i16 & 32) != 0 ? -1 : i14, (i16 & 64) != 0 ? -1 : i15);
    }

    public C49527b(@l ColorStateList colorStateList, @l ColorStateList colorStateList2, int i12, @l ColorStateList colorStateList3, int i13, int i14, int i15) {
        Drawable rippleDrawable;
        if (colorStateList2 != null) {
            C49529d c49529d = new C49529d();
            C49529d.a aVar = c49529d.f441378a;
            aVar.f441383b = colorStateList;
            c49529d.a();
            aVar.f441385d = i13;
            aVar.f441386e = colorStateList3;
            c49529d.b();
            float f12 = i12;
            c49529d.setCornerRadius(f12);
            aVar.f441384c = new int[]{R.attr.state_pressed};
            c49529d.a();
            c49529d.setSize(i14, i15);
            float[] fArr = new float[8];
            for (int i16 = 0; i16 < 8; i16++) {
                fArr[i16] = f12;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.setIntrinsicWidth(i14);
            shapeDrawable.setIntrinsicHeight(i15);
            rippleDrawable = new RippleDrawable(colorStateList2, c49529d, shapeDrawable);
        } else {
            C49529d c49529d2 = new C49529d();
            C49529d.a aVar2 = c49529d2.f441378a;
            aVar2.f441383b = colorStateList;
            c49529d2.a();
            aVar2.f441385d = i13;
            aVar2.f441386e = colorStateList3;
            c49529d2.b();
            c49529d2.setCornerRadius(i12);
            c49529d2.setSize(i14, i15);
            rippleDrawable = c49529d2;
        }
        addState(new int[0], rippleDrawable);
    }
}

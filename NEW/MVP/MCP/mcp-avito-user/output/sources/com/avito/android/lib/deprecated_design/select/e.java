package com.avito.android.lib.deprecated_design.select;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: SelectDrawableHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/e;", "Lcom/avito/android/lib/deprecated_design/select/b;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RippleDrawable f178102a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Paint f178103b;

    public e(@k Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(R.dimen.design_button_corner_radius);
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = dimension;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.f178103b = shapeDrawable.getPaint();
        this.f178102a = new RippleDrawable(ColorStateList.valueOf(0), shapeDrawable, null);
    }

    @Override // com.avito.android.lib.deprecated_design.select.b
    @k
    public final Drawable a() {
        return this.f178102a;
    }

    @Override // com.avito.android.lib.deprecated_design.select.b
    public final void b(@k SelectState selectState, @k Context context) {
        this.f178103b.setColor(C35835l0.d(selectState.f178096b, context));
        this.f178102a.setColor(ColorStateList.valueOf(C35835l0.d(selectState.f178097c, context)));
    }
}

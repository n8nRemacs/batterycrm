package com.avito.android.lib.deprecated_design.select;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: InputDrawableHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/d;", "Lcom/avito/android/lib/deprecated_design/select/b;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ShapeDrawable f178101a;

    public d(@k Resources resources) throws Resources.NotFoundException {
        float dimension = resources.getDimension(R.dimen.design_button_corner_radius);
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = dimension;
        }
        this.f178101a = new ShapeDrawable(new RoundRectShape(fArr, null, null));
    }

    @Override // com.avito.android.lib.deprecated_design.select.b
    @k
    public final Drawable a() {
        return this.f178101a;
    }

    @Override // com.avito.android.lib.deprecated_design.select.b
    public final void b(@k SelectState selectState, @k Context context) {
        ShapeDrawable shapeDrawable = this.f178101a;
        shapeDrawable.getPaint().setColor(C35835l0.d(selectState.f178096b, context));
        shapeDrawable.invalidateSelf();
    }
}

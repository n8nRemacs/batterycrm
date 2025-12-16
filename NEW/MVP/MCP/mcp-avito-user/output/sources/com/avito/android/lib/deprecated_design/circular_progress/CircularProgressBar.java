package com.avito.android.lib.deprecated_design.circular_progress;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.circular_progress.a;
import com.avito.android.util.C35835l0;
import fw.C40487a;
import hw.InterfaceC41179d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.u0;

/* compiled from: CircularProgressBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/CircularProgressBar;", "Landroid/widget/ProgressBar;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class CircularProgressBar extends ProgressBar {
    @X41.j
    public CircularProgressBar(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CircularProgressBar(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.cpbStyle : i12;
        super(context, attributeSet, i12);
        if (isInEditMode()) {
            setIndeterminateDrawable(new a.C5243a(context, true).a());
            return;
        }
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40487a.l.f396187b, i12, R.style.Widget_Avito_CircularProgressBar_Light);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(1, C35835l0.d(R.attr.white, context));
            float dimension = typedArrayObtainStyledAttributes.getDimension(6, resources.getDimension(R.dimen.cpb_default_stroke_width));
            float f12 = typedArrayObtainStyledAttributes.getFloat(7, Float.parseFloat(resources.getString(R.string.cpb_default_sweep_speed)));
            float f13 = typedArrayObtainStyledAttributes.getFloat(5, Float.parseFloat(resources.getString(R.string.cpb_default_rotation_speed)));
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
            int integer = typedArrayObtainStyledAttributes.getInteger(4, resources.getInteger(R.integer.cpb_default_min_sweep_angle));
            int integer2 = typedArrayObtainStyledAttributes.getInteger(3, resources.getInteger(R.integer.cpb_default_max_sweep_angle));
            int[] intArray = resourceId != 0 ? resources.getIntArray(resourceId) : null;
            a.C5243a c5243a = new a.C5243a(context, false, 2, null);
            if (f12 <= 0.0f) {
                throw new IllegalArgumentException("Speed must be >= 0");
            }
            c5243a.f177892f = f12;
            if (f13 <= 0.0f) {
                throw new IllegalArgumentException("Speed must be >= 0");
            }
            c5243a.f177893g = f13;
            if (dimension < 0.0f) {
                u0 u0Var = u0.f406856a;
                throw new IllegalArgumentException(String.format("%s %f must be positive", Arrays.copyOf(new Object[]{"StrokeWidth", Float.valueOf(dimension)}, 2)));
            }
            c5243a.f177891e = dimension;
            r.a(integer);
            c5243a.f177894h = integer;
            r.a(integer2);
            c5243a.f177895i = integer2;
            if (intArray == null || intArray.length == 0) {
                c5243a.f177887a = new int[]{color};
            } else {
                if (intArray.length == 0) {
                    throw new IllegalArgumentException("You must provide at least 1 color");
                }
                c5243a.f177887a = intArray;
            }
            setIndeterminateDrawable(c5243a.a());
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}

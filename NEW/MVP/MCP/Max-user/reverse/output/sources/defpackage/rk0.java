package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* loaded from: classes.dex */
public abstract class rk0 {
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public rk0(int i, int i2, Context context) throws Resources.NotFoundException {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(dwc.mtrl_progress_track_thickness);
        int[] iArr = z5d.BaseProgressIndicator;
        d7g.a(context, null, i, i2);
        d7g.b(context, null, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i, i2);
        this.a = gti.d(context, typedArrayObtainStyledAttributes, z5d.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.b = Math.min(gti.d(context, typedArrayObtainStyledAttributes, z5d.BaseProgressIndicator_trackCornerRadius, 0), this.a / 2);
        this.e = typedArrayObtainStyledAttributes.getInt(z5d.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(z5d.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.BaseProgressIndicator_indicatorTrackGapSize, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(z5d.BaseProgressIndicator_indicatorColor)) {
            this.c = new int[]{eti.d(dvc.colorPrimary, -1, context)};
        } else if (typedArrayObtainStyledAttributes.peekValue(z5d.BaseProgressIndicator_indicatorColor).type != 1) {
            this.c = new int[]{typedArrayObtainStyledAttributes.getColor(z5d.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(z5d.BaseProgressIndicator_indicatorColor, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(z5d.BaseProgressIndicator_trackColor)) {
            this.d = typedArrayObtainStyledAttributes.getColor(z5d.BaseProgressIndicator_trackColor, -1);
        } else {
            this.d = this.c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.d = eti.a(this.d, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.g < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}

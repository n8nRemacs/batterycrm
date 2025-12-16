package AY0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import j.N;
import j.P;
import j.g0;

/* compiled from: MaterialTextView.java */
/* loaded from: classes6.dex */
public class a extends AppCompatTextView {
    public a(@N Context context) {
        this(context, null);
    }

    private void applyLineHeightFromViewAppearance(@N Resources.Theme theme, int i12) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i12, R.styleable.MaterialTextAppearance);
        int firstAvailableDimension = readFirstAvailableDimension(getContext(), typedArrayObtainStyledAttributes, R.styleable.MaterialTextAppearance_android_lineHeight, R.styleable.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (firstAvailableDimension >= 0) {
            setLineHeight(firstAvailableDimension);
        }
    }

    private static boolean canApplyTextAppearanceLineHeight(Context context) {
        return b.b(context, R.attr.textAppearanceLineHeightEnabled, true);
    }

    private static int findViewAppearanceResourceId(@N Resources.Theme theme, @P AttributeSet attributeSet, int i12, int i13) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i12, i13);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void initialize(@P AttributeSet attributeSet, int i12, int i13) throws Resources.NotFoundException {
        int iFindViewAppearanceResourceId;
        Context context = getContext();
        if (canApplyTextAppearanceLineHeight(context)) {
            Resources.Theme theme = context.getTheme();
            if (viewAttrsHasLineHeight(context, theme, attributeSet, i12, i13) || (iFindViewAppearanceResourceId = findViewAppearanceResourceId(theme, attributeSet, i12, i13)) == -1) {
                return;
            }
            applyLineHeightFromViewAppearance(theme, iFindViewAppearanceResourceId);
        }
    }

    private static int readFirstAvailableDimension(@N Context context, @N TypedArray typedArray, @N @g0 int... iArr) {
        int iC2 = -1;
        for (int i12 = 0; i12 < iArr.length && iC2 < 0; i12++) {
            iC2 = c.c(context, typedArray, iArr[i12], -1);
        }
        return iC2;
    }

    private static boolean viewAttrsHasLineHeight(@N Context context, @N Resources.Theme theme, @P AttributeSet attributeSet, int i12, int i13) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.MaterialTextView, i12, i13);
        int firstAvailableDimension = readFirstAvailableDimension(context, typedArrayObtainStyledAttributes, R.styleable.MaterialTextView_android_lineHeight, R.styleable.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return firstAvailableDimension != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@N Context context, int i12) throws Resources.NotFoundException {
        super.setTextAppearance(context, i12);
        if (canApplyTextAppearanceLineHeight(context)) {
            applyLineHeightFromViewAppearance(context.getTheme(), i12);
        }
    }

    public a(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public a(@N Context context, @P AttributeSet attributeSet, int i12) throws Resources.NotFoundException {
        super(BY0.a.a(context, attributeSet, i12, 0), attributeSet, i12);
        initialize(attributeSet, i12, 0);
    }

    @Deprecated
    public a(@N Context context, @P AttributeSet attributeSet, int i12, int i13) throws Resources.NotFoundException {
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        initialize(attributeSet, i12, i13);
    }
}

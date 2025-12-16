package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class dr8 extends AppCompatTextView {
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (wsi.f(dvc.textAppearanceLineHeightEnabled, context, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, z5d.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {z5d.MaterialTextAppearance_android_lineHeight, z5d.MaterialTextAppearance_lineHeight};
            int iD = -1;
            for (int i2 = 0; i2 < 2 && iD < 0; i2++) {
                iD = gti.d(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iD >= 0) {
                setLineHeight(iD);
            }
        }
    }
}

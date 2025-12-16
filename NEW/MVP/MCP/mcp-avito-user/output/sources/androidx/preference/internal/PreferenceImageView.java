package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.preference.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;
import j.P;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo
/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public int f53459b;

    /* renamed from: c, reason: collision with root package name */
    public int f53460c;

    public PreferenceImageView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f53459b = Integer.MAX_VALUE;
        this.f53460c = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k.f53490k, 0, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f53460c;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f53459b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i12);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i12 = View.MeasureSpec.makeMeasureSpec(maxWidth, BeduinInputModel.MIN_TEXT_VERSION);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i13);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i13);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i13 = View.MeasureSpec.makeMeasureSpec(maxHeight, BeduinInputModel.MIN_TEXT_VERSION);
            }
        }
        super.onMeasure(i12, i13);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i12) {
        this.f53460c = i12;
        super.setMaxHeight(i12);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i12) {
        this.f53459b = i12;
        super.setMaxWidth(i12);
    }
}

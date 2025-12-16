package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.shape.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;

/* compiled from: CBRBottomSheetView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRBottomSheetView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/google/android/material/shape/q;", "shapeAppearanceModel", "Lcom/google/android/material/shape/q;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRBottomSheetView extends FrameLayout {

    @k
    private final q shapeAppearanceModel;

    @j
    public CBRBottomSheetView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ CBRBottomSheetView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_BottomSheetViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRBottomSheetView : i13);
    }

    @j
    public CBRBottomSheetView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        Integer color;
        super(context, attributeSet, i12);
        q qVarA = q.c(context, attributeSet, i12, i13).a();
        this.shapeAppearanceModel = qVarA;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRBottomSheetView, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRBottomSheetView_android_background)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRBottomSheetView_android_background));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRBottomSheetView_backgroundColor)) {
            q.b bVarF = qVarA.f();
            bVarF.e(0.0f);
            bVarF.h(0.0f);
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(bVarF.a());
            kVar.n(typedArrayObtainStyledAttributes.getColorStateList(R.styleable.CBRBottomSheetView_backgroundColor));
            setBackground(kVar);
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        Float themeMetricDimension = themeHelper.getThemeMetricDimension(CBRMetricElement.BOTTOM_SHEET_CORNER_RADIUS);
        float fFloatValue = themeMetricDimension != null ? themeMetricDimension.floatValue() : 0.0f;
        CBRColorElement cBRColorElement = CBRColorElement.BOTTOM_SHEET_BACKGROUND;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
            return;
        }
        int iIntValue = color.intValue();
        q.b bVarF2 = qVarA.f();
        bVarF2.k(fFloatValue);
        bVarF2.n(fFloatValue);
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(bVarF2.a());
        kVar2.n(ColorStateList.valueOf(iIntValue));
        setBackground(kVar2);
    }
}

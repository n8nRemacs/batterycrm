package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;
import ru.cyberity.cbr.core.theme.b;

/* compiled from: CBRSecondaryButton.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRSecondaryButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/G0;", "onMeasure", "(II)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRSecondaryButton extends MaterialButton {
    @j
    public CBRSecondaryButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        Float metricDimension = customTheme != null ? themeHelper.getMetricDimension(customTheme, CBRMetricElement.BUTTON_HEIGHT) : null;
        if (metricDimension != null) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) metricDimension.floatValue(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ CBRSecondaryButton(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.materialButtonOutlinedStyle : i12);
    }

    @j
    public CBRSecondaryButton(@k Context context, @l AttributeSet attributeSet, int i12) {
        b.g gVar;
        super(context, attributeSet, i12);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            Map<String, b.g> mapD = customTheme.d();
            if (mapD != null && (gVar = mapD.get(CBRTypographyElement.SUBTITLE1.getValue())) != null) {
                Typeface typeface = gVar.getTypeface();
                if (typeface != null) {
                    setTypeface(typeface);
                }
                setTextSize(gVar.getSize());
            }
            int[][] iArr = {new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[0]};
            Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT);
            Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT_DISABLED);
            Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT_HIGHLIGHTED);
            if (themeColor != null || themeColor2 != null || themeColor3 != null) {
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{themeColor2 != null ? themeColor2.intValue() : 0, themeColor3 != null ? themeColor3.intValue() : 0, themeColor != null ? themeColor.intValue() : 0});
                setTextColor(colorStateList);
                setStrokeColor(colorStateList);
            }
            Integer themeColor4 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_BACKGROUND);
            Integer themeColor5 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_BACKGROUND_DISABLED);
            Integer themeColor6 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_BACKGROUND_HIGHLIGHTED);
            if (themeColor4 != null || themeColor5 != null || themeColor6 != null) {
                setElevation(0.0f);
                setStateListAnimator(null);
                setBackgroundTintList(new ColorStateList(iArr, new int[]{themeColor5 != null ? themeColor5.intValue() : 0, themeColor6 != null ? themeColor6.intValue() : 0, themeColor4 != null ? themeColor4.intValue() : 0}));
            }
            Float metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.BUTTON_CORNER_RADIUS);
            if (metricDimension != null) {
                setCornerRadius((int) metricDimension.floatValue());
            }
            Float metricDimension2 = themeHelper.getMetricDimension(customTheme, CBRMetricElement.BUTTON_BORDER_WIDTH);
            if (metricDimension2 != null) {
                setStrokeWidth((int) metricDimension2.floatValue());
            }
        }
    }
}

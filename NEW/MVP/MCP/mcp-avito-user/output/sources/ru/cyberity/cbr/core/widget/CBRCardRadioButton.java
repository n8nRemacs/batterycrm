package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRThemeMetric;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;

/* compiled from: CBRCardRadioButton.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRCardRadioButton;", "Landroid/widget/RadioButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "cardStyle", "Lkotlin/G0;", "setBackground", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setStartDrawable", "(Landroid/graphics/drawable/Drawable;)V", "radioDrawable$delegate", "Lkotlin/C;", "getRadioDrawable", "()Landroid/graphics/drawable/Drawable;", "radioDrawable", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes9.dex */
public final class CBRCardRadioButton extends RadioButton {

    @k
    private final GradientDrawable backgroundDrawable;

    /* renamed from: radioDrawable$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C radioDrawable;

    public /* synthetic */ CBRCardRadioButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_cardRadioButtonViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRCardRadioButton : i13);
    }

    private final Drawable getRadioDrawable() {
        return (Drawable) this.radioDrawable.getValue();
    }

    private final void setBackground(String cardStyle) {
        Float metricDimension;
        Float metricDimension2;
        Float metricDimension3;
        if (!L.f(cardStyle, CBRThemeMetric.CardStyle.BORDERED.getValue())) {
            if (!L.f(cardStyle, CBRThemeMetric.CardStyle.PLAIN.getValue())) {
                setBackground((Drawable) null);
                return;
            }
            GradientDrawable gradientDrawable = this.backgroundDrawable;
            ThemeHelper themeHelper = ThemeHelper.INSTANCE;
            Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.CARD_PLAIN_BACKGROUND);
            gradientDrawable.setColor(themeColor != null ? themeColor.intValue() : 0);
            ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
            gradientDrawable.setCornerRadius((customTheme == null || (metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.CARD_CORNER_RADIUS)) == null) ? getResources().getDimension(R.dimen.cbr_agreement_card_corner_radius) : metricDimension.floatValue());
            setBackground(this.backgroundDrawable);
            return;
        }
        GradientDrawable gradientDrawable2 = this.backgroundDrawable;
        ThemeHelper themeHelper2 = ThemeHelper.INSTANCE;
        Integer themeColor2 = themeHelper2.getThemeColor(this, CBRColorElement.CARD_BORDERED_BACKGROUND);
        gradientDrawable2.setColor(themeColor2 != null ? themeColor2.intValue() : 0);
        ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper2.getCustomTheme();
        int dimension = (int) ((customTheme2 == null || (metricDimension3 = themeHelper2.getMetricDimension(customTheme2, CBRMetricElement.CARD_BORDER_WIDTH)) == null) ? getResources().getDimension(R.dimen.cbr_agreement_card_stroke_width) : metricDimension3.floatValue());
        Integer themeColor3 = themeHelper2.getThemeColor(this, CBRColorElement.CONTENT_WEAK);
        gradientDrawable2.setStroke(dimension, themeColor3 != null ? themeColor3.intValue() : getResources().getColor(R.color.cbr_color_neutral_20));
        ru.cyberity.cbr.core.theme.d customTheme3 = themeHelper2.getCustomTheme();
        gradientDrawable2.setCornerRadius((customTheme3 == null || (metricDimension2 = themeHelper2.getMetricDimension(customTheme3, CBRMetricElement.CARD_CORNER_RADIUS)) == null) ? getResources().getDimension(R.dimen.cbr_agreement_card_corner_radius) : metricDimension2.floatValue());
        setBackground(this.backgroundDrawable);
    }

    public final void setStartDrawable(@l Drawable drawable) {
        setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, getRadioDrawable(), (Drawable) null);
    }

    @j
    public CBRCardRadioButton(@k Context context, @l AttributeSet attributeSet, int i12, int i13) throws Resources.NotFoundException {
        Integer color;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12, i13);
        this.radioDrawable = C42727D.c(new CBRCardRadioButton$radioDrawable$2(this, context));
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        setButtonDrawable((Drawable) null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setStartDrawable(null);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.cbr_margin_small));
        setBackground(gradientDrawable);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRCardRadioButton, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonBackgroundColor)) {
            gradientDrawable.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonBackgroundColor, androidx.core.content.d.getColor(context, android.R.color.transparent)));
        }
        Integer numValueOf = typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonStrokeColor) ? Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonStrokeColor, androidx.core.content.d.getColor(context, android.R.color.transparent))) : null;
        Integer numValueOf2 = typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonStrokeWidth) ? Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonStrokeWidth, 0)) : null;
        if (numValueOf != null && numValueOf2 != null) {
            gradientDrawable.setStroke(numValueOf2.intValue(), numValueOf.intValue());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonCornerRadius)) {
            gradientDrawable.setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRCardRadioButton_cbr_cardRadioButtonCornerRadius, 0));
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            themeHelper.applyTheme(this, CBRTypographyElement.SUBTITLE2, CBRColorElement.CONTENT_STRONG);
            String metricStyle = themeHelper.getMetricStyle(customTheme, CBRMetricElement.AGREEMENT_CARD_STYLE);
            if (metricStyle != null) {
                setBackground(metricStyle);
            }
            CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WEAK;
            ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
            if (customTheme2 == null || (color = themeHelper.getColor(customTheme2, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
                return;
            }
            int iIntValue = color.intValue();
            int[][] iArr = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
            Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.FIELD_TINT);
            int[] iArr2 = {iIntValue, themeColor != null ? themeColor.intValue() : iIntValue};
            Drawable radioDrawable = getRadioDrawable();
            if (radioDrawable != null) {
                radioDrawable.setTintList(new ColorStateList(iArr, iArr2));
            }
        }
    }
}

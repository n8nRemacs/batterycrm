package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.shape.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRThemeMetric;

/* compiled from: CBRStepView.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0016\u00103\u001a\u0004\u0018\u00010&8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(R(\u0010:\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010=\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00107\"\u0004\b<\u00109R(\u0010C\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010F\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR(\u0010I\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010@\"\u0004\bH\u0010B¨\u0006J"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRStepView;", "Lcom/google/android/material/card/a;", "Lru/cyberity/cbr/core/widget/CBRStepStateProvider;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/cyberity/cbr/core/theme/CBRMetricElement;", "cardStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/cyberity/cbr/core/theme/CBRMetricElement;)V", "Lkotlin/G0;", "applyTheme", "(Lru/cyberity/cbr/core/theme/CBRMetricElement;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getCBRStepState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "setCBRStepState", "(Lru/cyberity/cbr/core/widget/CBRStepState;)V", "Landroid/content/res/ColorStateList;", "tintColor", "setIconTintColor", "(Landroid/content/res/ColorStateList;)V", "getIconTintColor", "()Landroid/content/res/ColorStateList;", "colorStateList", "setTitleTextColor", "setSubtitleTextColor", "stepState", "Lru/cyberity/cbr/core/widget/CBRStepState;", "Landroid/widget/ImageView;", "getIconStartView", "()Landroid/widget/ImageView;", "iconStartView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "getTitlePlaceholderView", "titlePlaceholderView", "getSubtitleView", "subtitleView", "getIconEndView", "iconEndView", "Landroid/graphics/drawable/Drawable;", "value", "getIconStart", "()Landroid/graphics/drawable/Drawable;", "setIconStart", "(Landroid/graphics/drawable/Drawable;)V", "iconStart", "getIconEnd", "setIconEnd", "iconEnd", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getPlaceholder", "setPlaceholder", ChannelContext.Item.PLACEHOLDER, "getSubtitle", "setSubtitle", "subtitle", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRStepView extends com.google.android.material.card.a implements CBRStepStateProvider {

    @l
    private CBRStepState stepState;

    @j
    public CBRStepView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
    }

    private final void applyTheme(CBRMetricElement cardStyle) {
        ThemeHelper themeHelper;
        ru.cyberity.cbr.core.theme.d customTheme;
        if (cardStyle == null || (customTheme = (themeHelper = ThemeHelper.INSTANCE).getCustomTheme()) == null) {
            return;
        }
        int[][] defaultStepStateList = themeHelper.getDefaultStepStateList();
        ColorStateList iconTintColor = getIconTintColor();
        if (iconTintColor == null) {
            iconTintColor = ColorStateList.valueOf(-65281);
        }
        Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_WEAK);
        ColorStateList stepTintColorList = themeHelper.getStepTintColorList(themeHelper.isDarkTheme(this), Integer.valueOf(themeColor != null ? themeColor.intValue() : iconTintColor.getColorForState(new int[]{R.attr.cbr_stateInit}, -65281)), iconTintColor);
        if (stepTintColorList != null) {
            setIconTintColor(stepTintColorList);
        }
        ColorStateList cardBackgroundColor = getCardBackgroundColor();
        CBRColorElement cBRColorElement = CBRColorElement.BACKGROUND_NEUTRAL;
        Integer themeColor2 = themeHelper.getThemeColor(this, cBRColorElement);
        int iIntValue = themeColor2 != null ? themeColor2.intValue() : cardBackgroundColor.getColorForState(new int[]{R.attr.cbr_stateInit}, -65281);
        CBRColorElement cBRColorElement2 = CBRColorElement.BACKGROUND_WARNING;
        Integer themeColor3 = themeHelper.getThemeColor(this, cBRColorElement2);
        int iIntValue2 = themeColor3 != null ? themeColor3.intValue() : cardBackgroundColor.getColorForState(new int[]{R.attr.cbr_statePending}, -65281);
        Integer themeColor4 = themeHelper.getThemeColor(this, CBRColorElement.BACKGROUND_SUCCESS);
        int iIntValue3 = themeColor4 != null ? themeColor4.intValue() : cardBackgroundColor.getColorForState(new int[]{R.attr.cbr_stateApproved}, -65281);
        Integer themeColor5 = themeHelper.getThemeColor(this, CBRColorElement.BACKGROUND_CRITICAL);
        int iIntValue4 = themeColor5 != null ? themeColor5.intValue() : cardBackgroundColor.getColorForState(new int[]{R.attr.cbr_stateRejected}, -65281);
        Integer themeColor6 = themeHelper.getThemeColor(this, cBRColorElement2);
        int iIntValue5 = themeColor6 != null ? themeColor6.intValue() : cardBackgroundColor.getColorForState(new int[]{R.attr.cbr_stateProcessing}, -65281);
        Integer themeColor7 = themeHelper.getThemeColor(this, cBRColorElement);
        int[] iArr = {iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, themeColor7 != null ? themeColor7.intValue() : cardBackgroundColor.getDefaultColor()};
        Float metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.CARD_CORNER_RADIUS);
        if (metricDimension != null) {
            setRadius(metricDimension.floatValue());
        }
        Integer themeColor8 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_STRONG);
        if (themeColor8 != null) {
            int iIntValue6 = themeColor8.intValue();
            TextView titleView = getTitleView();
            if (titleView != null) {
                titleView.setTextColor(iIntValue6);
            }
        }
        String metricStyle = themeHelper.getMetricStyle(customTheme, cardStyle);
        G0 g02 = null;
        if (L.f(metricStyle, CBRThemeMetric.CardStyle.BORDERED.getValue())) {
            Float metricDimension2 = themeHelper.getMetricDimension(customTheme, CBRMetricElement.CARD_BORDER_WIDTH);
            setStrokeWidth(metricDimension2 != null ? (int) metricDimension2.floatValue() : s.a(1));
            setStrokeColor(stepTintColorList);
            Integer themeColor9 = themeHelper.getThemeColor(this, CBRColorElement.CARD_BORDERED_BACKGROUND);
            if (themeColor9 != null) {
                int iIntValue7 = themeColor9.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(getRadius());
                gradientDrawable.setColor(iIntValue7);
                setBackground(gradientDrawable);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                setBackgroundColor(0);
            }
            TextView subtitleView = getSubtitleView();
            if (subtitleView != null) {
                ThemeHelper.applyStepTintColor$default(themeHelper, subtitleView, null, iconTintColor, 1, null);
                return;
            }
            return;
        }
        if (!L.f(metricStyle, CBRThemeMetric.CardStyle.PLAIN.getValue())) {
            setStrokeWidth(0);
            setCardBackgroundColor(new ColorStateList(defaultStepStateList, iArr));
            Integer themeColor10 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_NEUTRAL);
            if (themeColor10 != null) {
                int iIntValue8 = themeColor10.intValue();
                TextView subtitleView2 = getSubtitleView();
                if (subtitleView2 != null) {
                    subtitleView2.setTextColor(iIntValue8);
                    return;
                }
                return;
            }
            return;
        }
        setStrokeWidth(0);
        Integer themeColor11 = themeHelper.getThemeColor(this, CBRColorElement.CARD_PLAIN_BACKGROUND);
        if (themeColor11 != null) {
            int iIntValue9 = themeColor11.intValue();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(getRadius());
            gradientDrawable2.setColor(iIntValue9);
            setBackground(gradientDrawable2);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            setBackgroundColor(0);
        }
        Integer themeColor12 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_NEUTRAL);
        if (themeColor12 != null) {
            int iIntValue10 = themeColor12.intValue();
            TextView subtitleView3 = getSubtitleView();
            if (subtitleView3 != null) {
                subtitleView3.setTextColor(iIntValue10);
            }
        }
    }

    private final ImageView getIconStartView() {
        return (ImageView) findViewById(R.id.cbr_item_start_icon);
    }

    private final TextView getSubtitleView() {
        return (TextView) findViewById(R.id.cbr_item_subtitle);
    }

    private final TextView getTitlePlaceholderView() {
        return (TextView) findViewById(R.id.cbr_item_title_placeholder);
    }

    private final TextView getTitleView() {
        return (TextView) findViewById(R.id.cbr_item_title);
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    @k
    public CBRStepState getCBRStepState() {
        CBRStepState cBRStepState = this.stepState;
        return cBRStepState == null ? CBRStepState.INIT : cBRStepState;
    }

    @l
    public final Drawable getIconEnd() {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            return iconEndView.getDrawable();
        }
        return null;
    }

    @l
    public final ImageView getIconEndView() {
        return (ImageView) findViewById(R.id.cbr_item_end_icon);
    }

    @l
    public final Drawable getIconStart() {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            return iconStartView.getDrawable();
        }
        return null;
    }

    @l
    public ColorStateList getIconTintColor() {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            return iconStartView.getImageTintList();
        }
        return null;
    }

    @l
    public final CharSequence getPlaceholder() {
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            return titlePlaceholderView.getText();
        }
        return null;
    }

    @l
    public final CharSequence getSubtitle() {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            return subtitleView.getText();
        }
        return null;
    }

    @l
    public final CharSequence getTitle() {
        TextView titleView = getTitleView();
        if (titleView != null) {
            return titleView.getText();
        }
        return null;
    }

    @Override // com.google.android.material.card.a, android.view.ViewGroup, android.view.View
    @k
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? CBRStepStateKt.getCBRStepStateDrawable(this) : new int[]{R.attr.cbr_stateInit});
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    public void setCBRStepState(@k CBRStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            refreshDrawableState();
            TextView titleView = getTitleView();
            if (titleView != null) {
                CBRStepStateKt.setStepState(titleView, state);
            }
            TextView subtitleView = getSubtitleView();
            if (subtitleView != null) {
                CBRStepStateKt.setStepState(subtitleView, state);
            }
            ImageView iconStartView = getIconStartView();
            if (iconStartView != null) {
                CBRStepStateKt.setStepState(iconStartView, state);
            }
            ImageView iconEndView = getIconEndView();
            if (iconEndView == null) {
                return;
            }
            CBRStepStateKt.setStepState(iconEndView, state);
        }
    }

    public final void setIconEnd(@l Drawable drawable) {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            iconEndView.setImageDrawable(drawable);
        }
        ImageView iconEndView2 = getIconEndView();
        if (iconEndView2 == null) {
            return;
        }
        iconEndView2.setVisibility(drawable == null ? 8 : 0);
    }

    public final void setIconStart(@l Drawable drawable) {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            iconStartView.setImageDrawable(drawable);
        }
        ImageView iconStartView2 = getIconStartView();
        if (iconStartView2 == null) {
            return;
        }
        iconStartView2.setVisibility(drawable == null ? 8 : 0);
    }

    public void setIconTintColor(@k ColorStateList tintColor) {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            iconStartView.setImageTintList(tintColor);
        }
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            iconEndView.setImageTintList(tintColor);
        }
    }

    public final void setPlaceholder(@l CharSequence charSequence) {
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            titlePlaceholderView.setText(charSequence);
        }
        TextView titlePlaceholderView2 = getTitlePlaceholderView();
        if (titlePlaceholderView2 != null) {
            CharSequence title = getTitle();
            s.a(titlePlaceholderView2, !(title == null || title.length() == 0));
        }
    }

    public final void setSubtitle(@l CharSequence charSequence) {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setText(charSequence);
        }
        TextView subtitleView2 = getSubtitleView();
        if (subtitleView2 == null) {
            return;
        }
        subtitleView2.setVisibility(charSequence == null ? 8 : 0);
    }

    public final void setSubtitleTextColor(@k ColorStateList colorStateList) {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setTextColor(colorStateList);
        }
    }

    public final void setTitle(@l CharSequence charSequence) {
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(charSequence);
        }
        TextView titleView2 = getTitleView();
        if (titleView2 != null) {
            titleView2.setVisibility(!(charSequence == null || charSequence.length() == 0) ? 0 : 8);
        }
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            s.a(titlePlaceholderView, !(charSequence == null || charSequence.length() == 0));
        }
    }

    public final void setTitleTextColor(@k ColorStateList colorStateList) {
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setTextColor(colorStateList);
        }
    }

    public /* synthetic */ CBRStepView(Context context, AttributeSet attributeSet, int i12, int i13, CBRMetricElement cBRMetricElement, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_StepViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRStepView : i13, (i14 & 16) != 0 ? CBRMetricElement.VERIFICATION_STEP_CARD_STYLE : cBRMetricElement);
    }

    @j
    public CBRStepView(@k Context context, @l AttributeSet attributeSet, int i12, int i13, @l CBRMetricElement cBRMetricElement) {
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.stepState = CBRStepState.INIT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRStepView, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRStepView_cbr_stepBackgroundColor)) {
            setCardBackgroundColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRStepView_cbr_stepBackgroundColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRStepView_cbr_stepStrokeColor)) {
            setStrokeColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRStepView_cbr_stepStrokeColor));
        }
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRStepView_cbr_stepStrokeWidth, 0));
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRStepView_elevation)) {
            setCardElevation(typedArrayObtainStyledAttributes.getDimension(R.styleable.CBRStepView_elevation, 0.0f));
        }
        setShapeAppearanceModel(q.c(context, attributeSet, i12, i13).a());
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRStepView_cbr_stepViewLayout, 0), (ViewGroup) this, true);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRStepView_cbr_stepIconTintColor)) {
            setIconTintColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRStepView_cbr_stepIconTintColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRStepView_cbr_stepTitleTextColor)) {
            setTitleTextColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRStepView_cbr_stepTitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRStepView_cbr_stepSubtitleTextColor)) {
            setSubtitleTextColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRStepView_cbr_stepSubtitleTextColor));
        }
        setIconStart(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRStepView_cbr_iconStart));
        setIconEnd(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRStepView_cbr_iconEnd));
        setTitle(typedArrayObtainStyledAttributes.getText(R.styleable.CBRStepView_cbr_title));
        setSubtitle(typedArrayObtainStyledAttributes.getText(R.styleable.CBRStepView_cbr_subtitle));
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        applyTheme(cBRMetricElement);
    }
}

package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;

/* compiled from: CBRCheckGroup.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/cyberity/cbr/core/widget/CBRCheckGroup;", "Landroid/widget/LinearLayout;", "Lru/cyberity/cbr/core/widget/CBRStepStateProvider;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getCBRStepState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "Lkotlin/G0;", "setCBRStepState", "(Lru/cyberity/cbr/core/widget/CBRStepState;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Lcom/google/android/material/shape/q;", "shapeAppearanceModel", "Lcom/google/android/material/shape/q;", "stepState", "Lru/cyberity/cbr/core/widget/CBRStepState;", "Lcom/google/android/material/shape/k;", "boxBackground", "Lcom/google/android/material/shape/k;", "getBoxBackground$cyberity_mobile_sdk_ui_release", "()Lcom/google/android/material/shape/k;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRCheckGroup extends LinearLayout implements CBRStepStateProvider {

    @k
    private final com.google.android.material.shape.k boxBackground;

    @k
    private final q shapeAppearanceModel;

    @l
    private CBRStepState stepState;

    @j
    public CBRCheckGroup(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.view.ViewGroup
    public void addView(@k View child, int index, @k ViewGroup.LayoutParams params) {
        Integer color;
        super.addView(child, index, params);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (!(child instanceof CheckBox) || customTheme == null) {
            return;
        }
        CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WEAK;
        ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
        if (customTheme2 == null || (color = themeHelper.getColor(customTheme2, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
            return;
        }
        int iIntValue = color.intValue();
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.FIELD_TINT);
        ((CheckBox) child).setButtonTintList(new ColorStateList(iArr, new int[]{iIntValue, themeColor != null ? themeColor.intValue() : iIntValue}));
    }

    @k
    /* renamed from: getBoxBackground$cyberity_mobile_sdk_ui_release, reason: from getter */
    public final com.google.android.material.shape.k getBoxBackground() {
        return this.boxBackground;
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    @k
    public CBRStepState getCBRStepState() {
        CBRStepState cBRStepState = this.stepState;
        return cBRStepState == null ? CBRStepState.INIT : cBRStepState;
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? CBRStepStateKt.getCBRStepStateDrawable(this) : new int[]{ru.cyberity.cbr.core.R.attr.cbr_stateInit});
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    public void setCBRStepState(@k CBRStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            this.boxBackground.setState(CBRStepStateKt.getCBRStepStateDrawable(this));
            refreshDrawableState();
        }
    }

    public /* synthetic */ CBRCheckGroup(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? ru.cyberity.cbr.core.R.attr.cbr_CheckGroupStyle : i12, (i14 & 8) != 0 ? ru.cyberity.cbr.core.R.style.Widget_CBRCheckGroup : i13);
    }

    @j
    public CBRCheckGroup(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        Float metricDimension;
        Integer color;
        super(context, attributeSet);
        q qVarA = q.c(context, attributeSet, i12, i13).a();
        this.shapeAppearanceModel = qVarA;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVarA);
        this.boxBackground = kVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ru.cyberity.cbr.core.R.styleable.CBRCheckGroup, i12, i13);
        kVar.n(s.a(typedArrayObtainStyledAttributes, context, ru.cyberity.cbr.core.R.styleable.CBRCheckGroup_cbr_checkBackgroundColor));
        setBackground(kVar);
        setShowDividers(typedArrayObtainStyledAttributes.getInt(ru.cyberity.cbr.core.R.styleable.CBRCheckGroup_android_showDividers, 0));
        setDividerDrawable(typedArrayObtainStyledAttributes.getDrawable(ru.cyberity.cbr.core.R.styleable.CBRCheckGroup_android_divider));
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.FIELD_BACKGROUND_INVALID);
        themeColor = themeColor == null ? themeHelper.getThemeColor(this, CBRColorElement.BACKGROUND_CRITICAL) : themeColor;
        if (themeColor != null) {
            kVar.n(new ColorStateList(new int[][]{new int[]{ru.cyberity.cbr.core.R.attr.cbr_stateInit}, new int[]{ru.cyberity.cbr.core.R.attr.cbr_stateRejected}, new int[0]}, new int[]{0, themeColor.intValue(), 0}));
        }
        CBRColorElement cBRColorElement = CBRColorElement.LIST_SEPARATOR;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) != null) {
            getDividerDrawable().setColorFilter(new PorterDuffColorFilter(color.intValue(), PorterDuff.Mode.SRC));
        }
        CBRMetricElement cBRMetricElement = CBRMetricElement.FIELD_CORNER_RADIUS;
        ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
        if (customTheme2 == null || (metricDimension = themeHelper.getMetricDimension(customTheme2, cBRMetricElement)) == null) {
            return;
        }
        kVar.l(metricDimension.floatValue());
    }
}

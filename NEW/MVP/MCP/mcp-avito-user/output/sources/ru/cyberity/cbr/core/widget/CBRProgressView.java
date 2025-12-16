package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;

/* compiled from: CBRProgressView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "color", "Lkotlin/G0;", "setProgressBackgroundColor", "(I)V", "setProgressBarColor", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRProgressView extends ConstraintLayout {
    @j
    public CBRProgressView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) findViewById(R.id.cbr_progress_bar);
    }

    @l
    public final CharSequence getText() {
        TextView textView = (TextView) findViewById(R.id.cbr_progress_text);
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setProgressBackgroundColor(int color) {
        View viewFindViewById = findViewById(R.id.cbr_progress_bg);
        Drawable background = viewFindViewById != null ? viewFindViewById.getBackground() : null;
        com.google.android.material.shape.k kVar = background instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) background : null;
        if (kVar != null) {
            kVar.setTint(color);
        }
    }

    public final void setProgressBarColor(int color) {
        ProgressBar progressBar = getProgressBar();
        if (progressBar == null) {
            return;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(color));
    }

    public final void setText(@l CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R.id.cbr_progress_text);
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public /* synthetic */ CBRProgressView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_ProgressViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRProgressView : i13);
    }

    @j
    public CBRProgressView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        Integer color;
        Integer color2;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRProgressView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRProgressView_cbr_progressViewLayout, 0), (ViewGroup) this, true);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRProgressView_cbr_dimColor)) {
            setBackgroundColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRProgressView_cbr_dimColor).getDefaultColor());
        }
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(context, attributeSet, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRProgressView_cbr_progressBackgroundColor)) {
            kVar.setTint(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRProgressView_cbr_progressBackgroundColor).getDefaultColor());
        }
        View viewFindViewById = findViewById(R.id.cbr_progress_bg);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(kVar);
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        CBRColorElement cBRColorElement = CBRColorElement.BACKGROUND_COMMON;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (color2 = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) != null) {
            int iIntValue = color2.intValue();
            setBackground(new ColorDrawable(iIntValue));
            setProgressBackgroundColor(iIntValue);
        }
        CBRColorElement cBRColorElement2 = CBRColorElement.CONTENT_NEUTRAL;
        ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
        if (customTheme2 == null || (color = themeHelper.getColor(customTheme2, cBRColorElement2, themeHelper.isDarkTheme(this))) == null) {
            return;
        }
        setProgressBarColor(color.intValue());
    }
}

package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C22823h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;

/* compiled from: CBRImageButton.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRImageButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRImageButton extends AppCompatImageButton {
    @j
    public CBRImageButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ CBRImageButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_ImageButtonStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRImageButton : i13);
    }

    @j
    public CBRImageButton(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRImageButton, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRImageButton_android_tint)) {
            setImageTintList(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRImageButton_android_tint));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRImageButton_android_backgroundTint)) {
            C22823h0.F(this, s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRImageButton_android_backgroundTint));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRImageButton_android_background)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRImageButton_android_background));
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        if (themeHelper.getCustomTheme() != null) {
            Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT);
            int iIntValue = themeColor != null ? themeColor.intValue() : 0;
            Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT_DISABLED);
            int iIntValue2 = themeColor2 != null ? themeColor2.intValue() : 0;
            Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT_HIGHLIGHTED);
            setImageTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{iIntValue2, themeColor3 != null ? themeColor3.intValue() : 0, iIntValue}));
        }
    }
}

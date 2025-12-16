package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.ImageElementName;
import ru.cyberity.cbr.core.theme.b;

/* compiled from: CBRToolbarView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRToolbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/content/res/ColorStateList;", "colorStateList", "Lkotlin/G0;", "setIconTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/drawable/Drawable;", "icon", "setCloseButtonDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setOptionButtonDrawable", "Landroid/view/View$OnClickListener;", "listener", "setOnCloseButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "setOnOptionButtonClickListener", "", "visible", "setOptionButtonVisible", "(Z)V", "Landroid/widget/ImageButton;", "getCloseButton", "()Landroid/widget/ImageButton;", "closeButton", "getOptionButton", "optionButton", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRToolbarView extends ConstraintLayout {
    @j
    public CBRToolbarView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final ImageButton getCloseButton() {
        return (ImageButton) findViewById(R.id.cbr_button_close);
    }

    private final ImageButton getOptionButton() {
        return (ImageButton) findViewById(R.id.cbr_button_option);
    }

    public final void setCloseButtonDrawable(@l Drawable icon) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setImageDrawable(icon);
        }
    }

    public final void setIconTintList(@k ColorStateList colorStateList) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setImageTintList(colorStateList);
        }
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setImageTintList(colorStateList);
        }
    }

    public final void setOnCloseButtonClickListener(@k View.OnClickListener listener) {
        ImageButton closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(listener);
        }
    }

    public final void setOnOptionButtonClickListener(@k View.OnClickListener listener) {
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setOnClickListener(listener);
        }
    }

    public final void setOptionButtonDrawable(@l Drawable icon) {
        ImageButton optionButton = getOptionButton();
        if (optionButton != null) {
            optionButton.setImageDrawable(icon);
        }
    }

    public final void setOptionButtonVisible(boolean visible) {
        ImageButton optionButton = getOptionButton();
        if (optionButton == null) {
            return;
        }
        optionButton.setVisibility(visible ? 0 : 8);
    }

    public /* synthetic */ CBRToolbarView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_ToolbarViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRToolbarView : i13);
    }

    @j
    public CBRToolbarView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        Integer color;
        Bitmap bitmap;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRToolbarView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRToolbarView_cbr_toolbarViewLayout, 0), (ViewGroup) this, true);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRToolbarView_cbr_toolbarIconTint)) {
            setIconTintList(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRToolbarView_cbr_toolbarIconTint));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRToolbarView_cbr_iconClose)) {
            setCloseButtonDrawable(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CBRToolbarView_cbr_iconClose));
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            Map<String, ru.cyberity.cbr.core.theme.b> mapB = customTheme.b();
            Object obj = mapB != null ? (ru.cyberity.cbr.core.theme.b) mapB.get(ImageElementName.ICON_CLOSE.getValue()) : null;
            b.c cVar = obj instanceof b.c ? (b.c) obj : null;
            if (cVar != null && (bitmap = cVar.getBitmap()) != null) {
                setCloseButtonDrawable(new BitmapDrawable(bitmap));
            }
            CBRColorElement cBRColorElement = CBRColorElement.NAVIGATION_BAR_ITEM;
            ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
            if (customTheme2 == null || (color = themeHelper.getColor(customTheme2, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
                return;
            }
            setIconTintList(ColorStateList.valueOf(color.intValue()));
        }
    }
}

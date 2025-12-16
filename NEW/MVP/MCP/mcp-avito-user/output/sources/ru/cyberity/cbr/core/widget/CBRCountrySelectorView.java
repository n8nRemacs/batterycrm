package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.theme.CBRMetricElement;

/* compiled from: CBRCountrySelectorView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRCountrySelectorView;", "Lru/cyberity/cbr/core/widget/CBRStepView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/content/res/ColorStateList;", "tintColor", "Lkotlin/G0;", "setIconTintColor", "(Landroid/content/res/ColorStateList;)V", "getIconTintColor", "()Landroid/content/res/ColorStateList;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRCountrySelectorView extends CBRStepView {
    @j
    public CBRCountrySelectorView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepView
    @l
    public ColorStateList getIconTintColor() {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            return iconEndView.getImageTintList();
        }
        return null;
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepView
    public void setIconTintColor(@k ColorStateList tintColor) {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            iconEndView.setImageTintList(tintColor);
        }
    }

    public /* synthetic */ CBRCountrySelectorView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_CountrySelectorViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRCountrySelectorView : i13);
    }

    @j
    public CBRCountrySelectorView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13, CBRMetricElement.SELECTED_COUNTRY_CARD_STYLE);
    }
}

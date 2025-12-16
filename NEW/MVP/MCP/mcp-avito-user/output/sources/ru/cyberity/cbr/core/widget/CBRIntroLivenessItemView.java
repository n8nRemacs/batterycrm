package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;

/* compiled from: CBRIntroLivenessItemView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRIntroLivenessItemView;", "Lru/cyberity/cbr/core/widget/CBRStepView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRIntroLivenessItemView extends CBRStepView {
    public /* synthetic */ CBRIntroLivenessItemView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_introLivenessItemViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRIntroLivenessItemView : i13);
    }

    @j
    public CBRIntroLivenessItemView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13, null);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        if (themeHelper.getCustomTheme() != null) {
            Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_SUCCESS);
            Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_CRITICAL);
            Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_NEUTRAL);
            int[][] iArr = {new int[]{R.attr.cbr_stateApproved}, new int[]{R.attr.cbr_stateRejected}, new int[0]};
            if (themeColor == null || themeColor2 == null || themeColor3 == null) {
                return;
            }
            setTitleTextColor(new ColorStateList(iArr, new int[]{themeColor.intValue(), themeColor2.intValue(), themeColor3.intValue()}));
            setSubtitleTextColor(ColorStateList.valueOf(themeColor3.intValue()));
        }
    }
}

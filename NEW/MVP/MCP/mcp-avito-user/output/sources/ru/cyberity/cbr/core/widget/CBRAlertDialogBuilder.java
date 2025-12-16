package ru.cyberity.cbr.core.widget;

import Y61.k;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.l;
import kotlin.Metadata;
import pY0.C47034b;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;

/* compiled from: CBRAlertDialogBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRAlertDialogBuilder;", "LpY0/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/appcompat/app/l;", "create", "()Landroidx/appcompat/app/l;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRAlertDialogBuilder extends C47034b {
    public CBRAlertDialogBuilder(@k Context context) {
        super(context);
    }

    @Override // pY0.C47034b, androidx.appcompat.app.l.a
    @k
    public l create() {
        Integer color;
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (color = themeHelper.getColor(customTheme, CBRColorElement.ALERT_TINT, s.a(getContext().getResources().getConfiguration()))) != null) {
            int iIntValue = color.intValue();
            Drawable background = getBackground();
            if (background != null) {
                background.setTintMode(PorterDuff.Mode.SRC_ATOP);
            }
            Drawable background2 = getBackground();
            if (background2 != null) {
                background2.setTint(iIntValue);
            }
        }
        return super.create();
    }
}

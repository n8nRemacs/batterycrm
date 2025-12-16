package N91;

import B91.x;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yandex.div.core.view2.C37928b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11279c;

    public /* synthetic */ l(Object obj, int i12) {
        this.f11278b = i12;
        this.f11279c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        Object obj = this.f11279c;
        switch (this.f11278b) {
            case 0:
                Rect rect = new Rect();
                ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l lVar = (ru.mts.biometry.sdk.feature.document.chooseDocument.searchCountry.l) obj;
                Dialog dialog = lVar.getDialog();
                if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.getWindowVisibleDisplayFrame(rect);
                }
                x xVar = lVar.f436431g0;
                if (xVar == null) {
                    xVar = null;
                }
                xVar.f1193e.setY(rect.centerY());
                break;
            case 1:
                AndroidComposeView.a aVar = AndroidComposeView.f40963H0;
                ((AndroidComposeView) obj).P();
                break;
            case 2:
                int i12 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
                Rect rect2 = new Rect();
                ru.mts.biometry.sdk.feature.passport.ui.address.f fVar = (ru.mts.biometry.sdk.feature.passport.ui.address.f) obj;
                Dialog dialog2 = fVar.getDialog();
                if (dialog2 != null && (window2 = dialog2.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                    decorView2.getWindowVisibleDisplayFrame(rect2);
                }
                fVar.b5().f1148b.setY(rect2.centerY());
                break;
            default:
                C37928b c37928b = (C37928b) obj;
                if (c37928b.f367989j && c37928b.f367985f.getVisibility() != 0) {
                    c37928b.k();
                    break;
                }
                break;
        }
    }
}

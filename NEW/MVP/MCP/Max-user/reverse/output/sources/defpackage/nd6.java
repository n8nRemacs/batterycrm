package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class nd6 implements gyf {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nd6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fyf
    public final void a(iyf iyfVar) {
        aya tabItem;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                od6 od6Var = (od6) obj;
                View view = iyfVar.b;
                String str = null;
                meb mebVar = view instanceof meb ? (meb) view : null;
                if (mebVar != null && (tabItem = mebVar.getTabItem()) != null) {
                    str = tabItem.a;
                }
                od6Var.w0 = str;
                break;
            case 1:
                yy7[] yy7VarArr = NeuroAvatarPickerBottomSheet.N0;
                ((NeuroAvatarPickerBottomSheet) obj).P0().z(iyfVar.a);
                break;
            case 2:
                NeuroAvatarsScreen neuroAvatarsScreen = (NeuroAvatarsScreen) obj;
                if (iyfVar.a > 0) {
                    yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
                    neuroAvatarsScreen.y0().setExpanded(false);
                }
                yy7[] yy7VarArr3 = NeuroAvatarsScreen.K0;
                neuroAvatarsScreen.C0().z(iyfVar.a);
                break;
            default:
                ((ViewPager) obj).setCurrentItem(iyfVar.a);
                break;
        }
    }
}

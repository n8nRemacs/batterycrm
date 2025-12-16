package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wn extends fhh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fhh, defpackage.ehh
    public void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vn) obj).b.F0.setVisibility(0);
                break;
            case 1:
                ho hoVar = (ho) obj;
                hoVar.F0.setVisibility(0);
                if (hoVar.F0.getParent() instanceof View) {
                    View view = (View) hoVar.F0.getParent();
                    WeakHashMap weakHashMap = hfh.a;
                    teh.c(view);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ehh
    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ho hoVar = ((vn) obj).b;
                hoVar.F0.setAlpha(1.0f);
                hoVar.I0.d(null);
                hoVar.I0 = null;
                break;
            case 1:
                ho hoVar2 = (ho) obj;
                hoVar2.F0.setAlpha(1.0f);
                hoVar2.I0.d(null);
                hoVar2.I0 = null;
                break;
            default:
                ho hoVar3 = (ho) ((h79) obj).c;
                hoVar3.F0.setVisibility(8);
                PopupWindow popupWindow = hoVar3.G0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hoVar3.F0.getParent() instanceof View) {
                    View view = (View) hoVar3.F0.getParent();
                    WeakHashMap weakHashMap = hfh.a;
                    teh.c(view);
                }
                hoVar3.F0.e();
                hoVar3.I0.d(null);
                hoVar3.I0 = null;
                ViewGroup viewGroup = hoVar3.K0;
                WeakHashMap weakHashMap2 = hfh.a;
                teh.c(viewGroup);
                break;
        }
    }
}

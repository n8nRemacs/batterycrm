package defpackage;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ydg extends FrameLayout {
    public xdg a;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                fba fbaVar = (fba) this.a;
                Group group = fbaVar.B0;
                if (group != null && group.getVisibility() == 0) {
                    fbaVar.z0.animate().translationY(-fbaVar.H0.l).setInterpolator(fbaVar.s0.a.f()).setDuration(200L);
                }
                fbaVar.j(new dk0(6));
            } else if (action == 1) {
                fba fbaVar2 = (fba) this.a;
                Group group2 = fbaVar2.B0;
                if (group2 != null && group2.getVisibility() == 0) {
                    fbaVar2.z0.animate().translationY(0.0f).setInterpolator(fbaVar2.s0.a.f()).setDuration(200L);
                }
                fbaVar2.j(new dk0(0));
            } else if (action == 2) {
                for (laa laaVar : (Set) ((fba) this.a).a) {
                    if (laaVar != null) {
                        laaVar.x0 = false;
                        jp8 jp8VarA = laaVar.w0.a();
                        jp8VarA.a = cf8.Y;
                        laaVar.w0 = new kp8(jp8VarA);
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setListener(xdg xdgVar) {
        this.a = xdgVar;
    }
}

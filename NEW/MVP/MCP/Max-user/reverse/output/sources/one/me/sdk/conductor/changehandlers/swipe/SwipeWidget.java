package one.me.sdk.conductor.changehandlers.swipe;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.bud;
import defpackage.c54;
import defpackage.dvf;
import defpackage.f2;
import defpackage.gg0;
import defpackage.h54;
import defpackage.i54;
import defpackage.ivf;
import defpackage.kvf;
import defpackage.l54;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.sue;
import defpackage.sxa;
import defpackage.ts9;
import defpackage.wqi;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.zuf;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lone/me/sdk/arch/Widget;", "Lzuf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "conductor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SwipeWidget extends Widget implements zuf {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public boolean b;

    public SwipeWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = getClass().getName().concat("/SwipeWidget");
    }

    public void A0() {
    }

    public void B0() {
    }

    public void C0() {
    }

    public void D0() {
    }

    public final void E0(c54 c54Var) {
        Iterator<T> it = c54Var.getChildRouters().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ytd) it.next()).a.iterator();
            while (true) {
                f2 f2Var = (f2) it2;
                if (f2Var.hasNext()) {
                    c54 c54Var2 = ((bud) f2Var.next()).a;
                    yy7[] yy7VarArr = l54.a;
                    c54Var2.setNeedsAttach(true);
                    E0(c54Var2);
                }
            }
        }
    }

    public Long F0() {
        return null;
    }

    public Integer G0() {
        return null;
    }

    @Override // defpackage.c54
    public boolean handleBack() {
        return this.b || super.handleBack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c54
    public final void onChangeEnded(h54 h54Var, i54 i54Var) {
        lg8 lg8Var = lg8.d;
        super.onChangeEnded(h54Var, i54Var);
        if (!Y()) {
            String str = this.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onChangeEnded: swipe is disabled", null);
                return;
            }
            return;
        }
        View view = getView();
        if (view == 0) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (getRouter().a.a.size() < 2) {
            String str2 = this.a;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 == null) {
                return;
            }
            lg8 lg8Var2 = lg8.X;
            if (l6bVar2.b(lg8Var2)) {
                l6bVar2.c(lg8Var2, str2, "For swipe feature backstack must contains more than 1 widget", null);
                return;
            }
            return;
        }
        if (i54Var.b) {
            String str3 = this.a;
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, str3, "onChangeEnded: setup swipe callbacks on new view", null);
            }
            if (getRouter().a.a.size() <= 1) {
                throw new IllegalStateException("For swipe feature backstack must contains more than 1 widget");
            }
            sue sueVar = new sue(this, 6, viewGroup);
            boolean z = view instanceof ivf;
            if (!z) {
                throw new IllegalStateException("'To' view must realize SwipeTouchHandler for work");
            }
            dvf dvfVar = new dvf(G0(), new kvf(0, this), view, viewGroup, sueVar, z0() ? 2 : 1);
            dvfVar.q = this;
            dvfVar.r = F0();
            ivf ivfVar = z ? (ivf) view : null;
            if (ivfVar != null) {
                ivfVar.setOnTouch(new ts9(1, dvfVar, dvf.class, "onTouchEvent", "onTouchEvent(Landroid/view/MotionEvent;)Z", 0, 15));
                ivfVar.setOnRequestInterceptTouchEvent(new sxa(0, dvfVar, dvf.class, "resetDraggingState", "resetDraggingState()V", 0, 8));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        if (i54Var.b) {
            return;
        }
        KeyEvent.Callback view = getView();
        ivf ivfVar = view instanceof ivf ? (ivf) view : null;
        if (ivfVar != null) {
            ivfVar.setOnTouch(null);
            ivfVar.setOnRequestInterceptTouchEvent(null);
        }
    }

    public final c54 y0() {
        bud budVarA;
        ytd router = getRouter();
        int size = getRouter().a.a.size() - 2;
        gg0 gg0Var = router.a;
        int size2 = gg0Var.a.size() - 1;
        if (size > size2) {
            budVarA = null;
        } else if (size == size2) {
            budVarA = gg0Var.a();
        } else {
            Iterator itC = gg0Var.c();
            int i = 0;
            while (itC.hasNext()) {
                bud budVar = (bud) itC.next();
                if (i == size) {
                    budVarA = budVar;
                    break;
                }
                i++;
            }
            budVarA = null;
        }
        c54 c54Var = budVarA != null ? budVarA.a : null;
        if (c54Var != null) {
            return c54Var;
        }
        throw new IllegalArgumentException("No underlying controller! Swiping won't work properly");
    }

    public boolean z0() {
        return !(this instanceof ChatMediaViewerScreen);
    }
}

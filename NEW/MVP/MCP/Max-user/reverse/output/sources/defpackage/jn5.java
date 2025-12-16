package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class jn5 extends y6i {
    public final /* synthetic */ kn5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn5(kn5 kn5Var) {
        super(1);
        this.c = kn5Var;
    }

    @Override // defpackage.y6i
    public final m5 f(int i) {
        return new m5(AccessibilityNodeInfo.obtain(this.c.r(i).a));
    }

    @Override // defpackage.y6i
    public final m5 n(int i) {
        kn5 kn5Var = this.c;
        int i2 = i == 2 ? kn5Var.k : kn5Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return f(i2);
    }

    @Override // defpackage.y6i
    public final boolean z(int i, int i2, Bundle bundle) {
        int i3;
        kn5 kn5Var = this.c;
        View view = kn5Var.i;
        if (i == -1) {
            WeakHashMap weakHashMap = hfh.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return kn5Var.w(i);
        }
        if (i2 == 2) {
            return kn5Var.j(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return kn5Var.s(i, i2, bundle);
            }
            if (kn5Var.k != i) {
                return false;
            }
            kn5Var.k = Integer.MIN_VALUE;
            view.invalidate();
            kn5Var.x(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = kn5Var.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = kn5Var.k) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            kn5Var.k = Integer.MIN_VALUE;
            view.invalidate();
            kn5Var.x(i3, 65536);
        }
        kn5Var.k = i;
        view.invalidate();
        kn5Var.x(i, 32768);
        return true;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewParent;
import androidx.fragment.app.a;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.List;

/* loaded from: classes.dex */
public final class b8 extends ytd {
    public Object j;
    public final l16 k = new l16(13);

    public b8() {
        this.e = 1;
    }

    @Override // defpackage.ytd
    public final void K(int i, String str) {
        ((AndroidXLifecycleHandlerImpl) this.j).t0(i, str);
    }

    @Override // defpackage.ytd
    public final void N(String str, String[] strArr, int i) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) this.j;
        androidXLifecycleHandlerImpl.getClass();
        xpi.m(androidXLifecycleHandlerImpl, str, strArr, i);
    }

    @Override // defpackage.ytd
    public final void O(Bundle bundle) throws SecurityException {
        super.O(bundle);
        l16 l16Var = this.k;
        l16Var.getClass();
        l16Var.b = bundle.getInt("TransactionIndexer.currentIndex");
    }

    @Override // defpackage.ytd
    public final void P(Bundle bundle) {
        super.P(bundle);
        bundle.putInt("TransactionIndexer.currentIndex", this.k.b);
    }

    @Override // defpackage.ytd
    public final void U(Intent intent) {
        a aVar = (a) this.j;
        ei6 ei6Var = aVar.E0;
        if (ei6Var == null) {
            throw new IllegalStateException(u45.j("Fragment ", aVar, " not attached to Activity"));
        }
        ei6Var.d.startActivity(intent, null);
    }

    @Override // defpackage.ytd
    public final void V(String str, Intent intent, int i) {
        ((AndroidXLifecycleHandlerImpl) this.j).v0(str, intent, i, null);
    }

    @Override // defpackage.ytd
    public final void W(String str, Intent intent, int i, Bundle bundle) {
        ((AndroidXLifecycleHandlerImpl) this.j).v0(str, intent, i, bundle);
    }

    @Override // defpackage.ytd
    public final void X(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) this.j;
        androidXLifecycleHandlerImpl.getClass();
        je jeVar = new je(androidXLifecycleHandlerImpl, intentSender, i, intent, i2, i3, i4, bundle);
        androidXLifecycleHandlerImpl.t0(i, str);
        jeVar.invoke();
    }

    @Override // defpackage.ytd
    public final void Z(String str) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) this.j;
        int size = androidXLifecycleHandlerImpl.getI1().h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (str.equals(androidXLifecycleHandlerImpl.getI1().h.get(androidXLifecycleHandlerImpl.getI1().h.keyAt(size)))) {
                androidXLifecycleHandlerImpl.getI1().h.removeAt(size);
            }
        }
    }

    public final void a0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, f82 f82Var) {
        if (this.j == androidXLifecycleHandlerImpl && this.i == f82Var) {
            return;
        }
        ViewParent viewParent = this.i;
        if (viewParent != null && (viewParent instanceof g54)) {
            L((g54) viewParent);
        }
        a(f82Var);
        this.j = androidXLifecycleHandlerImpl;
        this.i = f82Var;
        f82Var.post(new r98(19, this));
    }

    @Override // defpackage.ytd
    public final Activity d() {
        Object obj = this.j;
        if (obj != null) {
            return ((AndroidXLifecycleHandlerImpl) obj).i1.b;
        }
        return null;
    }

    @Override // defpackage.ytd
    public final ytd i() {
        return this;
    }

    @Override // defpackage.ytd
    public final List j() {
        return ue3.d0(((AndroidXLifecycleHandlerImpl) this.j).i1.j.values());
    }

    @Override // defpackage.ytd
    public final l16 k() {
        return this.k;
    }

    @Override // defpackage.ytd
    public final void o() {
        if (this.j == null || d() == null) {
            return;
        }
        d().invalidateOptionsMenu();
    }

    @Override // defpackage.ytd
    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        if (z) {
            return;
        }
        this.j = null;
    }
}

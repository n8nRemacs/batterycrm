package com.bluelinelabs.conductor.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import defpackage.b8;
import defpackage.c54;
import defpackage.cqb;
import defpackage.d48;
import defpackage.e48;
import defpackage.smf;
import defpackage.ue3;
import defpackage.xpi;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bluelinelabs/conductor/internal/AndroidXLifecycleHandlerImpl;", "Landroidx/fragment/app/a;", "<init>", "()V", "conductor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidXLifecycleHandlerImpl extends a implements Application.ActivityLifecycleCallbacks {
    public final d48 i1 = new d48(true);

    public AndroidXLifecycleHandlerImpl() {
        p0();
        if (!this.O0) {
            this.O0 = true;
            if (!F() || G()) {
                return;
            }
            this.E0.Y.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.a
    public final void J(int i, int i2, Intent intent) {
        super.J(i, i2, intent);
        String str = (String) getI1().h.get(i);
        if (str != null) {
            Iterator it = xpi.j(this).iterator();
            while (it.hasNext()) {
                c54 c54VarF = ((b8) it.next()).f(str);
                if (c54VarF != null) {
                    c54VarF.onActivityResult(i, i2, intent);
                }
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final void L(Context context) {
        super.L(context);
        if (context instanceof Activity) {
            getI1().b = (Activity) context;
        }
        getI1().d = false;
        if (getI1().e) {
            return;
        }
        getI1().e = true;
        int size = getI1().i.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                cqb cqbVar = (cqb) getI1().i.remove(size);
                xpi.m(this, cqbVar.a, cqbVar.b, cqbVar.c);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        Iterator it = xpi.j(this).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).u();
        }
    }

    @Override // androidx.fragment.app.a
    public final void M(Bundle bundle) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        super.M(bundle);
        if (bundle == null) {
            return;
        }
        d48 i1 = getI1();
        smf smfVar = (smf) bundle.getParcelable("LifecycleHandler.permissionRequests");
        if (smfVar == null || (sparseArray = smfVar.a) == null) {
            sparseArray = new SparseArray();
        }
        i1.g = sparseArray;
        d48 i12 = getI1();
        smf smfVar2 = (smf) bundle.getParcelable("LifecycleHandler.activityRequests");
        if (smfVar2 == null || (sparseArray2 = smfVar2.a) == null) {
            sparseArray2 = new SparseArray();
        }
        i12.h = sparseArray2;
        d48 i13 = getI1();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        i13.i = parcelableArrayList;
    }

    @Override // androidx.fragment.app.a
    public final void N(Menu menu, MenuInflater menuInflater) {
        Iterator it = xpi.j(this).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).v(menu, menuInflater);
        }
    }

    @Override // androidx.fragment.app.a
    public final void P() {
        this.Q0 = true;
        xpi.l(this);
    }

    @Override // androidx.fragment.app.a
    public final void R() {
        this.Q0 = true;
        getI1().e = false;
        Activity activity = getI1().b;
        if (activity != null) {
            xpi.b(this, activity.isChangingConfigurations());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[ORIG_RETURN, RETURN] */
    @Override // androidx.fragment.app.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(android.view.MenuItem r4) {
        /*
            r3 = this;
            m2 r0 = new m2
            r0.<init>(r3, r4)
            java.util.List r1 = defpackage.xpi.j(r3)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L10
            goto L27
        L10:
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            b8 r2 = (defpackage.b8) r2
            boolean r2 = r2.w(r4)
            if (r2 == 0) goto L14
            goto L33
        L27:
            java.lang.Object r4 = r0.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
        L33:
            r4 = 1
            goto L36
        L35:
            r4 = 0
        L36:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl.W(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.a
    public final void Y(Menu menu) {
        Iterator it = xpi.j(this).iterator();
        while (it.hasNext()) {
            ((b8) it.next()).x(menu);
        }
    }

    @Override // androidx.fragment.app.a
    public final void Z(int i, String[] strArr, int[] iArr) {
        String str = (String) getI1().g.get(i);
        if (str != null) {
            Iterator it = xpi.j(this).iterator();
            while (it.hasNext()) {
                c54 c54VarF = ((b8) it.next()).f(str);
                if (c54VarF != null) {
                    c54VarF.requestPermissionsResult(i, strArr, iArr);
                }
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        bundle.putParcelable("LifecycleHandler.permissionRequests", new smf(getI1().g));
        bundle.putParcelable("LifecycleHandler.activityRequests", new smf(getI1().h));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", getI1().i);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (e48.a(activity, getI1().a) == this) {
            getI1().b = activity;
            Iterator it = ue3.d0(getI1().j.values()).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).u();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        e48.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (getI1().b == activity) {
            Iterator it = xpi.j(this).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).q(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (getI1().b != activity || activity.isChangingConfigurations()) {
            return;
        }
        xpi.l(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (getI1().b == activity) {
            Iterator it = xpi.j(this).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).r(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (getI1().b == activity) {
            xpi.o(this);
            for (b8 b8Var : xpi.j(this)) {
                Bundle bundle2 = new Bundle();
                b8Var.P(bundle2);
                StringBuilder sb = new StringBuilder("LifecycleHandler.routerState");
                ViewGroup viewGroup = b8Var.i;
                sb.append(viewGroup != null ? viewGroup.getId() : 0);
                bundle.putBundle(sb.toString(), bundle2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (getI1().b == activity) {
            getI1().f = false;
            Iterator it = xpi.j(this).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).s(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (getI1().b == activity) {
            xpi.o(this);
            Iterator it = xpi.j(this).iterator();
            while (it.hasNext()) {
                ((b8) it.next()).t(activity);
            }
        }
    }

    /* renamed from: s0, reason: from getter */
    public final d48 getI1() {
        return this.i1;
    }

    public final void t0(int i, String str) {
        getI1().h.put(i, str);
    }

    public final void u0(Activity activity) {
        getI1().b = activity;
        if (getI1().c) {
            return;
        }
        getI1().c = true;
        activity.getApplication().registerActivityLifecycleCallbacks(this);
        e48.a.put(activity, this);
    }

    public final void v0(String str, Intent intent, int i, Bundle bundle) {
        t0(i, str);
        r0(intent, i, bundle);
    }
}

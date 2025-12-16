package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.b;
import defpackage.cj6;
import defpackage.ei6;
import defpackage.fl3;
import defpackage.gl3;
import defpackage.ju3;
import defpackage.k38;
import defpackage.l38;
import defpackage.l48;
import defpackage.nl3;
import defpackage.pn;
import defpackage.ti6;
import defpackage.y6i;

/* loaded from: classes.dex */
public abstract class b extends nl3 {
    public boolean F0;
    public boolean G0;
    public final y6i D0 = new y6i(17, new ei6(this));
    public final l48 E0 = new l48(this);
    public boolean H0 = true;

    public b() {
        ((pn) this.d.d).f("android:support:lifecycle", new fl3(this, 1));
        final int i = 0;
        s(new ju3(this) { // from class: di6
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.ju3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.b.D0.v();
                        break;
                    default:
                        this.b.D0.v();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.u0.add(new ju3(this) { // from class: di6
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.ju3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.D0.v();
                        break;
                    default:
                        this.b.D0.v();
                        break;
                }
            }
        });
        t(new gl3(this, 1));
    }

    public static boolean A(c cVar) {
        boolean zA = false;
        for (a aVar : cVar.c.f()) {
            if (aVar != null) {
                ei6 ei6Var = aVar.E0;
                if ((ei6Var == null ? null : ei6Var.Y) != null) {
                    zA |= A(aVar.u());
                }
                cj6 cj6Var = aVar.b1;
                l38 l38Var = l38.c;
                l38 l38Var2 = l38.d;
                if (cj6Var != null) {
                    cj6Var.b();
                    if (cj6Var.o.d.a(l38Var2)) {
                        aVar.b1.o.g(l38Var);
                        zA = true;
                    }
                }
                if (aVar.a1.d.a(l38Var2)) {
                    aVar.a1.g(l38Var);
                    zA = true;
                }
            }
        }
        return zA;
    }

    public void B() {
        this.E0.d(k38.ON_RESUME);
        ti6 ti6Var = ((ei6) this.D0.b).X;
        ti6Var.H = false;
        ti6Var.I = false;
        ti6Var.O.g = false;
        ti6Var.u(7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        /*
            r3 = this;
            super.dump(r4, r5, r6, r7)
            if (r7 == 0) goto L56
            int r0 = r7.length
            if (r0 != 0) goto L9
            goto L56
        L9:
            r0 = 0
            r0 = r7[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L46;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1d;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L56
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55
            goto L56
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            goto L56
        L26:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L56
            goto L55
        L2d:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L56
        L36:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L56
        L3f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L56
            goto L55
        L46:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L56
        L4f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L56
        L55:
            return
        L56:
            r6.print(r4)
            java.lang.String r0 = "Local FragmentActivity "
            r6.print(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6.print(r0)
            java.lang.String r0 = " State:"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            java.lang.String r1 = "mCreated="
            r6.print(r1)
            boolean r1 = r3.F0
            r6.print(r1)
            java.lang.String r1 = " mResumed="
            r6.print(r1)
            boolean r1 = r3.G0
            r6.print(r1)
            java.lang.String r1 = " mStopped="
            r6.print(r1)
            boolean r1 = r3.H0
            r6.print(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto Lb2
            androidx.loader.app.b r1 = new androidx.loader.app.b
            fgh r2 = r3.h()
            r1.<init>(r3, r2)
            r1.a(r0, r6)
        Lb2:
            y6i r0 = r3.D0
            java.lang.Object r0 = r0.b
            ei6 r0 = (defpackage.ei6) r0
            ti6 r0 = r0.X
            r0.v(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.nl3, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.D0.v();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.nl3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E0.d(k38.ON_CREATE);
        ti6 ti6Var = ((ei6) this.D0.b).X;
        ti6Var.H = false;
        ti6Var.I = false;
        ti6Var.O.g = false;
        ti6Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((ei6) this.D0.b).X.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ei6) this.D0.b).X.l();
        this.E0.d(k38.ON_DESTROY);
    }

    @Override // defpackage.nl3, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ei6) this.D0.b).X.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.G0 = false;
        ((ei6) this.D0.b).X.u(5);
        this.E0.d(k38.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        B();
    }

    @Override // defpackage.nl3, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.D0.v();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        y6i y6iVar = this.D0;
        y6iVar.v();
        super.onResume();
        this.G0 = true;
        ((ei6) y6iVar.b).X.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        y6i y6iVar = this.D0;
        y6iVar.v();
        ei6 ei6Var = (ei6) y6iVar.b;
        super.onStart();
        this.H0 = false;
        if (!this.F0) {
            this.F0 = true;
            ti6 ti6Var = ei6Var.X;
            ti6Var.H = false;
            ti6Var.I = false;
            ti6Var.O.g = false;
            ti6Var.u(4);
        }
        ei6Var.X.z(true);
        this.E0.d(k38.ON_START);
        ti6 ti6Var2 = ei6Var.X;
        ti6Var2.H = false;
        ti6Var2.I = false;
        ti6Var2.O.g = false;
        ti6Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.D0.v();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.H0 = true;
        while (A(z())) {
        }
        ti6 ti6Var = ((ei6) this.D0.b).X;
        ti6Var.I = true;
        ti6Var.O.g = true;
        ti6Var.u(4);
        this.E0.d(k38.ON_STOP);
    }

    public final ti6 z() {
        return ((ei6) this.D0.b).X;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((ei6) this.D0.b).X.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}

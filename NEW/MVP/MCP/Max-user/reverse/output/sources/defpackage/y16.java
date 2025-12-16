package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class y16 {
    public final /* synthetic */ int a;
    public final SparseBooleanArray b;
    public boolean c;

    public y16(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SparseBooleanArray();
                break;
            default:
                this.b = new SparseBooleanArray();
                break;
        }
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                fsi.d(!this.c);
                this.b.append(i, true);
                break;
            default:
                hsi.g(!this.c);
                this.b.append(i, true);
                break;
        }
    }

    public void b(a26 a26Var) {
        for (int i = 0; i < a26Var.a.size(); i++) {
            a(a26Var.b(i));
        }
    }

    public void c(int... iArr) {
        for (int i : iArr) {
            a(i);
        }
    }

    public z16 d() {
        fsi.d(!this.c);
        this.c = true;
        return new z16(this.b);
    }

    public a26 e() {
        hsi.g(!this.c);
        this.c = true;
        return new a26(this.b);
    }
}

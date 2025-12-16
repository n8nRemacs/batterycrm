package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ay5 extends c2 {
    public final /* synthetic */ int c = 1;
    public final ArrayDeque d;
    public final /* synthetic */ zde o;

    public ay5(cy5 cy5Var) {
        this.o = cy5Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        File file = cy5Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new yx5(file));
        } else {
            this.a = 2;
        }
    }

    @Override // defpackage.c2
    public final void a() {
        File file;
        File fileA;
        Object obj;
        Object objA;
        switch (this.c) {
            case 0:
                break;
            default:
                b26 b26Var = (b26) this.o;
                while (true) {
                    ArrayDeque arrayDeque = this.d;
                    sig sigVar = (sig) arrayDeque.peek();
                    if (sigVar == null) {
                        obj = null;
                    } else {
                        Object obj2 = sigVar.a;
                        objA = sigVar.a();
                        if (objA == null) {
                            arrayDeque.pop();
                        } else if (objA != obj2 && b26Var.c.invoke(objA) != null && arrayDeque.size() < Integer.MAX_VALUE) {
                            arrayDeque.push(c(objA));
                        }
                    }
                }
                obj = objA;
                if (obj == null) {
                    this.a = 2;
                    return;
                } else {
                    this.b = obj;
                    this.a = 1;
                    return;
                }
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.d;
            by5 by5Var = (by5) arrayDeque2.peek();
            if (by5Var == null) {
                file = null;
            } else {
                fileA = by5Var.a();
                if (fileA == null) {
                    arrayDeque2.pop();
                } else if (!fileA.equals(by5Var.a) && fileA.isDirectory() && arrayDeque2.size() < Integer.MAX_VALUE) {
                    arrayDeque2.push(b(fileA));
                }
            }
        }
        file = fileA;
        if (file == null) {
            this.a = 2;
        } else {
            this.b = file;
            this.a = 1;
        }
    }

    public wx5 b(File file) {
        int iV = az1.v(((cy5) this.o).b);
        if (iV == 0) {
            return new zx5(file);
        }
        if (iV == 1) {
            return new xx5(file);
        }
        throw new NoWhenBranchMatchedException();
    }

    public nig c(Object obj) {
        int iV = az1.v(1);
        if (iV == 0) {
            return new rig(this, obj);
        }
        if (iV == 1) {
            return new oig(this, obj);
        }
        if (iV == 2) {
            return new pig(this, obj);
        }
        throw new NoWhenBranchMatchedException();
    }

    public ay5(b26 b26Var) {
        this.o = b26Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        em6 em6Var = b26Var.c;
        Object obj = b26Var.b;
        if (em6Var.invoke(obj) != null) {
            arrayDeque.push(c(obj));
        } else {
            arrayDeque.push(new qig(this, obj));
        }
    }
}

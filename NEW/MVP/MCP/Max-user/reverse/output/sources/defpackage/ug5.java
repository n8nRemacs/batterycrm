package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ug5 extends j3 {
    public final int A(Object obj) {
        vk6 vk6VarA = a();
        try {
            z(vk6VarA, obj);
            return vk6VarA.w();
        } finally {
            r(vk6VarA);
        }
    }

    public final void B(Iterable iterable) {
        vk6 vk6VarA = a();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                z(vk6VarA, it.next());
                vk6VarA.w();
            }
        } finally {
            r(vk6VarA);
        }
    }

    public abstract void z(vk6 vk6Var, Object obj);
}

package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class vg5 extends j3 {
    public final void A(Iterable iterable) {
        vk6 vk6VarA = a();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                z(vk6VarA, it.next());
                vk6VarA.l();
            }
        } finally {
            r(vk6VarA);
        }
    }

    public final void B(Object obj) {
        vk6 vk6VarA = a();
        try {
            z(vk6VarA, obj);
            vk6VarA.l();
        } finally {
            r(vk6VarA);
        }
    }

    public final long C(Object obj) {
        vk6 vk6VarA = a();
        try {
            z(vk6VarA, obj);
            return vk6VarA.l();
        } finally {
            r(vk6VarA);
        }
    }

    public abstract void z(vk6 vk6Var, Object obj);
}

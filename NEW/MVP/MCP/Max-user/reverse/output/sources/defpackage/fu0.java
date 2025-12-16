package defpackage;

import java.util.LinkedList;

/* loaded from: classes.dex */
public class fu0 {
    public final int a;
    public final int b;
    public final LinkedList c;
    public int d;

    public fu0(int i, int i2, int i3) {
        l5j.f(i > 0);
        l5j.f(i2 >= 0);
        l5j.f(i3 >= 0);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.d = i3;
    }

    public void a(Object obj) {
        this.c.add(obj);
    }

    public Object b() {
        return this.c.poll();
    }
}

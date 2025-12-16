package defpackage;

import ru.ok.tamtam.shared.lifecycle.AlreadyHandledEventException;

/* loaded from: classes2.dex */
public class yh5 {
    public final Object a;
    public boolean b;

    public yh5(Object obj) {
        this.a = obj;
        System.currentTimeMillis();
    }

    public final Object a() {
        if (this.b) {
            return new ipd(new AlreadyHandledEventException());
        }
        this.b = true;
        return this.a;
    }
}

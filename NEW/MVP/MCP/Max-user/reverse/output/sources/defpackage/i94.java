package defpackage;

import ru.ok.tracer.minidump.Minidump;

/* loaded from: classes2.dex */
public final class i94 implements ieg {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public i94(v17 v17Var) {
        boolean z;
        try {
            Minidump minidump = Minidump.c;
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        this.a = z;
        this.b = true;
        this.c = 10;
        this.d = 65536;
    }

    @Override // defpackage.ieg
    public final nme a() {
        return dwa.b;
    }
}

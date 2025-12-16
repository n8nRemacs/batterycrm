package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class sbd extends qod {
    public final String a;
    public final long b;
    public final jbd c;

    public sbd(String str, long j, jbd jbdVar) {
        this.a = str;
        this.b = j;
        this.c = jbdVar;
    }

    @Override // defpackage.qod
    public final wv0 P() {
        return this.c;
    }

    @Override // defpackage.qod
    public final long w() {
        return this.b;
    }

    @Override // defpackage.qod
    public final ua9 y() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        Pattern pattern = ua9.d;
        try {
            return ivi.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}

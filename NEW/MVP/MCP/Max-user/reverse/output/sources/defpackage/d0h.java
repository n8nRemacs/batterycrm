package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class d0h {
    static {
        Pattern.compile("[-_./;:]");
    }

    public static final void a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}

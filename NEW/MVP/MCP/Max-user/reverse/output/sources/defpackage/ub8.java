package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ub8 {
    public static final AtomicLong c = new AtomicLong();
    public final ze4 a;
    public final long b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ub8(ze4 ze4Var) {
        this(ze4Var, 0L, 0L);
        Uri uri = ze4Var.a;
        Map map = Collections.EMPTY_MAP;
    }

    public ub8(ze4 ze4Var, long j, long j2) {
        this.a = ze4Var;
        this.b = j;
    }
}

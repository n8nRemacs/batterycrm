package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class tb8 {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final ye4 b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public tb8(long j, ye4 ye4Var, long j2) {
        this(j, ye4Var, ye4Var.a, Collections.EMPTY_MAP, j2, 0L, 0L);
    }

    public tb8(long j, ye4 ye4Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = j;
        this.b = ye4Var;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}

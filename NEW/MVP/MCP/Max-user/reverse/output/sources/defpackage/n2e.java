package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class n2e {
    public final y6d b;
    public final y6i c;
    public ae4 d;
    public final wpb e;
    public p8i g;
    public volatile Set h;
    public final y8g i;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile boolean f = false;

    public n2e(y6d y6dVar, y6i y6iVar, Future future, wpb wpbVar, y8g y8gVar) {
        this.b = y6dVar;
        this.c = y6iVar;
        this.e = wpbVar;
        this.i = y8gVar;
    }
}

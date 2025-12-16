package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class kud {
    public final String a;
    public final y6d b;
    public final AtomicLong c = new AtomicLong(1);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public kud(y6d y6dVar) {
        if (y6dVar == null) {
            throw new IllegalArgumentException("Illegal 'logger' value: null");
        }
        this.a = "RtcCommands";
        this.b = y6dVar;
    }
}

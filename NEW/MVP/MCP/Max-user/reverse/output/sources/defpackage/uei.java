package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;

/* loaded from: classes.dex */
public abstract class uei {
    public static final lc3 a = new lc3(null, null, null);
    public static lc3 b;

    public static final boolean a(String str) {
        return (str.equals(HttpGet.METHOD_NAME) || str.equals(HttpHead.METHOD_NAME)) ? false : true;
    }

    public static final void b(y8g y8gVar, long j) {
        if (y8gVar instanceof z8g) {
            z8g z8gVar = (z8g) y8gVar;
            synchronized (z8gVar) {
                if (j != 0) {
                    if (z8gVar.a == null) {
                        z8gVar.a = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j));
                        z8gVar.b = Long.valueOf(SystemClock.elapsedRealtime());
                    }
                }
            }
        }
    }
}

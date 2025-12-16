package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class lb7 {
    public static final Pattern h = Pattern.compile(".*typ (host|prflx|srflx|relay+).*");
    public static final Pattern i = Pattern.compile(".*transport=(tcp|udp).*");
    public static final Pattern j = Pattern.compile(".*(?:tcp|udp) \\d+ (\\S+).*");
    public final b7d a;
    public final y6d b;
    public long d;
    public long e;
    public String g;
    public boolean f = false;
    public final HashMap c = new HashMap();

    public lb7(y6d y6dVar, b7d b7dVar) {
        this.a = b7dVar;
        this.b = y6dVar;
        for (q9i q9iVar : q9i.values()) {
            this.c.put(q9iVar, 0);
        }
    }

    public final void a(boolean z) {
        if (this.e == 0 || this.f) {
            return;
        }
        this.f = true;
        HashMap map = new HashMap();
        String str = this.g;
        if (str == null) {
            str = "direct";
            this.g = "direct";
        }
        StringBuilder sbO = ho7.o(str, ":");
        sbO.append(z ? SystemClock.elapsedRealtime() - this.e : -1L);
        map.put("param", sbO.toString());
        this.a.log(b7d.COLLECTOR_VIDEO, "callCandidatesApply", map);
    }
}

package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class xeg {
    public static final xeg a = new xeg();
    public static volatile weg b = b6a.A0;

    public static void a(long j, imb... imbVarArr) {
        String str;
        switch (bqg.$EnumSwitchMapping$0[TimeUnit.NANOSECONDS.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "us";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String str2 = str;
        Map mapJ = to8.j((imb[]) Arrays.copyOf(imbVarArr, imbVarArr.length));
        weg wegVar = b;
        if (wegVar.equals(b6a.A0) || wegVar.equals(v1a.z0)) {
            return;
        }
        int i = 25;
        afg.a(new bee(i, new kqb((SystemClock.elapsedRealtimeNanos() + h7c.a) - h7c.b, "app_creation_duration", j, str2, mapJ)));
    }
}

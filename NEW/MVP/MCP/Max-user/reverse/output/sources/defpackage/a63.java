package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class a63 extends i3 {
    public static final a63 c = new a63(11);

    public static Uri L0(a63 a63Var, long j, String str, Long l, Long l2, List list, String str2, int i) {
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str3 = (i & 32) == 0 ? str2 : null;
        boolean z = (i & 256) == 0;
        a63Var.getClass();
        hi4 hi4Var = new hi4();
        hi4Var.a = ":chats";
        hi4Var.c(Long.valueOf(j), "id");
        hi4Var.c(str, "type");
        if (z) {
            hi4Var.c(Boolean.TRUE, "no_anim");
        }
        if (l3 != null) {
            hi4Var.c(Long.valueOf(l3.longValue()), "message_id");
        }
        if (l4 != null) {
            hi4Var.c(Long.valueOf(l4.longValue()), "load_mark");
        }
        if (list2 != null) {
            hi4Var.b.add("highlights=".concat(ue3.N(list2, ",", null, null, null, 62)));
        }
        if (str3 != null) {
            hi4Var.c(str3, ApiProtocol.PARAM_PAYLOAD);
        }
        return hi4Var.a();
    }

    public static ei4 M0(a63 a63Var, long j) {
        a63Var.getClass();
        hi4 hi4Var = new hi4();
        hi4Var.a = ":chats";
        hi4Var.c(Long.valueOf(j), "id");
        hi4Var.c("local", "type");
        return new ei4(hi4Var.b());
    }

    public static void N0(a63 a63Var, long j, String str, Long l, Long l2, List list, String str2, int i) throws IOException {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        a63Var.getClass();
        a63Var.p0().c(L0(a63Var, j, str, l, l2, list, str2, 320), null);
    }

    public static ei4 O0(a63 a63Var, long j, ukh ukhVar, String str, Long l, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        int i2 = (i & 8) != 0 ? 0 : HttpStatus.SC_SWITCHING_PROTOCOLS;
        if ((i & 16) != 0) {
            l = null;
        }
        a63Var.getClass();
        StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
        sb.append(j);
        sb.append("&entry_point=");
        sb.append(ukhVar.a);
        if (i2 != 0) {
            sb.append("&request_code=");
            sb.append(i2);
        }
        if (str != null && str.length() != 0) {
            sb.append("&start_param=");
            sb.append(str);
        }
        if (l != null) {
            sb.append("&source_id=");
            sb.append(l.longValue());
        }
        return new ei4(sb.toString());
    }
}

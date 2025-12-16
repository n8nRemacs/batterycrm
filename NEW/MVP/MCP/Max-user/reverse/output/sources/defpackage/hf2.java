package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class hf2 {
    public static final hf2 h;
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    static {
        List listAsList = Arrays.asList(ef2.a, ef2.b, ef2.c);
        gf2 gf2Var = new gf2();
        gf2Var.a = 0L;
        gf2Var.c = 0L;
        gf2Var.d = 0L;
        gf2Var.b = listAsList;
        gf2Var.f = 0L;
        gf2Var.g = 0L;
        h = new hf2(gf2Var);
    }

    public hf2(gf2 gf2Var) {
        this.a = gf2Var.a;
        List list = gf2Var.b;
        this.b = list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
        this.c = gf2Var.c;
        this.d = gf2Var.d;
        this.e = gf2Var.e;
        this.f = gf2Var.f;
        this.g = gf2Var.g;
    }

    public final gf2 a() {
        gf2 gf2Var = new gf2();
        gf2Var.a = this.a;
        gf2Var.b = new ArrayList(this.b);
        gf2Var.c = this.c;
        gf2Var.d = this.d;
        gf2Var.e = this.e;
        gf2Var.f = this.f;
        gf2Var.g = this.g;
        return gf2Var;
    }

    public final String toString() throws IOException {
        String string;
        StringBuilder sb = new StringBuilder("ChatSettings{dontDisturbUntil=");
        sb.append(this.a);
        sb.append(", options=");
        List list = this.b;
        if (list == null) {
            string = "[]";
        } else {
            wm7 wm7Var = new wm7(10);
            StringBuilder sb2 = new StringBuilder();
            ue3.L(list, sb2, ",", "[", "]", -1, "...", wm7Var);
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(", lastNotifMark=");
        sb.append(this.c);
        sb.append(", lastNotifMessageId=");
        sb.append(this.d);
        sb.append(", favoriteIndex=");
        sb.append(this.e);
        sb.append(", hideMyLiveLocationPanelBeforeTime=");
        sb.append(this.f);
        sb.append(", hideLiveLocationPanelBeforeTime=");
        return utb.l(sb, this.g, '}');
    }
}

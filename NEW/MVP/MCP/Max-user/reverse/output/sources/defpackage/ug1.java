package defpackage;

import android.content.Intent;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class ug1 extends i3 {
    public static final ug1 c = new ug1(11);

    public static void L0(ug1 ug1Var, int i) {
        String str;
        char c2 = (i & 1) != 0 ? (char) 0 : (char) 1;
        boolean z = (i & 2) == 0;
        ii4 ii4VarP0 = ug1Var.p0();
        if (c2 == 0) {
            str = null;
        } else if (c2 == 1) {
            str = "PIP";
        } else if (c2 == 2) {
            str = "FIRST";
        } else if (c2 == 3) {
            str = "OTHER";
        } else {
            if (c2 != 4) {
                throw null;
            }
            str = "GLOBAL_PIP";
        }
        if (str == null) {
            str = "";
        }
        ii4VarP0.b(":call-active?place=" + str + "&replace_top=" + z, null);
    }

    public static ei4 M0(ug1 ug1Var, long j) {
        ug1Var.getClass();
        return new ei4(":profile?id=" + j + "&type=local_chat");
    }

    public final void N0(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        p0().b(":chats/share", gwi.b(new imb("oneme:share:data", intent), new imb("oneme:share:title", str2), new imb("tag", str3)));
    }
}

package defpackage;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class qr9 extends i3 {
    public static final qr9 c = new qr9(11);

    public static ei4 L0(List list, boolean z) throws IOException {
        return new ei4(":chats/forward?messages_ids=" + ue3.N(list, ",", null, null, null, 62) + "&show_ext_sharing=" + z);
    }

    public static ei4 M0(qr9 qr9Var, long j, String str, Boolean bool, Long l, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        qr9Var.getClass();
        return i3.C0(new j03(j, str, bool, l));
    }

    public static ei4 O0(long j, long j2, String str, o05 o05Var) {
        int iOrdinal = o05Var.ordinal();
        StringBuilder sbL = az1.l(j, ":dialogs/share-media?msg_id=", "&attach_id=");
        hf3.e(j2, "&local_attach_id=", str, sbL);
        sbL.append("&cause_ordinal=");
        sbL.append(iOrdinal);
        return new ei4(sbL.toString());
    }

    public static ei4 P0(long j, ukh ukhVar, Long l, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(a9h.e(":webapp:root?bot_id=", j, "&entry_point=", ukhVar.a));
        if (l != null) {
            sb.append("&source_id=" + l);
        }
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new ei4(sb.toString());
    }

    public final ei4 N0(long j) {
        return new ei4(a9h.d(j, ":profile?id=", "&type=contact"));
    }
}

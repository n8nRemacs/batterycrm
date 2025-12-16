package defpackage;

/* loaded from: classes.dex */
public final class ca1 extends i3 {
    public static final ca1 c = new ca1(11);

    public final void L0(Long l, String str, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(":call-history-info?is_link_call=true");
        ca1 ca1Var = c;
        if (str != null) {
            ca1Var.getClass();
            sb.append("&call_link=".concat(str));
        }
        if (charSequence != null) {
            ca1Var.getClass();
            sb.append("&call_title=" + ((Object) charSequence));
        }
        if (l != null) {
            ca1Var.getClass();
            sb.append("&call_chat_id=" + l);
        }
        p0().b(sb.toString(), null);
    }

    public final void M0(long j, long j2) {
        p0().b(ho7.k(az1.l(j, ":chats?id=", "&type=local&message_id="), j2, "&highlight_message=true"), null);
    }
}

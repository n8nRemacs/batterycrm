package defpackage;

import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class ag8 {
    public static final ag8 X;
    public static final ag8 Y;
    public static final ag8 Z;
    public static final ag8 c;
    public static final ag8 d;
    public static final ag8 o;
    public static final ag8 s0;
    public static final /* synthetic */ ag8[] t0;
    public final String a;
    public final lg8 b;

    static {
        ag8 ag8Var = new ag8("SEND", 0, "send");
        c = ag8Var;
        lg8 lg8Var = lg8.Y;
        ag8 ag8Var2 = new ag8("EXCEPTION", 1, "exception", lg8Var);
        d = ag8Var2;
        ag8 ag8Var3 = new ag8("SEND_ACK", 2, "send_ack");
        o = ag8Var3;
        ag8 ag8Var4 = new ag8("QUEUE", 3, "queue");
        X = ag8Var4;
        ag8 ag8Var5 = new ag8("ERROR", 4, NegotiationErrorStat.KEY_ERROR, lg8Var);
        Y = ag8Var5;
        ag8 ag8Var6 = new ag8("RECEIVE", 5, "receive");
        Z = ag8Var6;
        ag8 ag8Var7 = new ag8("NOTIF", 6, "notif");
        s0 = ag8Var7;
        t0 = new ag8[]{ag8Var, ag8Var2, ag8Var3, ag8Var4, ag8Var5, ag8Var6, ag8Var7};
    }

    public ag8(String str, int i, String str2, lg8 lg8Var) {
        this.a = str2;
        this.b = lg8Var;
    }

    public static ag8 valueOf(String str) {
        return (ag8) Enum.valueOf(ag8.class, str);
    }

    public static ag8[] values() {
        return (ag8[]) t0.clone();
    }

    public /* synthetic */ ag8(String str, int i, String str2) {
        this(str, i, str2, lg8.d);
    }
}

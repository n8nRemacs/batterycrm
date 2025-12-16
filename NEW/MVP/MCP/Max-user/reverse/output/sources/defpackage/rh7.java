package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rh7 {
    public static final rh7 X;
    public static final rh7 Y;
    public static final rh7 Z;
    public static final rh7 b;
    public static final rh7 c;
    public static final rh7 d;
    public static final rh7 o;
    public static final rh7 s0;
    public static final /* synthetic */ rh7[] t0;
    public static final /* synthetic */ zg5 u0;
    public final String a;

    static {
        rh7 rh7Var = new rh7("SEND_5_MESSAGES", 0, "messageSent");
        b = rh7Var;
        rh7 rh7Var2 = new rh7("CREATE_FOLDER", 1, "folderCreated");
        c = rh7Var2;
        rh7 rh7Var3 = new rh7("SEND_AUDIO_MESSAGE", 2, "voiceMessageSent");
        d = rh7Var3;
        rh7 rh7Var4 = new rh7("ADD_2_REACTIONS", 3, "reactionSet");
        o = rh7Var4;
        rh7 rh7Var5 = new rh7("SEND_3_STICKERS", 4, "stickerSent");
        X = rh7Var5;
        rh7 rh7Var6 = new rh7("CREATE_2_GROUP_CHATS", 5, "groupChatCreated");
        Y = rh7Var6;
        rh7 rh7Var7 = new rh7("MADE_2_PIN", 6, "pinMade");
        Z = rh7Var7;
        rh7 rh7Var8 = new rh7("PARTICIPATED_IN_CALL", 7, "callMade");
        s0 = rh7Var8;
        rh7[] rh7VarArr = {rh7Var, rh7Var2, rh7Var3, rh7Var4, rh7Var5, rh7Var6, rh7Var7, rh7Var8};
        t0 = rh7VarArr;
        u0 = new zg5(rh7VarArr);
    }

    public rh7(String str, int i, String str2) {
        this.a = str2;
    }

    public static rh7 valueOf(String str) {
        return (rh7) Enum.valueOf(rh7.class, str);
    }

    public static rh7[] values() {
        return (rh7[]) t0.clone();
    }
}

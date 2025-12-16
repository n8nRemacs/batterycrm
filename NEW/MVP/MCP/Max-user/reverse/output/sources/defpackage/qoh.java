package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qoh implements psh {
    public static final qoh a;
    public static final /* synthetic */ qoh[] b;
    public static final /* synthetic */ zg5 c;

    static {
        qoh qohVar = new qoh("CHANGE_SCREEN_BRIGHTNESS", 0);
        a = qohVar;
        qoh[] qohVarArr = {qohVar};
        b = qohVarArr;
        c = new zg5(qohVarArr);
    }

    public static qoh valueOf(String str) {
        return (qoh) Enum.valueOf(qoh.class, str);
    }

    public static qoh[] values() {
        return (qoh[]) b.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return null;
    }

    @Override // defpackage.psh
    public final String c() {
        return "WebAppChangeScreenBrightness";
    }

    @Override // defpackage.psh
    public final String d() {
        return "change_screen_brightness";
    }
}

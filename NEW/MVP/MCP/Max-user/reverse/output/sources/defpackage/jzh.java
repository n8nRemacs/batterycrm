package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jzh implements psh {
    public static final /* synthetic */ jzh[] X;
    public static final /* synthetic */ zg5 Y;
    public static final jzh c;
    public static final jzh d;
    public static final jzh o;
    public final String a;
    public final String b;

    static {
        jzh jzhVar = new jzh("READY", 0, "WebAppReady", "ready");
        jzh jzhVar2 = new jzh("CLOSE", 1, "WebAppClose", "close");
        jzh jzhVar3 = new jzh("SETUP_BACK_BUTTON", 2, "WebAppSetupBackButton", "setup_back_button");
        c = jzhVar3;
        jzh jzhVar4 = new jzh("SETUP_CLOSING_BEHAVIOUR", 3, "WebAppSetupClosingBehavior", "setup_closing_behaviour");
        d = jzhVar4;
        jzh jzhVar5 = new jzh("ON_CLICK_BACK", 4, "WebAppBackButtonPressed", "back_button_pressed");
        jzh jzhVar6 = new jzh("SETUP_SCREEN_CAPTURE_BEHAVIOR", 5, "WebAppSetupScreenCaptureBehavior", "setup_screen_capture_behavior");
        o = jzhVar6;
        jzh[] jzhVarArr = {jzhVar, jzhVar2, jzhVar3, jzhVar4, jzhVar5, jzhVar6};
        X = jzhVarArr;
        Y = new zg5(jzhVarArr);
    }

    public jzh(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static jzh valueOf(String str) {
        return (jzh) Enum.valueOf(jzh.class, str);
    }

    public static jzh[] values() {
        return (jzh[]) X.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return null;
    }

    @Override // defpackage.psh
    public final String c() {
        return this.a;
    }

    @Override // defpackage.psh
    public final String d() {
        return this.b;
    }
}

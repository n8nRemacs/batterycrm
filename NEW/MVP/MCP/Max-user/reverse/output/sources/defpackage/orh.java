package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class orh implements psh {
    public static final orh X;
    public static final /* synthetic */ orh[] Y;
    public static final /* synthetic */ zg5 Z;
    public static final orh d;
    public static final orh o;
    public final String a;
    public final String b;
    public final Integer c;

    static {
        orh orhVar = new orh("HAPTIC_FEEDBACK_IMPACT", 0, "WebAppHapticFeedbackImpact", "haptic_feedback_impact", 8);
        d = orhVar;
        orh orhVar2 = new orh("HAPTIC_FEEDBACK_NOTIFICATION", 1, "WebAppHapticFeedbackNotification", "haptic_feedback_notification", 20);
        o = orhVar2;
        orh orhVar3 = new orh("HAPTIC_FEEDBACK_SELECTION_CHANGE", 2, "WebAppHapticFeedbackSelectionChange", "haptic_feedback_selection_change", 16);
        X = orhVar3;
        orh[] orhVarArr = {orhVar, orhVar2, orhVar3};
        Y = orhVarArr;
        Z = new zg5(orhVarArr);
    }

    public orh(String str, int i, String str2, String str3, Integer num) {
        this.a = str2;
        this.b = str3;
        this.c = num;
    }

    public static orh valueOf(String str) {
        return (orh) Enum.valueOf(orh.class, str);
    }

    public static orh[] values() {
        return (orh[]) Y.clone();
    }

    @Override // defpackage.psh
    public final Integer a() {
        return this.c;
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

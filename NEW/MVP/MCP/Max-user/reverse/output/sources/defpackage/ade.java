package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ade {
    public static final ade a;
    public static final ade b;
    public static final ade c;
    public static final /* synthetic */ ade[] d;

    static {
        ade adeVar = new ade("HideKeyboard", 0);
        a = adeVar;
        ade adeVar2 = new ade("SendMessage", 1);
        b = adeVar2;
        ade adeVar3 = new ade("SendMessageWithDisabling", 2);
        c = adeVar3;
        d = new ade[]{adeVar, adeVar2, adeVar3};
    }

    public static ade valueOf(String str) {
        return (ade) Enum.valueOf(ade.class, str);
    }

    public static ade[] values() {
        return (ade[]) d.clone();
    }
}

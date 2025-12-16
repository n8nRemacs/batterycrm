package defpackage;

import kotlin.NoWhenBranchMatchedException;
import org.webrtc.SessionDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jda {
    public static final jda X;
    public static final jda Y;
    public static final jda Z;
    public static final jda a;
    public static final jda b;
    public static final jda c;
    public static final jda d;
    public static final jda o;
    public static final jda s0;
    public static final jda t0;
    public static final /* synthetic */ jda[] u0;

    static {
        jda jdaVar = new jda("CREATE_OFFER", 0);
        a = jdaVar;
        jda jdaVar2 = new jda("CREATE_ANSWER", 1);
        b = jdaVar2;
        jda jdaVar3 = new jda("SET_LOCAL_OFFER", 2);
        c = jdaVar3;
        jda jdaVar4 = new jda("SET_REMOTE_OFFER", 3);
        d = jdaVar4;
        jda jdaVar5 = new jda("SET_LOCAL_ANSWER", 4);
        o = jdaVar5;
        jda jdaVar6 = new jda("SET_REMOTE_ANSWER", 5);
        X = jdaVar6;
        jda jdaVar7 = new jda("SET_LOCAL_PRANSWER", 6);
        Y = jdaVar7;
        jda jdaVar8 = new jda("SET_REMOTE_PRANSWER", 7);
        Z = jdaVar8;
        jda jdaVar9 = new jda("SET_LOCAL_ROLLBACK", 8);
        s0 = jdaVar9;
        jda jdaVar10 = new jda("SET_REMOTE_ROLLBACK", 9);
        t0 = jdaVar10;
        u0 = new jda[]{jdaVar, jdaVar2, jdaVar3, jdaVar4, jdaVar5, jdaVar6, jdaVar7, jdaVar8, jdaVar9, jdaVar10};
    }

    public static final jda a(SessionDescription.Type type, boolean z) {
        int i = ida.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return z ? c : d;
        }
        if (i == 2) {
            return z ? Y : Z;
        }
        if (i == 3) {
            return z ? o : X;
        }
        if (i == 4) {
            return z ? s0 : t0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static jda valueOf(String str) {
        return (jda) Enum.valueOf(jda.class, str);
    }

    public static jda[] values() {
        return (jda[]) u0.clone();
    }
}

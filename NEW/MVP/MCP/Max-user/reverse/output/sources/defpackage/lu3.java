package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lu3 {
    public static final lu3 X;
    public static final lu3 Y;
    public static final lu3 Z;
    public static final lu3 a;
    public static final lu3 b;
    public static final lu3 c;
    public static final lu3 d;
    public static final lu3 o;
    public static final lu3 s0;
    public static final lu3 t0;
    public static final /* synthetic */ lu3[] u0;

    static {
        lu3 lu3Var = new lu3("OPEN_PROFILE", 0);
        a = lu3Var;
        lu3 lu3Var2 = new lu3("SHARE_CONTACT", 1);
        b = lu3Var2;
        lu3 lu3Var3 = new lu3("WRITE", 2);
        c = lu3Var3;
        lu3 lu3Var4 = new lu3("SELECT", 3);
        d = lu3Var4;
        lu3 lu3Var5 = new lu3("BLOCK", 4);
        o = lu3Var5;
        lu3 lu3Var6 = new lu3("UNBLOCK", 5);
        X = lu3Var6;
        lu3 lu3Var7 = new lu3(HttpDelete.METHOD_NAME, 6);
        Y = lu3Var7;
        lu3 lu3Var8 = new lu3("AUDIO_CALL", 7);
        Z = lu3Var8;
        lu3 lu3Var9 = new lu3("VIDEO_CALL", 8);
        s0 = lu3Var9;
        lu3 lu3Var10 = new lu3("SUSPEND", 9);
        t0 = lu3Var10;
        u0 = new lu3[]{lu3Var, lu3Var2, lu3Var3, lu3Var4, lu3Var5, lu3Var6, lu3Var7, lu3Var8, lu3Var9, lu3Var10};
    }

    public static lu3 valueOf(String str) {
        return (lu3) Enum.valueOf(lu3.class, str);
    }

    public static lu3[] values() {
        return (lu3[]) u0.clone();
    }
}

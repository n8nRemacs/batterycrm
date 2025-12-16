package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gh9 {
    public static final gh9 X;
    public static final gh9 Y;
    public static final gh9 Z;
    public static final gh9 a;
    public static final gh9 b;
    public static final gh9 c;
    public static final gh9 d;
    public static final gh9 o;
    public static final gh9 s0;
    public static final gh9 t0;
    public static final gh9 u0;
    public static final gh9 v0;
    public static final gh9 w0;
    public static final gh9 x0;
    public static final gh9 y0;
    public static final /* synthetic */ gh9[] z0;

    static {
        gh9 gh9Var = new gh9("FORWARD", 0);
        a = gh9Var;
        gh9 gh9Var2 = new gh9("COPY", 1);
        b = gh9Var2;
        gh9 gh9Var3 = new gh9("REPORT", 2);
        c = gh9Var3;
        gh9 gh9Var4 = new gh9("MARK_AS_UNREAD", 3);
        d = gh9Var4;
        gh9 gh9Var5 = new gh9("REPLY", 4);
        o = gh9Var5;
        gh9 gh9Var6 = new gh9(HttpDelete.METHOD_NAME, 5);
        X = gh9Var6;
        gh9 gh9Var7 = new gh9("DELETE_FOR_ALL", 6);
        Y = gh9Var7;
        gh9 gh9Var8 = new gh9("PIN", 7);
        Z = gh9Var8;
        gh9 gh9Var9 = new gh9("UNPIN", 8);
        s0 = gh9Var9;
        gh9 gh9Var10 = new gh9("SELECT", 9);
        t0 = gh9Var10;
        gh9 gh9Var11 = new gh9("EDIT", 10);
        u0 = gh9Var11;
        gh9 gh9Var12 = new gh9("SAVE_TO_GALLERY", 11);
        v0 = gh9Var12;
        gh9 gh9Var13 = new gh9("COPY_PHOTO", 12);
        w0 = gh9Var13;
        gh9 gh9Var14 = new gh9("SHARE_EXTERNAL", 13);
        x0 = gh9Var14;
        gh9 gh9Var15 = new gh9("SHARE_POST", 14);
        y0 = gh9Var15;
        z0 = new gh9[]{gh9Var, gh9Var2, gh9Var3, gh9Var4, gh9Var5, gh9Var6, gh9Var7, gh9Var8, gh9Var9, gh9Var10, gh9Var11, gh9Var12, gh9Var13, gh9Var14, gh9Var15};
    }

    public static gh9 valueOf(String str) {
        return (gh9) Enum.valueOf(gh9.class, str);
    }

    public static gh9[] values() {
        return (gh9[]) z0.clone();
    }
}

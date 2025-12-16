package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class da6 {
    public static final da6 A0;
    public static final da6 B0;
    public static final /* synthetic */ da6[] C0;
    public static final /* synthetic */ zg5 D0;
    public static final da6 X;
    public static final da6 Y;
    public static final da6 Z;
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final Set o;
    public static final da6 s0;
    public static final da6 t0;
    public static final da6 u0;
    public static final da6 v0;
    public static final da6 w0;
    public static final da6 x0;
    public static final da6 y0;
    public static final da6 z0;
    public final int a;

    static {
        da6 da6Var = new da6("UNREAD", 0, 0);
        X = da6Var;
        da6 da6Var2 = new da6("READ", 1, 1);
        da6 da6Var3 = new da6("CHANNEL", 2, 2);
        Y = da6Var3;
        da6 da6Var4 = new da6("CHAT", 3, 3);
        Z = da6Var4;
        da6 da6Var5 = new da6("DIALOG", 4, 4);
        s0 = da6Var5;
        da6 da6Var6 = new da6("OWNER", 5, 5);
        t0 = da6Var6;
        da6 da6Var7 = new da6("ADMIN", 6, 6);
        u0 = da6Var7;
        da6 da6Var8 = new da6("MUTED", 7, 7);
        v0 = da6Var8;
        da6 da6Var9 = new da6("CONTACT", 8, 8);
        w0 = da6Var9;
        da6 da6Var10 = new da6("NOT_CONTACT", 9, 9);
        x0 = da6Var10;
        da6 da6Var11 = new da6("BOT", 10, 10);
        y0 = da6Var11;
        da6 da6Var12 = new da6("NOT_MUTED", 11, 11);
        z0 = da6Var12;
        da6 da6Var13 = new da6("MARKED_UNREAD", 12, 12);
        A0 = da6Var13;
        da6 da6Var14 = new da6("ORG", 13, 13);
        B0 = da6Var14;
        da6[] da6VarArr = {da6Var, da6Var2, da6Var3, da6Var4, da6Var5, da6Var6, da6Var7, da6Var8, da6Var9, da6Var10, da6Var11, da6Var12, da6Var13, da6Var14};
        C0 = da6VarArr;
        D0 = new zg5(da6VarArr);
        b = gke.d(da6Var, da6Var8, da6Var12, da6Var13);
        c = gke.d(da6Var7, da6Var6);
        d = gke.d(da6Var9, da6Var10, da6Var4, da6Var3, da6Var11, da6Var14);
        o = Collections.unmodifiableSet(EnumSet.noneOf(da6.class));
    }

    public da6(String str, int i, int i2) {
        this.a = i2;
    }

    public static da6 valueOf(String str) {
        return (da6) Enum.valueOf(da6.class, str);
    }

    public static da6[] values() {
        return (da6[]) C0.clone();
    }
}

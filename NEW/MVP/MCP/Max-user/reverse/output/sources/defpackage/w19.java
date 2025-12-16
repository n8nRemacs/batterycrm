package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class w19 {
    public static final w19 K = new w19(new u19());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final wg7 J;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final g8d i;
    public final g8d j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        String str = zxg.a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        a0 = Integer.toString(16, 36);
        b0 = Integer.toString(17, 36);
        c0 = Integer.toString(18, 36);
        d0 = Integer.toString(19, 36);
        e0 = Integer.toString(20, 36);
        f0 = Integer.toString(21, 36);
        g0 = Integer.toString(22, 36);
        h0 = Integer.toString(23, 36);
        i0 = Integer.toString(24, 36);
        j0 = Integer.toString(25, 36);
        k0 = Integer.toString(26, 36);
        l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        n0 = Integer.toString(29, 36);
        o0 = Integer.toString(30, 36);
        p0 = Integer.toString(31, 36);
        q0 = Integer.toString(32, 36);
        r0 = Integer.toString(33, 36);
        s0 = Integer.toString(34, 36);
        t0 = Integer.toString(1000, 36);
    }

    public w19(u19 u19Var) {
        Boolean boolValueOf = u19Var.q;
        Integer numValueOf = u19Var.p;
        Integer numValueOf2 = u19Var.G;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                        case 13:
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                        case 16:
                        case LangUtils.HASH_SEED /* 17 */:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                numValueOf = Integer.valueOf(i2);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = u19Var.a;
        this.b = u19Var.b;
        this.c = u19Var.c;
        this.d = u19Var.d;
        this.e = u19Var.e;
        this.f = u19Var.f;
        this.g = u19Var.g;
        this.h = u19Var.h;
        this.i = u19Var.i;
        this.j = u19Var.j;
        this.k = u19Var.k;
        this.l = u19Var.l;
        this.m = u19Var.m;
        this.n = u19Var.n;
        this.o = u19Var.o;
        this.p = numValueOf;
        this.q = boolValueOf;
        this.r = u19Var.r;
        Integer num = u19Var.s;
        this.s = num;
        this.t = num;
        this.u = u19Var.t;
        this.v = u19Var.u;
        this.w = u19Var.v;
        this.x = u19Var.w;
        this.y = u19Var.x;
        this.z = u19Var.y;
        this.A = u19Var.z;
        this.B = u19Var.A;
        this.C = u19Var.B;
        this.D = u19Var.C;
        this.E = u19Var.D;
        this.F = u19Var.E;
        this.G = u19Var.F;
        this.H = numValueOf2;
        this.J = u19Var.I;
        this.I = u19Var.H;
    }

    public static w19 b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        u19 u19Var = new u19();
        u19Var.a = bundle.getCharSequence(L);
        u19Var.b = bundle.getCharSequence(M);
        u19Var.c = bundle.getCharSequence(N);
        u19Var.d = bundle.getCharSequence(O);
        u19Var.e = bundle.getCharSequence(P);
        u19Var.f = bundle.getCharSequence(Q);
        u19Var.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = n0;
        u19Var.b(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        u19Var.m = (Uri) bundle.getParcelable(V);
        u19Var.y = bundle.getCharSequence(g0);
        u19Var.z = bundle.getCharSequence(h0);
        u19Var.A = bundle.getCharSequence(i0);
        u19Var.D = bundle.getCharSequence(l0);
        u19Var.E = bundle.getCharSequence(m0);
        u19Var.F = bundle.getCharSequence(o0);
        u19Var.H = bundle.getBundle(t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            u19Var.i = g8d.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            u19Var.j = g8d.a(bundle2);
        }
        String str4 = r0;
        if (bundle.containsKey(str4)) {
            u19Var.c(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            u19Var.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            u19Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            u19Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = q0;
        if (bundle.containsKey(str8)) {
            u19Var.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            u19Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            u19Var.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            u19Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            u19Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            u19Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            u19Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            u19Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = j0;
        if (bundle.containsKey(str16)) {
            u19Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            u19Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = p0;
        if (bundle.containsKey(str18)) {
            u19Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(s0);
        if (stringArrayList != null) {
            u19Var.I = wg7.j(stringArrayList);
        }
        return new w19(u19Var);
    }

    public final u19 a() {
        u19 u19Var = new u19();
        u19Var.a = this.a;
        u19Var.b = this.b;
        u19Var.c = this.c;
        u19Var.d = this.d;
        u19Var.e = this.e;
        u19Var.f = this.f;
        u19Var.g = this.g;
        u19Var.h = this.h;
        u19Var.i = this.i;
        u19Var.j = this.j;
        u19Var.k = this.k;
        u19Var.l = this.l;
        u19Var.m = this.m;
        u19Var.n = this.n;
        u19Var.o = this.o;
        u19Var.p = this.p;
        u19Var.q = this.q;
        u19Var.r = this.r;
        u19Var.s = this.t;
        u19Var.t = this.u;
        u19Var.u = this.v;
        u19Var.v = this.w;
        u19Var.w = this.x;
        u19Var.x = this.y;
        u19Var.y = this.z;
        u19Var.z = this.A;
        u19Var.A = this.B;
        u19Var.B = this.C;
        u19Var.C = this.D;
        u19Var.D = this.E;
        u19Var.E = this.F;
        u19Var.F = this.G;
        u19Var.G = this.H;
        u19Var.I = this.J;
        u19Var.H = this.I;
        return u19Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(r0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(o0, charSequence13);
        }
        g8d g8dVar = this.i;
        if (g8dVar != null) {
            bundle.putBundle(S, g8dVar.c());
        }
        g8d g8dVar2 = this.j;
        if (g8dVar2 != null) {
            bundle.putBundle(T, g8dVar2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(q0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(a0, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(c0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(d0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(e0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(k0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(p0, num13.intValue());
        }
        wg7 wg7Var = this.J;
        if (!wg7Var.isEmpty()) {
            bundle.putStringArrayList(s0, new ArrayList<>(wg7Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w19.class == obj.getClass()) {
            w19 w19Var = (w19) obj;
            if (Objects.equals(this.a, w19Var.a) && Objects.equals(this.b, w19Var.b) && Objects.equals(this.c, w19Var.c) && Objects.equals(this.d, w19Var.d) && Objects.equals(this.e, w19Var.e) && Objects.equals(this.f, w19Var.f) && Objects.equals(this.g, w19Var.g) && Objects.equals(this.h, w19Var.h) && Objects.equals(this.i, w19Var.i) && Objects.equals(this.j, w19Var.j) && Arrays.equals(this.k, w19Var.k) && Objects.equals(this.l, w19Var.l) && Objects.equals(this.m, w19Var.m) && Objects.equals(this.n, w19Var.n) && Objects.equals(this.o, w19Var.o) && Objects.equals(this.p, w19Var.p) && Objects.equals(this.q, w19Var.q) && Objects.equals(this.r, w19Var.r) && Objects.equals(this.t, w19Var.t) && Objects.equals(this.u, w19Var.u) && Objects.equals(this.v, w19Var.v) && Objects.equals(this.w, w19Var.w) && Objects.equals(this.x, w19Var.x) && Objects.equals(this.y, w19Var.y) && Objects.equals(this.z, w19Var.z) && Objects.equals(this.A, w19Var.A) && Objects.equals(this.B, w19Var.B) && Objects.equals(this.C, w19Var.C) && Objects.equals(this.D, w19Var.D) && Objects.equals(this.E, w19Var.E) && Objects.equals(this.F, w19Var.F) && Objects.equals(this.G, w19Var.G) && Objects.equals(this.H, w19Var.H) && Objects.equals(this.J, w19Var.J)) {
                if ((this.I == null) == (w19Var.I == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null), this.J);
    }
}

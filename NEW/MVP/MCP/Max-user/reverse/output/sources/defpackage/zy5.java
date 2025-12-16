package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class zy5 implements t97 {
    public static final ua9 d;
    public static final ua9 e;
    public static final Pattern f;
    public final k18 a;
    public final bwf b;
    public final tgg c;

    static {
        ua9 ua9VarA;
        Pattern pattern = ua9.d;
        ua9 ua9VarA2 = null;
        try {
            ua9VarA = ivi.a("application/x-binary; charset=x-user-defined");
        } catch (IllegalArgumentException unused) {
            ua9VarA = null;
        }
        d = ua9VarA;
        try {
            ua9VarA2 = ivi.a("application/octet-stream");
        } catch (IllegalArgumentException unused2) {
        }
        e = ua9VarA2;
        try {
            ivi.a("multipart/form-data");
        } catch (IllegalArgumentException unused3) {
        }
        f = Pattern.compile("^([0-9]+)-([0-9]+)/([0-9]+)");
    }

    public zy5(k18 k18Var, tgg tggVar) {
        this.a = k18Var;
        this.c = tggVar;
        this.b = new bwf(new nz(k18Var, 17));
    }

    public static long b(ood oodVar) throws xy5 {
        String strA;
        int i = oodVar.d;
        try {
            strA = oodVar.X.a("X-Reason");
        } catch (Exception unused) {
        }
        if (strA == null) {
            strA = null;
        }
        o97 o97VarE = uog.e(i, strA);
        if (uog.a.equals(o97VarE) || uog.b.equals(o97VarE)) {
            wqi.o("zy5", null, "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0", Arrays.copyOf(new Object[0], 0));
            return 0L;
        }
        if (uog.g.equals(o97VarE) || uog.e.equals(o97VarE)) {
            wqi.o("zy5", null, "getErrorUploadPositionFromResponse forbidden or bad request", Arrays.copyOf(new Object[]{o97VarE}, 1));
            return -1L;
        }
        wqi.o("zy5", null, "getErrorUploadPositionFromResponse", Arrays.copyOf(new Object[]{o97VarE}, 1));
        throw new xy5(o97VarE);
    }

    public static void d(ea7 ea7Var) {
        if (ea7Var.Z.get()) {
            return;
        }
        ea7Var.X.b(new gq5(8, ea7Var));
    }

    public final zmd a(File file, String str, ga7 ga7Var, ua9 ua9Var, long j, ea7 ea7Var, int i) {
        kw6 kw6Var = new kw6();
        kw6Var.a = ga7Var;
        kw6Var.l(UUID.randomUUID().toString());
        int i2 = hr3.$EnumSwitchMapping$0[this.c.a().ordinal()];
        yy5 yy5Var = new yy5(file, ua9Var, j, ea7Var, (i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? 4096 : 16384);
        if (i != 5) {
            String string = TextUtils.isEmpty(str) ? Integer.toString(file.getName().hashCode()) : Uri.encode(str);
            Locale locale = Locale.ENGLISH;
            long length = file.length();
            StringBuilder sbL = az1.l(j, "bytes ", "-/");
            sbL.append(length);
            String string2 = sbL.toString();
            String strH = wy1.h("attachment; filename=", string);
            ((i17) kw6Var.c).a("Content-Range", string2);
            ((i17) kw6Var.c).a("Content-Disposition", strH);
            kw6Var.e(HttpPost.METHOD_NAME, yy5Var);
            return kw6Var.a();
        }
        String name = TextUtils.isEmpty(str) ? file.getName() : Uri.encode(str);
        String string3 = UUID.randomUUID().toString();
        xx0 xx0Var = new xx0(string3.getBytes(lb2.a));
        xx0Var.b = string3;
        ua9 ua9Var2 = a7a.e;
        ArrayList arrayList = new ArrayList();
        ua9 ua9Var3 = a7a.e;
        if (!ua9Var3.b.equals("multipart")) {
            throw new IllegalArgumentException(("multipart != " + ua9Var3).toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        kxi.a(sb, "file");
        if (name != null) {
            sb.append("; filename=");
            kxi.a(sb, name);
        }
        String string4 = sb.toString();
        ArrayList arrayList2 = new ArrayList(20);
        a8i.c("Content-Disposition");
        arrayList2.add("Content-Disposition");
        arrayList2.add(vmf.c0(string4).toString());
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        j17 j17Var = new j17((String[]) array);
        if (j17Var.a(HTTP.CONTENT_TYPE) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (j17Var.a(HTTP.CONTENT_LEN) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        arrayList.add(new z6a(j17Var, yy5Var));
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        a7a a7aVar = new a7a(xx0Var, ua9Var3, yxg.w(arrayList));
        Locale locale2 = Locale.ENGLISH;
        String strH2 = wy1.h("attachment; filename=", name);
        ((i17) kw6Var.c).a("Content-type", ua9Var3.a);
        ((i17) kw6Var.c).a("Content-Disposition", strH2);
        kw6Var.e(HttpPost.METHOD_NAME, a7aVar);
        return kw6Var.a();
    }

    public final long c(ga7 ga7Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(20);
        String string = UUID.randomUUID().toString();
        if (string == null) {
            linkedHashMap.remove(Object.class);
        } else {
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(Object.class, Object.class.cast(string));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        j17 j17Var = new j17((String[]) array);
        byte[] bArr = yxg.a;
        ood oodVarF = ((sua) this.a.getValue()).b(new zmd(ga7Var, HttpGet.METHOD_NAME, j17Var, null, linkedHashMap.isEmpty() ? id5.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)))).f();
        qod qodVar = oodVarF.Y;
        try {
            if (!oodVarF.l() || qodVar == null) {
                long jB = b(oodVarF);
                if (qodVar != null) {
                    qodVar.close();
                }
                return jB;
            }
            String strQ = qodVar.Q();
            wqi.c("zy5", "getUploadPosition body result: ".concat(strQ), new Object[0]);
            Matcher matcher = f.matcher(strQ);
            if (matcher.find()) {
                long j = Long.parseLong(matcher.group(2));
                wqi.c("zy5", "getUploadPosition result: ".concat(strQ), new Object[0]);
                qodVar.close();
                return j;
            }
            wqi.e("zy5", "getUploadPosition unexpected response from server, range not found: ".concat(strQ), null);
            this.c.b("unexpected range header: ".concat(strQ));
            qodVar.close();
            return -1L;
        } finally {
        }
    }

    public final long e(ga7 ga7Var) {
        long j;
        kw6 kw6Var = new kw6();
        kw6Var.a = ga7Var;
        kw6Var.l(UUID.randomUUID().toString());
        kw6Var.e(HttpPost.METHOD_NAME, new vy5(0));
        ood oodVarF = ((sua) this.a.getValue()).b(kw6Var.a()).f();
        qod qodVar = oodVarF.Y;
        try {
            if (!oodVarF.l()) {
                long jB = b(oodVarF);
                if (qodVar != null) {
                    qodVar.close();
                }
                return jB;
            }
            j17 j17Var = oodVarF.X;
            String strA = j17Var.a("X-Last-Known-Byte");
            if (strA == null) {
                strA = null;
            }
            if (strA != null) {
                String strA2 = j17Var.a("X-Last-Known-Byte");
                try {
                    j = Long.parseLong(strA2 != null ? strA2 : null) + 1;
                } catch (NumberFormatException unused) {
                    j = -1;
                }
            } else {
                j = 0;
            }
            return j;
        } finally {
            if (qodVar != null) {
                qodVar.close();
            }
        }
    }
}

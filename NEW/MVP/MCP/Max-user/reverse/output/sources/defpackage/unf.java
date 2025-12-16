package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class unf implements tof {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern o = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final umb c = new umb();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hb4 a(android.text.Spanned r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unf.a(android.text.Spanned, java.lang.String):hb4");
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.tof
    public final void r(byte[] bArr, int i, int i2, sof sofVar, fu3 fu3Var) throws NumberFormatException {
        String strK;
        String str;
        unf unfVar = this;
        long j = sofVar.b;
        umb umbVar = unfVar.c;
        umbVar.H(i + i2, bArr);
        umbVar.J(i);
        Charset charsetF = umbVar.F();
        if (charsetF == null) {
            charsetF = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !sofVar.a) ? null : new ArrayList();
        while (true) {
            String strK2 = umbVar.k(charsetF);
            if (strK2 == null) {
                break;
            }
            if (!strK2.isEmpty()) {
                try {
                    Integer.parseInt(strK2);
                    strK = umbVar.k(charsetF);
                } catch (NumberFormatException unused) {
                    a8i.l("SubripParser", "Skipping invalid index: ".concat(strK2));
                }
                if (strK == null) {
                    a8i.l("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(strK);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = unfVar.a;
                    long j3 = j2;
                    sb.setLength(0);
                    ArrayList arrayList2 = unfVar.b;
                    arrayList2.clear();
                    for (String strK3 = umbVar.k(charsetF); !TextUtils.isEmpty(strK3); strK3 = umbVar.k(charsetF)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strK3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = o.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            Matcher matcher3 = matcher2;
                            String strGroup = matcher3.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher3.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            matcher2 = matcher3;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || jB2 >= j4) {
                        fu3Var.accept(new kb4(jB, jB2 - jB, wg7.m(a(spannedFromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new kb4(jB, jB2 - jB, wg7.m(a(spannedFromHtml, str))));
                    }
                    unfVar = this;
                    j2 = j3;
                    j = j4;
                } else {
                    a8i.l("SubripParser", "Skipping invalid timing: ".concat(strK));
                    unfVar = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fu3Var.accept((kb4) it.next());
            }
        }
    }

    @Override // defpackage.tof
    public final int u() {
        return 1;
    }
}

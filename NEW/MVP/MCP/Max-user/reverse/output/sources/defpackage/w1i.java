package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class w1i implements fp5 {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final y9g b;
    public jp5 d;
    public int f;
    public final qyg c = new qyg(2, false);
    public byte[] e = new byte[1024];

    public w1i(String str, y9g y9gVar) {
        this.a = str;
        this.b = y9gVar;
    }

    public final rfg a(long j) {
        rfg rfgVarB = this.d.B(0, 3);
        ef6 ef6Var = new ef6();
        ef6Var.k = "text/vtt";
        ef6Var.c = this.a;
        ef6Var.o = j;
        rfgVarB.d(new gf6(ef6Var));
        this.d.w();
        return rfgVarB;
    }

    @Override // defpackage.fp5
    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.fp5
    public final void g(jp5 jp5Var) {
        this.d = jp5Var;
        jp5Var.N(new w16(-9223372036854775807L));
    }

    @Override // defpackage.fp5
    public final boolean h(hp5 hp5Var) {
        mm4 mm4Var = (mm4) hp5Var;
        mm4Var.n(this.e, 0, 6, false);
        byte[] bArr = this.e;
        qyg qygVar = this.c;
        qygVar.C(6, bArr);
        Pattern pattern = y1i.a;
        String strG = qygVar.g();
        if (strG != null && strG.startsWith("WEBVTT")) {
            return true;
        }
        mm4Var.n(this.e, 6, 3, false);
        qygVar.C(9, this.e);
        String strG2 = qygVar.g();
        return strG2 != null && strG2.startsWith("WEBVTT");
    }

    @Override // defpackage.fp5
    public final int i(hp5 hp5Var, n7 n7Var) throws ParserException, EOFException, InterruptedIOException {
        String strG;
        this.d.getClass();
        int i = (int) ((mm4) hp5Var).c;
        int i2 = this.f;
        byte[] bArr = this.e;
        int i3 = -1;
        if (i2 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i4 = this.f;
        int i5 = ((mm4) hp5Var).read(bArr2, i4, bArr2.length - i4);
        if (i5 != -1) {
            int i6 = this.f + i5;
            this.f = i6;
            if (i == -1 || i6 != i) {
                return 0;
            }
        }
        qyg qygVar = new qyg(this.e);
        y1i.c(qygVar);
        String strG2 = qygVar.g();
        long j = 0;
        long jB = 0;
        while (true) {
            int i7 = i3;
            Matcher matcher = null;
            if (TextUtils.isEmpty(strG2)) {
                while (true) {
                    String strG3 = qygVar.g();
                    if (strG3 == null) {
                        break;
                    }
                    if (y1i.a.matcher(strG3).matches()) {
                        do {
                            strG = qygVar.g();
                            if (strG != null) {
                            }
                        } while (!strG.isEmpty());
                    } else {
                        Matcher matcher2 = t1i.a.matcher(strG3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return i7;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jB2 = y1i.b(strGroup);
                long jB3 = this.b.b(((((j + jB2) - jB) * 90000) / 1000000) % 8589934592L);
                rfg rfgVarA = a(jB3 - jB2);
                byte[] bArr3 = this.e;
                int i8 = this.f;
                qyg qygVar2 = this.c;
                qygVar2.C(i8, bArr3);
                rfgVarA.c(this.f, qygVar2);
                rfgVarA.b(jB3, 1, this.f, 0, null);
                return i7;
            }
            if (strG2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(strG2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, strG2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strG2) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher4 = h.matcher(strG2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, strG2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strG2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jB = y1i.b(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strG2 = qygVar.g();
            i3 = i7;
        }
    }

    @Override // defpackage.fp5
    public final void release() {
    }
}

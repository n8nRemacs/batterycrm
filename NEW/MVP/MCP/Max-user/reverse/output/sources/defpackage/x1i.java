package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class x1i implements gp5 {
    public static final Pattern s0 = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern t0 = Pattern.compile("MPEGTS:(-?\\d+)");
    public kp5 X;
    public int Z;
    public final String a;
    public final z9g b;
    public final rof d;
    public final boolean o;
    public final umb c = new umb();
    public byte[] Y = new byte[1024];

    public x1i(String str, z9g z9gVar, rof rofVar, boolean z) {
        this.a = str;
        this.b = z9gVar;
        this.d = rofVar;
        this.o = z;
    }

    public final sfg a(long j) {
        sfg sfgVarMo163B = this.X.mo163B(0, 3);
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("text/vtt");
        ff6Var.d = this.a;
        ff6Var.r = j;
        a9h.m(ff6Var, sfgVarMo163B);
        this.X.w();
        return sfgVarMo163B;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        ip5Var.n(this.Y, 0, 6, false);
        byte[] bArr = this.Y;
        umb umbVar = this.c;
        umbVar.H(6, bArr);
        if (z1i.a(umbVar)) {
            return true;
        }
        ip5Var.n(this.Y, 6, 3, false);
        umbVar.H(9, this.Y);
        return z1i.a(umbVar);
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        if (this.o) {
            kp5Var = new dl6(kp5Var, this.d);
        }
        this.X = kp5Var;
        kp5Var.Q(new ge0(-9223372036854775807L));
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) throws ParserException, NumberFormatException {
        String strK;
        this.X.getClass();
        int length = (int) ip5Var.getLength();
        int i = this.Z;
        byte[] bArr = this.Y;
        if (i == bArr.length) {
            this.Y = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.Y;
        int i2 = this.Z;
        int i3 = ip5Var.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.Z + i3;
            this.Z = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        umb umbVar = new umb(this.Y);
        z1i.d(umbVar);
        String strK2 = umbVar.k(StandardCharsets.UTF_8);
        long jE0 = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strK2)) {
                while (true) {
                    String strK3 = umbVar.k(StandardCharsets.UTF_8);
                    if (strK3 == null) {
                        break;
                    }
                    if (z1i.a.matcher(strK3).matches()) {
                        do {
                            strK = umbVar.k(StandardCharsets.UTF_8);
                            if (strK != null) {
                            }
                        } while (!strK.isEmpty());
                    } else {
                        Matcher matcher2 = u1i.a.matcher(strK3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = z1i.c(strGroup);
                String str = zxg.a;
                long jB = this.b.b(zxg.e0((jE0 + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                sfg sfgVarA = a(jB - jC2);
                byte[] bArr3 = this.Y;
                int i5 = this.Z;
                umb umbVar2 = this.c;
                umbVar2.H(i5, bArr3);
                sfgVarA.b(umbVar2, this.Z, 0);
                sfgVarA.a(jB, 1, this.Z, 0, null);
                return -1;
            }
            if (strK2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = s0.matcher(strK2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strK2));
                }
                Matcher matcher4 = t0.matcher(strK2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strK2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = z1i.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j = Long.parseLong(strGroup3);
                String str2 = zxg.a;
                jE0 = zxg.e0(j, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strK2 = umbVar.k(StandardCharsets.UTF_8);
        }
    }
}

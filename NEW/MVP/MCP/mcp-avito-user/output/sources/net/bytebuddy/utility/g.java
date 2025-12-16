package net.bytebuddy.utility;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Random;

/* compiled from: RandomString.java */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f418986c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f418987d;

    /* renamed from: a, reason: collision with root package name */
    public final Random f418988a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418989b;

    static {
        StringBuilder sb2 = new StringBuilder();
        for (char c12 = '0'; c12 <= '9'; c12 = (char) (c12 + 1)) {
            sb2.append(c12);
        }
        for (char c13 = 'a'; c13 <= 'z'; c13 = (char) (c13 + 1)) {
            sb2.append(c13);
        }
        for (char c14 = 'A'; c14 <= 'Z'; c14 = (char) (c14 + 1)) {
            sb2.append(c14);
        }
        char[] charArray = sb2.toString().toCharArray();
        f418986c = charArray;
        int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(charArray.length);
        f418987d = iNumberOfLeadingZeros - (Integer.bitCount(charArray.length) == iNumberOfLeadingZeros ? 0 : 1);
    }

    public g() {
        this(0);
    }

    public static String a(int i12) {
        int i13 = f418987d;
        int i14 = (32 / i13) + (32 % i13 == 0 ? 0 : 1);
        char[] cArr = new char[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            cArr[i15] = f418986c[(i12 >>> (i15 * i13)) & ((-1) >>> (32 - i13))];
        }
        return new String(cArr);
    }

    public static String b() {
        return new g(0).c();
    }

    @SuppressFBWarnings(justification = "Random value is used on each invocation.", value = {"DMI_RANDOM_USED_ONLY_ONCE"})
    public final String c() {
        int i12 = this.f418989b;
        char[] cArr = new char[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            Random random = this.f418988a;
            char[] cArr2 = f418986c;
            cArr[i13] = cArr2[random.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }

    public g(int i12) {
        this(new Random());
    }

    public g(Random random) {
        this.f418989b = 8;
        this.f418988a = random;
    }
}

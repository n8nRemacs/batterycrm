package RW0;

import RW0.c;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DefaultImageFormatChecker.java */
@Nullsafe
/* loaded from: classes10.dex */
public class a implements c.a {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f14479b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14480c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14481d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14482e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f14483f = e.a("GIF87a");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f14484g = e.a("GIF89a");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f14485h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14486i;

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f14487j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14488k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f14489l;

    /* renamed from: m, reason: collision with root package name */
    public static final byte[][] f14490m;

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f14491n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f14492o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f14493p;

    /* renamed from: a, reason: collision with root package name */
    public final int f14494a;

    static {
        byte[] bArr = {-1, -40, -1};
        f14479b = bArr;
        f14480c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f14481d = bArr2;
        f14482e = bArr2.length;
        byte[] bArrA = e.a("BM");
        f14485h = bArrA;
        f14486i = bArrA.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f14487j = bArr3;
        f14488k = bArr3.length;
        f14489l = e.a("ftyp");
        f14490m = new byte[][]{e.a("heic"), e.a("heix"), e.a("hevc"), e.a("hevx"), e.a("mif1"), e.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f14491n = bArr4;
        f14492o = new byte[]{77, 77, 0, 42};
        f14493p = bArr4.length;
    }

    public a() {
        int[] iArr = {21, 20, f14480c, f14482e, 6, f14486i, f14488k, 12};
        int i12 = iArr[0];
        for (int i13 = 1; i13 < 8; i13++) {
            int i14 = iArr[i13];
            if (i14 > i12) {
                i12 = i14;
            }
        }
        this.f14494a = i12;
    }
}

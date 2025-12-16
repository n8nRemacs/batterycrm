package androidx.compose.ui.graphics.colorspace;

import androidx.compose.foundation.H;
import kotlin.Metadata;

/* compiled from: ColorSpaces.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/f;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final f f39390a = new f();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final float[] f39391b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final float[] f39392c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final s f39393d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final s f39394e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final r f39395f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final r f39396g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final r f39397h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final r f39398i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final r f39399j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final r f39400k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final r f39401l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final r f39402m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final r f39403n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final r f39404o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final r f39405p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final r f39406q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final r f39407r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final r f39408s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final v f39409t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final l f39410u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final r f39411v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final r f39412w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final r f39413x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final m f39414y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final c[] f39415z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f39391b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f39392c = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        s sVar = new s(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        s sVar2 = new s(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        s sVar3 = new s(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f39393d = sVar3;
        s sVar4 = new s(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f39394e = sVar4;
        k.f39425a.getClass();
        u uVar = k.f39429e;
        r rVar = new r("sRGB IEC61966-2.1", fArr, uVar, sVar, 0);
        f39395f = rVar;
        r rVar2 = new r("sRGB IEC61966-2.1 (Linear)", fArr, uVar, 1.0d, 0.0f, 1.0f, 1);
        f39396g = rVar2;
        r rVar3 = new r("scRGB-nl IEC 61966-2-2:2003", fArr, uVar, null, new H(28), new H(29), -0.799f, 2.399f, sVar, 2);
        f39397h = rVar3;
        r rVar4 = new r("scRGB IEC 61966-2-2:2003", fArr, uVar, 1.0d, -0.5f, 7.499f, 3);
        f39398i = rVar4;
        r rVar5 = new r("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, uVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f39399j = rVar5;
        r rVar6 = new r("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, uVar, new s(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f39400k = rVar6;
        r rVar7 = new r("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new u(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f39401l = rVar7;
        r rVar8 = new r("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, uVar, sVar, 7);
        f39402m = rVar8;
        r rVar9 = new r("NTSC (1953)", fArr2, k.f39426b, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f39403n = rVar9;
        r rVar10 = new r("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, uVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f39404o = rVar10;
        r rVar11 = new r("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, uVar, 2.2d, 0.0f, 1.0f, 10);
        f39405p = rVar11;
        r rVar12 = new r("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, k.f39427c, new s(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f39406q = rVar12;
        u uVar2 = k.f39428d;
        r rVar13 = new r("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, uVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f39407r = rVar13;
        r rVar14 = new r("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, uVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f39408s = rVar14;
        b.f39380b.getClass();
        v vVar = new v("Generic XYZ", b.f39382d, 14, null);
        f39409t = vVar;
        long j12 = b.f39383e;
        l lVar = new l("Generic L*a*b*", j12, 15, null);
        f39410u = lVar;
        r rVar15 = new r("None", fArr, uVar, sVar2, 16);
        f39411v = rVar15;
        r rVar16 = new r("Hybrid Log Gamma encoding", fArr3, uVar, null, new e(0), new e(1), 0.0f, 1.0f, sVar3, 17);
        f39412w = rVar16;
        r rVar17 = new r("Perceptual Quantizer encoding", fArr3, uVar, null, new e(2), new e(3), 0.0f, 1.0f, sVar4, 18);
        f39413x = rVar17;
        m mVar = new m("Oklab", j12, 19, null);
        f39414y = mVar;
        f39415z = new c[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, vVar, lVar, rVar15, rVar16, rVar17, mVar};
    }

    public static double a(@Y61.k s sVar, double d12) {
        double d13 = d12 < 0.0d ? -1.0d : 1.0d;
        double d14 = d12 * d13;
        double d15 = sVar.f39465b;
        double d16 = d15 * d14;
        return (sVar.f39470g + 1.0d) * d13 * (d16 <= 1.0d ? Math.pow(d16, sVar.f39466c) : Math.exp((d14 - sVar.f39469f) * sVar.f39467d) + sVar.f39468e);
    }

    public static double b(@Y61.k s sVar, double d12) {
        double d13 = d12 < 0.0d ? -1.0d : 1.0d;
        double d14 = 1.0d / sVar.f39465b;
        double d15 = 1.0d / sVar.f39466c;
        double d16 = 1.0d / sVar.f39467d;
        double d17 = (d12 * d13) / (sVar.f39470g + 1.0d);
        return d13 * (d17 <= 1.0d ? Math.pow(d17, d15) * d14 : (Math.log(d17 - sVar.f39468e) * d16) + sVar.f39469f);
    }

    public static double c(@Y61.k s sVar, double d12) {
        double d13 = d12 < 0.0d ? -1.0d : 1.0d;
        double d14 = d12 * d13;
        double d15 = sVar.f39465b;
        double d16 = sVar.f39467d;
        double dPow = (Math.pow(d14, d16) * sVar.f39466c) + d15;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d14, d16) * sVar.f39469f) + sVar.f39468e), sVar.f39470g) * d13;
    }

    public static double d(@Y61.k s sVar, double d12) {
        double d13 = d12 < 0.0d ? -1.0d : 1.0d;
        double d14 = d12 * d13;
        double d15 = -sVar.f39465b;
        double d16 = 1.0d / sVar.f39470g;
        return Math.pow(Math.max((Math.pow(d14, d16) * sVar.f39468e) + d15, 0.0d) / ((Math.pow(d14, d16) * (-sVar.f39469f)) + sVar.f39466c), 1.0d / sVar.f39467d) * d13;
    }
}

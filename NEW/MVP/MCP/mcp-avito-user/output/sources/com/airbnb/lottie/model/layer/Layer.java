package com.airbnb.lottie.model.layer;

import androidx.compose.foundation.H;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.model.animatable.j;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.model.animatable.n;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.C27306j;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.P;
import java.util.List;
import java.util.Locale;

/* loaded from: classes10.dex */
public class Layer {

    /* renamed from: a, reason: collision with root package name */
    public final List<com.airbnb.lottie.model.content.c> f59774a;

    /* renamed from: b, reason: collision with root package name */
    public final C27291k f59775b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59776c;

    /* renamed from: d, reason: collision with root package name */
    public final long f59777d;

    /* renamed from: e, reason: collision with root package name */
    public final LayerType f59778e;

    /* renamed from: f, reason: collision with root package name */
    public final long f59779f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final String f59780g;

    /* renamed from: h, reason: collision with root package name */
    public final List<Mask> f59781h;

    /* renamed from: i, reason: collision with root package name */
    public final n f59782i;

    /* renamed from: j, reason: collision with root package name */
    public final int f59783j;

    /* renamed from: k, reason: collision with root package name */
    public final int f59784k;

    /* renamed from: l, reason: collision with root package name */
    public final int f59785l;

    /* renamed from: m, reason: collision with root package name */
    public final float f59786m;

    /* renamed from: n, reason: collision with root package name */
    public final float f59787n;

    /* renamed from: o, reason: collision with root package name */
    public final float f59788o;

    /* renamed from: p, reason: collision with root package name */
    public final float f59789p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public final j f59790q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public final k f59791r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.model.animatable.b f59792s;

    /* renamed from: t, reason: collision with root package name */
    public final List<com.airbnb.lottie.value.a<Float>> f59793t;

    /* renamed from: u, reason: collision with root package name */
    public final MatteType f59794u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f59795v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.model.content.a f59796w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public final C27306j f59797x;

    /* renamed from: y, reason: collision with root package name */
    public final LBlendMode f59798y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LayerType {

        /* renamed from: b, reason: collision with root package name */
        public static final LayerType f59799b;

        /* renamed from: c, reason: collision with root package name */
        public static final LayerType f59800c;

        /* renamed from: d, reason: collision with root package name */
        public static final LayerType f59801d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LayerType[] f59802e;

        static {
            LayerType layerType = new LayerType("PRE_COMP", 0);
            f59799b = layerType;
            LayerType layerType2 = new LayerType("SOLID", 1);
            LayerType layerType3 = new LayerType("IMAGE", 2);
            f59800c = layerType3;
            LayerType layerType4 = new LayerType("NULL", 3);
            LayerType layerType5 = new LayerType("SHAPE", 4);
            LayerType layerType6 = new LayerType("TEXT", 5);
            LayerType layerType7 = new LayerType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
            f59801d = layerType7;
            f59802e = new LayerType[]{layerType, layerType2, layerType3, layerType4, layerType5, layerType6, layerType7};
        }

        public LayerType() {
            throw null;
        }

        public static LayerType valueOf(String str) {
            return (LayerType) Enum.valueOf(LayerType.class, str);
        }

        public static LayerType[] values() {
            return (LayerType[]) f59802e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatteType {

        /* renamed from: b, reason: collision with root package name */
        public static final MatteType f59803b;

        /* renamed from: c, reason: collision with root package name */
        public static final MatteType f59804c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MatteType[] f59805d;

        static {
            MatteType matteType = new MatteType("NONE", 0);
            f59803b = matteType;
            MatteType matteType2 = new MatteType("ADD", 1);
            MatteType matteType3 = new MatteType("INVERT", 2);
            f59804c = matteType3;
            f59805d = new MatteType[]{matteType, matteType2, matteType3, new MatteType("LUMA", 3), new MatteType("LUMA_INVERTED", 4), new MatteType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5)};
        }

        public MatteType() {
            throw null;
        }

        public static MatteType valueOf(String str) {
            return (MatteType) Enum.valueOf(MatteType.class, str);
        }

        public static MatteType[] values() {
            return (MatteType[]) f59805d.clone();
        }
    }

    public Layer(List<com.airbnb.lottie.model.content.c> list, C27291k c27291k, String str, long j12, LayerType layerType, long j13, @P String str2, List<Mask> list2, n nVar, int i12, int i13, int i14, float f12, float f13, float f14, float f15, @P j jVar, @P k kVar, List<com.airbnb.lottie.value.a<Float>> list3, MatteType matteType, @P com.airbnb.lottie.model.animatable.b bVar, boolean z12, @P com.airbnb.lottie.model.content.a aVar, @P C27306j c27306j, LBlendMode lBlendMode) {
        this.f59774a = list;
        this.f59775b = c27291k;
        this.f59776c = str;
        this.f59777d = j12;
        this.f59778e = layerType;
        this.f59779f = j13;
        this.f59780g = str2;
        this.f59781h = list2;
        this.f59782i = nVar;
        this.f59783j = i12;
        this.f59784k = i13;
        this.f59785l = i14;
        this.f59786m = f12;
        this.f59787n = f13;
        this.f59788o = f14;
        this.f59789p = f15;
        this.f59790q = jVar;
        this.f59791r = kVar;
        this.f59793t = list3;
        this.f59794u = matteType;
        this.f59792s = bVar;
        this.f59795v = z12;
        this.f59796w = aVar;
        this.f59797x = c27306j;
        this.f59798y = lBlendMode;
    }

    public final String a(String str) {
        int i12;
        StringBuilder sbR = H.r(str);
        sbR.append(this.f59776c);
        sbR.append("\n");
        C27291k c27291k = this.f59775b;
        Layer layerF = c27291k.f59590i.f(this.f59779f);
        if (layerF != null) {
            sbR.append("\t\tParents: ");
            sbR.append(layerF.f59776c);
            for (Layer layerF2 = c27291k.f59590i.f(layerF.f59779f); layerF2 != null; layerF2 = c27291k.f59590i.f(layerF2.f59779f)) {
                sbR.append("->");
                sbR.append(layerF2.f59776c);
            }
            sbR.append(str);
            sbR.append("\n");
        }
        List<Mask> list = this.f59781h;
        if (!list.isEmpty()) {
            sbR.append(str);
            sbR.append("\tMasks: ");
            sbR.append(list.size());
            sbR.append("\n");
        }
        int i13 = this.f59783j;
        if (i13 != 0 && (i12 = this.f59784k) != 0) {
            sbR.append(str);
            sbR.append("\tBackground: ");
            sbR.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(this.f59785l)));
        }
        List<com.airbnb.lottie.model.content.c> list2 = this.f59774a;
        if (!list2.isEmpty()) {
            sbR.append(str);
            sbR.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : list2) {
                sbR.append(str);
                sbR.append("\t\t");
                sbR.append(cVar);
                sbR.append("\n");
            }
        }
        return sbR.toString();
    }

    public final String toString() {
        return a("");
    }
}

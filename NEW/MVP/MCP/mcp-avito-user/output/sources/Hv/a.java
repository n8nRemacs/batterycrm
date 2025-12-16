package HV;

import LV.c;
import PK0.n;
import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ToastBarStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LHV/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final C0407a f7100w = new C0407a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f7101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7102b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f7103c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final n f7104d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7105e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7106f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7107g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7108h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7109i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7110j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7111k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7112l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7113m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7114n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7115o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7116p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7117q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7118r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7119s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7120t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final C35763c0 f7121u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7122v;

    /* compiled from: ToastBarStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LHV/a$a;", "LLV/c;", "LHV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: HV.a$a, reason: collision with other inner class name */
    public static final class C0407a implements c<a> {
        public /* synthetic */ C0407a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(int i12, @k Context context) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178942Q0);
            a aVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarC;
        }

        @k
        public static a c(@k TypedArray typedArray, @k Context context) {
            ColorStateList colorStateListA = x.a(typedArray, context, 19);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, Integer.MAX_VALUE);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(10, 0);
            b.a aVar = b.f17147t;
            int resourceId = typedArray.getResourceId(1, 0);
            aVar.getClass();
            b bVarC = b.a.c(resourceId, context);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(20, 0);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(22, 0);
            int dimensionPixelSize5 = typedArray.getDimensionPixelSize(21, 0);
            n nVarD = AK.c.d(typedArray, 18, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            if (c35763c0B == null) {
                c35763c0B = nVarD.f12988b;
            }
            n nVarA = n.a(nVarD, null, c35763c0B, null, null, null, null, null, null, null, 8189);
            int dimensionPixelSize6 = typedArray.getDimensionPixelSize(16, 0);
            int dimensionPixelSize7 = typedArray.getDimensionPixelSize(17, 0);
            int dimensionPixelSize8 = typedArray.getDimensionPixelSize(15, 0);
            int dimensionPixelSize9 = typedArray.getDimensionPixelSize(4, 0);
            int dimensionPixelSize10 = typedArray.getDimensionPixelSize(5, 0);
            int dimensionPixelSize11 = typedArray.getDimensionPixelSize(12, 0);
            int dimensionPixelSize12 = typedArray.getDimensionPixelSize(13, 0);
            int dimensionPixelSize13 = typedArray.getDimensionPixelSize(11, 0);
            int dimensionPixelSize14 = typedArray.getDimensionPixelSize(14, 0);
            int dimensionPixelSize15 = typedArray.getDimensionPixelSize(8, 0);
            int dimensionPixelSize16 = typedArray.getDimensionPixelSize(6, 0);
            int dimensionPixelSize17 = typedArray.getDimensionPixelSize(7, 0);
            int dimensionPixelSize18 = typedArray.getDimensionPixelSize(3, 0);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 0);
            return new a(dimensionPixelSize, dimensionPixelSize2, bVarC, nVarA, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize10, dimensionPixelSize11, dimensionPixelSize12, dimensionPixelSize14, dimensionPixelSize13, dimensionPixelSize16, dimensionPixelSize17, dimensionPixelSize15, dimensionPixelSize18, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, typedArray.getDimensionPixelSize(2, 0));
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C0407a() {
        }
    }

    public a() {
        this(0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 4194303, null);
    }

    public static a a(a aVar, int i12, int i13, int i14, int i15, int i16) {
        return new a(aVar.f7101a, aVar.f7102b, aVar.f7103c, aVar.f7104d, aVar.f7105e, aVar.f7106f, aVar.f7107g, (i16 & 128) != 0 ? aVar.f7108h : 0, (i16 & 256) != 0 ? aVar.f7109i : 0, (i16 & 512) != 0 ? aVar.f7110j : 0, (i16 & 1024) != 0 ? aVar.f7111k : 0, (i16 & 2048) != 0 ? aVar.f7112l : 0, (i16 & 4096) != 0 ? aVar.f7113m : i12, (i16 & 8192) != 0 ? aVar.f7114n : i13, aVar.f7115o, aVar.f7116p, aVar.f7117q, aVar.f7118r, (262144 & i16) != 0 ? aVar.f7119s : i14, aVar.f7120t, aVar.f7121u, (i16 & 2097152) != 0 ? aVar.f7122v : i15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7101a == aVar.f7101a && this.f7102b == aVar.f7102b && L.f(this.f7103c, aVar.f7103c) && L.f(this.f7104d, aVar.f7104d) && this.f7105e == aVar.f7105e && this.f7106f == aVar.f7106f && this.f7107g == aVar.f7107g && this.f7108h == aVar.f7108h && this.f7109i == aVar.f7109i && this.f7110j == aVar.f7110j && this.f7111k == aVar.f7111k && this.f7112l == aVar.f7112l && this.f7113m == aVar.f7113m && this.f7114n == aVar.f7114n && this.f7115o == aVar.f7115o && this.f7116p == aVar.f7116p && this.f7117q == aVar.f7117q && this.f7118r == aVar.f7118r && this.f7119s == aVar.f7119s && this.f7120t == aVar.f7120t && L.f(this.f7121u, aVar.f7121u) && this.f7122v == aVar.f7122v;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f7102b, Integer.hashCode(this.f7101a) * 31, 31);
        b bVar = this.f7103c;
        int iHashCode = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        n nVar = this.f7104d;
        int iE3 = r.e(this.f7120t, r.e(this.f7119s, r.e(this.f7118r, r.e(this.f7117q, r.e(this.f7116p, r.e(this.f7115o, r.e(this.f7114n, r.e(this.f7113m, r.e(this.f7112l, r.e(this.f7111k, r.e(this.f7110j, r.e(this.f7109i, r.e(this.f7108h, r.e(this.f7107g, r.e(this.f7106f, r.e(this.f7105e, (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        C35763c0 c35763c0 = this.f7121u;
        return Integer.hashCode(this.f7122v) + ((iE3 + (c35763c0 != null ? c35763c0.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToastBarStyle(maxWidth=");
        sb2.append(this.f7101a);
        sb2.append(", minWidth=");
        sb2.append(this.f7102b);
        sb2.append(", buttonStyle=");
        sb2.append(this.f7103c);
        sb2.append(", textStyle=");
        sb2.append(this.f7104d);
        sb2.append(", textHorizontalOffset=");
        sb2.append(this.f7105e);
        sb2.append(", textVerticalOffset=");
        sb2.append(this.f7106f);
        sb2.append(", textPaddingBottom=");
        sb2.append(this.f7107g);
        sb2.append(", rightItemToTextHorizontalSpacing=");
        sb2.append(this.f7108h);
        sb2.append(", rightItemToTextVerticalSpacing=");
        sb2.append(this.f7109i);
        sb2.append(", rightItemHorizontalOffset=");
        sb2.append(this.f7110j);
        sb2.append(", leftItemHorizontalOffset=");
        sb2.append(this.f7111k);
        sb2.append(", leftItemToTextSpacing=");
        sb2.append(this.f7112l);
        sb2.append(", paddingLeft=");
        sb2.append(this.f7113m);
        sb2.append(", paddingRight=");
        sb2.append(this.f7114n);
        sb2.append(", paddingTop=");
        sb2.append(this.f7115o);
        sb2.append(", paddingBottom=");
        sb2.append(this.f7116p);
        sb2.append(", marginLeft=");
        sb2.append(this.f7117q);
        sb2.append(", marginRight=");
        sb2.append(this.f7118r);
        sb2.append(", translationY=");
        sb2.append(this.f7119s);
        sb2.append(", increasedTranslationY=");
        sb2.append(this.f7120t);
        sb2.append(", backgroundColor=");
        sb2.append(this.f7121u);
        sb2.append(", cornerRadius=");
        return r.t(sb2, this.f7122v, ')');
    }

    public a(int i12, int i13, @l b bVar, @l n nVar, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i32, int i33, @l C35763c0 c35763c0, int i34) {
        this.f7101a = i12;
        this.f7102b = i13;
        this.f7103c = bVar;
        this.f7104d = nVar;
        this.f7105e = i14;
        this.f7106f = i15;
        this.f7107g = i16;
        this.f7108h = i17;
        this.f7109i = i18;
        this.f7110j = i19;
        this.f7111k = i22;
        this.f7112l = i23;
        this.f7113m = i24;
        this.f7114n = i25;
        this.f7115o = i26;
        this.f7116p = i27;
        this.f7117q = i28;
        this.f7118r = i29;
        this.f7119s = i32;
        this.f7120t = i33;
        this.f7121u = c35763c0;
        this.f7122v = i34;
    }

    public /* synthetic */ a(int i12, int i13, b bVar, n nVar, int i14, int i15, int i16, int i17, int i18, int i19, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i32, int i33, C35763c0 c35763c0, int i34, int i35, C42822w c42822w) {
        this((i35 & 1) != 0 ? 0 : i12, (i35 & 2) != 0 ? 0 : i13, (i35 & 4) != 0 ? null : bVar, (i35 & 8) != 0 ? null : nVar, (i35 & 16) != 0 ? 0 : i14, (i35 & 32) != 0 ? 0 : i15, (i35 & 64) != 0 ? 0 : i16, (i35 & 128) != 0 ? 0 : i17, (i35 & 256) != 0 ? 0 : i18, (i35 & 512) != 0 ? 0 : i19, (i35 & 1024) != 0 ? 0 : i22, (i35 & 2048) != 0 ? 0 : i23, (i35 & 4096) != 0 ? 0 : i24, (i35 & 8192) != 0 ? 0 : i25, (i35 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i26, (i35 & 32768) != 0 ? 0 : i27, (i35 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? 0 : i28, (i35 & 131072) != 0 ? 0 : i29, (i35 & 262144) != 0 ? 0 : i32, (i35 & 524288) != 0 ? 0 : i33, (i35 & 1048576) != 0 ? null : c35763c0, (i35 & 2097152) != 0 ? 0 : i34);
    }
}

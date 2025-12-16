package VU;

import PK0.n;
import VU.a;
import VU.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.button.style.Alignment;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.a;
import com.avito.android.lib.util.f;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41176a;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ButtonStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVU/b;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final a f17147t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    public static boolean f17148u;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final VU.a f17149a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n f17150b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final n f17151c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.spinner.a f17152d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C35763c0 f17153e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17154f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17155g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17156h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17157i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f17158j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17159k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17160l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17161m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17162n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17163o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17164p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final c f17165q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Alignment f17166r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final a.d f17167s;

    /* compiled from: ButtonStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVU/b$a;", "LLV/c;", "LVU/b;", "<init>", "()V", "", "setCustomColorProps", "Z", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<b> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static b b(@k Context context, @k String str) {
            return c(C35835l0.j(f.d(str), context), context);
        }

        @k
        public static b c(@f0 int i12, @k Context context) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f179002x);
            b bVarD = d(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return bVarD;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @k
        public static b d(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            C35763c0 c35763c0;
            com.avito.android.lib.design.text_view.d dVar;
            com.avito.android.lib.design.text_view.d dVar2;
            ColorStateList colorStateListA;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 2);
            n nVarA = null;
            C35763c0 c35763c02 = colorStateListA2 != null ? new C35763c0(colorStateListA2, b.f17148u) : null;
            ColorStateList colorStateListA3 = x.a(typedArray, context, 30);
            C35763c0 c35763c03 = colorStateListA3 != null ? new C35763c0(colorStateListA3, b.f17148u) : null;
            b.f17147t.getClass();
            boolean z12 = typedArray.hasValue(13) || typedArray.hasValue(14) || typedArray.hasValue(15);
            boolean zHasValue = typedArray.hasValue(3);
            VU.a c1180a = new a.C1180a(null);
            if (z12) {
                ColorStateList colorStateListA4 = x.a(typedArray, context, 13);
                C35763c0 c35763c04 = colorStateListA4 != null ? new C35763c0(colorStateListA4, b.f17148u) : null;
                ColorStateList colorStateListA5 = x.a(typedArray, context, 14);
                C35763c0 c35763c05 = colorStateListA5 != null ? new C35763c0(colorStateListA5, b.f17148u) : null;
                int dimensionPixelSize = typedArray.getDimensionPixelSize(19, 0);
                ColorStateList colorStateListA6 = x.a(typedArray, context, 15);
                c1180a = new a.b(c35763c04, c35763c05, dimensionPixelSize, colorStateListA6 != null ? new C35763c0(colorStateListA6, b.f17148u) : null, typedArray.getDimensionPixelSize(16, 0));
            }
            if (zHasValue) {
                c1180a = new a.C1180a(typedArray.getDrawable(3));
            }
            VU.a aVar = c1180a;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(7, 0);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(6, 0);
            boolean zHasValue2 = typedArray.hasValue(5);
            boolean zHasValue3 = typedArray.hasValue(20);
            C35763c0 c35763c06 = (!zHasValue2 || (colorStateListA = x.a(typedArray, context, 5)) == null) ? null : new C35763c0(colorStateListA, b.f17148u);
            if (zHasValue3) {
                ColorStateList colorStateListA7 = x.a(typedArray, context, 20);
                c35763c0 = colorStateListA7 != null ? new C35763c0(colorStateListA7, b.f17148u) : null;
            } else {
                c35763c0 = c35763c06;
            }
            if (b.f17148u) {
                dVar = com.avito.android.lib.design.text_view.d.f180938a;
                dVar.getClass();
                com.avito.android.lib.design.text_view.d.f180939b = true;
            } else {
                dVar = com.avito.android.lib.design.text_view.d.f180938a;
            }
            n nVarD = AK.c.d(typedArray, 1, 0, dVar, context);
            if (c35763c02 == null) {
                c35763c02 = nVarD.f12988b;
            }
            n nVarA2 = n.a(nVarD, null, c35763c02, null, null, null, null, null, null, null, 8189);
            if (typedArray.hasValue(29)) {
                if (b.f17148u) {
                    dVar2 = com.avito.android.lib.design.text_view.d.f180938a;
                    dVar2.getClass();
                    com.avito.android.lib.design.text_view.d.f180939b = true;
                } else {
                    dVar2 = com.avito.android.lib.design.text_view.d.f180938a;
                }
                n nVarD2 = AK.c.d(typedArray, 29, 0, dVar2, context);
                if (c35763c03 == null) {
                    c35763c03 = nVarD2.f12988b;
                }
                nVarA = n.a(nVarD2, null, c35763c03, null, null, null, null, null, null, null, 8189);
            }
            n nVar = nVarA;
            a.C5301a c5301a = com.avito.android.lib.design.spinner.a.f180560d;
            int resourceId = typedArray.getResourceId(27, 0);
            c5301a.getClass();
            com.avito.android.lib.design.spinner.a aVarB = a.C5301a.b(resourceId, context);
            boolean z13 = typedArray.getBoolean(26, false);
            boolean z14 = typedArray.getBoolean(21, false);
            boolean z15 = typedArray.getBoolean(11, false);
            float dimension = typedArray.getDimension(33, 0.0f);
            int dimensionPixelSize4 = typedArray.getDimensionPixelSize(31, 0);
            int dimensionPixelSize5 = typedArray.getDimensionPixelSize(32, 0);
            int dimensionPixelSize6 = typedArray.getDimensionPixelSize(22, 0);
            int dimensionPixelSize7 = typedArray.getDimensionPixelSize(23, 0);
            int dimensionPixelSize8 = typedArray.getDimensionPixelSize(18, 0);
            Alignment alignment = (Alignment) Alignment.f178657d.get(typedArray.getInt(12, 0));
            boolean z16 = typedArray.getBoolean(25, false);
            d.a aVar2 = d.f17172e;
            int resourceId2 = typedArray.getResourceId(24, 0);
            aVar2.getClass();
            return new b(aVar, nVarA2, nVar, aVarB, c35763c0, dimensionPixelSize2, dimensionPixelSize3, z13, z14, z15, dimension, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize7, dimensionPixelSize8, new c(typedArray.getDimension(19, 0.0f), d.a.b(resourceId2, context), d.a.b(typedArray.getResourceId(17, 0), context), z16), alignment);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return c(i12, context);
        }

        public a() {
        }
    }

    public b(@k VU.a aVar, @k n nVar, @l n nVar2, @k com.avito.android.lib.design.spinner.a aVar2, @l C35763c0 c35763c0, int i12, int i13, boolean z12, boolean z13, boolean z14, float f12, int i14, int i15, int i16, int i17, int i18, @k c cVar, @k Alignment alignment) {
        this.f17149a = aVar;
        this.f17150b = nVar;
        this.f17151c = nVar2;
        this.f17152d = aVar2;
        this.f17153e = c35763c0;
        this.f17154f = i12;
        this.f17155g = i13;
        this.f17156h = z12;
        this.f17157i = z13;
        this.f17158j = z14;
        this.f17159k = f12;
        this.f17160l = i14;
        this.f17161m = i15;
        this.f17162n = i16;
        this.f17163o = i17;
        this.f17164p = i18;
        this.f17165q = cVar;
        this.f17166r = alignment;
        this.f17167s = aVar instanceof a.d ? (a.d) aVar : null;
    }

    public static b a(b bVar, VU.a aVar, n nVar, n nVar2, com.avito.android.lib.design.spinner.a aVar2, C35763c0 c35763c0, int i12, int i13, int i14, int i15, c cVar, int i16) {
        int i17;
        int i18;
        VU.a aVar3 = (i16 & 1) != 0 ? bVar.f17149a : aVar;
        n nVar3 = (i16 & 2) != 0 ? bVar.f17150b : nVar;
        n nVar4 = (i16 & 4) != 0 ? bVar.f17151c : nVar2;
        com.avito.android.lib.design.spinner.a aVar4 = (i16 & 8) != 0 ? bVar.f17152d : aVar2;
        C35763c0 c35763c02 = (i16 & 16) != 0 ? bVar.f17153e : c35763c0;
        int i19 = (i16 & 32) != 0 ? bVar.f17154f : i12;
        int i22 = bVar.f17155g;
        boolean z12 = (i16 & 128) != 0 ? bVar.f17156h : false;
        boolean z13 = (i16 & 256) != 0 ? bVar.f17157i : false;
        boolean z14 = bVar.f17158j;
        float f12 = bVar.f17159k;
        int i23 = (i16 & 2048) != 0 ? bVar.f17160l : i13;
        int i24 = (i16 & 4096) != 0 ? bVar.f17161m : i14;
        int i25 = bVar.f17162n;
        int i26 = bVar.f17163o;
        if ((i16 & 32768) != 0) {
            i17 = i26;
            i18 = bVar.f17164p;
        } else {
            i17 = i26;
            i18 = i15;
        }
        c cVar2 = (i16 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? bVar.f17165q : cVar;
        Alignment alignment = bVar.f17166r;
        bVar.getClass();
        return new b(aVar3, nVar3, nVar4, aVar4, c35763c02, i19, i22, z12, z13, z14, f12, i23, i24, i25, i17, i18, cVar2, alignment);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f17149a, bVar.f17149a) && L.f(this.f17150b, bVar.f17150b) && L.f(this.f17151c, bVar.f17151c) && L.f(this.f17152d, bVar.f17152d) && L.f(this.f17153e, bVar.f17153e) && this.f17154f == bVar.f17154f && this.f17155g == bVar.f17155g && this.f17156h == bVar.f17156h && this.f17157i == bVar.f17157i && this.f17158j == bVar.f17158j && Float.compare(this.f17159k, bVar.f17159k) == 0 && this.f17160l == bVar.f17160l && this.f17161m == bVar.f17161m && this.f17162n == bVar.f17162n && this.f17163o == bVar.f17163o && this.f17164p == bVar.f17164p && L.f(this.f17165q, bVar.f17165q) && this.f17166r == bVar.f17166r;
    }

    public final int hashCode() {
        int iHashCode = (this.f17150b.hashCode() + (this.f17149a.hashCode() * 31)) * 31;
        n nVar = this.f17151c;
        int iHashCode2 = (this.f17152d.hashCode() + ((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31)) * 31;
        C35763c0 c35763c0 = this.f17153e;
        return this.f17166r.hashCode() + ((this.f17165q.hashCode() + r.e(this.f17164p, r.e(this.f17163o, r.e(this.f17162n, r.e(this.f17161m, r.e(this.f17160l, r.d(this.f17159k, r.i(r.i(r.i(r.e(this.f17155g, r.e(this.f17154f, (iHashCode2 + (c35763c0 != null ? c35763c0.hashCode() : 0)) * 31, 31), 31), 31, this.f17156h), 31, this.f17157i), 31, this.f17158j), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @k
    public final String toString() {
        return "ButtonStyle(background=" + this.f17149a + ", titleStyle=" + this.f17150b + ", subtitleStyle=" + this.f17151c + ", spinnerStyle=" + this.f17152d + ", iconColor=" + this.f17153e + ", minHeight=" + this.f17154f + ", minWidth=" + this.f17155g + ", spinnerColorByTextColor=" + this.f17156h + ", iconColorByTextColor=" + this.f17157i + ", textAllCaps=" + this.f17158j + ", textVerticalOffset=" + this.f17159k + ", textPaddingLeft=" + this.f17160l + ", textPaddingRight=" + this.f17161m + ", iconPaddingLeft=" + this.f17162n + ", iconPaddingRight=" + this.f17163o + ", compoundDrawablePadding=" + this.f17164p + ", shadowModel=" + this.f17165q + ", alignment=" + this.f17166r + ')';
    }

    public /* synthetic */ b(VU.a aVar, n nVar, n nVar2, com.avito.android.lib.design.spinner.a aVar2, C35763c0 c35763c0, int i12, int i13, boolean z12, boolean z13, boolean z14, float f12, int i14, int i15, int i16, int i17, int i18, c cVar, Alignment alignment, int i19, C42822w c42822w) {
        this((i19 & 1) != 0 ? new a.C1180a(null) : aVar, nVar, nVar2, aVar2, (i19 & 16) != 0 ? null : c35763c0, (i19 & 32) != 0 ? 0 : i12, (i19 & 64) != 0 ? 0 : i13, (i19 & 128) != 0 ? false : z12, (i19 & 256) != 0 ? false : z13, (i19 & 512) != 0 ? false : z14, (i19 & 1024) != 0 ? 0.0f : f12, (i19 & 2048) != 0 ? 0 : i14, (i19 & 4096) != 0 ? 0 : i15, (i19 & 8192) != 0 ? 0 : i16, (i19 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i17, (32768 & i19) != 0 ? 0 : i18, cVar, (i19 & 131072) != 0 ? Alignment.f178655b : alignment);
    }
}

package KV;

import PK0.n;
import VU.b;
import VU.c;
import VU.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: TooltipStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LKV/a;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: v, reason: collision with root package name */
    @k
    public static final C0572a f9464v = new C0572a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f9465a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9466b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f9467c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f9468d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f9469e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f9470f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f9471g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f9472h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final b f9473i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final C35763c0 f9474j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9475k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final C35763c0 f9476l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9477m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9478n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9479o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9480p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9481q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9482r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final c f9483s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9484t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9485u;

    /* compiled from: TooltipStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LKV/a$a;", "LLV/c;", "LKV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KV.a$a, reason: collision with other inner class name */
    public static final class C0572a implements LV.c<a> {
        public /* synthetic */ C0572a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178946S0);
            a aVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarC;
        }

        @k
        public static a c(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            ColorStateList colorStateListA = x.a(typedArray, context, 13);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            int resourceId = typedArray.getResourceId(25, 0);
            int resourceId2 = typedArray.getResourceId(23, 0);
            int layoutDimension = typedArray.getLayoutDimension(3, "layout_width");
            int layoutDimension2 = typedArray.getLayoutDimension(4, "layout_height");
            Integer numValueOf = !typedArray.hasValue(21) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(21, 0));
            Integer numValueOf2 = !typedArray.hasValue(19) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(19, 0));
            Integer numValueOf3 = !typedArray.hasValue(22) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(22, 0));
            Integer numValueOf4 = typedArray.hasValue(20) ? Integer.valueOf(typedArray.getDimensionPixelSize(20, 0)) : null;
            int resourceId3 = typedArray.getResourceId(14, 0);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 26);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : c35763c0B;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(27, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(28, 0);
            int dimensionPixelSize3 = typedArray.getDimensionPixelSize(18, 0);
            int resourceId4 = typedArray.getResourceId(29, 0);
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(10, 0);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(11, 0);
            int resourceId5 = typedArray.getResourceId(12, R.style.Design_Animation_AppCompat_DropDownUp);
            boolean z12 = (resourceId == 0 && resourceId2 == 0) ? false : true;
            d.a aVar = VU.d.f17172e;
            int resourceId6 = typedArray.getResourceId(25, 0);
            aVar.getClass();
            c cVar = new c(typedArray.getDimension(24, 0.0f), d.a.b(resourceId6, context), d.a.b(typedArray.getResourceId(23, 0), context), z12);
            int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(17, 0);
            int resourceId7 = typedArray.getResourceId(16, 0);
            C0572a c0572a = a.f9464v;
            int resourceId8 = typedArray.getResourceId(16, 0);
            c0572a.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId8, d.n.f178948T0);
            n nVarD = AK.c.d(typedArrayObtainStyledAttributes, 14, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            b.a aVar2 = VU.b.f17147t;
            int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(2, 0);
            aVar2.getClass();
            VU.b bVarC = b.a.c(resourceId9, context);
            n nVarA = com.avito.android.lib.design.text_view.d.a(typedArrayObtainStyledAttributes.getResourceId(0, 0), context);
            int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(13, 0);
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
            int dimensionPixelOffset6 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            int dimensionPixelOffset7 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(11, 0);
            int dimensionPixelOffset8 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
            C35763c0 c35763c0 = c35763c0B;
            Integer num = numValueOf4;
            b bVar = new b(nVarD, nVarA, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0)), bVarC, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0)), Integer.valueOf(dimensionPixelOffset8), Integer.valueOf(dimensionPixelOffset7), Integer.valueOf(dimensionPixelOffset6), Integer.valueOf(dimensionPixelOffset5), Integer.valueOf(resourceId10), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, 0)), Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0)), dimensionPixelOffset4);
            typedArrayObtainStyledAttributes.recycle();
            return new a(layoutDimension, layoutDimension2, num, numValueOf3, numValueOf2, numValueOf, Integer.valueOf(resourceId7), Integer.valueOf(typedArray.getResourceId(15, 0)), bVar, c35763c0, resourceId3, c35763c0B2, dimensionPixelSize, dimensionPixelSize2, resourceId4, dimensionPixelSize3, dimensionPixelOffset, dimensionPixelOffset2, cVar, resourceId5, dimensionPixelOffset3);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C0572a() {
        }
    }

    /* compiled from: TooltipStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKV/a$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final n f9486a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final n f9487b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f9488c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final VU.b f9489d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f9490e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f9491f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Integer f9492g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Integer f9493h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f9494i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Integer f9495j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final Integer f9496k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Integer f9497l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final Integer f9498m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final Integer f9499n;

        /* renamed from: o, reason: collision with root package name */
        public final int f9500o;

        public b() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 32767, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f9486a, bVar.f9486a) && L.f(this.f9487b, bVar.f9487b) && L.f(this.f9488c, bVar.f9488c) && L.f(this.f9489d, bVar.f9489d) && L.f(this.f9490e, bVar.f9490e) && L.f(this.f9491f, bVar.f9491f) && L.f(this.f9492g, bVar.f9492g) && L.f(this.f9493h, bVar.f9493h) && L.f(this.f9494i, bVar.f9494i) && L.f(this.f9495j, bVar.f9495j) && L.f(this.f9496k, bVar.f9496k) && L.f(this.f9497l, bVar.f9497l) && L.f(this.f9498m, bVar.f9498m) && L.f(this.f9499n, bVar.f9499n) && this.f9500o == bVar.f9500o;
        }

        public final int hashCode() {
            n nVar = this.f9486a;
            int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
            n nVar2 = this.f9487b;
            int iHashCode2 = (iHashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
            Integer num = this.f9488c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            VU.b bVar = this.f9489d;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Integer num2 = this.f9490e;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f9491f;
            int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f9492g;
            int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f9493h;
            int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f9494i;
            int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f9495j;
            int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.f9496k;
            int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.f9497l;
            int iHashCode12 = (iHashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.f9498m;
            int iHashCode13 = (iHashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.f9499n;
            return Integer.hashCode(this.f9500o) + ((iHashCode13 + (num11 != null ? num11.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentStyle(titleStyle=");
            sb2.append(this.f9486a);
            sb2.append(", bodyStyle=");
            sb2.append(this.f9487b);
            sb2.append(", bodyMarginTop=");
            sb2.append(this.f9488c);
            sb2.append(", buttonStyle=");
            sb2.append(this.f9489d);
            sb2.append(", buttonMarginTop=");
            sb2.append(this.f9490e);
            sb2.append(", buttonMarginBottom=");
            sb2.append(this.f9491f);
            sb2.append(", contentPaddingTop=");
            sb2.append(this.f9492g);
            sb2.append(", contentPaddingBottom=");
            sb2.append(this.f9493h);
            sb2.append(", contentMarginStart=");
            sb2.append(this.f9494i);
            sb2.append(", contentMarginEnd=");
            sb2.append(this.f9495j);
            sb2.append(", closeButtonStyle=");
            sb2.append(this.f9496k);
            sb2.append(", closeButtonMarginStart=");
            sb2.append(this.f9497l);
            sb2.append(", closeButtonMarginTop=");
            sb2.append(this.f9498m);
            sb2.append(", closeButtonMarginEnd=");
            sb2.append(this.f9499n);
            sb2.append(", imagePadding=");
            return r.t(sb2, this.f9500o, ')');
        }

        public b(@l n nVar, @l n nVar2, @l Integer num, @l VU.b bVar, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l Integer num6, @l Integer num7, @l Integer num8, @l Integer num9, @l Integer num10, @l Integer num11, int i12) {
            this.f9486a = nVar;
            this.f9487b = nVar2;
            this.f9488c = num;
            this.f9489d = bVar;
            this.f9490e = num2;
            this.f9491f = num3;
            this.f9492g = num4;
            this.f9493h = num5;
            this.f9494i = num6;
            this.f9495j = num7;
            this.f9496k = num8;
            this.f9497l = num9;
            this.f9498m = num10;
            this.f9499n = num11;
            this.f9500o = i12;
        }

        public /* synthetic */ b(n nVar, n nVar2, Integer num, VU.b bVar, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? null : nVar, (i13 & 2) != 0 ? null : nVar2, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : bVar, (i13 & 16) != 0 ? null : num2, (i13 & 32) != 0 ? null : num3, (i13 & 64) != 0 ? null : num4, (i13 & 128) != 0 ? null : num5, (i13 & 256) != 0 ? null : num6, (i13 & 512) != 0 ? null : num7, (i13 & 1024) != 0 ? null : num8, (i13 & 2048) != 0 ? null : num9, (i13 & 4096) != 0 ? null : num10, (i13 & 8192) == 0 ? num11 : null, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i12);
        }
    }

    public a() {
        this(0, 0, null, null, null, null, null, null, null, null, 0, null, 0, 0, 0, 0, 0, 0, null, 0, 0, 2097151, null);
    }

    public static a a(a aVar, int i12, int i13, int i14, int i15) {
        int i16 = (i15 & 1) != 0 ? aVar.f9465a : i12;
        int i17 = aVar.f9466b;
        Integer num = aVar.f9467c;
        Integer num2 = aVar.f9468d;
        Integer num3 = aVar.f9469e;
        Integer num4 = aVar.f9470f;
        Integer num5 = aVar.f9471g;
        Integer num6 = aVar.f9472h;
        b bVar = aVar.f9473i;
        C35763c0 c35763c0 = aVar.f9474j;
        int i18 = aVar.f9475k;
        C35763c0 c35763c02 = aVar.f9476l;
        int i19 = (i15 & 4096) != 0 ? aVar.f9477m : i13;
        int i22 = aVar.f9478n;
        int i23 = aVar.f9479o;
        int i24 = aVar.f9480p;
        int i25 = aVar.f9481q;
        int i26 = (i15 & 131072) != 0 ? aVar.f9482r : i14;
        c cVar = aVar.f9483s;
        int i27 = aVar.f9484t;
        int i28 = aVar.f9485u;
        aVar.getClass();
        return new a(i16, i17, num, num2, num3, num4, num5, num6, bVar, c35763c0, i18, c35763c02, i19, i22, i23, i24, i25, i26, cVar, i27, i28);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9465a == aVar.f9465a && this.f9466b == aVar.f9466b && L.f(this.f9467c, aVar.f9467c) && L.f(this.f9468d, aVar.f9468d) && L.f(this.f9469e, aVar.f9469e) && L.f(this.f9470f, aVar.f9470f) && L.f(this.f9471g, aVar.f9471g) && L.f(this.f9472h, aVar.f9472h) && L.f(this.f9473i, aVar.f9473i) && L.f(this.f9474j, aVar.f9474j) && this.f9475k == aVar.f9475k && L.f(this.f9476l, aVar.f9476l) && this.f9477m == aVar.f9477m && this.f9478n == aVar.f9478n && this.f9479o == aVar.f9479o && this.f9480p == aVar.f9480p && this.f9481q == aVar.f9481q && this.f9482r == aVar.f9482r && L.f(this.f9483s, aVar.f9483s) && this.f9484t == aVar.f9484t && this.f9485u == aVar.f9485u;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f9466b, Integer.hashCode(this.f9465a) * 31, 31);
        Integer num = this.f9467c;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9468d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9469e;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9470f;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f9471g;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f9472h;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        b bVar = this.f9473i;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C35763c0 c35763c0 = this.f9474j;
        int iE3 = r.e(this.f9475k, (iHashCode7 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31, 31);
        C35763c0 c35763c02 = this.f9476l;
        int iE4 = r.e(this.f9482r, r.e(this.f9481q, r.e(this.f9480p, r.e(this.f9479o, r.e(this.f9478n, r.e(this.f9477m, (iE3 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        c cVar = this.f9483s;
        return Integer.hashCode(this.f9485u) + r.e(this.f9484t, (iE4 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TooltipStyle(width=");
        sb2.append(this.f9465a);
        sb2.append(", height=");
        sb2.append(this.f9466b);
        sb2.append(", maxWidth=");
        sb2.append(this.f9467c);
        sb2.append(", minWidth=");
        sb2.append(this.f9468d);
        sb2.append(", maxHeight=");
        sb2.append(this.f9469e);
        sb2.append(", minHeight=");
        sb2.append(this.f9470f);
        sb2.append(", contentStyleId=");
        sb2.append(this.f9471g);
        sb2.append(", contentId=");
        sb2.append(this.f9472h);
        sb2.append(", contentStyle=");
        sb2.append(this.f9473i);
        sb2.append(", backgroundColor=");
        sb2.append(this.f9474j);
        sb2.append(", backgroundShape=");
        sb2.append(this.f9475k);
        sb2.append(", tailColor=");
        sb2.append(this.f9476l);
        sb2.append(", tailHeight=");
        sb2.append(this.f9477m);
        sb2.append(", tailMinPadding=");
        sb2.append(this.f9478n);
        sb2.append(", tailShape=");
        sb2.append(this.f9479o);
        sb2.append(", floatingTailOffset=");
        sb2.append(this.f9480p);
        sb2.append(", anchorMinPadding=");
        sb2.append(this.f9481q);
        sb2.append(", anchorOffset=");
        sb2.append(this.f9482r);
        sb2.append(", shadowModel=");
        sb2.append(this.f9483s);
        sb2.append(", animationStyle=");
        sb2.append(this.f9484t);
        sb2.append(", displayMinPadding=");
        return r.t(sb2, this.f9485u, ')');
    }

    public a(int i12, int i13, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l Integer num6, @l b bVar, @l C35763c0 c35763c0, int i14, @l C35763c0 c35763c02, int i15, int i16, int i17, int i18, int i19, int i22, @l c cVar, int i23, int i24) {
        this.f9465a = i12;
        this.f9466b = i13;
        this.f9467c = num;
        this.f9468d = num2;
        this.f9469e = num3;
        this.f9470f = num4;
        this.f9471g = num5;
        this.f9472h = num6;
        this.f9473i = bVar;
        this.f9474j = c35763c0;
        this.f9475k = i14;
        this.f9476l = c35763c02;
        this.f9477m = i15;
        this.f9478n = i16;
        this.f9479o = i17;
        this.f9480p = i18;
        this.f9481q = i19;
        this.f9482r = i22;
        this.f9483s = cVar;
        this.f9484t = i23;
        this.f9485u = i24;
    }

    public /* synthetic */ a(int i12, int i13, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, b bVar, C35763c0 c35763c0, int i14, C35763c0 c35763c02, int i15, int i16, int i17, int i18, int i19, int i22, c cVar, int i23, int i24, int i25, C42822w c42822w) {
        this((i25 & 1) != 0 ? 0 : i12, (i25 & 2) != 0 ? 0 : i13, (i25 & 4) != 0 ? null : num, (i25 & 8) != 0 ? null : num2, (i25 & 16) != 0 ? null : num3, (i25 & 32) != 0 ? null : num4, (i25 & 64) != 0 ? null : num5, (i25 & 128) != 0 ? null : num6, (i25 & 256) != 0 ? null : bVar, (i25 & 512) != 0 ? null : c35763c0, (i25 & 1024) != 0 ? 0 : i14, (i25 & 2048) != 0 ? null : c35763c02, (i25 & 4096) != 0 ? 0 : i15, (i25 & 8192) != 0 ? 0 : i16, (i25 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i17, (i25 & 32768) != 0 ? 0 : i18, (i25 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? 0 : i19, (i25 & 131072) != 0 ? 0 : i22, (i25 & 262144) != 0 ? null : cVar, (i25 & 524288) != 0 ? R.style.Design_Animation_AppCompat_DropDownUp : i23, (i25 & 1048576) != 0 ? 0 : i24);
    }
}

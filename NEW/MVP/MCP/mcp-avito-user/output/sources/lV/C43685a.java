package lV;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* compiled from: BaseListItemStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LlV/a;", "LlV/b;", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C43685a implements InterfaceC43686b {

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final C11787a f413756q = new C11787a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ColorStateList f413757a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ColorStateList f413758b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final n f413759c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final n f413760d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final n f413761e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final n f413762f;

    /* renamed from: g, reason: collision with root package name */
    public final int f413763g;

    /* renamed from: h, reason: collision with root package name */
    public final int f413764h;

    /* renamed from: i, reason: collision with root package name */
    public final int f413765i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final b f413766j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final b f413767k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final b f413768l;

    /* renamed from: m, reason: collision with root package name */
    public final int f413769m;

    /* renamed from: n, reason: collision with root package name */
    public final int f413770n;

    /* renamed from: o, reason: collision with root package name */
    public final int f413771o;

    /* renamed from: p, reason: collision with root package name */
    public final int f413772p;

    /* compiled from: BaseListItemStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LlV/a$a;", "LLV/c;", "LlV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lV.a$a, reason: collision with other inner class name */
    public static final class C11787a implements LV.c<C43685a> {
        public /* synthetic */ C11787a(C42822w c42822w) {
            this();
        }

        @k
        public static C43685a b(int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178968g);
            C43685a c43685aC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return c43685aC;
        }

        @k
        public static C43685a c(@k TypedArray typedArray, @k Context context) {
            ColorStateList colorStateListA = x.a(typedArray, context, 28);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 20);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            ColorStateList colorStateListA3 = x.a(typedArray, context, 17);
            C35763c0 c35763c0B3 = colorStateListA3 != null ? C35771d0.b(colorStateListA3) : null;
            ColorStateList colorStateListA4 = x.a(typedArray, context, 14);
            C35763c0 c35763c0B4 = colorStateListA4 != null ? C35771d0.b(colorStateListA4) : null;
            ColorStateList colorStateListA5 = x.a(typedArray, context, 1);
            ColorStateList colorStateListA6 = x.a(typedArray, context, 2);
            n nVarD = AK.c.d(typedArray, 27, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            if (c35763c0B == null) {
                c35763c0B = nVarD.f12988b;
            }
            n nVarA = n.a(nVarD, null, c35763c0B, null, null, null, null, null, null, null, 8189);
            n nVarA2 = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(19, 0), context);
            if (c35763c0B2 == null) {
                c35763c0B2 = nVarA2.f12988b;
            }
            n nVarA3 = n.a(nVarA2, null, c35763c0B2, null, null, null, null, null, null, null, 8189);
            n nVarA4 = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(16, 0), context);
            if (c35763c0B3 == null) {
                c35763c0B3 = nVarA4.f12988b;
            }
            n nVarA5 = n.a(nVarA4, null, c35763c0B3, null, null, null, null, null, null, null, 8189);
            n nVarA6 = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(13, 0), context);
            if (c35763c0B4 == null) {
                c35763c0B4 = nVarA6.f12988b;
            }
            return new C43685a(colorStateListA5, colorStateListA6, nVarA, nVarA3, nVarA5, n.a(nVarA6, null, c35763c0B4, null, null, null, null, null, null, null, 8189), typedArray.getDimensionPixelSize(4, 0), typedArray.getDimensionPixelSize(5, 0), typedArray.getDimensionPixelSize(6, 0), new b(Integer.valueOf(typedArray.getDimensionPixelSize(22, 0)), Integer.valueOf(typedArray.getDimensionPixelSize(21, 0))), new b(Integer.valueOf(typedArray.getDimensionPixelSize(9, 0)), Integer.valueOf(typedArray.getDimensionPixelSize(8, 0))), new b(Integer.valueOf(typedArray.getDimensionPixelSize(11, 0)), Integer.valueOf(typedArray.getDimensionPixelSize(10, 0))), typedArray.getDimensionPixelSize(24, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(7, 0), typedArray.getDimensionPixelSize(25, 0));
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C11787a() {
        }
    }

    /* compiled from: BaseListItemStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlV/a$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lV.a$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f413773a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f413774b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f413773a, bVar.f413773a) && L.f(this.f413774b, bVar.f413774b);
        }

        public final int hashCode() {
            Integer num = this.f413773a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f413774b;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VerticalMargin(top=");
            sb2.append(this.f413773a);
            sb2.append(", bottom=");
            return s.j(sb2, this.f413774b, ')');
        }

        public b(@l Integer num, @l Integer num2) {
            this.f413773a = num;
            this.f413774b = num2;
        }

        public /* synthetic */ b(Integer num, Integer num2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
        }
    }

    public C43685a() {
        this(null, null, null, null, null, null, 0, 0, 0, null, null, null, 0, 0, 0, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43685a)) {
            return false;
        }
        C43685a c43685a = (C43685a) obj;
        return L.f(this.f413757a, c43685a.f413757a) && L.f(this.f413758b, c43685a.f413758b) && L.f(this.f413759c, c43685a.f413759c) && L.f(this.f413760d, c43685a.f413760d) && L.f(this.f413761e, c43685a.f413761e) && L.f(this.f413762f, c43685a.f413762f) && this.f413763g == c43685a.f413763g && this.f413764h == c43685a.f413764h && this.f413765i == c43685a.f413765i && L.f(this.f413766j, c43685a.f413766j) && L.f(this.f413767k, c43685a.f413767k) && L.f(this.f413768l, c43685a.f413768l) && this.f413769m == c43685a.f413769m && this.f413770n == c43685a.f413770n && this.f413771o == c43685a.f413771o && this.f413772p == c43685a.f413772p;
    }

    public final int hashCode() {
        ColorStateList colorStateList = this.f413757a;
        int iHashCode = (colorStateList == null ? 0 : colorStateList.hashCode()) * 31;
        ColorStateList colorStateList2 = this.f413758b;
        int iHashCode2 = (iHashCode + (colorStateList2 == null ? 0 : colorStateList2.hashCode())) * 31;
        n nVar = this.f413759c;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.f413760d;
        int iHashCode4 = (iHashCode3 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n nVar3 = this.f413761e;
        int iHashCode5 = (iHashCode4 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
        n nVar4 = this.f413762f;
        int iE2 = r.e(this.f413765i, r.e(this.f413764h, r.e(this.f413763g, (iHashCode5 + (nVar4 == null ? 0 : nVar4.hashCode())) * 31, 31), 31), 31);
        b bVar = this.f413766j;
        int iHashCode6 = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f413767k;
        int iHashCode7 = (iHashCode6 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.f413768l;
        return Integer.hashCode(this.f413772p) + r.e(this.f413771o, r.e(this.f413770n, r.e(this.f413769m, (iHashCode7 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseListItemStyle(backgroundColor=");
        sb2.append(this.f413757a);
        sb2.append(", rippleColor=");
        sb2.append(this.f413758b);
        sb2.append(", titleStyle=");
        sb2.append(this.f413759c);
        sb2.append(", subtitleStyle=");
        sb2.append(this.f413760d);
        sb2.append(", messageStyle=");
        sb2.append(this.f413761e);
        sb2.append(", linkStyle=");
        sb2.append(this.f413762f);
        sb2.append(", minimumHeight=");
        sb2.append(this.f413763g);
        sb2.append(", contentSpacing=");
        sb2.append(this.f413764h);
        sb2.append(", contentSpacingCompensation=");
        sb2.append(this.f413765i);
        sb2.append(", textVerticalMargin=");
        sb2.append(this.f413766j);
        sb2.append(", iconLeftVerticalMargin=");
        sb2.append(this.f413767k);
        sb2.append(", iconRightVerticalMargin=");
        sb2.append(this.f413768l);
        sb2.append(", textSpacing=");
        sb2.append(this.f413769m);
        sb2.append(", messageMarginTop=");
        sb2.append(this.f413770n);
        sb2.append(", firstLineAlignmentVerticalOffset=");
        sb2.append(this.f413771o);
        sb2.append(", threshold=");
        return r.t(sb2, this.f413772p, ')');
    }

    public C43685a(@l ColorStateList colorStateList, @l ColorStateList colorStateList2, @l n nVar, @l n nVar2, @l n nVar3, @l n nVar4, int i12, int i13, int i14, @l b bVar, @l b bVar2, @l b bVar3, int i15, int i16, int i17, int i18) {
        this.f413757a = colorStateList;
        this.f413758b = colorStateList2;
        this.f413759c = nVar;
        this.f413760d = nVar2;
        this.f413761e = nVar3;
        this.f413762f = nVar4;
        this.f413763g = i12;
        this.f413764h = i13;
        this.f413765i = i14;
        this.f413766j = bVar;
        this.f413767k = bVar2;
        this.f413768l = bVar3;
        this.f413769m = i15;
        this.f413770n = i16;
        this.f413771o = i17;
        this.f413772p = i18;
    }

    public /* synthetic */ C43685a(ColorStateList colorStateList, ColorStateList colorStateList2, n nVar, n nVar2, n nVar3, n nVar4, int i12, int i13, int i14, b bVar, b bVar2, b bVar3, int i15, int i16, int i17, int i18, int i19, C42822w c42822w) {
        this((i19 & 1) != 0 ? null : colorStateList, (i19 & 2) != 0 ? null : colorStateList2, (i19 & 4) != 0 ? null : nVar, (i19 & 8) != 0 ? null : nVar2, (i19 & 16) != 0 ? null : nVar3, (i19 & 32) != 0 ? null : nVar4, (i19 & 64) != 0 ? 0 : i12, (i19 & 128) != 0 ? 0 : i13, (i19 & 256) != 0 ? 0 : i14, (i19 & 512) != 0 ? null : bVar, (i19 & 1024) != 0 ? null : bVar2, (i19 & 2048) == 0 ? bVar3 : null, (i19 & 4096) != 0 ? 0 : i15, (i19 & 8192) != 0 ? 0 : i16, (i19 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i17, (i19 & 32768) != 0 ? 0 : i18);
    }
}

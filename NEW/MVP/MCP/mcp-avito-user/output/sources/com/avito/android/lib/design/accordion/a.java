package com.avito.android.lib.design.accordion;

import LV.c;
import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import hw.InterfaceC41176a;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AccordionStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/accordion/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final C5252a f178201p = new C5252a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final n f178202a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178203b;

    /* renamed from: c, reason: collision with root package name */
    public final int f178204c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Drawable f178205d;

    /* renamed from: e, reason: collision with root package name */
    public final int f178206e;

    /* renamed from: f, reason: collision with root package name */
    public final int f178207f;

    /* renamed from: g, reason: collision with root package name */
    public final int f178208g;

    /* renamed from: h, reason: collision with root package name */
    public final int f178209h;

    /* renamed from: i, reason: collision with root package name */
    public final int f178210i;

    /* renamed from: j, reason: collision with root package name */
    public final long f178211j;

    /* renamed from: k, reason: collision with root package name */
    public final int f178212k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final n f178213l;

    /* renamed from: m, reason: collision with root package name */
    public final int f178214m;

    /* renamed from: n, reason: collision with root package name */
    public final int f178215n;

    /* renamed from: o, reason: collision with root package name */
    public final int f178216o;

    /* compiled from: AccordionStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/accordion/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/accordion/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.accordion.a$a, reason: collision with other inner class name */
    public static final class C5252a implements c<a> {
        public /* synthetic */ C5252a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@f0 int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178956a);
            a aVarC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarC;
        }

        @k
        public static a c(@k TypedArray typedArray, @k Context context) {
            return new a(AK.c.d(typedArray, 17, 0, com.avito.android.lib.design.text_view.d.f180938a, context), typedArray.getDimensionPixelSize(10, 0), typedArray.getDimensionPixelSize(6, 0), typedArray.getDrawable(1), typedArray.getDimensionPixelSize(4, 0), typedArray.getDimensionPixelSize(5, 0), typedArray.getDimensionPixelSize(2, 0), typedArray.getDimensionPixelSize(3, 0), typedArray.getDimensionPixelOffset(13, 0), typedArray.getInteger(0, 0), typedArray.getResourceId(11, 0), com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(9, 0), context), typedArray.getResourceId(14, 0), typedArray.getDimensionPixelSize(15, 0), typedArray.getDimensionPixelSize(7, 0));
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C5252a() {
        }
    }

    public a() {
        this(null, 0, 0, null, 0, 0, 0, 0, 0, 0L, 0, null, 0, 0, 0, 32767, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f178202a, aVar.f178202a) && this.f178203b == aVar.f178203b && this.f178204c == aVar.f178204c && L.f(this.f178205d, aVar.f178205d) && this.f178206e == aVar.f178206e && this.f178207f == aVar.f178207f && this.f178208g == aVar.f178208g && this.f178209h == aVar.f178209h && this.f178210i == aVar.f178210i && this.f178211j == aVar.f178211j && this.f178212k == aVar.f178212k && L.f(this.f178213l, aVar.f178213l) && this.f178214m == aVar.f178214m && this.f178215n == aVar.f178215n && this.f178216o == aVar.f178216o;
    }

    public final int hashCode() {
        n nVar = this.f178202a;
        int iE2 = r.e(this.f178204c, r.e(this.f178203b, (nVar == null ? 0 : nVar.hashCode()) * 31, 31), 31);
        Drawable drawable = this.f178205d;
        int iE3 = r.e(this.f178212k, r.g(r.e(this.f178210i, r.e(this.f178209h, r.e(this.f178208g, r.e(this.f178207f, r.e(this.f178206e, (iE2 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.f178211j), 31);
        n nVar2 = this.f178213l;
        return Integer.hashCode(this.f178216o) + r.e(this.f178215n, r.e(this.f178214m, (iE3 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccordionStyle(titleTextStyle=");
        sb2.append(this.f178202a);
        sb2.append(", contentTopPadding=");
        sb2.append(this.f178203b);
        sb2.append(", bottomPadding=");
        sb2.append(this.f178204c);
        sb2.append(", arrowIcon=");
        sb2.append(this.f178205d);
        sb2.append(", arrowTextSpacing=");
        sb2.append(this.f178206e);
        sb2.append(", arrowVerticalOffset=");
        sb2.append(this.f178207f);
        sb2.append(", arrowLeftInset=");
        sb2.append(this.f178208g);
        sb2.append(", arrowRightInset=");
        sb2.append(this.f178209h);
        sb2.append(", spinnerHeight=");
        sb2.append(this.f178210i);
        sb2.append(", animationDuration=");
        sb2.append(this.f178211j);
        sb2.append(", customContentResourceId=");
        sb2.append(this.f178212k);
        sb2.append(", contentTextStyle=");
        sb2.append(this.f178213l);
        sb2.append(", accessoryResourceId=");
        sb2.append(this.f178214m);
        sb2.append(", titlePaddingHorizontal=");
        sb2.append(this.f178215n);
        sb2.append(", contentPaddingHorizontal=");
        return r.t(sb2, this.f178216o, ')');
    }

    public a(@l n nVar, int i12, int i13, @l Drawable drawable, int i14, int i15, int i16, int i17, int i18, long j12, int i19, @l n nVar2, int i22, @U int i23, @U int i24) {
        this.f178202a = nVar;
        this.f178203b = i12;
        this.f178204c = i13;
        this.f178205d = drawable;
        this.f178206e = i14;
        this.f178207f = i15;
        this.f178208g = i16;
        this.f178209h = i17;
        this.f178210i = i18;
        this.f178211j = j12;
        this.f178212k = i19;
        this.f178213l = nVar2;
        this.f178214m = i22;
        this.f178215n = i23;
        this.f178216o = i24;
    }

    public /* synthetic */ a(n nVar, int i12, int i13, Drawable drawable, int i14, int i15, int i16, int i17, int i18, long j12, int i19, n nVar2, int i22, int i23, int i24, int i25, C42822w c42822w) {
        this((i25 & 1) != 0 ? null : nVar, (i25 & 2) != 0 ? 0 : i12, (i25 & 4) != 0 ? 0 : i13, (i25 & 8) != 0 ? null : drawable, (i25 & 16) != 0 ? 0 : i14, (i25 & 32) != 0 ? 0 : i15, (i25 & 64) != 0 ? 0 : i16, (i25 & 128) != 0 ? 0 : i17, (i25 & 256) != 0 ? 0 : i18, (i25 & 512) != 0 ? 0L : j12, (i25 & 1024) != 0 ? 0 : i19, (i25 & 2048) == 0 ? nVar2 : null, (i25 & 4096) != 0 ? 0 : i22, (i25 & 8192) != 0 ? 0 : i23, (i25 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i24);
    }
}

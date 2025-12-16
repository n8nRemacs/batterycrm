package sV;

import LV.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import j.InterfaceC42156l;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PageIndicatorStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LsV/b;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sV.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48111b {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f437674l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f437675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f437676b;

    /* renamed from: c, reason: collision with root package name */
    public final int f437677c;

    /* renamed from: d, reason: collision with root package name */
    public final int f437678d;

    /* renamed from: e, reason: collision with root package name */
    public final int f437679e;

    /* renamed from: f, reason: collision with root package name */
    public final int f437680f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C48110a f437681g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C48110a f437682h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C48110a f437683i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C48110a f437684j;

    /* renamed from: k, reason: collision with root package name */
    public final long f437685k;

    /* compiled from: PageIndicatorStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LsV/b$a;", "LLV/c;", "LsV/b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sV.b$a */
    public static final class a implements c<C48111b> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static C48111b b(@k TypedArray typedArray, @k Context context) {
            return new C48111b(typedArray.getColor(1, 0), typedArray.getDimensionPixelSize(2, 0), typedArray.getDimensionPixelSize(4, 0), typedArray.getDimensionPixelSize(5, 0), typedArray.getDimensionPixelSize(3, 0), typedArray.getColor(10, 0), c(typedArray.getResourceId(6, 0), context), c(typedArray.getResourceId(7, 0), context), c(typedArray.getResourceId(8, 0), context), c(typedArray.getResourceId(9, 0), context), typedArray.getInt(0, 0));
        }

        public static final C48110a c(@f0 int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178969g0);
            C48110a c48110a = new C48110a(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getColor(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            typedArrayObtainStyledAttributes.recycle();
            return c48110a;
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178967f0);
            C48111b c48111bB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return c48111bB;
        }

        public a() {
        }
    }

    public C48111b(@InterfaceC42156l int i12, @U int i13, @U int i14, @U int i15, @U int i16, @InterfaceC42156l int i17, @k C48110a c48110a, @k C48110a c48110a2, @k C48110a c48110a3, @k C48110a c48110a4, long j12) {
        this.f437675a = i12;
        this.f437676b = i13;
        this.f437677c = i14;
        this.f437678d = i15;
        this.f437679e = i16;
        this.f437680f = i17;
        this.f437681g = c48110a;
        this.f437682h = c48110a2;
        this.f437683i = c48110a3;
        this.f437684j = c48110a4;
        this.f437685k = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48111b)) {
            return false;
        }
        C48111b c48111b = (C48111b) obj;
        return this.f437675a == c48111b.f437675a && this.f437676b == c48111b.f437676b && this.f437677c == c48111b.f437677c && this.f437678d == c48111b.f437678d && this.f437679e == c48111b.f437679e && this.f437680f == c48111b.f437680f && L.f(this.f437681g, c48111b.f437681g) && L.f(this.f437682h, c48111b.f437682h) && L.f(this.f437683i, c48111b.f437683i) && L.f(this.f437684j, c48111b.f437684j) && this.f437685k == c48111b.f437685k;
    }

    public final int hashCode() {
        return Long.hashCode(this.f437685k) + ((this.f437684j.hashCode() + ((this.f437683i.hashCode() + ((this.f437682h.hashCode() + ((this.f437681g.hashCode() + r.e(this.f437680f, r.e(this.f437679e, r.e(this.f437678d, r.e(this.f437677c, r.e(this.f437676b, Integer.hashCode(this.f437675a) * 31, 31), 31), 31), 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageIndicatorStyle(backgroundColor=");
        sb2.append(this.f437675a);
        sb2.append(", cornerRadius=");
        sb2.append(this.f437676b);
        sb2.append(", paddingHorizontal=");
        sb2.append(this.f437677c);
        sb2.append(", paddingVertical=");
        sb2.append(this.f437678d);
        sb2.append(", dotsSpacing=");
        sb2.append(this.f437679e);
        sb2.append(", visitedDotsColor=");
        sb2.append(this.f437680f);
        sb2.append(", selectedDotStyle=");
        sb2.append(this.f437681g);
        sb2.append(", unselectedPrimaryDotStyle=");
        sb2.append(this.f437682h);
        sb2.append(", unselectedSecondaryDotStyle=");
        sb2.append(this.f437683i);
        sb2.append(", unselectedTertiaryDotStyle=");
        sb2.append(this.f437684j);
        sb2.append(", animationDuration=");
        return r.u(sb2, this.f437685k, ')');
    }

    public /* synthetic */ C48111b(int i12, int i13, int i14, int i15, int i16, int i17, C48110a c48110a, C48110a c48110a2, C48110a c48110a3, C48110a c48110a4, long j12, int i18, C42822w c42822w) {
        this((i18 & 1) != 0 ? 0 : i12, (i18 & 2) != 0 ? 0 : i13, (i18 & 4) != 0 ? 0 : i14, (i18 & 8) != 0 ? 0 : i15, (i18 & 16) != 0 ? 0 : i16, (i18 & 32) != 0 ? 0 : i17, c48110a, c48110a2, c48110a3, c48110a4, (i18 & 1024) != 0 ? 0L : j12);
    }
}

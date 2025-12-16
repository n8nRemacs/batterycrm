package UU;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ButtonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUU/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f16385a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f16386b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16387c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16388d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16389e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.a<G0> f16390f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Drawable f16391g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Drawable f16392h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y41.a<G0> f16393i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16394j;

    public a() {
        this(null, null, false, false, false, null, null, null, null, false, 1023, null);
    }

    public static a a(a aVar, CharSequence charSequence, boolean z12, boolean z13, boolean z14, Y41.a aVar2, int i12) {
        CharSequence charSequence2 = (i12 & 1) != 0 ? aVar.f16385a : charSequence;
        String str = aVar.f16386b;
        boolean z15 = (i12 & 4) != 0 ? aVar.f16387c : z12;
        boolean z16 = (i12 & 8) != 0 ? aVar.f16388d : z13;
        boolean z17 = (i12 & 16) != 0 ? aVar.f16389e : z14;
        Y41.a aVar3 = (i12 & 32) != 0 ? aVar.f16390f : aVar2;
        Drawable drawable = aVar.f16391g;
        Drawable drawable2 = aVar.f16392h;
        Y41.a<G0> aVar4 = aVar.f16393i;
        boolean z18 = aVar.f16394j;
        aVar.getClass();
        return new a(charSequence2, str, z15, z16, z17, aVar3, drawable, drawable2, aVar4, z18);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f16385a, aVar.f16385a) && L.f(this.f16386b, aVar.f16386b) && this.f16387c == aVar.f16387c && this.f16388d == aVar.f16388d && this.f16389e == aVar.f16389e && L.f(this.f16390f, aVar.f16390f) && L.f(this.f16391g, aVar.f16391g) && L.f(this.f16392h, aVar.f16392h) && L.f(this.f16393i, aVar.f16393i) && this.f16394j == aVar.f16394j;
    }

    public final int hashCode() {
        int iHashCode = this.f16385a.hashCode() * 31;
        String str = this.f16386b;
        int i12 = r.i(r.i(r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16387c), 31, this.f16388d), 31, this.f16389e);
        Y41.a<G0> aVar = this.f16390f;
        int iHashCode2 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Drawable drawable = this.f16391g;
        int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f16392h;
        int iHashCode4 = (iHashCode3 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f16393i;
        return Boolean.hashCode(this.f16394j) + ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonState(text=");
        sb2.append((Object) this.f16385a);
        sb2.append(", subtitle=");
        sb2.append(this.f16386b);
        sb2.append(", enabled=");
        sb2.append(this.f16387c);
        sb2.append(", loading=");
        sb2.append(this.f16388d);
        sb2.append(", isClickable=");
        sb2.append(this.f16389e);
        sb2.append(", onClick=");
        sb2.append(this.f16390f);
        sb2.append(", iconStart=");
        sb2.append(this.f16391g);
        sb2.append(", iconEnd=");
        sb2.append(this.f16392h);
        sb2.append(", onRightIconClick=");
        sb2.append(this.f16393i);
        sb2.append(", applyIconColor=");
        return r.x(sb2, this.f16394j, ')');
    }

    public a(@k CharSequence charSequence, @l String str, boolean z12, boolean z13, boolean z14, @l Y41.a<G0> aVar, @l Drawable drawable, @l Drawable drawable2, @l Y41.a<G0> aVar2, boolean z15) {
        this.f16385a = charSequence;
        this.f16386b = str;
        this.f16387c = z12;
        this.f16388d = z13;
        this.f16389e = z14;
        this.f16390f = aVar;
        this.f16391g = drawable;
        this.f16392h = drawable2;
        this.f16393i = aVar2;
        this.f16394j = z15;
    }

    public /* synthetic */ a(CharSequence charSequence, String str, boolean z12, boolean z13, boolean z14, Y41.a aVar, Drawable drawable, Drawable drawable2, Y41.a aVar2, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : charSequence, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? true : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? true : z14, (i12 & 32) != 0 ? null : aVar, (i12 & 64) != 0 ? null : drawable, (i12 & 128) != 0 ? null : drawable2, (i12 & 256) == 0 ? aVar2 : null, (i12 & 512) == 0 ? z15 : true);
    }
}

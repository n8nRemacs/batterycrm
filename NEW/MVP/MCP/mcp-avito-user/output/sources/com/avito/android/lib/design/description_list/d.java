package com.avito.android.lib.design.description_list;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import j.InterfaceC42156l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionListStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/description_list/d;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f179028j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f179029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f179030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n f179031c;

    /* renamed from: d, reason: collision with root package name */
    public final int f179032d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C35763c0 f179033e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f179034f;

    /* renamed from: g, reason: collision with root package name */
    public final int f179035g;

    /* renamed from: h, reason: collision with root package name */
    public final int f179036h;

    /* renamed from: i, reason: collision with root package name */
    public final int f179037i;

    /* compiled from: DescriptionListStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/description_list/d$a;", "LLV/c;", "Lcom/avito/android/lib/design/description_list/d;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<d> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static d b(@k TypedArray typedArray, @k Context context) {
            n nVarD = AK.c.d(typedArray, 5, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            n nVarA = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(5, 0), context);
            int color = typedArray.getColor(0, 0);
            int color2 = typedArray.getColor(4, 0);
            ColorStateList colorStateListA = x.a(typedArray, context, 6);
            return new d(nVarD, color, nVarA, color2, colorStateListA != null ? C35771d0.b(colorStateListA) : null, null, kotlin.math.b.b(typedArray.getDimension(3, 0.0f)), kotlin.math.b.b(typedArray.getDimension(2, 0.0f)), kotlin.math.b.b(typedArray.getDimension(1, 0.0f)), 32, null);
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178992s);
            d dVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return dVarB;
        }

        public a() {
        }
    }

    public d(@k n nVar, @InterfaceC42156l int i12, @k n nVar2, @InterfaceC42156l int i13, @l C35763c0 c35763c0, @l Integer num, int i14, int i15, int i16) {
        this.f179029a = nVar;
        this.f179030b = i12;
        this.f179031c = nVar2;
        this.f179032d = i13;
        this.f179033e = c35763c0;
        this.f179034f = num;
        this.f179035g = i14;
        this.f179036h = i15;
        this.f179037i = i16;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f179029a, dVar.f179029a) && this.f179030b == dVar.f179030b && L.f(this.f179031c, dVar.f179031c) && this.f179032d == dVar.f179032d && L.f(this.f179033e, dVar.f179033e) && L.f(this.f179034f, dVar.f179034f) && this.f179035g == dVar.f179035g && this.f179036h == dVar.f179036h && this.f179037i == dVar.f179037i;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f179032d, (this.f179031c.hashCode() + r.e(this.f179030b, this.f179029a.hashCode() * 31, 31)) * 31, 31);
        C35763c0 c35763c0 = this.f179033e;
        int iHashCode = (iE2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        Integer num = this.f179034f;
        return Integer.hashCode(this.f179037i) + r.e(this.f179036h, r.e(this.f179035g, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionListStyle(leftTextStyle=");
        sb2.append(this.f179029a);
        sb2.append(", leftTextColor=");
        sb2.append(this.f179030b);
        sb2.append(", rightTextStyle=");
        sb2.append(this.f179031c);
        sb2.append(", rightTextColor=");
        sb2.append(this.f179032d);
        sb2.append(", iconColor=");
        sb2.append(this.f179033e);
        sb2.append(", iconHorizontalInset=");
        sb2.append(this.f179034f);
        sb2.append(", itemVerticalInset=");
        sb2.append(this.f179035g);
        sb2.append(", listPaddingTop=");
        sb2.append(this.f179036h);
        sb2.append(", listPaddingBottom=");
        return r.t(sb2, this.f179037i, ')');
    }

    public /* synthetic */ d(n nVar, int i12, n nVar2, int i13, C35763c0 c35763c0, Integer num, int i14, int i15, int i16, int i17, C42822w c42822w) {
        this(nVar, i12, nVar2, i13, c35763c0, (i17 & 32) != 0 ? null : num, i14, i15, i16);
    }
}

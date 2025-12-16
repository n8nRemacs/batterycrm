package com.avito.android.lib.design.time_line;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35771d0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimeLineStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/time_line/s;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class s {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f181035h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PK0.n f181036a;

    /* renamed from: b, reason: collision with root package name */
    public final int f181037b;

    /* renamed from: c, reason: collision with root package name */
    public final int f181038c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PK0.n f181039d;

    /* renamed from: e, reason: collision with root package name */
    public final int f181040e;

    /* renamed from: f, reason: collision with root package name */
    public final int f181041f;

    /* renamed from: g, reason: collision with root package name */
    public final int f181042g;

    /* compiled from: TimeLineStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/time_line/s$a;", "LLV/c;", "Lcom/avito/android/lib/design/time_line/s;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<s> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static s b(@Y61.k TypedArray typedArray, @Y61.k Context context) {
            PK0.n nVarD = AK.c.d(typedArray, 2, 0, com.avito.android.lib.design.text_view.d.f180938a, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 0);
            int iD2 = colorStateListA != null ? C35771d0.b(colorStateListA).f318848a : C35835l0.d(R.attr.black, context);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 1);
            int iD3 = colorStateListA2 != null ? C35771d0.b(colorStateListA2).f318848a : C35835l0.d(R.attr.black, context);
            PK0.n nVarA = com.avito.android.lib.design.text_view.d.a(typedArray.getResourceId(5, 0), context);
            ColorStateList colorStateListA3 = x.a(typedArray, context, 3);
            int iD4 = colorStateListA3 != null ? C35771d0.b(colorStateListA3).f318848a : C35835l0.d(R.attr.gray20, context);
            ColorStateList colorStateListA4 = x.a(typedArray, context, 4);
            return new s(nVarD, iD2, iD3, nVarA, iD4, colorStateListA4 != null ? C35771d0.b(colorStateListA4).f318848a : C35835l0.d(R.attr.gray54, context), typedArray.getDimensionPixelSize(6, y6.b(2)));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178940P0);
            s sVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return sVarB;
        }

        public a() {
        }
    }

    public s(@Y61.k PK0.n nVar, int i12, int i13, @Y61.k PK0.n nVar2, int i14, int i15, int i16) {
        this.f181036a = nVar;
        this.f181037b = i12;
        this.f181038c = i13;
        this.f181039d = nVar2;
        this.f181040e = i14;
        this.f181041f = i15;
        this.f181042g = i16;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f181036a, sVar.f181036a) && this.f181037b == sVar.f181037b && this.f181038c == sVar.f181038c && L.f(this.f181039d, sVar.f181039d) && this.f181040e == sVar.f181040e && this.f181041f == sVar.f181041f && this.f181042g == sVar.f181042g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f181042g) + androidx.appcompat.app.r.e(this.f181041f, androidx.appcompat.app.r.e(this.f181040e, (this.f181039d.hashCode() + androidx.appcompat.app.r.e(this.f181038c, androidx.appcompat.app.r.e(this.f181037b, this.f181036a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeLineStyle(activeTextStyle=");
        sb2.append(this.f181036a);
        sb2.append(", activeColor=");
        sb2.append(this.f181037b);
        sb2.append(", activeTextColor=");
        sb2.append(this.f181038c);
        sb2.append(", inactiveTextStyle=");
        sb2.append(this.f181039d);
        sb2.append(", inactiveColor=");
        sb2.append(this.f181040e);
        sb2.append(", inactiveTextColor=");
        sb2.append(this.f181041f);
        sb2.append(", lineThickness=");
        return androidx.appcompat.app.r.t(sb2, this.f181042g, ')');
    }
}

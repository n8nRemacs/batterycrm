package l3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import j3.C42187a;
import k3.InterfaceC42487e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TextStyleData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ll3/i;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class i {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final a f413422l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Float f413423a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.akita.view.foundation.util.a f413424b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Typeface f413425c;

    /* renamed from: d, reason: collision with root package name */
    public final int f413426d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f413427e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f413428f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f413429g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final com.akita.view.foundation.util.a f413430h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Typeface f413431i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f413432j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f413433k;

    /* compiled from: TextStyleData.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll3/i$a;", "Lk3/e;", "Ll3/i;", "<init>", "()V", "", "setCustomColorProps", "Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC42487e<i> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static i a(@Y61.k TypedArray typedArray, @Y61.k Context context) throws Resources.NotFoundException {
            com.akita.view.foundation.util.a aVar;
            Typeface typeface;
            int resourceId = typedArray.getResourceId(2, 0);
            Integer numValueOf = Integer.valueOf(resourceId);
            if (resourceId == 0) {
                numValueOf = null;
            }
            ColorStateList colorStateList = numValueOf != null ? androidx.core.content.d.getColorStateList(context, numValueOf.intValue()) : null;
            if (colorStateList != null) {
                a aVar2 = i.f413422l;
                aVar = new com.akita.view.foundation.util.a(colorStateList, false);
            } else {
                aVar = null;
            }
            int resourceId2 = typedArray.getResourceId(8, 0);
            Integer numValueOf2 = !typedArray.hasValue(7) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(7, 0));
            Integer numValueOf3 = !typedArray.hasValue(9) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(9, 0));
            Integer numValueOf4 = !typedArray.hasValue(3) ? null : Integer.valueOf(typedArray.getColor(3, 0));
            int resourceId3 = typedArray.getResourceId(5, 0);
            Integer numValueOf5 = Integer.valueOf(resourceId3);
            if (resourceId3 == 0) {
                numValueOf5 = null;
            }
            if (numValueOf5 != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(numValueOf5.intValue(), C42187a.b.f405423a);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
                Integer numValueOf6 = Integer.valueOf(resourceId4);
                if (resourceId4 == 0) {
                    numValueOf6 = null;
                }
                Typeface typefaceC = numValueOf6 != null ? androidx.core.content.res.i.c(numValueOf6.intValue(), context) : null;
                typedArrayObtainStyledAttributes.recycle();
                typeface = typefaceC;
            } else {
                typeface = null;
            }
            int resourceId5 = typedArray.getResourceId(4, 0);
            Integer numValueOf7 = Integer.valueOf(resourceId5);
            if (resourceId5 == 0) {
                numValueOf7 = null;
            }
            return new i(!typedArray.hasValue(1) ? null : Float.valueOf(typedArray.getDimension(1, 0.0f)), aVar, numValueOf7 != null ? androidx.core.content.res.i.c(numValueOf7.intValue(), context) : null, resourceId2, numValueOf2, numValueOf3, numValueOf4, aVar, typeface, !typedArray.hasValue(11) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(11, 0)), typedArray.hasValue(12) ? Integer.valueOf(typedArray.getDimensionPixelSize(12, 0)) : null);
        }

        public a() {
        }
    }

    public i() {
        this(null, null, null, 0, null, null, null, null, null, null, null, 2047, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f413423a, iVar.f413423a) && L.f(this.f413424b, iVar.f413424b) && L.f(this.f413425c, iVar.f413425c) && this.f413426d == iVar.f413426d && L.f(this.f413427e, iVar.f413427e) && L.f(this.f413428f, iVar.f413428f) && L.f(this.f413429g, iVar.f413429g) && L.f(this.f413430h, iVar.f413430h) && L.f(this.f413431i, iVar.f413431i) && L.f(this.f413432j, iVar.f413432j) && L.f(this.f413433k, iVar.f413433k);
    }

    public final int hashCode() {
        Float f12 = this.f413423a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        com.akita.view.foundation.util.a aVar = this.f413424b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Typeface typeface = this.f413425c;
        int iE2 = r.e(this.f413426d, (iHashCode2 + (typeface == null ? 0 : typeface.hashCode())) * 31, 31);
        Integer num = this.f413427e;
        int iHashCode3 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f413428f;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f413429g;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        com.akita.view.foundation.util.a aVar2 = this.f413430h;
        int iHashCode6 = (iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Typeface typeface2 = this.f413431i;
        int iHashCode7 = (iHashCode6 + (typeface2 == null ? 0 : typeface2.hashCode())) * 31;
        Integer num4 = this.f413432j;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f413433k;
        return iHashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyleData(textSize=");
        sb2.append(this.f413423a);
        sb2.append(", textColor=");
        sb2.append(this.f413424b);
        sb2.append(", font=");
        sb2.append(this.f413425c);
        sb2.append(", linkStyle=");
        sb2.append(this.f413426d);
        sb2.append(", lineHeight=");
        sb2.append(this.f413427e);
        sb2.append(", paragraphSpacing=");
        sb2.append(this.f413428f);
        sb2.append(", textColorLink=");
        sb2.append(this.f413429g);
        sb2.append(", textIconColor=");
        sb2.append(this.f413430h);
        sb2.append(", textIconFont=");
        sb2.append(this.f413431i);
        sb2.append(", firstBaselineToTopHeight=");
        sb2.append(this.f413432j);
        sb2.append(", lastBaselineToBottomHeight=");
        return s.j(sb2, this.f413433k, ')');
    }

    public i(@Y61.l Float f12, @Y61.l com.akita.view.foundation.util.a aVar, @Y61.l Typeface typeface, int i12, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l com.akita.view.foundation.util.a aVar2, @Y61.l Typeface typeface2, @Y61.l Integer num4, @Y61.l Integer num5) {
        this.f413423a = f12;
        this.f413424b = aVar;
        this.f413425c = typeface;
        this.f413426d = i12;
        this.f413427e = num;
        this.f413428f = num2;
        this.f413429g = num3;
        this.f413430h = aVar2;
        this.f413431i = typeface2;
        this.f413432j = num4;
        this.f413433k = num5;
    }

    public /* synthetic */ i(Float f12, com.akita.view.foundation.util.a aVar, Typeface typeface, int i12, Integer num, Integer num2, Integer num3, com.akita.view.foundation.util.a aVar2, Typeface typeface2, Integer num4, Integer num5, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : f12, (i13 & 2) != 0 ? null : aVar, (i13 & 4) != 0 ? null : typeface, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : num2, (i13 & 64) != 0 ? null : num3, (i13 & 128) != 0 ? null : aVar2, (i13 & 256) != 0 ? null : typeface2, (i13 & 512) != 0 ? null : num4, (i13 & 1024) == 0 ? num5 : null);
    }
}

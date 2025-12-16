package com.avito.android.lib.design.chips.ui;

import VU.a;
import VU.b;
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
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChipsStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/g;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class g {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f178794f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f178795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178796b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f178797c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f178798d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f178799e;

    /* compiled from: ChipsStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/g$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final VU.b f178800a;

        /* renamed from: b, reason: collision with root package name */
        public final int f178801b;

        /* renamed from: c, reason: collision with root package name */
        public final int f178802c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final VU.a f178803d;

        public a(@k VU.b bVar, int i12, int i13, @l VU.a aVar) {
            this.f178800a = bVar;
            this.f178801b = i12;
            this.f178802c = i13;
            this.f178803d = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f178800a, aVar.f178800a) && this.f178801b == aVar.f178801b && this.f178802c == aVar.f178802c && L.f(this.f178803d, aVar.f178803d);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f178802c, r.e(this.f178801b, this.f178800a.hashCode() * 31, 31), 31);
            VU.a aVar = this.f178803d;
            return iE2 + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "ChipsItemStyle(buttonStyle=" + this.f178800a + ", overlayItemTopPadding=" + this.f178801b + ", overlayItemRightPadding=" + this.f178802c + ", buttonBackground=" + this.f178803d + ')';
        }
    }

    /* compiled from: ChipsStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/chips/ui/g$b;", "LLV/c;", "Lcom/avito/android/lib/design/chips/ui/g;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements LV.c<g> {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public static a b(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f179006z);
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(2, 0), d.n.f179002x);
            ColorStateList colorStateListA = x.a(typedArrayObtainStyledAttributes, context, 0);
            a.c cVar = null;
            cVar = null;
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            if (c35763c0B != null && dimensionPixelSize > 0) {
                a.d.C1181a c1181a = a.d.f17146a;
                ColorStateList colorStateListA2 = x.a(typedArrayObtainStyledAttributes2, context, 13);
                C35763c0 c35763c0 = colorStateListA2 != null ? new C35763c0(colorStateListA2, true) : null;
                ColorStateList colorStateListA3 = x.a(typedArrayObtainStyledAttributes2, context, 14);
                C35763c0 c35763c02 = colorStateListA3 != null ? new C35763c0(colorStateListA3, true) : null;
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(19, 0);
                c1181a.getClass();
                cVar = new a.c(c35763c0, c35763c02, dimensionPixelSize2, c35763c0B, dimensionPixelSize);
            }
            VU.b.f17147t.getClass();
            a aVar = new a(b.a.d(typedArrayObtainStyledAttributes2, context), typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0), cVar);
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes2.recycle();
            return aVar;
        }

        @k
        public static g c(@f0 int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f179004y);
            g gVarD = d(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return gVarD;
        }

        @k
        public static g d(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            return new g(typedArray.getDimensionPixelSize(10, 0), typedArray.getDimensionPixelSize(12, 0), b(typedArray.getResourceId(33, 0), context), b(typedArray.getResourceId(45, 0), context), b(typedArray.getResourceId(28, 0), context));
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return c(i12, context);
        }

        public b() {
        }
    }

    public g(@U int i12, @U int i13, @k a aVar, @k a aVar2, @k a aVar3) {
        this.f178795a = i12;
        this.f178796b = i13;
        this.f178797c = aVar;
        this.f178798d = aVar2;
        this.f178799e = aVar3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f178795a == gVar.f178795a && this.f178796b == gVar.f178796b && L.f(this.f178797c, gVar.f178797c) && L.f(this.f178798d, gVar.f178798d) && L.f(this.f178799e, gVar.f178799e);
    }

    public final int hashCode() {
        return this.f178799e.hashCode() + ((this.f178798d.hashCode() + ((this.f178797c.hashCode() + r.e(this.f178796b, Integer.hashCode(this.f178795a) * 31, 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ChipsStyle(childVerticalSpacing=" + this.f178795a + ", childHorizontalSpacing=" + this.f178796b + ", selectedStyle=" + this.f178797c + ", unselectedStyle=" + this.f178798d + ", notActiveStyle=" + this.f178799e + ')';
    }
}

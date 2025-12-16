package com.avito.android.lib.design.content_placeholder;

import LV.c;
import PK0.n;
import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import j.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContentPlaceholderStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final C5264a f178895n = new C5264a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final n f178896a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final n f178897b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f178898c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f178899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f178900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f178901f;

    /* renamed from: g, reason: collision with root package name */
    public final int f178902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f178903h;

    /* renamed from: i, reason: collision with root package name */
    public final int f178904i;

    /* renamed from: j, reason: collision with root package name */
    public final int f178905j;

    /* renamed from: k, reason: collision with root package name */
    public final int f178906k;

    /* renamed from: l, reason: collision with root package name */
    public final int f178907l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Drawable f178908m;

    /* compiled from: ContentPlaceholderStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/a$a;", "LLV/c;", "Lcom/avito/android/lib/design/content_placeholder/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.content_placeholder.a$a, reason: collision with other inner class name */
    public static final class C5264a implements c<a> {
        public /* synthetic */ C5264a(C42822w c42822w) {
            this();
        }

        @k
        public static a b(@k TypedArray typedArray, @k Context context) {
            n nVarD = AK.c.d(typedArray, 11, 0, d.f180938a, context);
            n nVarA = d.a(typedArray.getResourceId(9, 0), context);
            b.a aVar = b.f17147t;
            int resourceId = typedArray.getResourceId(1, 0);
            aVar.getClass();
            b bVarC = b.a.c(resourceId, context);
            ColorStateList colorStateListA = x.a(typedArray, context, 0);
            return new a(nVarD, nVarA, bVarC, colorStateListA != null ? C35771d0.b(colorStateListA) : null, typedArray.getDimensionPixelSize(2, 0), typedArray.getDimensionPixelSize(7, 0), typedArray.getDimensionPixelSize(8, 0), typedArray.getDimensionPixelSize(6, 0), typedArray.getDimensionPixelSize(5, 0), typedArray.getDimensionPixelSize(4, 0), typedArray.getDimensionPixelSize(12, 0), typedArray.getDimensionPixelSize(10, 0), x.b(typedArray, context, 3));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178986p);
            a aVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return aVarB;
        }

        public C5264a() {
        }
    }

    public a(@l n nVar, @l n nVar2, @l b bVar, @l C35763c0 c35763c0, @U int i12, @U int i13, @U int i14, @U int i15, @U int i16, @U int i17, @U int i18, @U int i19, @l Drawable drawable) {
        this.f178896a = nVar;
        this.f178897b = nVar2;
        this.f178898c = bVar;
        this.f178899d = c35763c0;
        this.f178900e = i12;
        this.f178901f = i13;
        this.f178902g = i14;
        this.f178903h = i15;
        this.f178904i = i16;
        this.f178905j = i17;
        this.f178906k = i18;
        this.f178907l = i19;
        this.f178908m = drawable;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f178896a, aVar.f178896a) && L.f(this.f178897b, aVar.f178897b) && L.f(this.f178898c, aVar.f178898c) && L.f(this.f178899d, aVar.f178899d) && this.f178900e == aVar.f178900e && this.f178901f == aVar.f178901f && this.f178902g == aVar.f178902g && this.f178903h == aVar.f178903h && this.f178904i == aVar.f178904i && this.f178905j == aVar.f178905j && this.f178906k == aVar.f178906k && this.f178907l == aVar.f178907l && L.f(this.f178908m, aVar.f178908m);
    }

    public final int hashCode() {
        n nVar = this.f178896a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        n nVar2 = this.f178897b;
        int iHashCode2 = (iHashCode + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        b bVar = this.f178898c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C35763c0 c35763c0 = this.f178899d;
        int iE2 = r.e(this.f178907l, r.e(this.f178906k, r.e(this.f178905j, r.e(this.f178904i, r.e(this.f178903h, r.e(this.f178902g, r.e(this.f178901f, r.e(this.f178900e, (iHashCode3 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Drawable drawable = this.f178908m;
        return iE2 + (drawable != null ? drawable.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ContentPlaceholderStyle(titleAppearance=" + this.f178896a + ", subtitleAppearance=" + this.f178897b + ", buttonStyle=" + this.f178898c + ", backgroundColor=" + this.f178899d + ", imageContainerSize=" + this.f178900e + ", paddingStart=" + this.f178901f + ", paddingTop=" + this.f178902g + ", paddingEnd=" + this.f178903h + ", paddingBottom=" + this.f178904i + ", imageToTextSpacing=" + this.f178905j + ", titleToSubtitleSpacing=" + this.f178906k + ", textToButtonSpacing=" + this.f178907l + ", imageSrc=" + this.f178908m + ')';
    }

    public /* synthetic */ a(n nVar, n nVar2, b bVar, C35763c0 c35763c0, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Drawable drawable, int i22, C42822w c42822w) {
        this(nVar, nVar2, bVar, c35763c0, i12, i13, i14, i15, i16, i17, i18, i19, (i22 & 4096) != 0 ? null : drawable);
    }
}

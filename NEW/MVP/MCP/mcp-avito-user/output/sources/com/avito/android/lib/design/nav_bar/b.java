package com.avito.android.lib.design.nav_bar;

import LV.c;
import PK0.n;
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
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavBarStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/b;", "", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C5290b f179844h = new C5290b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f179845a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f179846b;

    /* renamed from: c, reason: collision with root package name */
    public final int f179847c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C35763c0 f179848d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final n f179849e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C35763c0 f179850f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final n f179851g;

    /* compiled from: NavBarStyle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/b$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f179852a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Drawable f179853b;

        /* renamed from: c, reason: collision with root package name */
        public final int f179854c;

        /* renamed from: d, reason: collision with root package name */
        public final int f179855d;

        public a() {
            this(0, null, 0, 0, 15, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f179852a == aVar.f179852a && L.f(this.f179853b, aVar.f179853b) && this.f179854c == aVar.f179854c && this.f179855d == aVar.f179855d;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f179852a) * 31;
            Drawable drawable = this.f179853b;
            return Integer.hashCode(this.f179855d) + r.e(this.f179854c, (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BackButtonStyle(tint=");
            sb2.append(this.f179852a);
            sb2.append(", foreground=");
            sb2.append(this.f179853b);
            sb2.append(", marginStart=");
            sb2.append(this.f179854c);
            sb2.append(", padding=");
            return r.t(sb2, this.f179855d, ')');
        }

        public a(int i12, int i13, int i14, @l Drawable drawable) {
            this.f179852a = i12;
            this.f179853b = drawable;
            this.f179854c = i13;
            this.f179855d = i14;
        }

        public /* synthetic */ a(int i12, Drawable drawable, int i13, int i14, int i15, C42822w c42822w) {
            this((i15 & 1) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, (i15 & 2) != 0 ? null : drawable);
        }
    }

    /* compiled from: NavBarStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/nav_bar/b$b;", "LLV/c;", "Lcom/avito/android/lib/design/nav_bar/b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.nav_bar.b$b, reason: collision with other inner class name */
    public static final class C5290b implements c<b> {
        public /* synthetic */ C5290b(C42822w c42822w) {
            this();
        }

        @k
        public static b b(@k TypedArray typedArray, @k Context context) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(4, 0);
            a aVar = new a(0, null, typedArray.getDimensionPixelSize(1, 0), 0, 11, null);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(6, 0);
            ColorStateList colorStateListA = x.a(typedArray, context, 2);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 3);
            return new b(dimensionPixelSize, aVar, dimensionPixelSize2, c35763c0B, d.a(typedArray.getResourceId(5, 0), context), colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, AK.c.d(typedArray, 7, 0, d.f180938a, context));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178959b0);
            b bVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return bVarB;
        }

        public C5290b() {
        }
    }

    public b() {
        this(0, null, 0, null, null, null, null, 127, null);
    }

    public static b a(b bVar, int i12, a aVar, int i13, C35763c0 c35763c0, C35763c0 c35763c02, int i14) {
        if ((i14 & 4) != 0) {
            i13 = bVar.f179847c;
        }
        int i15 = i13;
        if ((i14 & 8) != 0) {
            c35763c0 = bVar.f179848d;
        }
        n nVar = bVar.f179849e;
        n nVar2 = bVar.f179851g;
        bVar.getClass();
        return new b(i12, aVar, i15, c35763c0, nVar, c35763c02, nVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f179845a == bVar.f179845a && L.f(this.f179846b, bVar.f179846b) && this.f179847c == bVar.f179847c && L.f(this.f179848d, bVar.f179848d) && L.f(this.f179849e, bVar.f179849e) && L.f(this.f179850f, bVar.f179850f) && L.f(this.f179851g, bVar.f179851g);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f179847c, (this.f179846b.hashCode() + (Integer.hashCode(this.f179845a) * 31)) * 31, 31);
        C35763c0 c35763c0 = this.f179848d;
        int iHashCode = (iE2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        n nVar = this.f179849e;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        C35763c0 c35763c02 = this.f179850f;
        int iHashCode3 = (iHashCode2 + (c35763c02 == null ? 0 : c35763c02.hashCode())) * 31;
        n nVar2 = this.f179851g;
        return iHashCode3 + (nVar2 != null ? nVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "NavBarStyle(paddingHorizontal=" + this.f179845a + ", backButton=" + this.f179846b + ", contentSpacing=" + this.f179847c + ", backgroundColor=" + this.f179848d + ", textActionStyle=" + this.f179849e + ", contentColor=" + this.f179850f + ", defaultTitleStyle=" + this.f179851g + ')';
    }

    public b(int i12, @k a aVar, int i13, @l C35763c0 c35763c0, @l n nVar, @l C35763c0 c35763c02, @l n nVar2) {
        this.f179845a = i12;
        this.f179846b = aVar;
        this.f179847c = i13;
        this.f179848d = c35763c0;
        this.f179849e = nVar;
        this.f179850f = c35763c02;
        this.f179851g = nVar2;
    }

    public /* synthetic */ b(int i12, a aVar, int i13, C35763c0 c35763c0, n nVar, C35763c0 c35763c02, n nVar2, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? new a(0, null, 0, 0, 15, null) : aVar, (i14 & 4) == 0 ? i13 : 0, (i14 & 8) != 0 ? null : c35763c0, (i14 & 16) != 0 ? null : nVar, (i14 & 32) != 0 ? null : c35763c02, (i14 & 64) == 0 ? nVar2 : null);
    }
}

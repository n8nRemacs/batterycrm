package com.avito.android.rating_ui.aspects.view.button;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import hw.InterfaceC41176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qh0.C47399a;

/* compiled from: RatingAspectsButtonStyle.kt */
@InterfaceC41176a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/button/c;", "", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f249919i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a.C7493a f249920a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n f249921b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n f249922c;

    /* renamed from: d, reason: collision with root package name */
    public final int f249923d;

    /* renamed from: e, reason: collision with root package name */
    public final int f249924e;

    /* renamed from: f, reason: collision with root package name */
    public final float f249925f;

    /* renamed from: g, reason: collision with root package name */
    public final int f249926g;

    /* renamed from: h, reason: collision with root package name */
    public final int f249927h;

    /* compiled from: RatingAspectsButtonStyle.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/button/c$a;", "LLV/c;", "Lcom/avito/android/rating_ui/aspects/view/button/c;", "<init>", "()V", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements LV.c<c> {

        /* compiled from: RatingAspectsButtonStyle.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/button/c$a$a;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_ui.aspects.view.button.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7493a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final C35763c0 f249928a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final C35763c0 f249929b;

            /* renamed from: c, reason: collision with root package name */
            public final int f249930c;

            public C7493a(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12) {
                this.f249928a = c35763c0;
                this.f249929b = c35763c02;
                this.f249930c = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7493a)) {
                    return false;
                }
                C7493a c7493a = (C7493a) obj;
                return L.f(this.f249928a, c7493a.f249928a) && L.f(this.f249929b, c7493a.f249929b) && this.f249930c == c7493a.f249930c;
            }

            public final int hashCode() {
                C35763c0 c35763c0 = this.f249928a;
                int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
                C35763c0 c35763c02 = this.f249929b;
                return Integer.hashCode(this.f249930c) + ((iHashCode + (c35763c02 != null ? c35763c02.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BackgroundShape(backgroundColor=");
                sb2.append(this.f249928a);
                sb2.append(", rippleColor=");
                sb2.append(this.f249929b);
                sb2.append(", cornerRadius=");
                return r.t(sb2, this.f249930c, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static c b(@k TypedArray typedArray, @k Context context) {
            ColorStateList colorStateListA = x.a(typedArray, context, 2);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 12);
            C35763c0 c35763c0B2 = colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null;
            c.f249919i.getClass();
            ColorStateList colorStateListA3 = x.a(typedArray, context, 7);
            C35763c0 c35763c0B3 = colorStateListA3 != null ? C35771d0.b(colorStateListA3) : null;
            ColorStateList colorStateListA4 = x.a(typedArray, context, 8);
            C7493a c7493a = new C7493a(c35763c0B3, colorStateListA4 != null ? C35771d0.b(colorStateListA4) : null, typedArray.getDimensionPixelSize(9, 0));
            int dimensionPixelSize = typedArray.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(4, 0);
            n nVarD = AK.c.d(typedArray, 1, 0, d.f180938a, context);
            if (c35763c0B == null) {
                c35763c0B = nVarD.f12988b;
            }
            n nVarA = n.a(nVarD, null, c35763c0B, null, null, null, null, null, null, null, 8189);
            n nVarA2 = d.a(typedArray.getResourceId(11, 0), context);
            if (c35763c0B2 == null) {
                c35763c0B2 = nVarA2.f12988b;
            }
            return new c(c7493a, nVarA, n.a(nVarA2, null, c35763c0B2, null, null, null, null, null, null, null, 8189), dimensionPixelSize, dimensionPixelSize2, typedArray.getDimension(15, 0.0f), typedArray.getDimensionPixelSize(13, 0), typedArray.getDimensionPixelSize(14, 0));
        }

        @Override // LV.c
        public final Object a(int i12, Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, C47399a.i.f429347b);
            c cVarB = b(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return cVarB;
        }

        public a() {
        }
    }

    public c(@k a.C7493a c7493a, @k n nVar, @k n nVar2, int i12, int i13, float f12, int i14, int i15) {
        this.f249920a = c7493a;
        this.f249921b = nVar;
        this.f249922c = nVar2;
        this.f249923d = i12;
        this.f249924e = i13;
        this.f249925f = f12;
        this.f249926g = i14;
        this.f249927h = i15;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f249920a, cVar.f249920a) && L.f(this.f249921b, cVar.f249921b) && L.f(this.f249922c, cVar.f249922c) && this.f249923d == cVar.f249923d && this.f249924e == cVar.f249924e && Float.compare(this.f249925f, cVar.f249925f) == 0 && this.f249926g == cVar.f249926g && this.f249927h == cVar.f249927h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f249927h) + r.e(this.f249926g, r.d(this.f249925f, r.e(this.f249924e, r.e(this.f249923d, (this.f249922c.hashCode() + ((this.f249921b.hashCode() + (this.f249920a.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAspectsButtonStyle(background=");
        sb2.append(this.f249920a);
        sb2.append(", titleStyle=");
        sb2.append(this.f249921b);
        sb2.append(", subtitleStyle=");
        sb2.append(this.f249922c);
        sb2.append(", minHeight=");
        sb2.append(this.f249923d);
        sb2.append(", minWidth=");
        sb2.append(this.f249924e);
        sb2.append(", textVerticalOffset=");
        sb2.append(this.f249925f);
        sb2.append(", textPaddingLeft=");
        sb2.append(this.f249926g);
        sb2.append(", textPaddingRight=");
        return r.t(sb2, this.f249927h, ')');
    }

    public /* synthetic */ c(a.C7493a c7493a, n nVar, n nVar2, int i12, int i13, float f12, int i14, int i15, int i16, C42822w c42822w) {
        this(c7493a, nVar, nVar2, (i16 & 8) != 0 ? 0 : i12, (i16 & 16) != 0 ? 0 : i13, (i16 & 32) != 0 ? 0.0f : f12, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? 0 : i15);
    }
}

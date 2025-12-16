package yV;

import LV.c;
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
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgressBarStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LyV/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C50177a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C12902a f443122g = new C12902a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C35763c0 f443123a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C35763c0 f443124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f443125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f443126d;

    /* renamed from: e, reason: collision with root package name */
    public final int f443127e;

    /* renamed from: f, reason: collision with root package name */
    public final int f443128f;

    /* compiled from: ProgressBarStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LyV/a$a;", "LLV/c;", "LyV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yV.a$a, reason: collision with other inner class name */
    public static final class C12902a implements c<C50177a> {
        public /* synthetic */ C12902a(C42822w c42822w) {
            this();
        }

        @k
        public static C50177a b(@f0 int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178991r0);
            try {
                return c(typedArrayObtainStyledAttributes, context);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        @k
        public static C50177a c(@k TypedArray typedArray, @k Context context) {
            ColorStateList colorStateListA = x.a(typedArray, context, 5);
            C35763c0 c35763c0B = colorStateListA != null ? C35771d0.b(colorStateListA) : null;
            ColorStateList colorStateListA2 = x.a(typedArray, context, 3);
            return new C50177a(c35763c0B, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, typedArray.getDimensionPixelSize(1, 0), typedArray.getDimensionPixelSize(0, 0), typedArray.getDimensionPixelSize(2, 0), typedArray.getDimensionPixelSize(4, 0));
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C12902a() {
        }
    }

    public C50177a() {
        this(null, null, 0, 0, 0, 0, 63, null);
    }

    public static C50177a a(C50177a c50177a, C35763c0 c35763c0, C35763c0 c35763c02, int i12) {
        if ((i12 & 1) != 0) {
            c35763c0 = c50177a.f443123a;
        }
        int i13 = c50177a.f443125c;
        int i14 = c50177a.f443126d;
        int i15 = c50177a.f443127e;
        int i16 = c50177a.f443128f;
        c50177a.getClass();
        return new C50177a(c35763c0, c35763c02, i13, i14, i15, i16);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50177a)) {
            return false;
        }
        C50177a c50177a = (C50177a) obj;
        return L.f(this.f443123a, c50177a.f443123a) && L.f(this.f443124b, c50177a.f443124b) && this.f443125c == c50177a.f443125c && this.f443126d == c50177a.f443126d && this.f443127e == c50177a.f443127e && this.f443128f == c50177a.f443128f;
    }

    public final int hashCode() {
        C35763c0 c35763c0 = this.f443123a;
        int iHashCode = (c35763c0 == null ? 0 : c35763c0.hashCode()) * 31;
        C35763c0 c35763c02 = this.f443124b;
        return Integer.hashCode(this.f443128f) + r.e(this.f443127e, r.e(this.f443126d, r.e(this.f443125c, (iHashCode + (c35763c02 != null ? c35763c02.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarStyle(trackColor=");
        sb2.append(this.f443123a);
        sb2.append(", progressColor=");
        sb2.append(this.f443124b);
        sb2.append(", height=");
        sb2.append(this.f443125c);
        sb2.append(", cornerRadius=");
        sb2.append(this.f443126d);
        sb2.append(", minEdgeWidth=");
        sb2.append(this.f443127e);
        sb2.append(", segmentSpacing=");
        return r.t(sb2, this.f443128f, ')');
    }

    public C50177a(@l C35763c0 c35763c0, @l C35763c0 c35763c02, int i12, int i13, int i14, int i15) {
        this.f443123a = c35763c0;
        this.f443124b = c35763c02;
        this.f443125c = i12;
        this.f443126d = i13;
        this.f443127e = i14;
        this.f443128f = i15;
    }

    public /* synthetic */ C50177a(C35763c0 c35763c0, C35763c0 c35763c02, int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? null : c35763c0, (i16 & 2) == 0 ? c35763c02 : null, (i16 & 4) != 0 ? 0 : i12, (i16 & 8) != 0 ? 0 : i13, (i16 & 16) != 0 ? 0 : i14, (i16 & 32) != 0 ? 0 : i15);
    }
}

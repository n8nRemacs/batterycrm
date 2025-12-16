package bV;

import LV.c;
import PK0.n;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DockingBadgeStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LbV/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C25568a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C2002a f57090g = new C2002a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final n f57091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57092b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57093c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57094d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57095e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DockingBadgeSize f57096f;

    /* compiled from: DockingBadgeStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LbV/a$a;", "LLV/c;", "LbV/a;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bV.a$a, reason: collision with other inner class name */
    public static final class C2002a implements c<C25568a> {
        public /* synthetic */ C2002a(C42822w c42822w) {
            this();
        }

        @k
        public static C25568a b(@f0 int i12, @k Context context) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178925I);
            C25568a c25568aC = c(typedArrayObtainStyledAttributes, context);
            typedArrayObtainStyledAttributes.recycle();
            return c25568aC;
        }

        @k
        @SuppressLint({"ResourceType"})
        public static C25568a c(@k TypedArray typedArray, @k Context context) throws Resources.NotFoundException {
            float dimension = context.getResources().getDimension(R.dimen.docking_badge_medium_size);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(5, 0);
            return new C25568a(AK.c.d(typedArray, 0, 0, com.avito.android.lib.design.text_view.d.f180938a, context), typedArray.getColor(1, 0), typedArray.getColor(3, 0), dimensionPixelSize, typedArray.getDimensionPixelOffset(7, 0), ((float) dimensionPixelSize) >= dimension ? DockingBadgeSize.MEDIUM : DockingBadgeSize.SMALL);
        }

        @Override // LV.c
        public final /* bridge */ /* synthetic */ Object a(int i12, Context context) {
            return b(i12, context);
        }

        public C2002a() {
        }
    }

    public C25568a(@k n nVar, int i12, int i13, @U int i14, @U int i15, @k DockingBadgeSize dockingBadgeSize) {
        this.f57091a = nVar;
        this.f57092b = i12;
        this.f57093c = i13;
        this.f57094d = i14;
        this.f57095e = i15;
        this.f57096f = dockingBadgeSize;
    }

    public static C25568a a(C25568a c25568a, n nVar, int i12, int i13, int i14, int i15, int i16) {
        if ((i16 & 1) != 0) {
            nVar = c25568a.f57091a;
        }
        n nVar2 = nVar;
        if ((i16 & 2) != 0) {
            i12 = c25568a.f57092b;
        }
        int i17 = i12;
        if ((i16 & 4) != 0) {
            i13 = c25568a.f57093c;
        }
        int i18 = i13;
        if ((i16 & 8) != 0) {
            i14 = c25568a.f57094d;
        }
        int i19 = i14;
        if ((i16 & 16) != 0) {
            i15 = c25568a.f57095e;
        }
        DockingBadgeSize dockingBadgeSize = c25568a.f57096f;
        c25568a.getClass();
        return new C25568a(nVar2, i17, i18, i19, i15, dockingBadgeSize);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25568a)) {
            return false;
        }
        C25568a c25568a = (C25568a) obj;
        return L.f(this.f57091a, c25568a.f57091a) && this.f57092b == c25568a.f57092b && this.f57093c == c25568a.f57093c && this.f57094d == c25568a.f57094d && this.f57095e == c25568a.f57095e && this.f57096f == c25568a.f57096f;
    }

    public final int hashCode() {
        return this.f57096f.hashCode() + r.e(this.f57095e, r.e(this.f57094d, r.e(this.f57093c, r.e(this.f57092b, this.f57091a.hashCode() * 31, 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "DockingBadgeStyle(textStyle=" + this.f57091a + ", textColor=" + this.f57092b + ", badgeColor=" + this.f57093c + ", height=" + this.f57094d + ", textVerticalOffset=" + this.f57095e + ", edgeSize=" + this.f57096f + ')';
    }

    public /* synthetic */ C25568a(n nVar, int i12, int i13, int i14, int i15, DockingBadgeSize dockingBadgeSize, int i16, C42822w c42822w) {
        this(nVar, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? 0 : i15, dockingBadgeSize);
    }
}

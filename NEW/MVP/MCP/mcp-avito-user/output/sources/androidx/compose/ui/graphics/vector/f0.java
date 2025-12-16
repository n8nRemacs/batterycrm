package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.H0;
import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageVector.kt */
@H0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/vector/f0;", "Landroidx/compose/ui/graphics/vector/V;", "", "name", "", "Landroidx/compose/ui/graphics/vector/h;", "pathData", "Landroidx/compose/ui/graphics/J0;", "pathFillType", "Landroidx/compose/ui/graphics/J;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/m1;", "strokeLineCap", "Landroidx/compose/ui/graphics/n1;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/J;FLandroidx/compose/ui/graphics/J;FFIIFFFFLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 extends V {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f39886b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<AbstractC22297h> f39887c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39888d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.graphics.J f39889e;

    /* renamed from: f, reason: collision with root package name */
    public final float f39890f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.graphics.J f39891g;

    /* renamed from: h, reason: collision with root package name */
    public final float f39892h;

    /* renamed from: i, reason: collision with root package name */
    public final float f39893i;

    /* renamed from: j, reason: collision with root package name */
    public final int f39894j;

    /* renamed from: k, reason: collision with root package name */
    public final int f39895k;

    /* renamed from: l, reason: collision with root package name */
    public final float f39896l;

    /* renamed from: m, reason: collision with root package name */
    public final float f39897m;

    /* renamed from: n, reason: collision with root package name */
    public final float f39898n;

    /* renamed from: o, reason: collision with root package name */
    public final float f39899o;

    public f0() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f0(String str, List list, int i12, androidx.compose.ui.graphics.J j12, float f12, androidx.compose.ui.graphics.J j13, float f13, float f14, int i13, int i14, float f15, float f16, float f17, float f18, int i15, C42822w c42822w) {
        int i16;
        int i17;
        String str2 = (i15 & 1) != 0 ? "" : str;
        androidx.compose.ui.graphics.J j14 = (i15 & 8) != 0 ? null : j12;
        float f19 = (i15 & 16) != 0 ? 1.0f : f12;
        androidx.compose.ui.graphics.J j15 = (i15 & 32) != 0 ? null : j13;
        float f22 = (i15 & 64) != 0 ? 1.0f : f13;
        float f23 = (i15 & 128) != 0 ? 0.0f : f14;
        if ((i15 & 256) != 0) {
            C42784z0 c42784z0 = U.f39811a;
            i16 = 0;
        } else {
            i16 = i13;
        }
        if ((i15 & 512) != 0) {
            C42784z0 c42784z02 = U.f39811a;
            i17 = 0;
        } else {
            i17 = i14;
        }
        this(str2, list, i12, j14, f19, j15, f22, f23, i16, i17, (i15 & 1024) != 0 ? 4.0f : f15, (i15 & 2048) != 0 ? 0.0f : f16, (i15 & 4096) != 0 ? 1.0f : f17, (i15 & 8192) != 0 ? 0.0f : f18, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (kotlin.jvm.internal.L.f(this.f39886b, f0Var.f39886b) && kotlin.jvm.internal.L.f(this.f39889e, f0Var.f39889e) && this.f39890f == f0Var.f39890f && kotlin.jvm.internal.L.f(this.f39891g, f0Var.f39891g) && this.f39892h == f0Var.f39892h && this.f39893i == f0Var.f39893i && m1.b(this.f39894j, f0Var.f39894j) && n1.b(this.f39895k, f0Var.f39895k) && this.f39896l == f0Var.f39896l && this.f39897m == f0Var.f39897m && this.f39898n == f0Var.f39898n && this.f39899o == f0Var.f39899o) {
                J0.a aVar = J0.f39288b;
                return this.f39888d == f0Var.f39888d && kotlin.jvm.internal.L.f(this.f39887c, f0Var.f39887c);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE2 = androidx.compose.foundation.H.e(this.f39886b.hashCode() * 31, 31, this.f39887c);
        androidx.compose.ui.graphics.J j12 = this.f39889e;
        int iD2 = androidx.appcompat.app.r.d(this.f39890f, (iE2 + (j12 != null ? j12.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.graphics.J j13 = this.f39891g;
        int iD3 = androidx.appcompat.app.r.d(this.f39893i, androidx.appcompat.app.r.d(this.f39892h, (iD2 + (j13 != null ? j13.hashCode() : 0)) * 31, 31), 31);
        m1.a aVar = m1.f39698b;
        int iE3 = androidx.appcompat.app.r.e(this.f39894j, iD3, 31);
        n1.a aVar2 = n1.f39707b;
        int iD4 = androidx.appcompat.app.r.d(this.f39899o, androidx.appcompat.app.r.d(this.f39898n, androidx.appcompat.app.r.d(this.f39897m, androidx.appcompat.app.r.d(this.f39896l, androidx.appcompat.app.r.e(this.f39895k, iE3, 31), 31), 31), 31), 31);
        J0.a aVar3 = J0.f39288b;
        return Integer.hashCode(this.f39888d) + iD4;
    }

    public f0(String str, List list, int i12, androidx.compose.ui.graphics.J j12, float f12, androidx.compose.ui.graphics.J j13, float f13, float f14, int i13, int i14, float f15, float f16, float f17, float f18, C42822w c42822w) {
        super(null);
        this.f39886b = str;
        this.f39887c = list;
        this.f39888d = i12;
        this.f39889e = j12;
        this.f39890f = f12;
        this.f39891g = j13;
        this.f39892h = f13;
        this.f39893i = f14;
        this.f39894j = i13;
        this.f39895k = i14;
        this.f39896l = f15;
        this.f39897m = f16;
        this.f39898n = f17;
        this.f39899o = f18;
    }
}

package androidx.compose.ui.text.font;

import androidx.compose.ui.text.InterfaceC22675w;
import androidx.compose.ui.text.font.X;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.d0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import y0.C50028a;

/* compiled from: Font.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/s0;", "Landroidx/compose/ui/text/font/D;", "", "resId", "Landroidx/compose/ui/text/font/e0;", "weight", "Landroidx/compose/ui/text/font/Z;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/d0$e;", "variationSettings", "Landroidx/compose/ui/text/font/X;", "loadingStrategy", "<init>", "(ILandroidx/compose/ui/text/font/e0;ILandroidx/compose/ui/text/font/d0$e;ILkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 implements D {

    /* renamed from: a, reason: collision with root package name */
    public final int f42303a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f42304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42305c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d0.e f42306d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42307e;

    public s0(int i12, e0 e0Var, int i13, @InterfaceC22675w d0.e eVar, int i14, C42822w c42822w) {
        this.f42303a = i12;
        this.f42304b = e0Var;
        this.f42305c = i13;
        this.f42306d = eVar;
        this.f42307e = i14;
    }

    @Override // androidx.compose.ui.text.font.D
    @InterfaceC22675w
    /* renamed from: a, reason: from getter */
    public final int getF42307e() {
        return this.f42307e;
    }

    @Override // androidx.compose.ui.text.font.D
    /* renamed from: b, reason: from getter */
    public final int getF42305c() {
        return this.f42305c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f42303a != s0Var.f42303a) {
            return false;
        }
        if (!kotlin.jvm.internal.L.f(this.f42304b, s0Var.f42304b)) {
            return false;
        }
        if (Z.b(this.f42305c, s0Var.f42305c) && kotlin.jvm.internal.L.f(this.f42306d, s0Var.f42306d)) {
            return X.a(this.f42307e, s0Var.f42307e);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.D
    @Y61.k
    /* renamed from: getWeight, reason: from getter */
    public final e0 getF42304b() {
        return this.f42304b;
    }

    public final int hashCode() {
        int i12 = ((this.f42303a * 31) + this.f42304b.f42253b) * 31;
        Z.a aVar = Z.f42217b;
        int iE2 = androidx.appcompat.app.r.e(this.f42305c, i12, 31);
        X.a aVar2 = X.f42213b;
        return this.f42306d.f42238a.hashCode() + androidx.appcompat.app.r.e(this.f42307e, iE2, 31);
    }

    @Y61.k
    public final String toString() {
        return "ResourceFont(resId=" + this.f42303a + ", weight=" + this.f42304b + ", style=" + ((Object) Z.c(this.f42305c)) + ", loadingStrategy=" + ((Object) X.b(this.f42307e)) + ')';
    }

    public s0(int i12, e0 e0Var, int i13, d0.e eVar, int i14, int i15, C42822w c42822w) {
        int i16;
        if ((i15 & 2) != 0) {
            e0.f42240c.getClass();
            e0Var = e0.f42247j;
        }
        e0 e0Var2 = e0Var;
        if ((i15 & 4) != 0) {
            Z.f42217b.getClass();
            i16 = 0;
        } else {
            i16 = i13;
        }
        if ((i15 & 8) != 0) {
            d0.a[] aVarArr = new d0.a[0];
            d0.f42233a.getClass();
            kotlin.jvm.internal.t0 t0Var = new kotlin.jvm.internal.t0(3);
            int i17 = e0Var2.f42253b;
            if (1 > i17 || i17 >= 1001) {
                C50028a.a("'wght' value must be in [1, 1000]. Actual: " + i17);
            }
            t0Var.a(new d0.c(i17));
            float f12 = i16;
            if (0.0f > f12 || f12 > 1.0f) {
                C50028a.a("'ital' must be in 0.0f..1.0f. Actual: " + f12);
            }
            t0Var.a(new d0.b(f12));
            t0Var.b(aVarArr);
            ArrayList<Object> arrayList = t0Var.f406850a;
            eVar = new d0.e((d0.a[]) arrayList.toArray(new d0.a[arrayList.size()]));
        }
        d0.e eVar2 = eVar;
        if ((i15 & 16) != 0) {
            X.f42213b.getClass();
            i14 = X.f42215d;
        }
        this(i12, e0Var2, i16, eVar2, i14, null);
    }
}

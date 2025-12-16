package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.d0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeviceFontFamilyNameFont.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/A;", "Landroidx/compose/ui/text/font/d;", "Landroidx/compose/ui/text/font/z;", "familyName", "Landroidx/compose/ui/text/font/e0;", "weight", "Landroidx/compose/ui/text/font/Z;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/d0$e;", "variationSettings", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/font/e0;ILandroidx/compose/ui/text/font/d0$e;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class A extends AbstractC22610d {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f42159d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e0 f42160e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(String str, e0 e0Var, int i12, d0.e eVar, C42822w c42822w) {
        super(X.f42214c, k0.f42268a, eVar, null);
        X.f42213b.getClass();
        this.f42159d = str;
        this.f42160e = e0Var;
        this.f42161f = i12;
    }

    @Override // androidx.compose.ui.text.font.D
    /* renamed from: b, reason: from getter */
    public final int getF42161f() {
        return this.f42161f;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a12 = (A) obj;
        if (!kotlin.jvm.internal.L.f(this.f42159d, a12.f42159d)) {
            return false;
        }
        if (!kotlin.jvm.internal.L.f(this.f42160e, a12.f42160e)) {
            return false;
        }
        if (Z.b(this.f42161f, a12.f42161f)) {
            return kotlin.jvm.internal.L.f(this.f42232c, a12.f42232c);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.D
    @Y61.k
    /* renamed from: getWeight, reason: from getter */
    public final e0 getF42160e() {
        return this.f42160e;
    }

    public final int hashCode() {
        int iHashCode = ((this.f42159d.hashCode() * 31) + this.f42160e.f42253b) * 31;
        Z.a aVar = Z.f42217b;
        return this.f42232c.f42238a.hashCode() + androidx.appcompat.app.r.e(this.f42161f, iHashCode, 31);
    }

    @Y61.k
    public final String toString() {
        return "Font(familyName=\"" + ((Object) ("DeviceFontFamilyName(name=" + this.f42159d + ')')) + "\", weight=" + this.f42160e + ", style=" + ((Object) Z.c(this.f42161f)) + ')';
    }
}

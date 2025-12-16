package androidx.compose.ui.text;

import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.y;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Bullet.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/p;", "Landroidx/compose/ui/text/e$a;", "Landroidx/compose/ui/graphics/h1;", "shape", "Landroidx/compose/ui/unit/y;", "size", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Landroidx/compose/ui/graphics/J;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/j;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/h1;JJLandroidx/compose/ui/graphics/J;FLandroidx/compose/ui/graphics/drawscope/j;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22666p implements C22602e.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h1 f42532a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42533b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.graphics.J f42535d;

    /* renamed from: e, reason: collision with root package name */
    public final float f42536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.drawscope.j f42537f;

    public C22666p(h1 h1Var, long j12, long j13, androidx.compose.ui.graphics.J j14, float f12, androidx.compose.ui.graphics.drawscope.j jVar, C42822w c42822w) {
        this.f42532a = h1Var;
        this.f42533b = j12;
        this.f42534c = j13;
        this.f42535d = j14;
        this.f42536e = f12;
        this.f42537f = jVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C22666p)) {
            C22666p c22666p = (C22666p) obj;
            return kotlin.jvm.internal.L.f(this.f42532a, c22666p.f42532a) && androidx.compose.ui.unit.y.b(this.f42533b, c22666p.f42533b) && androidx.compose.ui.unit.y.b(this.f42534c, c22666p.f42534c) && kotlin.jvm.internal.L.f(this.f42535d, c22666p.f42535d) && this.f42536e == c22666p.f42536e && kotlin.jvm.internal.L.f(this.f42537f, c22666p.f42537f);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f42532a.hashCode() * 31;
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        int iG2 = androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(iHashCode, 31, this.f42533b), 31, this.f42534c);
        androidx.compose.ui.graphics.J j12 = this.f42535d;
        return this.f42537f.hashCode() + androidx.appcompat.app.r.d(this.f42536e, (iG2 + (j12 != null ? j12.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "Bullet(shape=" + this.f42532a + ", size=" + ((Object) androidx.compose.ui.unit.y.f(this.f42533b)) + ", padding=" + ((Object) androidx.compose.ui.unit.y.f(this.f42534c)) + ", brush=" + this.f42535d + ", alpha=" + this.f42536e + ", drawStyle=" + this.f42537f + ')';
    }
}

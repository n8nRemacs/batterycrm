package androidx.compose.ui.text;

import androidx.compose.runtime.H0;
import androidx.compose.ui.text.V;
import androidx.compose.ui.unit.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import y0.C50028a;

/* compiled from: Placeholder.kt */
@H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/U;", "", "Landroidx/compose/ui/unit/y;", "width", "height", "Landroidx/compose/ui/text/V;", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final long f41953a;

    /* renamed from: b, reason: collision with root package name */
    public final long f41954b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41955c;

    public U(long j12, long j13, int i12, C42822w c42822w) {
        this.f41953a = j12;
        this.f41954b = j13;
        this.f41955c = i12;
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        if ((j12 & 1095216660480L) == 0) {
            C50028a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j13 & 1095216660480L) == 0) {
            C50028a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u12 = (U) obj;
        return androidx.compose.ui.unit.y.b(this.f41953a, u12.f41953a) && androidx.compose.ui.unit.y.b(this.f41954b, u12.f41954b) && V.a(this.f41955c, u12.f41955c);
    }

    public final int hashCode() {
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        int iG2 = androidx.appcompat.app.r.g(Long.hashCode(this.f41953a) * 31, 31, this.f41954b);
        V.a aVar2 = V.f41956b;
        return Integer.hashCode(this.f41955c) + iG2;
    }

    @Y61.k
    public final String toString() {
        return "Placeholder(width=" + ((Object) androidx.compose.ui.unit.y.f(this.f41953a)) + ", height=" + ((Object) androidx.compose.ui.unit.y.f(this.f41954b)) + ", placeholderVerticalAlign=" + ((Object) V.b(this.f41955c)) + ')';
    }
}

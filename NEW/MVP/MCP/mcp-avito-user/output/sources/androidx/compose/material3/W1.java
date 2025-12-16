package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Button.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/W1;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f35716a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35717b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35718c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35719d;

    public W1(long j12, long j13, long j14, long j15, C42822w c42822w) {
        this.f35716a = j12;
        this.f35717b = j13;
        this.f35718c = j14;
        this.f35719d = j15;
    }

    @Y61.k
    public final W1 a(long j12, long j13, long j14, long j15) {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        aVar.getClass();
        long j16 = androidx.compose.ui.graphics.T.f39330l;
        long j17 = j12 != j16 ? j12 : this.f35716a;
        aVar.getClass();
        long j18 = j13 != j16 ? j13 : this.f35717b;
        aVar.getClass();
        long j19 = j14 != j16 ? j14 : this.f35718c;
        aVar.getClass();
        return new W1(j17, j18, j19, j15 != j16 ? j15 : this.f35719d, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof W1)) {
            return false;
        }
        W1 w12 = (W1) obj;
        return androidx.compose.ui.graphics.T.d(this.f35716a, w12.f35716a) && androidx.compose.ui.graphics.T.d(this.f35717b, w12.f35717b) && androidx.compose.ui.graphics.T.d(this.f35718c, w12.f35718c) && androidx.compose.ui.graphics.T.d(this.f35719d, w12.f35719d);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f35719d) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f35716a) * 31, 31, this.f35717b), 31, this.f35718c);
    }
}

package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchBar.android.kt */
@InterfaceC21537e7
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/Bd;", "", "Landroidx/compose/ui/graphics/T;", "containerColor", "dividerColor", "Landroidx/compose/material3/vi;", "inputFieldColors", "<init>", "(JJLandroidx/compose/material3/vi;Lkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Bd {

    /* renamed from: a, reason: collision with root package name */
    public final long f34555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C21935vi f34557c;

    public Bd(long j12, long j13, C21935vi c21935vi, C42822w c42822w) {
        this.f34555a = j12;
        this.f34556b = j13;
        this.f34557c = c21935vi;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Bd.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Bd bd2 = (Bd) obj;
        return androidx.compose.ui.graphics.T.d(this.f34555a, bd2.f34555a) && androidx.compose.ui.graphics.T.d(this.f34556b, bd2.f34556b) && kotlin.jvm.internal.L.f(this.f34557c, bd2.f34557c);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return this.f34557c.hashCode() + androidx.appcompat.app.r.g(Long.hashCode(this.f34555a) * 31, 31, this.f34556b);
    }
}

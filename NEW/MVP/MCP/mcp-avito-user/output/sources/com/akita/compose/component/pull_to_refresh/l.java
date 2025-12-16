package com.akita.compose.component.pull_to_refresh;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PullToRefreshStyle.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/akita/compose/component/pull_to_refresh/l;", "", "Landroidx/compose/ui/unit/h;", "height", "Lcom/akita/compose/component/spinner/h;", "spinnerStyle", "<init>", "(FLcom/akita/compose/component/spinner/h;Lkotlin/jvm/internal/w;)V", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f62475a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.spinner.h f62476b;

    public l(float f12, com.akita.compose.component.spinner.h hVar, C42822w c42822w) {
        this.f62475a = f12;
        this.f62476b = hVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return androidx.compose.ui.unit.h.b(this.f62475a, lVar.f62475a) && L.f(this.f62476b, lVar.f62476b);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f62476b.hashCode() + (Float.hashCode(this.f62475a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PullToRefreshStyle(height=");
        H.u(this.f62475a, ", spinnerStyle=", sb2);
        sb2.append(this.f62476b);
        sb2.append(')');
        return sb2.toString();
    }
}

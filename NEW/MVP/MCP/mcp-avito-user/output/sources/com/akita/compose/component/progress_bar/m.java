package com.akita.compose.component.progress_bar;

import androidx.compose.runtime.H0;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;

/* compiled from: Segment.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/akita/compose/component/progress_bar/m;", "", "", "value", "Landroidx/compose/ui/graphics/T;", "color", "<init>", "(FJLkotlin/jvm/internal/w;)V", "progress-bar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f62409a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62410b;

    public m(float f12, long j12, C42822w c42822w) {
        this.f62409a = f12;
        this.f62410b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f62409a, mVar.f62409a) == 0 && T.d(this.f62410b, mVar.f62410b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f62409a) * 31;
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return Long.hashCode(this.f62410b) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        return "Segment(value=" + this.f62409a + ", color=" + ((Object) T.j(this.f62410b)) + ')';
    }
}

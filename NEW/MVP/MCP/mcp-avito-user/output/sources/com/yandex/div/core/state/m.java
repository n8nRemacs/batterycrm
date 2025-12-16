package com.yandex.div.core.state;

import androidx.appcompat.app.r;
import com.yandex.div.core.state.k;
import kotlin.Metadata;

/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/state/m;", "Lcom/yandex/div/core/state/k$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class m implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f367670a;

    public m(int i12) {
        this.f367670a = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f367670a == ((m) obj).f367670a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f367670a);
    }

    @Y61.k
    public final String toString() {
        return r.t(new StringBuilder("PagerState(currentPageIndex="), this.f367670a, ')');
    }
}

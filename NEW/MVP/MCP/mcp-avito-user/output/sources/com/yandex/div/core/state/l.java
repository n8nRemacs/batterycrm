package com.yandex.div.core.state;

import androidx.appcompat.app.r;
import com.yandex.div.core.state.k;
import kotlin.Metadata;

/* compiled from: GalleryState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/state/l;", "Lcom/yandex/div/core/state/k$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class l implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f367668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367669b;

    public l(int i12, int i13) {
        this.f367668a = i12;
        this.f367669b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f367668a == lVar.f367668a && this.f367669b == lVar.f367669b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f367669b) + (Integer.hashCode(this.f367668a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryState(visibleItemIndex=");
        sb2.append(this.f367668a);
        sb2.append(", scrollOffset=");
        return r.t(sb2, this.f367669b, ')');
    }
}

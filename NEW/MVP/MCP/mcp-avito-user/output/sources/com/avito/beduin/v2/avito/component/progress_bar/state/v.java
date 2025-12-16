package com.avito.beduin.v2.avito.component.progress_bar.state;

import kotlin.Metadata;

/* compiled from: Progress.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/progress_bar/state/v;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/o;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class v implements o {

    /* renamed from: a, reason: collision with root package name */
    public final float f334849a;

    public v(float f12) {
        this.f334849a = f12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Float.compare(this.f334849a, ((v) obj).f334849a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f334849a);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.k(')', this.f334849a, new StringBuilder("SingleProgress(value="));
    }
}

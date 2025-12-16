package com.avito.beduin.v2.avito.component.progress_bar.state;

import com.avito.beduin.v2.avito.component.progress_bar.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Progress.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/progress_bar/state/u;", "Lcom/avito/beduin/v2/avito/component/progress_bar/state/o;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class u implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<a.C10376a> f334848a;

    public u(@Y61.k ET0.a<a.C10376a> aVar) {
        this.f334848a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && L.f(this.f334848a, ((u) obj).f334848a);
    }

    public final int hashCode() {
        return this.f334848a.f4014b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "SegmentsProgress(segments=" + this.f334848a + ')';
    }
}

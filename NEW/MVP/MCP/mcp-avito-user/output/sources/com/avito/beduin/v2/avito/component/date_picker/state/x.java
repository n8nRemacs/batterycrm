package com.avito.beduin.v2.avito.component.date_picker.state;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDatePickerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/date_picker/state/x;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ST0.d f334225a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ST0.d f334226b;

    public x(@Y61.k ST0.d dVar, @Y61.k ST0.d dVar2) {
        this.f334225a = dVar;
        this.f334226b = dVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return L.f(this.f334225a, xVar.f334225a) && L.f(this.f334226b, xVar.f334226b);
    }

    public final int hashCode() {
        return this.f334226b.f14989a.hashCode() + (this.f334225a.f14989a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "Period(start=" + this.f334225a + ", end=" + this.f334226b + ')';
    }
}

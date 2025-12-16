package com.avito.android.lib.design.selector_card;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectorCardItemWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/s;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f180422a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectorCardItemState f180423b;

    public s(@Y61.k r rVar, @Y61.k SelectorCardItemState selectorCardItemState) {
        this.f180422a = rVar;
        this.f180423b = selectorCardItemState;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f180422a, sVar.f180422a) && L.f(this.f180423b, sVar.f180423b);
    }

    public final int hashCode() {
        return this.f180423b.hashCode() + (this.f180422a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SelectorCardItemWrapper(selectorCard=" + this.f180422a + ", state=" + this.f180423b + ')';
    }
}

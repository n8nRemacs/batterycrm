package com.avito.android.lib.design.selector_card;

import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.lib.design.toggle.Checkmark;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectorCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Checkmark f180392a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Switcher f180393b;

    public a(@Y61.k Checkmark checkmark, @Y61.k Switcher switcher) {
        this.f180392a = checkmark;
        this.f180393b = switcher;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f180392a, aVar.f180392a) && L.f(this.f180393b, aVar.f180393b);
    }

    public final int hashCode() {
        return this.f180393b.hashCode() + (this.f180392a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "IndicatorViewHolder(checkmark=" + this.f180392a + ", switcher=" + this.f180393b + ')';
    }
}

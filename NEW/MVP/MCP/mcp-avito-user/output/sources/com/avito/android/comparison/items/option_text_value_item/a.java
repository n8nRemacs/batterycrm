package com.avito.android.comparison.items.option_text_value_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OptionTextValueItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/option_text_value_item/a;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f124056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f124057c;

    public a(long j12, @k String str) {
        this.f124056b = j12;
        this.f124057c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f124056b == aVar.f124056b && L.f(this.f124057c, aVar.f124057c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF124046b() {
        return this.f124056b;
    }

    public final int hashCode() {
        return this.f124057c.hashCode() + (Long.hashCode(this.f124056b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionTextValueItem(id=");
        sb2.append(this.f124056b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f124057c, ')');
    }
}

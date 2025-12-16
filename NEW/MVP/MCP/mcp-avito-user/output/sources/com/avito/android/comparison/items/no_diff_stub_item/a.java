package com.avito.android.comparison.items.no_diff_stub_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: NoDiffStubItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/no_diff_stub_item/a;", "LTV0/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f124032b;

    public a(long j12) {
        this.f124032b = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f124032b == ((a) obj).f124032b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF123929b() {
        return this.f124032b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f124032b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("NoDiffStubItem(id="), this.f124032b, ')');
    }
}

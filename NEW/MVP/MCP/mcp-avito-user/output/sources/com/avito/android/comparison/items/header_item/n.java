package com.avito.android.comparison.items.header_item;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: MenuButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/header_item/n;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f123995a;

    public n(@Y61.k ArrayList arrayList) {
        this.f123995a = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f123995a.equals(((n) obj).f123995a);
    }

    public final int hashCode() {
        return this.f123995a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("MenuButton(buttons="), this.f123995a, ')');
    }
}

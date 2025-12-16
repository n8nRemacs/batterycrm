package com.avito.android.lib.design.description_list;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DescriptionListState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/description_list/c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f179027a;

    public c(@k ArrayList arrayList) {
        this.f179027a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f179027a.equals(((c) obj).f179027a);
    }

    public final int hashCode() {
        return this.f179027a.hashCode();
    }

    @k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("DescriptionListState(items="), this.f179027a, ')');
    }
}

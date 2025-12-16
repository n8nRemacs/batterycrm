package com.avito.android.brand_global_rubricator;

import androidx.compose.runtime.H0;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: BrandGlobalRubricatorItemImpl.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_rubricator/q;", "", "_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f107465a;

    public q(@Y61.k ArrayList arrayList) {
        this.f107465a = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f107465a.equals(((q) obj).f107465a);
    }

    public final int hashCode() {
        return this.f107465a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("RubricatorItemList(items="), this.f107465a, ')');
    }
}

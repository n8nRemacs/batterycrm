package com.jakewharton.rxbinding4.view;

import android.view.View;
import kotlin.Metadata;

/* compiled from: ViewGroupHierarchyChangeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/O;", "Lcom/jakewharton/rxbinding4/view/L;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class O extends L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f364144a;

    public O(@Y61.k View view) {
        super(null);
        this.f364144a = view;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        o12.getClass();
        return kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(this.f364144a, o12.f364144a);
    }

    public final int hashCode() {
        View view = this.f364144a;
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "ViewGroupHierarchyChildViewRemoveEvent(view=null, child=" + this.f364144a + ")";
    }
}

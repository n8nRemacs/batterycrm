package com.jakewharton.rxbinding4.recyclerview;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecyclerViewChildAttachStateChangeEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/d;", "Lcom/jakewharton/rxbinding4/recyclerview/e;", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class d extends e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f364108a;

    public d(@Y61.k View view) {
        super(null);
        this.f364108a = view;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return L.f(null, null) && L.f(this.f364108a, dVar.f364108a);
    }

    public final int hashCode() {
        View view = this.f364108a;
        if (view != null) {
            return view.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "RecyclerViewChildAttachEvent(view=null, child=" + this.f364108a + ")";
    }
}

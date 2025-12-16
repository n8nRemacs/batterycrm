package com.jakewharton.rxbinding4.widget;

import android.widget.AdapterView;
import kotlin.Metadata;

/* compiled from: AdapterViewSelectionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/m;", "Lcom/jakewharton/rxbinding4/widget/n;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.widget.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C37761m extends AbstractC37762n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdapterView<?> f364232a;

    public C37761m(@Y61.k AdapterView<?> adapterView) {
        super(null);
        this.f364232a = adapterView;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37761m) {
            return kotlin.jvm.internal.L.f(this.f364232a, ((C37761m) obj).f364232a);
        }
        return false;
    }

    public final int hashCode() {
        AdapterView<?> adapterView = this.f364232a;
        if (adapterView != null) {
            return adapterView.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "AdapterViewNothingSelectionEvent(view=" + this.f364232a + ")";
    }
}

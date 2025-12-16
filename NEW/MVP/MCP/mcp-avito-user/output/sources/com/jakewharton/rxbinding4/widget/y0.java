package com.jakewharton.rxbinding4.widget;

import android.text.Editable;
import com.avito.android.ui.view.BackPressedNotifyingEditText;
import kotlin.Metadata;

/* compiled from: TextViewAfterTextChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/widget/y0;", "", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BackPressedNotifyingEditText f364256a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Editable f364257b;

    public y0(@Y61.k BackPressedNotifyingEditText backPressedNotifyingEditText, @Y61.l Editable editable) {
        this.f364256a = backPressedNotifyingEditText;
        this.f364257b = editable;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.L.f(this.f364256a, y0Var.f364256a) && kotlin.jvm.internal.L.f(this.f364257b, y0Var.f364257b);
    }

    public final int hashCode() {
        BackPressedNotifyingEditText backPressedNotifyingEditText = this.f364256a;
        int iHashCode = (backPressedNotifyingEditText != null ? backPressedNotifyingEditText.hashCode() : 0) * 31;
        Editable editable = this.f364257b;
        return iHashCode + (editable != null ? editable.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TextViewAfterTextChangeEvent(view=" + this.f364256a + ", editable=" + ((Object) this.f364257b) + ")";
    }
}

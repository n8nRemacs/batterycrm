package com.jakewharton.rxbinding4.recyclerview;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecyclerViewFlingEventObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/h;", "", "rxbinding-recyclerview_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f364111a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364112b;

    public h(int i12, int i13) {
        this.f364111a = i12;
        this.f364112b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.getClass();
        return L.f(null, null) && this.f364111a == hVar.f364111a && this.f364112b == hVar.f364112b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f364112b) + (Integer.hashCode(this.f364111a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecyclerViewFlingEvent(view=null, velocityX=");
        sb2.append(this.f364111a);
        sb2.append(", velocityY=");
        return AK.c.i(this.f364112b, ")", sb2);
    }
}

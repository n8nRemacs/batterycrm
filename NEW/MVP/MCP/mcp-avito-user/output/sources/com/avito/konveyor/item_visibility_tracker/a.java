package com.avito.konveyor.item_visibility_tracker;

import Y61.k;
import Y61.l;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/a;", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f338530a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b.InterfaceC10495b f338531b;

    public a(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        this.f338530a = i12;
        this.f338531b = interfaceC10495b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f338530a == aVar.f338530a && L.f(this.f338531b, aVar.f338531b);
    }

    public final int hashCode() {
        return this.f338531b.hashCode() + (Integer.hashCode(this.f338530a) * 31);
    }

    @k
    public final String toString() {
        return "ItemPosition(position=" + this.f338530a + ", item=" + this.f338531b + ')';
    }
}

package com.avito.android.beduin.common.component.grid_layout.row;

import Y61.k;
import Y61.l;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinGridLayoutRowContainer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_layout/row/f;", "Lej/e;", "ViewContainer", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class f<ViewContainer extends InterfaceC40116e> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<? extends AbstractC40112a<?, ViewContainer>> f101377a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewContainer f101378b;

    public f(@k Class<? extends AbstractC40112a<?, ViewContainer>> cls, @k ViewContainer viewcontainer) {
        this.f101377a = cls;
        this.f101378b = viewcontainer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f101377a, fVar.f101377a) && L.f(this.f101378b, fVar.f101378b);
    }

    public final int hashCode() {
        return this.f101378b.hashCode() + (this.f101377a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ChildBoundData(componentClass=" + this.f101377a + ", viewContainer=" + this.f101378b + ')';
    }
}

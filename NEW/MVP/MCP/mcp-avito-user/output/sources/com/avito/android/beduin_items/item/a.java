package com.avito.android.beduin_items.item;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinModel;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_items/item/a;", "Lcom/avito/conveyor_item/a;", "_avito_beduin-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f105236b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> f105237c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC39736a f105238d;

    public a(@k String str, @k z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVar, @k InterfaceC39736a interfaceC39736a) {
        this.f105236b = str;
        this.f105237c = zVar;
        this.f105238d = interfaceC39736a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f105236b, aVar.f105236b) && L.f(this.f105237c, aVar.f105237c) && L.f(this.f105238d, aVar.f105238d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return getF96989b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96989b() {
        return this.f105236b;
    }

    public final int hashCode() {
        return this.f105238d.hashCode() + ((this.f105237c.hashCode() + (this.f105236b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "BeduinItem(formId=" + this.f105236b + ", components=" + this.f105237c + ", beduinAdapterPerformanceListener=" + this.f105238d + ')';
    }
}

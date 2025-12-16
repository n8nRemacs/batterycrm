package com.avito.android.beduin_items.item_with_loader;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinModel;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import io.reactivex.rxjava3.core.z;
import j.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItemWithLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_items/item_with_loader/a;", "Lcom/avito/conveyor_item/a;", "_avito_beduin-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f105254b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> f105255c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC39736a f105256d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f105257e;

    /* renamed from: f, reason: collision with root package name */
    public final int f105258f;

    public a(@k String str, @k z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVar, @k InterfaceC39736a interfaceC39736a, boolean z12, @r int i12) {
        this.f105254b = str;
        this.f105255c = zVar;
        this.f105256d = interfaceC39736a;
        this.f105257e = z12;
        this.f105258f = i12;
    }

    public static a a(a aVar, boolean z12) {
        String str = aVar.f105254b;
        z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> zVar = aVar.f105255c;
        InterfaceC39736a interfaceC39736a = aVar.f105256d;
        int i12 = aVar.f105258f;
        aVar.getClass();
        return new a(str, zVar, interfaceC39736a, z12, i12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f105254b, aVar.f105254b) && L.f(this.f105255c, aVar.f105255c) && L.f(this.f105256d, aVar.f105256d) && this.f105257e == aVar.f105257e && this.f105258f == aVar.f105258f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return getF99239b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF99239b() {
        return this.f105254b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105258f) + androidx.appcompat.app.r.i((this.f105256d.hashCode() + ((this.f105255c.hashCode() + (this.f105254b.hashCode() * 31)) * 31)) * 31, 31, this.f105257e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinItemWithLoader(formId=");
        sb2.append(this.f105254b);
        sb2.append(", components=");
        sb2.append(this.f105255c);
        sb2.append(", beduinAdapterPerformanceListener=");
        sb2.append(this.f105256d);
        sb2.append(", isLoading=");
        sb2.append(this.f105257e);
        sb2.append(", horizontalMargin=");
        return androidx.appcompat.app.r.t(sb2, this.f105258f, ')');
    }
}

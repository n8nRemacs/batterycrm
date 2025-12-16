package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import wZ.C49578b;

/* compiled from: FeesMethodsV2DetailsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/details/a;", "Lcom/avito/conveyor_item/a;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f158328b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final wZ.l f158329c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C49578b f158330d;

    public a(@k String str, @l wZ.l lVar, @l C49578b c49578b) {
        this.f158328b = str;
        this.f158329c = lVar;
        this.f158330d = c49578b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f158328b, aVar.f158328b) && L.f(this.f158329c, aVar.f158329c) && L.f(this.f158330d, aVar.f158330d);
    }

    @Override // TV0.a
    public final long getId() {
        return 2144252414;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF156524b() {
        return "fees_methods_v2_details";
    }

    public final int hashCode() {
        int iD2 = H.d(2047315394, 31, this.f158328b);
        wZ.l lVar = this.f158329c;
        int iHashCode = (iD2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C49578b c49578b = this.f158330d;
        return iHashCode + (c49578b != null ? c49578b.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "FeesMethodsV2DetailsItem(stringId=fees_methods_v2_details, text=" + this.f158328b + ", icon=" + this.f158329c + ", action=" + this.f158330d + ')';
    }
}

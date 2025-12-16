package com.avito.android.cpt.activation.ui.items.advert;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationAdvertItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/advert/a;", "Lcom/avito/conveyor_item/a;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f126308b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f126309c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f126310d;

    public a(@k Image image, @l String str, @l String str2) {
        this.f126308b = image;
        this.f126309c = str;
        this.f126310d = str2;
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
        return L.f(this.f126308b, aVar.f126308b) && L.f(this.f126309c, aVar.f126309c) && L.f(this.f126310d, aVar.f126310d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return 1040619141;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF118405b() {
        return "cpt_activation_advert";
    }

    public final int hashCode() {
        int iG2 = com.avito.android.actions_sheet.a.g(this.f126308b, -2100544997, 31);
        String str = this.f126309c;
        int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f126310d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptActivationAdvertItem(stringId=cpt_activation_advert, image=");
        sb2.append(this.f126308b);
        sb2.append(", title=");
        sb2.append(this.f126309c);
        sb2.append(", price=");
        return C22026a.c(sb2, this.f126310d, ')');
    }
}

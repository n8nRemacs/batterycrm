package com.avito.android.user_advert.advert.items.activation_info;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActivationInfoHintItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/activation_info/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309054b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309055c;

    public a(@k String str, @k String str2) {
        this.f309054b = str;
        this.f309055c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309054b, aVar.f309054b) && L.f(this.f309055c, aVar.f309055c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return getF309949b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309949b() {
        return this.f309054b;
    }

    public final int hashCode() {
        return this.f309055c.hashCode() + (this.f309054b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivationInfoHintItem(stringId=");
        sb2.append(this.f309054b);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.f309055c, ')');
    }
}

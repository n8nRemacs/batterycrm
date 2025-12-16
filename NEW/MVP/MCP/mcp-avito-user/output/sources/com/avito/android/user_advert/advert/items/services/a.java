package com.avito.android.user_advert.advert.items.services;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Service;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliedServicesItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/services/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310216b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f310217c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Service> f310218d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f310219e;

    public a(@k String str, @k String str2, @k List<Service> list, @k DeepLink deepLink) {
        this.f310216b = str;
        this.f310217c = str2;
        this.f310218d = list;
        this.f310219e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f310216b, aVar.f310216b) && L.f(this.f310217c, aVar.f310217c) && L.f(this.f310218d, aVar.f310218d) && L.f(this.f310219e, aVar.f310219e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF300713b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF300713b() {
        return this.f310216b;
    }

    public final int hashCode() {
        return this.f310219e.hashCode() + H.e(H.d(this.f310216b.hashCode() * 31, 31, this.f310217c), 31, this.f310218d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppliedServicesItem(stringId=");
        sb2.append(this.f310216b);
        sb2.append(", title=");
        sb2.append(this.f310217c);
        sb2.append(", servicesIcons=");
        sb2.append(this.f310218d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f310219e, ')');
    }
}

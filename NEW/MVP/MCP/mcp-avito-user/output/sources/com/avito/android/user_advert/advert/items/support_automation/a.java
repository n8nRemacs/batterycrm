package com.avito.android.user_advert.advert.items.support_automation;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SupportAutomationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/support_automation/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310312b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f310313c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f310314d;

    public a(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f310312b = str;
        this.f310313c = str2;
        this.f310314d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f310312b, aVar.f310312b) && L.f(this.f310313c, aVar.f310313c) && L.f(this.f310314d, aVar.f310314d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF294837b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294837b() {
        return this.f310312b;
    }

    public final int hashCode() {
        return this.f310314d.hashCode() + H.d(this.f310312b.hashCode() * 31, 31, this.f310313c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SupportAutomationItem(stringId=");
        sb2.append(this.f310312b);
        sb2.append(", title=");
        sb2.append(this.f310313c);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f310314d, ')');
    }
}

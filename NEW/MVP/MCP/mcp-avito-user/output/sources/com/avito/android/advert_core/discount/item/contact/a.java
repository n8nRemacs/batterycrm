package com.avito.android.advert_core.discount.item.contact;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.discount.item.AdvertDiscountItem;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.advert_details.ContactBarData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/discount/item/contact/a;", "Lcom/avito/conveyor_item/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f83350b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<ContactBar.Button.Action> f83351c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ContactBarData f83352d;

    public a() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f83350b, aVar.f83350b) && L.f(this.f83351c, aVar.f83351c) && L.f(this.f83352d, aVar.f83352d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75840b() {
        return getF283243b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f83350b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f83350b.hashCode() * 31, 31, this.f83351c);
        ContactBarData contactBarData = this.f83352d;
        return iE2 + (contactBarData == null ? 0 : contactBarData.hashCode());
    }

    @k
    public final String toString() {
        return "ContactItem(stringId=" + this.f83350b + ", actions=" + this.f83351c + ", contactBarData=" + this.f83352d + ')';
    }

    public a(String str, List list, ContactBarData contactBarData, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AdvertDiscountItem[] advertDiscountItemArr = AdvertDiscountItem.f83348b;
            str = String.valueOf(5);
        }
        list = (i12 & 2) != 0 ? C42784z0.f406748b : list;
        contactBarData = (i12 & 4) != 0 ? null : contactBarData;
        this.f83350b = str;
        this.f83351c = list;
        this.f83352d = contactBarData;
    }
}

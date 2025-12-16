package com.avito.android.user_advert.advert.items.credit_info;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/credit_info/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309337b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f309338c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f309339d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f309340e;

    public a(@k String str, @k String str2, @l AttributedText attributedText, @l String str3) {
        this.f309337b = str;
        this.f309338c = str2;
        this.f309339d = attributedText;
        this.f309340e = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309337b, aVar.f309337b) && L.f(this.f309338c, aVar.f309338c) && L.f(this.f309339d, aVar.f309339d) && L.f(this.f309340e, aVar.f309340e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF291445k().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF291445k() {
        return this.f309337b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f309337b.hashCode() * 31, 31, this.f309338c);
        AttributedText attributedText = this.f309339d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f309340e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreditInfoItem(stringId=");
        sb2.append(this.f309337b);
        sb2.append(", title=");
        sb2.append(this.f309338c);
        sb2.append(", subtitle=");
        sb2.append(this.f309339d);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.f309340e, ')');
    }
}

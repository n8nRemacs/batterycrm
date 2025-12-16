package com.avito.android.developments_agency_search.screen.deal_room.adapter.send_for_verification_button;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendForVerificationButtonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/send_for_verification_button/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137450b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f137451c;

    public a(@k String str, boolean z12) {
        this.f137450b = str;
        this.f137451c = z12;
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
        return L.f(this.f137450b, aVar.f137450b) && this.f137451c == aVar.f137451c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return -1084368555;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF73320d() {
        return "deal-stage-send-for-verification-button-item";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137451c) + H.d(744313163, 31, this.f137450b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendForVerificationButtonItem(stringId=deal-stage-send-for-verification-button-item, dealId=");
        sb2.append(this.f137450b);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f137451c, ')');
    }
}

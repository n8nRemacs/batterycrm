package com.avito.android.user_advert.advert.items.realty.verification;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RealtyVerificationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/verification/a;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309949b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f309950c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MyAdvertDetails.RealtyOwnerVerification f309951d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f309952e;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.k MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification, boolean z12) {
        this.f309949b = str;
        this.f309950c = str2;
        this.f309951d = realtyOwnerVerification;
        this.f309952e = z12;
    }

    public static a a(a aVar) {
        String str = aVar.f309949b;
        String str2 = aVar.f309950c;
        MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification = aVar.f309951d;
        aVar.getClass();
        return new a(str, str2, realtyOwnerVerification, true);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f309949b, aVar.f309949b) && L.f(this.f309950c, aVar.f309950c) && L.f(this.f309951d, aVar.f309951d) && this.f309952e == aVar.f309952e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return getF309949b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309949b() {
        return this.f309949b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309952e) + ((this.f309951d.hashCode() + H.d(this.f309949b.hashCode() * 31, 31, this.f309950c)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyVerificationItem(stringId=");
        sb2.append(this.f309949b);
        sb2.append(", advertId=");
        sb2.append(this.f309950c);
        sb2.append(", data=");
        sb2.append(this.f309951d);
        sb2.append(", loading=");
        return r.x(sb2, this.f309952e, ')');
    }

    public /* synthetic */ a(String str, String str2, MyAdvertDetails.RealtyOwnerVerification realtyOwnerVerification, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, realtyOwnerVerification, (i12 & 8) != 0 ? false : z12);
    }
}

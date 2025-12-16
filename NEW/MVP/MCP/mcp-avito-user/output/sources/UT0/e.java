package Ut0;

import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/e;", "Lcom/avito/conveyor_item/a;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f16727c;

    public e(@Y61.k String str, @Y61.k AttributedText attributedText) {
        this.f16726b = str;
        this.f16727c = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f16726b, eVar.f16726b) && L.f(this.f16727c, eVar.f16727c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF243284b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243284b() {
        return this.f16726b;
    }

    public final int hashCode() {
        return this.f16727c.hashCode() + (this.f16726b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LicenseAgreement(stringId=");
        sb2.append(this.f16726b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f16727c, ')');
    }
}

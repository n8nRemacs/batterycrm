package com.avito.android.str_booking.ui.buttons;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.str_booking.network.models.common.Button;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingButtonsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/buttons/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f285943b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Button> f285944c;

    public c(@k String str, @k List<Button> list) {
        this.f285943b = str;
        this.f285944c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f285943b, cVar.f285943b) && L.f(this.f285944c, cVar.f285944c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF281152b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281152b() {
        return this.f285943b;
    }

    public final int hashCode() {
        return this.f285944c.hashCode() + (this.f285943b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingButtonsItem(stringId=");
        sb2.append(this.f285943b);
        sb2.append(", buttons=");
        return H.p(sb2, this.f285944c, ')');
    }
}

package com.avito.android.str_booking.ui.info;

import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.str_booking.network.models.sections.InfoContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/info/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InfoContent f286051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f286052c;

    public c(@Y61.k String str, @l InfoContent infoContent) {
        this.f286051b = infoContent;
        this.f286052c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f286051b, cVar.f286051b) && L.f(this.f286052c, cVar.f286052c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF285943b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF285943b() {
        return this.f286052c;
    }

    public final int hashCode() {
        InfoContent infoContent = this.f286051b;
        return this.f286052c.hashCode() + ((infoContent == null ? 0 : infoContent.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingInfoItem(infoContent=");
        sb2.append(this.f286051b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f286052c, ')');
    }
}

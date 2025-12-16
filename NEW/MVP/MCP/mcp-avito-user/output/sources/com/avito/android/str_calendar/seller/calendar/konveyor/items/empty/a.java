package com.avito.android.str_calendar.seller.calendar.konveyor.items.empty;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.Position;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarEmptyItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/empty/a;", "LTV0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements TV0.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f287650b;

    public a(long j12) {
        Position position = Position.f286638b;
        this.f287650b = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f287650b != ((a) obj).f287650b) {
            return false;
        }
        Position position = Position.f286638b;
        return L.f(null, null);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF272437b() {
        return this.f287650b;
    }

    public final int hashCode() {
        return (Position.f286642f.hashCode() + (Long.hashCode(this.f287650b) * 31)) * 31;
    }

    @k
    public final String toString() {
        return "StrSellerCalendarEmptyItem(id=" + this.f287650b + ", position=" + Position.f286642f + ", background=null)";
    }
}

package com.avito.android.str_booking.ui.screen_title;

import Y61.k;
import Y61.l;
import com.avito.android.str_booking.network.models.sections.ScreenTitleContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingScreenTitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/screen_title/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ScreenTitleContent f286172b;

    public c(@l ScreenTitleContent screenTitleContent) {
        this.f286172b = screenTitleContent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return L.f(this.f286172b, ((c) obj).f286172b);
        }
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207385b() {
        return -53553844;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF275532b() {
        return "screenTitle";
    }

    public final int hashCode() {
        return ((this.f286172b == null ? 0 : r0.hashCode()) * 31) - 53553844;
    }

    @k
    public final String toString() {
        return "StrBookingScreenTitleItem(content=" + this.f286172b + ", stringId=screenTitle)";
    }
}

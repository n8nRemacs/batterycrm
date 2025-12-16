package com.avito.android.str_booking.ui.user_info;

import androidx.appcompat.app.r;
import com.avito.android.str_booking.network.models.sections.UserInfoContent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingUserInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/user_info/c;", "Lcom/avito/conveyor_item/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final UserInfoContent f286179b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f286180c;

    public c(@Y61.l UserInfoContent userInfoContent, boolean z12) {
        this.f286179b = userInfoContent;
        this.f286180c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f286179b, cVar.f286179b) && this.f286180c == cVar.f286180c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return -266803431;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF284782b() {
        return "userInfo";
    }

    public final int hashCode() {
        UserInfoContent userInfoContent = this.f286179b;
        return Boolean.hashCode(this.f286180c) + ((319028231 + (userInfoContent == null ? 0 : userInfoContent.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingUserInfoItem(stringId=userInfo, userContent=");
        sb2.append(this.f286179b);
        sb2.append(", shouldShowGuestProfileTooltip=");
        return r.x(sb2, this.f286180c, ')');
    }
}

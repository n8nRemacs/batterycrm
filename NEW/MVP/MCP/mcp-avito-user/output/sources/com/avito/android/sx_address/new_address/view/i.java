package com.avito.android.sx_address.new_address.view;

import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import kotlin.Metadata;

/* compiled from: ScheduleView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/i;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f293900a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WeekDay f293901b;

    public i(boolean z12, @Y61.k WeekDay weekDay) {
        this.f293900a = z12;
        this.f293901b = weekDay;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f293900a == iVar.f293900a && this.f293901b == iVar.f293901b;
    }

    public final int hashCode() {
        return this.f293901b.hashCode() + (Boolean.hashCode(this.f293900a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "EnableScheduleDay(isEnabled=" + this.f293900a + ", day=" + this.f293901b + ')';
    }
}

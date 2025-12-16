package Zs0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.service_booking_calendar.data.model.Day;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingCalendarDaysResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LZs0/a;", "", "", "title", "", "LZs0/c;", "menuActionsList", "Lcom/avito/android/service_booking_calendar/data/model/Day;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getMenuActionsList", "()Ljava/util/List;", "getParams", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zs0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C19604a {

    @com.google.gson.annotations.c("barButtonActions")
    @k
    private final List<c> menuActionsList;

    @com.google.gson.annotations.c("params")
    @k
    private final List<Day> params;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    public C19604a(@l String str, @k List<c> list, @k List<Day> list2) {
        this.title = str;
        this.menuActionsList = list;
        this.params = list2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19604a)) {
            return false;
        }
        C19604a c19604a = (C19604a) obj;
        return L.f(this.title, c19604a.title) && L.f(this.menuActionsList, c19604a.menuActionsList) && L.f(this.params, c19604a.params);
    }

    public final int hashCode() {
        String str = this.title;
        return this.params.hashCode() + H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.menuActionsList);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingCalendarDaysResult(title=");
        sb2.append(this.title);
        sb2.append(", menuActionsList=");
        sb2.append(this.menuActionsList);
        sb2.append(", params=");
        return H.p(sb2, this.params, ')');
    }
}

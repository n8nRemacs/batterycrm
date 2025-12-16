package Iy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarMonth.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIy0/b;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f8652a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f8653b;

    public b(@k ArrayList arrayList, @k Date date) {
        this.f8652a = arrayList;
        this.f8653b = date;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8652a.equals(bVar.f8652a) && L.f(this.f8653b, bVar.f8653b);
    }

    public final int hashCode() {
        return this.f8653b.hashCode() + (this.f8652a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarMonth(items=");
        sb2.append(this.f8652a);
        sb2.append(", firstDayDate=");
        return f.n(sb2, this.f8653b, ')');
    }
}

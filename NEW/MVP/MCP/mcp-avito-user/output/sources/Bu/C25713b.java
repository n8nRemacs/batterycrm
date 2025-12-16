package bu;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DasCalendarData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbu/b;", "", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C25713b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f57531a;

    public C25713b(@k ArrayList arrayList) {
        this.f57531a = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25713b) && this.f57531a.equals(((C25713b) obj).f57531a);
    }

    public final int hashCode() {
        return this.f57531a.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("DasCalendarData(months="), this.f57531a, ')');
    }
}

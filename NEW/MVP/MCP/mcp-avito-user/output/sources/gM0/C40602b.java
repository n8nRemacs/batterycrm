package gM0;

import Y61.k;
import Y61.l;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarMonth.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LgM0/b;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40602b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f396473a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f396474b;

    public C40602b(@k ArrayList arrayList, @k Date date) {
        this.f396473a = arrayList;
        this.f396474b = date;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40602b)) {
            return false;
        }
        C40602b c40602b = (C40602b) obj;
        return this.f396473a.equals(c40602b.f396473a) && L.f(this.f396474b, c40602b.f396474b);
    }

    public final int hashCode() {
        return this.f396474b.hashCode() + (this.f396473a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarMonth(items=");
        sb2.append(this.f396473a);
        sb2.append(", date=");
        return f.n(sb2, this.f396474b, ')');
    }
}

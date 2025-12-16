package Tz0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/e;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15431e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f16046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f16047b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f16048c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f16049d;

    public C15431e(@Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, @Y61.k String str, @Y61.l String str2) {
        this.f16046a = universalColor;
        this.f16047b = universalColor2;
        this.f16048c = str;
        this.f16049d = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15431e)) {
            return false;
        }
        C15431e c15431e = (C15431e) obj;
        return L.f(this.f16046a, c15431e.f16046a) && L.f(this.f16047b, c15431e.f16047b) && L.f(this.f16048c, c15431e.f16048c) && L.f(this.f16049d, c15431e.f16049d);
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.i(this.f16047b, this.f16046a.hashCode() * 31, 31), 31, this.f16048c);
        String str = this.f16049d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarIconWithTooltip(backgroundColor=");
        sb2.append(this.f16046a);
        sb2.append(", iconColor=");
        sb2.append(this.f16047b);
        sb2.append(", iconName=");
        sb2.append(this.f16048c);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f16049d, ')');
    }
}

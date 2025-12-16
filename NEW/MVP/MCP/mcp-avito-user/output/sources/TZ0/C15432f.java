package Tz0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/f;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15432f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeepLink f16050a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C15431e f16052c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f16053d;

    public C15432f(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.l C15431e c15431e, @Y61.k String str2) {
        this.f16050a = deepLink;
        this.f16051b = str;
        this.f16052c = c15431e;
        this.f16053d = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15432f)) {
            return false;
        }
        C15432f c15432f = (C15432f) obj;
        return L.f(this.f16050a, c15432f.f16050a) && L.f(this.f16051b, c15432f.f16051b) && L.f(this.f16052c, c15432f.f16052c) && L.f(this.f16053d, c15432f.f16053d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f16050a.hashCode() * 31, 31, this.f16051b);
        C15431e c15431e = this.f16052c;
        return this.f16053d.hashCode() + ((iD2 + (c15431e == null ? 0 : c15431e.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarItemMainInfo(deeplink=");
        sb2.append(this.f16050a);
        sb2.append(", imageLink=");
        sb2.append(this.f16051b);
        sb2.append(", iconWithTooltip=");
        sb2.append(this.f16052c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f16053d, ')');
    }
}

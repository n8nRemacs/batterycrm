package Ly0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarRejectState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLy0/d;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f10313a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f10314b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f10315c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f10316d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f10317e;

    public d(@l String str, @l String str2, @l String str3, @l String str4, @l DeepLink deepLink) {
        this.f10313a = str;
        this.f10314b = str2;
        this.f10315c = str3;
        this.f10316d = str4;
        this.f10317e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f10313a, dVar.f10313a) && L.f(this.f10314b, dVar.f10314b) && L.f(this.f10315c, dVar.f10315c) && L.f(this.f10316d, dVar.f10316d) && L.f(this.f10317e, dVar.f10317e);
    }

    public final int hashCode() {
        String str = this.f10313a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10314b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10315c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10316d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DeepLink deepLink = this.f10317e;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrCalendarRejectViewState(screenTitle=");
        sb2.append(this.f10313a);
        sb2.append(", title=");
        sb2.append(this.f10314b);
        sb2.append(", subtitle=");
        sb2.append(this.f10315c);
        sb2.append(", buttonText=");
        sb2.append(this.f10316d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f10317e, ')');
    }
}

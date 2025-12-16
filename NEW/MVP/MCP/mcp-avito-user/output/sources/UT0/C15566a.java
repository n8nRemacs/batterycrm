package Ut0;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/a;", "Lcom/avito/conveyor_item/a;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ut0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C15566a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16713b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f16714c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f16715d;

    public C15566a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f16713b = str;
        this.f16714c = str2;
        this.f16715d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15566a)) {
            return false;
        }
        C15566a c15566a = (C15566a) obj;
        return L.f(this.f16713b, c15566a.f16713b) && L.f(this.f16714c, c15566a.f16714c) && L.f(this.f16715d, c15566a.f16715d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF16762f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF16762f() {
        return this.f16713b;
    }

    public final int hashCode() {
        return this.f16715d.hashCode() + H.d(this.f16713b.hashCode() * 31, 31, this.f16714c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentDescription(stringId=");
        sb2.append(this.f16713b);
        sb2.append(", title=");
        sb2.append(this.f16714c);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f16715d, ')');
    }
}

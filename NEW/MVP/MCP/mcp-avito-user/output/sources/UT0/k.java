package Ut0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.Option;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursMviState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LUt0/k;", "LUt0/j;", "LUt0/d;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class k extends j implements InterfaceC15569d {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f16762f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f16763g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f16764h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f16765i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Option f16766j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<Option> f16767k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16768l;

    public /* synthetic */ k(String str, String str2, String str3, String str4, Option option, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, option, list, (i12 & 64) != 0 ? true : z12);
    }

    public static k f(k kVar, Option option, boolean z12, int i12) {
        String str = kVar.f16762f;
        String str2 = kVar.f16763g;
        String str3 = kVar.f16764h;
        String str4 = kVar.f16765i;
        if ((i12 & 16) != 0) {
            option = kVar.f16766j;
        }
        Option option2 = option;
        List<Option> list = kVar.f16767k;
        if ((i12 & 64) != 0) {
            z12 = kVar.f16768l;
        }
        kVar.getClass();
        return new k(str, str2, str3, str4, option2, list, z12);
    }

    @Override // Ut0.j
    @Y61.k
    public final List<Option> a() {
        return this.f16767k;
    }

    @Override // Ut0.j
    public final ParcelableEntity b() {
        return this.f16766j;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f16762f, kVar.f16762f) && L.f(this.f16763g, kVar.f16763g) && L.f(this.f16764h, kVar.f16764h) && L.f(this.f16765i, kVar.f16765i) && L.f(this.f16766j, kVar.f16766j) && L.f(this.f16767k, kVar.f16767k) && this.f16768l == kVar.f16768l;
    }

    @Override // Ut0.j, com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270005b() {
        return this.f16762f;
    }

    @Override // Ut0.j
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF278058i() {
        return this.f16763g;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f16762f.hashCode() * 31, 31, this.f16763g), 31, this.f16764h);
        String str = this.f16765i;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Option option = this.f16766j;
        return Boolean.hashCode(this.f16768l) + H.e((iHashCode + (option != null ? option.hashCode() : 0)) * 31, 31, this.f16767k);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeGap(stringId=");
        sb2.append(this.f16762f);
        sb2.append(", title=");
        sb2.append(this.f16763g);
        sb2.append(", description=");
        sb2.append(this.f16764h);
        sb2.append(", placeholder=");
        sb2.append(this.f16765i);
        sb2.append(", value=");
        sb2.append(this.f16766j);
        sb2.append(", options=");
        sb2.append(this.f16767k);
        sb2.append(", viewEnabled=");
        return r.x(sb2, this.f16768l, ')');
    }

    public k(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @l String str4, @l Option option, @Y61.k List<Option> list, boolean z12) {
        super(str, str2, option, list);
        this.f16762f = str;
        this.f16763g = str2;
        this.f16764h = str3;
        this.f16765i = str4;
        this.f16766j = option;
        this.f16767k = list;
        this.f16768l = z12;
    }
}

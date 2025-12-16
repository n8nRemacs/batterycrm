package NL;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.threeten.bp.g;

/* compiled from: IacOptionsData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNL/c;", "", "_avito_iac-incoming-call-ability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11379a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final g f11380b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final g f11381c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<b> f11382d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f11383e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<ScheduleOption> f11384f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11385g;

    public c(boolean z12, @l g gVar, @l g gVar2, @k List<b> list, @l Boolean bool, @k List<ScheduleOption> list2, boolean z13) {
        this.f11379a = z12;
        this.f11380b = gVar;
        this.f11381c = gVar2;
        this.f11382d = list;
        this.f11383e = bool;
        this.f11384f = list2;
        this.f11385g = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11379a == cVar.f11379a && L.f(this.f11380b, cVar.f11380b) && L.f(this.f11381c, cVar.f11381c) && L.f(this.f11382d, cVar.f11382d) && L.f(this.f11383e, cVar.f11383e) && L.f(this.f11384f, cVar.f11384f) && this.f11385g == cVar.f11385g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f11379a) * 31;
        g gVar = this.f11380b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.f11381c;
        int iE2 = H.e((iHashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31, 31, this.f11382d);
        Boolean bool = this.f11383e;
        return Boolean.hashCode(this.f11385g) + H.e((iE2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f11384f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacOptionsData(userIacEnabled=");
        sb2.append(this.f11379a);
        sb2.append(", availableTimeStart=");
        sb2.append(this.f11380b);
        sb2.append(", availableTimeEnd=");
        sb2.append(this.f11381c);
        sb2.append(", devices=");
        sb2.append(this.f11382d);
        sb2.append(", iacMandatory=");
        sb2.append(this.f11383e);
        sb2.append(", scheduleOptions=");
        sb2.append(this.f11384f);
        sb2.append(", availableTimeDisabled=");
        return r.x(sb2, this.f11385g, ')');
    }

    public c(boolean z12, g gVar, g gVar2, List list, Boolean bool, List list2, boolean z13, int i12, C42822w c42822w) {
        this(z12, gVar, gVar2, list, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? C42784z0.f406748b : list2, z13);
    }
}

package wx0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.models.SparePartsGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsTextV3.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwx0/g;", "", "_avito-discouraged_avito-libs_spare-parts-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f441887a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f441888b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f441889c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final SparePartsGroup f441890d;

    public g(@k String str, @l String str2, boolean z12, @l SparePartsGroup sparePartsGroup) {
        this.f441887a = str;
        this.f441888b = str2;
        this.f441889c = z12;
        this.f441890d = sparePartsGroup;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f441887a, gVar.f441887a) && L.f(this.f441888b, gVar.f441888b) && this.f441889c == gVar.f441889c && L.f(this.f441890d, gVar.f441890d);
    }

    public final int hashCode() {
        int iHashCode = this.f441887a.hashCode() * 31;
        String str = this.f441888b;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f441889c);
        SparePartsGroup sparePartsGroup = this.f441890d;
        return i12 + (sparePartsGroup != null ? sparePartsGroup.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SparePartsTextV3(title=" + this.f441887a + ", subtitle=" + this.f441888b + ", clickable=" + this.f441889c + ", group=" + this.f441890d + ')';
    }

    public /* synthetic */ g(String str, String str2, boolean z12, SparePartsGroup sparePartsGroup, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, z12, (i12 & 8) != 0 ? null : sparePartsGroup);
    }
}

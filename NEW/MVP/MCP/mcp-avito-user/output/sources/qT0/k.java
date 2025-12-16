package qt0;

import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbTextBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/k;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class k implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429463b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f429464c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f429465d;

    public k(@Y61.k String str, @l String str2, @l String str3) {
        this.f429463b = str;
        this.f429464c = str2;
        this.f429465d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f429463b, kVar.f429463b) && L.f(this.f429464c, kVar.f429464c) && L.f(this.f429465d, kVar.f429465d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83595b() {
        return getF318502b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF318502b() {
        return this.f429463b;
    }

    public final int hashCode() {
        int iHashCode = this.f429463b.hashCode() * 31;
        String str = this.f429464c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f429465d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbTextBlockItem(stringId=");
        sb2.append(this.f429463b);
        sb2.append(", title=");
        sb2.append(this.f429464c);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f429465d, ')');
    }
}

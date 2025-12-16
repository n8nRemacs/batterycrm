package qt0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbAnySpecialistItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/b;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47438b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429395b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f429396c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f429397d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f429398e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f429399f;

    public C47438b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @l String str4, boolean z12) {
        this.f429395b = str;
        this.f429396c = z12;
        this.f429397d = str2;
        this.f429398e = str3;
        this.f429399f = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47438b)) {
            return false;
        }
        C47438b c47438b = (C47438b) obj;
        return L.f(this.f429395b, c47438b.f429395b) && this.f429396c == c47438b.f429396c && L.f(this.f429397d, c47438b.f429397d) && L.f(this.f429398e, c47438b.f429398e) && L.f(this.f429399f, c47438b.f429399f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return getF272880b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272880b() {
        return this.f429395b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(this.f429395b.hashCode() * 31, 31, this.f429396c), 31, this.f429397d), 31, this.f429398e);
        String str = this.f429399f;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbAnySpecialistItem(stringId=");
        sb2.append(this.f429395b);
        sb2.append(", isClickable=");
        sb2.append(this.f429396c);
        sb2.append(", paramId=");
        sb2.append(this.f429397d);
        sb2.append(", text=");
        sb2.append(this.f429398e);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f429399f, ')');
    }
}

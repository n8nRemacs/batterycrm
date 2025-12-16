package qI;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressSuggestion.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"LqI/b;", "", "", "title", "subtitle", "LqI/f;", ServiceTransportationWidget.LocationField.COORDINATES, "jsonWebToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;LqI/f;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "LqI/f;", "a", "()LqI/f;", "b", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C47299b {

    @com.google.gson.annotations.c(ServiceTransportationWidget.LocationField.COORDINATES)
    @l
    private final f coordinates;

    @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
    @l
    private final String jsonWebToken;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C47299b(@k String str, @k String str2, @l f fVar, @l String str3) {
        this.title = str;
        this.subtitle = str2;
        this.coordinates = fVar;
        this.jsonWebToken = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final f getCoordinates() {
        return this.coordinates;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getJsonWebToken() {
        return this.jsonWebToken;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47299b)) {
            return false;
        }
        C47299b c47299b = (C47299b) obj;
        return L.f(this.title, c47299b.title) && L.f(this.subtitle, c47299b.subtitle) && L.f(this.coordinates, c47299b.coordinates) && L.f(this.jsonWebToken, c47299b.jsonWebToken);
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.subtitle);
        f fVar = this.coordinates;
        int iHashCode = (iD2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.jsonWebToken;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressSuggestion(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", coordinates=");
        sb2.append(this.coordinates);
        sb2.append(", jsonWebToken=");
        return C22026a.c(sb2, this.jsonWebToken, ')');
    }

    public /* synthetic */ C47299b(String str, String str2, f fVar, String str3, int i12, C42822w c42822w) {
        this(str, str2, fVar, (i12 & 8) != 0 ? null : str3);
    }
}

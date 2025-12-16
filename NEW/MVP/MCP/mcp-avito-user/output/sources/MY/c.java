package MY;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DTOs.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMY/c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10718a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10719b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10720c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10721d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f10722e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Image f10723f;

    public c(boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l String str, @Y61.l Image image) {
        this.f10718a = z12;
        this.f10719b = z13;
        this.f10720c = z14;
        this.f10721d = z15;
        this.f10722e = str;
        this.f10723f = image;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10718a == cVar.f10718a && this.f10719b == cVar.f10719b && this.f10720c == cVar.f10720c && this.f10721d == cVar.f10721d && L.f(this.f10722e, cVar.f10722e) && L.f(this.f10723f, cVar.f10723f);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(Boolean.hashCode(this.f10718a) * 31, 31, this.f10719b), 31, this.f10720c), 31, this.f10721d);
        String str = this.f10722e;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f10723f;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelInfo(isSupportChannel=");
        sb2.append(this.f10718a);
        sb2.append(", isSystemChannel=");
        sb2.append(this.f10719b);
        sb2.append(", hasItemContextAndUserIsSeller=");
        sb2.append(this.f10720c);
        sb2.append(", hasItemContextAndUserIsBuyer=");
        sb2.append(this.f10721d);
        sb2.append(", sellerUserId=");
        sb2.append(this.f10722e);
        sb2.append(", sellerAvatar=");
        return AK.c.o(sb2, this.f10723f, ')');
    }
}

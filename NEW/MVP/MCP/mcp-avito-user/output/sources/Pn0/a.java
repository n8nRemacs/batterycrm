package PN0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Client.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPN0/a;", "", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f13057a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalImage f13058b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f13059c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f13060d;

    public a(@l UniversalImage universalImage, @k String str, @k String str2, @l String str3) {
        this.f13057a = str;
        this.f13058b = universalImage;
        this.f13059c = str2;
        this.f13060d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f13057a, aVar.f13057a) && L.f(this.f13058b, aVar.f13058b) && L.f(this.f13059c, aVar.f13059c) && L.f(this.f13060d, aVar.f13060d);
    }

    public final int hashCode() {
        int iHashCode = this.f13057a.hashCode() * 31;
        UniversalImage universalImage = this.f13058b;
        int iD2 = H.d((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f13059c);
        String str = this.f13060d;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Client(id=");
        sb2.append(this.f13057a);
        sb2.append(", image=");
        sb2.append(this.f13058b);
        sb2.append(", name=");
        sb2.append(this.f13059c);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.f13060d, ')');
    }
}

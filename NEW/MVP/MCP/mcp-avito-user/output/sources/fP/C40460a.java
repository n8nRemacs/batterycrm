package fp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomState.kt */
@P
@J41.b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfp/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40460a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f396084a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f396085b;

    public C40460a(@k String str, @l Image image) {
        this.f396084a = str;
        this.f396085b = image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40460a)) {
            return false;
        }
        C40460a c40460a = (C40460a) obj;
        return L.f(this.f396084a, c40460a.f396084a) && L.f(this.f396085b, c40460a.f396085b);
    }

    public final int hashCode() {
        int iHashCode = this.f396084a.hashCode() * 31;
        Image image = this.f396085b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgencyState(name=");
        sb2.append(this.f396084a);
        sb2.append(", image=");
        return AK.c.o(sb2, this.f396085b, ')');
    }
}

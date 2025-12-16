package Ap;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResponsibleAgentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAp/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ap.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C13065a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f625a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f626b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f627c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f628d;

    public C13065a(@k String str, @l Image image, @k String str2, @k String str3) {
        this.f625a = str;
        this.f626b = image;
        this.f627c = str2;
        this.f628d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13065a)) {
            return false;
        }
        C13065a c13065a = (C13065a) obj;
        return L.f(this.f625a, c13065a.f625a) && L.f(this.f626b, c13065a.f626b) && L.f(this.f627c, c13065a.f627c) && L.f(this.f628d, c13065a.f628d);
    }

    public final int hashCode() {
        int iHashCode = this.f625a.hashCode() * 31;
        Image image = this.f626b;
        return this.f628d.hashCode() + H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f627c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentInfo(id=");
        sb2.append(this.f625a);
        sb2.append(", avatar=");
        sb2.append(this.f626b);
        sb2.append(", name=");
        sb2.append(this.f627c);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.f628d, ')');
    }
}

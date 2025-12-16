package kv0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProjectSeller.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/e;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f413281a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f413282b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f413283c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f413284d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Image> f413285e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ArrayList f413286f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43502a f413287g;

    public e(long j12, @k String str, @l String str2, @k String str3, @k List list, @l ArrayList arrayList, @k C43502a c43502a) {
        this.f413281a = j12;
        this.f413282b = str;
        this.f413283c = str2;
        this.f413284d = str3;
        this.f413285e = list;
        this.f413286f = arrayList;
        this.f413287g = c43502a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f413281a == eVar.f413281a && this.f413282b.equals(eVar.f413282b) && L.f(this.f413283c, eVar.f413283c) && this.f413284d.equals(eVar.f413284d) && this.f413285e.equals(eVar.f413285e) && L.f(this.f413286f, eVar.f413286f) && this.f413287g.equals(eVar.f413287g);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f413281a) * 31, 31, this.f413282b);
        String str = this.f413283c;
        int iE2 = H.e(H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f413284d), 31, this.f413285e);
        ArrayList arrayList = this.f413286f;
        return this.f413287g.hashCode() + ((iE2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ProjectSeller(id=" + this.f413281a + ", title=" + this.f413282b + ", priceText=" + this.f413283c + ", description=" + this.f413284d + ", images=" + this.f413285e + ", actions=" + this.f413286f + ", moderationStatus=" + this.f413287g + ')';
    }
}

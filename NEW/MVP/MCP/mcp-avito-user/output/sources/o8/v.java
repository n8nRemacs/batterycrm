package o8;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WriteToSellerEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8/v;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class v implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f419444b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f419445c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f419446d = C28461l.a(com.avito.android.analytics_adjust.t.a(w.f419447a));

    public v(@Y61.l String str, @Y61.k String str2) {
        this.f419444b = str;
        this.f419445c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return L.f(this.f419444b, vVar.f419444b) && L.f(this.f419445c, vVar.f419445c);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f419446d.getEvents();
    }

    public final int hashCode() {
        String str = this.f419444b;
        return this.f419445c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WriteToSellerEvent(email=");
        sb2.append(this.f419444b);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f419445c, ')');
    }
}

package qo0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChangePasswordScreenEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqo0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47422a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429360c;

    public C47422a(@k String str) {
        this.f429359b = str;
        this.f429360c = new ParametrizedClickStreamEvent(4390, 1, Collections.singletonMap("s", str), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47422a) && L.f(this.f429359b, ((C47422a) obj).f429359b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f429360c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429360c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f429360c.f90248c;
    }

    public final int hashCode() {
        return this.f429359b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ChangePasswordScreenEvent(src="), this.f429359b, ')');
    }
}

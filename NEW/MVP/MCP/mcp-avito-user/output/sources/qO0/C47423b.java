package qo0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: PasswordChangeButtonClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqo0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47423b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f429361b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f429362c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429363d;

    public C47423b(@l String str, @k String str2) {
        this.f429361b = str;
        this.f429362c = str2;
        this.f429363d = new ParametrizedClickStreamEvent(4392, 6, P0.g(new Q("sessidhash", str == null ? "" : str), new Q("login_type", str2)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47423b)) {
            return false;
        }
        C47423b c47423b = (C47423b) obj;
        return L.f(this.f429361b, c47423b.f429361b) && L.f(this.f429362c, c47423b.f429362c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f429363d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429363d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f429363d.f90248c;
    }

    public final int hashCode() {
        String str = this.f429361b;
        return this.f429362c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PasswordChangeButtonClickEvent(sessionIdHash=");
        sb2.append(this.f429361b);
        sb2.append(", loginType=");
        return C22026a.c(sb2, this.f429362c, ')');
    }
}

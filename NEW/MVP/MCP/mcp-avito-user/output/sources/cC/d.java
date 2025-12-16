package cc;

import Y61.k;
import com.avito.android.analytics.clickstream.event.FirebaseUploadErrorClickStreamEventType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: FirebaseUploadErrorClickStreamEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcc/d;", "LQc/f;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements Qc.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qc.g f58043b;

    public d(@k String str, @k FirebaseUploadErrorClickStreamEventType firebaseUploadErrorClickStreamEventType) {
        this.f58043b = Qc.h.a("ClickStreamUploadError", P0.g(new Q("cause", str), new Q("type", firebaseUploadErrorClickStreamEventType.f89789b)));
    }

    @Override // Qc.f
    @k
    /* renamed from: getName */
    public final String getF13936b() {
        return this.f58043b.f13936b;
    }

    @Override // Qc.f
    @k
    public final Map<String, String> getParams() {
        return this.f58043b.f13937c;
    }
}

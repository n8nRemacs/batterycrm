package i9;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShowAdvertDetailsEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/j;", "LQc/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements Qc.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Qc.g f398389b;

    public j(@Y61.k Map<String, String> map) {
        this.f398389b = Qc.h.a("Item", map);
    }

    @Override // Qc.f
    @Y61.k
    /* renamed from: getName */
    public final String getF13936b() {
        return this.f398389b.f13936b;
    }

    @Override // Qc.f
    @Y61.k
    public final Map<String, String> getParams() {
        return this.f398389b.f13937c;
    }
}

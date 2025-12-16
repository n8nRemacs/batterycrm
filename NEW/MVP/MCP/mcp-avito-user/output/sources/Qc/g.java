package Qc;

import Y61.k;
import androidx.compose.runtime.C22026a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FirebaseEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQc/g;", "LQc/f;", "_common_analytics-firebase_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13936b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HashMap<String, String> f13937c;

    public g(@k String str, @k HashMap<String, String> map) {
        this.f13936b = str;
        this.f13937c = map;
    }

    @Override // Qc.f
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF13936b() {
        return this.f13936b;
    }

    @Override // Qc.f
    public final Map getParams() {
        return this.f13937c;
    }

    public final f i(Double d12) {
        if (d12 != null) {
            String string = d12.toString();
            HashMap<String, String> map = this.f13937c;
            map.put("value", string);
            map.put("currency", "RUB");
        }
        return this;
    }

    public final f j(Map map) {
        if (map != null) {
            this.f13937c.putAll(map);
        }
        return this;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("FirebaseEvent["), this.f13936b, ']');
    }
}

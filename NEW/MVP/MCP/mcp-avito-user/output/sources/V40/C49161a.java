package v40;

import Y61.k;
import com.avito.android.offlinization.t;
import com.avito.android.offlinization.u;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: MemoryAwareOfflinizationInteceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv40/a;", "Lcom/avito/android/offlinization/t;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49161a implements t {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f440454b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f440455c;

    public C49161a(@k u uVar, @k b bVar) {
        this.f440454b = uVar;
        this.f440455c = bVar;
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        if (this.f440455c.a()) {
            return this.f440454b.intercept(chain);
        }
        t.f208596W1.getClass();
        return t.a.f208598b.intercept(chain);
    }
}

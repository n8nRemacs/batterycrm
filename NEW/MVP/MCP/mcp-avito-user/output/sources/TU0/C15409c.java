package Tu0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import com.google.gson.r;
import dagger.internal.h;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: TransportationGeoTypeAdapterModule_ProvideTransportationGeoTypeAdapterFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LTu0/c;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_service-transportation-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tu0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15409c implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15409c f15973a = new C15409c();

    @Override // javax.inject.Provider
    public final Object get() {
        C15408b.f15972a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(TransportationGeo.class);
        runtimeTypeAdapterFactory.b(TransportationGeo.Routes.class, "routes", null);
        runtimeTypeAdapterFactory.b(TransportationGeo.Raw.class, "raw", null);
        return Collections.singleton(runtimeTypeAdapterFactory);
    }
}

package vF;

import Y61.k;
import com.avito.android.geo_common.adapter.AddressCoordinatesAdapter;
import com.avito.android.util.X5;
import dagger.internal.h;
import kotlin.Metadata;
import uF.C48889b;

/* compiled from: LocationJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LvF/c;", "Ldagger/internal/h;", "Lcom/avito/android/util/X5;", "<init>", "()V", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements h<X5> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f440556a = new c();

    @Override // javax.inject.Provider
    public final Object get() {
        C49205a.f440554a.getClass();
        return new X5(C48889b.class, new AddressCoordinatesAdapter());
    }
}

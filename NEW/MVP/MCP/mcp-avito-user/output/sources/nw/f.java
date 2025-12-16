package nW;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: BackNavigationLocationStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnW/f;", "LnW/e;", "<init>", "()V", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HashMap<String, Location> f415171a = new HashMap<>();

    @Inject
    public f() {
    }

    @Override // nW.e
    public final void a(@k Location location, @k String str) {
        this.f415171a.put(str, location);
    }

    @Override // nW.e
    @l
    public final Location b(@k String str) {
        return this.f415171a.get(str);
    }
}

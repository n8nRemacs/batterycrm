package v40;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OfflineCacheAvailabilityProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv40/c;", "Lv40/b;", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f440456a = true;

    @Inject
    public c() {
    }

    @Override // v40.b
    public final synchronized boolean a() {
        return this.f440456a;
    }

    @Override // v40.b
    public final synchronized void b() {
        this.f440456a = false;
    }
}

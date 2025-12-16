package pK;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.server_time.f;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CurrentTime.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpK/b;", "LpK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements InterfaceC46970a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f428505a;

    @Inject
    public b(@k f fVar) {
        this.f428505a = fVar;
    }

    @Override // pK.InterfaceC46970a
    public final long get() {
        return System.currentTimeMillis();
    }
}

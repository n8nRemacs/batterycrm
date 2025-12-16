package GY;

import GY.a;
import GY.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.filter.f;
import com.avito.android.messenger.channels.filter.i;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: ChannelsFilterHeaderStateFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGY/d;", "LGY/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f6565a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JY.a f6566b;

    @Inject
    public d(@k f fVar, @k JY.a aVar) {
        this.f6565a = fVar;
        this.f6566b = aVar;
    }

    @Override // GY.c
    @k
    public final b.a a() {
        return b.a.f6564a;
    }

    @Override // GY.c
    @k
    public final List<a> b(@k i iVar) {
        if (!this.f6566b.j()) {
            return C42784z0.f406748b;
        }
        f fVar = this.f6565a;
        return C42745f0.U(new a.C0355a(fVar.a(), !iVar.f187159a, 0, 4, null), new a.b(fVar.b(), iVar.f187159a, 0, 4, null));
    }
}

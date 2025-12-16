package HY;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsPrivateBannerState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LHY/j;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f7245b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final j f7246c = new j(null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final com.avito.android.messenger.channels.action_banner.d f7247a;

    /* compiled from: ChannelsPrivateBannerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHY/j$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.l com.avito.android.messenger.channels.action_banner.d dVar) {
        this.f7247a = dVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && L.f(this.f7247a, ((j) obj).f7247a);
    }

    public final int hashCode() {
        com.avito.android.messenger.channels.action_banner.d dVar = this.f7247a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ChannelsPrivateBannerState(banner=" + this.f7247a + ')';
    }
}

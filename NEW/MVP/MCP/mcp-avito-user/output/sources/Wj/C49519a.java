package wJ;

import Y61.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ManualAudioSessionImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwJ/a;", "LCQ0/a;", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49519a implements CQ0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Map<String, ? extends com.avito.avcalls.rtc.peer_connection.a> f441372a = P0.c();

    @Override // CQ0.a
    public final void I(boolean z12) {
        for (com.avito.avcalls.rtc.peer_connection.a aVar : this.f441372a.values()) {
            aVar.c(z12);
            aVar.k(z12);
        }
    }

    @Override // CQ0.a
    public final void J(@k String str, @k com.avito.avcalls.rtc.peer_connection.a aVar) {
        this.f441372a = P0.l(this.f441372a, new Q(str, aVar));
    }

    @Override // CQ0.a
    public final void K(@k String str) {
        this.f441372a = P0.i(this.f441372a, str);
    }
}

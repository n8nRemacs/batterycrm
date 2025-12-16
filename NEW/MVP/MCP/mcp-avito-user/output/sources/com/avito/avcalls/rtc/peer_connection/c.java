package com.avito.avcalls.rtc.peer_connection;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: PeerConnectionFactory.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: PeerConnectionFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/a;", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/avcalls/rtc/connecting/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<com.avito.avcalls.rtc.connecting.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e2 f333205l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2 e2Var) {
            super(1);
            this.f333205l = e2Var;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.avcalls.rtc.connecting.a aVar) {
            com.avito.avcalls.rtc.connecting.a aVar2 = aVar;
            if (!this.f333205l.K5(aVar2)) {
                com.avito.avcalls.logger.g.f332960a.getClass();
                com.avito.avcalls.logger.g.a("PeerConnectionObserver", aVar2 + " was not emitted. PCSession will not receive this event", null);
            }
            return G0.f406611a;
        }
    }

    @Y61.k
    public static final Q<com.avito.avcalls.rtc.peer_connection.a, d2<com.avito.avcalls.rtc.connecting.a>> a(@Y61.k b bVar, @Y61.k String str, @Y61.k com.avito.avcalls.rtc.connecting.b bVar2) {
        e2 e2VarB = f2.b(100, 0, null, 6);
        return new Q<>(bVar.E(str, bVar2, new a(e2VarB)), e2VarB);
    }
}

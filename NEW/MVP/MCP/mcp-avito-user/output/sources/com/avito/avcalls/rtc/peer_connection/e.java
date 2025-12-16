package com.avito.avcalls.rtc.peer_connection;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PeerConnectionFactoryProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/peer_connection/e;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f333207a;

    /* compiled from: PeerConnectionFactoryProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/peer_connection/d;", "invoke", "()Lcom/avito/avcalls/rtc/peer_connection/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<d> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<b> f333208l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<? extends b> aVar) {
            super(0);
            this.f333208l = aVar;
        }

        @Override // Y41.a
        public final d invoke() {
            return new d(this.f333208l.invoke());
        }
    }

    public e(@Y61.k Y41.a<? extends b> aVar) {
        this.f333207a = C42727D.c(new a(aVar));
    }
}

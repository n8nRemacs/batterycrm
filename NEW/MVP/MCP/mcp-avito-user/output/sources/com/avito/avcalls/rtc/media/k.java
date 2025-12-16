package com.avito.avcalls.rtc.media;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoSourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/media/k;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f333189a;

    /* compiled from: VideoSourceProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/media/j;", "invoke", "()Lcom/avito/avcalls/rtc/media/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<j> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.avcalls.rtc.peer_connection.e f333190l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.avcalls.rtc.peer_connection.e eVar) {
            super(0);
            this.f333190l = eVar;
        }

        @Override // Y41.a
        public final j invoke() {
            return ((com.avito.avcalls.rtc.peer_connection.b) this.f333190l.f333207a.getValue()).h();
        }
    }

    public k(@Y61.k com.avito.avcalls.rtc.peer_connection.e eVar) {
        this.f333189a = C42727D.c(new a(eVar));
    }
}

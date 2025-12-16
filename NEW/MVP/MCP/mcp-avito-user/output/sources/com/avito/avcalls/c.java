package com.avito.avcalls;

import android.content.Context;
import com.avito.avcalls.a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsBuilderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/c;", "Lcom/avito/avcalls/a$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Executor f332537a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a.e f332538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a.g f332539c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.f f332540d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.d f332541e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC10303a f332542f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.avcalls.rtc.peer_connection.b> f332543g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CQ0.a f332544h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.rtc.device.video.capturing.b f332545i;

    public c(Context context, Executor executor, a.e eVar, a.g gVar, a.f fVar, com.avito.avcalls.logger.a aVar, a.d dVar, a.InterfaceC10303a interfaceC10303a, boolean z12, Y41.a aVar2, CQ0.a aVar3, com.avito.avcalls.rtc.device.video.capturing.b bVar, int i12, C42822w c42822w) {
        this.f332537a = (i12 & 2) != 0 ? Executors.newSingleThreadExecutor() : executor;
        this.f332538b = eVar;
        this.f332539c = gVar;
        this.f332540d = fVar;
        this.f332541e = dVar;
        this.f332542f = interfaceC10303a;
        this.f332543g = aVar2;
        this.f332544h = aVar3;
        this.f332545i = bVar;
    }
}

package com.avito.avcalls.android;

import android.content.Context;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.call.C36177e;
import com.avito.avcalls.android.call.S;
import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import com.avito.avcalls.android.rtc.y;
import com.avito.avcalls.android.video.m;
import com.avito.avcalls.android.video.v;
import com.russhwolf.settings.C37852a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.C42727D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.t1;

/* compiled from: AvCallsBuilderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/e;", "Lcom/avito/avcalls/android/a$b;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f331692a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Executor f331693b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a.e f331694c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.g f331695d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.f f331696e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AvCallsLoggingConfiguration f331697f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.d f331698g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC10304a f331699h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f331700i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f331701j;

    public e(@Y61.k Context context, @Y61.k Executor executor, @Y61.k a.e eVar, @Y61.k a.g gVar, @Y61.k a.f fVar, @Y61.k AvCallsLoggingConfiguration avCallsLoggingConfiguration, @Y61.k a.d dVar, @Y61.k a.InterfaceC10304a interfaceC10304a, boolean z12, boolean z13) {
        this.f331692a = context;
        this.f331693b = executor;
        this.f331694c = eVar;
        this.f331695d = gVar;
        this.f331696e = fVar;
        this.f331697f = avCallsLoggingConfiguration;
        this.f331698g = dVar;
        this.f331699h = interfaceC10304a;
        this.f331700i = z12;
        this.f331701j = z13;
    }

    @Y61.k
    public final g a() {
        M mB2 = A0.b(this.f331693b);
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        com.avito.avcalls.android.utils.coroutines.c cVar2 = new com.avito.avcalls.android.utils.coroutines.c(mB2, K.f411877a, this.f331698g);
        com.avito.avcalls.android.signaling.transport.external.a aVar = new com.avito.avcalls.android.signaling.transport.external.a();
        Context context = this.f331692a;
        com.avito.avcalls.android.config.f fVar = new com.avito.avcalls.android.config.f(new C37852a.C10808a(context).a());
        com.avito.avcalls.android.connection_quality.b bVar = new com.avito.avcalls.android.connection_quality.b(cVar2);
        com.avito.avcalls.android.signaling.p pVar = new com.avito.avcalls.android.signaling.p(new com.avito.avcalls.android.signaling.transport.g(cVar2, aVar, new com.avito.avcalls.android.signaling.transport.external.h(this.f331694c), fVar.f331673b, bVar));
        y yVar = new y(context);
        com.avito.avcalls.android.utils.c cVar3 = new com.avito.avcalls.android.utils.c(yVar, this.f331701j);
        wQ0.d dVar = new wQ0.d();
        com.avito.avcalls.android.rtc.e eVar = new com.avito.avcalls.android.rtc.e(new d(this, dVar));
        Z1 z1A = p2.a(null);
        v vVar = new v(eVar, cVar2, fVar, m.a.f332492a, yVar, new com.avito.avcalls.android.utils.coroutines.h(z1A));
        wQ0.c cVar4 = new wQ0.c(dVar);
        return new g(yVar, cVar2, new C36177e(cVar2, new com.avito.avcalls.android.call.v(new S(eVar, fVar, vVar, cVar4), pVar, cVar3, fVar), pVar, this.f331695d, null, C42727D.c(new c(vVar)), z1A, cVar4, bVar, 16, null), aVar, this.f331696e, this.f331697f, this.f331699h, !this.f331700i ? null : new com.avito.avcalls.android.config.d(pVar, U.a(cVar2.f332438d.plus(t1.b()).plus(new kotlinx.coroutines.S("config_loader_coroutine"))), fVar), fVar);
    }

    public /* synthetic */ e(Context context, Executor executor, a.e eVar, a.g gVar, a.f fVar, AvCallsLoggingConfiguration avCallsLoggingConfiguration, a.d dVar, a.InterfaceC10304a interfaceC10304a, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? Executors.newSingleThreadExecutor() : executor, eVar, gVar, fVar, avCallsLoggingConfiguration, dVar, interfaceC10304a, z12, z13);
    }
}

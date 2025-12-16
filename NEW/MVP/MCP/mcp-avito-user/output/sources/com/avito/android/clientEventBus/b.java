package com.avito.android.clientEventBus;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.N;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mx0.InterfaceC44150b;

/* compiled from: ClientEventBusImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/clientEventBus/b;", "Lcom/avito/android/clientEventBus/a;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.clientEventBus.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44150b f118533a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.useCase.c f118534b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.useCase.l f118535c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.useCase.h f118536d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f118537e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AW.f f118538f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final t f118539g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f118540h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.useCase.a f118541i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Throwable> f118542j = new com.jakewharton.rxrelay3.c<>();

    /* compiled from: ClientEventBusImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/clientEventBus/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k InterfaceC44150b interfaceC44150b, @Y61.k com.avito.android.clientEventBus.useCase.c cVar, @Y61.k com.avito.android.clientEventBus.useCase.l lVar, @Y61.k com.avito.android.clientEventBus.useCase.h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k AW.f fVar, @Y61.k t tVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.clientEventBus.useCase.a aVar) {
        this.f118533a = interfaceC44150b;
        this.f118534b = cVar;
        this.f118535c = lVar;
        this.f118536d = hVar;
        this.f118537e = interfaceC35745a5;
        this.f118538f = fVar;
        this.f118539g = tVar;
        this.f118540h = interfaceC28373a;
        this.f118541i = aVar;
        A1.h(a().D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new h(this)), new i(this), null, 6);
    }

    @Override // com.avito.android.clientEventBus.a
    @Y61.k
    public final B0 a() {
        return this.f118533a.a().d0(c.f118543b);
    }

    @Override // com.avito.android.clientEventBus.a
    @Y61.k
    public final O b(@Y61.k Class cls, @Y61.k mx0.e eVar) {
        com.avito.android.clientEventBus.useCase.c cVar = this.f118534b;
        z zVarA = cVar.f118571a.a(cls, eVar);
        GL.a aVar = new GL.a(8, cVar, eVar);
        zVarA.getClass();
        return z.e0(new N(zVarA, aVar), this.f118535c.a(eVar).A(), this.f118542j.T(d.f118544b, Integer.MAX_VALUE)).j0(this.f118537e.e()).I(new e(this));
    }

    @Override // com.avito.android.clientEventBus.a
    @Y61.k
    public final O c(@Y61.k Class cls) {
        Object next;
        Iterator<T> it = this.f118541i.f118568a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((mx0.c) next).f414830a.equals(cls)) {
                break;
            }
        }
        mx0.c cVar = (mx0.c) next;
        mx0.e eVar = cVar != null ? cVar.f414831b : null;
        if (eVar != null) {
            return b(cls, eVar);
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.k(cls, "SocketEventMapping was not provided for event "));
    }
}

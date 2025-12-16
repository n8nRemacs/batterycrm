package Eo;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.clientEventBus.t;
import com.avito.android.clientEventBus.useCase.i;
import com.avito.android.clientEventBus.useCase.l;
import com.avito.android.clientEventBus.useCase.m;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mx0.InterfaceC44150b;
import ru.avito.messenger.internal.socket_events.f;

/* compiled from: ClientEventBusModule_ProvideClientEventBusFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LEo/b;", "Ldagger/internal/h;", "Lcom/avito/android/clientEventBus/a;", "a", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13512b implements h<com.avito.android.clientEventBus.a> {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f4231i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f4232a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.clientEventBus.useCase.d f4233b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final m f4234c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final i f4235d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<InterfaceC35745a5> f4236e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C13514d f4237f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final dagger.internal.f f4238g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.clientEventBus.useCase.b f4239h;

    /* compiled from: ClientEventBusModule_ProvideClientEventBusFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo/b$a;", "", "<init>", "()V", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13512b(@k C13511a c13511a, @k f fVar, @k com.avito.android.clientEventBus.useCase.d dVar, @k m mVar, @k i iVar, @k Provider provider, @k C13514d c13514d, @k dagger.internal.f fVar2, @k com.avito.android.clientEventBus.useCase.b bVar) {
        this.f4232a = fVar;
        this.f4233b = dVar;
        this.f4234c = mVar;
        this.f4235d = iVar;
        this.f4236e = provider;
        this.f4237f = c13514d;
        this.f4238g = fVar2;
        this.f4239h = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC44150b interfaceC44150b = (InterfaceC44150b) this.f4232a.get();
        com.avito.android.clientEventBus.useCase.c cVar = (com.avito.android.clientEventBus.useCase.c) this.f4233b.get();
        l lVar = (l) this.f4234c.get();
        com.avito.android.clientEventBus.useCase.h hVar = (com.avito.android.clientEventBus.useCase.h) this.f4235d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f4236e.get();
        t tVar = (t) this.f4237f.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f4238g.get();
        com.avito.android.clientEventBus.useCase.a aVar = (com.avito.android.clientEventBus.useCase.a) this.f4239h.get();
        f4231i.getClass();
        return new com.avito.android.clientEventBus.b(interfaceC44150b, cVar, lVar, hVar, interfaceC35745a5, AW.f.f434a, tVar, interfaceC28373a, aVar);
    }
}

package io.ktor.client;

import io.ktor.client.engine.j;
import io.ktor.client.plugins.A;
import io.ktor.client.plugins.C;
import io.ktor.util.InterfaceC41588c;
import io.ktor.util.k0;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HttpClientConfig.kt */
@k0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/client/d;", "Lio/ktor/client/engine/j;", "T", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d<T extends io.ktor.client.engine.j> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f398838a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f398839b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f398840c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public N f398841d = a.f398845l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f398842e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f398843f = true;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f398844g;

    /* compiled from: HttpClientConfig.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/engine/j;", "T", "Lkotlin/G0;", "invoke", "(Lio/ktor/client/engine/j;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.l<T, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f398845l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj) {
            return G0.f406611a;
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: Y41.l<TBuilder, kotlin.G0> */
    /* compiled from: HttpClientConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "TBuilder", "TPlugin", "Lio/ktor/client/engine/j;", "T", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Object, G0> f398846l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<TBuilder, G0> f398847m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: Y41.l<? super TBuilder, kotlin.G0> */
        public b(Y41.l<Object, G0> lVar, Y41.l<? super TBuilder, G0> lVar2) {
            super(1);
            this.f398846l = lVar;
            this.f398847m = lVar2;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            Y41.l<Object, G0> lVar = this.f398846l;
            if (lVar != null) {
                lVar.invoke(obj);
            }
            this.f398847m.invoke(obj);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: io.ktor.client.plugins.A<TBuilder, TPlugin> */
    /* JADX WARN: Unknown type variable: TPlugin in type: io.ktor.client.plugins.A<TBuilder, TPlugin> */
    /* compiled from: HttpClientConfig.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "TBuilder", "TPlugin", "Lio/ktor/client/engine/j;", "T", "Lio/ktor/client/a;", "scope", "Lkotlin/G0;", "invoke", "(Lio/ktor/client/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends N implements Y41.l<io.ktor.client.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ A<TBuilder, TPlugin> f398848l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: io.ktor.client.plugins.A<? extends TBuilder, TPlugin> */
        /* JADX WARN: Unknown type variable: TPlugin in type: io.ktor.client.plugins.A<? extends TBuilder, TPlugin> */
        public c(A<? extends TBuilder, TPlugin> a12) {
            super(1);
            this.f398848l = a12;
        }

        @Override // Y41.l
        public final G0 invoke(io.ktor.client.a aVar) {
            io.ktor.client.a aVar2 = aVar;
            InterfaceC41588c interfaceC41588c = (InterfaceC41588c) aVar2.f398783j.e(C.f399003a, f.f398993l);
            LinkedHashMap linkedHashMap = aVar2.f398785l.f398839b;
            A<TBuilder, TPlugin> a12 = this.f398848l;
            Object objB = a12.b((Y41.l) linkedHashMap.get(a12.getKey()));
            a12.a(objB, aVar2);
            interfaceC41588c.a(a12.getKey(), objB);
            return G0.f406611a;
        }
    }

    public d() {
        io.ktor.util.s0.f400547a.getClass();
        this.f398844g = io.ktor.util.s0.f400548b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void a(@Y61.k U51.c cVar) {
        this.f398841d = new io.ktor.client.c(this.f398841d, cVar);
    }

    public final <TBuilder, TPlugin> void b(@Y61.k A<? extends TBuilder, TPlugin> a12, @Y61.k Y41.l<? super TBuilder, G0> lVar) {
        LinkedHashMap linkedHashMap = this.f398839b;
        linkedHashMap.put(a12.getKey(), new b((Y41.l) linkedHashMap.get(a12.getKey()), lVar));
        LinkedHashMap linkedHashMap2 = this.f398838a;
        if (linkedHashMap2.containsKey(a12.getKey())) {
            return;
        }
        linkedHashMap2.put(a12.getKey(), new c(a12));
    }
}

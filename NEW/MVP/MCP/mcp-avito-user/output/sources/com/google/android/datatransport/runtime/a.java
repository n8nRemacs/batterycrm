package com.google.android.datatransport.runtime;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.c;
import sZ0.InterfaceC48137a;
import sZ0.InterfaceC48138b;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes10.dex */
public final class a implements InterfaceC48137a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f343051a = new a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.android.datatransport.runtime.a$a, reason: collision with other inner class name */
    public static final class C10561a implements com.google.firebase.encoders.d<CX0.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C10561a f343052a = new C10561a();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343053b;

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343054c;

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343055d;

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343056e;

        static {
            c.b bVar = new c.b("window");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f343053b = C31685o.l(aVar, bVar);
            c.b bVar2 = new c.b("logSourceMetrics");
            com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a();
            aVar2.f361567a = 2;
            f343054c = C31685o.l(aVar2, bVar2);
            c.b bVar3 = new c.b("globalMetrics");
            com.google.firebase.encoders.proto.a aVar3 = new com.google.firebase.encoders.proto.a();
            aVar3.f361567a = 3;
            f343055d = C31685o.l(aVar3, bVar3);
            c.b bVar4 = new c.b("appNamespace");
            com.google.firebase.encoders.proto.a aVar4 = new com.google.firebase.encoders.proto.a();
            aVar4.f361567a = 4;
            f343056e = C31685o.l(aVar4, bVar4);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CX0.a aVar = (CX0.a) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f343053b, aVar.f2208a);
            eVar.add(f343054c, aVar.f2209b);
            eVar.add(f343055d, aVar.f2210c);
            eVar.add(f343056e, aVar.f2211d);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    public static final class b implements com.google.firebase.encoders.d<CX0.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f343057a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343058b;

        static {
            c.b bVar = new c.b("storageMetrics");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f343058b = C31685o.l(aVar, bVar);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f343058b, ((CX0.b) obj).f2217a);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    public static final class c implements com.google.firebase.encoders.d<LogEventDropped> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f343059a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343060b;

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343061c;

        static {
            c.b bVar = new c.b("eventsDroppedCount");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f343060b = C31685o.l(aVar, bVar);
            c.b bVar2 = new c.b("reason");
            com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a();
            aVar2.f361567a = 3;
            f343061c = C31685o.l(aVar2, bVar2);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f343060b, logEventDropped.f343152a);
            eVar.add(f343061c, logEventDropped.f343153b);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    public static final class d implements com.google.firebase.encoders.d<CX0.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f343062a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343063b;

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343064c;

        static {
            c.b bVar = new c.b("logSource");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f343063b = C31685o.l(aVar, bVar);
            c.b bVar2 = new c.b("logEventDropped");
            com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a();
            aVar2.f361567a = 2;
            f343064c = C31685o.l(aVar2, bVar2);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CX0.c cVar = (CX0.c) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f343063b, cVar.f2220a);
            eVar.add(f343064c, cVar.f2221b);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    public static final class e implements com.google.firebase.encoders.d<n> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f343065a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343066b = com.google.firebase.encoders.c.b("clientMetrics");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f343066b, ((n) obj).a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    public static final class f implements com.google.firebase.encoders.d<CX0.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f343067a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343068b;

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343069c;

        static {
            c.b bVar = new c.b("currentCacheSizeBytes");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f343068b = C31685o.l(aVar, bVar);
            c.b bVar2 = new c.b("maxCacheSizeBytes");
            com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a();
            aVar2.f361567a = 2;
            f343069c = C31685o.l(aVar2, bVar2);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CX0.d dVar = (CX0.d) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f343068b, dVar.f2225a);
            eVar.add(f343069c, dVar.f2226b);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    public static final class g implements com.google.firebase.encoders.d<CX0.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f343070a = new g();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343071b;

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f343072c;

        static {
            c.b bVar = new c.b("startMs");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f343071b = C31685o.l(aVar, bVar);
            c.b bVar2 = new c.b("endMs");
            com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a();
            aVar2.f361567a = 2;
            f343072c = C31685o.l(aVar2, bVar2);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CX0.e eVar = (CX0.e) obj;
            com.google.firebase.encoders.e eVar2 = (com.google.firebase.encoders.e) obj2;
            eVar2.add(f343071b, eVar.f2230a);
            eVar2.add(f343072c, eVar.f2231b);
        }
    }

    @Override // sZ0.InterfaceC48137a
    public final void configure(InterfaceC48138b<?> interfaceC48138b) {
        interfaceC48138b.registerEncoder(n.class, e.f343065a);
        interfaceC48138b.registerEncoder(CX0.a.class, C10561a.f343052a);
        interfaceC48138b.registerEncoder(CX0.e.class, g.f343070a);
        interfaceC48138b.registerEncoder(CX0.c.class, d.f343062a);
        interfaceC48138b.registerEncoder(LogEventDropped.class, c.f343059a);
        interfaceC48138b.registerEncoder(CX0.b.class, b.f343057a);
        interfaceC48138b.registerEncoder(CX0.d.class, f.f343067a);
    }
}

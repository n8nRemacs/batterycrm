package com.google.android.datatransport.cct.internal;

import sZ0.InterfaceC48137a;
import sZ0.InterfaceC48138b;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes10.dex */
public final class b implements InterfaceC48137a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f342951a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class a implements com.google.firebase.encoders.d<com.google.android.datatransport.cct.internal.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f342952a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342953b = com.google.firebase.encoders.c.b("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342954c = com.google.firebase.encoders.c.b("model");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342955d = com.google.firebase.encoders.c.b("hardware");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342956e = com.google.firebase.encoders.c.b("device");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342957f = com.google.firebase.encoders.c.b("product");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342958g = com.google.firebase.encoders.c.b("osBuild");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342959h = com.google.firebase.encoders.c.b("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342960i = com.google.firebase.encoders.c.b("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342961j = com.google.firebase.encoders.c.b("locale");

        /* renamed from: k, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342962k = com.google.firebase.encoders.c.b("country");

        /* renamed from: l, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342963l = com.google.firebase.encoders.c.b("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342964m = com.google.firebase.encoders.c.b("applicationBuild");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            com.google.android.datatransport.cct.internal.a aVar = (com.google.android.datatransport.cct.internal.a) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f342953b, aVar.m());
            eVar.add(f342954c, aVar.j());
            eVar.add(f342955d, aVar.f());
            eVar.add(f342956e, aVar.d());
            eVar.add(f342957f, aVar.l());
            eVar.add(f342958g, aVar.k());
            eVar.add(f342959h, aVar.h());
            eVar.add(f342960i, aVar.e());
            eVar.add(f342961j, aVar.g());
            eVar.add(f342962k, aVar.c());
            eVar.add(f342963l, aVar.i());
            eVar.add(f342964m, aVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.internal.b$b, reason: collision with other inner class name */
    public static final class C10560b implements com.google.firebase.encoders.d<j> {

        /* renamed from: a, reason: collision with root package name */
        public static final C10560b f342965a = new C10560b();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342966b = com.google.firebase.encoders.c.b("logRequest");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f342966b, ((j) obj).b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class c implements com.google.firebase.encoders.d<ClientInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f342967a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342968b = com.google.firebase.encoders.c.b("clientType");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342969c = com.google.firebase.encoders.c.b("androidClientInfo");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ClientInfo clientInfo = (ClientInfo) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f342968b, clientInfo.c());
            eVar.add(f342969c, clientInfo.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class d implements com.google.firebase.encoders.d<k> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f342970a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342971b = com.google.firebase.encoders.c.b("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342972c = com.google.firebase.encoders.c.b("eventCode");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342973d = com.google.firebase.encoders.c.b("eventUptimeMs");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342974e = com.google.firebase.encoders.c.b("sourceExtension");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342975f = com.google.firebase.encoders.c.b("sourceExtensionJsonProto3");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342976g = com.google.firebase.encoders.c.b("timezoneOffsetSeconds");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342977h = com.google.firebase.encoders.c.b("networkConnectionInfo");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            k kVar = (k) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f342971b, kVar.b());
            eVar.add(f342972c, kVar.a());
            eVar.add(f342973d, kVar.c());
            eVar.add(f342974e, kVar.e());
            eVar.add(f342975f, kVar.f());
            eVar.add(f342976g, kVar.g());
            eVar.add(f342977h, kVar.d());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class e implements com.google.firebase.encoders.d<l> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f342978a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342979b = com.google.firebase.encoders.c.b("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342980c = com.google.firebase.encoders.c.b("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342981d = com.google.firebase.encoders.c.b("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342982e = com.google.firebase.encoders.c.b("logSource");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342983f = com.google.firebase.encoders.c.b("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342984g = com.google.firebase.encoders.c.b("logEvent");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342985h = com.google.firebase.encoders.c.b("qosTier");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            l lVar = (l) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f342979b, lVar.g());
            eVar.add(f342980c, lVar.h());
            eVar.add(f342981d, lVar.b());
            eVar.add(f342982e, lVar.d());
            eVar.add(f342983f, lVar.e());
            eVar.add(f342984g, lVar.c());
            eVar.add(f342985h, lVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    public static final class f implements com.google.firebase.encoders.d<NetworkConnectionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f342986a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342987b = com.google.firebase.encoders.c.b("networkType");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f342988c = com.google.firebase.encoders.c.b("mobileSubtype");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f342987b, networkConnectionInfo.c());
            eVar.add(f342988c, networkConnectionInfo.b());
        }
    }

    @Override // sZ0.InterfaceC48137a
    public final void configure(InterfaceC48138b<?> interfaceC48138b) {
        C10560b c10560b = C10560b.f342965a;
        interfaceC48138b.registerEncoder(j.class, c10560b);
        interfaceC48138b.registerEncoder(com.google.android.datatransport.cct.internal.d.class, c10560b);
        e eVar = e.f342978a;
        interfaceC48138b.registerEncoder(l.class, eVar);
        interfaceC48138b.registerEncoder(g.class, eVar);
        c cVar = c.f342967a;
        interfaceC48138b.registerEncoder(ClientInfo.class, cVar);
        interfaceC48138b.registerEncoder(com.google.android.datatransport.cct.internal.e.class, cVar);
        a aVar = a.f342952a;
        interfaceC48138b.registerEncoder(com.google.android.datatransport.cct.internal.a.class, aVar);
        interfaceC48138b.registerEncoder(com.google.android.datatransport.cct.internal.c.class, aVar);
        d dVar = d.f342970a;
        interfaceC48138b.registerEncoder(k.class, dVar);
        interfaceC48138b.registerEncoder(com.google.android.datatransport.cct.internal.f.class, dVar);
        f fVar = f.f342986a;
        interfaceC48138b.registerEncoder(NetworkConnectionInfo.class, fVar);
        interfaceC48138b.registerEncoder(i.class, fVar);
    }
}

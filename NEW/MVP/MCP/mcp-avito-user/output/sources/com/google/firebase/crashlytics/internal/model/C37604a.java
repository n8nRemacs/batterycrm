package com.google.firebase.crashlytics.internal.model;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import sZ0.InterfaceC48137a;
import sZ0.InterfaceC48138b;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: com.google.firebase.crashlytics.internal.model.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37604a implements InterfaceC48137a {

    /* renamed from: a, reason: collision with root package name */
    public static final C37604a f361080a = new C37604a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$a, reason: collision with other inner class name */
    public static final class C10716a implements com.google.firebase.encoders.d<CrashlyticsReport.a.AbstractC10700a> {

        /* renamed from: a, reason: collision with root package name */
        public static final C10716a f361081a = new C10716a();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361082b = com.google.firebase.encoders.c.b("arch");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361083c = com.google.firebase.encoders.c.b("libraryName");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361084d = com.google.firebase.encoders.c.b("buildId");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.a.AbstractC10700a abstractC10700a = (CrashlyticsReport.a.AbstractC10700a) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361082b, abstractC10700a.b());
            eVar.add(f361083c, abstractC10700a.d());
            eVar.add(f361084d, abstractC10700a.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$b */
    public static final class b implements com.google.firebase.encoders.d<CrashlyticsReport.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f361085a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361086b = com.google.firebase.encoders.c.b("pid");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361087c = com.google.firebase.encoders.c.b("processName");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361088d = com.google.firebase.encoders.c.b("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361089e = com.google.firebase.encoders.c.b("importance");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361090f = com.google.firebase.encoders.c.b("pss");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361091g = com.google.firebase.encoders.c.b("rss");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361092h = com.google.firebase.encoders.c.b("timestamp");

        /* renamed from: i, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361093i = com.google.firebase.encoders.c.b("traceFile");

        /* renamed from: j, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361094j = com.google.firebase.encoders.c.b("buildIdMappingForArch");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.a aVar = (CrashlyticsReport.a) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361086b, aVar.d());
            eVar.add(f361087c, aVar.e());
            eVar.add(f361088d, aVar.g());
            eVar.add(f361089e, aVar.c());
            eVar.add(f361090f, aVar.f());
            eVar.add(f361091g, aVar.h());
            eVar.add(f361092h, aVar.i());
            eVar.add(f361093i, aVar.j());
            eVar.add(f361094j, aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$c */
    public static final class c implements com.google.firebase.encoders.d<CrashlyticsReport.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f361095a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361096b = com.google.firebase.encoders.c.b("key");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361097c = com.google.firebase.encoders.c.b("value");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.d dVar = (CrashlyticsReport.d) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361096b, dVar.b());
            eVar.add(f361097c, dVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$d */
    public static final class d implements com.google.firebase.encoders.d<CrashlyticsReport> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f361098a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361099b = com.google.firebase.encoders.c.b("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361100c = com.google.firebase.encoders.c.b("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361101d = com.google.firebase.encoders.c.b("platform");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361102e = com.google.firebase.encoders.c.b("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361103f = com.google.firebase.encoders.c.b("buildVersion");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361104g = com.google.firebase.encoders.c.b("displayVersion");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361105h = com.google.firebase.encoders.c.b("session");

        /* renamed from: i, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361106i = com.google.firebase.encoders.c.b("ndkPayload");

        /* renamed from: j, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361107j = com.google.firebase.encoders.c.b("appExitInfo");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361099b, crashlyticsReport.i());
            eVar.add(f361100c, crashlyticsReport.e());
            eVar.add(f361101d, crashlyticsReport.h());
            eVar.add(f361102e, crashlyticsReport.f());
            eVar.add(f361103f, crashlyticsReport.c());
            eVar.add(f361104g, crashlyticsReport.d());
            eVar.add(f361105h, crashlyticsReport.j());
            eVar.add(f361106i, crashlyticsReport.g());
            eVar.add(f361107j, crashlyticsReport.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$e */
    public static final class e implements com.google.firebase.encoders.d<CrashlyticsReport.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f361108a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361109b = com.google.firebase.encoders.c.b("files");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361110c = com.google.firebase.encoders.c.b("orgId");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.e eVar = (CrashlyticsReport.e) obj;
            com.google.firebase.encoders.e eVar2 = (com.google.firebase.encoders.e) obj2;
            eVar2.add(f361109b, eVar.b());
            eVar2.add(f361110c, eVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$f */
    public static final class f implements com.google.firebase.encoders.d<CrashlyticsReport.e.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f361111a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361112b = com.google.firebase.encoders.c.b("filename");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361113c = com.google.firebase.encoders.c.b("contents");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.e.b bVar = (CrashlyticsReport.e.b) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361112b, bVar.c());
            eVar.add(f361113c, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$g */
    public static final class g implements com.google.firebase.encoders.d<CrashlyticsReport.f.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f361114a = new g();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361115b = com.google.firebase.encoders.c.b("identifier");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361116c = com.google.firebase.encoders.c.b("version");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361117d = com.google.firebase.encoders.c.b("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361118e = com.google.firebase.encoders.c.b("organization");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361119f = com.google.firebase.encoders.c.b("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361120g = com.google.firebase.encoders.c.b("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361121h = com.google.firebase.encoders.c.b("developmentPlatformVersion");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.a aVar = (CrashlyticsReport.f.a) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361115b, aVar.e());
            eVar.add(f361116c, aVar.h());
            eVar.add(f361117d, aVar.d());
            eVar.add(f361118e, aVar.g());
            eVar.add(f361119f, aVar.f());
            eVar.add(f361120g, aVar.b());
            eVar.add(f361121h, aVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$h */
    public static final class h implements com.google.firebase.encoders.d<CrashlyticsReport.f.a.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f361122a = new h();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361123b = com.google.firebase.encoders.c.b("clsId");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f361123b, ((CrashlyticsReport.f.a.b) obj).a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$i */
    public static final class i implements com.google.firebase.encoders.d<CrashlyticsReport.f.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f361124a = new i();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361125b = com.google.firebase.encoders.c.b("arch");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361126c = com.google.firebase.encoders.c.b("model");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361127d = com.google.firebase.encoders.c.b("cores");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361128e = com.google.firebase.encoders.c.b("ram");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361129f = com.google.firebase.encoders.c.b("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361130g = com.google.firebase.encoders.c.b("simulator");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361131h = com.google.firebase.encoders.c.b(VoiceInfo.STATE);

        /* renamed from: i, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361132i = com.google.firebase.encoders.c.b("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361133j = com.google.firebase.encoders.c.b("modelClass");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.c cVar = (CrashlyticsReport.f.c) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361125b, cVar.b());
            eVar.add(f361126c, cVar.f());
            eVar.add(f361127d, cVar.c());
            eVar.add(f361128e, cVar.h());
            eVar.add(f361129f, cVar.d());
            eVar.add(f361130g, cVar.j());
            eVar.add(f361131h, cVar.i());
            eVar.add(f361132i, cVar.e());
            eVar.add(f361133j, cVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$j */
    public static final class j implements com.google.firebase.encoders.d<CrashlyticsReport.f> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f361134a = new j();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361135b = com.google.firebase.encoders.c.b("generator");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361136c = com.google.firebase.encoders.c.b("identifier");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361137d = com.google.firebase.encoders.c.b("startedAt");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361138e = com.google.firebase.encoders.c.b("endedAt");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361139f = com.google.firebase.encoders.c.b("crashed");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361140g = com.google.firebase.encoders.c.b("app");

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361141h = com.google.firebase.encoders.c.b(ChannelContext.UserToUser.TYPE);

        /* renamed from: i, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361142i = com.google.firebase.encoders.c.b("os");

        /* renamed from: j, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361143j = com.google.firebase.encoders.c.b("device");

        /* renamed from: k, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361144k = com.google.firebase.encoders.c.b("events");

        /* renamed from: l, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361145l = com.google.firebase.encoders.c.b("generatorType");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f fVar = (CrashlyticsReport.f) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361135b, fVar.f());
            eVar.add(f361136c, fVar.h().getBytes(CrashlyticsReport.f361078a));
            eVar.add(f361137d, fVar.j());
            eVar.add(f361138e, fVar.d());
            eVar.add(f361139f, fVar.l());
            eVar.add(f361140g, fVar.b());
            eVar.add(f361141h, fVar.k());
            eVar.add(f361142i, fVar.i());
            eVar.add(f361143j, fVar.c());
            eVar.add(f361144k, fVar.e());
            eVar.add(f361145l, fVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$k */
    public static final class k implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f361146a = new k();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361147b = com.google.firebase.encoders.c.b("execution");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361148c = com.google.firebase.encoders.c.b("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361149d = com.google.firebase.encoders.c.b("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361150e = com.google.firebase.encoders.c.b(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND);

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361151f = com.google.firebase.encoders.c.b("uiOrientation");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.a aVar = (CrashlyticsReport.f.d.a) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361147b, aVar.d());
            eVar.add(f361148c, aVar.c());
            eVar.add(f361149d, aVar.e());
            eVar.add(f361150e, aVar.b());
            eVar.add(f361151f, aVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$l */
    public static final class l implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.AbstractC10705a> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f361152a = new l();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361153b = com.google.firebase.encoders.c.b("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361154c = com.google.firebase.encoders.c.b("size");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361155d = com.google.firebase.encoders.c.b("name");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361156e = com.google.firebase.encoders.c.b("uuid");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.a.b.AbstractC10705a abstractC10705a = (CrashlyticsReport.f.d.a.b.AbstractC10705a) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361153b, abstractC10705a.b());
            eVar.add(f361154c, abstractC10705a.d());
            eVar.add(f361155d, abstractC10705a.c());
            String strE = abstractC10705a.e();
            eVar.add(f361156e, strE != null ? strE.getBytes(CrashlyticsReport.f361078a) : null);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$m */
    public static final class m implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f361157a = new m();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361158b = com.google.firebase.encoders.c.b("threads");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361159c = com.google.firebase.encoders.c.b("exception");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361160d = com.google.firebase.encoders.c.b("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361161e = com.google.firebase.encoders.c.b("signal");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361162f = com.google.firebase.encoders.c.b("binaries");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.a.b bVar = (CrashlyticsReport.f.d.a.b) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361158b, bVar.f());
            eVar.add(f361159c, bVar.d());
            eVar.add(f361160d, bVar.b());
            eVar.add(f361161e, bVar.e());
            eVar.add(f361162f, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$n */
    public static final class n implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f361163a = new n();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361164b = com.google.firebase.encoders.c.b("type");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361165c = com.google.firebase.encoders.c.b("reason");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361166d = com.google.firebase.encoders.c.b("frames");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361167e = com.google.firebase.encoders.c.b("causedBy");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361168f = com.google.firebase.encoders.c.b("overflowCount");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.a.b.c cVar = (CrashlyticsReport.f.d.a.b.c) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361164b, cVar.f());
            eVar.add(f361165c, cVar.e());
            eVar.add(f361166d, cVar.c());
            eVar.add(f361167e, cVar.b());
            eVar.add(f361168f, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$o */
    public static final class o implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.AbstractC10709d> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f361169a = new o();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361170b = com.google.firebase.encoders.c.b("name");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361171c = com.google.firebase.encoders.c.b("code");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361172d = com.google.firebase.encoders.c.b(AddressParameter.TYPE);

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.a.b.AbstractC10709d abstractC10709d = (CrashlyticsReport.f.d.a.b.AbstractC10709d) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361170b, abstractC10709d.d());
            eVar.add(f361171c, abstractC10709d.c());
            eVar.add(f361172d, abstractC10709d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$p */
    public static final class p implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f361173a = new p();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361174b = com.google.firebase.encoders.c.b("name");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361175c = com.google.firebase.encoders.c.b("importance");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361176d = com.google.firebase.encoders.c.b("frames");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.a.b.e eVar = (CrashlyticsReport.f.d.a.b.e) obj;
            com.google.firebase.encoders.e eVar2 = (com.google.firebase.encoders.e) obj2;
            eVar2.add(f361174b, eVar.d());
            eVar2.add(f361175c, eVar.c());
            eVar2.add(f361176d, eVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$q */
    public static final class q implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.a.b.e.AbstractC10712b> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f361177a = new q();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361178b = com.google.firebase.encoders.c.b("pc");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361179c = com.google.firebase.encoders.c.b("symbol");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361180d = com.google.firebase.encoders.c.b("file");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361181e = com.google.firebase.encoders.c.b("offset");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361182f = com.google.firebase.encoders.c.b("importance");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.a.b.e.AbstractC10712b abstractC10712b = (CrashlyticsReport.f.d.a.b.e.AbstractC10712b) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361178b, abstractC10712b.e());
            eVar.add(f361179c, abstractC10712b.f());
            eVar.add(f361180d, abstractC10712b.b());
            eVar.add(f361181e, abstractC10712b.d());
            eVar.add(f361182f, abstractC10712b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$r */
    public static final class r implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f361183a = new r();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361184b = com.google.firebase.encoders.c.b("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361185c = com.google.firebase.encoders.c.b("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361186d = com.google.firebase.encoders.c.b("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361187e = com.google.firebase.encoders.c.b("orientation");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361188f = com.google.firebase.encoders.c.b("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361189g = com.google.firebase.encoders.c.b("diskUsed");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d.c cVar = (CrashlyticsReport.f.d.c) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361184b, cVar.b());
            eVar.add(f361185c, cVar.c());
            eVar.add(f361186d, cVar.g());
            eVar.add(f361187e, cVar.e());
            eVar.add(f361188f, cVar.f());
            eVar.add(f361189g, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$s */
    public static final class s implements com.google.firebase.encoders.d<CrashlyticsReport.f.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final s f361190a = new s();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361191b = com.google.firebase.encoders.c.b("timestamp");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361192c = com.google.firebase.encoders.c.b("type");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361193d = com.google.firebase.encoders.c.b("app");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361194e = com.google.firebase.encoders.c.b("device");

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361195f = com.google.firebase.encoders.c.b("log");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.d dVar = (CrashlyticsReport.f.d) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361191b, dVar.e());
            eVar.add(f361192c, dVar.f());
            eVar.add(f361193d, dVar.b());
            eVar.add(f361194e, dVar.c());
            eVar.add(f361195f, dVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$t */
    public static final class t implements com.google.firebase.encoders.d<CrashlyticsReport.f.d.AbstractC10714d> {

        /* renamed from: a, reason: collision with root package name */
        public static final t f361196a = new t();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361197b = com.google.firebase.encoders.c.b("content");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f361197b, ((CrashlyticsReport.f.d.AbstractC10714d) obj).b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$u */
    public static final class u implements com.google.firebase.encoders.d<CrashlyticsReport.f.e> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f361198a = new u();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361199b = com.google.firebase.encoders.c.b("platform");

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361200c = com.google.firebase.encoders.c.b("version");

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361201d = com.google.firebase.encoders.c.b("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361202e = com.google.firebase.encoders.c.b("jailbroken");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            CrashlyticsReport.f.e eVar = (CrashlyticsReport.f.e) obj;
            com.google.firebase.encoders.e eVar2 = (com.google.firebase.encoders.e) obj2;
            eVar2.add(f361199b, eVar.c());
            eVar2.add(f361200c, eVar.d());
            eVar2.add(f361201d, eVar.b());
            eVar2.add(f361202e, eVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.model.a$v */
    public static final class v implements com.google.firebase.encoders.d<CrashlyticsReport.f.AbstractC10715f> {

        /* renamed from: a, reason: collision with root package name */
        public static final v f361203a = new v();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361204b = com.google.firebase.encoders.c.b("identifier");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f361204b, ((CrashlyticsReport.f.AbstractC10715f) obj).b());
        }
    }

    @Override // sZ0.InterfaceC48137a
    public final void configure(InterfaceC48138b<?> interfaceC48138b) {
        d dVar = d.f361098a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.class, dVar);
        interfaceC48138b.registerEncoder(C37605b.class, dVar);
        j jVar = j.f361134a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.class, jVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.h.class, jVar);
        g gVar = g.f361114a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.a.class, gVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.i.class, gVar);
        h hVar = h.f361122a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.a.b.class, hVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.j.class, hVar);
        v vVar = v.f361203a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.AbstractC10715f.class, vVar);
        interfaceC48138b.registerEncoder(w.class, vVar);
        u uVar = u.f361198a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.e.class, uVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.v.class, uVar);
        i iVar = i.f361124a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.c.class, iVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.k.class, iVar);
        s sVar = s.f361190a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.class, sVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.l.class, sVar);
        k kVar = k.f361146a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.a.class, kVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.m.class, kVar);
        m mVar = m.f361157a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.a.b.class, mVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.n.class, mVar);
        p pVar = p.f361173a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.a.b.e.class, pVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.r.class, pVar);
        q qVar = q.f361177a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.a.b.e.AbstractC10712b.class, qVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.s.class, qVar);
        n nVar = n.f361163a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.a.b.c.class, nVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.p.class, nVar);
        b bVar = b.f361085a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.a.class, bVar);
        interfaceC48138b.registerEncoder(C37606c.class, bVar);
        C10716a c10716a = C10716a.f361081a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.a.AbstractC10700a.class, c10716a);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.d.class, c10716a);
        o oVar = o.f361169a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.a.b.AbstractC10709d.class, oVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.q.class, oVar);
        l lVar = l.f361152a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.a.b.AbstractC10705a.class, lVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.o.class, lVar);
        c cVar = c.f361095a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.d.class, cVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.e.class, cVar);
        r rVar = r.f361183a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.c.class, rVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.t.class, rVar);
        t tVar = t.f361196a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.f.d.AbstractC10714d.class, tVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.u.class, tVar);
        e eVar = e.f361108a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.e.class, eVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.f.class, eVar);
        f fVar = f.f361111a;
        interfaceC48138b.registerEncoder(CrashlyticsReport.e.b.class, fVar);
        interfaceC48138b.registerEncoder(com.google.firebase.crashlytics.internal.model.g.class, fVar);
    }
}

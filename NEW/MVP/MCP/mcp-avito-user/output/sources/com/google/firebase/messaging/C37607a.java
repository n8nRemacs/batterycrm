package com.google.firebase.messaging;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.google.firebase.encoders.c;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import sZ0.InterfaceC48137a;
import sZ0.InterfaceC48138b;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37607a implements InterfaceC48137a {

    /* renamed from: a, reason: collision with root package name */
    public static final C37607a f361827a = new C37607a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static final class C10727a implements com.google.firebase.encoders.d<MessagingClientEvent> {

        /* renamed from: a, reason: collision with root package name */
        public static final C10727a f361828a = new C10727a();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361829b;

        /* renamed from: c, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361830c;

        /* renamed from: d, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361831d;

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361832e;

        /* renamed from: f, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361833f;

        /* renamed from: g, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361834g;

        /* renamed from: h, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361835h;

        /* renamed from: i, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361836i;

        /* renamed from: j, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361837j;

        /* renamed from: k, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361838k;

        /* renamed from: l, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361839l;

        /* renamed from: m, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361840m;

        /* renamed from: n, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361841n;

        /* renamed from: o, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361842o;

        /* renamed from: p, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361843p;

        static {
            c.b bVar = new c.b("projectNumber");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f361829b = C31685o.l(aVar, bVar);
            c.b bVar2 = new c.b(PlatformActions.MESSAGE_ID);
            com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a();
            aVar2.f361567a = 2;
            f361830c = C31685o.l(aVar2, bVar2);
            c.b bVar3 = new c.b("instanceId");
            com.google.firebase.encoders.proto.a aVar3 = new com.google.firebase.encoders.proto.a();
            aVar3.f361567a = 3;
            f361831d = C31685o.l(aVar3, bVar3);
            c.b bVar4 = new c.b("messageType");
            com.google.firebase.encoders.proto.a aVar4 = new com.google.firebase.encoders.proto.a();
            aVar4.f361567a = 4;
            f361832e = C31685o.l(aVar4, bVar4);
            c.b bVar5 = new c.b("sdkPlatform");
            com.google.firebase.encoders.proto.a aVar5 = new com.google.firebase.encoders.proto.a();
            aVar5.f361567a = 5;
            f361833f = C31685o.l(aVar5, bVar5);
            c.b bVar6 = new c.b("packageName");
            com.google.firebase.encoders.proto.a aVar6 = new com.google.firebase.encoders.proto.a();
            aVar6.f361567a = 6;
            f361834g = C31685o.l(aVar6, bVar6);
            c.b bVar7 = new c.b("collapseKey");
            com.google.firebase.encoders.proto.a aVar7 = new com.google.firebase.encoders.proto.a();
            aVar7.f361567a = 7;
            f361835h = C31685o.l(aVar7, bVar7);
            c.b bVar8 = new c.b("priority");
            com.google.firebase.encoders.proto.a aVar8 = new com.google.firebase.encoders.proto.a();
            aVar8.f361567a = 8;
            f361836i = C31685o.l(aVar8, bVar8);
            c.b bVar9 = new c.b("ttl");
            com.google.firebase.encoders.proto.a aVar9 = new com.google.firebase.encoders.proto.a();
            aVar9.f361567a = 9;
            f361837j = C31685o.l(aVar9, bVar9);
            c.b bVar10 = new c.b("topic");
            com.google.firebase.encoders.proto.a aVar10 = new com.google.firebase.encoders.proto.a();
            aVar10.f361567a = 10;
            f361838k = C31685o.l(aVar10, bVar10);
            c.b bVar11 = new c.b("bulkId");
            com.google.firebase.encoders.proto.a aVar11 = new com.google.firebase.encoders.proto.a();
            aVar11.f361567a = 11;
            f361839l = C31685o.l(aVar11, bVar11);
            c.b bVar12 = new c.b("event");
            com.google.firebase.encoders.proto.a aVar12 = new com.google.firebase.encoders.proto.a();
            aVar12.f361567a = 12;
            f361840m = C31685o.l(aVar12, bVar12);
            c.b bVar13 = new c.b("analyticsLabel");
            com.google.firebase.encoders.proto.a aVar13 = new com.google.firebase.encoders.proto.a();
            aVar13.f361567a = 13;
            f361841n = C31685o.l(aVar13, bVar13);
            c.b bVar14 = new c.b("campaignId");
            com.google.firebase.encoders.proto.a aVar14 = new com.google.firebase.encoders.proto.a();
            aVar14.f361567a = 14;
            f361842o = C31685o.l(aVar14, bVar14);
            c.b bVar15 = new c.b("composerLabel");
            com.google.firebase.encoders.proto.a aVar15 = new com.google.firebase.encoders.proto.a();
            aVar15.f361567a = 15;
            f361843p = C31685o.l(aVar15, bVar15);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
            com.google.firebase.encoders.e eVar = (com.google.firebase.encoders.e) obj2;
            eVar.add(f361829b, messagingClientEvent.f361892a);
            eVar.add(f361830c, messagingClientEvent.f361893b);
            eVar.add(f361831d, messagingClientEvent.f361894c);
            eVar.add(f361832e, messagingClientEvent.f361895d);
            eVar.add(f361833f, messagingClientEvent.f361896e);
            eVar.add(f361834g, messagingClientEvent.f361897f);
            eVar.add(f361835h, messagingClientEvent.f361898g);
            eVar.add(f361836i, 0);
            eVar.add(f361837j, messagingClientEvent.f361899h);
            eVar.add(f361838k, messagingClientEvent.f361900i);
            eVar.add(f361839l, 0L);
            eVar.add(f361840m, messagingClientEvent.f361901j);
            eVar.add(f361841n, messagingClientEvent.f361902k);
            eVar.add(f361842o, 0L);
            eVar.add(f361843p, messagingClientEvent.f361903l);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$b */
    public static final class b implements com.google.firebase.encoders.d<EZ0.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f361844a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361845b;

        static {
            c.b bVar = new c.b("messagingClientEvent");
            com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a();
            aVar.f361567a = 1;
            f361845b = C31685o.l(aVar, bVar);
        }

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f361845b, ((EZ0.a) obj).f4078a);
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: com.google.firebase.messaging.a$c */
    public static final class c implements com.google.firebase.encoders.d<w> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f361846a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final com.google.firebase.encoders.c f361847b = com.google.firebase.encoders.c.b("messagingClientEventExtension");

        @Override // com.google.firebase.encoders.d
        public final void encode(Object obj, Object obj2) {
            ((com.google.firebase.encoders.e) obj2).add(f361847b, ((w) obj).a());
        }
    }

    @Override // sZ0.InterfaceC48137a
    public final void configure(InterfaceC48138b<?> interfaceC48138b) {
        interfaceC48138b.registerEncoder(w.class, c.f361846a);
        interfaceC48138b.registerEncoder(EZ0.a.class, b.f361844a);
        interfaceC48138b.registerEncoder(MessagingClientEvent.class, C10727a.f361828a);
    }
}

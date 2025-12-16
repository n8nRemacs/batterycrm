package com.avito.android.deeplink_factory;

import Iu.C14159a;
import Ku.AbstractC14350a;
import Ru.d;
import Su.C15224a;
import Y41.l;
import Y61.k;
import android.net.Uri;
import com.avito.android.deep_linking.L;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.PublicDeeplink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.links.p;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_events.events.DeeplinkParsingFailReason;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lE.C43624b;
import lv.C43834a;
import mv.C44139a;

/* compiled from: DeeplinkFactoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_factory/b;", "Lcom/avito/android/deep_linking/x;", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements x {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44139a f134153a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<? extends x> f134154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<Gson> f134155c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_events.registry.d f134156d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final L f134157e;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C15224a f134159g;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f134158f = C42727D.c(new a());

    /* renamed from: h, reason: collision with root package name */
    @k
    public final NoMatchLink f134160h = new NoMatchLink();

    /* compiled from: DeeplinkFactoryImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "LKu/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Map<String, AbstractC14350a<? extends DeepLink>>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, AbstractC14350a<? extends DeepLink>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<C43834a> setA = b.this.f134153a.a();
            int iF2 = P0.f(C42745f0.q(setA, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
            for (Object obj : setA) {
                linkedHashMap2.put(((C43834a) obj).f414236a, obj);
            }
            for (Map.Entry<Class<? extends p>, C14159a> entry : com.avito.android.deep_linking.links.storage.a.f134018a.getClassesToMetaInfo().entrySet()) {
                Class<? extends p> key = entry.getKey();
                C14159a value = entry.getValue();
                C43834a c43834a = (C43834a) linkedHashMap2.get(key);
                AbstractC14350a<? extends DeepLink> abstractC14350a = c43834a != null ? c43834a.f414237b : null;
                if (abstractC14350a != null) {
                    linkedHashMap.put(value.f8594a + value.f8595b, abstractC14350a);
                }
            }
            return linkedHashMap;
        }
    }

    /* compiled from: DeeplinkFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_factory.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C4036b extends H implements l<Uri, Z<? extends DeepLink>> {
        @Override // Y41.l
        public final Z<? extends DeepLink> invoke(Uri uri) {
            Object bVar;
            Object objF;
            Uri uri2 = uri;
            b bVar2 = (b) this.receiver;
            bVar2.getClass();
            AbstractC14350a abstractC14350a = (AbstractC14350a) ((Map) bVar2.f134158f.getValue()).get(uri2.getHost() + uri2.getPath());
            if (abstractC14350a == null) {
                objF = bVar2.f134154b.get().f(uri2);
            } else {
                try {
                    int i12 = Z.f406624c;
                    bVar = abstractC14350a.r(uri2, bVar2.f134155c.get(), bVar2);
                } catch (Throwable th2) {
                    int i13 = Z.f406624c;
                    bVar = new Z.b(th2);
                }
                Object objA = com.avito.android.deeplink_factory.a.a(bVar, uri2);
                com.avito.android.deeplink_factory.a.b(objA, bVar2.f134156d, uri2);
                objF = objA;
            }
            return Z.a(objF);
        }
    }

    /* compiled from: DeeplinkFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<Uri, DeepLink> {
        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.avito.android.deep_linking.links.DeepLink invoke(android.net.Uri r22) {
            /*
                r21 = this;
                r0 = r22
                android.net.Uri r0 = (android.net.Uri) r0
                r1 = r21
                java.lang.Object r2 = r1.receiver
                com.avito.android.deeplink_factory.b r2 = (com.avito.android.deeplink_factory.b) r2
                Su.a r3 = r2.f134159g
                android.content.UriMatcher r4 = r3.f15180b
                int r4 = r4.match(r0)
                java.lang.String r6 = r0.getLastPathSegment()
                r15 = 1
                r14 = 0
                if (r6 != 0) goto L1e
            L1a:
                r20 = r14
                goto L8a
            L1e:
                if (r4 == 0) goto L6a
                if (r4 == r15) goto L5f
                r5 = 2
                if (r4 == r5) goto L4f
                r5 = 3
                if (r4 == r5) goto L29
                goto L1a
            L29:
                lE.b r3 = r3.f15179a
                r3.getClass()
                kotlin.reflect.n<java.lang.Object>[] r4 = lE.C43624b.f413639o
                r4 = r4[r5]
                com.avito.android.A0$a r3 = r3.f413643e
                DE0.a r3 = r3.a()
                java.lang.Object r3 = r3.invoke()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L4a
                com.avito.android.deep_linking.links.NoMatchLink r3 = new com.avito.android.deep_linking.links.NoMatchLink
                r3.<init>()
                goto L4b
            L4a:
                r3 = r14
            L4b:
                r20 = r14
            L4d:
                r14 = r3
                goto L8a
            L4f:
                r3 = 0
                java.lang.String r4 = "search"
                boolean r3 = kotlin.text.C43066x.h0(r6, r4, r3)
                if (r3 == 0) goto L59
                goto L4a
            L59:
                com.avito.android.deep_linking.links.ChannelDetailsLink r3 = new com.avito.android.deep_linking.links.ChannelDetailsLink
                r3.<init>(r6, r14, r5, r14)
                goto L4b
            L5f:
                com.avito.android.deep_linking.links.MyAdvertDetailsLink r3 = new com.avito.android.deep_linking.links.MyAdvertDetailsLink
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                goto L4b
            L6a:
                com.avito.android.deep_linking.links.AdvertDetailsLink r3 = new com.avito.android.deep_linking.links.AdvertDetailsLink
                r4 = 0
                r16 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r17 = 0
                r18 = 2044(0x7fc, float:2.864E-42)
                r19 = 0
                r5 = r3
                r20 = r14
                r14 = r17
                r15 = r4
                r17 = r18
                r18 = r19
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                goto L4d
            L8a:
                if (r14 == 0) goto L98
                Ru.d$d r3 = new Ru.d$d
                r4 = 1
                r3.<init>(r0, r14, r4)
                com.avito.android.deeplink_events.registry.d r0 = r2.f134156d
                r0.b(r3)
                goto L9a
            L98:
                r14 = r20
            L9a:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.deeplink_factory.b.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public b(@k C44139a c44139a, @k h31.e<? extends x> eVar, @k h31.e<Gson> eVar2, @k com.avito.android.deeplink_events.registry.d dVar, @k L l12, @k C43624b c43624b) {
        this.f134153a = c44139a;
        this.f134154b = eVar;
        this.f134155c = eVar2;
        this.f134156d = dVar;
        this.f134157e = l12;
        this.f134159g = new C15224a(c43624b);
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.l
    public final PublicDeeplink a(@k Uri uri) throws Throwable {
        DeepLink deepLinkE = e(uri);
        if (deepLinkE instanceof PublicDeeplink) {
            return (PublicDeeplink) deepLinkE;
        }
        this.f134156d.b(new d.a(uri, DeeplinkParsingFailReason.f134147d, new DeeplinkParsingError.ExpectedPublicDeeplink(uri.toString())));
        return null;
    }

    @Override // com.avito.android.deep_linking.x
    @k
    public final DeepLink b(@k String str) {
        return e(Uri.parse(str));
    }

    @Override // com.avito.android.deep_linking.x
    @k
    public final Object c(@k String str) {
        return f(Uri.parse(str));
    }

    @Override // com.avito.android.deep_linking.x
    @Y61.l
    public final PublicDeeplink d(@k String str) {
        return a(Uri.parse(str));
    }

    @Override // com.avito.android.deep_linking.x
    @k
    public final DeepLink e(@k Uri uri) throws Throwable {
        Object objF = f(uri);
        Throwable thB = Z.b(objF);
        if (thB != null) {
            if (!(thB instanceof JsonParseException ? true : thB instanceof DeeplinkParsingError)) {
                throw thB;
            }
            objF = this.f134160h;
        }
        return (DeepLink) objF;
    }

    @Override // com.avito.android.deep_linking.x
    @k
    public final Object f(@k Uri uri) {
        return this.f134157e.a(uri, new C4036b(1, this, b.class, "createFromStaticUri", "createFromStaticUri-IoAF18A(Landroid/net/Uri;)Ljava/lang/Object;", 0), new c(1, this, b.class, "createFromDynamicUri", "createFromDynamicUri(Landroid/net/Uri;)Lcom/avito/android/deep_linking/links/DeepLink;", 0));
    }
}

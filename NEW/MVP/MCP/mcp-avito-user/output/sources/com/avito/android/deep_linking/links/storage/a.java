package com.avito.android.deep_linking.links.storage;

import Iu.C14159a;
import Y61.k;
import com.avito.android.deep_linking.links.ComposedGeneratedDeeplinkMetaStorage;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage;
import com.avito.android.deep_linking.links.p;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinksMetaStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/storage/a;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "a", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements GeneratedDeepLinkMetaStorage {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f134018a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static volatile AbstractC4029a f134019b = AbstractC4029a.C4030a.f134021a;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f134020c = C42727D.c(b.f134023l);

    /* compiled from: DeeplinksMetaStorage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/storage/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/storage/a$a$a;", "Lcom/avito/android/deep_linking/links/storage/a$a$b;", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deep_linking.links.storage.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC4029a {

        /* compiled from: DeeplinksMetaStorage.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/storage/a$a$a;", "Lcom/avito/android/deep_linking/links/storage/a$a;", "<init>", "()V", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.storage.a$a$a, reason: collision with other inner class name */
        public static final class C4030a extends AbstractC4029a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C4030a f134021a = new C4030a();

            public C4030a() {
                super(null);
            }

            @Override // com.avito.android.deep_linking.links.storage.a.AbstractC4029a
            @k
            public final Map<Class<? extends p>, C14159a> a() {
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(GeneratedDeepLinkMetaStorage.class);
                ArrayList arrayList = new ArrayList(C42745f0.q(serviceLoaderLoad, 10));
                Iterator it = serviceLoaderLoad.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GeneratedDeepLinkMetaStorage) it.next()).getClassesToMetaInfo());
                }
                return C35755b0.d(arrayList);
            }
        }

        /* compiled from: DeeplinksMetaStorage.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/storage/a$a$b;", "Lcom/avito/android/deep_linking/links/storage/a$a;", "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.storage.a$a$b */
        public static final class b extends AbstractC4029a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ComposedGeneratedDeeplinkMetaStorage f134022a;

            public b(@k ComposedGeneratedDeeplinkMetaStorage composedGeneratedDeeplinkMetaStorage) {
                super(null);
                this.f134022a = composedGeneratedDeeplinkMetaStorage;
            }

            @Override // com.avito.android.deep_linking.links.storage.a.AbstractC4029a
            @k
            public final Map<Class<? extends p>, C14159a> a() {
                return this.f134022a.getClassesToMetaInfo();
            }
        }

        public /* synthetic */ AbstractC4029a(C42822w c42822w) {
            this();
        }

        @k
        public abstract Map<Class<? extends p>, C14159a> a();

        public AbstractC4029a() {
        }
    }

    /* compiled from: DeeplinksMetaStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Map<Class<? extends p>, ? extends C14159a>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f134023l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Class<? extends p>, ? extends C14159a> invoke() {
            a.f134018a.getClass();
            return a.f134019b.a();
        }
    }

    @k
    public final String a(@k Class<? extends DeepLink> cls) {
        C14159a c14159a = getClassesToMetaInfo().get(cls);
        if (c14159a != null) {
            return c14159a.f8594a + c14159a.f8595b;
        }
        throw new IllegalStateException(("Can't find full path for " + cls.getCanonicalName() + ". You must annotate it with @DeepLinkMeta and add `convention.deeplinks-generator` to a gradle module, which contains this link.").toString());
    }

    @k
    public final String b(@k Class<? extends DeepLink> cls) {
        C14159a c14159a = getClassesToMetaInfo().get(cls);
        if (c14159a != null) {
            return c14159a.f8595b;
        }
        throw new IllegalStateException(("Can't find path for " + cls.getCanonicalName() + ". You must annotate it with @DeepLinkMeta and add `convention.deeplinks-generator` to a gradle module, which contains this link.").toString());
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @k
    public final Map<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return (Map) f134020c.getValue();
    }
}

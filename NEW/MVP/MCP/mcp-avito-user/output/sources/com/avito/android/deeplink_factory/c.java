package com.avito.android.deeplink_factory;

import Iu.C14159a;
import Ru.d;
import Y41.l;
import Y61.k;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.L;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deeplink_events.events.DeeplinkParsingFailReason;
import com.avito.android.region.Region;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ur.InterfaceC49101b;

/* compiled from: DeeplinkFactoryProxyImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_factory/c;", "Lcom/avito/android/deep_linking/L;", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes12.dex */
public final class c implements L {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_events.registry.d f134162a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49101b f134163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f134164c = C42727D.c(a.f134165l);

    /* compiled from: DeeplinkFactoryProxyImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "LIu/a;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Map<String, ? extends C14159a>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f134165l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends C14159a> invoke() {
            Collection<C14159a> collectionValues = com.avito.android.deep_linking.links.storage.a.f134018a.getClassesToMetaInfo().values();
            int iF2 = P0.f(C42745f0.q(collectionValues, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj : collectionValues) {
                C14159a c14159a = (C14159a) obj;
                linkedHashMap.put(c14159a.f8594a + c14159a.f8595b, obj);
            }
            return linkedHashMap;
        }
    }

    @Inject
    public c(@k com.avito.android.deeplink_events.registry.d dVar, @k InterfaceC49101b interfaceC49101b) {
        this.f134162a = dVar;
        this.f134163b = interfaceC49101b;
    }

    @Override // com.avito.android.deep_linking.L
    @k
    public final Object a(@k Uri uri, @k l<? super Uri, ? extends Z<? extends DeepLink>> lVar, @k l<? super Uri, ? extends DeepLink> lVar2) {
        String str;
        d.c cVar = new d.c(uri);
        com.avito.android.deeplink_events.registry.d dVar = this.f134162a;
        dVar.b(cVar);
        InterfaceC49101b interfaceC49101b = this.f134163b;
        Set<Region> set = interfaceC49101b.getF440309a().f125478b;
        Set<String> setB = interfaceC49101b.b();
        DeepLink deepLinkInvoke = lVar2.invoke(uri);
        if (deepLinkInvoke != null) {
            str = deepLinkInvoke.getVersion() + deepLinkInvoke.getPath();
        } else {
            str = uri.getHost() + uri.getPath();
        }
        C14159a c14159a = (C14159a) ((Map) this.f134164c.getValue()).get(str);
        Set<String> set2 = setB;
        if (!C42745f0.r(set2, uri.getScheme())) {
            DeeplinkParsingError.WrongScheme wrongScheme = new DeeplinkParsingError.WrongScheme(uri.toString(), C22026a.c(new StringBuilder("Scheme is not supported. Supported schemes: \""), C42745f0.O(set2, null, null, null, null, 63), '\"'), null);
            dVar.b(new d.a(uri, DeeplinkParsingFailReason.f134146c, wrongScheme));
            int i12 = Z.f406624c;
            return new Z.b(wrongScheme);
        }
        if (c14159a == null) {
            dVar.b(new d.a(uri, DeeplinkParsingFailReason.f134145b, null));
            int i13 = Z.f406624c;
            return new Z.b(new DeeplinkParsingError.DeeplinkNotFound(uri.toString(), "Deeplink not found. Check if it is annotated with a @DeepLinkMeta annotation", null));
        }
        if (C42745f0.M(c14159a.f8597d, set).isEmpty()) {
            dVar.b(new d.a(uri, DeeplinkParsingFailReason.f134148e, null));
            int i14 = Z.f406624c;
            return new Z.b(new DeeplinkParsingError.WrongRegion(uri.toString(), "Deeplink's region is not supported in this build type", null));
        }
        if (deepLinkInvoke == null) {
            return lVar.invoke(uri).f406625b;
        }
        int i15 = Z.f406624c;
        return deepLinkInvoke;
    }
}

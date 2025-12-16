package com.avito.android.deeplink_analytics.logger;

import Nu.InterfaceC14612b;
import Ru.InterfaceC15081a;
import Ru.b;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.V2;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkEventsLogger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deeplink_analytics/logger/a;", "LNu/b;", "<init>", "()V", "a", "_avito_deeplinks_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC14612b {

    /* compiled from: DeeplinkEventsLogger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_analytics/logger/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_deeplinks_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_analytics.logger.a$a, reason: collision with other inner class name */
    public static final class C4035a {
        public /* synthetic */ C4035a(C42822w c42822w) {
            this();
        }

        public C4035a() {
        }
    }

    static {
        new C4035a(null);
    }

    @Inject
    public a() {
    }

    public static Map b(Bundle bundle, String str) {
        Set<String> setKeySet;
        return P0.g(new Q("requestKey", String.valueOf(str)), new Q("args", (bundle == null || (setKeySet = bundle.keySet()) == null) ? "null" : C42745f0.O(setKeySet, null, "[", "]", null, 57)));
    }

    public static Map c(b.c cVar) {
        String str;
        if (cVar instanceof b.d) {
            str = "handler";
        } else if (cVar instanceof b.C0990b) {
            str = "legacy";
        } else {
            if (!(cVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "hardcoded";
        }
        return P0.g(new Q("type", str), new Q("status", cVar.getF14715e().f134144b));
    }

    @Override // Nu.InterfaceC14612b
    public final void a(@k InterfaceC15081a interfaceC15081a) {
        Map mapC;
        String str;
        if (interfaceC15081a instanceof Ru.b) {
            Ru.b bVar = (Ru.b) interfaceC15081a;
            DeepLink f14716a = bVar.getF14716a();
            Map mapSingletonMap = Collections.singletonMap("path", f14716a.getVersion() + f14716a.getPath());
            boolean z12 = bVar instanceof b.e;
            if (z12) {
                b.e eVar = (b.e) interfaceC15081a;
                mapC = b(eVar.f14718c, eVar.f14717b);
            } else if (bVar instanceof b.d) {
                b.d dVar = (b.d) interfaceC15081a;
                mapC = P0.k(b(dVar.f14714d, dVar.f14713c), c((b.c) interfaceC15081a));
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                mapC = c((b.c) interfaceC15081a);
            }
            if (z12) {
                str = "Handling_Start";
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "Handling_Result";
            }
            LinkedHashMap linkedHashMapK = P0.k(mapSingletonMap, mapC);
            V2.f318762a.g("DeeplinkEvents", str + ": " + linkedHashMapK);
        }
    }
}

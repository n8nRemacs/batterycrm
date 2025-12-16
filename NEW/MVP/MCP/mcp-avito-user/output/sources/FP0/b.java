package FP0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.Y2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WebViewAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFP0/b;", "LFP0/a;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f4700a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y2 f4701b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f4702c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f4703d = new LinkedHashMap();

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @k Y2 y22) {
        this.f4700a = interfaceC28373a;
        this.f4701b = y22;
    }

    @Override // FP0.a
    public final void a(@k Uri uri) {
        String queryParameter = uri.getQueryParameter("landing_slug");
        String queryParameter2 = uri.getQueryParameter("iid");
        String queryParameter3 = uri.getQueryParameter("from_page");
        String string = uri.toString();
        LinkedHashMap linkedHashMap = this.f4703d;
        Object obj = linkedHashMap.get(string);
        Boolean bool = Boolean.TRUE;
        if (L.f(obj, bool)) {
            return;
        }
        this.f4700a.c(new g(uri.toString(), queryParameter, queryParameter2, queryParameter3));
        linkedHashMap.put(uri.toString(), bool);
    }

    @Override // FP0.a
    public final void b(@k HP0.b bVar) {
        this.f4700a.c(bVar);
    }

    @Override // FP0.a
    @k
    public final Bundle c() {
        LinkedHashMap linkedHashMap = this.f4702c;
        Bundle bundle = new Bundle(linkedHashMap.size());
        bundle.putStringArrayList("alreadyTrackedScrollToEnd", C35755b0.a(linkedHashMap.keySet()));
        bundle.putStringArrayList("alreadyTrackedOpening", C35755b0.a(this.f4703d.keySet()));
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // FP0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.l com.avito.android.CalledFrom r4, @Y61.l com.avito.android.deep_linking.links.DeepLink r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof com.avito.android.CalledFrom.NotificationCenter
            if (r0 == 0) goto L11
            com.avito.android.CalledFrom$NotificationCenter r4 = (com.avito.android.CalledFrom.NotificationCenter) r4
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f67243b
            r0.<init>(r4)
            goto L2d
        L11:
            boolean r0 = r4 instanceof com.avito.android.CalledFrom.Push
            r1 = 0
            if (r0 == 0) goto L2c
            com.avito.android.CalledFrom$Push r4 = (com.avito.android.CalledFrom.Push) r4
            com.avito.android.remote.model.notification.Payload r4 = r4.f67245c
            boolean r0 = r4 instanceof com.avito.android.remote.model.notification.Payload.NotificationCenter
            if (r0 == 0) goto L2c
            com.avito.android.remote.model.notification.Payload$NotificationCenter r4 = (com.avito.android.remote.model.notification.Payload.NotificationCenter) r4
            java.util.Map r4 = r4.getAnalyticParams()
            if (r4 == 0) goto L2c
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r4)
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r5 == 0) goto L41
            if (r0 == 0) goto L41
            android.net.Uri r4 = r5.getUri()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "action"
            java.lang.Object r4 = r0.put(r5, r4)
            java.lang.String r4 = (java.lang.String) r4
        L41:
            if (r0 != 0) goto L44
            return
        L44:
            FP0.e r4 = new FP0.e
            r4.<init>(r0)
            com.avito.android.analytics.a r5 = r3.f4700a
            r5.c(r4)
            com.avito.android.Y2 r4 = r3.f4701b
            r4.getClass()
            kotlin.reflect.n<java.lang.Object>[] r1 = com.avito.android.Y2.f67590f
            r2 = 1
            r1 = r1[r2]
            com.avito.android.A0$a r4 = r4.f67592c
            DE0.a r4 = r4.a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L72
            FP0.f r4 = new FP0.f
            r4.<init>(r0)
            r5.c(r4)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: FP0.b.d(com.avito.android.CalledFrom, com.avito.android.deep_linking.links.DeepLink):void");
    }

    @Override // FP0.a
    public final void e(@k Uri uri) {
        String queryParameter = uri.getQueryParameter("landing_slug");
        if (queryParameter == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f4702c;
        Object obj = linkedHashMap.get(queryParameter);
        Boolean bool = Boolean.TRUE;
        if (L.f(obj, bool)) {
            return;
        }
        this.f4700a.c(new h(queryParameter));
        linkedHashMap.put(queryParameter, bool);
    }

    @Override // FP0.a
    public final void f(@l Bundle bundle) {
        if (bundle != null) {
            LinkedHashMap linkedHashMap = this.f4702c;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("alreadyTrackedScrollToEnd");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), Boolean.TRUE);
                }
            }
        }
        if (bundle != null) {
            LinkedHashMap linkedHashMap2 = this.f4703d;
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("alreadyTrackedOpening");
            if (stringArrayList2 != null) {
                Iterator<String> it2 = stringArrayList2.iterator();
                while (it2.hasNext()) {
                    linkedHashMap2.put(it2.next(), Boolean.TRUE);
                }
            }
        }
    }

    @Override // FP0.a
    public final void g(@k ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        this.f4700a.c(parametrizedClickStreamEvent);
    }
}

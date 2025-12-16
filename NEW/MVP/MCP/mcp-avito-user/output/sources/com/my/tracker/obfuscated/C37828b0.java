package com.my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.b0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37828b0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Boolean f365518g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<C37828b0> f365519h;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f365521b;

    /* renamed from: c, reason: collision with root package name */
    private final String f365522c;

    /* renamed from: e, reason: collision with root package name */
    private final b f365524e;

    /* renamed from: f, reason: collision with root package name */
    private final BillingClient f365525f;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f365520a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    final BillingClientStateListener f365523d = new a();

    /* renamed from: com.my.tracker.obfuscated.b0$a */
    public class a implements BillingClientStateListener {

        /* renamed from: a, reason: collision with root package name */
        final AtomicInteger f365526a = new AtomicInteger(0);

        public a() {
        }

        public void onBillingServiceDisconnected() {
            if (this.f365526a.incrementAndGet() >= 3 || !C37828b0.this.c()) {
                e2.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                C37828b0.this.f365524e.a(1, Collections.EMPTY_MAP);
                C37828b0.this.a();
            }
        }

        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                e2.a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
            } else {
                e2.a("GooglePlayProductHelper: connection with billing client has been established");
                this.f365526a.set(0);
                C37828b0.this.b();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b0$b */
    public interface b {
        void a(int i12, Map<String, JSONObject> map);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    static {
        /*
            java.lang.Class<com.android.billingclient.api.Purchase> r0 = com.android.billingclient.api.Purchase.class
            java.lang.String r1 = "com.android.billingclient.api.Purchase"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            java.lang.Class<com.android.billingclient.api.BillingClient> r0 = com.android.billingclient.api.BillingClient.class
            java.lang.String r1 = "com.android.billingclient.api.BillingClient"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.my.tracker.obfuscated.C37828b0.f365518g = r1
            if (r0 == 0) goto L2f
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L2c:
            com.my.tracker.obfuscated.C37828b0.f365519h = r0
            goto L32
        L2f:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            goto L2c
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.C37828b0.<clinit>():void");
    }

    private C37828b0(List<String> list, String str, b bVar, Context context) {
        this.f365521b = list;
        this.f365524e = bVar;
        this.f365525f = BillingClient.newBuilder(context).setListener(new PurchasesUpdatedListener() { // from class: com.my.tracker.obfuscated.C
        }).enablePendingPurchases().build();
        this.f365522c = str;
    }

    private /* synthetic */ void c(BillingResult billingResult, List list) {
        C37835i.a(new D(this, billingResult, list, 0));
        a();
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(BillingResult billingResult, List<SkuDetails> list) {
        if (!this.f365520a.compareAndSet(false, true)) {
            e2.a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            e2.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + (billingResult != null ? billingResult.getDebugMessage() : "{empty message}"));
            this.f365524e.a(1, Collections.EMPTY_MAP);
            return;
        }
        if (list == null || list.isEmpty()) {
            e2.a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.f365524e.a(0, Collections.EMPTY_MAP);
            return;
        }
        HashMap map = new HashMap();
        e2.a("GooglePlayProductHelper: populating map of skuDetails data");
        for (SkuDetails skuDetails : list) {
            try {
                map.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
            } catch (Throwable th2) {
                e2.b("GooglePlayProductHelper error: exception while parsing skuData", th2);
            }
        }
        this.f365524e.a(0, map);
    }

    public void b() {
        try {
            e2.a("GooglePlayProductHelper: querying for " + this.f365522c);
            this.f365525f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.f365521b).setType(this.f365522c).build(), new SkuDetailsResponseListener() { // from class: com.my.tracker.obfuscated.B
            });
        } catch (Throwable th2) {
            e2.b("GooglePlayProductHelper error: exception while querying details for " + this.f365522c, th2);
            a();
        }
    }

    public boolean c() {
        try {
            e2.a("GooglePlayProductHelper: start connection with billing client");
            this.f365525f.startConnection(this.f365523d);
            f365519h.add(this);
            return true;
        } catch (Throwable th2) {
            e2.b("GooglePlayProductHelper error: exception while start connection:", th2);
            return false;
        }
    }

    public static d0 a(Object obj) {
        if (!f365518g.booleanValue()) {
            e2.b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return d0.a(purchase.getOriginalJson(), purchase.getSignature(), c2.a());
            }
        } catch (Throwable th2) {
            e2.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th2);
        }
        return null;
    }

    public void a() {
        try {
            e2.a("GooglePlayProductHelper: end connection with billing client");
            f365519h.remove(this);
            this.f365525f.endConnection();
        } catch (Throwable th2) {
            e2.b("GooglePlayProductHelper error: exception while end connection:", th2);
        }
    }

    private static /* synthetic */ void a(BillingResult billingResult, List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list, String str, b bVar, Context context) {
        C37828b0 c37828b0;
        try {
            c37828b0 = new C37828b0(list, str, bVar, context);
        } catch (Throwable th2) {
            e2.b("GooglePlayProductHelper error: error while creating ProductHelper", th2);
        }
        if (c37828b0.c()) {
            return;
        }
        c37828b0.a();
        bVar.a(1, Collections.EMPTY_MAP);
    }

    public static void a(List<d0> list, boolean z12, b bVar, Context context) {
        if (list.isEmpty()) {
            e2.a("GooglePlayProductHelper: empty purchases list");
            bVar.a(0, Collections.EMPTY_MAP);
            return;
        }
        String str = z12 ? "subs" : "inapp";
        ArrayList arrayList = new ArrayList();
        Iterator<d0> it = list.iterator();
        while (it.hasNext()) {
            String strC = it.next().c();
            if (!arrayList.contains(strC)) {
                arrayList.add(strC);
            }
        }
        C37835i.f(new FX0.a(arrayList, str, bVar, context, 6));
    }
}

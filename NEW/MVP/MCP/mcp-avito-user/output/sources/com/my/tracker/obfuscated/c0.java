package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.my.tracker.obfuscated.C37828b0;
import com.my.tracker.obfuscated.C37848w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    final Context f365564a;

    /* renamed from: b, reason: collision with root package name */
    final C37848w f365565b;

    /* renamed from: c, reason: collision with root package name */
    final C37848w.c f365566c = new G(this);

    public final class a implements C37828b0.b {

        /* renamed from: a, reason: collision with root package name */
        private final List<d0> f365567a;

        public a(List<d0> list) {
            this.f365567a = list;
        }

        @Override // com.my.tracker.obfuscated.C37828b0.b
        public void a(int i12, Map<String, JSONObject> map) {
            if (i12 == 1) {
                e2.b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                C37835i.a(new H(2, this, map));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Map map) {
            for (d0 d0Var : this.f365567a) {
                d0Var.a((JSONObject) map.get(d0Var.c()));
            }
            c0.this.f365565b.d(this.f365567a);
        }
    }

    private c0(C37848w c37848w, Context context) {
        this.f365565b = c37848w;
        this.f365564a = context.getApplicationContext();
    }

    public static c0 a(C37848w c37848w, Context context) {
        return new c0(c37848w, context);
    }

    public void b(List<d0> list) {
        e2.a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (d0 d0Var : list) {
            String strC = d0Var.c();
            if (d0Var.g()) {
                e2.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + strC);
                arrayList2.add(d0Var);
            } else {
                e2.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + strC);
                arrayList.add(d0Var);
            }
        }
        a((List<d0>) arrayList, false);
        a((List<d0>) arrayList2, true);
    }

    public void a() {
        this.f365565b.a(this.f365566c);
    }

    public void a(int i12, Intent intent) {
        if (!C37828b0.f365518g.booleanValue()) {
            e2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
            return;
        }
        if (i12 != -1) {
            e2.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
            return;
        }
        if (intent == null) {
            e2.a("GooglePlayPurchaseHandler: empty intent has been received");
            return;
        }
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (TextUtils.isEmpty(stringExtra)) {
            e2.a("GooglePlayPurchaseHandler: empty purchase data in intent");
            return;
        }
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (stringExtra2 == null) {
            e2.a("GooglePlayPurchaseHandler: null data signature in intent");
        } else {
            C37835i.a(new D(this, stringExtra, stringExtra2, 4));
        }
    }

    public void a(int i12, List<Object> list) {
        if (i12 != 0) {
            e2.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
            return;
        }
        if (list == null || list.isEmpty()) {
            e2.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
        } else if (C37828b0.f365518g.booleanValue()) {
            C37835i.a(new H(5, this, list));
        } else {
            e2.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        d0 d0VarA = d0.a(str, str2, c2.a());
        if (d0VarA == null) {
            return;
        }
        this.f365565b.a(Collections.singletonList(d0VarA), this.f365566c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        e2.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0 d0VarA = C37828b0.a(it.next());
            if (d0VarA == null) {
                e2.a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(d0VarA);
            }
        }
        if (arrayList.isEmpty()) {
            e2.a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.f365565b.a(arrayList, this.f365566c);
        }
    }

    public void a(List<d0> list, boolean z12) {
        if (list.isEmpty()) {
            e2.a(z12 ? "GooglePlayPurchaseHandler: empty inapp raw purchases list" : "GooglePlayPurchaseHandler: empty subs raw purchases list");
        } else {
            C37828b0.a(list, z12, new a(list), this.f365564a);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        this.f365565b.a(jSONObject, jSONObject2, str, map);
    }
}

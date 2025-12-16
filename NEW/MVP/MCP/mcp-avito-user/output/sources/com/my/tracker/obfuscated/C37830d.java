package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import com.my.tracker.obfuscated.C37829c;
import com.my.tracker.obfuscated.C37848w;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37830d implements C37848w.a, C37829c.InterfaceC10794c {

    /* renamed from: a, reason: collision with root package name */
    final C37848w f365570a;

    /* renamed from: b, reason: collision with root package name */
    final z0 f365571b;

    /* renamed from: c, reason: collision with root package name */
    final C37829c f365572c;

    private C37830d(C37848w c37848w, z0 z0Var, C37829c.b bVar) {
        this.f365570a = c37848w;
        this.f365571b = z0Var;
        this.f365572c = bVar.a(this);
    }

    public void c() {
        C37835i.a(new J(this, 0));
    }

    public static C37830d a(C37848w c37848w, z0 z0Var, Context context) {
        C37829c.b bVarA = C37829c.a(context.getApplicationContext());
        if (bVarA != null) {
            return new C37830d(c37848w, z0Var, bVarA);
        }
        e2.a("AppGalleryPurchaseHandler: can't support appGallery purchases ");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f365571b.b() < 86400000) {
            e2.a("AppGalleryPurchaseHandler: not yet time for tracking");
        } else {
            this.f365572c.a();
            this.f365571b.a(jCurrentTimeMillis);
        }
    }

    @Override // com.my.tracker.obfuscated.C37829c.InterfaceC10794c
    public void c(List<C37831e> list) {
        if (list.isEmpty()) {
            e2.a("AppGalleryPurchaseHandler: can't trackAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f365570a.c(list);
        }
    }

    public void a() {
        this.f365570a.a(this);
        c();
    }

    public void b(Object obj, String str, String str2, String str3, Map<String, String> map) {
        C37835i.a(new I(this, obj, str, str2, str3, map));
    }

    public void a(int i12, Intent intent) {
        if (i12 != -1) {
            e2.a("AppGalleryPurchaseHandler: result code isn't equal to RESULT_OK");
        } else if (intent == null) {
            e2.a("AppGalleryPurchaseHandler: empty intent has been received");
        } else {
            this.f365572c.a(intent);
        }
    }

    @Override // com.my.tracker.obfuscated.C37829c.InterfaceC10794c
    public void b(List<C37831e> list) {
        if (list.isEmpty()) {
            e2.a("AppGalleryPurchaseHandler: can't addAppGalleryRawPurchases, appGalleryRawPurchases is empty");
        } else {
            this.f365570a.a(list, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj, String str, String str2, String str3, Map map) {
        JSONObject jSONObjectA = C37829c.a(obj);
        if (jSONObjectA == null) {
            e2.a("AppGalleryPurchaseHandler: error parse productInfo object");
        } else {
            this.f365570a.a(jSONObjectA, str, str2, str3, (Map<String, String>) map);
        }
    }

    @Override // com.my.tracker.obfuscated.C37848w.a
    public void a(List<C37831e> list) {
        if (list.isEmpty()) {
            e2.a("AppGalleryPurchaseHandler: empty subs raw purchases list");
        } else {
            this.f365572c.a(list);
        }
    }
}

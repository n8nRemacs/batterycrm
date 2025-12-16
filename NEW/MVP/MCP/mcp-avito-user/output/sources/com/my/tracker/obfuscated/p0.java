package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.my.tracker.MyTracker;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.C37848w;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f365719a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    final f2 f365720b;

    /* renamed from: c, reason: collision with root package name */
    final Application f365721c;

    /* renamed from: d, reason: collision with root package name */
    final C37848w f365722d;

    /* renamed from: e, reason: collision with root package name */
    final C37825a f365723e;

    /* renamed from: f, reason: collision with root package name */
    final C37836j f365724f;

    /* renamed from: g, reason: collision with root package name */
    final C37844s f365725g;

    /* renamed from: h, reason: collision with root package name */
    final d1 f365726h;

    /* renamed from: i, reason: collision with root package name */
    final g1 f365727i;

    /* renamed from: j, reason: collision with root package name */
    x0 f365728j;

    public final class a implements C37848w.b {
        public a() {
        }

        @Override // com.my.tracker.obfuscated.C37848w.b
        public void a() {
            p0.this.f365723e.e();
        }

        @Override // com.my.tracker.obfuscated.C37848w.b
        public void a(String str) {
            p0.this.f365724f.b(str);
        }
    }

    public p0(f2 f2Var, Application application) {
        this.f365720b = f2Var;
        this.f365721c = application;
        e2.c("MyTracker created, version: 3.2.0");
        C37848w c37848wA = C37848w.a(f2Var, new a(), application);
        this.f365722d = c37848wA;
        g1 g1VarA = g1.a(c37848wA, f2Var.a(), application);
        this.f365727i = g1VarA;
        this.f365723e = C37825a.a(c37848wA, f2Var, g1VarA, application);
        this.f365724f = C37836j.a(f2Var, application);
        this.f365725g = C37844s.a(c37848wA);
        this.f365726h = d1.a(c37848wA, application);
    }

    public static p0 a(String str, f2 f2Var, Application application) {
        f2Var.b(str);
        return new p0(f2Var, application);
    }

    public void b(int i12, boolean z12) {
        if (b()) {
            return;
        }
        p1.e().b(i12, z12);
    }

    public String a(Intent intent) {
        return this.f365725g.a(intent);
    }

    public void b(String str, String str2, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.f365722d.b(str, str2, map);
    }

    public void a() {
        a((MyTracker.FlushListener) null);
    }

    public void b(Map<String, String> map) {
        if (b()) {
            return;
        }
        this.f365722d.d(map);
    }

    public void a(int i12) {
        if (b()) {
            return;
        }
        p1.e().a(i12);
    }

    public boolean b() {
        boolean z12 = this.f365719a.get();
        boolean z13 = !z12;
        if (!z12) {
            e2.b("MyTracker error: tracker hasn't been initialized");
        }
        return z13;
    }

    public void a(int i12, Intent intent) {
        if (b()) {
            return;
        }
        if (this.f365720b.o()) {
            this.f365726h.b(i12, intent);
        } else {
            e2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
        }
    }

    public void a(int i12, List<Object> list) {
        if (b()) {
            return;
        }
        if (this.f365720b.o()) {
            this.f365726h.a(i12, list);
        } else {
            e2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
        }
    }

    public void a(int i12, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.f365722d.a(i12, map);
    }

    public void a(int i12, boolean z12) {
        if (b()) {
            return;
        }
        p1.e().a(i12, z12);
    }

    public void a(Activity activity) {
        if (b()) {
            return;
        }
        this.f365723e.d(activity);
    }

    public void a(MyTracker.FlushListener flushListener) {
        if (b()) {
            return;
        }
        this.f365722d.a(flushListener);
    }

    public void a(AdEvent adEvent) {
        if (b()) {
            return;
        }
        this.f365722d.a(adEvent);
    }

    public void a(MiniAppEvent miniAppEvent) {
        if (b()) {
            return;
        }
        this.f365722d.a(miniAppEvent);
    }

    public void a(Object obj, String str, String str2, String str3, Map<String, String> map) {
        if (b()) {
            return;
        }
        if (this.f365720b.o()) {
            e2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");
        } else {
            this.f365726h.a(obj, str, str2, str3, map);
        }
    }

    public void a(String str, String str2, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.f365722d.a(str, str2, map);
    }

    public void a(String str, Map<String, String> map) {
        if (b()) {
            return;
        }
        this.f365722d.a(str, map);
    }

    public void a(List<MyTrackerPluginConfig> list) {
        if (!this.f365719a.compareAndSet(false, true)) {
            e2.a("MyTracker: tracker has already been initialized");
            return;
        }
        e2.c("MyTracker is initialized with id: " + this.f365720b.g());
        o0.c(this.f365721c);
        this.f365722d.c();
        k0.a(this.f365720b, this.f365722d, this.f365727i, this.f365721c);
        e0.a(this.f365722d, this.f365724f, this.f365721c);
        j0.a(this.f365722d, this.f365724f, this.f365721c);
        p1.d().a(this.f365720b, this.f365721c);
        this.f365723e.a();
        this.f365726h.a();
        if (list.isEmpty()) {
            return;
        }
        x0 x0VarA = x0.a(this.f365722d, this.f365721c);
        this.f365728j = x0VarA;
        x0VarA.a(list);
    }

    public void a(Map<String, String> map) {
        if (b()) {
            return;
        }
        this.f365722d.c(map);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        if (b()) {
            return;
        }
        if (this.f365720b.o()) {
            e2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
        } else {
            this.f365726h.a(jSONObject, jSONObject2, str, map);
        }
    }
}

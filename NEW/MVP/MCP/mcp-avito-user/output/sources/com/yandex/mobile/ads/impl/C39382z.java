package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.C39310c0;
import com.yandex.mobile.ads.impl.ky0;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.yandex.mobile.ads.impl.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39382z {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f392113a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39310c0 f392114b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a f392115c = new a(this);

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC39367u f392116d = C39370v.a();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final q71 f392117e = q71.a();

    public C39382z(@j.N Context context, @j.N n2 n2Var, @j.N InterfaceC39306b0 interfaceC39306b0, @j.P FalseClick falseClick) {
        this.f392113a = context.getApplicationContext();
        this.f392114b = new C39310c0(context, n2Var, interfaceC39306b0, falseClick);
    }

    public final void a() {
        this.f392116d.b(this.f392113a, (InterfaceC39322f0) this.f392115c);
        this.f392116d.b(this.f392113a, (vz0) this.f392115c);
    }

    public final void b() {
        this.f392114b.a(C39310c0.a.f384144d);
    }

    public final void c() {
        this.f392114b.b(C39310c0.a.f384144d);
    }

    public final void d() {
        this.f392114b.a(C39310c0.a.f384142b);
        this.f392116d.a(this.f392113a, (InterfaceC39322f0) this.f392115c);
        this.f392116d.a(this.f392113a, (vz0) this.f392115c);
        this.f392117e.a(n80.f388183c, this);
    }

    public final void e() {
        this.f392117e.b(n80.f388183c, this);
        this.f392116d.b(this.f392113a, (InterfaceC39322f0) this.f392115c);
        this.f392116d.b(this.f392113a, (vz0) this.f392115c);
        this.f392114b.b(C39310c0.a.f384142b);
    }

    public final void f() {
        this.f392114b.a(C39310c0.a.f384143c);
    }

    public final void g() {
        this.f392114b.b(C39310c0.a.f384143c);
    }

    @j.k0
    /* renamed from: com.yandex.mobile.ads.impl.z$a */
    public static class a implements InterfaceC39322f0, vz0 {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private WeakReference<Activity> f392118a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private String f392119b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final C39382z f392120c;

        public a(@j.N C39382z c39382z) {
            this.f392120c = c39382z;
        }

        @Override // com.yandex.mobile.ads.impl.vz0
        public final void a(@j.N Activity activity, @j.P Bundle bundle) {
            String string;
            Objects.toString(activity);
            if (bundle == null || (string = bundle.getString("yandex_mobile_ads_activity_id")) == null || !string.equals(this.f392119b)) {
                return;
            }
            this.f392120c.d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39322f0
        public final void b(@j.N Activity activity) {
            Objects.toString(activity);
            WeakReference<Activity> weakReference = this.f392118a;
            if (weakReference == null || !activity.equals(weakReference.get())) {
                return;
            }
            this.f392120c.d();
        }

        @Override // com.yandex.mobile.ads.impl.vz0
        public final void b(@j.N Activity activity, @j.P Bundle bundle) {
            WeakReference<Activity> weakReference;
            Objects.toString(activity);
            if (bundle == null || (weakReference = this.f392118a) == null || !activity.equals(weakReference.get())) {
                return;
            }
            String string = UUID.randomUUID().toString();
            this.f392119b = string;
            bundle.putString("yandex_mobile_ads_activity_id", string);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39322f0
        public final void a(@j.N Activity activity) {
            Objects.toString(activity);
            if (this.f392118a == null) {
                this.f392118a = new WeakReference<>(activity);
            }
        }
    }

    public final void a(@j.N ky0.a aVar) {
        this.f392114b.a(aVar);
    }
}

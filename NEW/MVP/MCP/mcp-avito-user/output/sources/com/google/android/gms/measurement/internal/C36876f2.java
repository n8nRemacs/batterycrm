package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36876f2 extends AbstractC36884g3 {

    /* renamed from: A, reason: collision with root package name */
    public static final Pair<String, Long> f355124A = new Pair<>("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f355125c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f355126d;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f355127e;

    /* renamed from: f, reason: collision with root package name */
    public C36904j2 f355128f;

    /* renamed from: g, reason: collision with root package name */
    public final C36911k2 f355129g;

    /* renamed from: h, reason: collision with root package name */
    public final C36918l2 f355130h;

    /* renamed from: i, reason: collision with root package name */
    public String f355131i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f355132j;

    /* renamed from: k, reason: collision with root package name */
    public long f355133k;

    /* renamed from: l, reason: collision with root package name */
    public final C36911k2 f355134l;

    /* renamed from: m, reason: collision with root package name */
    public final C36897i2 f355135m;

    /* renamed from: n, reason: collision with root package name */
    public final C36918l2 f355136n;

    /* renamed from: o, reason: collision with root package name */
    public final C36890h2 f355137o;

    /* renamed from: p, reason: collision with root package name */
    public final C36897i2 f355138p;

    /* renamed from: q, reason: collision with root package name */
    public final C36911k2 f355139q;

    /* renamed from: r, reason: collision with root package name */
    public final C36911k2 f355140r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f355141s;

    /* renamed from: t, reason: collision with root package name */
    public final C36897i2 f355142t;

    /* renamed from: u, reason: collision with root package name */
    public final C36897i2 f355143u;

    /* renamed from: v, reason: collision with root package name */
    public final C36911k2 f355144v;

    /* renamed from: w, reason: collision with root package name */
    public final C36918l2 f355145w;

    /* renamed from: x, reason: collision with root package name */
    public final C36918l2 f355146x;

    /* renamed from: y, reason: collision with root package name */
    public final C36911k2 f355147y;

    /* renamed from: z, reason: collision with root package name */
    public final C36890h2 f355148z;

    public C36876f2(I2 i22) {
        super(i22);
        this.f355126d = new Object();
        this.f355134l = new C36911k2(this, "session_timeout", 1800000L);
        this.f355135m = new C36897i2(this, "start_new_session", true);
        this.f355139q = new C36911k2(this, "last_pause_time", 0L);
        this.f355140r = new C36911k2(this, "session_id", 0L);
        this.f355136n = new C36918l2(this, "non_personalized_ads");
        this.f355137o = new C36890h2(this, "last_received_uri_timestamps_by_source");
        this.f355138p = new C36897i2(this, "allow_remote_dynamite", false);
        this.f355129g = new C36911k2(this, "first_open_time", 0L);
        new C36911k2(this, "app_install_time", 0L);
        this.f355130h = new C36918l2(this, "app_instance_id");
        this.f355142t = new C36897i2(this, "app_backgrounded", false);
        this.f355143u = new C36897i2(this, "deep_link_retrieval_complete", false);
        this.f355144v = new C36911k2(this, "deep_link_retrieval_attempts", 0L);
        this.f355145w = new C36918l2(this, "firebase_feature_rollouts");
        this.f355146x = new C36918l2(this, "deferred_attribution_cache");
        this.f355147y = new C36911k2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f355148z = new C36890h2(this, "default_event_parameters");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36884g3
    public final boolean h() {
        return true;
    }

    @j.l0
    public final boolean i(int i12) {
        int i13 = m().getInt("consent_source", 100);
        zzif zzifVar = zzif.f355542c;
        return i12 <= i13;
    }

    public final boolean j(long j12) {
        return j12 - this.f355134l.a() > this.f355139q.a();
    }

    @j.l0
    public final void k(boolean z12) {
        e();
        S1 s1Zzj = zzj();
        s1Zzj.f354897n.c("App measurement setting deferred collection", Boolean.valueOf(z12));
        SharedPreferences.Editor editorEdit = m().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z12);
        editorEdit.apply();
    }

    @j.l0
    public final SharedPreferences l() {
        e();
        f();
        if (this.f355127e == null) {
            synchronized (this.f355126d) {
                try {
                    if (this.f355127e == null) {
                        this.f355127e = this.f355183a.f354709a.getSharedPreferences(this.f355183a.f354709a.getPackageName() + "_preferences", 0);
                    }
                } finally {
                }
            }
        }
        return this.f355127e;
    }

    @XY0.e
    @j.l0
    public final SharedPreferences m() {
        e();
        f();
        C36729v.j(this.f355125c);
        return this.f355125c;
    }

    public final SparseArray<Long> n() {
        Bundle bundleA = this.f355137o.a();
        if (bundleA == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().f354889f.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i12 = 0; i12 < intArray.length; i12++) {
            sparseArray.put(intArray[i12], Long.valueOf(longArray[i12]));
        }
        return sparseArray;
    }

    @j.l0
    public final zzif o() {
        e();
        return zzif.b(m().getInt("consent_source", 100), m().getString("consent_settings", "G1"));
    }
}

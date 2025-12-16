package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.mobile.ads.impl.w90;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes8.dex */
public final class x90 implements w90, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f391577a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final n31 f391578b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Context f391579c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final InterfaceC42726C f391580d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final LinkedHashSet f391581e;

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<SharedPreferences> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SharedPreferences invoke() {
            return n31.a(x90.this.f391578b, x90.this.f391579c, x90.this.f391577a);
        }
    }

    public x90(@Y61.k Context context, @Y61.k String str, @Y61.k n31 n31Var) {
        this.f391577a = str;
        this.f391578b = n31Var;
        this.f391579c = context.getApplicationContext();
        this.f391580d = C42727D.c(new a());
        this.f391581e = new LinkedHashSet();
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final boolean contains(@Y61.k String str) {
        return a().contains(str);
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final boolean getBoolean(@Y61.k String str, boolean z12) {
        return a().getBoolean(str, z12);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(@Y61.l SharedPreferences sharedPreferences, @Y61.l String str) {
        if (str != null) {
            Iterator it = this.f391581e.iterator();
            while (it.hasNext()) {
                w90.a aVar = (w90.a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.a(this, str);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final void putBoolean(@Y61.k String str, boolean z12) {
        a().edit().putBoolean(str, z12).apply();
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final void putLong(@Y61.k String str, long j12) {
        a().edit().putLong(str, j12).apply();
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final void putString(@Y61.k String str, @Y61.l String str2) {
        a().edit().putString(str, str2).apply();
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final void remove(@Y61.k String str) {
        a().edit().remove(str).apply();
    }

    private final SharedPreferences a() {
        return (SharedPreferences) this.f391580d.getValue();
    }

    @Override // com.yandex.mobile.ads.impl.w90
    @Y61.l
    public final String b(@Y61.k String str) {
        return a().getString(str, null);
    }

    @Override // com.yandex.mobile.ads.impl.w90
    @Y61.l
    public final Set a(@Y61.l Set set) {
        return a().getStringSet("BiddingSettingsAdUnitIdsSet", set);
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final int b(int i12, @Y61.k String str) {
        a().contains(str);
        return a().getInt(str, i12);
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final void a(@Y61.k HashSet hashSet) {
        a().edit().putStringSet("BiddingSettingsAdUnitIdsSet", hashSet).apply();
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final void a(int i12, @Y61.k String str) {
        a().edit().putInt(str, i12).apply();
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final long a(@Y61.k String str) {
        return a().getLong(str, 0L);
    }

    public /* synthetic */ x90(Context context, String str) {
        this(context, str, new n31());
    }

    @Override // com.yandex.mobile.ads.impl.w90
    public final void a(@Y61.k w90.a aVar) {
        if (this.f391581e.isEmpty()) {
            a().registerOnSharedPreferenceChangeListener(this);
        }
        this.f391581e.add(new WeakReference(aVar));
    }
}

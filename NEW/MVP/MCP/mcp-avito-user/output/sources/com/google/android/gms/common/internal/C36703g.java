package com.google.android.gms.common.internal;

import android.accounts.Account;
import androidx.collection.C20199a;
import androidx.collection.C20203c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36703g {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public final Account f349424a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f349425b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f349426c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f349427d;

    /* renamed from: e, reason: collision with root package name */
    public final String f349428e;

    /* renamed from: f, reason: collision with root package name */
    public final String f349429f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.signin.a f349430g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f349431h;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.internal.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @I41.h
        public Account f349432a;

        /* renamed from: b, reason: collision with root package name */
        public C20203c f349433b;

        /* renamed from: c, reason: collision with root package name */
        public String f349434c;

        /* renamed from: d, reason: collision with root package name */
        public String f349435d;

        /* renamed from: e, reason: collision with root package name */
        public final com.google.android.gms.signin.a f349436e = com.google.android.gms.signin.a.f355598b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    public C36703g(@I41.h Account account, @j.N Set set, @j.N C20199a c20199a, @j.N String str, @j.N String str2, @I41.h com.google.android.gms.signin.a aVar) {
        this.f349424a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f349425b = setEmptySet;
        C20199a c20199aEmptyMap = c20199a == null ? Collections.emptyMap() : c20199a;
        this.f349427d = c20199aEmptyMap;
        this.f349428e = str;
        this.f349429f = str2;
        this.f349430g = aVar == null ? com.google.android.gms.signin.a.f355598b : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = c20199aEmptyMap.values().iterator();
        while (it.hasNext()) {
            ((K) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f349426c = Collections.unmodifiableSet(hashSet);
    }
}

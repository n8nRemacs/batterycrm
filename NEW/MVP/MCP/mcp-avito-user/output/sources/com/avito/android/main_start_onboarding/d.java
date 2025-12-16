package com.avito.android.main_start_onboarding;

import AK0.l;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.bxcontent.N1;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: OnboardingSnoozeTimestampStorageImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/main_start_onboarding/d;", "Lcom/avito/android/bxcontent/N1;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements N1 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f184233a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E f184234b;

    @Inject
    public d(@k l lVar, @k E e12) {
        this.f184233a = lVar;
        this.f184234b = e12;
    }

    @Override // com.avito.android.bxcontent.N1
    public final void a(@k String str) {
        this.f184233a.remove(g(str));
    }

    @Override // com.avito.android.bxcontent.N1
    public final boolean b(long j12, @k String str) {
        boolean z12 = this.f184233a.getLong(g(str), 0L) <= org.threeten.bp.e.L().K(j12).v();
        if (z12) {
            a(str);
        }
        return z12;
    }

    @Override // com.avito.android.bxcontent.N1
    public final void c(@k String str) {
        String strG = g("LAST_SEARCH_TIMESTAMP_POSTFIX");
        String strG2 = g("LAST_SEARCH_TIMESTAMP_POSTFIX");
        l lVar = this.f184233a;
        Set<String> setF = lVar.f(strG2);
        if (setF == null) {
            setF = B0.f406639b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
        linkedHashSetO0.add(C42745f0.O(C42745f0.U(String.valueOf(org.threeten.bp.e.L().K(0L).v()), str), "-", null, null, null, 62));
        G0 g02 = G0.f406611a;
        lVar.putStringSet(strG, linkedHashSetO0);
    }

    @Override // com.avito.android.bxcontent.N1
    public final void d(@k String str) {
        this.f184233a.putLong(g(str), org.threeten.bp.e.L().K(0L).v());
    }

    @Override // com.avito.android.bxcontent.N1
    public final boolean e() {
        long j12 = this.f184233a.getLong(g("FAVORITES_ADD_TIMESTAMP_POSTFIX"), 0L);
        boolean z12 = j12 != 0 && j12 > org.threeten.bp.e.L().K(14L).v();
        if (!z12) {
            a("FAVORITES_ADD_TIMESTAMP_POSTFIX");
        }
        return z12;
    }

    @Override // com.avito.android.bxcontent.N1
    public final boolean f() {
        Long lZ02;
        long jV2 = org.threeten.bp.e.L().K(1L).v();
        String strG = g("LAST_SEARCH_TIMESTAMP_POSTFIX");
        l lVar = this.f184233a;
        Set<String> setF = lVar.f(strG);
        if (setF == null) {
            setF = B0.f406639b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : setF) {
            String str = (String) C42745f0.G(C43066x.f0((String) obj, new String[]{"-"}, 0, 6));
            if (str != null && (lZ02 = C43066x.z0(str)) != null && lZ02.longValue() > jV2) {
                arrayList.add(obj);
            }
        }
        Set<String> setP0 = C42745f0.P0(arrayList);
        Set<String> set = setP0;
        if (set.isEmpty()) {
            lVar.remove(g("LAST_SEARCH_TIMESTAMP_POSTFIX"));
        } else {
            lVar.putStringSet(g("LAST_SEARCH_TIMESTAMP_POSTFIX"), setP0);
        }
        return ((long) set.size()) <= 15;
    }

    public final String g(String str) {
        return C42745f0.O(C42745f0.U("ONBOARDING_SNOOZE_TIMESTAMP_PREFERENCES_KEY", this.f184234b.a(), str), "-", null, null, null, 62);
    }
}

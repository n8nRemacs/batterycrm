package com.avito.android.vas_performance;

import Zx.C19616a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.deeplink.CompetitiveVasLink;
import com.avito.android.vas_performance.screens.competitive.ui.CompetitiveVasV2Fragment;
import com.avito.android.vas_performance.ui.competitive.CompetitiveVasFragment;
import kotlin.Metadata;

/* compiled from: CompetitiveVasFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/i;", "LA50/b;", "Lcom/avito/android/vas_performance/deeplink/CompetitiveVasLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.vas_performance.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36055i implements A50.b<CompetitiveVasLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C19616a f320217a;

    public C36055i(@Y61.k C19616a c19616a) {
        this.f320217a = c19616a;
    }

    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        CompetitiveVasLink competitiveVasLink = (CompetitiveVasLink) deepLink;
        C19616a c19616a = this.f320217a;
        c19616a.getClass();
        kotlin.reflect.n<Object> nVar = C19616a.f20576q[2];
        boolean zBooleanValue = ((Boolean) c19616a.f20579d.a().invoke()).booleanValue();
        String str = competitiveVasLink.f319858c;
        String str2 = competitiveVasLink.f319857b;
        boolean z12 = competitiveVasLink.f319859d;
        if (zBooleanValue) {
            CompetitiveVasV2Fragment.f320469s0.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("closable", z12);
            bundle.putString("item_id", str2);
            bundle.putString("checkout_context", str);
            CompetitiveVasV2Fragment competitiveVasV2Fragment = new CompetitiveVasV2Fragment();
            competitiveVasV2Fragment.setArguments(bundle);
            return competitiveVasV2Fragment;
        }
        CompetitiveVasFragment.f321463C0.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("closable", z12);
        bundle2.putString("item_id", str2);
        bundle2.putString("checkout_context", str);
        CompetitiveVasFragment competitiveVasFragment = new CompetitiveVasFragment();
        competitiveVasFragment.setArguments(bundle2);
        return competitiveVasFragment;
    }
}

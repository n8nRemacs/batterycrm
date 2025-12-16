package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.travel_onboarding.models.TravelOnboardingButtonViewType;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonWithSubtitle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.travel_onboarding.ui.items.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35242c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f302407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f302408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f302409n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TravelOnboardingButtonViewType f302410o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f302411p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f302412q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35242c(String str, String str2, Y41.a aVar, TravelOnboardingButtonViewType travelOnboardingButtonViewType, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f302407l = str;
        this.f302408m = str2;
        this.f302409n = aVar;
        this.f302410o = travelOnboardingButtonViewType;
        this.f302411p = vVar;
        this.f302412q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f302412q | 1);
        TravelOnboardingButtonViewType travelOnboardingButtonViewType = this.f302410o;
        String str = this.f302408m;
        Y41.a<G0> aVar = this.f302409n;
        C35246g.a(this.f302407l, str, aVar, travelOnboardingButtonViewType, this.f302411p, a12, iA2);
        return G0.f406611a;
    }
}

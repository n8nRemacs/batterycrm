package com.avito.android.credits.models;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.credit_broker.CreditButton;
import com.avito.android.remote.model.credit_broker.CreditProgress;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.remote.model.credit_broker.OfferDetailsItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsV2Calculator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/models/d;", "Lcom/avito/android/credits/models/CreditCalculator;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends CreditCalculator {

    /* renamed from: A, reason: collision with root package name */
    @l
    public final DeepLink f128991A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final DeepLink f128992B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public LoanTerms.Term f128993C;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final CreditProgress f128994D;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final List<OfferDetailsItem> f128995E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final List<LoanTerms.Term> f128996F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final CreditButton f128997G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final String f128998H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f128999I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final EntryPoint f129000J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final String f129001K;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(@Y61.k com.avito.android.remote.model.credit_broker.InstallmentsV2Product r24) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.credits.models.d.<init>(com.avito.android.remote.model.credit_broker.InstallmentsV2Product):void");
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @k
    /* renamed from: d, reason: from getter */
    public final String getF129007C() {
        return this.f129001K;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @l
    /* renamed from: e, reason: from getter */
    public final EntryPoint getF129006B() {
        return this.f129000J;
    }
}

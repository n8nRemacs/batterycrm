package com.avito.android.credits.models;

import Y61.k;
import Y61.l;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.IconName;
import com.avito.android.remote.model.credit_broker.SberAutoLoansProduct;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SberAutoCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/models/e;", "Lcom/avito/android/credits/models/CreditCalculator;", "a", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends CreditCalculator {

    /* renamed from: A, reason: collision with root package name */
    @l
    public final IconName f129002A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final EntryPoint f129003B;

    /* renamed from: C, reason: collision with root package name */
    @k
    public final String f129004C;

    /* compiled from: SberAutoCalculator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/credits/models/e$a;", "", "<init>", "()V", "", "DOWN_PAYMENT_KEY", "Ljava/lang/String;", "DURATION_KEY", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(@k SberAutoLoansProduct sberAutoLoansProduct, int i12) {
        String title = sberAutoLoansProduct.getTitle();
        String str = title == null ? "" : title;
        String subtitle = sberAutoLoansProduct.getSubtitle();
        String buttonTitle = sberAutoLoansProduct.getButtonTitle();
        String str2 = buttonTitle == null ? "" : buttonTitle;
        AttributedText agreementInfo = sberAutoLoansProduct.getAgreementInfo();
        Float creditRate = sberAutoLoansProduct.getCreditRate();
        float fFloatValue = creditRate != null ? creditRate.floatValue() : 0.0f;
        int iA2 = com.avito.android.credits.models.a.a(0, sberAutoLoansProduct.getMinCreditAmount());
        int iA3 = com.avito.android.credits.models.a.a(Integer.MAX_VALUE, sberAutoLoansProduct.getMaxCreditAmount());
        int iA4 = com.avito.android.credits.models.a.a(60, sberAutoLoansProduct.getMaxTerm());
        String str3 = str;
        String str4 = str2;
        super(str3, null, subtitle, str4, null, agreementInfo, CreditCalculator.Type.f128981f, i12, fFloatValue, 0, 0, iA2, null, sberAutoLoansProduct.getUrl(), false, com.avito.android.credits.models.a.a(0, sberAutoLoansProduct.getTerm()), iA3, iA4, null, 284178, null);
        this.f129002A = sberAutoLoansProduct.getIconName();
        this.f129003B = sberAutoLoansProduct.getEntryPoint();
        String analyticsSlug = sberAutoLoansProduct.getAnalyticsSlug();
        this.f129004C = analyticsSlug == null ? "autobrokerSber" : analyticsSlug;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @k
    /* renamed from: d, reason: from getter */
    public final String getF129007C() {
        return this.f129004C;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @l
    /* renamed from: e, reason: from getter */
    public final EntryPoint getF129006B() {
        return this.f129003B;
    }
}

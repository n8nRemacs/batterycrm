package com.avito.android.credits.models;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.Y;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.credits.x;
import com.avito.android.remote.model.credit_broker.Contest;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.ExternalAppData;
import com.avito.android.remote.model.credit_broker.TinkoffAutoLoansProduct;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import nd.InterfaceC44378a;

/* compiled from: TinkoffAutoCalculator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/models/f;", "Lcom/avito/android/credits/models/CreditCalculator;", "Lcom/avito/android/credits/models/g;", "a", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends CreditCalculator implements g {

    /* renamed from: A, reason: collision with root package name */
    @k
    public final Y f129005A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final EntryPoint f129006B;

    /* renamed from: C, reason: collision with root package name */
    @k
    public final String f129007C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final String f129008D;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC42726C f129009E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final Contest f129010F;

    /* compiled from: TinkoffAutoCalculator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/credits/models/f$a;", "", "<init>", "()V", "", "CREDIT_AMOUNT_KEY", "Ljava/lang/String;", "DOWN_PAYMENT_KEY", "PARTNER_INTEGRATION_ID_KEY", "TERM_KEY", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TinkoffAutoCalculator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Uri> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44378a f129012m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ TinkoffAutoLoansProduct f129013n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC44378a interfaceC44378a, TinkoffAutoLoansProduct tinkoffAutoLoansProduct) {
            super(0);
            this.f129012m = interfaceC44378a;
            this.f129013n = tinkoffAutoLoansProduct;
        }

        @Override // Y41.a
        public final Uri invoke() {
            ExternalAppData externalAppData = this.f129013n.getExternalAppData();
            f.this.getClass();
            if (externalAppData == null) {
                return null;
            }
            if (!this.f129012m.b("com.idamob.tinkoff.android")) {
                externalAppData = null;
            }
            if (externalAppData != null) {
                return externalAppData.getUrl();
            }
            return null;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@k TinkoffAutoLoansProduct tinkoffAutoLoansProduct, int i12, @k x xVar, @k Y y12, @k InterfaceC44378a interfaceC44378a) {
        String title = tinkoffAutoLoansProduct.getTitle();
        String str = title == null ? "" : title;
        String subtitle = tinkoffAutoLoansProduct.getSubtitle();
        Float creditRate = tinkoffAutoLoansProduct.getCreditRate();
        float fFloatValue = creditRate != null ? creditRate.floatValue() : 0.0f;
        int iA2 = com.avito.android.credits.models.a.a(0, tinkoffAutoLoansProduct.getInitialFee());
        int iA3 = com.avito.android.credits.models.a.a(0, tinkoffAutoLoansProduct.getTerm());
        String buttonTitle = tinkoffAutoLoansProduct.getButtonTitle();
        String str2 = buttonTitle == null ? "" : buttonTitle;
        String str3 = str;
        String str4 = str2;
        super(str3, null, subtitle, str4, null, tinkoffAutoLoansProduct.getAgreementInfo(), CreditCalculator.Type.f128977b, i12, fFloatValue, iA2, 0, com.avito.android.credits.models.a.a(0, tinkoffAutoLoansProduct.getMinCreditAmount()), null, tinkoffAutoLoansProduct.getUrl(), false, iA3, com.avito.android.credits.models.a.a(Integer.MAX_VALUE, tinkoffAutoLoansProduct.getMaxCreditAmount()), com.avito.android.credits.models.a.a(60, tinkoffAutoLoansProduct.getMaxTerm()), new com.avito.android.credits.utils.e(), 21522, null);
        this.f129005A = y12;
        this.f129006B = tinkoffAutoLoansProduct.getEntryPoint();
        String analyticsSlug = tinkoffAutoLoansProduct.getAnalyticsSlug();
        this.f129007C = analyticsSlug == null ? "tinkoff" : analyticsSlug;
        this.f129008D = xVar.b(this.f128970t);
        this.f129009E = C42727D.c(new b(interfaceC44378a, tinkoffAutoLoansProduct));
        this.f129010F = tinkoffAutoLoansProduct.getContest();
    }

    @Override // com.avito.android.credits.models.g
    @l
    public final Uri a() {
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        Uri.Builder builderAppendQueryParameter2;
        Uri.Builder builderAppendQueryParameter3;
        Uri.Builder builderAppendQueryParameter4;
        Uri uri = this.f128963m;
        if (uri == null || (builderBuildUpon = uri.buildUpon()) == null || (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("desired_credit_amount", String.valueOf(this.f128971u))) == null || (builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("desired_credit_term", String.valueOf(this.f128973w))) == null || (builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("down_payment", String.valueOf(this.f128972v))) == null || (builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("partnerIntegrationId", this.f129005A.getF128566d())) == null) {
            return null;
        }
        return builderAppendQueryParameter4.build();
    }

    @Override // com.avito.android.credits.models.g
    @l
    public final Uri b() {
        return (Uri) this.f129009E.getValue();
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @k
    /* renamed from: d, reason: from getter */
    public final String getF129007C() {
        return this.f129007C;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @l
    /* renamed from: e, reason: from getter */
    public final EntryPoint getF129006B() {
        return this.f129006B;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @k
    /* renamed from: f, reason: from getter */
    public final String getF129008D() {
        return this.f129008D;
    }
}

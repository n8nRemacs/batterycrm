package com.avito.android.credits.models;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.Y;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.credits.x;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.ExternalAppData;
import com.avito.android.remote.model.credit_broker.TinkoffCashLoansProduct;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import nd.InterfaceC44378a;

/* compiled from: TinkoffCashCalculator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/models/h;", "Lcom/avito/android/credits/models/CreditCalculator;", "Lcom/avito/android/credits/models/g;", "a", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends CreditCalculator implements g {

    /* renamed from: A, reason: collision with root package name */
    @k
    public final Y f129014A;

    /* renamed from: B, reason: collision with root package name */
    @k
    public final String f129015B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final EntryPoint f129016C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final InterfaceC42726C f129017D;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final String f129018E;

    /* compiled from: TinkoffCashCalculator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/credits/models/h$a;", "", "<init>", "()V", "", "SUB_11_KEY", "Ljava/lang/String;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TinkoffCashCalculator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Uri> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44378a f129020m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ TinkoffCashLoansProduct f129021n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC44378a interfaceC44378a, TinkoffCashLoansProduct tinkoffCashLoansProduct) {
            super(0);
            this.f129020m = interfaceC44378a;
            this.f129021n = tinkoffCashLoansProduct;
        }

        @Override // Y41.a
        public final Uri invoke() {
            ExternalAppData externalAppData = this.f129021n.getExternalAppData();
            h.this.getClass();
            if (externalAppData == null) {
                return null;
            }
            if (!this.f129020m.b("com.idamob.tinkoff.android")) {
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
    public h(@k TinkoffCashLoansProduct tinkoffCashLoansProduct, int i12, @k x xVar, @k Y y12, @k InterfaceC44378a interfaceC44378a) {
        String title = tinkoffCashLoansProduct.getTitle();
        String str = title == null ? "" : title;
        String subtitle = tinkoffCashLoansProduct.getSubtitle();
        Float creditRate = tinkoffCashLoansProduct.getCreditRate();
        float fFloatValue = creditRate != null ? creditRate.floatValue() : 0.0f;
        int iA2 = com.avito.android.credits.models.a.a(0, tinkoffCashLoansProduct.getInitialFee());
        int iA3 = com.avito.android.credits.models.a.a(0, tinkoffCashLoansProduct.getTerm());
        String buttonTitle = tinkoffCashLoansProduct.getButtonTitle();
        String str2 = buttonTitle == null ? "" : buttonTitle;
        AttributedText agreementInfo = tinkoffCashLoansProduct.getAgreementInfo();
        int iA4 = com.avito.android.credits.models.a.a(i12, tinkoffCashLoansProduct.getDefaultCreditAmount());
        int iA5 = com.avito.android.credits.models.a.a(0, tinkoffCashLoansProduct.getMinCreditAmount());
        int iA6 = com.avito.android.credits.models.a.a(Integer.MAX_VALUE, tinkoffCashLoansProduct.getMaxCreditAmount());
        String str3 = str;
        String str4 = str2;
        super(str3, null, subtitle, str4, null, agreementInfo, CreditCalculator.Type.f128978c, i12, fFloatValue, iA2, iA4, iA5, tinkoffCashLoansProduct.getPosition(), tinkoffCashLoansProduct.getUrl(), false, iA3, iA6, com.avito.android.credits.models.a.a(60, tinkoffCashLoansProduct.getMaxTerm()), new com.avito.android.credits.utils.e(), 18, null);
        this.f129014A = y12;
        String analyticsSlug = tinkoffCashLoansProduct.getAnalyticsSlug();
        this.f129015B = analyticsSlug == null ? "tinkoff_cash" : analyticsSlug;
        this.f129016C = tinkoffCashLoansProduct.getEntryPoint();
        this.f129017D = C42727D.c(new b(interfaceC44378a, tinkoffCashLoansProduct));
        this.f129018E = xVar.e(this.f128966p.format(Integer.valueOf(this.f128961k)));
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
        if (uri == null || (builderBuildUpon = uri.buildUpon()) == null || (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("desired_credit_amount", String.valueOf(this.f128971u))) == null || (builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("desired_credit_term", String.valueOf(this.f128973w))) == null || (builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("down_payment", String.valueOf(this.f128972v))) == null || (builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("sub11", this.f129014A.getF128566d())) == null) {
            return null;
        }
        return builderAppendQueryParameter4.build();
    }

    @Override // com.avito.android.credits.models.g
    @l
    public final Uri b() {
        return (Uri) this.f129017D.getValue();
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @k
    /* renamed from: d, reason: from getter */
    public final String getF129007C() {
        return this.f129015B;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @l
    /* renamed from: e, reason: from getter */
    public final EntryPoint getF129006B() {
        return this.f129016C;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @k
    /* renamed from: f, reason: from getter */
    public final String getF129008D() {
        return this.f129018E;
    }
}

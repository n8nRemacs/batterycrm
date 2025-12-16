package com.avito.android.auto_loans_composite_broker.v1;

import com.avito.android.credits.v;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculator;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CompositeBrokerCalculatorAggregator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v1/l;", "", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CompositeBrokerCalculator f95560a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f95562c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f95563d;

    /* renamed from: f, reason: collision with root package name */
    public int f95565f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final int[] f95566g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f95567h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AttributedText f95568i;

    /* renamed from: j, reason: collision with root package name */
    public final int f95569j;

    /* renamed from: k, reason: collision with root package name */
    public final int f95570k;

    /* renamed from: l, reason: collision with root package name */
    public final int f95571l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f95572m;

    /* renamed from: n, reason: collision with root package name */
    public int f95573n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public String f95574o;

    /* renamed from: p, reason: collision with root package name */
    public int f95575p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public String f95576q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public String f95577r;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NumberFormat f95561b = NumberFormat.getInstance(new Locale("ru", "RU"));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final v f95564e = new v(new com.avito.android.credits.utils.c());

    public l(@Y61.k CompositeBrokerCalculator compositeBrokerCalculator, @Y61.l String str, @Y61.k a aVar) {
        Float fX02;
        this.f95560a = compositeBrokerCalculator;
        this.f95562c = compositeBrokerCalculator.getTitle();
        this.f95563d = compositeBrokerCalculator.getSubtitle();
        Integer maxTerm = compositeBrokerCalculator.getMaxTerm();
        int iIntValue = maxTerm != null ? maxTerm.intValue() : 60;
        this.f95565f = compositeBrokerCalculator.getTerm();
        int i12 = iIntValue / 12;
        int[] iArr = new int[i12];
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i13 + 1;
            iArr[i13] = i14 * 12;
            i13 = i14;
        }
        this.f95566g = iArr;
        this.f95567h = this.f95560a.getButtonTitle();
        this.f95568i = this.f95560a.getAgreementInfo();
        if (str != null) {
            String strReplace = str.replace(',', '.');
            StringBuilder sb2 = new StringBuilder();
            int length = strReplace.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = strReplace.charAt(i15);
                if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == '-') {
                    sb2.append(cCharAt);
                }
            }
            fX02 = C43066x.x0(sb2.toString());
        } else {
            fX02 = null;
        }
        int iB2 = fX02 != null ? kotlin.math.b.b(fX02.floatValue()) : 0;
        this.f95569j = iB2;
        this.f95570k = this.f95560a.getMinCreditAmount();
        int iMin = Math.min(iB2, this.f95560a.getMaxCreditAmount());
        this.f95571l = iMin;
        this.f95572m = aVar.b(this.f95561b.format(Integer.valueOf(iMin)));
        this.f95573n = iB2;
        this.f95574o = "";
        this.f95576q = "";
        this.f95577r = "";
        a();
    }

    public final void a() {
        int i12 = this.f95573n;
        v vVar = this.f95564e;
        vVar.getClass();
        int iMin = Math.min(Math.max(i12, this.f95570k), this.f95571l);
        Integer numValueOf = Integer.valueOf(iMin);
        NumberFormat numberFormat = this.f95561b;
        this.f95574o = numberFormat.format(numValueOf);
        this.f95573n = iMin;
        int i13 = this.f95569j - iMin;
        if (i13 < 0) {
            i13 = 0;
        }
        this.f95576q = numberFormat.format(Integer.valueOf(i13));
        this.f95575p = i13;
        Integer numA = vVar.f129056a.a(this.f95560a.getCreditRate(), this.f95573n, this.f95565f);
        this.f95577r = numberFormat.format(Integer.valueOf(numA != null ? numA.intValue() : 0));
    }
}

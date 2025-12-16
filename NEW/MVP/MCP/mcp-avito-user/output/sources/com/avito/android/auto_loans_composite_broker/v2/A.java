package com.avito.android.auto_loans_composite_broker.v2;

import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2;
import com.avito.android.remote.parse.adapter.CompositeBrokerEventParams;
import com.avito.android.remote.parse.adapter.DeepLinkInfo;
import com.avito.android.remote.parse.adapter.FaqItem;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CompositeBrokerCalculatorV2Aggregator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/A;", "", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CompositeBrokerCalculatorV2 f95585a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28712a f95586b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f95588d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f95589e;

    /* renamed from: g, reason: collision with root package name */
    public int f95591g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f95592h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f95593i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f95594j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final DeepLinkInfo f95595k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final AttributedText f95596l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AttributedText f95597m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final List<UniversalImage> f95598n;

    /* renamed from: o, reason: collision with root package name */
    public final int f95599o;

    /* renamed from: p, reason: collision with root package name */
    public final int f95600p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final String f95601q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final String f95602r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f95603s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final String f95604t;

    /* renamed from: u, reason: collision with root package name */
    public int f95605u;

    /* renamed from: v, reason: collision with root package name */
    public int f95606v;

    /* renamed from: w, reason: collision with root package name */
    public int f95607w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public String f95608x;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NumberFormat f95587c = NumberFormat.getInstance(new Locale("ru", "RU"));

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.v f95590f = new com.avito.android.credits.v(new com.avito.android.credits.utils.c());

    public A(@Y61.k CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2, @Y61.l String str, @Y61.k InterfaceC28712a interfaceC28712a) {
        Float fX02;
        this.f95585a = compositeBrokerCalculatorV2;
        this.f95586b = interfaceC28712a;
        this.f95588d = compositeBrokerCalculatorV2.getTitle();
        this.f95589e = compositeBrokerCalculatorV2.getSubtitle();
        int iJ2 = compositeBrokerCalculatorV2.getMaxTerm();
        this.f95591g = compositeBrokerCalculatorV2.getTerm();
        int i12 = iJ2 / 12;
        int[] iArr = new int[i12];
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i13 + 1;
            iArr[i13] = i14 * 12;
            i13 = i14;
        }
        if (i12 != 0) {
            int[] iArr2 = new int[i12];
            int i15 = i12 - 1;
            if (i15 >= 0) {
                int i16 = 0;
                while (true) {
                    iArr2[i15 - i16] = iArr[i16];
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            iArr = iArr2;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(new Me.s(i17, this.f95586b.a(i17 / 12), i17));
        }
        this.f95592h = arrayList;
        this.f95593i = this.f95585a.getMonthlyPaymentText();
        this.f95594j = this.f95585a.getButtonTitle();
        this.f95595k = this.f95585a.getDeepLink();
        this.f95596l = this.f95585a.getAgreementInfo();
        FaqItem faqItemH = this.f95585a.getFaq();
        this.f95597m = faqItemH != null ? faqItemH.getAttributedTitle() : null;
        this.f95598n = this.f95585a.getUniversalIcons();
        if (str != null) {
            String strReplace = str.replace(',', '.');
            StringBuilder sb2 = new StringBuilder();
            int length = strReplace.length();
            for (int i18 = 0; i18 < length; i18++) {
                char cCharAt = strReplace.charAt(i18);
                if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == '-') {
                    sb2.append(cCharAt);
                }
            }
            fX02 = C43066x.x0(sb2.toString());
        } else {
            fX02 = null;
        }
        int iB2 = fX02 != null ? kotlin.math.b.b(fX02.floatValue()) : 0;
        int iK2 = this.f95585a.getMinCreditAmount();
        this.f95599o = iK2;
        int i19 = this.f95585a.getMaxCreditAmount();
        this.f95600p = i19;
        this.f95601q = this.f95587c.format(Integer.valueOf(iK2));
        this.f95602r = this.f95587c.format(Integer.valueOf(i19));
        CompositeBrokerEventParams renderEventParams = this.f95585a.getRenderEventParams();
        this.f95603s = renderEventParams != null ? renderEventParams.getFromPage() : null;
        CompositeBrokerEventParams clickEventParams = this.f95585a.getClickEventParams();
        this.f95604t = clickEventParams != null ? clickEventParams.getFromPage() : null;
        this.f95605u = iB2;
        this.f95590f.getClass();
        this.f95606v = Math.min(Math.max(iB2, iK2), i19);
        this.f95608x = "";
        b();
    }

    @Y61.k
    public final Me.s a() {
        Iterator it = this.f95592h.iterator();
        while (it.hasNext()) {
            Me.s sVar = (Me.s) it.next();
            if (sVar.f10969d == this.f95591g) {
                return sVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void b() {
        Integer numA = this.f95590f.f129056a.a(this.f95585a.getCreditRate(), this.f95606v, this.f95591g);
        int iIntValue = numA != null ? numA.intValue() : 0;
        this.f95608x = this.f95587c.format(Integer.valueOf(iIntValue));
        this.f95607w = iIntValue;
    }

    public final void c(int i12, boolean z12) {
        int i13 = this.f95600p;
        int i14 = this.f95599o;
        if (z12) {
            double dDoubleValue = (i12 < 700000 ? 5000 : (700000 > i12 || i12 >= 1500001) ? Double.valueOf(100000.0d) : 10000).doubleValue();
            i12 = kotlin.ranges.s.g((int) (Math.ceil(i12 / dDoubleValue) * dDoubleValue), i14, i13);
        }
        this.f95605u = i12;
        this.f95590f.getClass();
        this.f95606v = Math.min(Math.max(i12, i14), i13);
    }
}

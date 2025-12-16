package ru.avito.component.payments.method;

import com.avito.android.R;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import hw.InterfaceC41178c;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentLabel.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/payments/method/PaymentLabel;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PaymentLabel {

    /* renamed from: c, reason: collision with root package name */
    public static final PaymentLabel f430368c;

    /* renamed from: d, reason: collision with root package name */
    public static final PaymentLabel f430369d;

    /* renamed from: e, reason: collision with root package name */
    public static final PaymentLabel f430370e;

    /* renamed from: f, reason: collision with root package name */
    public static final PaymentLabel f430371f;

    /* renamed from: g, reason: collision with root package name */
    public static final PaymentLabel f430372g;

    /* renamed from: h, reason: collision with root package name */
    public static final PaymentLabel f430373h;

    /* renamed from: i, reason: collision with root package name */
    public static final PaymentLabel f430374i;

    /* renamed from: j, reason: collision with root package name */
    public static final PaymentLabel f430375j;

    /* renamed from: k, reason: collision with root package name */
    public static final PaymentLabel f430376k;

    /* renamed from: l, reason: collision with root package name */
    public static final PaymentLabel f430377l;

    /* renamed from: m, reason: collision with root package name */
    public static final PaymentLabel f430378m;

    /* renamed from: n, reason: collision with root package name */
    public static final PaymentLabel f430379n;

    /* renamed from: o, reason: collision with root package name */
    public static final PaymentLabel f430380o;

    /* renamed from: p, reason: collision with root package name */
    public static final PaymentLabel f430381p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ PaymentLabel[] f430382q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f430383r;

    /* renamed from: b, reason: collision with root package name */
    public final int f430384b;

    static {
        PaymentLabel paymentLabel = new PaymentLabel("MASTERCARD", 0, R.drawable.ic_payment_mastercard);
        f430368c = paymentLabel;
        PaymentLabel paymentLabel2 = new PaymentLabel("VISA", 1, R.drawable.ic_payment_visa);
        f430369d = paymentLabel2;
        PaymentLabel paymentLabel3 = new PaymentLabel("CARD", 2, R.drawable.ic_payment_card);
        f430370e = paymentLabel3;
        PaymentLabel paymentLabel4 = new PaymentLabel("CASH", 3, R.drawable.product_specific_ic_cash);
        f430371f = paymentLabel4;
        PaymentLabel paymentLabel5 = new PaymentLabel("CREDIT", 4, R.drawable.product_specific_ic_credit);
        f430372g = paymentLabel5;
        PaymentLabel paymentLabel6 = new PaymentLabel("SBERBANK", 5, R.drawable.ic_payment_sberbank);
        f430373h = paymentLabel6;
        PaymentLabel paymentLabel7 = new PaymentLabel("SBERBANK_APP", 6, R.drawable.ic_payment_sberbank);
        f430374i = paymentLabel7;
        PaymentLabel paymentLabel8 = new PaymentLabel("SMS", 7, R.drawable.ic_payment_sms);
        f430375j = paymentLabel8;
        PaymentLabel paymentLabel9 = new PaymentLabel("WALLET", 8, R.drawable.ic_payment_wallet);
        f430376k = paymentLabel9;
        PaymentLabel paymentLabel10 = new PaymentLabel("MIR", 9, R.drawable.ic_payment_mir);
        f430377l = paymentLabel10;
        PaymentLabel paymentLabel11 = new PaymentLabel("YANDEX_MONEY", 10, R.drawable.ic_payment_yandex_money);
        f430378m = paymentLabel11;
        PaymentLabel paymentLabel12 = new PaymentLabel("YOO_MONEY", 11, R.drawable.ic_payment_yoo_money);
        f430379n = paymentLabel12;
        PaymentLabel paymentLabel13 = new PaymentLabel("QIWI_WALLET", 12, R.drawable.ic_payment_qiwi);
        f430380o = paymentLabel13;
        PaymentLabel paymentLabel14 = new PaymentLabel(GrsBaseInfo.CountryCodeSource.UNKNOWN, 13, R.color.legacy_transparent_black);
        f430381p = paymentLabel14;
        PaymentLabel[] paymentLabelArr = {paymentLabel, paymentLabel2, paymentLabel3, paymentLabel4, paymentLabel5, paymentLabel6, paymentLabel7, paymentLabel8, paymentLabel9, paymentLabel10, paymentLabel11, paymentLabel12, paymentLabel13, paymentLabel14};
        f430382q = paymentLabelArr;
        f430383r = kotlin.enums.c.a(paymentLabelArr);
    }

    public PaymentLabel(@InterfaceC42165v String str, int i12, int i13) {
        this.f430384b = i13;
    }

    public static PaymentLabel valueOf(String str) {
        return (PaymentLabel) Enum.valueOf(PaymentLabel.class, str);
    }

    public static PaymentLabel[] values() {
        return (PaymentLabel[]) f430382q.clone();
    }
}

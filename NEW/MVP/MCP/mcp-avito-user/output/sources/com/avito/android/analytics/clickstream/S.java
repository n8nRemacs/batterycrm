package com.avito.android.analytics.clickstream;

import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: EventValidator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/clickstream/S;", "Lcom/avito/android/analytics/clickstream/X;", "<init>", "()V", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class S extends X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43059p f89767a = new C43059p("[^a-zA-Z0-9]+");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f89768b = C42745f0.U("access", "bank", PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD, "cardholder", "cred", "cvc", "cvv", "debit", "e-mail", "email", "fingerprint", "fp", "mail", "pass", "password", "payment", "pwd", "secret", "thru", "token", "valid");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<String> f89769c = C42745f0.U("mic_access", "bank_id_string", "bank_name", "card_model_id", "payment_method_id", "payment_screen", "preselected_payment_method", "bank_search_state", "save_card_enabled", "payment_method", "payment_scenario");

    @Override // com.avito.android.analytics.clickstream.X
    public final void a(@Y61.k com.avito.android.analytics.provider.clickstream.a aVar) {
        Object next;
        String strA = null;
        if (!(aVar instanceof cc.e)) {
            Iterator<Map.Entry<String, Object>> it = aVar.getParams().entrySet().iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String key = it.next().getKey();
                if (!this.f89769c.contains(key)) {
                    for (String str : this.f89767a.h(key)) {
                        Iterator<T> it2 = this.f89768b.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (C43066x.C(str, (String) next, true)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        String str2 = (String) next;
                        if (str2 != null) {
                            strA = androidx.camera.core.Q.a("Parameter ", key, " looks suspicious because of ", str2, ". Check event https://cf.avito.ru/x/KRfKBQ and mark with HasSensitiveData");
                            break loop0;
                        }
                    }
                }
            }
        }
        if (strA == null) {
            return;
        }
        throw new Y("Invalid event: id=" + aVar.getF83080b() + ' ' + aVar.getParams() + " \nReason: " + strA + " \nYou can disable this validation by clickstream_strict_mode feature toggle.");
    }
}

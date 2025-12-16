package com.avito.android.wallet.page.history.details.mvi.component;

import SO0.c;
import SO0.d;
import UO0.b;
import android.app.Application;
import com.avito.android.R;
import com.avito.android.wallet.page.history.remote.dto.OperationType;
import com.avito.android.wallet.page.history.remote.dto.PaymentOrderStatus;
import com.avito.android.wallet.page.history.remote.dto.PaymentRefundStatus;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentHistoryDetailsViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/component/r;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f327923a;

    /* compiled from: PaymentHistoryDetailsViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327924a;

        static {
            int[] iArr = new int[PaymentOrderStatus.values().length];
            try {
                iArr[PaymentOrderStatus.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentOrderStatus.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentOrderStatus.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentOrderStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f327924a = iArr;
        }
    }

    @Inject
    public r(@Y61.k Application application) {
        this.f327923a = application;
    }

    @Y61.k
    public final SO0.c a(@Y61.k SO0.c cVar) {
        SO0.d c1014d;
        SO0.d bVar;
        int i12;
        String string;
        String str;
        String string2;
        c.b bVar2 = cVar.f14966b;
        if (bVar2 instanceof c.b.C1013c) {
            bVar = d.c.f14980a;
        } else {
            if (!(bVar2 instanceof c.b.C1012b)) {
                boolean z12 = bVar2 instanceof c.b.a;
                Application application = this.f327923a;
                if (z12) {
                    c.b.a aVar = (c.b.a) bVar2;
                    String amount = aVar.f14968a.getAmount();
                    UO0.a aVar2 = aVar.f14968a;
                    String paymentMethod = aVar2.getPaymentMethod();
                    kotlin.collections.builders.b bVarT = C42745f0.t();
                    String string3 = application.getString(R.string.payment_status);
                    int i13 = a.f327924a[aVar2.getStatus().ordinal()];
                    if (i13 == 1) {
                        string = application.getString(R.string.payment_order_status_done);
                    } else if (i13 == 2) {
                        string = application.getString(R.string.payment_order_status_in_progress);
                    } else {
                        if (i13 != 3 && i13 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = application.getString(R.string.payment_order_status_rejected);
                    }
                    bVarT.add(new TO0.a(string3, string, null, 4, null));
                    bVarT.add(new TO0.a(application.getString(R.string.payment_date), aVar2.getDate(), null, 4, null));
                    UO0.b target = aVar2.getTarget();
                    if (target instanceof b.a) {
                        b.a aVar3 = (b.a) target;
                        bVarT.add(new TO0.a(application.getString(R.string.payment_advert), application.getString(R.string.payment_number_template, aVar3.getId()), aVar3.getUrl()));
                        bVarT.add(new TO0.a(application.getString(R.string.payment_id), application.getString(R.string.payment_number_template, aVar2.getId()), null, 4, null));
                        bVarT.add(new TO0.a(application.getString(R.string.payment_operation), aVar3.getService(), null, 4, null));
                    } else if (target instanceof b.C1122b) {
                        bVarT.add(new TO0.a(application.getString(R.string.payment_operation), application.getString(R.string.payment_number_template, aVar2.getId()), null, 4, null));
                        bVarT.add(new TO0.a(application.getString(R.string.payment_from), ((b.C1122b) target).getTitle(), null, 4, null));
                    }
                    kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
                    UO0.c receipt = aVar2.getReceipt();
                    TO0.b bVar3 = receipt == null ? null : new TO0.b(application.getString(R.string.payment_look_at_receipt), receipt);
                    String amount2 = aVar2.getAmount();
                    String refundSubtitle = aVar2.getRefundSubtitle();
                    if (refundSubtitle == null) {
                        refundSubtitle = "";
                    }
                    TO0.c cVar2 = new TO0.c(amount2, refundSubtitle, aVar2.getRefundStatus() == PaymentRefundStatus.AVAILABLE);
                    PaymentOrderStatus status = aVar2.getStatus();
                    OperationType operationType = aVar2.getOperationType();
                    if (status == PaymentOrderStatus.ACTIVE && operationType == OperationType.REFUNDED) {
                        string2 = application.getString(R.string.payment_details_receipt_text);
                    } else if (status == PaymentOrderStatus.DONE && operationType == OperationType.REFUNDED) {
                        string2 = application.getString(R.string.payment_details_refund_text);
                    } else {
                        str = "";
                        c1014d = new d.a(amount, paymentMethod, bVarP, bVar3, cVar2, str);
                    }
                    str = string2;
                    c1014d = new d.a(amount, paymentMethod, bVarP, bVar3, cVar2, str);
                } else {
                    if (!(bVar2 instanceof c.b.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.b.d dVar = (c.b.d) bVar2;
                    String str2 = dVar.f14971a;
                    StringBuilder sb2 = new StringBuilder();
                    int length = str2.length();
                    for (int i14 = 0; i14 < length; i14++) {
                        char cCharAt = str2.charAt(i14);
                        if (Character.isDigit(cCharAt)) {
                            sb2.append(cCharAt);
                        }
                    }
                    c1014d = new d.C1014d(application.getString(R.string.confirm_refund_title, sb2.toString()), dVar.f14972b);
                }
                bVar = c1014d;
                i12 = 1;
                return SO0.c.a(cVar, null, bVar, i12);
            }
            bVar = new d.b(((c.b.C1012b) bVar2).f14969a);
        }
        i12 = 1;
        return SO0.c.a(cVar, null, bVar, i12);
    }
}

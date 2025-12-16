package com.avito.android.payment.form.status;

import com.avito.android.payment.form.status.A;
import com.avito.android.payment.items.text_item.c;
import com.avito.android.remote.model.payment.status.form.PaymentStatusFormResult;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PaymentStatusFormItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/status/i;", "Lcom/avito/android/payment/form/status/h;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f214419a;

    public i(@Y61.k com.avito.android.util.text.a aVar) {
        this.f214419a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence] */
    @Override // com.avito.android.payment.form.status.h
    @Y61.k
    public final A.a a(@Y61.k PaymentStatusFormResult.StatusForm statusForm) {
        com.avito.android.util.text.a aVar;
        String str;
        ArrayList arrayList = new ArrayList();
        List<AttributedText> instructions = statusForm.getInstructions();
        ArrayList arrayList2 = new ArrayList();
        Iterator<AttributedText> it = instructions.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            aVar = this.f214419a;
            str = "";
            if (!zHasNext) {
                break;
            }
            ?? B12 = aVar.b(it.next());
            if (B12 != 0) {
                str = B12;
            }
            arrayList2.add(new c.b("paragraph", str, null));
        }
        arrayList.addAll(arrayList2);
        AttributedText disclaimer = statusForm.getDisclaimer();
        ArrayList arrayList3 = new ArrayList();
        CharSequence charSequenceB = aVar.b(disclaimer);
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        arrayList3.add(new c.a(ServiceTransportationWidget.DisclaimerField.TYPE, charSequenceB, null));
        arrayList.addAll(arrayList3);
        String title = statusForm.getAction().getTitle();
        arrayList.addAll(Collections.singletonList(new com.avito.android.payment.items.submit_button_item.c("submit_button", title != null ? title : "")));
        return new A.a(statusForm.getTitle(), arrayList);
    }
}

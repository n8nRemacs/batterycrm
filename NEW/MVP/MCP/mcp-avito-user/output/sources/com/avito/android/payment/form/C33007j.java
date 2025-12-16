package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.form.P;
import com.avito.android.payment.items.text_item.c;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import ru.avito.component.info_label.InfoLevel;

/* compiled from: PaymentGenericFormItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/j;", "Lcom/avito/android/payment/form/i;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.form.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33007j implements InterfaceC33006i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33000c f214362a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f214363b;

    public C33007j(@Y61.k InterfaceC33000c interfaceC33000c, @Y61.k com.avito.android.util.text.a aVar) {
        this.f214362a = interfaceC33000c;
        this.f214363b = aVar;
    }

    @Override // com.avito.android.payment.form.InterfaceC33006i
    @Y61.k
    public final P.a a(@Y61.k C32998a c32998a, @Y61.k ParametersTree parametersTree, boolean z12) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequenceB = this.f214363b.b(c32998a.f214349b);
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        arrayList.addAll(Collections.singletonList(new c.b("header", charSequenceB, null)));
        ArrayList arrayList2 = new ArrayList();
        int size = parametersTree.f213984b.size() - 1;
        if (size >= 0) {
            int i12 = 0;
            while (true) {
                ParameterSlot item = parametersTree.getItem(i12);
                if (item instanceof PhoneParameter) {
                    PhoneParameter phoneParameter = (PhoneParameter) item;
                    ArrayList arrayList3 = new ArrayList();
                    String id2 = phoneParameter.getId();
                    String title = phoneParameter.getTitle();
                    String value = phoneParameter.getValue();
                    if (value == null) {
                        value = "";
                    }
                    arrayList3.add(new com.avito.android.payment.items.phone_item.g(id2, title, value, phoneParameter.hasError()));
                    AttributedText errorMessage = phoneParameter.getErrorMessage();
                    if (errorMessage != null) {
                        String str = phoneParameter.getId() + " info label";
                        String text = errorMessage.getText();
                        InfoLevel infoLevel = InfoLevel.f430349b;
                        arrayList3.add(new ru.avito.component.info_label.g(str, text));
                    }
                    arrayList2.addAll(arrayList3);
                } else {
                    arrayList2.addAll(this.f214362a.a(item));
                }
                if (i12 == size) {
                    break;
                }
                i12++;
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(Collections.singletonList(new com.avito.android.payment.items.submit_button_item.c("id", c32998a.f214350c)));
        return new P.a(c32998a.f214348a, arrayList, z12);
    }
}

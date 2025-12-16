package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FormContentItemValue.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/d;", "", "Lcom/avito/android/mortgage/api/model/items/form/a;", "Lcom/avito/android/mortgage/api/model/items/form/b;", "LLZ/b;", "Lcom/avito/android/mortgage/api/model/items/form/c;", "Lcom/avito/android/mortgage/api/model/items/form/InputFormContentItemValue;", "Lcom/avito/android/mortgage/api/model/items/form/e;", "Lcom/avito/android/mortgage/api/model/items/form/SuggestFormContentItemValue;", "Lcom/avito/android/mortgage/api/model/items/form/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: FormContentItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static int a(@k d dVar) {
            return (dVar.isHidden() || dVar.getError() == null) ? 0 : 1;
        }
    }

    @k
    d G2(@l PrintableText printableText);

    @k
    d H2(boolean z12);

    @k
    List<String> I2();

    boolean J2();

    @k
    List<List<String>> L2();

    @k
    d M2(boolean z12);

    @l
    String N2();

    int P2();

    @k
    d Q2(@l String str);

    boolean S2();

    boolean U2();

    @l
    String getContext();

    @l
    PrintableText getError();

    @k
    String getId();

    @k
    String getName();

    boolean isEmpty();

    boolean isHidden();

    boolean isValid();
}

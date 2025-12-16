package com.avito.android.rating_form.item.multiLineInput;

import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiLineInputItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/multiLineInput/j;", "LTV0/e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface j extends TV0.e {

    /* compiled from: MultiLineInputItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void F9(@Y61.k RatingFormField.DataType dataType);

    void Jo(int i12);

    void VG(@l String str);

    void X0(@l Boolean bool);

    void Y1(@l AttributedText attributedText);

    void f(@l String str);

    void m(@l String str);

    void o(@l String str);

    void r0(@Y61.k Y41.l<? super String, G0> lVar);

    void s0(@l PrintableText printableText);

    void setTitle(@l String str);
}

package com.avito.android.rating_form.item.chips;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChipsItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/chips/h;", "LTV0/e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface h extends TV0.e {

    /* compiled from: ChipsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void X0(@l Boolean bool);

    void f(@l String str);

    void hX(@k List<RatingFormField.Value> list);

    void iv(@k List<RatingFormField.Value> list);

    void l0(@k Y41.l<? super List<? extends ParcelableEntity<String>>, G0> lVar);

    void o(@l String str);

    void s0(@l PrintableText printableText);

    void sV(boolean z12);

    void setTitle(@l String str);
}

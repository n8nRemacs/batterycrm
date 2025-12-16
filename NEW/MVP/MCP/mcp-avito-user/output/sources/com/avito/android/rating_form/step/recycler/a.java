package com.avito.android.rating_form.step.recycler;

import Y61.l;
import com.avito.android.rating_form.item.checkBox.CheckableGroupItem;
import com.avito.android.rating_form.item.file_picker.g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormContentComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/recycler/a;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.recycler.data_aware.b {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        if ((aVar instanceof com.avito.android.rating_form.item.header.a) && (aVar2 instanceof com.avito.android.rating_form.item.header.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.rating_form.item.description.a) && (aVar2 instanceof com.avito.android.rating_form.item.description.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.rating_form.item.singleLineInput.a) && (aVar2 instanceof com.avito.android.rating_form.item.singleLineInput.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.rating_form.item.multiLineInput.a) && (aVar2 instanceof com.avito.android.rating_form.item.multiLineInput.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.rating_form.item.select.a) && (aVar2 instanceof com.avito.android.rating_form.item.select.a)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof CheckableGroupItem) && (aVar2 instanceof CheckableGroupItem)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.rating_form.item.photo_picker.d) && (aVar2 instanceof com.avito.android.rating_form.item.photo_picker.d)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof g) && (aVar2 instanceof g)) {
            return L.f(aVar, aVar2);
        }
        if ((aVar instanceof com.avito.android.rating_form.item.chips.a) && (aVar2 instanceof com.avito.android.rating_form.item.chips.a)) {
            return L.f(aVar, aVar2);
        }
        return false;
    }
}

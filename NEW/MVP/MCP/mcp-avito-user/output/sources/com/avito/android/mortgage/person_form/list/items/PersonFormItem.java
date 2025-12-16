package com.avito.android.mortgage.person_form.list.items;

import Y61.k;
import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;

/* compiled from: PersonFormItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PersonFormItem extends ParcelableItem {

    /* compiled from: PersonFormItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    PersonFormItem N();

    boolean getEnabled();

    boolean getHasError();
}

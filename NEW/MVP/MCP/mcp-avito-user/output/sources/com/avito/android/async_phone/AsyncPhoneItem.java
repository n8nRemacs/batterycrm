package com.avito.android.async_phone;

import com.avito.conveyor_item.ParcelableItem;
import kotlin.Metadata;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AsyncPhoneItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/AsyncPhoneItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AsyncPhoneItem extends ParcelableItem {

    /* compiled from: AsyncPhoneItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    PhoneLoadingState getPhoneLoadingState();

    void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState);
}

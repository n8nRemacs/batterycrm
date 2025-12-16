package com.avito.android.advertising;

import kotlin.Metadata;

/* compiled from: HideableAdItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/i;", "Lcom/avito/conveyor_item/a;", "_avito_advertising_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface i extends com.avito.conveyor_item.a {

    /* compiled from: HideableAdItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    i copyWithIsHidden(boolean z12);

    @Y61.l
    Integer getHideId();

    boolean isHidden();

    void setHidden(boolean z12);
}

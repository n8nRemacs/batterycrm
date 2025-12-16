package com.avito.android.remote.model.advertising;

import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;

/* compiled from: AdNetworkBannerItem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/advertising/AdNetworkBannerItem;", "T", "Landroid/os/Parcelable;", "alid", "", "getAlid", "()Ljava/lang/String;", "bannerCode", "getBannerCode", "blockId", "getBlockId", "()Ljava/lang/Object;", "categoryId", "getCategoryId", SearchParamsConverterKt.LOCATION_ID, "getLocationId", "microCategoryId", "getMicroCategoryId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AdNetworkBannerItem<T> extends Parcelable {
    @l
    String getAlid();

    @l
    String getBannerCode();

    T getBlockId();

    @l
    String getCategoryId();

    @l
    String getLocationId();

    @l
    String getMicroCategoryId();
}

package com.avito.android.remote.model.credit_broker;

import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.parse.adapter.CompositeBrokerEventParams;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutoLoansData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/AdvertDetailsAutoLoansData;", "Landroid/os/Parcelable;", "clickEventParams", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "getClickEventParams", "()Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "fallbackIcons", "", "Lcom/avito/android/remote/model/Image;", "getFallbackIcons", "()Ljava/util/List;", "renderEventParams", "getRenderEventParams", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "getTitle", "()Ljava/lang/String;", "universalIcons", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalIcons", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AdvertDetailsAutoLoansData extends Parcelable {
    @l
    CompositeBrokerEventParams getClickEventParams();

    @l
    List<Image> getFallbackIcons();

    @l
    CompositeBrokerEventParams getRenderEventParams();

    @l
    AttributedText getSubtitle();

    @l
    String getTitle();

    @l
    List<UniversalImage> getUniversalIcons();
}

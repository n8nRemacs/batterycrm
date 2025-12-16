package com.avito.android.remote.model.category_parameters;

import Y61.l;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;

/* compiled from: SelectDisplayingOptions.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0014\u0010 \u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectDisplayingOptions;", "Landroid/os/Parcelable;", "customPaddings", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "getCustomPaddings", "()Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "hideTitle", "", "getHideTitle", "()Ljava/lang/Boolean;", "imageParams", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "getImageParams", "()Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "sortDirection", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "getSortDirection", "()Lcom/avito/android/remote/model/category_parameters/SortDirection;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "getStyle", "()Ljava/lang/String;", "tipIconParameters", "Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "getTipIconParameters", "()Lcom/avito/android/remote/model/category_parameters/TipIconParameters;", "titlePattern", "getTitlePattern", "type", "getType", "typoCorrectionEnabled", "getTypoCorrectionEnabled", "withImages", "getWithImages", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SelectDisplayingOptions extends Parcelable {
    @l
    CustomPaddings getCustomPaddings();

    @l
    Boolean getHideTitle();

    @l
    DisplayingImageParams getImageParams();

    @l
    SortDirection getSortDirection();

    @l
    String getStyle();

    @l
    TipIconParameters getTipIconParameters();

    @l
    String getTitlePattern();

    @l
    String getType();

    @l
    Boolean getTypoCorrectionEnabled();

    @l
    Boolean getWithImages();
}

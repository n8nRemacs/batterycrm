package com.avito.android.remote.model.category_parameters;

import Y61.l;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiselectParameter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectDisplay;", "", "color", "Lcom/avito/android/remote/model/Color;", "getColor", "()Lcom/avito/android/remote/model/Color;", "gradientColors", "", "Lcom/avito/android/remote/model/UniversalColor;", "getGradientColors", "()Ljava/util/List;", "icon", "", "getIcon", "()Ljava/lang/String;", "link", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "getLink", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Display$Link;", "multiThemeImage", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImage", "()Lcom/avito/android/remote/model/UniversalImage;", "sortParam", "getSortParam", "subtitle", "getSubtitle", "title", "getTitle", "type", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "getType", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Type;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MultiselectDisplay {
    @l
    Color getColor();

    @l
    List<UniversalColor> getGradientColors();

    @l
    String getIcon();

    @l
    MultiselectParameter.Value.Display.Link getLink();

    @l
    UniversalImage getMultiThemeImage();

    @l
    String getSortParam();

    @l
    String getSubtitle();

    @l
    String getTitle();

    @l
    MultiselectParameter.Type getType();
}

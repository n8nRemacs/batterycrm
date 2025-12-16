package com.avito.android.remote.model.category_parameters;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiselectParameter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectDisplaying;", "Lcom/avito/android/remote/model/category_parameters/SelectDisplayingOptions;", "areGroupsCollapsible", "", "getAreGroupsCollapsible", "()Ljava/lang/Boolean;", "confirmButtonTitle", "", "getConfirmButtonTitle", "()Ljava/lang/String;", "dialogDisplaying", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "getDialogDisplaying", "()Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "groups", "", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$Group;", "getGroups", "()Ljava/util/List;", "hideShowMore", "getHideShowMore", "keepSelectedChip", "getKeepSelectedChip", ChannelContext.Item.PLACEHOLDER, "getPlaceholder", "titleTipAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "getTitleTipAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "topValues", "getTopValues", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MultiselectDisplaying extends SelectDisplayingOptions {
    @l
    Boolean getAreGroupsCollapsible();

    @l
    String getConfirmButtonTitle();

    @l
    DialogDisplaying getDialogDisplaying();

    @l
    List<MultiselectParameter.Displaying.Group> getGroups();

    @l
    Boolean getHideShowMore();

    @l
    Boolean getKeepSelectedChip();

    @l
    String getPlaceholder();

    @l
    DeepLink getTitleTipAction();

    @l
    List<String> getTopValues();
}

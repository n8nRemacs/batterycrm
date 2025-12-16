package com.avito.android.category.element;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: CategoryWidgetElement.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/category/element/CategoryItemAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/category/element/ActionDisplayParams;", "displayParams", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/category/element/ActionDisplayParams;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/category/element/ActionDisplayParams;", "c", "()Lcom/avito/android/category/element/ActionDisplayParams;", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CategoryItemAction implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CategoryItemAction> CREATOR = new a();

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.l
    private final DeepLink deepLink;

    @com.google.gson.annotations.c("displayParams")
    @Y61.l
    private final ActionDisplayParams displayParams;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: CategoryWidgetElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryItemAction> {
        @Override // android.os.Parcelable.Creator
        public final CategoryItemAction createFromParcel(Parcel parcel) {
            return new CategoryItemAction(parcel.readString(), (DeepLink) parcel.readParcelable(CategoryItemAction.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionDisplayParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryItemAction[] newArray(int i12) {
            return new CategoryItemAction[i12];
        }
    }

    public CategoryItemAction(@Y61.l String str, @Y61.l DeepLink deepLink, @Y61.l ActionDisplayParams actionDisplayParams) {
        this.title = str;
        this.deepLink = deepLink;
        this.displayParams = actionDisplayParams;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final ActionDisplayParams getDisplayParams() {
        return this.displayParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deepLink, i12);
        ActionDisplayParams actionDisplayParams = this.displayParams;
        if (actionDisplayParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionDisplayParams.writeToParcel(parcel, i12);
        }
    }
}

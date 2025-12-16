package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.extended.adverts.ExtendedProfileSettingsAdvertsResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ExtendedProfileAdvertModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001'Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001c¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel;", "Lcom/avito/android/remote/model/extended/adverts/ExtendedProfileSettingsAdvertsResult$Item;", "id", "", "title", "", "favoritesCount", "viewsCount", "price", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "description", "startTime", "finishTime", "expirationPercent", "", "image", "Lcom/avito/android/remote/model/Image;", "status", "Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel$Status;", "(JLjava/lang/String;JJLjava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;JJFLcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel$Status;)V", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getDescription", "()Ljava/lang/String;", "getExpirationPercent", "()F", "getFavoritesCount", "()J", "getFinishTime", "getId", "getImage", "()Lcom/avito/android/remote/model/Image;", "getPrice", "getStartTime", "getStatus", "()Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel$Status;", "getTitle", "getViewsCount", "Status", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileAdvertModel implements ExtendedProfileSettingsAdvertsResult.Item {

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("description")
    @k
    private final String description;

    @c("expirationPercent")
    private final float expirationPercent;

    @c("favorites")
    private final long favoritesCount;

    @c("finishTime")
    private final long finishTime;

    @c("id")
    private final long id;

    @c("imageList")
    @l
    private final Image image;

    @c("price")
    @k
    private final String price;

    @c("startTime")
    private final long startTime;

    @c("status")
    @k
    private final Status status;

    @c("title")
    @k
    private final String title;

    @c("views")
    private final long viewsCount;

    /* compiled from: ExtendedProfileAdvertModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/extended/ExtendedProfileAdvertModel$Status;", "", "id", "", "description", "", BeduinCartItemModel.DISABLED_STRING, "", "(ILjava/lang/String;Ljava/lang/Boolean;)V", "getDescription", "()Ljava/lang/String;", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()I", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("description")
        @l
        private final String description;

        @c(BeduinCartItemModel.DISABLED_STRING)
        @l
        private final Boolean disabled;

        @c("id")
        private final int id;

        public Status(int i12, @l String str, @l Boolean bool) {
            this.id = i12;
            this.description = str;
            this.disabled = bool;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final Boolean getDisabled() {
            return this.disabled;
        }

        public final int getId() {
            return this.id;
        }
    }

    public ExtendedProfileAdvertModel(long j12, @k String str, long j13, long j14, @k String str2, @k DeepLink deepLink, @k String str3, long j15, long j16, float f12, @l Image image, @k Status status) {
        this.id = j12;
        this.title = str;
        this.favoritesCount = j13;
        this.viewsCount = j14;
        this.price = str2;
        this.deepLink = deepLink;
        this.description = str3;
        this.startTime = j15;
        this.finishTime = j16;
        this.expirationPercent = f12;
        this.image = image;
        this.status = status;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final float getExpirationPercent() {
        return this.expirationPercent;
    }

    public final long getFavoritesCount() {
        return this.favoritesCount;
    }

    public final long getFinishTime() {
        return this.finishTime;
    }

    public final long getId() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @k
    public final Status getStatus() {
        return this.status;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final long getViewsCount() {
        return this.viewsCount;
    }
}

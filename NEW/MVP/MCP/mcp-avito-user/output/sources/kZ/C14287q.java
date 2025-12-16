package KZ;

import com.avito.android.mortgage.api.model.ActionButton;
import com.avito.android.mortgage.api.model.items.application.BannerAnalyticsType;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: ApplicationCtaBannerItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKZ/q;", "LKZ/p;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "title", "description", "Lcom/avito/android/mortgage/api/model/ActionButton;", "action", "Lcom/avito/android/mortgage/api/model/items/application/BannerAnalyticsType;", "analyticsType", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/ActionButton;Lcom/avito/android/mortgage/api/model/items/application/BannerAnalyticsType;)V", "Lcom/avito/android/remote/model/UniversalImage;", "d", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "Lcom/avito/android/mortgage/api/model/ActionButton;", "a", "()Lcom/avito/android/mortgage/api/model/ActionButton;", "Lcom/avito/android/mortgage/api/model/items/application/BannerAnalyticsType;", "b", "()Lcom/avito/android/mortgage/api/model/items/application/BannerAnalyticsType;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14287q implements InterfaceC14286p {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final ActionButton action;

    @com.google.gson.annotations.c("analyticsType")
    @Y61.l
    private final BannerAnalyticsType analyticsType;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("imageUrl")
    @Y61.l
    private final UniversalImage image;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C14287q(@Y61.l UniversalImage universalImage, @Y61.k String str, @Y61.l String str2, @Y61.l ActionButton actionButton, @Y61.l BannerAnalyticsType bannerAnalyticsType) {
        this.image = universalImage;
        this.title = str;
        this.description = str2;
        this.action = actionButton;
        this.analyticsType = bannerAnalyticsType;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ActionButton getAction() {
        return this.action;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final BannerAnalyticsType getAnalyticsType() {
        return this.analyticsType;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14287q)) {
            return false;
        }
        C14287q c14287q = (C14287q) obj;
        return kotlin.jvm.internal.L.f(this.image, c14287q.image) && kotlin.jvm.internal.L.f(this.title, c14287q.title) && kotlin.jvm.internal.L.f(this.description, c14287q.description) && kotlin.jvm.internal.L.f(this.action, c14287q.action) && this.analyticsType == c14287q.analyticsType;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.image;
        int iD2 = androidx.compose.foundation.H.d((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ActionButton actionButton = this.action;
        int iHashCode2 = (iHashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        BannerAnalyticsType bannerAnalyticsType = this.analyticsType;
        return iHashCode2 + (bannerAnalyticsType != null ? bannerAnalyticsType.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ApplicationCtaBannerItemValue(image=" + this.image + ", title=" + this.title + ", description=" + this.description + ", action=" + this.action + ", analyticsType=" + this.analyticsType + ')';
    }
}

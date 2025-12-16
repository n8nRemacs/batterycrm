package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelInfo.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\"\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b$\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/avito/messenger/api/entity/ChannelInfo;", "", "", "name", "Lru/avito/messenger/api/entity/Image;", "avatar", "Lcom/avito/android/remote/model/SimpleAction;", "link", "status", ChannelContext.Item.USER_ID, "description", "", "rating", "Lru/avito/messenger/api/entity/ChannelInfoDetails;", "details", "<init>", "(Ljava/lang/String;Lru/avito/messenger/api/entity/Image;Lcom/avito/android/remote/model/SimpleAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lru/avito/messenger/api/entity/ChannelInfoDetails;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/avito/messenger/api/entity/Image;", "getAvatar", "()Lru/avito/messenger/api/entity/Image;", "Lcom/avito/android/remote/model/SimpleAction;", "getLink", "()Lcom/avito/android/remote/model/SimpleAction;", "getStatus", "getUserId", "getDescription", "Ljava/lang/Float;", "getRating", "()Ljava/lang/Float;", "Lru/avito/messenger/api/entity/ChannelInfoDetails;", "getDetails", "()Lru/avito/messenger/api/entity/ChannelInfoDetails;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChannelInfo {

    @c("avatar")
    @l
    private final Image avatar;

    @c("description")
    @l
    private final String description;

    @c("details")
    @l
    private final ChannelInfoDetails details;

    @c("link")
    @l
    private final SimpleAction link;

    @c("name")
    @k
    private final String name;

    @c("rating")
    @l
    private final Float rating;

    @c("status")
    @l
    private final String status;

    @c(ChannelContext.Item.USER_ID)
    @l
    private final String userId;

    public ChannelInfo(@k String str, @l Image image, @l SimpleAction simpleAction, @l String str2, @l String str3, @l String str4, @l Float f12, @l ChannelInfoDetails channelInfoDetails) {
        this.name = str;
        this.avatar = image;
        this.link = simpleAction;
        this.status = str2;
        this.userId = str3;
        this.description = str4;
        this.rating = f12;
        this.details = channelInfoDetails;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelInfo)) {
            return false;
        }
        ChannelInfo channelInfo = (ChannelInfo) other;
        return L.f(this.name, channelInfo.name) && L.f(this.avatar, channelInfo.avatar) && L.f(this.link, channelInfo.link) && L.f(this.status, channelInfo.status) && L.f(this.userId, channelInfo.userId) && L.f(this.description, channelInfo.description) && L.f(this.rating, channelInfo.rating) && L.f(this.details, channelInfo.details);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final ChannelInfoDetails getDetails() {
        return this.details;
    }

    @l
    public final SimpleAction getLink() {
        return this.link;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final Float getRating() {
        return this.rating;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Image image = this.avatar;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        SimpleAction simpleAction = this.link;
        int iHashCode3 = (iHashCode2 + (simpleAction == null ? 0 : simpleAction.hashCode())) * 31;
        String str = this.status;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f12 = this.rating;
        int iHashCode7 = (iHashCode6 + (f12 == null ? 0 : f12.hashCode())) * 31;
        ChannelInfoDetails channelInfoDetails = this.details;
        return iHashCode7 + (channelInfoDetails != null ? channelInfoDetails.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ChannelInfo(name=" + this.name + ", avatar=" + this.avatar + ", link=" + this.link + ", status=" + this.status + ", userId=" + this.userId + ", description=" + this.description + ", rating=" + this.rating + ", details=" + this.details + ')';
    }

    public /* synthetic */ ChannelInfo(String str, Image image, SimpleAction simpleAction, String str2, String str3, String str4, Float f12, ChannelInfoDetails channelInfoDetails, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : image, (i12 & 4) != 0 ? null : simpleAction, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : f12, (i12 & 128) == 0 ? channelInfoDetails : null);
    }
}

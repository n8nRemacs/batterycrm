package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/UserMessage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/user_stats/model/extended_user_stats/UserMessageAction;", "action", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/user_stats/model/extended_user_stats/UserMessageAction;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/user_stats/model/extended_user_stats/UserMessageAction;", "c", "()Lcom/avito/user_stats/model/extended_user_stats/UserMessageAction;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserMessage implements Parcelable {

    @k
    public static final Parcelable.Creator<UserMessage> CREATOR = new a();

    @c("action")
    @l
    private final UserMessageAction action;

    @c("description")
    @l
    private final AttributedText description;

    @c("image")
    @l
    private final UniversalImage image;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: CommonStatsBasicIndicators.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserMessage> {
        @Override // android.os.Parcelable.Creator
        public final UserMessage createFromParcel(Parcel parcel) {
            return new UserMessage((UniversalImage) parcel.readParcelable(UserMessage.class.getClassLoader()), (AttributedText) parcel.readParcelable(UserMessage.class.getClassLoader()), (AttributedText) parcel.readParcelable(UserMessage.class.getClassLoader()), parcel.readInt() == 0 ? null : UserMessageAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UserMessage[] newArray(int i12) {
            return new UserMessage[i12];
        }
    }

    public UserMessage(@l UniversalImage universalImage, @l AttributedText attributedText, @l AttributedText attributedText2, @l UserMessageAction userMessageAction) {
        this.image = universalImage;
        this.title = attributedText;
        this.description = attributedText2;
        this.action = userMessageAction;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UserMessageAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMessage)) {
            return false;
        }
        UserMessage userMessage = (UserMessage) obj;
        return L.f(this.image, userMessage.image) && L.f(this.title, userMessage.title) && L.f(this.description, userMessage.description) && L.f(this.action, userMessage.action);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.image;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        AttributedText attributedText = this.title;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UserMessageAction userMessageAction = this.action;
        return iHashCode3 + (userMessageAction != null ? userMessageAction.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UserMessage(image=" + this.image + ", title=" + this.title + ", description=" + this.description + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        UserMessageAction userMessageAction = this.action;
        if (userMessageAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userMessageAction.writeToParcel(parcel, i12);
        }
    }
}

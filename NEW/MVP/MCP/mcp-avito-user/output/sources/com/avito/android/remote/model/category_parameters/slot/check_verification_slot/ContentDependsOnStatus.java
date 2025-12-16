package com.avito.android.remote.model.category_parameters.slot.check_verification_slot;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CheckVerificationSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/ContentDependsOnStatus;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "title", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "link", "Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/Action;", "action", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/text/AttributedText;", "getLink", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/Action;", "getAction", "()Lcom/avito/android/remote/model/category_parameters/slot/check_verification_slot/Action;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentDependsOnStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<ContentDependsOnStatus> CREATOR = new Creator();

    @c("action")
    @k
    private final Action action;

    @c("description")
    @k
    private final String description;

    @c("universalImage")
    @k
    private final UniversalImage image;

    @c("link")
    @l
    private final AttributedText link;

    @c("title")
    @k
    private final String title;

    /* compiled from: CheckVerificationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContentDependsOnStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContentDependsOnStatus createFromParcel(@k Parcel parcel) {
            return new ContentDependsOnStatus((UniversalImage) parcel.readParcelable(ContentDependsOnStatus.class.getClassLoader()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ContentDependsOnStatus.class.getClassLoader()), Action.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContentDependsOnStatus[] newArray(int i12) {
            return new ContentDependsOnStatus[i12];
        }
    }

    public ContentDependsOnStatus(@k UniversalImage universalImage, @k String str, @k String str2, @l AttributedText attributedText, @k Action action) {
        this.image = universalImage;
        this.title = str;
        this.description = str2;
        this.link = attributedText;
        this.action = action;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final Action getAction() {
        return this.action;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getLink() {
        return this.link;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.link, flags);
        this.action.writeToParcel(parcel, flags);
    }
}

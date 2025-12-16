package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnonymousPhoneNumberResponse.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/AnonymousPhoneNumberResponse;", "Landroid/os/Parcelable;", "", "title", "description", "pictureId", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Action;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;)Lcom/avito/android/remote/model/AnonymousPhoneNumberResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getPictureId", "Lcom/avito/android/remote/model/Action;", "getAction", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AnonymousPhoneNumberResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AnonymousPhoneNumberResponse> CREATOR = new Creator();

    @c("action")
    @k
    private final Action action;

    @c("description")
    @k
    private final String description;

    @c("pictureId")
    @l
    private final String pictureId;

    @c("title")
    @k
    private final String title;

    /* compiled from: AnonymousPhoneNumberResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnonymousPhoneNumberResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AnonymousPhoneNumberResponse createFromParcel(@k Parcel parcel) {
            return new AnonymousPhoneNumberResponse(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(AnonymousPhoneNumberResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AnonymousPhoneNumberResponse[] newArray(int i12) {
            return new AnonymousPhoneNumberResponse[i12];
        }
    }

    public AnonymousPhoneNumberResponse(@k String str, @k String str2, @l String str3, @k Action action) {
        this.title = str;
        this.description = str2;
        this.pictureId = str3;
        this.action = action;
    }

    public static /* synthetic */ AnonymousPhoneNumberResponse copy$default(AnonymousPhoneNumberResponse anonymousPhoneNumberResponse, String str, String str2, String str3, Action action, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = anonymousPhoneNumberResponse.title;
        }
        if ((i12 & 2) != 0) {
            str2 = anonymousPhoneNumberResponse.description;
        }
        if ((i12 & 4) != 0) {
            str3 = anonymousPhoneNumberResponse.pictureId;
        }
        if ((i12 & 8) != 0) {
            action = anonymousPhoneNumberResponse.action;
        }
        return anonymousPhoneNumberResponse.copy(str, str2, str3, action);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPictureId() {
        return this.pictureId;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    public final AnonymousPhoneNumberResponse copy(@k String title, @k String description, @l String pictureId, @k Action action) {
        return new AnonymousPhoneNumberResponse(title, description, pictureId, action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnonymousPhoneNumberResponse)) {
            return false;
        }
        AnonymousPhoneNumberResponse anonymousPhoneNumberResponse = (AnonymousPhoneNumberResponse) other;
        return L.f(this.title, anonymousPhoneNumberResponse.title) && L.f(this.description, anonymousPhoneNumberResponse.description) && L.f(this.pictureId, anonymousPhoneNumberResponse.pictureId) && L.f(this.action, anonymousPhoneNumberResponse.action);
    }

    @k
    public final Action getAction() {
        return this.action;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getPictureId() {
        return this.pictureId;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.description);
        String str = this.pictureId;
        return this.action.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "AnonymousPhoneNumberResponse(title=" + this.title + ", description=" + this.description + ", pictureId=" + this.pictureId + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.pictureId);
        parcel.writeParcelable(this.action, flags);
    }
}

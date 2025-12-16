package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertSharing.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/AdvertSharing;", "Landroid/os/Parcelable;", "", "facebook", "liveJournal", "myMail", "native", "odnoklassniki", "twitter", "vkontakte", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFacebook", "()Ljava/lang/String;", "getLiveJournal", "getMyMail", "getNative", "getOdnoklassniki", "getTwitter", "getVkontakte", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertSharing implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertSharing> CREATOR = new Creator();

    @c("fb")
    @l
    private final String facebook;

    @c("lj")
    @l
    private final String liveJournal;

    @c("mm")
    @l
    private final String myMail;

    @c("native")
    @l
    private final String native;

    @c("ok")
    @l
    private final String odnoklassniki;

    @c("tw")
    @l
    private final String twitter;

    @c(ContextActionHandler.Link.URL)
    @k
    private final String url;

    @c("vk")
    @l
    private final String vkontakte;

    /* compiled from: AdvertSharing.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertSharing> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSharing createFromParcel(@k Parcel parcel) {
            return new AdvertSharing(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSharing[] newArray(int i12) {
            return new AdvertSharing[i12];
        }
    }

    public AdvertSharing(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @k String str8) {
        this.facebook = str;
        this.liveJournal = str2;
        this.myMail = str3;
        this.native = str4;
        this.odnoklassniki = str5;
        this.twitter = str6;
        this.vkontakte = str7;
        this.url = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getFacebook() {
        return this.facebook;
    }

    @l
    public final String getLiveJournal() {
        return this.liveJournal;
    }

    @l
    public final String getMyMail() {
        return this.myMail;
    }

    @l
    public final String getNative() {
        return this.native;
    }

    @l
    public final String getOdnoklassniki() {
        return this.odnoklassniki;
    }

    @l
    public final String getTwitter() {
        return this.twitter;
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    @l
    public final String getVkontakte() {
        return this.vkontakte;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.facebook);
        parcel.writeString(this.liveJournal);
        parcel.writeString(this.myMail);
        parcel.writeString(this.native);
        parcel.writeString(this.odnoklassniki);
        parcel.writeString(this.twitter);
        parcel.writeString(this.vkontakte);
        parcel.writeString(this.url);
    }
}

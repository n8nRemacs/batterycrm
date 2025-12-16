package com.avito.android.remote.model.user_profile;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: IncomeProfileSettingsResponse.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$Body;", "body", "Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$EnableField;", "enableField", "<init>", "(Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$Body;Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$EnableField;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$Body;", "getBody", "()Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$Body;", "Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$EnableField;", "getEnableField", "()Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$EnableField;", "Body", "EnableField", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IncomeProfileSettingsResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<IncomeProfileSettingsResponse> CREATOR = new Creator();

    @c("body")
    @k
    private final Body body;

    @c("enableField")
    @k
    private final EnableField enableField;

    /* compiled from: IncomeProfileSettingsResponse.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$Body;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Image;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Body implements Parcelable {

        @k
        public static final Parcelable.Creator<Body> CREATOR = new Creator();

        @c("attributedText")
        @k
        private final AttributedText attributedText;

        @c("image")
        @k
        private final Image image;

        /* compiled from: IncomeProfileSettingsResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Body> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Body createFromParcel(@k Parcel parcel) {
                return new Body((AttributedText) parcel.readParcelable(Body.class.getClassLoader()), (Image) parcel.readParcelable(Body.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Body[] newArray(int i12) {
                return new Body[i12];
            }
        }

        public Body(@k AttributedText attributedText, @k Image image) {
            this.attributedText = attributedText;
            this.image = image;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final AttributedText getAttributedText() {
            return this.attributedText;
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.attributedText, flags);
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: IncomeProfileSettingsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IncomeProfileSettingsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IncomeProfileSettingsResponse createFromParcel(@k Parcel parcel) {
            return new IncomeProfileSettingsResponse(Body.CREATOR.createFromParcel(parcel), EnableField.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IncomeProfileSettingsResponse[] newArray(int i12) {
            return new IncomeProfileSettingsResponse[i12];
        }
    }

    /* compiled from: IncomeProfileSettingsResponse.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/user_profile/IncomeProfileSettingsResponse$EnableField;", "Landroid/os/Parcelable;", "", "title", "", "value", "<init>", "(Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "getValue", "()Z", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EnableField implements Parcelable {

        @k
        public static final Parcelable.Creator<EnableField> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c("value")
        private final boolean value;

        /* compiled from: IncomeProfileSettingsResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EnableField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EnableField createFromParcel(@k Parcel parcel) {
                return new EnableField(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final EnableField[] newArray(int i12) {
                return new EnableField[i12];
            }
        }

        public EnableField(@k String str, boolean z12) {
            this.title = str;
            this.value = z12;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final boolean getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeInt(this.value ? 1 : 0);
        }
    }

    public IncomeProfileSettingsResponse(@k Body body, @k EnableField enableField) {
        this.body = body;
        this.enableField = enableField;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final Body getBody() {
        return this.body;
    }

    @k
    public final EnableField getEnableField() {
        return this.enableField;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.body.writeToParcel(parcel, flags);
        this.enableField.writeToParcel(parcel, flags);
    }
}

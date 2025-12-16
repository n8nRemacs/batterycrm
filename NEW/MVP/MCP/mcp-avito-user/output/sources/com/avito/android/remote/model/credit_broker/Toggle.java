package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: InstallmentsFloatingView.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/Toggle;", "Lcom/avito/android/remote/model/credit_broker/InstallmentsFloatingView;", "Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "isChecked", "", "submitButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "submitButtonDeeplink", "<init>", "(Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;", "getImage", "()Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getSubmitButtonTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getSubmitButtonDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Toggle implements InstallmentsFloatingView {

    @k
    public static final Parcelable.Creator<Toggle> CREATOR = new Creator();

    @c("image")
    @l
    private final InstallmentsImage image;

    @c("isTurnedOn")
    @l
    private final Boolean isChecked;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink submitButtonDeeplink;

    @c("buttonTitle")
    @l
    private final String submitButtonTitle;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: InstallmentsFloatingView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Toggle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Toggle createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf = null;
            InstallmentsImage installmentsImageCreateFromParcel = parcel.readInt() == 0 ? null : InstallmentsImage.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Toggle.class.getClassLoader());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Toggle(installmentsImageCreateFromParcel, attributedText, boolValueOf, parcel.readString(), (DeepLink) parcel.readParcelable(Toggle.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Toggle[] newArray(int i12) {
            return new Toggle[i12];
        }
    }

    public Toggle(@l InstallmentsImage installmentsImage, @l AttributedText attributedText, @l Boolean bool, @l String str, @l DeepLink deepLink) {
        this.image = installmentsImage;
        this.title = attributedText;
        this.isChecked = bool;
        this.submitButtonTitle = str;
        this.submitButtonDeeplink = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final InstallmentsImage getImage() {
        return this.image;
    }

    @l
    public final DeepLink getSubmitButtonDeeplink() {
        return this.submitButtonDeeplink;
    }

    @l
    public final String getSubmitButtonTitle() {
        return this.submitButtonTitle;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: isChecked, reason: from getter */
    public final Boolean getIsChecked() {
        return this.isChecked;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        InstallmentsImage installmentsImage = this.image;
        if (installmentsImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsImage.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.title, flags);
        Boolean bool = this.isChecked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.submitButtonTitle);
        parcel.writeParcelable(this.submitButtonDeeplink, flags);
    }
}

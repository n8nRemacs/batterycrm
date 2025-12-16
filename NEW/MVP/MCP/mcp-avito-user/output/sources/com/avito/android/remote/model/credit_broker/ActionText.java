package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: InstallmentsFloatingView.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/ActionText;", "Lcom/avito/android/remote/model/credit_broker/InstallmentsFloatingView;", "Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "actionAttributedText", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;", "getImage", "()Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getActionAttributedText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActionText implements InstallmentsFloatingView {

    @k
    public static final Parcelable.Creator<ActionText> CREATOR = new Creator();

    @c("actionAttributedText")
    @l
    private final AttributedText actionAttributedText;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c("image")
    @l
    private final InstallmentsImage image;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: InstallmentsFloatingView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActionText createFromParcel(@k Parcel parcel) {
            return new ActionText(parcel.readInt() == 0 ? null : InstallmentsImage.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ActionText.class.getClassLoader()), (AttributedText) parcel.readParcelable(ActionText.class.getClassLoader()), (DeepLink) parcel.readParcelable(ActionText.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ActionText[] newArray(int i12) {
            return new ActionText[i12];
        }
    }

    public ActionText(@l InstallmentsImage installmentsImage, @l AttributedText attributedText, @l AttributedText attributedText2, @l DeepLink deepLink) {
        this.image = installmentsImage;
        this.title = attributedText;
        this.actionAttributedText = attributedText2;
        this.deepLink = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getActionAttributedText() {
        return this.actionAttributedText;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final InstallmentsImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
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
        parcel.writeParcelable(this.actionAttributedText, flags);
        parcel.writeParcelable(this.deepLink, flags);
    }
}

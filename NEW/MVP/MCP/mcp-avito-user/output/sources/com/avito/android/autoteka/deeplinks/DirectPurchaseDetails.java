package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaDirectPurchaseLink.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/DirectPurchaseDetails;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "Lcom/avito/android/autoteka/deeplinks/DirectPurchaseDetails$Button;", "primaryButton", "secondaryButton", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/autoteka/deeplinks/DirectPurchaseDetails$Button;Lcom/avito/android/autoteka/deeplinks/DirectPurchaseDetails$Button;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/autoteka/deeplinks/DirectPurchaseDetails$Button;", "c", "()Lcom/avito/android/autoteka/deeplinks/DirectPurchaseDetails$Button;", "d", "Button", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DirectPurchaseDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<DirectPurchaseDetails> CREATOR = new a();

    @c("description")
    @l
    private final AttributedText description;

    @c("primaryButton")
    @l
    private final Button primaryButton;

    @c("secondaryButton")
    @l
    private final Button secondaryButton;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaDirectPurchaseLink.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/DirectPurchaseDetails$Button;", "Landroid/os/Parcelable;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f96240b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f96241c;

        /* compiled from: AutotekaDirectPurchaseLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @l DeepLink deepLink) {
            this.f96240b = str;
            this.f96241c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f96240b, button.f96240b) && L.f(this.f96241c, button.f96241c);
        }

        public final int hashCode() {
            int iHashCode = this.f96240b.hashCode() * 31;
            DeepLink deepLink = this.f96241c;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f96240b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f96241c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f96240b);
            parcel.writeParcelable(this.f96241c, i12);
        }
    }

    /* compiled from: AutotekaDirectPurchaseLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DirectPurchaseDetails> {
        @Override // android.os.Parcelable.Creator
        public final DirectPurchaseDetails createFromParcel(Parcel parcel) {
            return new DirectPurchaseDetails(parcel.readString(), (AttributedText) parcel.readParcelable(DirectPurchaseDetails.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final DirectPurchaseDetails[] newArray(int i12) {
            return new DirectPurchaseDetails[i12];
        }
    }

    public DirectPurchaseDetails(@k String str, @l AttributedText attributedText, @l Button button, @l Button button2) {
        this.title = str;
        this.description = attributedText;
        this.primaryButton = button;
        this.secondaryButton = button2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Button getPrimaryButton() {
        return this.primaryButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Button getSecondaryButton() {
        return this.secondaryButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectPurchaseDetails)) {
            return false;
        }
        DirectPurchaseDetails directPurchaseDetails = (DirectPurchaseDetails) obj;
        return L.f(this.title, directPurchaseDetails.title) && L.f(this.description, directPurchaseDetails.description) && L.f(this.primaryButton, directPurchaseDetails.primaryButton) && L.f(this.secondaryButton, directPurchaseDetails.secondaryButton);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.description;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Button button = this.primaryButton;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.secondaryButton;
        return iHashCode3 + (button2 != null ? button2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DirectPurchaseDetails(title=" + this.title + ", description=" + this.description + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, i12);
        Button button = this.primaryButton;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        Button button2 = this.secondaryButton;
        if (button2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button2.writeToParcel(parcel, i12);
        }
    }
}

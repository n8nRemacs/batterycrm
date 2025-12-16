package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeBlockDTO.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJF\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b-\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/RecallMeBlockDTO;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/ButtonDTO;", "button", "description", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "successMessage", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/ButtonDTO;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/ButtonDTO;", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/ButtonDTO;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/remote/model/RecallMeBlockDTO;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/ButtonDTO;", "getButton", "getDescription", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "getSuccessMessage", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RecallMeBlockDTO implements Parcelable {

    @k
    public static final Parcelable.Creator<RecallMeBlockDTO> CREATOR = new Creator();

    @c("button")
    @k
    private final ButtonDTO button;

    @c("description")
    @k
    private final String description;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final AttributedText disclaimer;

    @c("successMessage")
    @l
    private final String successMessage;

    @c("title")
    @k
    private final String title;

    /* compiled from: RecallMeBlockDTO.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecallMeBlockDTO> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecallMeBlockDTO createFromParcel(@k Parcel parcel) {
            return new RecallMeBlockDTO(parcel.readString(), ButtonDTO.CREATOR.createFromParcel(parcel), parcel.readString(), (AttributedText) parcel.readParcelable(RecallMeBlockDTO.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecallMeBlockDTO[] newArray(int i12) {
            return new RecallMeBlockDTO[i12];
        }
    }

    public RecallMeBlockDTO(@k String str, @k ButtonDTO buttonDTO, @k String str2, @l AttributedText attributedText, @l String str3) {
        this.title = str;
        this.button = buttonDTO;
        this.description = str2;
        this.disclaimer = attributedText;
        this.successMessage = str3;
    }

    public static /* synthetic */ RecallMeBlockDTO copy$default(RecallMeBlockDTO recallMeBlockDTO, String str, ButtonDTO buttonDTO, String str2, AttributedText attributedText, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = recallMeBlockDTO.title;
        }
        if ((i12 & 2) != 0) {
            buttonDTO = recallMeBlockDTO.button;
        }
        ButtonDTO buttonDTO2 = buttonDTO;
        if ((i12 & 4) != 0) {
            str2 = recallMeBlockDTO.description;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            attributedText = recallMeBlockDTO.disclaimer;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 16) != 0) {
            str3 = recallMeBlockDTO.successMessage;
        }
        return recallMeBlockDTO.copy(str, buttonDTO2, str4, attributedText2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final ButtonDTO getButton() {
        return this.button;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    @k
    public final RecallMeBlockDTO copy(@k String title, @k ButtonDTO button, @k String description, @l AttributedText disclaimer, @l String successMessage) {
        return new RecallMeBlockDTO(title, button, description, disclaimer, successMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecallMeBlockDTO)) {
            return false;
        }
        RecallMeBlockDTO recallMeBlockDTO = (RecallMeBlockDTO) other;
        return L.f(this.title, recallMeBlockDTO.title) && L.f(this.button, recallMeBlockDTO.button) && L.f(this.description, recallMeBlockDTO.description) && L.f(this.disclaimer, recallMeBlockDTO.disclaimer) && L.f(this.successMessage, recallMeBlockDTO.successMessage);
    }

    @k
    public final ButtonDTO getButton() {
        return this.button;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d((this.button.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.description);
        AttributedText attributedText = this.disclaimer;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.successMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RecallMeBlockDTO(title=");
        sb2.append(this.title);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", successMessage=");
        return C22026a.c(sb2, this.successMessage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.button.writeToParcel(parcel, flags);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.disclaimer, flags);
        parcel.writeString(this.successMessage);
    }
}

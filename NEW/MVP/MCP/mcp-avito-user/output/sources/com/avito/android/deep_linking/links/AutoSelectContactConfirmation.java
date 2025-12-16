package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: AutoSelectConfirmationLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/deep_linking/links/AutoSelectContactConfirmation;", "Lcom/avito/android/util/OpenParams;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/Button;", "button", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/Button;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/Button;", "c", "()Lcom/avito/android/deep_linking/links/Button;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AutoSelectContactConfirmation implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<AutoSelectContactConfirmation> CREATOR = new a();

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final Button button;

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final AttributedText text;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    /* compiled from: AutoSelectConfirmationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectContactConfirmation> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactConfirmation createFromParcel(Parcel parcel) {
            return new AutoSelectContactConfirmation(parcel.readString(), (AttributedText) parcel.readParcelable(AutoSelectContactConfirmation.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactConfirmation[] newArray(int i12) {
            return new AutoSelectContactConfirmation[i12];
        }
    }

    public AutoSelectContactConfirmation(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l Button button) {
        this.title = str;
        this.text = attributedText;
        this.button = button;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.text, i12);
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
    }
}

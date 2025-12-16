package com.avito.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ActionModalDialogContent.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/ActionModalDialogContent;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "confirmButtonTitle", "cancelButtonTitle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "getConfirmButtonTitle", "c", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActionModalDialogContent implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ActionModalDialogContent> CREATOR = new a();

    @com.google.gson.annotations.c("cancelButtonTitle")
    @Y61.k
    private final String cancelButtonTitle;

    @com.google.gson.annotations.c("confirmButtonTitle")
    @Y61.k
    private final String confirmButtonTitle;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final AttributedText description;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* compiled from: ActionModalDialogContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionModalDialogContent> {
        @Override // android.os.Parcelable.Creator
        public final ActionModalDialogContent createFromParcel(Parcel parcel) {
            return new ActionModalDialogContent(parcel.readString(), (AttributedText) parcel.readParcelable(ActionModalDialogContent.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionModalDialogContent[] newArray(int i12) {
            return new ActionModalDialogContent[i12];
        }
    }

    public ActionModalDialogContent(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k String str2, @Y61.k String str3) {
        this.title = str;
        this.description = attributedText;
        this.confirmButtonTitle = str2;
        this.cancelButtonTitle = str3;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionModalDialogContent)) {
            return false;
        }
        ActionModalDialogContent actionModalDialogContent = (ActionModalDialogContent) obj;
        return kotlin.jvm.internal.L.f(this.title, actionModalDialogContent.title) && kotlin.jvm.internal.L.f(this.description, actionModalDialogContent.description) && kotlin.jvm.internal.L.f(this.confirmButtonTitle, actionModalDialogContent.confirmButtonTitle) && kotlin.jvm.internal.L.f(this.cancelButtonTitle, actionModalDialogContent.cancelButtonTitle);
    }

    @Y61.k
    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    @Y61.l
    public final AttributedText getDescription() {
        return this.description;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.description;
        return this.cancelButtonTitle.hashCode() + androidx.compose.foundation.H.d((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.confirmButtonTitle);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionModalDialogContent(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", confirmButtonTitle=");
        sb2.append(this.confirmButtonTitle);
        sb2.append(", cancelButtonTitle=");
        return C22026a.c(sb2, this.cancelButtonTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.description, i12);
        parcel.writeString(this.confirmButtonTitle);
        parcel.writeString(this.cancelButtonTitle);
    }
}

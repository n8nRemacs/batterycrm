package com.avito.android.mortgage.api.model.items.application;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationImmutableInfoItemValue.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ImmutableInfoDescriptionTab;", "Landroid/os/Parcelable;", "", "title", "applicantType", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ImmutableInfoDescriptionTab implements Parcelable {

    @k
    public static final Parcelable.Creator<ImmutableInfoDescriptionTab> CREATOR = new a();

    @c("applicantType")
    @k
    private final String applicantType;

    @c("content")
    @k
    private final AttributedText content;

    @c("title")
    @k
    private final String title;

    /* compiled from: ApplicationImmutableInfoItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImmutableInfoDescriptionTab> {
        @Override // android.os.Parcelable.Creator
        public final ImmutableInfoDescriptionTab createFromParcel(Parcel parcel) {
            return new ImmutableInfoDescriptionTab(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ImmutableInfoDescriptionTab.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImmutableInfoDescriptionTab[] newArray(int i12) {
            return new ImmutableInfoDescriptionTab[i12];
        }
    }

    public ImmutableInfoDescriptionTab(@k String str, @k String str2, @k AttributedText attributedText) {
        this.title = str;
        this.applicantType = str2;
        this.content = attributedText;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getApplicantType() {
        return this.applicantType;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getContent() {
        return this.content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableInfoDescriptionTab)) {
            return false;
        }
        ImmutableInfoDescriptionTab immutableInfoDescriptionTab = (ImmutableInfoDescriptionTab) obj;
        return L.f(this.title, immutableInfoDescriptionTab.title) && L.f(this.applicantType, immutableInfoDescriptionTab.applicantType) && L.f(this.content, immutableInfoDescriptionTab.content);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.content.hashCode() + H.d(this.title.hashCode() * 31, 31, this.applicantType);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoDescriptionTab(title=");
        sb2.append(this.title);
        sb2.append(", applicantType=");
        sb2.append(this.applicantType);
        sb2.append(", content=");
        return com.avito.android.actions_sheet.a.w(sb2, this.content, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.applicantType);
        parcel.writeParcelable(this.content, i12);
    }
}

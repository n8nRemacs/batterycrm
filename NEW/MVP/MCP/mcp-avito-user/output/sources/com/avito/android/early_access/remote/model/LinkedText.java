package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/early_access/remote/model/LinkedText;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/early_access/remote/model/Link;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/early_access/remote/model/Link;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/early_access/remote/model/Link;", "getLink", "()Lcom/avito/android/early_access/remote/model/Link;", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LinkedText implements Parcelable {

    @k
    public static final Parcelable.Creator<LinkedText> CREATOR = new a();

    @c("link")
    @k
    private final Link link;

    @c("text")
    @k
    private final String text;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LinkedText> {
        @Override // android.os.Parcelable.Creator
        public final LinkedText createFromParcel(Parcel parcel) {
            return new LinkedText(parcel.readString(), Link.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final LinkedText[] newArray(int i12) {
            return new LinkedText[i12];
        }
    }

    public LinkedText(@k String str, @k Link link) {
        this.text = str;
        this.link = link;
    }

    @k
    public final ReEarlyAccessData.LinkedText c() {
        return new ReEarlyAccessData.LinkedText(this.text, this.link.c());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedText)) {
            return false;
        }
        LinkedText linkedText = (LinkedText) obj;
        return L.f(this.text, linkedText.text) && L.f(this.link, linkedText.link);
    }

    public final int hashCode() {
        return this.link.hashCode() + (this.text.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "LinkedText(text=" + this.text + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        this.link.writeToParcel(parcel, i12);
    }
}

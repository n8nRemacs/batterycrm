package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/early_access/remote/model/EarlyAccessLegalBlock;", "Landroid/os/Parcelable;", "", "text", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getLink", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessLegalBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessLegalBlock> CREATOR = new a();

    @c("link")
    @l
    private final String link;

    @c("text")
    @k
    private final String text;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessLegalBlock> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessLegalBlock createFromParcel(Parcel parcel) {
            return new EarlyAccessLegalBlock(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessLegalBlock[] newArray(int i12) {
            return new EarlyAccessLegalBlock[i12];
        }
    }

    public EarlyAccessLegalBlock(@k String str, @l String str2) {
        this.text = str;
        this.link = str2;
    }

    @k
    public final ReEarlyAccessData.Link c() {
        return new ReEarlyAccessData.Link(this.text, this.link);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessLegalBlock)) {
            return false;
        }
        EarlyAccessLegalBlock earlyAccessLegalBlock = (EarlyAccessLegalBlock) obj;
        return L.f(this.text, earlyAccessLegalBlock.text) && L.f(this.link, earlyAccessLegalBlock.link);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.link;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessLegalBlock(text=");
        sb2.append(this.text);
        sb2.append(", link=");
        return C22026a.c(sb2, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeString(this.link);
    }
}

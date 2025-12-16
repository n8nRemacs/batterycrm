package com.avito.android.comfortable_deal.comment.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/model/CommentArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommentArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<CommentArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f120534b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f120535c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f120536d;

    /* compiled from: CommentArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommentArguments> {
        @Override // android.os.Parcelable.Creator
        public final CommentArguments createFromParcel(Parcel parcel) {
            return new CommentArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommentArguments[] newArray(int i12) {
            return new CommentArguments[i12];
        }
    }

    public CommentArguments(@k String str, @k String str2, @l String str3) {
        this.f120534b = str;
        this.f120535c = str2;
        this.f120536d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentArguments)) {
            return false;
        }
        CommentArguments commentArguments = (CommentArguments) obj;
        return L.f(this.f120534b, commentArguments.f120534b) && L.f(this.f120535c, commentArguments.f120535c) && L.f(this.f120536d, commentArguments.f120536d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f120534b.hashCode() * 31, 31, this.f120535c);
        String str = this.f120536d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommentArguments(requestKey=");
        sb2.append(this.f120534b);
        sb2.append(", dealId=");
        sb2.append(this.f120535c);
        sb2.append(", comment=");
        return C22026a.c(sb2, this.f120536d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f120534b);
        parcel.writeString(this.f120535c);
        parcel.writeString(this.f120536d);
    }
}

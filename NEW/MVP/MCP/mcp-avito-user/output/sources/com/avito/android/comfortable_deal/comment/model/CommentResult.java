package com.avito.android.comfortable_deal.comment.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/model/CommentResult;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommentResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CommentResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CommentResultStrategy f120537b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f120538c;

    /* compiled from: CommentResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CommentResult> {
        @Override // android.os.Parcelable.Creator
        public final CommentResult createFromParcel(Parcel parcel) {
            return new CommentResult(CommentResultStrategy.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommentResult[] newArray(int i12) {
            return new CommentResult[i12];
        }
    }

    public CommentResult(@k CommentResultStrategy commentResultStrategy, @l String str) {
        this.f120537b = commentResultStrategy;
        this.f120538c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentResult)) {
            return false;
        }
        CommentResult commentResult = (CommentResult) obj;
        return this.f120537b == commentResult.f120537b && L.f(this.f120538c, commentResult.f120538c);
    }

    public final int hashCode() {
        int iHashCode = this.f120537b.hashCode() * 31;
        String str = this.f120538c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommentResult(strategy=");
        sb2.append(this.f120537b);
        sb2.append(", comment=");
        return C22026a.c(sb2, this.f120538c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f120537b.writeToParcel(parcel, i12);
        parcel.writeString(this.f120538c);
    }
}

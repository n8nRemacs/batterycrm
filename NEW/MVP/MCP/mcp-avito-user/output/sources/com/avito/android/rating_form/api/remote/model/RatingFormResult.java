package com.avito.android.rating_form.api.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormResult;", "Landroid/os/Parcelable;", "", "success", "", "Lcom/avito/android/rating_form/api/remote/model/RatingFormAddValueType;", "responses", "<init>", "(ZLjava/util/List;)V", "Z", "getSuccess", "()Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormResult implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingFormResult> CREATOR = new a();

    @c("responses")
    @k
    private final List<RatingFormAddValueType> responses;

    @c("success")
    private final boolean success;

    /* compiled from: RatingFormResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormResult> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormResult createFromParcel(Parcel parcel) {
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(RatingFormResult.class, parcel, arrayList, iL2, 1);
            }
            return new RatingFormResult(z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormResult[] newArray(int i12) {
            return new RatingFormResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingFormResult(boolean z12, @k List<? extends RatingFormAddValueType> list) {
        this.success = z12;
        this.responses = list;
    }

    @k
    public final List<RatingFormAddValueType> c() {
        return this.responses;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormResult)) {
            return false;
        }
        RatingFormResult ratingFormResult = (RatingFormResult) obj;
        return this.success == ratingFormResult.success && L.f(this.responses, ratingFormResult.responses);
    }

    public final int hashCode() {
        return this.responses.hashCode() + (Boolean.hashCode(this.success) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormResult(success=");
        sb2.append(this.success);
        sb2.append(", responses=");
        return H.p(sb2, this.responses, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.success ? 1 : 0);
        Iterator itJ = C0.j(this.responses, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}

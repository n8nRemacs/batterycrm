package com.avito.android.rating.details.answer.upload;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.ratings.ReviewData;
import com.avito.android.remote.model.review_reply.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReviewReplyState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "Landroid/os/Parcelable;", "DeleteError", "DeleteResult", "Error", "Loading", "Result", "RevertError", "RevertResult", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$DeleteError;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$DeleteResult;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$Error;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$Loading;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$Result;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$RevertError;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$RevertResult;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ReviewReplyState implements Parcelable {

    /* compiled from: ReviewReplyState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$DeleteError;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteError extends ReviewReplyState {

        @k
        public static final Parcelable.Creator<DeleteError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewData f246893b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f246894c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Throwable f246895d;

        /* compiled from: ReviewReplyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeleteError> {
            @Override // android.os.Parcelable.Creator
            public final DeleteError createFromParcel(Parcel parcel) {
                return new DeleteError((ReviewData) parcel.readParcelable(DeleteError.class.getClassLoader()), parcel.readString(), (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final DeleteError[] newArray(int i12) {
                return new DeleteError[i12];
            }
        }

        public DeleteError(@k ReviewData reviewData, @l String str, @k Throwable th2) {
            super(reviewData, null);
            this.f246893b = reviewData;
            this.f246894c = str;
            this.f246895d = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteError)) {
                return false;
            }
            DeleteError deleteError = (DeleteError) obj;
            return L.f(this.f246893b, deleteError.f246893b) && L.f(this.f246894c, deleteError.f246894c) && L.f(this.f246895d, deleteError.f246895d);
        }

        public final int hashCode() {
            int iHashCode = this.f246893b.hashCode() * 31;
            String str = this.f246894c;
            return this.f246895d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeleteError(reviewData=");
            sb2.append(this.f246893b);
            sb2.append(", message=");
            sb2.append(this.f246894c);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f246895d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f246893b, i12);
            parcel.writeString(this.f246894c);
            parcel.writeSerializable(this.f246895d);
        }
    }

    /* compiled from: ReviewReplyState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$DeleteResult;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteResult extends ReviewReplyState {

        @k
        public static final Parcelable.Creator<DeleteResult> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewData f246896b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f246897c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Button f246898d;

        /* compiled from: ReviewReplyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeleteResult> {
            @Override // android.os.Parcelable.Creator
            public final DeleteResult createFromParcel(Parcel parcel) {
                return new DeleteResult((ReviewData) parcel.readParcelable(DeleteResult.class.getClassLoader()), parcel.readString(), (Button) parcel.readParcelable(DeleteResult.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DeleteResult[] newArray(int i12) {
                return new DeleteResult[i12];
            }
        }

        public DeleteResult(@k ReviewData reviewData, @k String str, @l Button button) {
            super(reviewData, null);
            this.f246896b = reviewData;
            this.f246897c = str;
            this.f246898d = button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteResult)) {
                return false;
            }
            DeleteResult deleteResult = (DeleteResult) obj;
            return L.f(this.f246896b, deleteResult.f246896b) && L.f(this.f246897c, deleteResult.f246897c) && L.f(this.f246898d, deleteResult.f246898d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f246896b.hashCode() * 31, 31, this.f246897c);
            Button button = this.f246898d;
            return iD2 + (button == null ? 0 : button.hashCode());
        }

        @k
        public final String toString() {
            return "DeleteResult(reviewData=" + this.f246896b + ", message=" + this.f246897c + ", action=" + this.f246898d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f246896b, i12);
            parcel.writeString(this.f246897c);
            parcel.writeParcelable(this.f246898d, i12);
        }
    }

    /* compiled from: ReviewReplyState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$Error;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends ReviewReplyState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewData f246899b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Throwable f246900c;

        /* compiled from: ReviewReplyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error((ReviewData) parcel.readParcelable(Error.class.getClassLoader()), (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@k ReviewData reviewData, @k Throwable th2) {
            super(reviewData, null);
            this.f246899b = reviewData;
            this.f246900c = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f246899b, error.f246899b) && L.f(this.f246900c, error.f246900c);
        }

        public final int hashCode() {
            return this.f246900c.hashCode() + (this.f246899b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(reviewData=");
            sb2.append(this.f246899b);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f246900c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f246899b, i12);
            parcel.writeSerializable(this.f246900c);
        }
    }

    /* compiled from: ReviewReplyState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$Loading;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends ReviewReplyState {

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewData f246901b;

        /* compiled from: ReviewReplyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                return new Loading((ReviewData) parcel.readParcelable(Loading.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading(@k ReviewData reviewData) {
            super(reviewData, null);
            this.f246901b = reviewData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f246901b, ((Loading) obj).f246901b);
        }

        public final int hashCode() {
            return this.f246901b.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(reviewData=" + this.f246901b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f246901b, i12);
        }
    }

    /* compiled from: ReviewReplyState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$Result;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Result extends ReviewReplyState {

        @k
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewData f246902b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f246903c;

        /* compiled from: ReviewReplyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                return new Result((ReviewData) parcel.readParcelable(Result.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i12) {
                return new Result[i12];
            }
        }

        public Result(@k ReviewData reviewData, @k String str) {
            super(reviewData, null);
            this.f246902b = reviewData;
            this.f246903c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return L.f(this.f246902b, result.f246902b) && L.f(this.f246903c, result.f246903c);
        }

        public final int hashCode() {
            return this.f246903c.hashCode() + (this.f246902b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Result(reviewData=");
            sb2.append(this.f246902b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f246903c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f246902b, i12);
            parcel.writeString(this.f246903c);
        }
    }

    /* compiled from: ReviewReplyState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$RevertError;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RevertError extends ReviewReplyState {

        @k
        public static final Parcelable.Creator<RevertError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewData f246904b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Throwable f246905c;

        /* compiled from: ReviewReplyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RevertError> {
            @Override // android.os.Parcelable.Creator
            public final RevertError createFromParcel(Parcel parcel) {
                return new RevertError((ReviewData) parcel.readParcelable(RevertError.class.getClassLoader()), (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final RevertError[] newArray(int i12) {
                return new RevertError[i12];
            }
        }

        public RevertError(@k ReviewData reviewData, @k Throwable th2) {
            super(reviewData, null);
            this.f246904b = reviewData;
            this.f246905c = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RevertError)) {
                return false;
            }
            RevertError revertError = (RevertError) obj;
            return L.f(this.f246904b, revertError.f246904b) && L.f(this.f246905c, revertError.f246905c);
        }

        public final int hashCode() {
            return this.f246905c.hashCode() + (this.f246904b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RevertError(reviewData=");
            sb2.append(this.f246904b);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f246905c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f246904b, i12);
            parcel.writeSerializable(this.f246905c);
        }
    }

    /* compiled from: ReviewReplyState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/ReviewReplyState$RevertResult;", "Lcom/avito/android/rating/details/answer/upload/ReviewReplyState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RevertResult extends ReviewReplyState {

        @k
        public static final Parcelable.Creator<RevertResult> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReviewData f246906b;

        /* compiled from: ReviewReplyState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RevertResult> {
            @Override // android.os.Parcelable.Creator
            public final RevertResult createFromParcel(Parcel parcel) {
                return new RevertResult((ReviewData) parcel.readParcelable(RevertResult.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RevertResult[] newArray(int i12) {
                return new RevertResult[i12];
            }
        }

        public RevertResult(@k ReviewData reviewData) {
            super(reviewData, null);
            this.f246906b = reviewData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RevertResult) && L.f(this.f246906b, ((RevertResult) obj).f246906b);
        }

        public final int hashCode() {
            return this.f246906b.hashCode();
        }

        @k
        public final String toString() {
            return "RevertResult(reviewData=" + this.f246906b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f246906b, i12);
        }
    }

    public ReviewReplyState(ReviewData reviewData, C42822w c42822w) {
    }
}

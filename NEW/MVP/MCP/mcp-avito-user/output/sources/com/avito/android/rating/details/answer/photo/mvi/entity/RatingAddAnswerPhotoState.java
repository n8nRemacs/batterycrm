package com.avito.android.rating.details.answer.photo.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerPhotoState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingAddAnswerPhotoState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f246738b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f246739c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f246740d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f246736e = new a(null);

    @k
    public static final Parcelable.Creator<RatingAddAnswerPhotoState> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final RatingAddAnswerPhotoState f246737f = new RatingAddAnswerPhotoState(C42784z0.f406748b, false, true);

    /* compiled from: RatingAddAnswerPhotoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoState$a;", "", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingAddAnswerPhotoState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RatingAddAnswerPhotoState> {
        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerPhotoState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new RatingAddAnswerPhotoState(arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAddAnswerPhotoState[] newArray(int i12) {
            return new RatingAddAnswerPhotoState[i12];
        }
    }

    public RatingAddAnswerPhotoState(@k List<Long> list, boolean z12, boolean z13) {
        this.f246738b = list;
        this.f246739c = z12;
        this.f246740d = z13;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public static RatingAddAnswerPhotoState a(RatingAddAnswerPhotoState ratingAddAnswerPhotoState, boolean z12, boolean z13) {
        ?? r02 = ratingAddAnswerPhotoState.f246738b;
        ratingAddAnswerPhotoState.getClass();
        return new RatingAddAnswerPhotoState(r02, z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingAddAnswerPhotoState)) {
            return false;
        }
        RatingAddAnswerPhotoState ratingAddAnswerPhotoState = (RatingAddAnswerPhotoState) obj;
        return L.f(this.f246738b, ratingAddAnswerPhotoState.f246738b) && this.f246739c == ratingAddAnswerPhotoState.f246739c && this.f246740d == ratingAddAnswerPhotoState.f246740d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246740d) + r.i(this.f246738b.hashCode() * 31, 31, this.f246739c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingAddAnswerPhotoState(photoIds=");
        sb2.append(this.f246738b);
        sb2.append(", isLoading=");
        sb2.append(this.f246739c);
        sb2.append(", isClickable=");
        return r.x(sb2, this.f246740d, ')');
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ?? r42 = this.f246738b;
        parcel.writeInt(r42.size());
        Iterator it = r42.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
        parcel.writeInt(this.f246739c ? 1 : 0);
        parcel.writeInt(this.f246740d ? 1 : 0);
    }
}

package com.avito.android.user_adverts.tab_screens.adverts.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsListNextPageDomain.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertsListNextPageDomain;", "Landroid/os/Parcelable;", "ByOffset", "Empty", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertsListNextPageDomain$ByOffset;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertsListNextPageDomain$Empty;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertsListNextPageDomain extends Parcelable {

    /* compiled from: UserAdvertsListNextPageDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertsListNextPageDomain$ByOffset;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertsListNextPageDomain;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ByOffset implements UserAdvertsListNextPageDomain {

        @k
        public static final Parcelable.Creator<ByOffset> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315012b;

        /* compiled from: UserAdvertsListNextPageDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ByOffset> {
            @Override // android.os.Parcelable.Creator
            public final ByOffset createFromParcel(Parcel parcel) {
                return new ByOffset(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ByOffset[] newArray(int i12) {
                return new ByOffset[i12];
            }
        }

        public ByOffset(@k String str) {
            this.f315012b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ByOffset) && L.f(this.f315012b, ((ByOffset) obj).f315012b);
        }

        public final int hashCode() {
            return this.f315012b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ByOffset(nextPageOffset="), this.f315012b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315012b);
        }
    }

    /* compiled from: UserAdvertsListNextPageDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertsListNextPageDomain$Empty;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertsListNextPageDomain;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty implements UserAdvertsListNextPageDomain {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Empty f315013b = new Empty();

        @k
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        /* compiled from: UserAdvertsListNextPageDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Empty> {
            @Override // android.os.Parcelable.Creator
            public final Empty createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Empty.f315013b;
            }

            @Override // android.os.Parcelable.Creator
            public final Empty[] newArray(int i12) {
                return new Empty[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 900309408;
        }

        @k
        public final String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}

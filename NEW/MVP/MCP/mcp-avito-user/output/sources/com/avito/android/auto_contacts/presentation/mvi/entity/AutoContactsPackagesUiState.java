package com.avito.android.auto_contacts.presentation.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoContactsPackagesUiState.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "Error", "Loading", "Success", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState$Error;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState$Loading;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState$Success;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutoContactsPackagesUiState extends q implements Parcelable {

    /* compiled from: AutoContactsPackagesUiState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState$Error;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Error extends AutoContactsPackagesUiState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f94955b;

        /* compiled from: AutoContactsPackagesUiState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@k String str) {
            super(null);
            this.f94955b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f94955b, ((Error) obj).f94955b);
        }

        public final int hashCode() {
            return this.f94955b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f94955b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f94955b);
        }
    }

    /* compiled from: AutoContactsPackagesUiState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState$Loading;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Loading extends AutoContactsPackagesUiState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f94956b = new Loading();

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: AutoContactsPackagesUiState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f94956b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: AutoContactsPackagesUiState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState$Success;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesUiState;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Success extends AutoContactsPackagesUiState {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoContactsPackagesState f94957b;

        /* compiled from: AutoContactsPackagesUiState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(AutoContactsPackagesState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@k AutoContactsPackagesState autoContactsPackagesState) {
            super(null);
            this.f94957b = autoContactsPackagesState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && L.f(this.f94957b, ((Success) obj).f94957b);
        }

        public final int hashCode() {
            return this.f94957b.hashCode();
        }

        @k
        public final String toString() {
            return "Success(data=" + this.f94957b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f94957b.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ AutoContactsPackagesUiState(C42822w c42822w) {
        this();
    }

    public AutoContactsPackagesUiState() {
    }
}

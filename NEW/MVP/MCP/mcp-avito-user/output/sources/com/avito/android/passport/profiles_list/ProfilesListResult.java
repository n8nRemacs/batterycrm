package com.avito.android.passport.profiles_list;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/passport/profiles_list/ProfilesListResult;", "Landroid/os/Parcelable;", "Cancelled", "CreateSuccess", "MergeSuccess", "SwitchSuccess", "Lcom/avito/android/passport/profiles_list/ProfilesListResult$Cancelled;", "Lcom/avito/android/passport/profiles_list/ProfilesListResult$CreateSuccess;", "Lcom/avito/android/passport/profiles_list/ProfilesListResult$MergeSuccess;", "Lcom/avito/android/passport/profiles_list/ProfilesListResult$SwitchSuccess;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProfilesListResult extends Parcelable {

    /* compiled from: ProfilesListResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/ProfilesListResult$Cancelled;", "Lcom/avito/android/passport/profiles_list/ProfilesListResult;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Cancelled implements ProfilesListResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Cancelled f213742b = new Cancelled();

        @Y61.k
        public static final Parcelable.Creator<Cancelled> CREATOR = new a();

        /* compiled from: ProfilesListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cancelled> {
            @Override // android.os.Parcelable.Creator
            public final Cancelled createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cancelled.f213742b;
            }

            @Override // android.os.Parcelable.Creator
            public final Cancelled[] newArray(int i12) {
                return new Cancelled[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ProfilesListResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/ProfilesListResult$CreateSuccess;", "Lcom/avito/android/passport/profiles_list/ProfilesListResult;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class CreateSuccess implements ProfilesListResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CreateSuccess f213743b = new CreateSuccess();

        @Y61.k
        public static final Parcelable.Creator<CreateSuccess> CREATOR = new a();

        /* compiled from: ProfilesListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CreateSuccess> {
            @Override // android.os.Parcelable.Creator
            public final CreateSuccess createFromParcel(Parcel parcel) {
                parcel.readInt();
                return CreateSuccess.f213743b;
            }

            @Override // android.os.Parcelable.Creator
            public final CreateSuccess[] newArray(int i12) {
                return new CreateSuccess[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ProfilesListResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/ProfilesListResult$MergeSuccess;", "Lcom/avito/android/passport/profiles_list/ProfilesListResult;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class MergeSuccess implements ProfilesListResult {

        @Y61.k
        public static final Parcelable.Creator<MergeSuccess> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final PrintableText f213744b;

        /* compiled from: ProfilesListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MergeSuccess> {
            @Override // android.os.Parcelable.Creator
            public final MergeSuccess createFromParcel(Parcel parcel) {
                return new MergeSuccess((PrintableText) parcel.readParcelable(MergeSuccess.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MergeSuccess[] newArray(int i12) {
                return new MergeSuccess[i12];
            }
        }

        public MergeSuccess(@Y61.l PrintableText printableText) {
            this.f213744b = printableText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MergeSuccess) && L.f(this.f213744b, ((MergeSuccess) obj).f213744b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f213744b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("MergeSuccess(mergeSuccessText="), this.f213744b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f213744b, i12);
        }
    }

    /* compiled from: ProfilesListResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profiles_list/ProfilesListResult$SwitchSuccess;", "Lcom/avito/android/passport/profiles_list/ProfilesListResult;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class SwitchSuccess implements ProfilesListResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final SwitchSuccess f213745b = new SwitchSuccess();

        @Y61.k
        public static final Parcelable.Creator<SwitchSuccess> CREATOR = new a();

        /* compiled from: ProfilesListResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SwitchSuccess> {
            @Override // android.os.Parcelable.Creator
            public final SwitchSuccess createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SwitchSuccess.f213745b;
            }

            @Override // android.os.Parcelable.Creator
            public final SwitchSuccess[] newArray(int i12) {
                return new SwitchSuccess[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}

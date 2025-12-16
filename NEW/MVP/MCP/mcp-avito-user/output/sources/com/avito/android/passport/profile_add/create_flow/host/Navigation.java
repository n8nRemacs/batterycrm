package com.avito.android.passport.profile_add.create_flow.host;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavigationScreen.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "Landroid/os/Parcelable;", "Back", "Close", "SelectSpecific", "SelectVertical", "SetProfileName", "VerificationPopup", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$Back;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$Close;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$SelectSpecific;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$SelectVertical;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$SetProfileName;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$VerificationPopup;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Navigation extends Parcelable {

    /* compiled from: NavigationScreen.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$Back;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Back implements Navigation {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f211366b = new Back();

        @k
        public static final Parcelable.Creator<Back> CREATOR = new a();

        /* compiled from: NavigationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Back> {
            @Override // android.os.Parcelable.Creator
            public final Back createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Back.f211366b;
            }

            @Override // android.os.Parcelable.Creator
            public final Back[] newArray(int i12) {
                return new Back[i12];
            }
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

    /* compiled from: NavigationScreen.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$Close;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements Navigation {

        @k
        public static final Parcelable.Creator<Close> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f211367b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ExtendedProfileCreationResult f211368c;

        /* compiled from: NavigationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Close> {
            @Override // android.os.Parcelable.Creator
            public final Close createFromParcel(Parcel parcel) {
                return new Close(parcel.readInt() != 0, (ExtendedProfileCreationResult) parcel.readParcelable(Close.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Close[] newArray(int i12) {
                return new Close[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Close() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Close)) {
                return false;
            }
            Close close = (Close) obj;
            return this.f211367b == close.f211367b && L.f(this.f211368c, close.f211368c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f211367b) * 31;
            ExtendedProfileCreationResult extendedProfileCreationResult = this.f211368c;
            return iHashCode + (extendedProfileCreationResult == null ? 0 : extendedProfileCreationResult.hashCode());
        }

        @k
        public final String toString() {
            return "Close(resultOk=" + this.f211367b + ", result=" + this.f211368c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f211367b ? 1 : 0);
            parcel.writeParcelable(this.f211368c, i12);
        }

        public Close(boolean z12, @l ExtendedProfileCreationResult extendedProfileCreationResult) {
            this.f211367b = z12;
            this.f211368c = extendedProfileCreationResult;
        }

        public /* synthetic */ Close(boolean z12, ExtendedProfileCreationResult extendedProfileCreationResult, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : extendedProfileCreationResult);
        }
    }

    /* compiled from: NavigationScreen.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$SelectSpecific;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectSpecific implements Navigation {

        @k
        public static final Parcelable.Creator<SelectSpecific> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectSpecificArguments f211369b;

        /* compiled from: NavigationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelectSpecific> {
            @Override // android.os.Parcelable.Creator
            public final SelectSpecific createFromParcel(Parcel parcel) {
                return new SelectSpecific(SelectSpecificArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SelectSpecific[] newArray(int i12) {
                return new SelectSpecific[i12];
            }
        }

        public SelectSpecific(@k SelectSpecificArguments selectSpecificArguments) {
            this.f211369b = selectSpecificArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectSpecific) && L.f(this.f211369b, ((SelectSpecific) obj).f211369b);
        }

        public final int hashCode() {
            return this.f211369b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectSpecific(args=" + this.f211369b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f211369b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: NavigationScreen.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$SelectVertical;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectVertical implements Navigation {

        @k
        public static final Parcelable.Creator<SelectVertical> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectVerticalArguments f211370b;

        /* compiled from: NavigationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelectVertical> {
            @Override // android.os.Parcelable.Creator
            public final SelectVertical createFromParcel(Parcel parcel) {
                return new SelectVertical(SelectVerticalArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SelectVertical[] newArray(int i12) {
                return new SelectVertical[i12];
            }
        }

        public SelectVertical(@k SelectVerticalArguments selectVerticalArguments) {
            this.f211370b = selectVerticalArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectVertical) && L.f(this.f211370b, ((SelectVertical) obj).f211370b);
        }

        public final int hashCode() {
            return this.f211370b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectVertical(args=" + this.f211370b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f211370b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: NavigationScreen.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$SetProfileName;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetProfileName implements Navigation {

        @k
        public static final Parcelable.Creator<SetProfileName> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SetProfileNameArgs f211371b;

        /* compiled from: NavigationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SetProfileName> {
            @Override // android.os.Parcelable.Creator
            public final SetProfileName createFromParcel(Parcel parcel) {
                return new SetProfileName(SetProfileNameArgs.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SetProfileName[] newArray(int i12) {
                return new SetProfileName[i12];
            }
        }

        public SetProfileName(@k SetProfileNameArgs setProfileNameArgs) {
            this.f211371b = setProfileNameArgs;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetProfileName) && L.f(this.f211371b, ((SetProfileName) obj).f211371b);
        }

        public final int hashCode() {
            return this.f211371b.hashCode();
        }

        @k
        public final String toString() {
            return "SetProfileName(args=" + this.f211371b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f211371b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: NavigationScreen.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/host/Navigation$VerificationPopup;", "Lcom/avito/android/passport/profile_add/create_flow/host/Navigation;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerificationPopup implements Navigation {

        @k
        public static final Parcelable.Creator<VerificationPopup> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationPopupArguments f211372b;

        /* compiled from: NavigationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VerificationPopup> {
            @Override // android.os.Parcelable.Creator
            public final VerificationPopup createFromParcel(Parcel parcel) {
                return new VerificationPopup(VerificationPopupArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final VerificationPopup[] newArray(int i12) {
                return new VerificationPopup[i12];
            }
        }

        public VerificationPopup(@k VerificationPopupArguments verificationPopupArguments) {
            this.f211372b = verificationPopupArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerificationPopup) && L.f(this.f211372b, ((VerificationPopup) obj).f211372b);
        }

        public final int hashCode() {
            return this.f211372b.hashCode();
        }

        @k
        public final String toString() {
            return "VerificationPopup(args=" + this.f211372b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f211372b.writeToParcel(parcel, i12);
        }
    }
}

package com.avito.android.mortgage_invite;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.contact_info.model.ApplicationContactInfoArguments;
import com.avito.android.mortgage_invite.lead.model.ApplicationLeadArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageInviteFragmentParams.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams;", "Landroid/os/Parcelable;", "ApplicationLead", "ClientForm", "ContactInfo", "Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams$ApplicationLead;", "Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams$ClientForm;", "Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams$ContactInfo;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MortgageInviteFragmentParams extends Parcelable {

    /* compiled from: MortgageInviteFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams$ApplicationLead;", "Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ApplicationLead implements MortgageInviteFragmentParams {

        @k
        public static final Parcelable.Creator<ApplicationLead> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicationLeadArguments f205010b;

        /* compiled from: MortgageInviteFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ApplicationLead> {
            @Override // android.os.Parcelable.Creator
            public final ApplicationLead createFromParcel(Parcel parcel) {
                return new ApplicationLead(ApplicationLeadArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ApplicationLead[] newArray(int i12) {
                return new ApplicationLead[i12];
            }
        }

        public ApplicationLead(@k ApplicationLeadArguments applicationLeadArguments) {
            this.f205010b = applicationLeadArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationLead) && L.f(this.f205010b, ((ApplicationLead) obj).f205010b);
        }

        public final int hashCode() {
            return this.f205010b.hashCode();
        }

        @k
        public final String toString() {
            return "ApplicationLead(arguments=" + this.f205010b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f205010b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageInviteFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams$ClientForm;", "Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ClientForm implements MortgageInviteFragmentParams {

        @k
        public static final Parcelable.Creator<ClientForm> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicationClientFormArguments f205011b;

        /* compiled from: MortgageInviteFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClientForm> {
            @Override // android.os.Parcelable.Creator
            public final ClientForm createFromParcel(Parcel parcel) {
                return new ClientForm(ApplicationClientFormArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ClientForm[] newArray(int i12) {
                return new ClientForm[i12];
            }
        }

        public ClientForm(@k ApplicationClientFormArguments applicationClientFormArguments) {
            this.f205011b = applicationClientFormArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientForm) && L.f(this.f205011b, ((ClientForm) obj).f205011b);
        }

        public final int hashCode() {
            return this.f205011b.hashCode();
        }

        @k
        public final String toString() {
            return "ClientForm(arguments=" + this.f205011b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f205011b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageInviteFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams$ContactInfo;", "Lcom/avito/android/mortgage_invite/MortgageInviteFragmentParams;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ContactInfo implements MortgageInviteFragmentParams {

        @k
        public static final Parcelable.Creator<ContactInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApplicationContactInfoArguments f205012b;

        /* compiled from: MortgageInviteFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContactInfo> {
            @Override // android.os.Parcelable.Creator
            public final ContactInfo createFromParcel(Parcel parcel) {
                return new ContactInfo(ApplicationContactInfoArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ContactInfo[] newArray(int i12) {
                return new ContactInfo[i12];
            }
        }

        public ContactInfo(@k ApplicationContactInfoArguments applicationContactInfoArguments) {
            this.f205012b = applicationContactInfoArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactInfo) && L.f(this.f205012b, ((ContactInfo) obj).f205012b);
        }

        public final int hashCode() {
            return this.f205012b.hashCode();
        }

        @k
        public final String toString() {
            return "ContactInfo(arguments=" + this.f205012b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f205012b.writeToParcel(parcel, i12);
        }
    }
}

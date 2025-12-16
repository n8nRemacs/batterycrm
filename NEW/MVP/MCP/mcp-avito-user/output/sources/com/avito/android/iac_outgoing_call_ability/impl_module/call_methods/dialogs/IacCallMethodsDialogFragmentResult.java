package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacShowCallMethodsDialogSheetLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacCallMethodsDialogFragmentResult.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "OnCallMethodsDialogCanceled", "OnInAppCallMethodSelected", "OnOnboardingClicked", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult$OnCallMethodsDialogCanceled;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult$OnInAppCallMethodSelected;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult$OnOnboardingClicked;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacCallMethodsDialogFragmentResult implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f168451b = new a(null);

    /* compiled from: IacCallMethodsDialogFragmentResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult$OnCallMethodsDialogCanceled;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OnCallMethodsDialogCanceled extends IacCallMethodsDialogFragmentResult {

        @k
        public static final Parcelable.Creator<OnCallMethodsDialogCanceled> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final IacShowCallMethodsDialogSheetLink f168452c;

        /* compiled from: IacCallMethodsDialogFragmentResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnCallMethodsDialogCanceled> {
            @Override // android.os.Parcelable.Creator
            public final OnCallMethodsDialogCanceled createFromParcel(Parcel parcel) {
                return new OnCallMethodsDialogCanceled((IacShowCallMethodsDialogSheetLink) parcel.readParcelable(OnCallMethodsDialogCanceled.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnCallMethodsDialogCanceled[] newArray(int i12) {
                return new OnCallMethodsDialogCanceled[i12];
            }
        }

        public OnCallMethodsDialogCanceled(@k IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink) {
            super(null);
            this.f168452c = iacShowCallMethodsDialogSheetLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCallMethodsDialogCanceled) && L.f(this.f168452c, ((OnCallMethodsDialogCanceled) obj).f168452c);
        }

        public final int hashCode() {
            return this.f168452c.hashCode();
        }

        @k
        public final String toString() {
            return "OnCallMethodsDialogCanceled(link=" + this.f168452c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f168452c, i12);
        }
    }

    /* compiled from: IacCallMethodsDialogFragmentResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult$OnInAppCallMethodSelected;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OnInAppCallMethodSelected extends IacCallMethodsDialogFragmentResult {

        @k
        public static final Parcelable.Creator<OnInAppCallMethodSelected> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final IacShowCallMethodsDialogSheetLink f168453c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f168454d;

        /* compiled from: IacCallMethodsDialogFragmentResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnInAppCallMethodSelected> {
            @Override // android.os.Parcelable.Creator
            public final OnInAppCallMethodSelected createFromParcel(Parcel parcel) {
                return new OnInAppCallMethodSelected((IacShowCallMethodsDialogSheetLink) parcel.readParcelable(OnInAppCallMethodSelected.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final OnInAppCallMethodSelected[] newArray(int i12) {
                return new OnInAppCallMethodSelected[i12];
            }
        }

        public OnInAppCallMethodSelected(@k IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink, boolean z12) {
            super(null);
            this.f168453c = iacShowCallMethodsDialogSheetLink;
            this.f168454d = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInAppCallMethodSelected)) {
                return false;
            }
            OnInAppCallMethodSelected onInAppCallMethodSelected = (OnInAppCallMethodSelected) obj;
            return L.f(this.f168453c, onInAppCallMethodSelected.f168453c) && this.f168454d == onInAppCallMethodSelected.f168454d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f168454d) + (this.f168453c.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnInAppCallMethodSelected(link=");
            sb2.append(this.f168453c);
            sb2.append(", isVideo=");
            return r.x(sb2, this.f168454d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f168453c, i12);
            parcel.writeInt(this.f168454d ? 1 : 0);
        }
    }

    /* compiled from: IacCallMethodsDialogFragmentResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult$OnOnboardingClicked;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OnOnboardingClicked extends IacCallMethodsDialogFragmentResult {

        @k
        public static final Parcelable.Creator<OnOnboardingClicked> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final IacShowCallMethodsDialogSheetLink f168455c;

        /* compiled from: IacCallMethodsDialogFragmentResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnOnboardingClicked> {
            @Override // android.os.Parcelable.Creator
            public final OnOnboardingClicked createFromParcel(Parcel parcel) {
                return new OnOnboardingClicked((IacShowCallMethodsDialogSheetLink) parcel.readParcelable(OnOnboardingClicked.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OnOnboardingClicked[] newArray(int i12) {
                return new OnOnboardingClicked[i12];
            }
        }

        public OnOnboardingClicked(@k IacShowCallMethodsDialogSheetLink iacShowCallMethodsDialogSheetLink) {
            super(null);
            this.f168455c = iacShowCallMethodsDialogSheetLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOnboardingClicked) && L.f(this.f168455c, ((OnOnboardingClicked) obj).f168455c);
        }

        public final int hashCode() {
            return this.f168455c.hashCode();
        }

        @k
        public final String toString() {
            return "OnOnboardingClicked(link=" + this.f168455c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f168455c, i12);
        }
    }

    /* compiled from: IacCallMethodsDialogFragmentResult.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/dialogs/IacCallMethodsDialogFragmentResult$a;", "", "<init>", "()V", "", "BUNDLE_KEY", "Ljava/lang/String;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ IacCallMethodsDialogFragmentResult(C42822w c42822w) {
        this();
    }

    public IacCallMethodsDialogFragmentResult() {
    }
}

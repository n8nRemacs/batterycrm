package com.avito.android.passport.profile_add.create_flow;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileCreationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/ExtendedProfileCreationResult;", "Landroid/os/Parcelable;", "()V", "OnlySelectVerticalAndSpecific", "Success", "Lcom/avito/android/passport/profile_add/create_flow/ExtendedProfileCreationResult$OnlySelectVerticalAndSpecific;", "Lcom/avito/android/passport/profile_add/create_flow/ExtendedProfileCreationResult$Success;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ExtendedProfileCreationResult implements Parcelable {

    /* compiled from: ExtendedProfileCreationResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/ExtendedProfileCreationResult$OnlySelectVerticalAndSpecific;", "Lcom/avito/android/passport/profile_add/create_flow/ExtendedProfileCreationResult;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnlySelectVerticalAndSpecific extends ExtendedProfileCreationResult {

        @k
        public static final Parcelable.Creator<OnlySelectVerticalAndSpecific> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f211330b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f211331c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f211332d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f211333e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f211334f;

        /* compiled from: ExtendedProfileCreationResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnlySelectVerticalAndSpecific> {
            @Override // android.os.Parcelable.Creator
            public final OnlySelectVerticalAndSpecific createFromParcel(Parcel parcel) {
                return new OnlySelectVerticalAndSpecific(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final OnlySelectVerticalAndSpecific[] newArray(int i12) {
                return new OnlySelectVerticalAndSpecific[i12];
            }
        }

        public /* synthetic */ OnlySelectVerticalAndSpecific(int i12, String str, Integer num, String str2, boolean z12, int i13, C42822w c42822w) {
            this(i12, (i13 & 4) != 0 ? null : num, str, (i13 & 8) != 0 ? null : str2, z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlySelectVerticalAndSpecific)) {
                return false;
            }
            OnlySelectVerticalAndSpecific onlySelectVerticalAndSpecific = (OnlySelectVerticalAndSpecific) obj;
            return this.f211330b == onlySelectVerticalAndSpecific.f211330b && L.f(this.f211331c, onlySelectVerticalAndSpecific.f211331c) && L.f(this.f211332d, onlySelectVerticalAndSpecific.f211332d) && L.f(this.f211333e, onlySelectVerticalAndSpecific.f211333e) && this.f211334f == onlySelectVerticalAndSpecific.f211334f;
        }

        public final int hashCode() {
            int iD2 = H.d(Integer.hashCode(this.f211330b) * 31, 31, this.f211331c);
            Integer num = this.f211332d;
            int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f211333e;
            return Boolean.hashCode(this.f211334f) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnlySelectVerticalAndSpecific(verticalId=");
            sb2.append(this.f211330b);
            sb2.append(", verticalTitle=");
            sb2.append(this.f211331c);
            sb2.append(", specificId=");
            sb2.append(this.f211332d);
            sb2.append(", specificTitle=");
            sb2.append(this.f211333e);
            sb2.append(", hasMultipleSpecifics=");
            return r.x(sb2, this.f211334f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f211330b);
            parcel.writeString(this.f211331c);
            Integer num = this.f211332d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f211333e);
            parcel.writeInt(this.f211334f ? 1 : 0);
        }

        public OnlySelectVerticalAndSpecific(int i12, @l Integer num, @k String str, @l String str2, boolean z12) {
            super(null);
            this.f211330b = i12;
            this.f211331c = str;
            this.f211332d = num;
            this.f211333e = str2;
            this.f211334f = z12;
        }
    }

    /* compiled from: ExtendedProfileCreationResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/ExtendedProfileCreationResult$Success;", "Lcom/avito/android/passport/profile_add/create_flow/ExtendedProfileCreationResult;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends ExtendedProfileCreationResult {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f211335b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f211336c;

        /* compiled from: ExtendedProfileCreationResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((PrintableText) parcel.readParcelable(Success.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Success() {
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
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.f211335b == success.f211335b && L.f(this.f211336c, success.f211336c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f211335b) * 31;
            PrintableText printableText = this.f211336c;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(isProfileFinalized=");
            sb2.append(this.f211335b);
            sb2.append(", mergeSuccessText=");
            return AK.c.m(sb2, this.f211336c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f211335b ? 1 : 0);
            parcel.writeParcelable(this.f211336c, i12);
        }

        public /* synthetic */ Success(boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : printableText, (i12 & 1) != 0 ? false : z12);
        }

        public Success(@l PrintableText printableText, boolean z12) {
            super(null);
            this.f211335b = z12;
            this.f211336c = printableText;
        }
    }

    public /* synthetic */ ExtendedProfileCreationResult(C42822w c42822w) {
        this();
    }

    public ExtendedProfileCreationResult() {
    }
}

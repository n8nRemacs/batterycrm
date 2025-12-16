package com.avito.android.profile_management_core.images.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UploadImageState.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Landroid/os/Parcelable;", "ModerationFailed", "ModerationPassed", "ModerationPending", "Selected", "Set", "Setting", "SettingError", "Uploaded", "Uploading", "UploadingError", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$ModerationFailed;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$ModerationPassed;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$ModerationPending;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Selected;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Set;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Setting;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$SettingError;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Uploaded;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Uploading;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState$UploadingError;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface UploadImageState extends Parcelable {

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$ModerationFailed;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/a;", "Lcom/avito/android/profile_management_core/images/entity/l;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ModerationFailed implements UploadImageState, com.avito.android.profile_management_core.images.entity.a, l {

        @Y61.k
        public static final Parcelable.Creator<ModerationFailed> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f226697b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f226698c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f226699d;

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ModerationFailed> {
            @Override // android.os.Parcelable.Creator
            public final ModerationFailed createFromParcel(Parcel parcel) {
                return new ModerationFailed(parcel.readString(), (AttributedText) parcel.readParcelable(ModerationFailed.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModerationFailed[] newArray(int i12) {
                return new ModerationFailed[i12];
            }
        }

        public ModerationFailed(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l String str2) {
            this.f226697b = str;
            this.f226698c = attributedText;
            this.f226699d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModerationFailed)) {
                return false;
            }
            ModerationFailed moderationFailed = (ModerationFailed) obj;
            return L.f(this.f226697b, moderationFailed.f226697b) && L.f(this.f226698c, moderationFailed.f226698c) && L.f(this.f226699d, moderationFailed.f226699d);
        }

        public final int hashCode() {
            String str = this.f226697b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.f226698c;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str2 = this.f226699d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModerationFailed(title=");
            sb2.append(this.f226697b);
            sb2.append(", description=");
            sb2.append(this.f226698c);
            sb2.append(", rawModerationStatus=");
            return C22026a.c(sb2, this.f226699d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f226697b);
            parcel.writeParcelable(this.f226698c, i12);
            parcel.writeString(this.f226699d);
        }
    }

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$ModerationPassed;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/k;", "Lcom/avito/android/profile_management_core/images/entity/l;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ModerationPassed implements UploadImageState, k, l {

        @Y61.k
        public static final Parcelable.Creator<ModerationPassed> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f226700b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f226701c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f226702d;

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ModerationPassed> {
            @Override // android.os.Parcelable.Creator
            public final ModerationPassed createFromParcel(Parcel parcel) {
                return new ModerationPassed(parcel.readString(), (AttributedText) parcel.readParcelable(ModerationPassed.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModerationPassed[] newArray(int i12) {
                return new ModerationPassed[i12];
            }
        }

        public ModerationPassed(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l String str2) {
            this.f226700b = str;
            this.f226701c = attributedText;
            this.f226702d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModerationPassed)) {
                return false;
            }
            ModerationPassed moderationPassed = (ModerationPassed) obj;
            return L.f(this.f226700b, moderationPassed.f226700b) && L.f(this.f226701c, moderationPassed.f226701c) && L.f(this.f226702d, moderationPassed.f226702d);
        }

        public final int hashCode() {
            String str = this.f226700b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.f226701c;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str2 = this.f226702d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModerationPassed(title=");
            sb2.append(this.f226700b);
            sb2.append(", description=");
            sb2.append(this.f226701c);
            sb2.append(", rawModerationStatus=");
            return C22026a.c(sb2, this.f226702d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f226700b);
            parcel.writeParcelable(this.f226701c, i12);
            parcel.writeString(this.f226702d);
        }
    }

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$ModerationPending;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/a;", "Lcom/avito/android/profile_management_core/images/entity/l;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ModerationPending implements UploadImageState, com.avito.android.profile_management_core.images.entity.a, l {

        @Y61.k
        public static final Parcelable.Creator<ModerationPending> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f226703b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f226704c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f226705d;

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ModerationPending> {
            @Override // android.os.Parcelable.Creator
            public final ModerationPending createFromParcel(Parcel parcel) {
                return new ModerationPending(parcel.readString(), (AttributedText) parcel.readParcelable(ModerationPending.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModerationPending[] newArray(int i12) {
                return new ModerationPending[i12];
            }
        }

        public ModerationPending(@Y61.l String str, @Y61.l AttributedText attributedText, @Y61.l String str2) {
            this.f226703b = str;
            this.f226704c = attributedText;
            this.f226705d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModerationPending)) {
                return false;
            }
            ModerationPending moderationPending = (ModerationPending) obj;
            return L.f(this.f226703b, moderationPending.f226703b) && L.f(this.f226704c, moderationPending.f226704c) && L.f(this.f226705d, moderationPending.f226705d);
        }

        public final int hashCode() {
            String str = this.f226703b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.f226704c;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str2 = this.f226705d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModerationPending(title=");
            sb2.append(this.f226703b);
            sb2.append(", description=");
            sb2.append(this.f226704c);
            sb2.append(", rawModerationStatus=");
            return C22026a.c(sb2, this.f226705d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f226703b);
            parcel.writeParcelable(this.f226704c, i12);
            parcel.writeString(this.f226705d);
        }
    }

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Selected;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "<init>", "()V", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Selected implements UploadImageState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Selected f226706b = new Selected();

        @Y61.k
        public static final Parcelable.Creator<Selected> CREATOR = new a();

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Selected> {
            @Override // android.os.Parcelable.Creator
            public final Selected createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Selected.f226706b;
            }

            @Override // android.os.Parcelable.Creator
            public final Selected[] newArray(int i12) {
                return new Selected[i12];
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

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Set;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/k;", "<init>", "()V", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Set implements UploadImageState, k {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Set f226707b = new Set();

        @Y61.k
        public static final Parcelable.Creator<Set> CREATOR = new a();

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Set> {
            @Override // android.os.Parcelable.Creator
            public final Set createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Set.f226707b;
            }

            @Override // android.os.Parcelable.Creator
            public final Set[] newArray(int i12) {
                return new Set[i12];
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

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Setting;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/j;", "<init>", "()V", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Setting implements UploadImageState, j {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Setting f226708b = new Setting();

        @Y61.k
        public static final Parcelable.Creator<Setting> CREATOR = new a();

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Setting> {
            @Override // android.os.Parcelable.Creator
            public final Setting createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Setting.f226708b;
            }

            @Override // android.os.Parcelable.Creator
            public final Setting[] newArray(int i12) {
                return new Setting[i12];
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

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$SettingError;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/i;", "Lcom/avito/android/profile_management_core/images/entity/j;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SettingError implements UploadImageState, i, j {

        @Y61.k
        public static final Parcelable.Creator<SettingError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f226709b;

        /* renamed from: c, reason: collision with root package name */
        public final long f226710c;

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SettingError> {
            @Override // android.os.Parcelable.Creator
            public final SettingError createFromParcel(Parcel parcel) {
                return new SettingError(parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final SettingError[] newArray(int i12) {
                return new SettingError[i12];
            }
        }

        public SettingError(@Y61.k String str, long j12) {
            this.f226709b = str;
            this.f226710c = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingError)) {
                return false;
            }
            SettingError settingError = (SettingError) obj;
            return L.f(this.f226709b, settingError.f226709b) && this.f226710c == settingError.f226710c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f226710c) + (this.f226709b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SettingError(message=");
            sb2.append(this.f226709b);
            sb2.append(", uploadId=");
            return r.u(sb2, this.f226710c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f226709b);
            parcel.writeLong(this.f226710c);
        }
    }

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Uploaded;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/j;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Uploaded implements UploadImageState, j {

        @Y61.k
        public static final Parcelable.Creator<Uploaded> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f226711b;

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Uploaded> {
            @Override // android.os.Parcelable.Creator
            public final Uploaded createFromParcel(Parcel parcel) {
                return new Uploaded(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Uploaded[] newArray(int i12) {
                return new Uploaded[i12];
            }
        }

        public Uploaded(long j12) {
            this.f226711b = j12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Uploaded) && this.f226711b == ((Uploaded) obj).f226711b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f226711b);
        }

        @Y61.k
        public final String toString() {
            return r.u(new StringBuilder("Uploaded(uploadId="), this.f226711b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f226711b);
        }
    }

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$Uploading;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "<init>", "()V", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Uploading implements UploadImageState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Uploading f226712b = new Uploading();

        @Y61.k
        public static final Parcelable.Creator<Uploading> CREATOR = new a();

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Uploading> {
            @Override // android.os.Parcelable.Creator
            public final Uploading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Uploading.f226712b;
            }

            @Override // android.os.Parcelable.Creator
            public final Uploading[] newArray(int i12) {
                return new Uploading[i12];
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

    /* compiled from: UploadImageState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_management_core/images/entity/UploadImageState$UploadingError;", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "Lcom/avito/android/profile_management_core/images/entity/i;", "<init>", "()V", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadingError implements UploadImageState, i {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final UploadingError f226713b = new UploadingError();

        @Y61.k
        public static final Parcelable.Creator<UploadingError> CREATOR = new a();

        /* compiled from: UploadImageState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UploadingError> {
            @Override // android.os.Parcelable.Creator
            public final UploadingError createFromParcel(Parcel parcel) {
                parcel.readInt();
                return UploadingError.f226713b;
            }

            @Override // android.os.Parcelable.Creator
            public final UploadingError[] newArray(int i12) {
                return new UploadingError[i12];
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

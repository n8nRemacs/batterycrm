package com.avito.android.profile_management_core.moderation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ModerationStatus.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_management_core/moderation/ModerationStatus;", "Landroid/os/Parcelable;", "ModerationFailed", "ModerationPassed", "ModerationPending", "Lcom/avito/android/profile_management_core/moderation/ModerationStatus$ModerationFailed;", "Lcom/avito/android/profile_management_core/moderation/ModerationStatus$ModerationPassed;", "Lcom/avito/android/profile_management_core/moderation/ModerationStatus$ModerationPending;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ModerationStatus implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f226770b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f226771c;

    /* compiled from: ModerationStatus.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/moderation/ModerationStatus$ModerationFailed;", "Lcom/avito/android/profile_management_core/moderation/ModerationStatus;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ModerationFailed extends ModerationStatus {

        @k
        public static final Parcelable.Creator<ModerationFailed> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f226772d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f226773e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f226774f;

        /* compiled from: ModerationStatus.kt */
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

        public ModerationFailed(@l String str, @l AttributedText attributedText, @l String str2) {
            super(str, attributedText, str2, null);
            this.f226772d = str;
            this.f226773e = attributedText;
            this.f226774f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.profile_management_core.moderation.ModerationStatus
        @l
        /* renamed from: getDescription, reason: from getter */
        public final AttributedText getF226771c() {
            return this.f226773e;
        }

        @Override // com.avito.android.profile_management_core.moderation.ModerationStatus
        @l
        /* renamed from: getTitle, reason: from getter */
        public final String getF226770b() {
            return this.f226772d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f226772d);
            parcel.writeParcelable(this.f226773e, i12);
            parcel.writeString(this.f226774f);
        }
    }

    /* compiled from: ModerationStatus.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/moderation/ModerationStatus$ModerationPassed;", "Lcom/avito/android/profile_management_core/moderation/ModerationStatus;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ModerationPassed extends ModerationStatus {

        @k
        public static final Parcelable.Creator<ModerationPassed> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f226775d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f226776e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f226777f;

        /* compiled from: ModerationStatus.kt */
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

        public ModerationPassed(@l String str, @l AttributedText attributedText, @l String str2) {
            super(str, attributedText, str2, null);
            this.f226775d = str;
            this.f226776e = attributedText;
            this.f226777f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.profile_management_core.moderation.ModerationStatus
        @l
        /* renamed from: getDescription, reason: from getter */
        public final AttributedText getF226771c() {
            return this.f226776e;
        }

        @Override // com.avito.android.profile_management_core.moderation.ModerationStatus
        @l
        /* renamed from: getTitle, reason: from getter */
        public final String getF226770b() {
            return this.f226775d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f226775d);
            parcel.writeParcelable(this.f226776e, i12);
            parcel.writeString(this.f226777f);
        }
    }

    /* compiled from: ModerationStatus.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/moderation/ModerationStatus$ModerationPending;", "Lcom/avito/android/profile_management_core/moderation/ModerationStatus;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ModerationPending extends ModerationStatus {

        @k
        public static final Parcelable.Creator<ModerationPending> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f226778d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f226779e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f226780f;

        /* compiled from: ModerationStatus.kt */
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

        public ModerationPending(@l String str, @l AttributedText attributedText, @l String str2) {
            super(str, attributedText, str2, null);
            this.f226778d = str;
            this.f226779e = attributedText;
            this.f226780f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.profile_management_core.moderation.ModerationStatus
        @l
        /* renamed from: getDescription, reason: from getter */
        public final AttributedText getF226771c() {
            return this.f226779e;
        }

        @Override // com.avito.android.profile_management_core.moderation.ModerationStatus
        @l
        /* renamed from: getTitle, reason: from getter */
        public final String getF226770b() {
            return this.f226778d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f226778d);
            parcel.writeParcelable(this.f226779e, i12);
            parcel.writeString(this.f226780f);
        }
    }

    public /* synthetic */ ModerationStatus(String str, AttributedText attributedText, String str2, int i12, C42822w c42822w) {
        this(str, attributedText, (i12 & 4) != 0 ? null : str2, null);
    }

    @l
    /* renamed from: getDescription, reason: from getter */
    public AttributedText getF226771c() {
        return this.f226771c;
    }

    @l
    /* renamed from: getTitle, reason: from getter */
    public String getF226770b() {
        return this.f226770b;
    }

    public ModerationStatus(String str, AttributedText attributedText, String str2, C42822w c42822w) {
        this.f226770b = str;
        this.f226771c = attributedText;
    }
}

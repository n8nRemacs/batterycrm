package com.avito.android.authorization.select_social.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.registration.ProfileSocial;
import kotlin.Metadata;

/* compiled from: SelectSocialField.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/select_social/adapter/SelectSocialField;", "LTV0/a;", "Landroid/os/Parcelable;", "Social", "Text", "Lcom/avito/android/authorization/select_social/adapter/SelectSocialField$Social;", "Lcom/avito/android/authorization/select_social/adapter/SelectSocialField$Text;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface SelectSocialField extends TV0.a, Parcelable {

    /* compiled from: SelectSocialField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_social/adapter/SelectSocialField$Social;", "Lcom/avito/android/authorization/select_social/adapter/SelectSocialField;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Social implements SelectSocialField {

        @Y61.k
        public static final Parcelable.Creator<Social> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f94472b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ProfileSocial f94473c;

        /* compiled from: SelectSocialField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Social> {
            @Override // android.os.Parcelable.Creator
            public final Social createFromParcel(Parcel parcel) {
                return new Social(parcel.readLong(), (ProfileSocial) parcel.readParcelable(Social.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Social[] newArray(int i12) {
                return new Social[i12];
            }
        }

        public Social(long j12, @Y61.k ProfileSocial profileSocial) {
            this.f94472b = j12;
            this.f94473c = profileSocial;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF301522b() {
            return this.f94472b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f94472b);
            parcel.writeParcelable(this.f94473c, i12);
        }
    }

    /* compiled from: SelectSocialField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_social/adapter/SelectSocialField$Text;", "Lcom/avito/android/authorization/select_social/adapter/SelectSocialField;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Text implements SelectSocialField {

        @Y61.k
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f94474b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f94475c;

        /* compiled from: SelectSocialField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Text> {
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                return new Text(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i12) {
                return new Text[i12];
            }
        }

        public Text(long j12, @Y61.k String str) {
            this.f94474b = j12;
            this.f94475c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF301522b() {
            return this.f94474b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeLong(this.f94474b);
            parcel.writeString(this.f94475c);
        }
    }

    /* compiled from: SelectSocialField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }
}

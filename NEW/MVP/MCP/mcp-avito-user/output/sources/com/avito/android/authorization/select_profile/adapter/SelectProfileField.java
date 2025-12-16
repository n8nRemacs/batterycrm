package com.avito.android.authorization.select_profile.adapter;

import AK.c;
import K51.d;
import TV0.a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.registration.RegisteredProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectProfileField.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;", "LTV0/a;", "Landroid/os/Parcelable;", "Profile", "Text", "Title", "Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField$Profile;", "Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField$Text;", "Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField$Title;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface SelectProfileField extends a, Parcelable {

    /* compiled from: SelectProfileField.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField$Profile;", "Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Profile implements SelectProfileField {

        @k
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f94259b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final RegisteredProfile f94260c;

        /* compiled from: SelectProfileField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Profile> {
            @Override // android.os.Parcelable.Creator
            public final Profile createFromParcel(Parcel parcel) {
                return new Profile(parcel.readLong(), (RegisteredProfile) parcel.readParcelable(Profile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Profile[] newArray(int i12) {
                return new Profile[i12];
            }
        }

        public Profile(long j12, @k RegisteredProfile registeredProfile) {
            this.f94259b = j12;
            this.f94260c = registeredProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj;
            return this.f94259b == profile.f94259b && L.f(this.f94260c, profile.f94260c);
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF94264b() {
            return this.f94259b;
        }

        public final int hashCode() {
            return this.f94260c.hashCode() + (Long.hashCode(this.f94259b) * 31);
        }

        @k
        public final String toString() {
            return "Profile(id=" + this.f94259b + ", profile=" + this.f94260c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f94259b);
            parcel.writeParcelable(this.f94260c, i12);
        }
    }

    /* compiled from: SelectProfileField.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField$Title;", "Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Title implements SelectProfileField {

        @k
        public static final Parcelable.Creator<Title> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f94264b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f94265c;

        /* compiled from: SelectProfileField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Title> {
            @Override // android.os.Parcelable.Creator
            public final Title createFromParcel(Parcel parcel) {
                return new Title(parcel.readLong(), (PrintableText) parcel.readParcelable(Title.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Title[] newArray(int i12) {
                return new Title[i12];
            }
        }

        public Title(long j12, @k PrintableText printableText) {
            this.f94264b = j12;
            this.f94265c = printableText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Title)) {
                return false;
            }
            Title title = (Title) obj;
            return this.f94264b == title.f94264b && L.f(this.f94265c, title.f94265c);
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF94264b() {
            return this.f94264b;
        }

        public final int hashCode() {
            return this.f94265c.hashCode() + (Long.hashCode(this.f94264b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Title(id=");
            sb2.append(this.f94264b);
            sb2.append(", text=");
            return c.m(sb2, this.f94265c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f94264b);
            parcel.writeParcelable(this.f94265c, i12);
        }
    }

    /* compiled from: SelectProfileField.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField$Text;", "Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Text implements SelectProfileField {

        @k
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f94261b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f94262c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributeParams f94263d;

        /* compiled from: SelectProfileField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Text> {
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                return new Text(parcel.readLong(), (PrintableText) parcel.readParcelable(Text.class.getClassLoader()), parcel.readInt() == 0 ? null : AttributeParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i12) {
                return new Text[i12];
            }
        }

        public Text(long j12, @k PrintableText printableText, @l AttributeParams attributeParams) {
            this.f94261b = j12;
            this.f94262c = printableText;
            this.f94263d = attributeParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return this.f94261b == text.f94261b && L.f(this.f94262c, text.f94262c) && L.f(this.f94263d, text.f94263d);
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF94264b() {
            return this.f94261b;
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f94262c, Long.hashCode(this.f94261b) * 31, 31);
            AttributeParams attributeParams = this.f94263d;
            return iF2 + (attributeParams == null ? 0 : attributeParams.hashCode());
        }

        @k
        public final String toString() {
            return "Text(id=" + this.f94261b + ", text=" + this.f94262c + ", attributeParams=" + this.f94263d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f94261b);
            parcel.writeParcelable(this.f94262c, i12);
            AttributeParams attributeParams = this.f94263d;
            if (attributeParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributeParams.writeToParcel(parcel, i12);
            }
        }

        public /* synthetic */ Text(long j12, PrintableText printableText, AttributeParams attributeParams, int i12, C42822w c42822w) {
            this(j12, printableText, (i12 & 4) != 0 ? null : attributeParams);
        }
    }
}

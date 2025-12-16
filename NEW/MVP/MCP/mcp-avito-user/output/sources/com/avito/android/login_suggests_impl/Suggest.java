package com.avito.android.login_suggests_impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Suggest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/login_suggests_impl/Suggest;", "Landroid/os/Parcelable;", "Login", "Social", "Lcom/avito/android/login_suggests_impl/Suggest$Login;", "Lcom/avito/android/login_suggests_impl/Suggest$Social;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface Suggest extends Parcelable {

    /* compiled from: Suggest.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/Suggest$Login;", "Lcom/avito/android/login_suggests_impl/Suggest;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Login implements Suggest {

        @Y61.k
        public static final Parcelable.Creator<Login> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f182855b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Image f182856c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f182857d;

        /* compiled from: Suggest.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Login> {
            @Override // android.os.Parcelable.Creator
            public final Login createFromParcel(Parcel parcel) {
                return new Login(parcel.readString(), (Image) parcel.readParcelable(Login.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Login[] newArray(int i12) {
                return new Login[i12];
            }
        }

        public Login(@Y61.k String str, @Y61.l Image image, @Y61.k String str2) {
            this.f182855b = str;
            this.f182856c = image;
            this.f182857d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Login)) {
                return false;
            }
            Login login = (Login) obj;
            return L.f(this.f182855b, login.f182855b) && L.f(this.f182856c, login.f182856c) && L.f(this.f182857d, login.f182857d);
        }

        @Override // com.avito.android.login_suggests_impl.Suggest
        @Y61.l
        /* renamed from: getAvatar, reason: from getter */
        public final Image getF182859c() {
            return this.f182856c;
        }

        @Override // com.avito.android.login_suggests_impl.Suggest
        @Y61.k
        /* renamed from: getName, reason: from getter */
        public final String getF182858b() {
            return this.f182855b;
        }

        public final int hashCode() {
            int iHashCode = this.f182855b.hashCode() * 31;
            Image image = this.f182856c;
            return this.f182857d.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Login(name=");
            sb2.append(this.f182855b);
            sb2.append(", avatar=");
            sb2.append(this.f182856c);
            sb2.append(", login=");
            return C22026a.c(sb2, this.f182857d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f182855b);
            parcel.writeParcelable(this.f182856c, i12);
            parcel.writeString(this.f182857d);
        }
    }

    /* compiled from: Suggest.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/Suggest$Social;", "Lcom/avito/android/login_suggests_impl/Suggest;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Social implements Suggest {

        @Y61.k
        public static final Parcelable.Creator<Social> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f182858b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Image f182859c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f182860d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f182861e;

        /* compiled from: Suggest.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Social> {
            @Override // android.os.Parcelable.Creator
            public final Social createFromParcel(Parcel parcel) {
                return new Social(parcel.readString(), (Image) parcel.readParcelable(Social.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Social[] newArray(int i12) {
                return new Social[i12];
            }
        }

        public Social(@Y61.k String str, @Y61.l Image image, @Y61.k String str2, @Y61.l String str3) {
            this.f182858b = str;
            this.f182859c = image;
            this.f182860d = str2;
            this.f182861e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Social)) {
                return false;
            }
            Social social = (Social) obj;
            return L.f(this.f182858b, social.f182858b) && L.f(this.f182859c, social.f182859c) && L.f(this.f182860d, social.f182860d) && L.f(this.f182861e, social.f182861e);
        }

        @Override // com.avito.android.login_suggests_impl.Suggest
        @Y61.l
        /* renamed from: getAvatar, reason: from getter */
        public final Image getF182859c() {
            return this.f182859c;
        }

        @Override // com.avito.android.login_suggests_impl.Suggest
        @Y61.k
        /* renamed from: getName, reason: from getter */
        public final String getF182858b() {
            return this.f182858b;
        }

        public final int hashCode() {
            int iHashCode = this.f182858b.hashCode() * 31;
            Image image = this.f182859c;
            int iD2 = H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f182860d);
            String str = this.f182861e;
            return iD2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Social(name=");
            sb2.append(this.f182858b);
            sb2.append(", avatar=");
            sb2.append(this.f182859c);
            sb2.append(", social=");
            sb2.append(this.f182860d);
            sb2.append(", socialId=");
            return C22026a.c(sb2, this.f182861e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f182858b);
            parcel.writeParcelable(this.f182859c, i12);
            parcel.writeString(this.f182860d);
            parcel.writeString(this.f182861e);
        }
    }

    @Y61.l
    /* renamed from: getAvatar */
    Image getF182859c();

    @Y61.k
    /* renamed from: getName */
    String getF182858b();
}

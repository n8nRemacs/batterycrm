package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ProfileLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/SessionsSocialLogoutLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "Mode", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class SessionsSocialLogoutLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<SessionsSocialLogoutLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f133974b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f133975c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f133976d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f133977e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f133978f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Mode f133979g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileLinks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/SessionsSocialLogoutLink$Mode;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f133980b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f133981c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f133982d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133983e;

        static {
            Mode mode = new Mode("DEFAULT", 0);
            f133980b = mode;
            Mode mode2 = new Mode("SAFETY_SESSION_FLOW", 1);
            f133981c = mode2;
            Mode[] modeArr = {mode, mode2};
            f133982d = modeArr;
            f133983e = c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f133982d.clone();
        }
    }

    /* compiled from: ProfileLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SessionsSocialLogoutLink> {
        @Override // android.os.Parcelable.Creator
        public final SessionsSocialLogoutLink createFromParcel(Parcel parcel) {
            return new SessionsSocialLogoutLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Mode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SessionsSocialLogoutLink[] newArray(int i12) {
            return new SessionsSocialLogoutLink[i12];
        }
    }

    public SessionsSocialLogoutLink(@l String str, @l String str2, @l String str3, @l String str4, @k String str5, @k Mode mode) {
        this.f133974b = str;
        this.f133975c = str2;
        this.f133976d = str3;
        this.f133977e = str4;
        this.f133978f = str5;
        this.f133979g = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionsSocialLogoutLink)) {
            return false;
        }
        SessionsSocialLogoutLink sessionsSocialLogoutLink = (SessionsSocialLogoutLink) obj;
        return L.f(this.f133974b, sessionsSocialLogoutLink.f133974b) && L.f(this.f133975c, sessionsSocialLogoutLink.f133975c) && L.f(this.f133976d, sessionsSocialLogoutLink.f133976d) && L.f(this.f133977e, sessionsSocialLogoutLink.f133977e) && L.f(this.f133978f, sessionsSocialLogoutLink.f133978f) && this.f133979g == sessionsSocialLogoutLink.f133979g;
    }

    public final int hashCode() {
        String str = this.f133974b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f133975c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133976d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133977e;
        return this.f133979g.hashCode() + H.d((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f133978f);
    }

    @k
    public final String toString() {
        return "SessionsSocialLogoutLink(source=" + this.f133974b + ", userId=" + this.f133975c + ", loginType=" + this.f133976d + ", sessionIdHash=" + this.f133977e + ", deviceId=" + this.f133978f + ", mode=" + this.f133979g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133974b);
        parcel.writeString(this.f133975c);
        parcel.writeString(this.f133976d);
        parcel.writeString(this.f133977e);
        parcel.writeString(this.f133978f);
        parcel.writeString(this.f133979g.name());
    }
}

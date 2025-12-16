package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PasswordChangeLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "Mode", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PasswordChangeLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<PasswordChangeLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f133920b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f133921c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f133922d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f133923e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f133924f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Mode f133925g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PasswordChangeLink$Mode;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f133926b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f133927c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f133928d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133929e;

        static {
            Mode mode = new Mode("DEFAULT", 0);
            f133926b = mode;
            Mode mode2 = new Mode("SAFETY_SESSION_FLOW", 1);
            f133927c = mode2;
            Mode[] modeArr = {mode, mode2};
            f133928d = modeArr;
            f133929e = c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f133928d.clone();
        }
    }

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PasswordChangeLink> {
        @Override // android.os.Parcelable.Creator
        public final PasswordChangeLink createFromParcel(Parcel parcel) {
            return new PasswordChangeLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Mode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PasswordChangeLink[] newArray(int i12) {
            return new PasswordChangeLink[i12];
        }
    }

    public PasswordChangeLink(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @k Mode mode) {
        this.f133920b = str;
        this.f133921c = str2;
        this.f133922d = str3;
        this.f133923e = str4;
        this.f133924f = str5;
        this.f133925g = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordChangeLink)) {
            return false;
        }
        PasswordChangeLink passwordChangeLink = (PasswordChangeLink) obj;
        return L.f(this.f133920b, passwordChangeLink.f133920b) && L.f(this.f133921c, passwordChangeLink.f133921c) && L.f(this.f133922d, passwordChangeLink.f133922d) && L.f(this.f133923e, passwordChangeLink.f133923e) && L.f(this.f133924f, passwordChangeLink.f133924f) && this.f133925g == passwordChangeLink.f133925g;
    }

    public final int hashCode() {
        String str = this.f133920b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f133921c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133922d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133923e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133924f;
        return this.f133925g.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "PasswordChangeLink(loginType=" + this.f133920b + ", sessionIdHash=" + this.f133921c + ", deviceId=" + this.f133922d + ", source=" + this.f133923e + ", userId=" + this.f133924f + ", mode=" + this.f133925g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133920b);
        parcel.writeString(this.f133921c);
        parcel.writeString(this.f133922d);
        parcel.writeString(this.f133923e);
        parcel.writeString(this.f133924f);
        parcel.writeString(this.f133925g.name());
    }
}

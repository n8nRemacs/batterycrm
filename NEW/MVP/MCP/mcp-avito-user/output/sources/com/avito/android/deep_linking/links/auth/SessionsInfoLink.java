package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/SessionsInfoLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "SessionsInfoMode", "SessionsInfoParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class SessionsInfoLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SessionsInfoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SessionsInfoParams f133963b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/SessionsInfoLink$SessionsInfoMode;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SessionsInfoMode {

        /* renamed from: b, reason: collision with root package name */
        public static final SessionsInfoMode f133964b;

        /* renamed from: c, reason: collision with root package name */
        public static final SessionsInfoMode f133965c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SessionsInfoMode[] f133966d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133967e;

        static {
            SessionsInfoMode sessionsInfoMode = new SessionsInfoMode("LOGOUT", 0);
            f133964b = sessionsInfoMode;
            SessionsInfoMode sessionsInfoMode2 = new SessionsInfoMode("PASSWORD_CHANGE", 1);
            f133965c = sessionsInfoMode2;
            SessionsInfoMode[] sessionsInfoModeArr = {sessionsInfoMode, sessionsInfoMode2};
            f133966d = sessionsInfoModeArr;
            f133967e = c.a(sessionsInfoModeArr);
        }

        public SessionsInfoMode() {
            throw null;
        }

        public static SessionsInfoMode valueOf(String str) {
            return (SessionsInfoMode) Enum.valueOf(SessionsInfoMode.class, str);
        }

        public static SessionsInfoMode[] values() {
            return (SessionsInfoMode[]) f133966d.clone();
        }
    }

    /* compiled from: SafetyLinks.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/SessionsInfoLink$SessionsInfoParams;", "Landroid/os/Parcelable;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SessionsInfoParams implements Parcelable {

        @k
        public static final Parcelable.Creator<SessionsInfoParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SessionsInfoMode f133968b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f133969c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f133970d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f133971e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f133972f;

        /* compiled from: SafetyLinks.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SessionsInfoParams> {
            @Override // android.os.Parcelable.Creator
            public final SessionsInfoParams createFromParcel(Parcel parcel) {
                return new SessionsInfoParams(SessionsInfoMode.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SessionsInfoParams[] newArray(int i12) {
                return new SessionsInfoParams[i12];
            }
        }

        public SessionsInfoParams(@k SessionsInfoMode sessionsInfoMode, boolean z12, @l String str, @l String str2, @l String str3) {
            this.f133968b = sessionsInfoMode;
            this.f133969c = z12;
            this.f133970d = str;
            this.f133971e = str2;
            this.f133972f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionsInfoParams)) {
                return false;
            }
            SessionsInfoParams sessionsInfoParams = (SessionsInfoParams) obj;
            return this.f133968b == sessionsInfoParams.f133968b && this.f133969c == sessionsInfoParams.f133969c && L.f(this.f133970d, sessionsInfoParams.f133970d) && L.f(this.f133971e, sessionsInfoParams.f133971e) && L.f(this.f133972f, sessionsInfoParams.f133972f);
        }

        public final int hashCode() {
            int i12 = r.i(this.f133968b.hashCode() * 31, 31, this.f133969c);
            String str = this.f133970d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f133971e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f133972f;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SessionsInfoParams(mode=");
            sb2.append(this.f133968b);
            sb2.append(", isFromSafetyScreen=");
            sb2.append(this.f133969c);
            sb2.append(", source=");
            sb2.append(this.f133970d);
            sb2.append(", currentUserId=");
            sb2.append(this.f133971e);
            sb2.append(", suspiciousSessionIdHash=");
            return C22026a.c(sb2, this.f133972f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f133968b.name());
            parcel.writeInt(this.f133969c ? 1 : 0);
            parcel.writeString(this.f133970d);
            parcel.writeString(this.f133971e);
            parcel.writeString(this.f133972f);
        }
    }

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SessionsInfoLink> {
        @Override // android.os.Parcelable.Creator
        public final SessionsInfoLink createFromParcel(Parcel parcel) {
            return new SessionsInfoLink(SessionsInfoParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SessionsInfoLink[] newArray(int i12) {
            return new SessionsInfoLink[i12];
        }
    }

    public SessionsInfoLink(@k SessionsInfoParams sessionsInfoParams) {
        this.f133963b = sessionsInfoParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionsInfoLink) && L.f(this.f133963b, ((SessionsInfoLink) obj).f133963b);
    }

    public final int hashCode() {
        return this.f133963b.hashCode();
    }

    @k
    public final String toString() {
        return "SessionsInfoLink(params=" + this.f133963b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f133963b.writeToParcel(parcel, i12);
    }
}

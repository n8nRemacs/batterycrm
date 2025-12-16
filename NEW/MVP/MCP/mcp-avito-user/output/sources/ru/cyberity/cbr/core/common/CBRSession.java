package ru.cyberity.cbr.core.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CBRSession.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b\n\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b;\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010 ¨\u0006@"}, d2 = {"Lru/cyberity/cbr/core/common/CBRSession;", "Landroid/os/Parcelable;", "Ljava/util/UUID;", "sessionId", "", ContextActionHandler.Link.URL, "accessToken", "Ljava/util/Locale;", "locale", "", "isDebug", "packageName", "versionName", "", "versionCode", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/Locale;", "component5", "()Z", "component6", "component7", "component8", "()I", "component9", "()Ljava/lang/Integer;", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lru/cyberity/cbr/core/common/CBRSession;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/UUID;", "getSessionId", "Ljava/lang/String;", "getUrl", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "Ljava/util/Locale;", "getLocale", "Z", "getPackageName", "getVersionName", "I", "getVersionCode", "Ljava/lang/Integer;", "getTheme", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CBRSession implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CBRSession> CREATOR = new a();

    @Y61.k
    private String accessToken;
    private final boolean isDebug;

    @Y61.k
    private final Locale locale;

    @Y61.k
    private final String packageName;

    @Y61.k
    private final UUID sessionId;

    @Y61.l
    private final Integer theme;

    @Y61.k
    private final String url;
    private final int versionCode;

    @Y61.k
    private final String versionName;

    /* compiled from: CBRSession.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements Parcelable.Creator<CBRSession> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CBRSession createFromParcel(@Y61.k Parcel parcel) {
            return new CBRSession((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), (Locale) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CBRSession[] newArray(int i12) {
            return new CBRSession[i12];
        }
    }

    public CBRSession(@Y61.k UUID uuid, @Y61.k String str, @Y61.k String str2, @Y61.k Locale locale, boolean z12, @Y61.k String str3, @Y61.k String str4, int i12, @Y61.l Integer num) {
        this.sessionId = uuid;
        this.url = str;
        this.accessToken = str2;
        this.locale = locale;
        this.isDebug = z12;
        this.packageName = str3;
        this.versionName = str4;
        this.versionCode = i12;
        this.theme = num;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @Y61.k
    /* renamed from: component7, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component8, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final Integer getTheme() {
        return this.theme;
    }

    @Y61.k
    public final CBRSession copy(@Y61.k UUID sessionId, @Y61.k String url, @Y61.k String accessToken, @Y61.k Locale locale, boolean isDebug, @Y61.k String packageName, @Y61.k String versionName, int versionCode, @Y61.l Integer theme) {
        return new CBRSession(sessionId, url, accessToken, locale, isDebug, packageName, versionName, versionCode, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CBRSession)) {
            return false;
        }
        CBRSession cBRSession = (CBRSession) other;
        return L.f(this.sessionId, cBRSession.sessionId) && L.f(this.url, cBRSession.url) && L.f(this.accessToken, cBRSession.accessToken) && L.f(this.locale, cBRSession.locale) && this.isDebug == cBRSession.isDebug && L.f(this.packageName, cBRSession.packageName) && L.f(this.versionName, cBRSession.versionName) && this.versionCode == cBRSession.versionCode && L.f(this.theme, cBRSession.theme);
    }

    @Y61.k
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Y61.k
    public final Locale getLocale() {
        return this.locale;
    }

    @Y61.k
    public final String getPackageName() {
        return this.packageName;
    }

    @Y61.k
    public final UUID getSessionId() {
        return this.sessionId;
    }

    @Y61.l
    public final Integer getTheme() {
        return this.theme;
    }

    @Y61.k
    public final String getUrl() {
        return this.url;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @Y61.k
    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.locale.hashCode() + H.d(H.d(this.sessionId.hashCode() * 31, 31, this.url), 31, this.accessToken)) * 31;
        boolean z12 = this.isDebug;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int iE2 = androidx.appcompat.app.r.e(this.versionCode, H.d(H.d((iHashCode + i12) * 31, 31, this.packageName), 31, this.versionName), 31);
        Integer num = this.theme;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public final void setAccessToken(@Y61.k String str) {
        this.accessToken = str;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CBRSession(sessionId=");
        sb2.append(this.sessionId);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", accessToken=");
        sb2.append(this.accessToken);
        sb2.append(", locale=");
        sb2.append(this.locale);
        sb2.append(", isDebug=");
        sb2.append(this.isDebug);
        sb2.append(", packageName=");
        sb2.append(this.packageName);
        sb2.append(", versionName=");
        sb2.append(this.versionName);
        sb2.append(", versionCode=");
        sb2.append(this.versionCode);
        sb2.append(", theme=");
        return com.akita.compose.component.accordion.s.j(sb2, this.theme, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeSerializable(this.sessionId);
        parcel.writeString(this.url);
        parcel.writeString(this.accessToken);
        parcel.writeSerializable(this.locale);
        parcel.writeInt(this.isDebug ? 1 : 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.versionName);
        parcel.writeInt(this.versionCode);
        Integer num = this.theme;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ CBRSession(UUID uuid, String str, String str2, Locale locale, boolean z12, String str3, String str4, int i12, Integer num, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? UUID.randomUUID() : uuid, str, str2, locale, z12, str3, str4, i12, num);
    }
}

package com.avito.android.safety.password_change;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PasswordChangeParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/password_change/PasswordChangeParams;", "Landroid/os/Parcelable;", "LogicFlow", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PasswordChangeParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PasswordChangeParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LogicFlow f257232b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f257233c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f257234d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f257235e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f257236f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f257237g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PasswordChangeParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/password_change/PasswordChangeParams$LogicFlow;", "", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogicFlow {

        /* renamed from: b, reason: collision with root package name */
        public static final LogicFlow f257238b;

        /* renamed from: c, reason: collision with root package name */
        public static final LogicFlow f257239c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ LogicFlow[] f257240d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f257241e;

        static {
            LogicFlow logicFlow = new LogicFlow("SAFETY_SESSIONS", 0);
            f257238b = logicFlow;
            LogicFlow logicFlow2 = new LogicFlow("DEFAULT", 1);
            f257239c = logicFlow2;
            LogicFlow[] logicFlowArr = {logicFlow, logicFlow2};
            f257240d = logicFlowArr;
            f257241e = kotlin.enums.c.a(logicFlowArr);
        }

        public LogicFlow() {
            throw null;
        }

        public static LogicFlow valueOf(String str) {
            return (LogicFlow) Enum.valueOf(LogicFlow.class, str);
        }

        public static LogicFlow[] values() {
            return (LogicFlow[]) f257240d.clone();
        }
    }

    /* compiled from: PasswordChangeParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PasswordChangeParams> {
        @Override // android.os.Parcelable.Creator
        public final PasswordChangeParams createFromParcel(Parcel parcel) {
            return new PasswordChangeParams(LogicFlow.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PasswordChangeParams[] newArray(int i12) {
            return new PasswordChangeParams[i12];
        }
    }

    public PasswordChangeParams(@Y61.k LogicFlow logicFlow, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f257232b = logicFlow;
        this.f257233c = str;
        this.f257234d = str2;
        this.f257235e = str3;
        this.f257236f = str4;
        this.f257237g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordChangeParams)) {
            return false;
        }
        PasswordChangeParams passwordChangeParams = (PasswordChangeParams) obj;
        return this.f257232b == passwordChangeParams.f257232b && L.f(this.f257233c, passwordChangeParams.f257233c) && L.f(this.f257234d, passwordChangeParams.f257234d) && L.f(this.f257235e, passwordChangeParams.f257235e) && L.f(this.f257236f, passwordChangeParams.f257236f) && L.f(this.f257237g, passwordChangeParams.f257237g);
    }

    public final int hashCode() {
        int iHashCode = this.f257232b.hashCode() * 31;
        String str = this.f257233c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f257234d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f257235e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f257236f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f257237g;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PasswordChangeParams(flow=");
        sb2.append(this.f257232b);
        sb2.append(", source=");
        sb2.append(this.f257233c);
        sb2.append(", loginType=");
        sb2.append(this.f257234d);
        sb2.append(", suspiciousSessionIdHash=");
        sb2.append(this.f257235e);
        sb2.append(", deviceId=");
        sb2.append(this.f257236f);
        sb2.append(", userId=");
        return C22026a.c(sb2, this.f257237g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f257232b.name());
        parcel.writeString(this.f257233c);
        parcel.writeString(this.f257234d);
        parcel.writeString(this.f257235e);
        parcel.writeString(this.f257236f);
        parcel.writeString(this.f257237g);
    }
}

package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAuthSuggestLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "Scenario", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PassportAuthSuggestLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportAuthSuggestLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133530b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133531c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133532d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAuthSuggestLink$Scenario;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scenario {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Scenario[] f133533b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133534c;

        static {
            Scenario[] scenarioArr = {new Scenario("LIVENESS", 0), new Scenario("RESTORE_BY_DOCS", 1)};
            f133533b = scenarioArr;
            f133534c = kotlin.enums.c.a(scenarioArr);
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) f133533b.clone();
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportAuthSuggestLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportAuthSuggestLink createFromParcel(Parcel parcel) {
            return new PassportAuthSuggestLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportAuthSuggestLink[] newArray(int i12) {
            return new PassportAuthSuggestLink[i12];
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAuthSuggestLink$b;", "", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportAuthSuggestLink$b$a;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133535b = new a();
        }
    }

    public /* synthetic */ PassportAuthSuggestLink(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportAuthSuggestLink)) {
            return false;
        }
        PassportAuthSuggestLink passportAuthSuggestLink = (PassportAuthSuggestLink) obj;
        return kotlin.jvm.internal.L.f(this.f133530b, passportAuthSuggestLink.f133530b) && kotlin.jvm.internal.L.f(this.f133531c, passportAuthSuggestLink.f133531c) && kotlin.jvm.internal.L.f(this.f133532d, passportAuthSuggestLink.f133532d);
    }

    public final int hashCode() {
        int iHashCode = this.f133530b.hashCode() * 31;
        String str = this.f133531c;
        return this.f133532d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportAuthSuggestLink(mergeKey=");
        sb2.append(this.f133530b);
        sb2.append(", verificationFlow=");
        sb2.append(this.f133531c);
        sb2.append(", scenario=");
        return C22026a.c(sb2, this.f133532d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133530b);
        parcel.writeString(this.f133531c);
        parcel.writeString(this.f133532d);
    }

    public PassportAuthSuggestLink(@Y61.k String str, @Y61.l String str2, @Y61.k String str3) {
        this.f133530b = str;
        this.f133531c = str2;
        this.f133532d = str3;
    }
}

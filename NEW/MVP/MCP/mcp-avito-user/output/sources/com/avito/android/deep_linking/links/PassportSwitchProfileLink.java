package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportSwitchProfileLink;", "Lcom/avito/android/deep_linking/links/ChainedDeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PassportSwitchProfileLink extends ChainedDeepLink {

    @Y61.k
    public static final Parcelable.Creator<PassportSwitchProfileLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133549c;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportSwitchProfileLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportSwitchProfileLink createFromParcel(Parcel parcel) {
            return new PassportSwitchProfileLink(parcel.readString(), (DeepLink) parcel.readParcelable(PassportSwitchProfileLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportSwitchProfileLink[] newArray(int i12) {
            return new PassportSwitchProfileLink[i12];
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportSwitchProfileLink$b;", "", "a", "b", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportSwitchProfileLink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133550b = new a();
        }

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportSwitchProfileLink$b$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.PassportSwitchProfileLink$b$b, reason: collision with other inner class name */
        public static final class C4012b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4012b f133551b = new C4012b();
        }

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PassportSwitchProfileLink$b$c;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f133552b = new c();
        }
    }

    public /* synthetic */ PassportSwitchProfileLink(String str, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportSwitchProfileLink)) {
            return false;
        }
        PassportSwitchProfileLink passportSwitchProfileLink = (PassportSwitchProfileLink) obj;
        return kotlin.jvm.internal.L.f(this.f133548b, passportSwitchProfileLink.f133548b) && kotlin.jvm.internal.L.f(this.f133549c, passportSwitchProfileLink.f133549c);
    }

    @Override // com.avito.android.deep_linking.links.ChainedDeepLink
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final DeepLink getF168396c() {
        return this.f133549c;
    }

    public final int hashCode() {
        int iHashCode = this.f133548b.hashCode() * 31;
        DeepLink deepLink = this.f133549c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportSwitchProfileLink(profileId=");
        sb2.append(this.f133548b);
        sb2.append(", then=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f133549c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133548b);
        parcel.writeParcelable(this.f133549c, i12);
    }

    public PassportSwitchProfileLink(@Y61.k String str, @Y61.l DeepLink deepLink) {
        this.f133548b = str;
        this.f133549c = deepLink;
    }
}

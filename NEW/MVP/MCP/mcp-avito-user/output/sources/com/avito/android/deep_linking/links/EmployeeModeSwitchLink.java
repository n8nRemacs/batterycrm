package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: EmployeeModeSwitchLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink;", "Lcom/avito/android/deep_linking/links/ChainedDeepLink;", "b", "SwitchSource", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class EmployeeModeSwitchLink extends ChainedDeepLink {

    @Y61.k
    public static final Parcelable.Creator<EmployeeModeSwitchLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133299b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133300c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f133301d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public volatile SwitchSource f133302e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EmployeeModeSwitchLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$SwitchSource;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SwitchSource {

        /* renamed from: b, reason: collision with root package name */
        public static final SwitchSource f133303b;

        /* renamed from: c, reason: collision with root package name */
        public static final SwitchSource f133304c;

        /* renamed from: d, reason: collision with root package name */
        public static final SwitchSource f133305d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ SwitchSource[] f133306e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133307f;

        static {
            SwitchSource switchSource = new SwitchSource("BLOCKER", 0);
            f133303b = switchSource;
            SwitchSource switchSource2 = new SwitchSource("SWITCH_PROFILE", 1);
            f133304c = switchSource2;
            SwitchSource switchSource3 = new SwitchSource("SWITCH_MODE", 2);
            f133305d = switchSource3;
            SwitchSource[] switchSourceArr = {switchSource, switchSource2, switchSource3};
            f133306e = switchSourceArr;
            f133307f = kotlin.enums.c.a(switchSourceArr);
        }

        public SwitchSource() {
            throw null;
        }

        public static SwitchSource valueOf(String str) {
            return (SwitchSource) Enum.valueOf(SwitchSource.class, str);
        }

        public static SwitchSource[] values() {
            return (SwitchSource[]) f133306e.clone();
        }
    }

    /* compiled from: EmployeeModeSwitchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmployeeModeSwitchLink> {
        @Override // android.os.Parcelable.Creator
        public final EmployeeModeSwitchLink createFromParcel(Parcel parcel) {
            return new EmployeeModeSwitchLink(parcel.readInt() != 0, (DeepLink) parcel.readParcelable(EmployeeModeSwitchLink.class.getClassLoader()), parcel.readInt() != 0, SwitchSource.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final EmployeeModeSwitchLink[] newArray(int i12) {
            return new EmployeeModeSwitchLink[i12];
        }
    }

    /* compiled from: EmployeeModeSwitchLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b;", "", "a", "b", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: EmployeeModeSwitchLink.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a;", "LJu/c$b;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b;", "a", "b", "c", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a$a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a$b;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a extends InterfaceC14249c.b, b {

            /* compiled from: EmployeeModeSwitchLink.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a$a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.EmployeeModeSwitchLink$b$a$a, reason: collision with other inner class name */
            public static final class C3998a implements a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final C3998a f133308b = new C3998a();
            }

            /* compiled from: EmployeeModeSwitchLink.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a$b;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.EmployeeModeSwitchLink$b$a$b, reason: collision with other inner class name */
            public static final class C3999b implements a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final C3999b f133309b = new C3999b();
            }

            /* compiled from: EmployeeModeSwitchLink.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a$c;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class c implements a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final c f133310b = new c();
            }
        }

        /* compiled from: EmployeeModeSwitchLink.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b;", "LJu/c$a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b;", "a", "b", "c", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b$a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b$b;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.EmployeeModeSwitchLink$b$b, reason: collision with other inner class name */
        public interface InterfaceC4000b extends InterfaceC14249c.a, b {

            /* compiled from: EmployeeModeSwitchLink.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b$a;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.EmployeeModeSwitchLink$b$b$a */
            public static final class a implements InterfaceC4000b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final a f133311b = new a();
            }

            /* compiled from: EmployeeModeSwitchLink.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b$b;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.EmployeeModeSwitchLink$b$b$b, reason: collision with other inner class name */
            public static final class C4001b implements InterfaceC4000b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final C4001b f133312b = new C4001b();
            }

            /* compiled from: EmployeeModeSwitchLink.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b$c;", "Lcom/avito/android/deep_linking/links/EmployeeModeSwitchLink$b$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.deep_linking.links.EmployeeModeSwitchLink$b$b$c */
            public static final class c implements InterfaceC4000b {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final c f133313b = new c();
            }
        }
    }

    public EmployeeModeSwitchLink(boolean z12, @Y61.l DeepLink deepLink, boolean z13, @Y61.k SwitchSource switchSource) {
        this.f133299b = z12;
        this.f133300c = deepLink;
        this.f133301d = z13;
        this.f133302e = switchSource;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeModeSwitchLink)) {
            return false;
        }
        EmployeeModeSwitchLink employeeModeSwitchLink = (EmployeeModeSwitchLink) obj;
        return this.f133299b == employeeModeSwitchLink.f133299b && kotlin.jvm.internal.L.f(this.f133300c, employeeModeSwitchLink.f133300c) && this.f133301d == employeeModeSwitchLink.f133301d && this.f133302e == employeeModeSwitchLink.f133302e;
    }

    @Override // com.avito.android.deep_linking.links.ChainedDeepLink
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final DeepLink getF133549c() {
        return this.f133300c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f133299b) * 31;
        DeepLink deepLink = this.f133300c;
        return this.f133302e.hashCode() + androidx.appcompat.app.r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f133301d);
    }

    @Y61.k
    public final String toString() {
        return "EmployeeModeSwitchLink(isOn=" + this.f133299b + ", then=" + this.f133300c + ", skipSwitch=" + this.f133301d + ", switchSource=" + this.f133302e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133299b ? 1 : 0);
        parcel.writeParcelable(this.f133300c, i12);
        parcel.writeInt(this.f133301d ? 1 : 0);
        parcel.writeString(this.f133302e.name());
    }
}

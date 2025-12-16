package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.publish.PublishInitialToast;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AdvertPublicationLink.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertPublicationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "Local", "Public", "a", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$Local;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$Public;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AdvertPublicationLink extends DeepLink {

    /* compiled from: AdvertPublicationLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertPublicationLink$Public;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink;", "Lcom/avito/android/deep_linking/links/q;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class Public extends AdvertPublicationLink implements q {

        @Y61.k
        public static final Parcelable.Creator<Public> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Navigation f132999b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133000c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f133001d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final PublishInitialToast f133002e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f133003f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Map<String, Object> f133004g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f133005h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Boolean f133006i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Boolean f133007j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final String f133008k;

        /* compiled from: AdvertPublicationLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Public> {
            @Override // android.os.Parcelable.Creator
            public final Public createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Boolean boolValueOf;
                Boolean boolValueOf2 = null;
                Navigation navigationCreateFromParcel = parcel.readInt() == 0 ? null : Navigation.CREATOR.createFromParcel(parcel);
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Public.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                PublishInitialToast publishInitialToastCreateFromParcel = parcel.readInt() == 0 ? null : PublishInitialToast.CREATOR.createFromParcel(parcel);
                boolean z13 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = org.webrtc.h.c(Public.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                        linkedHashMap2 = linkedHashMap2;
                        i12 = i12;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Public(navigationCreateFromParcel, deepLink, z12, publishInitialToastCreateFromParcel, z13, linkedHashMap, string, boolValueOf, boolValueOf2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Public[] newArray(int i12) {
                return new Public[i12];
            }
        }

        public Public() {
            this(null, null, false, null, false, null, null, null, null, null, 1023, null);
        }

        public static Public a(Public r112, DeepLink deepLink, int i12) {
            Navigation navigation2 = r112.f132999b;
            if ((i12 & 2) != 0) {
                deepLink = r112.f133000c;
            }
            DeepLink deepLink2 = deepLink;
            boolean z12 = (i12 & 4) != 0 ? r112.f133001d : false;
            PublishInitialToast publishInitialToast = r112.f133002e;
            boolean z13 = r112.f133003f;
            Map<String, Object> map = r112.f133004g;
            String str = r112.f133005h;
            Boolean bool = r112.f133006i;
            Boolean bool2 = r112.f133007j;
            String str2 = r112.f133008k;
            r112.getClass();
            return new Public(navigation2, deepLink2, z12, publishInitialToast, z13, map, str, bool, bool2, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Public)) {
                return false;
            }
            Public r52 = (Public) obj;
            return kotlin.jvm.internal.L.f(this.f132999b, r52.f132999b) && kotlin.jvm.internal.L.f(this.f133000c, r52.f133000c) && this.f133001d == r52.f133001d && kotlin.jvm.internal.L.f(this.f133002e, r52.f133002e) && this.f133003f == r52.f133003f && kotlin.jvm.internal.L.f(this.f133004g, r52.f133004g) && kotlin.jvm.internal.L.f(this.f133005h, r52.f133005h) && kotlin.jvm.internal.L.f(this.f133006i, r52.f133006i) && kotlin.jvm.internal.L.f(this.f133007j, r52.f133007j) && kotlin.jvm.internal.L.f(this.f133008k, r52.f133008k);
        }

        public final int hashCode() {
            Navigation navigation2 = this.f132999b;
            int iHashCode = (navigation2 == null ? 0 : navigation2.hashCode()) * 31;
            DeepLink deepLink = this.f133000c;
            int i12 = androidx.appcompat.app.r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f133001d);
            PublishInitialToast publishInitialToast = this.f133002e;
            int i13 = androidx.appcompat.app.r.i((i12 + (publishInitialToast == null ? 0 : publishInitialToast.hashCode())) * 31, 31, this.f133003f);
            Map<String, Object> map = this.f133004g;
            int iHashCode2 = (i13 + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.f133005h;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f133006i;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f133007j;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.f133008k;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Public(navigation=");
            sb2.append(this.f132999b);
            sb2.append(", startUpAction=");
            sb2.append(this.f133000c);
            sb2.append(", needAuthorizedCheck=");
            sb2.append(this.f133001d);
            sb2.append(", toast=");
            sb2.append(this.f133002e);
            sb2.append(", skipDraft=");
            sb2.append(this.f133003f);
            sb2.append(", params=");
            sb2.append(this.f133004g);
            sb2.append(", targetStepType=");
            sb2.append(this.f133005h);
            sb2.append(", needRootNavigation=");
            sb2.append(this.f133006i);
            sb2.append(", keepCurrentStack=");
            sb2.append(this.f133007j);
            sb2.append(", scenario=");
            return C22026a.c(sb2, this.f133008k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Navigation navigation2 = this.f132999b;
            if (navigation2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                navigation2.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f133000c, i12);
            parcel.writeInt(this.f133001d ? 1 : 0);
            PublishInitialToast publishInitialToast = this.f133002e;
            if (publishInitialToast == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                publishInitialToast.writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f133003f ? 1 : 0);
            Map<String, Object> map = this.f133004g;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            parcel.writeString(this.f133005h);
            Boolean bool = this.f133006i;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.f133007j;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.f133008k);
        }

        public /* synthetic */ Public(Navigation navigation2, DeepLink deepLink, boolean z12, PublishInitialToast publishInitialToast, boolean z13, Map map, String str, Boolean bool, Boolean bool2, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : navigation2, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : publishInitialToast, (i12 & 16) == 0 ? z13 : false, (i12 & 32) != 0 ? null : map, (i12 & 64) != 0 ? null : str, (i12 & 128) != 0 ? Boolean.FALSE : bool, (i12 & 256) != 0 ? Boolean.FALSE : bool2, (i12 & 512) == 0 ? str2 : null);
        }

        public Public(@Y61.l Navigation navigation2, @Y61.l DeepLink deepLink, boolean z12, @Y61.l PublishInitialToast publishInitialToast, boolean z13, @Y61.l Map<String, ? extends Object> map, @Y61.l String str, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l String str2) {
            super(null);
            this.f132999b = navigation2;
            this.f133000c = deepLink;
            this.f133001d = z12;
            this.f133002e = publishInitialToast;
            this.f133003f = z13;
            this.f133004g = map;
            this.f133005h = str;
            this.f133006i = bool;
            this.f133007j = bool2;
            this.f133008k = str2;
        }
    }

    /* compiled from: AdvertPublicationLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertPublicationLink$a;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$a$a;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends InterfaceC14249c.b {

        /* compiled from: AdvertPublicationLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertPublicationLink$a$a;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.AdvertPublicationLink$a$a, reason: collision with other inner class name */
        public static final class C3985a implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3985a f133009b = new C3985a();
        }

        /* compiled from: AdvertPublicationLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertPublicationLink$a$b;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133010b = new b();
        }
    }

    public /* synthetic */ AdvertPublicationLink(C42822w c42822w) {
        this();
    }

    /* compiled from: AdvertPublicationLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertPublicationLink$Local;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class Local extends AdvertPublicationLink {

        @Y61.k
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Navigation f132992b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f132993c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final PublishInitialToast f132994d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Map<String, Object> f132995e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f132996f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Boolean f132997g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f132998h;

        /* compiled from: AdvertPublicationLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Local> {
            @Override // android.os.Parcelable.Creator
            public final Local createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Boolean boolValueOf;
                Navigation navigationCreateFromParcel = Navigation.CREATOR.createFromParcel(parcel);
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Local.class.getClassLoader());
                PublishInitialToast publishInitialToastCreateFromParcel = parcel.readInt() == 0 ? null : PublishInitialToast.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = org.webrtc.h.c(Local.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Local(navigationCreateFromParcel, deepLink, publishInitialToastCreateFromParcel, linkedHashMap, string, boolValueOf, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Local[] newArray(int i12) {
                return new Local[i12];
            }
        }

        public /* synthetic */ Local(Navigation navigation2, DeepLink deepLink, PublishInitialToast publishInitialToast, Map map, String str, Boolean bool, String str2, int i12, C42822w c42822w) {
            this(navigation2, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : publishInitialToast, (i12 & 8) != 0 ? null : map, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? Boolean.FALSE : bool, (i12 & 64) == 0 ? str2 : null);
        }

        public static Local a(Local local, DeepLink deepLink, String str, int i12) {
            Navigation navigation2 = local.f132992b;
            if ((i12 & 2) != 0) {
                deepLink = local.f132993c;
            }
            DeepLink deepLink2 = deepLink;
            PublishInitialToast publishInitialToast = local.f132994d;
            Map<String, Object> map = local.f132995e;
            String str2 = local.f132996f;
            Boolean bool = local.f132997g;
            if ((i12 & 64) != 0) {
                str = local.f132998h;
            }
            local.getClass();
            return new Local(navigation2, deepLink2, publishInitialToast, map, str2, bool, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Local)) {
                return false;
            }
            Local local = (Local) obj;
            return kotlin.jvm.internal.L.f(this.f132992b, local.f132992b) && kotlin.jvm.internal.L.f(this.f132993c, local.f132993c) && kotlin.jvm.internal.L.f(this.f132994d, local.f132994d) && kotlin.jvm.internal.L.f(this.f132995e, local.f132995e) && kotlin.jvm.internal.L.f(this.f132996f, local.f132996f) && kotlin.jvm.internal.L.f(this.f132997g, local.f132997g) && kotlin.jvm.internal.L.f(this.f132998h, local.f132998h);
        }

        public final int hashCode() {
            int iHashCode = this.f132992b.hashCode() * 31;
            DeepLink deepLink = this.f132993c;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            PublishInitialToast publishInitialToast = this.f132994d;
            int iHashCode3 = (iHashCode2 + (publishInitialToast == null ? 0 : publishInitialToast.hashCode())) * 31;
            Map<String, Object> map = this.f132995e;
            int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.f132996f;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f132997g;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f132998h;
            return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Local(navigation=");
            sb2.append(this.f132992b);
            sb2.append(", startUpAction=");
            sb2.append(this.f132993c);
            sb2.append(", toast=");
            sb2.append(this.f132994d);
            sb2.append(", params=");
            sb2.append(this.f132995e);
            sb2.append(", targetStepType=");
            sb2.append(this.f132996f);
            sb2.append(", needRootNavigation=");
            sb2.append(this.f132997g);
            sb2.append(", scenario=");
            return C22026a.c(sb2, this.f132998h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f132992b.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f132993c, i12);
            PublishInitialToast publishInitialToast = this.f132994d;
            if (publishInitialToast == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                publishInitialToast.writeToParcel(parcel, i12);
            }
            Map<String, Object> map = this.f132995e;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
                }
            }
            parcel.writeString(this.f132996f);
            Boolean bool = this.f132997g;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.f132998h);
        }

        public Local(@Y61.k Navigation navigation2, @Y61.l DeepLink deepLink, @Y61.l PublishInitialToast publishInitialToast, @Y61.l Map<String, ? extends Object> map, @Y61.l String str, @Y61.l Boolean bool, @Y61.l String str2) {
            super(null);
            this.f132992b = navigation2;
            this.f132993c = deepLink;
            this.f132994d = publishInitialToast;
            this.f132995e = map;
            this.f132996f = str;
            this.f132997g = bool;
            this.f132998h = str2;
        }
    }

    public AdvertPublicationLink() {
    }
}

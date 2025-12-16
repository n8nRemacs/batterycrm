package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: UniversalMapLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/UniversalMapLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class UniversalMapLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UniversalMapLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133756b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133757c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133758d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133759e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ToolbarSettings f133760f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f133761g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133762h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f133763i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f133764j;

    /* compiled from: UniversalMapLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalMapLink> {
        @Override // android.os.Parcelable.Creator
        public final UniversalMapLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ToolbarSettings toolbarSettingsCreateFromParcel = parcel.readInt() == 0 ? null : ToolbarSettings.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = org.webrtc.h.c(UniversalMapLink.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new UniversalMapLink(string, string2, string3, string4, toolbarSettingsCreateFromParcel, linkedHashMap, parcel.readString(), parcel.readInt() != 0 ? ParametrizedEvent.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalMapLink[] newArray(int i12) {
            return new UniversalMapLink[i12];
        }
    }

    /* compiled from: UniversalMapLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/UniversalMapLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/UniversalMapLink$b$a;", "Lcom/avito/android/deep_linking/links/UniversalMapLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: UniversalMapLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/UniversalMapLink$b$a;", "Lcom/avito/android/deep_linking/links/UniversalMapLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133765b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: UniversalMapLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/UniversalMapLink$b$b;", "Lcom/avito/android/deep_linking/links/UniversalMapLink$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.UniversalMapLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4017b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final DeepLink f133766b;

            public C4017b(@Y61.l DeepLink deepLink) {
                super(null);
                this.f133766b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4017b) && kotlin.jvm.internal.L.f(this.f133766b, ((C4017b) obj).f133766b);
            }

            public final int hashCode() {
                DeepLink deepLink = this.f133766b;
                if (deepLink == null) {
                    return 0;
                }
                return deepLink.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Finished(deepLink="), this.f133766b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ UniversalMapLink(String str, String str2, String str3, String str4, ToolbarSettings toolbarSettings, Map map, String str5, ParametrizedEvent parametrizedEvent, String str6, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, toolbarSettings, map, str5, parametrizedEvent, (i12 & 256) != 0 ? null : str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalMapLink)) {
            return false;
        }
        UniversalMapLink universalMapLink = (UniversalMapLink) obj;
        return kotlin.jvm.internal.L.f(this.f133756b, universalMapLink.f133756b) && kotlin.jvm.internal.L.f(this.f133757c, universalMapLink.f133757c) && kotlin.jvm.internal.L.f(this.f133758d, universalMapLink.f133758d) && kotlin.jvm.internal.L.f(this.f133759e, universalMapLink.f133759e) && kotlin.jvm.internal.L.f(this.f133760f, universalMapLink.f133760f) && kotlin.jvm.internal.L.f(this.f133761g, universalMapLink.f133761g) && kotlin.jvm.internal.L.f(this.f133762h, universalMapLink.f133762h) && kotlin.jvm.internal.L.f(this.f133763i, universalMapLink.f133763i) && kotlin.jvm.internal.L.f(this.f133764j, universalMapLink.f133764j);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f133756b.hashCode() * 31, 31, this.f133757c);
        String str = this.f133758d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133759e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ToolbarSettings toolbarSettings = this.f133760f;
        int iC2 = AK.c.c((iHashCode2 + (toolbarSettings == null ? 0 : toolbarSettings.hashCode())) * 31, 31, this.f133761g);
        String str3 = this.f133762h;
        int iHashCode3 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f133763i;
        int iHashCode4 = (iHashCode3 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        String str4 = this.f133764j;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalMapLink(pointListRequest=");
        sb2.append(this.f133756b);
        sb2.append(", pointInfoRequest=");
        sb2.append(this.f133757c);
        sb2.append(", filtersInfoRequest=");
        sb2.append(this.f133758d);
        sb2.append(", toolbarTitle=");
        sb2.append(this.f133759e);
        sb2.append(", toolbarSettings=");
        sb2.append(this.f133760f);
        sb2.append(", extraParameters=");
        sb2.append(this.f133761g);
        sb2.append(", screenName=");
        sb2.append(this.f133762h);
        sb2.append(", onOpenEvent=");
        sb2.append(this.f133763i);
        sb2.append(", onInitActions=");
        return C22026a.c(sb2, this.f133764j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133756b);
        parcel.writeString(this.f133757c);
        parcel.writeString(this.f133758d);
        parcel.writeString(this.f133759e);
        ToolbarSettings toolbarSettings = this.f133760f;
        if (toolbarSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarSettings.writeToParcel(parcel, i12);
        }
        Iterator itI = C0.i(parcel, this.f133761g);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
        parcel.writeString(this.f133762h);
        ParametrizedEvent parametrizedEvent = this.f133763i;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133764j);
    }

    public UniversalMapLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l ToolbarSettings toolbarSettings, @Y61.k Map<String, ? extends Object> map, @Y61.l String str5, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str6) {
        this.f133756b = str;
        this.f133757c = str2;
        this.f133758d = str3;
        this.f133759e = str4;
        this.f133760f = toolbarSettings;
        this.f133761g = map;
        this.f133762h = str5;
        this.f133763i = parametrizedEvent;
        this.f133764j = str6;
    }
}

package com.avito.android.deep_linking.links;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: BeduinUniversalPageLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class BeduinUniversalPageLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BeduinUniversalPageLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133038b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133039c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133040d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Long f133041e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133042f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f133043g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final BottomSheetContentPaddings f133044h;

    /* compiled from: BeduinUniversalPageLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinUniversalPageLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinUniversalPageLink createFromParcel(Parcel parcel) {
            return new BeduinUniversalPageLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BottomSheetContentPaddings.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinUniversalPageLink[] newArray(int i12) {
            return new BeduinUniversalPageLink[i12];
        }
    }

    /* compiled from: BeduinUniversalPageLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink$b$a;", "Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: BeduinUniversalPageLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink$b$a;", "Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133045b = new a();
        }

        /* compiled from: BeduinUniversalPageLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink$b$b;", "Lcom/avito/android/deep_linking/links/BeduinUniversalPageLink$b;", "LJu/a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.BeduinUniversalPageLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3987b implements b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Map<String, Object> f133046b;

            public C3987b(@Y61.k Map<String, ? extends Object> map) {
                this.f133046b = map;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3987b) && kotlin.jvm.internal.L.f(this.f133046b, ((C3987b) obj).f133046b);
            }

            public final int hashCode() {
                return this.f133046b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.w(new StringBuilder("Params(params="), this.f133046b, ')');
            }
        }
    }

    public /* synthetic */ BeduinUniversalPageLink(String str, String str2, String str3, Long l12, String str4, String str5, BottomSheetContentPaddings bottomSheetContentPaddings, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : l12, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : bottomSheetContentPaddings);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinUniversalPageLink)) {
            return false;
        }
        BeduinUniversalPageLink beduinUniversalPageLink = (BeduinUniversalPageLink) obj;
        return kotlin.jvm.internal.L.f(this.f133038b, beduinUniversalPageLink.f133038b) && kotlin.jvm.internal.L.f(this.f133039c, beduinUniversalPageLink.f133039c) && kotlin.jvm.internal.L.f(this.f133040d, beduinUniversalPageLink.f133040d) && kotlin.jvm.internal.L.f(this.f133041e, beduinUniversalPageLink.f133041e) && kotlin.jvm.internal.L.f(this.f133042f, beduinUniversalPageLink.f133042f) && kotlin.jvm.internal.L.f(this.f133043g, beduinUniversalPageLink.f133043g) && this.f133044h == beduinUniversalPageLink.f133044h;
    }

    public final int hashCode() {
        String str = this.f133038b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f133039c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133040d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.f133041e;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.f133042f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133043g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BottomSheetContentPaddings bottomSheetContentPaddings = this.f133044h;
        return iHashCode6 + (bottomSheetContentPaddings != null ? bottomSheetContentPaddings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "BeduinUniversalPageLink(requestUrl=" + this.f133038b + ", presentationStyle=" + this.f133039c + ", screenName=" + this.f133040d + ", contentId=" + this.f133041e + ", forcedThemeMode=" + this.f133042f + ", theme=" + this.f133043g + ", bottomSheetContentPaddings=" + this.f133044h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133038b);
        parcel.writeString(this.f133039c);
        parcel.writeString(this.f133040d);
        Long l12 = this.f133041e;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f133042f);
        parcel.writeString(this.f133043g);
        BottomSheetContentPaddings bottomSheetContentPaddings = this.f133044h;
        if (bottomSheetContentPaddings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bottomSheetContentPaddings.name());
        }
    }

    public BeduinUniversalPageLink(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4, @Y61.l String str5, @Y61.l BottomSheetContentPaddings bottomSheetContentPaddings) {
        this.f133038b = str;
        this.f133039c = str2;
        this.f133040d = str3;
        this.f133041e = l12;
        this.f133042f = str4;
        this.f133043g = str5;
        this.f133044h = bottomSheetContentPaddings;
    }
}

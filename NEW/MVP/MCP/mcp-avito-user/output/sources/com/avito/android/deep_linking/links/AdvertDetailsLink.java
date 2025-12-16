package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AdvertDetailsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "GigAction", "GigParams", "b", "Segment", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AdvertDetailsLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f132947b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f132948c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f132949d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f132950e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f132951f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Segment f132952g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f132953h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f132954i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f132955j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Image f132956k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final GigParams f132957l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink$GigAction;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GigAction {

        /* renamed from: b, reason: collision with root package name */
        public static final GigAction f132958b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ GigAction[] f132959c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f132960d;

        static {
            GigAction gigAction = new GigAction("Apply", 0);
            f132958b = gigAction;
            GigAction[] gigActionArr = {gigAction};
            f132959c = gigActionArr;
            f132960d = kotlin.enums.c.a(gigActionArr);
        }

        public GigAction() {
            throw null;
        }

        public static GigAction valueOf(String str) {
            return (GigAction) Enum.valueOf(GigAction.class, str);
        }

        public static GigAction[] values() {
            return (GigAction[]) f132959c.clone();
        }
    }

    /* compiled from: AdvertDetailsLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink$GigParams;", "Landroid/os/Parcelable;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GigParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<GigParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f132961b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final GigAction f132962c;

        /* compiled from: AdvertDetailsLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GigParams> {
            @Override // android.os.Parcelable.Creator
            public final GigParams createFromParcel(Parcel parcel) {
                return new GigParams(parcel.readString(), parcel.readInt() == 0 ? null : GigAction.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final GigParams[] newArray(int i12) {
                return new GigParams[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GigParams() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GigParams)) {
                return false;
            }
            GigParams gigParams = (GigParams) obj;
            return kotlin.jvm.internal.L.f(this.f132961b, gigParams.f132961b) && this.f132962c == gigParams.f132962c;
        }

        public final int hashCode() {
            String str = this.f132961b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GigAction gigAction = this.f132962c;
            return iHashCode + (gigAction != null ? gigAction.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "GigParams(gigShiftId=" + this.f132961b + ", gigAction=" + this.f132962c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f132961b);
            GigAction gigAction = this.f132962c;
            if (gigAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(gigAction.name());
            }
        }

        public GigParams(@Y61.l String str, @Y61.l GigAction gigAction) {
            this.f132961b = str;
            this.f132962c = gigAction;
        }

        public /* synthetic */ GigParams(String str, GigAction gigAction, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : gigAction);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink$Segment;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Segment {

        /* renamed from: b, reason: collision with root package name */
        public static final Segment f132963b;

        /* renamed from: c, reason: collision with root package name */
        public static final Segment f132964c;

        /* renamed from: d, reason: collision with root package name */
        public static final Segment f132965d;

        /* renamed from: e, reason: collision with root package name */
        public static final Segment f132966e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Segment[] f132967f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f132968g;

        static {
            Segment segment = new Segment("Default", 0);
            f132963b = segment;
            Segment segment2 = new Segment("AvitoBlack", 1);
            f132964c = segment2;
            Segment segment3 = new Segment("AvitoMall", 2);
            f132965d = segment3;
            Segment segment4 = new Segment("AvitoBusiness", 3);
            f132966e = segment4;
            Segment[] segmentArr = {segment, segment2, segment3, segment4};
            f132967f = segmentArr;
            f132968g = kotlin.enums.c.a(segmentArr);
        }

        public Segment() {
            throw null;
        }

        public static Segment valueOf(String str) {
            return (Segment) Enum.valueOf(Segment.class, str);
        }

        public static Segment[] values() {
            return (Segment[]) f132967f.clone();
        }
    }

    /* compiled from: AdvertDetailsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsLink> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AdvertDetailsLink(string, string2, string3, string4, boolValueOf, parcel.readInt() == 0 ? null : Segment.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (Image) parcel.readParcelable(AdvertDetailsLink.class.getClassLoader()), parcel.readInt() != 0 ? GigParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLink[] newArray(int i12) {
            return new AdvertDetailsLink[i12];
        }
    }

    /* compiled from: AdvertDetailsLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink$b;", "", "<init>", "()V", "a", "b", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AdvertDetailsLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f132969b = new a();
        }

        /* compiled from: AdvertDetailsLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink$b$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.AdvertDetailsLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3984b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f132970b;

            public C3984b(@Y61.l String str) {
                this.f132970b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3984b) && kotlin.jvm.internal.L.f(this.f132970b, ((C3984b) obj).f132970b);
            }

            public final int hashCode() {
                String str = this.f132970b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("AdvertDetailsCompleted(selectedPageFromStories="), this.f132970b, ')');
            }
        }

        /* compiled from: AdvertDetailsLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsLink$b$c;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.b {
            static {
                new c();
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ AdvertDetailsLink(String str, String str2, String str3, String str4, Boolean bool, Segment segment, String str5, Integer num, String str6, Image image, GigParams gigParams, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : segment, (i12 & 64) != 0 ? null : str5, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : str6, (i12 & 512) != 0 ? null : image, (i12 & 1024) != 0 ? null : gigParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsLink)) {
            return false;
        }
        AdvertDetailsLink advertDetailsLink = (AdvertDetailsLink) obj;
        return kotlin.jvm.internal.L.f(this.f132947b, advertDetailsLink.f132947b) && kotlin.jvm.internal.L.f(this.f132948c, advertDetailsLink.f132948c) && kotlin.jvm.internal.L.f(this.f132949d, advertDetailsLink.f132949d) && kotlin.jvm.internal.L.f(this.f132950e, advertDetailsLink.f132950e) && kotlin.jvm.internal.L.f(this.f132951f, advertDetailsLink.f132951f) && this.f132952g == advertDetailsLink.f132952g && kotlin.jvm.internal.L.f(this.f132953h, advertDetailsLink.f132953h) && kotlin.jvm.internal.L.f(this.f132954i, advertDetailsLink.f132954i) && kotlin.jvm.internal.L.f(this.f132955j, advertDetailsLink.f132955j) && kotlin.jvm.internal.L.f(this.f132956k, advertDetailsLink.f132956k) && kotlin.jvm.internal.L.f(this.f132957l, advertDetailsLink.f132957l);
    }

    public final int hashCode() {
        int iHashCode = this.f132947b.hashCode() * 31;
        String str = this.f132948c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132949d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132950e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f132951f;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Segment segment = this.f132952g;
        int iHashCode6 = (iHashCode5 + (segment == null ? 0 : segment.hashCode())) * 31;
        String str4 = this.f132953h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f132954i;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f132955j;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Image image = this.f132956k;
        int iHashCode10 = (iHashCode9 + (image == null ? 0 : image.hashCode())) * 31;
        GigParams gigParams = this.f132957l;
        return iHashCode10 + (gigParams != null ? gigParams.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return getUri().buildUpon().appendQueryParameter("itemId", this.f132947b).appendQueryParameter("context", this.f132948c).build().toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132947b);
        parcel.writeString(this.f132948c);
        parcel.writeString(this.f132949d);
        parcel.writeString(this.f132950e);
        Boolean bool = this.f132951f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Segment segment = this.f132952g;
        if (segment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(segment.name());
        }
        parcel.writeString(this.f132953h);
        Integer num = this.f132954i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f132955j);
        parcel.writeParcelable(this.f132956k, i12);
        GigParams gigParams = this.f132957l;
        if (gigParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gigParams.writeToParcel(parcel, i12);
        }
    }

    public AdvertDetailsLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Boolean bool, @Y61.l Segment segment, @Y61.l String str5, @Y61.l Integer num, @Y61.l String str6, @Y61.l Image image, @Y61.l GigParams gigParams) {
        this.f132947b = str;
        this.f132948c = str2;
        this.f132949d = str3;
        this.f132950e = str4;
        this.f132951f = bool;
        this.f132952g = segment;
        this.f132953h = str5;
        this.f132954i = num;
        this.f132955j = str6;
        this.f132956k = image;
        this.f132957l = gigParams;
    }
}

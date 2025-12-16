package com.avito.android.deep_linking.links;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: WebViewLink.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/deep_linking/links/v;", "AnyDomain", "OnlyAvitoDomain", "a", "Lcom/avito/android/deep_linking/links/WebViewLink$AnyDomain;", "Lcom/avito/android/deep_linking/links/WebViewLink$OnlyAvitoDomain;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class WebViewLink extends DeepLink implements v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Uri f133855b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WebViewLinkSettings f133856c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f133857d;

    /* compiled from: WebViewLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink$a;", "LJu/c$b;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/deep_linking/links/WebViewLink$a$a;", "Lcom/avito/android/deep_linking/links/WebViewLink$a$b;", "Lcom/avito/android/deep_linking/links/WebViewLink$a$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements InterfaceC14249c.b {

        /* compiled from: WebViewLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink$a$a;", "Lcom/avito/android/deep_linking/links/WebViewLink$a;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.WebViewLink$a$a, reason: collision with other inner class name */
        public static final class C4021a extends a implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4021a f133864b = new C4021a();

            public C4021a() {
                super(null);
            }
        }

        /* compiled from: WebViewLink.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink$a$b;", "Lcom/avito/android/deep_linking/links/WebViewLink$a;", "LJu/a$a;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a implements InterfaceC14247a.InterfaceC0545a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133865b = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: WebViewLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink$a$c;", "Lcom/avito/android/deep_linking/links/WebViewLink$a;", "LJu/a$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final DeepLink f133866b;

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f133866b, ((c) obj).f133866b);
            }

            public final int hashCode() {
                DeepLink deepLink = this.f133866b;
                if (deepLink == null) {
                    return 0;
                }
                return deepLink.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Done(unresolvedDeeplink="), this.f133866b, ')');
            }

            public c(@Y61.l DeepLink deepLink) {
                super(null);
                this.f133866b = deepLink;
            }

            public /* synthetic */ c(DeepLink deepLink, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : deepLink);
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ WebViewLink(Uri uri, WebViewLinkSettings webViewLinkSettings, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
        this(uri, (i12 & 2) != 0 ? new WebViewLinkSettings(false, false, false, false, false, null, null, false, false, false, false, 2047, null) : webViewLinkSettings, (i12 & 4) != 0 ? null : parametrizedEvent, null);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public ParametrizedEvent getF133857d() {
        return this.f133857d;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public Uri getF133855b() {
        return this.f133855b;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public WebViewLinkSettings getF133856c() {
        return this.f133856c;
    }

    /* compiled from: WebViewLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink$AnyDomain;", "Lcom/avito/android/deep_linking/links/WebViewLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class AnyDomain extends WebViewLink {

        @Y61.k
        public static final Parcelable.Creator<AnyDomain> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Uri f133858e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final WebViewLinkSettings f133859f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final ParametrizedEvent f133860g;

        /* compiled from: WebViewLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AnyDomain> {
            @Override // android.os.Parcelable.Creator
            public final AnyDomain createFromParcel(Parcel parcel) {
                return new AnyDomain((Uri) parcel.readParcelable(AnyDomain.class.getClassLoader()), WebViewLinkSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AnyDomain[] newArray(int i12) {
                return new AnyDomain[i12];
            }
        }

        public /* synthetic */ AnyDomain(Uri uri, WebViewLinkSettings webViewLinkSettings, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
            WebViewLinkSettings webViewLinkSettings2;
            Uri uri2;
            ParametrizedEvent parametrizedEvent2;
            if ((i12 & 2) != 0) {
                webViewLinkSettings2 = new WebViewLinkSettings(false, false, false, false, false, null, null, false, false, false, false, 2047, null);
            } else {
                webViewLinkSettings2 = webViewLinkSettings;
            }
            if ((i12 & 4) != 0) {
                parametrizedEvent2 = null;
                uri2 = uri;
            } else {
                uri2 = uri;
                parametrizedEvent2 = parametrizedEvent;
            }
            this(uri2, webViewLinkSettings2, parametrizedEvent2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnyDomain)) {
                return false;
            }
            AnyDomain anyDomain = (AnyDomain) obj;
            return kotlin.jvm.internal.L.f(this.f133858e, anyDomain.f133858e) && kotlin.jvm.internal.L.f(this.f133859f, anyDomain.f133859f) && kotlin.jvm.internal.L.f(this.f133860g, anyDomain.f133860g);
        }

        @Override // com.avito.android.deep_linking.links.WebViewLink
        @Y61.l
        /* renamed from: f, reason: from getter */
        public final ParametrizedEvent getF133857d() {
            return this.f133860g;
        }

        @Override // com.avito.android.deep_linking.links.WebViewLink
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final Uri getF133855b() {
            return this.f133858e;
        }

        @Override // com.avito.android.deep_linking.links.WebViewLink
        @Y61.k
        /* renamed from: h, reason: from getter */
        public final WebViewLinkSettings getF133856c() {
            return this.f133859f;
        }

        public final int hashCode() {
            int iHashCode = (this.f133859f.hashCode() + (this.f133858e.hashCode() * 31)) * 31;
            ParametrizedEvent parametrizedEvent = this.f133860g;
            return iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnyDomain(extendedUrl=");
            sb2.append(this.f133858e);
            sb2.append(", settings=");
            sb2.append(this.f133859f);
            sb2.append(", displayEvent=");
            return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f133860g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f133858e, i12);
            this.f133859f.writeToParcel(parcel, i12);
            ParametrizedEvent parametrizedEvent = this.f133860g;
            if (parametrizedEvent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parametrizedEvent.writeToParcel(parcel, i12);
            }
        }

        public AnyDomain(@Y61.k Uri uri, @Y61.k WebViewLinkSettings webViewLinkSettings, @Y61.l ParametrizedEvent parametrizedEvent) {
            super(uri, webViewLinkSettings, parametrizedEvent, null);
            this.f133858e = uri;
            this.f133859f = webViewLinkSettings;
            this.f133860g = parametrizedEvent;
        }
    }

    /* compiled from: WebViewLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/WebViewLink$OnlyAvitoDomain;", "Lcom/avito/android/deep_linking/links/WebViewLink;", "Lcom/avito/android/deep_linking/links/q;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class OnlyAvitoDomain extends WebViewLink implements q {

        @Y61.k
        public static final Parcelable.Creator<OnlyAvitoDomain> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Uri f133861e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final WebViewLinkSettings f133862f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final ParametrizedEvent f133863g;

        /* compiled from: WebViewLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnlyAvitoDomain> {
            @Override // android.os.Parcelable.Creator
            public final OnlyAvitoDomain createFromParcel(Parcel parcel) {
                return new OnlyAvitoDomain((Uri) parcel.readParcelable(OnlyAvitoDomain.class.getClassLoader()), WebViewLinkSettings.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final OnlyAvitoDomain[] newArray(int i12) {
                return new OnlyAvitoDomain[i12];
            }
        }

        public /* synthetic */ OnlyAvitoDomain(Uri uri, WebViewLinkSettings webViewLinkSettings, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
            WebViewLinkSettings webViewLinkSettings2;
            Uri uri2;
            ParametrizedEvent parametrizedEvent2;
            if ((i12 & 2) != 0) {
                webViewLinkSettings2 = new WebViewLinkSettings(false, false, false, false, false, null, null, false, false, false, false, 2047, null);
            } else {
                webViewLinkSettings2 = webViewLinkSettings;
            }
            if ((i12 & 4) != 0) {
                parametrizedEvent2 = null;
                uri2 = uri;
            } else {
                uri2 = uri;
                parametrizedEvent2 = parametrizedEvent;
            }
            this(uri2, webViewLinkSettings2, parametrizedEvent2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlyAvitoDomain)) {
                return false;
            }
            OnlyAvitoDomain onlyAvitoDomain = (OnlyAvitoDomain) obj;
            return kotlin.jvm.internal.L.f(this.f133861e, onlyAvitoDomain.f133861e) && kotlin.jvm.internal.L.f(this.f133862f, onlyAvitoDomain.f133862f) && kotlin.jvm.internal.L.f(this.f133863g, onlyAvitoDomain.f133863g);
        }

        @Override // com.avito.android.deep_linking.links.WebViewLink
        @Y61.l
        /* renamed from: f, reason: from getter */
        public final ParametrizedEvent getF133857d() {
            return this.f133863g;
        }

        @Override // com.avito.android.deep_linking.links.WebViewLink
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final Uri getF133855b() {
            return this.f133861e;
        }

        @Override // com.avito.android.deep_linking.links.WebViewLink
        @Y61.k
        /* renamed from: h, reason: from getter */
        public final WebViewLinkSettings getF133856c() {
            return this.f133862f;
        }

        public final int hashCode() {
            int iHashCode = (this.f133862f.hashCode() + (this.f133861e.hashCode() * 31)) * 31;
            ParametrizedEvent parametrizedEvent = this.f133863g;
            return iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnlyAvitoDomain(extendedUrl=");
            sb2.append(this.f133861e);
            sb2.append(", settings=");
            sb2.append(this.f133862f);
            sb2.append(", displayEvent=");
            return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f133863g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f133861e, i12);
            this.f133862f.writeToParcel(parcel, i12);
            ParametrizedEvent parametrizedEvent = this.f133863g;
            if (parametrizedEvent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parametrizedEvent.writeToParcel(parcel, i12);
            }
        }

        public OnlyAvitoDomain(@Y61.k Uri uri, @Y61.k WebViewLinkSettings webViewLinkSettings, @Y61.l ParametrizedEvent parametrizedEvent) {
            super(uri, webViewLinkSettings, parametrizedEvent, null);
            this.f133861e = uri;
            this.f133862f = webViewLinkSettings;
            this.f133863g = parametrizedEvent;
        }
    }

    public WebViewLink(Uri uri, WebViewLinkSettings webViewLinkSettings, ParametrizedEvent parametrizedEvent, C42822w c42822w) {
        this.f133855b = uri;
        this.f133856c = webViewLinkSettings;
        this.f133857d = parametrizedEvent;
    }
}

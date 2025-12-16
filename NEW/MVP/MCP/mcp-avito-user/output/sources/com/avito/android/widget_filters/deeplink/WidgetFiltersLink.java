package com.avito.android.widget_filters.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.B;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParams;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: WidgetFiltersLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/deep_linking/links/B;", "b", "WidgetFiltersFlow", "_avito_widget-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class WidgetFiltersLink extends DeepLink implements B {

    @k
    public static final Parcelable.Creator<WidgetFiltersLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f329733b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SearchParams f329734c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f329735d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final WidgetFiltersFlow f329736e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WidgetFiltersLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$WidgetFiltersFlow;", "", "a", "_avito_widget-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WidgetFiltersFlow {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f329737b;

        /* renamed from: c, reason: collision with root package name */
        public static final WidgetFiltersFlow f329738c;

        /* renamed from: d, reason: collision with root package name */
        public static final WidgetFiltersFlow f329739d;

        /* renamed from: e, reason: collision with root package name */
        public static final WidgetFiltersFlow f329740e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ WidgetFiltersFlow[] f329741f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f329742g;

        /* compiled from: WidgetFiltersLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$WidgetFiltersFlow$a;", "", "<init>", "()V", "_avito_widget-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            WidgetFiltersFlow widgetFiltersFlow = new WidgetFiltersFlow("REDIRECT", 0);
            f329738c = widgetFiltersFlow;
            WidgetFiltersFlow widgetFiltersFlow2 = new WidgetFiltersFlow("PARAMETERS_UPDATE", 1);
            f329739d = widgetFiltersFlow2;
            WidgetFiltersFlow widgetFiltersFlow3 = new WidgetFiltersFlow(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            f329740e = widgetFiltersFlow3;
            WidgetFiltersFlow[] widgetFiltersFlowArr = {widgetFiltersFlow, widgetFiltersFlow2, widgetFiltersFlow3};
            f329741f = widgetFiltersFlowArr;
            f329742g = kotlin.enums.c.a(widgetFiltersFlowArr);
            f329737b = new a(null);
        }

        public WidgetFiltersFlow() {
            throw null;
        }

        public static WidgetFiltersFlow valueOf(String str) {
            return (WidgetFiltersFlow) Enum.valueOf(WidgetFiltersFlow.class, str);
        }

        public static WidgetFiltersFlow[] values() {
            return (WidgetFiltersFlow[]) f329741f.clone();
        }
    }

    /* compiled from: WidgetFiltersLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetFiltersLink> {
        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersLink createFromParcel(Parcel parcel) {
            return new WidgetFiltersLink(parcel.readString(), (SearchParams) parcel.readParcelable(WidgetFiltersLink.class.getClassLoader()), parcel.readString(), WidgetFiltersFlow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetFiltersLink[] newArray(int i12) {
            return new WidgetFiltersLink[i12];
        }
    }

    /* compiled from: WidgetFiltersLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$b;", "", "a", "b", "Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$b$a;", "Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$b$b;", "_avito_widget-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: WidgetFiltersLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$b$a;", "Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$b;", "LJu/c$b;", "_avito_widget-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f329743b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f329744c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f329745d;

            public a(@l String str, @k DeepLink deepLink, boolean z12) {
                this.f329743b = deepLink;
                this.f329744c = str;
                this.f329745d = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f329743b, aVar.f329743b) && L.f(this.f329744c, aVar.f329744c) && this.f329745d == aVar.f329745d;
            }

            public final int hashCode() {
                int iHashCode = this.f329743b.hashCode() * 31;
                String str = this.f329744c;
                return Boolean.hashCode(this.f329745d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ClarifySearch(deepLink=");
                sb2.append(this.f329743b);
                sb2.append(", updatedLocationId=");
                sb2.append(this.f329744c);
                sb2.append(", resetArea=");
                return r.x(sb2, this.f329745d, ')');
            }
        }

        /* compiled from: WidgetFiltersLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$b$b;", "Lcom/avito/android/widget_filters/deeplink/WidgetFiltersLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_widget-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.widget_filters.deeplink.WidgetFiltersLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C10242b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C10242b f329746b = new C10242b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C10242b);
            }

            public final int hashCode() {
                return -643353296;
            }

            @k
            public final String toString() {
                return "SuccessRedirect";
            }
        }
    }

    public /* synthetic */ WidgetFiltersLink(String str, SearchParams searchParams, String str2, WidgetFiltersFlow widgetFiltersFlow, int i12, C42822w c42822w) {
        this(str, searchParams, str2, (i12 & 8) != 0 ? WidgetFiltersFlow.f329740e : widgetFiltersFlow);
    }

    @Override // com.avito.android.deep_linking.links.B
    @l
    /* renamed from: W, reason: from getter */
    public final SearchParams getF329734c() {
        return this.f329734c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetFiltersLink)) {
            return false;
        }
        WidgetFiltersLink widgetFiltersLink = (WidgetFiltersLink) obj;
        return L.f(this.f329733b, widgetFiltersLink.f329733b) && L.f(this.f329734c, widgetFiltersLink.f329734c) && L.f(this.f329735d, widgetFiltersLink.f329735d) && this.f329736e == widgetFiltersLink.f329736e;
    }

    public final int hashCode() {
        String str = this.f329733b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SearchParams searchParams = this.f329734c;
        int iHashCode2 = (iHashCode + (searchParams == null ? 0 : searchParams.hashCode())) * 31;
        String str2 = this.f329735d;
        return this.f329736e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "WidgetFiltersLink(title=" + this.f329733b + ", searchParams=" + this.f329734c + ", fromPage=" + this.f329735d + ", flow=" + this.f329736e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f329733b);
        parcel.writeParcelable(this.f329734c, i12);
        parcel.writeString(this.f329735d);
        parcel.writeString(this.f329736e.name());
    }

    public WidgetFiltersLink(@l String str, @l SearchParams searchParams, @l String str2, @k WidgetFiltersFlow widgetFiltersFlow) {
        this.f329733b = str;
        this.f329734c = searchParams;
        this.f329735d = str2;
        this.f329736e = widgetFiltersFlow;
    }
}

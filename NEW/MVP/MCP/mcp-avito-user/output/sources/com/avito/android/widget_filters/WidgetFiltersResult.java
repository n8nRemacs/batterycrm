package com.avito.android.widget_filters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/widget_filters/WidgetFiltersResult;", "Landroid/os/Parcelable;", "<init>", "()V", "ClarifySearch", "a", "SuccessRedirect", "Lcom/avito/android/widget_filters/WidgetFiltersResult$ClarifySearch;", "Lcom/avito/android/widget_filters/WidgetFiltersResult$SuccessRedirect;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class WidgetFiltersResult implements Parcelable {

    /* compiled from: WidgetFiltersResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/WidgetFiltersResult$ClarifySearch;", "Lcom/avito/android/widget_filters/WidgetFiltersResult;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClarifySearch extends WidgetFiltersResult {

        @k
        public static final Parcelable.Creator<ClarifySearch> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f329692b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f329693c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f329694d;

        /* compiled from: WidgetFiltersResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClarifySearch> {
            @Override // android.os.Parcelable.Creator
            public final ClarifySearch createFromParcel(Parcel parcel) {
                return new ClarifySearch(parcel.readString(), (DeepLink) parcel.readParcelable(ClarifySearch.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ClarifySearch[] newArray(int i12) {
                return new ClarifySearch[i12];
            }
        }

        public ClarifySearch(@l String str, @k DeepLink deepLink, boolean z12) {
            super(null);
            this.f329692b = deepLink;
            this.f329693c = str;
            this.f329694d = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClarifySearch)) {
                return false;
            }
            ClarifySearch clarifySearch = (ClarifySearch) obj;
            return L.f(this.f329692b, clarifySearch.f329692b) && L.f(this.f329693c, clarifySearch.f329693c) && this.f329694d == clarifySearch.f329694d;
        }

        public final int hashCode() {
            int iHashCode = this.f329692b.hashCode() * 31;
            String str = this.f329693c;
            return Boolean.hashCode(this.f329694d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClarifySearch(deepLink=");
            sb2.append(this.f329692b);
            sb2.append(", updatedLocationId=");
            sb2.append(this.f329693c);
            sb2.append(", resetArea=");
            return r.x(sb2, this.f329694d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f329692b, i12);
            parcel.writeString(this.f329693c);
            parcel.writeInt(this.f329694d ? 1 : 0);
        }
    }

    /* compiled from: WidgetFiltersResult.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/WidgetFiltersResult$SuccessRedirect;", "Lcom/avito/android/widget_filters/WidgetFiltersResult;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessRedirect extends WidgetFiltersResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SuccessRedirect f329695b = new SuccessRedirect();

        @k
        public static final Parcelable.Creator<SuccessRedirect> CREATOR = new a();

        /* compiled from: WidgetFiltersResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SuccessRedirect> {
            @Override // android.os.Parcelable.Creator
            public final SuccessRedirect createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SuccessRedirect.f329695b;
            }

            @Override // android.os.Parcelable.Creator
            public final SuccessRedirect[] newArray(int i12) {
                return new SuccessRedirect[i12];
            }
        }

        public SuccessRedirect() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SuccessRedirect);
        }

        public final int hashCode() {
            return -1029343582;
        }

        @k
        public final String toString() {
            return "SuccessRedirect";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: WidgetFiltersResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/widget_filters/WidgetFiltersResult$a;", "", "<init>", "()V", "", "RESULT_KEY", "Ljava/lang/String;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ WidgetFiltersResult(C42822w c42822w) {
        this();
    }

    public WidgetFiltersResult() {
    }
}

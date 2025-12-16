package com.avito.android.service_transportation_info.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TransportationGeo.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportationGeo;", "Landroid/os/Parcelable;", "Raw", "Routes", "Lcom/avito/android/service_transportation_info/model/TransportationGeo$Raw;", "Lcom/avito/android/service_transportation_info/model/TransportationGeo$Routes;", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransportationGeo extends Parcelable {

    /* compiled from: TransportationGeo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportationGeo$Raw;", "Lcom/avito/android/service_transportation_info/model/TransportationGeo;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "a", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Raw implements TransportationGeo {

        @k
        public static final Parcelable.Creator<Raw> CREATOR;

        @c("text")
        @k
        private final AttributedText text;

        @c("title")
        @k
        private final String title;

        /* compiled from: TransportationGeo.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportationGeo$Raw$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: TransportationGeo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Raw> {
            @Override // android.os.Parcelable.Creator
            public final Raw createFromParcel(Parcel parcel) {
                return new Raw(parcel.readString(), (AttributedText) parcel.readParcelable(Raw.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Raw[] newArray(int i12) {
                return new Raw[i12];
            }
        }

        static {
            new a(null);
            CREATOR = new b();
        }

        public Raw(@k String str, @k AttributedText attributedText) {
            this.title = str;
            this.text = attributedText;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Raw)) {
                return false;
            }
            Raw raw = (Raw) obj;
            return L.f(this.title, raw.title) && L.f(this.text, raw.text);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Raw(title=");
            sb2.append(this.title);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.text, i12);
        }
    }

    /* compiled from: TransportationGeo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportationGeo$Routes;", "Lcom/avito/android/service_transportation_info/model/TransportationGeo;", "", "title", "", "Lcom/avito/android/service_transportation_info/model/TransportationGeo$Routes$Route;", "items", "", "collapsedLimit", "expandTitle", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "d", "a", "Route", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Routes implements TransportationGeo {

        @k
        public static final Parcelable.Creator<Routes> CREATOR;

        @c("collapsedLimit")
        @l
        private final Integer collapsedLimit;

        @c("expandTitle")
        @l
        private final String expandTitle;

        @c("items")
        @k
        private final List<Route> items;

        @c("title")
        @k
        private final String title;

        /* compiled from: TransportationGeo.kt */
        @d
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportationGeo$Routes$Route;", "Landroid/os/Parcelable;", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "", "bothWays", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Route implements Parcelable {

            @k
            public static final Parcelable.Creator<Route> CREATOR = new a();

            @c("bothWays")
            @l
            private final Boolean bothWays;

            @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
            @k
            private final String from;

            @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
            @k
            private final String to;

            /* compiled from: TransportationGeo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Route> {
                @Override // android.os.Parcelable.Creator
                public final Route createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Route(string, string2, boolValueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final Route[] newArray(int i12) {
                    return new Route[i12];
                }
            }

            public Route(@k String str, @k String str2, @l Boolean bool) {
                this.from = str;
                this.to = str2;
                this.bothWays = bool;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Boolean getBothWays() {
                return this.bothWays;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getFrom() {
                return this.from;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @k
            /* renamed from: e, reason: from getter */
            public final String getTo() {
                return this.to;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Route)) {
                    return false;
                }
                Route route = (Route) obj;
                return L.f(this.from, route.from) && L.f(this.to, route.to) && L.f(this.bothWays, route.bothWays);
            }

            public final int hashCode() {
                int iD2 = H.d(this.from.hashCode() * 31, 31, this.to);
                Boolean bool = this.bothWays;
                return iD2 + (bool == null ? 0 : bool.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Route(from=");
                sb2.append(this.from);
                sb2.append(", to=");
                sb2.append(this.to);
                sb2.append(", bothWays=");
                return C0.g(sb2, this.bothWays, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.from);
                parcel.writeString(this.to);
                Boolean bool = this.bothWays;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
            }
        }

        /* compiled from: TransportationGeo.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_transportation_info/model/TransportationGeo$Routes$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_service-transportation-info_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: TransportationGeo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Routes> {
            @Override // android.os.Parcelable.Creator
            public final Routes createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Route.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Routes(string, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Routes[] newArray(int i12) {
                return new Routes[i12];
            }
        }

        static {
            new a(null);
            CREATOR = new b();
        }

        public Routes(@k String str, @k List<Route> list, @l Integer num, @l String str2) {
            this.title = str;
            this.items = list;
            this.collapsedLimit = num;
            this.expandTitle = str2;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Integer getCollapsedLimit() {
            return this.collapsedLimit;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getExpandTitle() {
            return this.expandTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Routes)) {
                return false;
            }
            Routes routes = (Routes) obj;
            return L.f(this.title, routes.title) && L.f(this.items, routes.items) && L.f(this.collapsedLimit, routes.collapsedLimit) && L.f(this.expandTitle, routes.expandTitle);
        }

        @k
        public final List<Route> getItems() {
            return this.items;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iE2 = H.e(this.title.hashCode() * 31, 31, this.items);
            Integer num = this.collapsedLimit;
            int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.expandTitle;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Routes(title=");
            sb2.append(this.title);
            sb2.append(", items=");
            sb2.append(this.items);
            sb2.append(", collapsedLimit=");
            sb2.append(this.collapsedLimit);
            sb2.append(", expandTitle=");
            return C22026a.c(sb2, this.expandTitle, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.items, parcel);
            while (itJ.hasNext()) {
                ((Route) itJ.next()).writeToParcel(parcel, i12);
            }
            Integer num = this.collapsedLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.expandTitle);
        }
    }
}

package com.avito.android.service_booking.mvi.step.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingMviStepState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "ServiceBookingAnimationUrl", "ServiceBookingContent", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingMviStepState extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f274711i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final ServiceBookingMviStepState f274712j = new ServiceBookingMviStepState(true, null, null, null, false, AbstractC40048c.C11084c.f395217b, new LinkedHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274713b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ServiceBookingError f274714c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f274715d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ServiceBookingContent f274716e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f274717f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AbstractC40048c f274718g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Map<String, Set<Object>> f274719h;

    /* compiled from: ServiceBookingMviStepState.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState$ServiceBookingAnimationUrl;", "Landroid/os/Parcelable;", "", "portraitUrl", "landscapeUrl", "tabletPortraitUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "e", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingAnimationUrl implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingAnimationUrl> CREATOR = new a();

        @c("landscapeUrl")
        @l
        private final String landscapeUrl;

        @c("portraitUrl")
        @l
        private final String portraitUrl;

        @c("tabletPortraitUrl")
        @l
        private final String tabletPortraitUrl;

        /* compiled from: ServiceBookingMviStepState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingAnimationUrl> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingAnimationUrl createFromParcel(Parcel parcel) {
                return new ServiceBookingAnimationUrl(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingAnimationUrl[] newArray(int i12) {
                return new ServiceBookingAnimationUrl[i12];
            }
        }

        public ServiceBookingAnimationUrl(@l String str, @l String str2, @l String str3) {
            this.portraitUrl = str;
            this.landscapeUrl = str2;
            this.tabletPortraitUrl = str3;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getLandscapeUrl() {
            return this.landscapeUrl;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getPortraitUrl() {
            return this.portraitUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getTabletPortraitUrl() {
            return this.tabletPortraitUrl;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingAnimationUrl)) {
                return false;
            }
            ServiceBookingAnimationUrl serviceBookingAnimationUrl = (ServiceBookingAnimationUrl) obj;
            return L.f(this.portraitUrl, serviceBookingAnimationUrl.portraitUrl) && L.f(this.landscapeUrl, serviceBookingAnimationUrl.landscapeUrl) && L.f(this.tabletPortraitUrl, serviceBookingAnimationUrl.tabletPortraitUrl);
        }

        public final int hashCode() {
            String str = this.portraitUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.landscapeUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tabletPortraitUrl;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingAnimationUrl(portraitUrl=");
            sb2.append(this.portraitUrl);
            sb2.append(", landscapeUrl=");
            sb2.append(this.landscapeUrl);
            sb2.append(", tabletPortraitUrl=");
            return C22026a.c(sb2, this.tabletPortraitUrl, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.portraitUrl);
            parcel.writeString(this.landscapeUrl);
            parcel.writeString(this.tabletPortraitUrl);
        }
    }

    /* compiled from: ServiceBookingMviStepState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState$ServiceBookingContent;", "Landroid/os/Parcelable;", "SrvBookingNextAction", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ServiceBookingContent implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f274720b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f274721c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f274722d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f274723e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f274724f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f274725g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f274726h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final SrvBookingNextAction f274727i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final Map<String, StepBlockProperty> f274728j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f274729k;

        /* compiled from: ServiceBookingMviStepState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState$ServiceBookingContent$SrvBookingNextAction;", "Landroid/os/Parcelable;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SrvBookingNextAction implements Parcelable {

            @k
            public static final Parcelable.Creator<SrvBookingNextAction> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f274730b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f274731c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f274732d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f274733e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final DeepLink f274734f;

            /* compiled from: ServiceBookingMviStepState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SrvBookingNextAction> {
                @Override // android.os.Parcelable.Creator
                public final SrvBookingNextAction createFromParcel(Parcel parcel) {
                    return new SrvBookingNextAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SrvBookingNextAction.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SrvBookingNextAction[] newArray(int i12) {
                    return new SrvBookingNextAction[i12];
                }
            }

            public SrvBookingNextAction(@k String str, @k String str2, @l String str3, @k String str4, @l DeepLink deepLink) {
                this.f274730b = str;
                this.f274731c = str2;
                this.f274732d = str3;
                this.f274733e = str4;
                this.f274734f = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SrvBookingNextAction)) {
                    return false;
                }
                SrvBookingNextAction srvBookingNextAction = (SrvBookingNextAction) obj;
                return L.f(this.f274730b, srvBookingNextAction.f274730b) && L.f(this.f274731c, srvBookingNextAction.f274731c) && L.f(this.f274732d, srvBookingNextAction.f274732d) && L.f(this.f274733e, srvBookingNextAction.f274733e) && L.f(this.f274734f, srvBookingNextAction.f274734f);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f274730b.hashCode() * 31, 31, this.f274731c);
                String str = this.f274732d;
                int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f274733e);
                DeepLink deepLink = this.f274734f;
                return iD3 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SrvBookingNextAction(title=");
                sb2.append(this.f274730b);
                sb2.append(", defaultTitle=");
                sb2.append(this.f274731c);
                sb2.append(", changedTitle=");
                sb2.append(this.f274732d);
                sb2.append(", nextStep=");
                sb2.append(this.f274733e);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f274734f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f274730b);
                parcel.writeString(this.f274731c);
                parcel.writeString(this.f274732d);
                parcel.writeString(this.f274733e);
                parcel.writeParcelable(this.f274734f, i12);
            }
        }

        /* compiled from: ServiceBookingMviStepState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingContent> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingContent createFromParcel(Parcel parcel) {
                boolean z12 = parcel.readInt() != 0;
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readValue(ServiceBookingContent.class.getClassLoader()));
                }
                SrvBookingNextAction srvBookingNextActionCreateFromParcel = parcel.readInt() != 0 ? SrvBookingNextAction.CREATOR.createFromParcel(parcel) : null;
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), StepBlockProperty.CREATOR.createFromParcel(parcel));
                }
                int i16 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList2.add(parcel.readValue(ServiceBookingContent.class.getClassLoader()));
                }
                return new ServiceBookingContent(z12, boolValueOf, boolValueOf2, string, string2, string3, arrayList, srvBookingNextActionCreateFromParcel, linkedHashMap, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingContent[] newArray(int i12) {
                return new ServiceBookingContent[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceBookingContent(boolean z12, @l Boolean bool, @l Boolean bool2, @l String str, @l String str2, @l String str3, @k List<? extends com.avito.conveyor_item.a> list, @l SrvBookingNextAction srvBookingNextAction, @k Map<String, StepBlockProperty> map, @k List<? extends com.avito.conveyor_item.a> list2) {
            this.f274720b = z12;
            this.f274721c = bool;
            this.f274722d = bool2;
            this.f274723e = str;
            this.f274724f = str2;
            this.f274725g = str3;
            this.f274726h = list;
            this.f274727i = srvBookingNextAction;
            this.f274728j = map;
            this.f274729k = list2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingContent)) {
                return false;
            }
            ServiceBookingContent serviceBookingContent = (ServiceBookingContent) obj;
            return this.f274720b == serviceBookingContent.f274720b && L.f(this.f274721c, serviceBookingContent.f274721c) && L.f(this.f274722d, serviceBookingContent.f274722d) && L.f(this.f274723e, serviceBookingContent.f274723e) && L.f(this.f274724f, serviceBookingContent.f274724f) && L.f(this.f274725g, serviceBookingContent.f274725g) && L.f(this.f274726h, serviceBookingContent.f274726h) && L.f(this.f274727i, serviceBookingContent.f274727i) && L.f(this.f274728j, serviceBookingContent.f274728j) && L.f(this.f274729k, serviceBookingContent.f274729k);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f274720b) * 31;
            Boolean bool = this.f274721c;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f274722d;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f274723e;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f274724f;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f274725g;
            int iE2 = H.e((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f274726h);
            SrvBookingNextAction srvBookingNextAction = this.f274727i;
            return this.f274729k.hashCode() + AK.c.c((iE2 + (srvBookingNextAction != null ? srvBookingNextAction.hashCode() : 0)) * 31, 31, this.f274728j);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingContent(hasCloseButton=");
            sb2.append(this.f274720b);
            sb2.append(", hasBackButton=");
            sb2.append(this.f274721c);
            sb2.append(", hasNextButton=");
            sb2.append(this.f274722d);
            sb2.append(", title=");
            sb2.append(this.f274723e);
            sb2.append(", prevActionButton=");
            sb2.append(this.f274724f);
            sb2.append(", returnButtonText=");
            sb2.append(this.f274725g);
            sb2.append(", blocks=");
            sb2.append(this.f274726h);
            sb2.append(", nextAction=");
            sb2.append(this.f274727i);
            sb2.append(", optionalsMap=");
            sb2.append(this.f274728j);
            sb2.append(", initialBlocksState=");
            return H.p(sb2, this.f274729k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f274720b ? 1 : 0);
            Boolean bool = this.f274721c;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.f274722d;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.f274723e);
            parcel.writeString(this.f274724f);
            parcel.writeString(this.f274725g);
            Iterator itJ = C0.j(this.f274726h, parcel);
            while (itJ.hasNext()) {
                parcel.writeValue(itJ.next());
            }
            SrvBookingNextAction srvBookingNextAction = this.f274727i;
            if (srvBookingNextAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                srvBookingNextAction.writeToParcel(parcel, i12);
            }
            Iterator itI = C0.i(parcel, this.f274728j);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                ((StepBlockProperty) entry.getValue()).writeToParcel(parcel, i12);
            }
            Iterator itJ2 = C0.j(this.f274729k, parcel);
            while (itJ2.hasNext()) {
                parcel.writeValue(itJ2.next());
            }
        }
    }

    /* compiled from: ServiceBookingMviStepState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState$a;", "", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ ServiceBookingMviStepState(boolean z12, ServiceBookingError serviceBookingError, String str, ServiceBookingContent serviceBookingContent, boolean z13, AbstractC40048c abstractC40048c, Map map, int i12, C42822w c42822w) {
        this(z12, serviceBookingError, str, serviceBookingContent, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? AbstractC40048c.C11084c.f395217b : abstractC40048c, map);
    }

    public static ServiceBookingMviStepState a(ServiceBookingMviStepState serviceBookingMviStepState, boolean z12, ServiceBookingError serviceBookingError, String str, ServiceBookingContent serviceBookingContent, boolean z13, Map map, int i12) {
        if ((i12 & 1) != 0) {
            z12 = serviceBookingMviStepState.f274713b;
        }
        boolean z14 = z12;
        if ((i12 & 2) != 0) {
            serviceBookingError = serviceBookingMviStepState.f274714c;
        }
        ServiceBookingError serviceBookingError2 = serviceBookingError;
        if ((i12 & 4) != 0) {
            str = serviceBookingMviStepState.f274715d;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            serviceBookingContent = serviceBookingMviStepState.f274716e;
        }
        ServiceBookingContent serviceBookingContent2 = serviceBookingContent;
        if ((i12 & 16) != 0) {
            z13 = serviceBookingMviStepState.f274717f;
        }
        boolean z15 = z13;
        AbstractC40048c abstractC40048c = serviceBookingMviStepState.f274718g;
        if ((i12 & 64) != 0) {
            map = serviceBookingMviStepState.f274719h;
        }
        serviceBookingMviStepState.getClass();
        return new ServiceBookingMviStepState(z14, serviceBookingError2, str2, serviceBookingContent2, z15, abstractC40048c, map);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingMviStepState)) {
            return false;
        }
        ServiceBookingMviStepState serviceBookingMviStepState = (ServiceBookingMviStepState) obj;
        return this.f274713b == serviceBookingMviStepState.f274713b && L.f(this.f274714c, serviceBookingMviStepState.f274714c) && L.f(this.f274715d, serviceBookingMviStepState.f274715d) && L.f(this.f274716e, serviceBookingMviStepState.f274716e) && this.f274717f == serviceBookingMviStepState.f274717f && L.f(this.f274718g, serviceBookingMviStepState.f274718g) && L.f(this.f274719h, serviceBookingMviStepState.f274719h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f274713b) * 31;
        ServiceBookingError serviceBookingError = this.f274714c;
        int iHashCode2 = (iHashCode + (serviceBookingError == null ? 0 : serviceBookingError.hashCode())) * 31;
        String str = this.f274715d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ServiceBookingContent serviceBookingContent = this.f274716e;
        return this.f274719h.hashCode() + ((this.f274718g.hashCode() + r.i((iHashCode3 + (serviceBookingContent != null ? serviceBookingContent.hashCode() : 0)) * 31, 31, this.f274717f)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingMviStepState(isLoading=");
        sb2.append(this.f274713b);
        sb2.append(", bookingError=");
        sb2.append(this.f274714c);
        sb2.append(", error=");
        sb2.append(this.f274715d);
        sb2.append(", serviceBookingFormContent=");
        sb2.append(this.f274716e);
        sb2.append(", allRequiredFilled=");
        sb2.append(this.f274717f);
        sb2.append(", beduinState=");
        sb2.append(this.f274718g);
        sb2.append(", selectedValues=");
        return r.w(sb2, this.f274719h, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceBookingMviStepState(boolean z12, @l ServiceBookingError serviceBookingError, @l String str, @l ServiceBookingContent serviceBookingContent, boolean z13, @k AbstractC40048c abstractC40048c, @k Map<String, ? extends Set<? extends Object>> map) {
        this.f274713b = z12;
        this.f274714c = serviceBookingError;
        this.f274715d = str;
        this.f274716e = serviceBookingContent;
        this.f274717f = z13;
        this.f274718g = abstractC40048c;
        this.f274719h = map;
    }
}

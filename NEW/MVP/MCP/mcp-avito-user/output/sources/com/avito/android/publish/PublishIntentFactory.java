package com.avito.android.publish;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.publish.PublishInitialToast;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PublishIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory;", "", "JobAssistantParams", "LocationPickerChooseButtonLocation", "SuggestLocationsFlowType", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PublishIntentFactory {

    /* compiled from: PublishIntentFactory.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$JobAssistantParams;", "Landroid/os/Parcelable;", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class JobAssistantParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<JobAssistantParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f231990b;

        /* compiled from: PublishIntentFactory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<JobAssistantParams> {
            @Override // android.os.Parcelable.Creator
            public final JobAssistantParams createFromParcel(Parcel parcel) {
                return new JobAssistantParams(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final JobAssistantParams[] newArray(int i12) {
                return new JobAssistantParams[i12];
            }
        }

        public JobAssistantParams(@Y61.k String str) {
            this.f231990b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JobAssistantParams) && kotlin.jvm.internal.L.f(this.f231990b, ((JobAssistantParams) obj).f231990b);
        }

        public final int hashCode() {
            return this.f231990b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("JobAssistantParams(channelId="), this.f231990b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f231990b);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PublishIntentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$LocationPickerChooseButtonLocation;", "", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocationPickerChooseButtonLocation {

        /* renamed from: b, reason: collision with root package name */
        public static final LocationPickerChooseButtonLocation f231991b;

        /* renamed from: c, reason: collision with root package name */
        public static final LocationPickerChooseButtonLocation f231992c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ LocationPickerChooseButtonLocation[] f231993d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231994e;

        static {
            LocationPickerChooseButtonLocation locationPickerChooseButtonLocation = new LocationPickerChooseButtonLocation("APPBAR", 0);
            f231991b = locationPickerChooseButtonLocation;
            LocationPickerChooseButtonLocation locationPickerChooseButtonLocation2 = new LocationPickerChooseButtonLocation("FOOTER", 1);
            f231992c = locationPickerChooseButtonLocation2;
            LocationPickerChooseButtonLocation[] locationPickerChooseButtonLocationArr = {locationPickerChooseButtonLocation, locationPickerChooseButtonLocation2};
            f231993d = locationPickerChooseButtonLocationArr;
            f231994e = kotlin.enums.c.a(locationPickerChooseButtonLocationArr);
        }

        public LocationPickerChooseButtonLocation() {
            throw null;
        }

        public static LocationPickerChooseButtonLocation valueOf(String str) {
            return (LocationPickerChooseButtonLocation) Enum.valueOf(LocationPickerChooseButtonLocation.class, str);
        }

        public static LocationPickerChooseButtonLocation[] values() {
            return (LocationPickerChooseButtonLocation[]) f231993d.clone();
        }
    }

    /* compiled from: PublishIntentFactory.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType;", "Landroid/os/Parcelable;", "Default", "DefaultNoMap", "Historical", "Region", "SingleFlow", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$Default;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$DefaultNoMap;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$Historical;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$Region;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$SingleFlow;", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SuggestLocationsFlowType extends Parcelable {

        /* compiled from: PublishIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$Default;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType;", "<init>", "()V", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Default implements SuggestLocationsFlowType {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Default f231995b = new Default();

            @Y61.k
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* compiled from: PublishIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Default> {
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Default.f231995b;
                }

                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i12) {
                    return new Default[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Default);
            }

            public final int hashCode() {
                return 1637112826;
            }

            @Y61.k
            public final String toString() {
                return "Default";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PublishIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$DefaultNoMap;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType;", "<init>", "()V", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DefaultNoMap implements SuggestLocationsFlowType {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final DefaultNoMap f231996b = new DefaultNoMap();

            @Y61.k
            public static final Parcelable.Creator<DefaultNoMap> CREATOR = new a();

            /* compiled from: PublishIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DefaultNoMap> {
                @Override // android.os.Parcelable.Creator
                public final DefaultNoMap createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return DefaultNoMap.f231996b;
                }

                @Override // android.os.Parcelable.Creator
                public final DefaultNoMap[] newArray(int i12) {
                    return new DefaultNoMap[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof DefaultNoMap);
            }

            public final int hashCode() {
                return 1929829377;
            }

            @Y61.k
            public final String toString() {
                return "DefaultNoMap";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PublishIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$Historical;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType;", "<init>", "()V", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Historical implements SuggestLocationsFlowType {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Historical f231997b = new Historical();

            @Y61.k
            public static final Parcelable.Creator<Historical> CREATOR = new a();

            /* compiled from: PublishIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Historical> {
                @Override // android.os.Parcelable.Creator
                public final Historical createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Historical.f231997b;
                }

                @Override // android.os.Parcelable.Creator
                public final Historical[] newArray(int i12) {
                    return new Historical[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Historical);
            }

            public final int hashCode() {
                return -1148415887;
            }

            @Y61.k
            public final String toString() {
                return "Historical";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PublishIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$Region;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType;", "<init>", "()V", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Region implements SuggestLocationsFlowType {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Region f231998b = new Region();

            @Y61.k
            public static final Parcelable.Creator<Region> CREATOR = new a();

            /* compiled from: PublishIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Region> {
                @Override // android.os.Parcelable.Creator
                public final Region createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Region.f231998b;
                }

                @Override // android.os.Parcelable.Creator
                public final Region[] newArray(int i12) {
                    return new Region[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Region);
            }

            public final int hashCode() {
                return -1070365157;
            }

            @Y61.k
            public final String toString() {
                return "Region";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PublishIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType$SingleFlow;", "Lcom/avito/android/publish/PublishIntentFactory$SuggestLocationsFlowType;", "_avito_publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SingleFlow implements SuggestLocationsFlowType {

            @Y61.k
            public static final Parcelable.Creator<SingleFlow> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f231999b;

            /* compiled from: PublishIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SingleFlow> {
                @Override // android.os.Parcelable.Creator
                public final SingleFlow createFromParcel(Parcel parcel) {
                    return new SingleFlow(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final SingleFlow[] newArray(int i12) {
                    return new SingleFlow[i12];
                }
            }

            public SingleFlow(@j.D int i12) {
                this.f231999b = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SingleFlow) && this.f231999b == ((SingleFlow) obj).f231999b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f231999b);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("SingleFlow(singleFlowContainerId="), this.f231999b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.f231999b);
            }
        }
    }

    /* compiled from: PublishIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent b(PublishIntentFactory publishIntentFactory, String str, DeepLink deepLink, int i12) {
            boolean z12 = (i12 & 2) != 0;
            if ((i12 & 4) != 0) {
                deepLink = null;
            }
            return publishIntentFactory.h(str, deepLink, z12);
        }
    }

    @Y61.k
    Intent a(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12);

    @Y61.k
    Intent b(@Y61.k DeepLink deepLink);

    @Y61.k
    Intent c(@Y61.l DeepLink deepLink, @Y61.k Navigation navigation2, @Y61.l PublishInitialToast publishInitialToast, @Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2, @Y61.l Map map, boolean z12);

    @Y61.k
    Intent d();

    @Y61.k
    Intent e(@Y61.l Navigation navigation2, @Y61.l DeepLink deepLink, boolean z12, @Y61.l PublishInitialToast publishInitialToast, boolean z13, @Y61.l Map<String, ? extends Object> map, @Y61.l String str, @Y61.l Boolean bool, @Y61.l String str2);

    @Y61.k
    Intent f(int i12);

    @Y61.k
    Intent g(@Y61.l AddressParameter.Value value, @Y61.l Radius radius, @Y61.l String str, @Y61.k LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, @Y61.l SearchParams searchParams, @Y61.l JobAssistantParams jobAssistantParams, @Y61.l AddressParameter.ValidationRules validationRules, boolean z12, @Y61.l String str2, @Y61.k FlowType flowType);

    @Y61.k
    Intent h(@Y61.k String str, @Y61.l DeepLink deepLink, boolean z12);
}

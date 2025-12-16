package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: UserAddressLink.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "BottomSheetState", "Edit", "ForceExit", "List", "Map", "MultiGeoMap", "MultiGeoSuggest", "Result", "Suggest", "a", "b", "c", "Lcom/avito/android/deep_linking/links/UserAddressLink$Edit;", "Lcom/avito/android/deep_linking/links/UserAddressLink$ForceExit;", "Lcom/avito/android/deep_linking/links/UserAddressLink$List;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Map;", "Lcom/avito/android/deep_linking/links/UserAddressLink$MultiGeoMap;", "Lcom/avito/android/deep_linking/links/UserAddressLink$MultiGeoSuggest;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Suggest;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class UserAddressLink extends DeepLink {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$BottomSheetState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "EXPANDED", "COLLAPSED", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BottomSheetState {

        @com.google.gson.annotations.c("collapsed")
        public static final BottomSheetState COLLAPSED;

        @com.google.gson.annotations.c(SearchParamsConverterKt.EXPANDED)
        public static final BottomSheetState EXPANDED;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f133775b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ BottomSheetState[] f133776c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133777d;

        /* compiled from: UserAddressLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$BottomSheetState$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @Y61.l
            public static BottomSheetState a(@Y61.l String str) {
                if (kotlin.jvm.internal.L.f(str, SearchParamsConverterKt.EXPANDED)) {
                    return BottomSheetState.EXPANDED;
                }
                if (kotlin.jvm.internal.L.f(str, "collapsed")) {
                    return BottomSheetState.COLLAPSED;
                }
                return null;
            }

            public a() {
            }
        }

        static {
            BottomSheetState bottomSheetState = new BottomSheetState("EXPANDED", 0);
            EXPANDED = bottomSheetState;
            BottomSheetState bottomSheetState2 = new BottomSheetState("COLLAPSED", 1);
            COLLAPSED = bottomSheetState2;
            BottomSheetState[] bottomSheetStateArr = {bottomSheetState, bottomSheetState2};
            f133776c = bottomSheetStateArr;
            f133777d = kotlin.enums.c.a(bottomSheetStateArr);
            f133775b = new a(null);
        }

        private BottomSheetState(String str, int i12) {
        }

        public static BottomSheetState valueOf(String str) {
            return (BottomSheetState) Enum.valueOf(BottomSheetState.class, str);
        }

        public static BottomSheetState[] values() {
            return (BottomSheetState[]) f133776c.clone();
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Edit;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "Lcom/avito/android/deep_linking/links/UserAddressLink$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class Edit extends UserAddressLink implements c {

        @Y61.k
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133778b;

        /* renamed from: c, reason: collision with root package name */
        public final int f133779c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133780d;

        /* compiled from: UserAddressLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Edit> {
            @Override // android.os.Parcelable.Creator
            public final Edit createFromParcel(Parcel parcel) {
                return new Edit(parcel.readInt(), (DeepLink) parcel.readParcelable(Edit.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Edit[] newArray(int i12) {
                return new Edit[i12];
            }
        }

        public /* synthetic */ Edit(String str, int i12, DeepLink deepLink, int i13, C42822w c42822w) {
            this(i12, (i13 & 4) != 0 ? null : deepLink, (i13 & 1) != 0 ? null : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj;
            return kotlin.jvm.internal.L.f(this.f133778b, edit.f133778b) && this.f133779c == edit.f133779c && kotlin.jvm.internal.L.f(this.f133780d, edit.f133780d);
        }

        public final int hashCode() {
            String str = this.f133778b;
            int iE2 = androidx.appcompat.app.r.e(this.f133779c, (str == null ? 0 : str.hashCode()) * 31, 31);
            DeepLink deepLink = this.f133780d;
            return iE2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Edit(geoSession=");
            sb2.append(this.f133778b);
            sb2.append(", addressId=");
            sb2.append(this.f133779c);
            sb2.append(", successUrl=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f133780d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133778b);
            parcel.writeInt(this.f133779c);
            parcel.writeParcelable(this.f133780d, i12);
        }

        public Edit(int i12, @Y61.l DeepLink deepLink, @Y61.l String str) {
            super(null);
            this.f133778b = str;
            this.f133779c = i12;
            this.f133780d = deepLink;
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$ForceExit;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class ForceExit extends UserAddressLink {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ForceExit f133781b = new ForceExit();

        @Y61.k
        public static final Parcelable.Creator<ForceExit> CREATOR = new a();

        /* compiled from: UserAddressLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ForceExit> {
            @Override // android.os.Parcelable.Creator
            public final ForceExit createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ForceExit.f133781b;
            }

            @Override // android.os.Parcelable.Creator
            public final ForceExit[] newArray(int i12) {
                return new ForceExit[i12];
            }
        }

        public ForceExit() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$List;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "Lcom/avito/android/deep_linking/links/UserAddressLink$c;", "Lcom/avito/android/deep_linking/links/UserAddressLink$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class List extends UserAddressLink implements c, a {

        @Y61.k
        public static final Parcelable.Creator<List> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133782b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f133783c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final BottomSheetState f133784d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133785e;

        /* compiled from: UserAddressLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<List> {
            @Override // android.os.Parcelable.Creator
            public final List createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                return new List((DeepLink) parcel.readParcelable(List.class.getClassLoader()), BottomSheetState.valueOf(parcel.readString()), string, string2);
            }

            @Override // android.os.Parcelable.Creator
            public final List[] newArray(int i12) {
                return new List[i12];
            }
        }

        public List() {
            this(null, null, null, null, 15, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            return kotlin.jvm.internal.L.f(this.f133782b, list.f133782b) && kotlin.jvm.internal.L.f(this.f133783c, list.f133783c) && this.f133784d == list.f133784d && kotlin.jvm.internal.L.f(this.f133785e, list.f133785e);
        }

        public final int hashCode() {
            String str = this.f133782b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f133783c;
            int iHashCode2 = (this.f133784d.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            DeepLink deepLink = this.f133785e;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("List(geoSessionId=");
            sb2.append(this.f133782b);
            sb2.append(", fromPage=");
            sb2.append(this.f133783c);
            sb2.append(", bottomSheetState=");
            sb2.append(this.f133784d);
            sb2.append(", successUrl=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f133785e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133782b);
            parcel.writeString(this.f133783c);
            parcel.writeString(this.f133784d.name());
            parcel.writeParcelable(this.f133785e, i12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ List(String str, String str2, BottomSheetState bottomSheetState, DeepLink deepLink, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            this((i12 & 8) != 0 ? null : deepLink, (i12 & 4) != 0 ? BottomSheetState.COLLAPSED : bottomSheetState, str, str2);
        }

        public List(@Y61.l DeepLink deepLink, @Y61.k BottomSheetState bottomSheetState, @Y61.l String str, @Y61.l String str2) {
            super(null);
            this.f133782b = str;
            this.f133783c = str2;
            this.f133784d = bottomSheetState;
            this.f133785e = deepLink;
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$MultiGeoMap;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "Lcom/avito/android/deep_linking/links/UserAddressLink$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class MultiGeoMap extends UserAddressLink implements c {

        @Y61.k
        public static final Parcelable.Creator<MultiGeoMap> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133793b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133794c;

        /* renamed from: d, reason: collision with root package name */
        public final int f133795d;

        /* renamed from: e, reason: collision with root package name */
        public final double f133796e;

        /* renamed from: f, reason: collision with root package name */
        public final double f133797f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final JobMultiGeoLink.FlowType f133798g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133799h;

        /* compiled from: UserAddressLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MultiGeoMap> {
            @Override // android.os.Parcelable.Creator
            public final MultiGeoMap createFromParcel(Parcel parcel) {
                return new MultiGeoMap(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), JobMultiGeoLink.FlowType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(MultiGeoMap.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MultiGeoMap[] newArray(int i12) {
                return new MultiGeoMap[i12];
            }
        }

        public /* synthetic */ MultiGeoMap(String str, String str2, int i12, double d12, double d13, JobMultiGeoLink.FlowType flowType, DeepLink deepLink, int i13, C42822w c42822w) {
            this(str, str2, i12, d12, d13, flowType, (i13 & 64) != 0 ? null : deepLink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiGeoMap)) {
                return false;
            }
            MultiGeoMap multiGeoMap = (MultiGeoMap) obj;
            return kotlin.jvm.internal.L.f(this.f133793b, multiGeoMap.f133793b) && kotlin.jvm.internal.L.f(this.f133794c, multiGeoMap.f133794c) && this.f133795d == multiGeoMap.f133795d && Double.compare(this.f133796e, multiGeoMap.f133796e) == 0 && Double.compare(this.f133797f, multiGeoMap.f133797f) == 0 && this.f133798g == multiGeoMap.f133798g && kotlin.jvm.internal.L.f(this.f133799h, multiGeoMap.f133799h);
        }

        public final int hashCode() {
            int iHashCode = (this.f133798g.hashCode() + androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d(androidx.appcompat.app.r.e(this.f133795d, androidx.compose.foundation.H.d(this.f133793b.hashCode() * 31, 31, this.f133794c), 31), 31, this.f133796e), 31, this.f133797f)) * 31;
            DeepLink deepLink = this.f133799h;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiGeoMap(jwt=");
            sb2.append(this.f133793b);
            sb2.append(", address=");
            sb2.append(this.f133794c);
            sb2.append(", addressId=");
            sb2.append(this.f133795d);
            sb2.append(", longitude=");
            sb2.append(this.f133796e);
            sb2.append(", latitude=");
            sb2.append(this.f133797f);
            sb2.append(", flowType=");
            sb2.append(this.f133798g);
            sb2.append(", successUrl=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f133799h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133793b);
            parcel.writeString(this.f133794c);
            parcel.writeInt(this.f133795d);
            parcel.writeDouble(this.f133796e);
            parcel.writeDouble(this.f133797f);
            parcel.writeString(this.f133798g.name());
            parcel.writeParcelable(this.f133799h, i12);
        }

        public MultiGeoMap(@Y61.k String str, @Y61.k String str2, int i12, double d12, double d13, @Y61.k JobMultiGeoLink.FlowType flowType, @Y61.l DeepLink deepLink) {
            super(null);
            this.f133793b = str;
            this.f133794c = str2;
            this.f133795d = i12;
            this.f133796e = d12;
            this.f133797f = d13;
            this.f133798g = flowType;
            this.f133799h = deepLink;
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$MultiGeoSuggest;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "Lcom/avito/android/deep_linking/links/UserAddressLink$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class MultiGeoSuggest extends UserAddressLink implements c {

        @Y61.k
        public static final Parcelable.Creator<MultiGeoSuggest> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133800b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final JobMultiGeoLink.FlowType f133801c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133802d;

        /* compiled from: UserAddressLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MultiGeoSuggest> {
            @Override // android.os.Parcelable.Creator
            public final MultiGeoSuggest createFromParcel(Parcel parcel) {
                return new MultiGeoSuggest(parcel.readString(), JobMultiGeoLink.FlowType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(MultiGeoSuggest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MultiGeoSuggest[] newArray(int i12) {
                return new MultiGeoSuggest[i12];
            }
        }

        public /* synthetic */ MultiGeoSuggest(String str, JobMultiGeoLink.FlowType flowType, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, flowType, (i12 & 4) != 0 ? null : deepLink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiGeoSuggest)) {
                return false;
            }
            MultiGeoSuggest multiGeoSuggest = (MultiGeoSuggest) obj;
            return kotlin.jvm.internal.L.f(this.f133800b, multiGeoSuggest.f133800b) && this.f133801c == multiGeoSuggest.f133801c && kotlin.jvm.internal.L.f(this.f133802d, multiGeoSuggest.f133802d);
        }

        public final int hashCode() {
            int iHashCode = (this.f133801c.hashCode() + (this.f133800b.hashCode() * 31)) * 31;
            DeepLink deepLink = this.f133802d;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiGeoSuggest(jwt=");
            sb2.append(this.f133800b);
            sb2.append(", flowType=");
            sb2.append(this.f133801c);
            sb2.append(", successUrl=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f133802d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133800b);
            parcel.writeString(this.f133801c.name());
            parcel.writeParcelable(this.f133802d, i12);
        }

        public MultiGeoSuggest(@Y61.k String str, @Y61.k JobMultiGeoLink.FlowType flowType, @Y61.l DeepLink deepLink) {
            super(null);
            this.f133800b = str;
            this.f133801c = flowType;
            this.f133802d = deepLink;
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result;", "Landroid/os/Parcelable;", "LJu/c$b;", "Canceled", "Failure", "Success", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Canceled;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends Parcelable, InterfaceC14249c.b {

        /* compiled from: UserAddressLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Canceled;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Canceled implements Result {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Canceled f133803b = new Canceled();

            @Y61.k
            public static final Parcelable.Creator<Canceled> CREATOR = new a();

            /* compiled from: UserAddressLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Canceled> {
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Canceled.f133803b;
                }

                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i12) {
                    return new Canceled[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: UserAddressLink.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result;", "Added", "DefaultChanged", "Delete", "Modified", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$Added;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$DefaultChanged;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$Delete;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$Modified;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Failure extends Result {

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$Added;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Added implements Failure {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Added f133804b = new Added();

                @Y61.k
                public static final Parcelable.Creator<Added> CREATOR = new a();

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Added> {
                    @Override // android.os.Parcelable.Creator
                    public final Added createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Added.f133804b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Added[] newArray(int i12) {
                        return new Added[i12];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$DefaultChanged;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class DefaultChanged implements Failure {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final DefaultChanged f133805b = new DefaultChanged();

                @Y61.k
                public static final Parcelable.Creator<DefaultChanged> CREATOR = new a();

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<DefaultChanged> {
                    @Override // android.os.Parcelable.Creator
                    public final DefaultChanged createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return DefaultChanged.f133805b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final DefaultChanged[] newArray(int i12) {
                        return new DefaultChanged[i12];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$Delete;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Delete implements Failure {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Delete f133806b = new Delete();

                @Y61.k
                public static final Parcelable.Creator<Delete> CREATOR = new a();

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Delete> {
                    @Override // android.os.Parcelable.Creator
                    public final Delete createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Delete.f133806b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Delete[] newArray(int i12) {
                        return new Delete[i12];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure$Modified;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Failure;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Modified implements Failure {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Modified f133807b = new Modified();

                @Y61.k
                public static final Parcelable.Creator<Modified> CREATOR = new a();

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Modified> {
                    @Override // android.os.Parcelable.Creator
                    public final Modified createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Modified.f133807b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Modified[] newArray(int i12) {
                        return new Modified[i12];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }
        }

        /* compiled from: UserAddressLink.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result;", "Added", "DefaultChanged", "Delete", "Modified", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$Added;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$DefaultChanged;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$Delete;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$Modified;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Success extends Result {

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$Added;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Added implements Success {

                @Y61.k
                public static final Parcelable.Creator<Added> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                public final boolean f133808b;

                /* renamed from: c, reason: collision with root package name */
                public final int f133809c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.l
                public final Integer f133810d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.k
                public final String f133811e;

                /* renamed from: f, reason: collision with root package name */
                @Y61.l
                public final String f133812f;

                /* renamed from: g, reason: collision with root package name */
                @Y61.l
                public final String f133813g;

                /* renamed from: h, reason: collision with root package name */
                @Y61.l
                public final Double f133814h;

                /* renamed from: i, reason: collision with root package name */
                @Y61.l
                public final Double f133815i;

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Added> {
                    @Override // android.os.Parcelable.Creator
                    public final Added createFromParcel(Parcel parcel) {
                        return new Added(parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Added[] newArray(int i12) {
                        return new Added[i12];
                    }
                }

                public Added(boolean z12, int i12, @Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Double d12, @Y61.l Double d13) {
                    this.f133808b = z12;
                    this.f133809c = i12;
                    this.f133810d = num;
                    this.f133811e = str;
                    this.f133812f = str2;
                    this.f133813g = str3;
                    this.f133814h = d12;
                    this.f133815i = d13;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Added)) {
                        return false;
                    }
                    Added added = (Added) obj;
                    return this.f133808b == added.f133808b && this.f133809c == added.f133809c && kotlin.jvm.internal.L.f(this.f133810d, added.f133810d) && kotlin.jvm.internal.L.f(this.f133811e, added.f133811e) && kotlin.jvm.internal.L.f(this.f133812f, added.f133812f) && kotlin.jvm.internal.L.f(this.f133813g, added.f133813g) && kotlin.jvm.internal.L.f(this.f133814h, added.f133814h) && kotlin.jvm.internal.L.f(this.f133815i, added.f133815i);
                }

                public final int hashCode() {
                    int iE2 = androidx.appcompat.app.r.e(this.f133809c, Boolean.hashCode(this.f133808b) * 31, 31);
                    Integer num = this.f133810d;
                    int iD2 = androidx.compose.foundation.H.d((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f133811e);
                    String str = this.f133812f;
                    int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f133813g;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Double d12 = this.f133814h;
                    int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
                    Double d13 = this.f133815i;
                    return iHashCode3 + (d13 != null ? d13.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Added(needToShow=");
                    sb2.append(this.f133808b);
                    sb2.append(", addressId=");
                    sb2.append(this.f133809c);
                    sb2.append(", locationId=");
                    sb2.append(this.f133810d);
                    sb2.append(", address=");
                    sb2.append(this.f133811e);
                    sb2.append(", addressType=");
                    sb2.append(this.f133812f);
                    sb2.append(", jwt=");
                    sb2.append(this.f133813g);
                    sb2.append(", longitude=");
                    sb2.append(this.f133814h);
                    sb2.append(", latitude=");
                    return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f133815i, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(this.f133808b ? 1 : 0);
                    parcel.writeInt(this.f133809c);
                    Integer num = this.f133810d;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    parcel.writeString(this.f133811e);
                    parcel.writeString(this.f133812f);
                    parcel.writeString(this.f133813g);
                    Double d12 = this.f133814h;
                    if (d12 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
                    }
                    Double d13 = this.f133815i;
                    if (d13 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
                    }
                }
            }

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$DefaultChanged;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class DefaultChanged implements Success {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final DefaultChanged f133816b = new DefaultChanged();

                @Y61.k
                public static final Parcelable.Creator<DefaultChanged> CREATOR = new a();

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<DefaultChanged> {
                    @Override // android.os.Parcelable.Creator
                    public final DefaultChanged createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return DefaultChanged.f133816b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final DefaultChanged[] newArray(int i12) {
                        return new DefaultChanged[i12];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$Delete;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Delete implements Success {

                @Y61.k
                public static final Parcelable.Creator<Delete> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                public final boolean f133817b;

                /* renamed from: c, reason: collision with root package name */
                public final int f133818c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final String f133819d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.l
                public final String f133820e;

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Delete> {
                    @Override // android.os.Parcelable.Creator
                    public final Delete createFromParcel(Parcel parcel) {
                        return new Delete(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Delete[] newArray(int i12) {
                        return new Delete[i12];
                    }
                }

                public Delete(int i12, @Y61.k String str, @Y61.l String str2, boolean z12) {
                    this.f133817b = z12;
                    this.f133818c = i12;
                    this.f133819d = str;
                    this.f133820e = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Delete)) {
                        return false;
                    }
                    Delete delete = (Delete) obj;
                    return this.f133817b == delete.f133817b && this.f133818c == delete.f133818c && kotlin.jvm.internal.L.f(this.f133819d, delete.f133819d) && kotlin.jvm.internal.L.f(this.f133820e, delete.f133820e);
                }

                public final int hashCode() {
                    int iD2 = androidx.compose.foundation.H.d(androidx.appcompat.app.r.e(this.f133818c, Boolean.hashCode(this.f133817b) * 31, 31), 31, this.f133819d);
                    String str = this.f133820e;
                    return iD2 + (str == null ? 0 : str.hashCode());
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Delete(needToShow=");
                    sb2.append(this.f133817b);
                    sb2.append(", addressId=");
                    sb2.append(this.f133818c);
                    sb2.append(", address=");
                    sb2.append(this.f133819d);
                    sb2.append(", addressType=");
                    return C22026a.c(sb2, this.f133820e, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(this.f133817b ? 1 : 0);
                    parcel.writeInt(this.f133818c);
                    parcel.writeString(this.f133819d);
                    parcel.writeString(this.f133820e);
                }
            }

            /* compiled from: UserAddressLink.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success$Modified;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Result$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Modified implements Success {

                @Y61.k
                public static final Parcelable.Creator<Modified> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                public final boolean f133821b;

                /* renamed from: c, reason: collision with root package name */
                public final int f133822c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.l
                public final Integer f133823d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.k
                public final String f133824e;

                /* renamed from: f, reason: collision with root package name */
                @Y61.l
                public final String f133825f;

                /* renamed from: g, reason: collision with root package name */
                @Y61.l
                public final String f133826g;

                /* renamed from: h, reason: collision with root package name */
                @Y61.l
                public final Double f133827h;

                /* renamed from: i, reason: collision with root package name */
                @Y61.l
                public final Double f133828i;

                /* compiled from: UserAddressLink.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Modified> {
                    @Override // android.os.Parcelable.Creator
                    public final Modified createFromParcel(Parcel parcel) {
                        return new Modified(parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Modified[] newArray(int i12) {
                        return new Modified[i12];
                    }
                }

                public Modified(boolean z12, int i12, @Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Double d12, @Y61.l Double d13) {
                    this.f133821b = z12;
                    this.f133822c = i12;
                    this.f133823d = num;
                    this.f133824e = str;
                    this.f133825f = str2;
                    this.f133826g = str3;
                    this.f133827h = d12;
                    this.f133828i = d13;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Modified)) {
                        return false;
                    }
                    Modified modified = (Modified) obj;
                    return this.f133821b == modified.f133821b && this.f133822c == modified.f133822c && kotlin.jvm.internal.L.f(this.f133823d, modified.f133823d) && kotlin.jvm.internal.L.f(this.f133824e, modified.f133824e) && kotlin.jvm.internal.L.f(this.f133825f, modified.f133825f) && kotlin.jvm.internal.L.f(this.f133826g, modified.f133826g) && kotlin.jvm.internal.L.f(this.f133827h, modified.f133827h) && kotlin.jvm.internal.L.f(this.f133828i, modified.f133828i);
                }

                public final int hashCode() {
                    int iE2 = androidx.appcompat.app.r.e(this.f133822c, Boolean.hashCode(this.f133821b) * 31, 31);
                    Integer num = this.f133823d;
                    int iD2 = androidx.compose.foundation.H.d((iE2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f133824e);
                    String str = this.f133825f;
                    int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f133826g;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    Double d12 = this.f133827h;
                    int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
                    Double d13 = this.f133828i;
                    return iHashCode3 + (d13 != null ? d13.hashCode() : 0);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Modified(needToShow=");
                    sb2.append(this.f133821b);
                    sb2.append(", addressId=");
                    sb2.append(this.f133822c);
                    sb2.append(", locationId=");
                    sb2.append(this.f133823d);
                    sb2.append(", address=");
                    sb2.append(this.f133824e);
                    sb2.append(", addressType=");
                    sb2.append(this.f133825f);
                    sb2.append(", jwt=");
                    sb2.append(this.f133826g);
                    sb2.append(", longitude=");
                    sb2.append(this.f133827h);
                    sb2.append(", latitude=");
                    return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f133828i, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(this.f133821b ? 1 : 0);
                    parcel.writeInt(this.f133822c);
                    Integer num = this.f133823d;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    parcel.writeString(this.f133824e);
                    parcel.writeString(this.f133825f);
                    parcel.writeString(this.f133826g);
                    Double d12 = this.f133827h;
                    if (d12 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
                    }
                    Double d13 = this.f133828i;
                    if (d13 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
                    }
                }
            }

            /* compiled from: UserAddressLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a {
            }
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Suggest;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "Lcom/avito/android/deep_linking/links/UserAddressLink$c;", "Lcom/avito/android/deep_linking/links/UserAddressLink$a;", "Lcom/avito/android/deep_linking/links/UserAddressLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final /* data */ class Suggest extends UserAddressLink implements c, a, b {

        @Y61.k
        public static final Parcelable.Creator<Suggest> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133829b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final BottomSheetState f133830c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f133831d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f133832e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133833f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f133834g;

        /* compiled from: UserAddressLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Suggest> {
            @Override // android.os.Parcelable.Creator
            public final Suggest createFromParcel(Parcel parcel) {
                return new Suggest(parcel.readString(), BottomSheetState.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(Suggest.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Suggest[] newArray(int i12) {
                return new Suggest[i12];
            }
        }

        public Suggest() {
            this(null, null, null, null, null, false, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suggest)) {
                return false;
            }
            Suggest suggest = (Suggest) obj;
            return kotlin.jvm.internal.L.f(this.f133829b, suggest.f133829b) && this.f133830c == suggest.f133830c && kotlin.jvm.internal.L.f(this.f133831d, suggest.f133831d) && kotlin.jvm.internal.L.f(this.f133832e, suggest.f133832e) && kotlin.jvm.internal.L.f(this.f133833f, suggest.f133833f) && this.f133834g == suggest.f133834g;
        }

        public final int hashCode() {
            String str = this.f133829b;
            int iHashCode = (this.f133830c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            String str2 = this.f133831d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f133832e;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            DeepLink deepLink = this.f133833f;
            return Boolean.hashCode(this.f133834g) + ((iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Suggest(geoSessionId=");
            sb2.append(this.f133829b);
            sb2.append(", bottomSheetState=");
            sb2.append(this.f133830c);
            sb2.append(", address=");
            sb2.append(this.f133831d);
            sb2.append(", verticalId=");
            sb2.append(this.f133832e);
            sb2.append(", successUrl=");
            sb2.append(this.f133833f);
            sb2.append(", enableDeleteAddress=");
            return androidx.appcompat.app.r.x(sb2, this.f133834g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133829b);
            parcel.writeString(this.f133830c.name());
            parcel.writeString(this.f133831d);
            Integer num = this.f133832e;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeParcelable(this.f133833f, i12);
            parcel.writeInt(this.f133834g ? 1 : 0);
        }

        public /* synthetic */ Suggest(String str, BottomSheetState bottomSheetState, String str2, Integer num, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? BottomSheetState.COLLAPSED : bottomSheetState, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : num, (i12 & 16) == 0 ? deepLink : null, (i12 & 32) != 0 ? true : z12);
        }

        public Suggest(@Y61.l String str, @Y61.k BottomSheetState bottomSheetState, @Y61.l String str2, @Y61.l Integer num, @Y61.l DeepLink deepLink, boolean z12) {
            super(null);
            this.f133829b = str;
            this.f133830c = bottomSheetState;
            this.f133831d = str2;
            this.f133832e = num;
            this.f133833f = deepLink;
            this.f133834g = z12;
        }
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$a;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$b;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$c;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
    }

    public /* synthetic */ UserAddressLink(C42822w c42822w) {
        this();
    }

    /* compiled from: UserAddressLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/UserAddressLink$Map;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "Lcom/avito/android/deep_linking/links/UserAddressLink$c;", "Lcom/avito/android/deep_linking/links/UserAddressLink$a;", "Lcom/avito/android/deep_linking/links/UserAddressLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    @InterfaceC29686l
    @InterfaceC47204b
    public static final class Map extends UserAddressLink implements c, a, b {

        @Y61.k
        public static final Parcelable.Creator<Map> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133786b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final BottomSheetState f133787c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f133788d;

        /* renamed from: e, reason: collision with root package name */
        public final double f133789e;

        /* renamed from: f, reason: collision with root package name */
        public final double f133790f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133791g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f133792h;

        /* compiled from: UserAddressLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Map> {
            @Override // android.os.Parcelable.Creator
            public final Map createFromParcel(Parcel parcel) {
                return new Map(parcel.readString(), BottomSheetState.valueOf(parcel.readString()), parcel.readString(), parcel.readDouble(), parcel.readDouble(), (DeepLink) parcel.readParcelable(Map.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Map[] newArray(int i12) {
                return new Map[i12];
            }
        }

        public /* synthetic */ Map(String str, BottomSheetState bottomSheetState, String str2, double d12, double d13, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? BottomSheetState.COLLAPSED : bottomSheetState, str2, d12, d13, (i12 & 32) != 0 ? null : deepLink, (i12 & 64) != 0 ? true : z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133786b);
            parcel.writeString(this.f133787c.name());
            parcel.writeString(this.f133788d);
            parcel.writeDouble(this.f133789e);
            parcel.writeDouble(this.f133790f);
            parcel.writeParcelable(this.f133791g, i12);
            parcel.writeInt(this.f133792h ? 1 : 0);
        }

        public Map(@Y61.l String str, @Y61.k BottomSheetState bottomSheetState, @Y61.k String str2, double d12, double d13, @Y61.l DeepLink deepLink, boolean z12) {
            super(null);
            this.f133786b = str;
            this.f133787c = bottomSheetState;
            this.f133788d = str2;
            this.f133789e = d12;
            this.f133790f = d13;
            this.f133791g = deepLink;
            this.f133792h = z12;
        }
    }

    public UserAddressLink() {
    }
}

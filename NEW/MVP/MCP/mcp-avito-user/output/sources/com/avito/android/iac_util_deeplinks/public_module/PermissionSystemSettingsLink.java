package com.avito.android.iac_util_deeplinks.public_module;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: PermissionSystemSettingsLink.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemSettingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "ResultValue", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class PermissionSystemSettingsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PermissionSystemSettingsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169273b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, List<ResultValue>> f169274c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, DeepLink> f169275d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, List<ResultValue>> f169276e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Map<String, ParametrizedEvent> f169277f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ParametrizedEvent f169278g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PermissionSystemSettingsLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemSettingsLink$ResultValue;", "", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultValue {

        /* renamed from: b, reason: collision with root package name */
        public static final ResultValue f169279b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResultValue f169280c;

        /* renamed from: d, reason: collision with root package name */
        public static final ResultValue f169281d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ResultValue[] f169282e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f169283f;

        static {
            ResultValue resultValue = new ResultValue("ALREADY_GRANTED", 0);
            f169279b = resultValue;
            ResultValue resultValue2 = new ResultValue("RETURNED_FROM_SETTINGS_AND_GRANTED", 1);
            f169280c = resultValue2;
            ResultValue resultValue3 = new ResultValue("RETURNED_FROM_SETTINGS_AND_NOT_GRANTED", 2);
            f169281d = resultValue3;
            ResultValue[] resultValueArr = {resultValue, resultValue2, resultValue3};
            f169282e = resultValueArr;
            f169283f = c.a(resultValueArr);
        }

        public ResultValue() {
            throw null;
        }

        public static ResultValue valueOf(String str) {
            return (ResultValue) Enum.valueOf(ResultValue.class, str);
        }

        public static ResultValue[] values() {
            return (ResultValue[]) f169282e.clone();
        }
    }

    /* compiled from: PermissionSystemSettingsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionSystemSettingsLink> {
        @Override // android.os.Parcelable.Creator
        public final PermissionSystemSettingsLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                String string2 = parcel.readString();
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(ResultValue.valueOf(parcel.readString()));
                }
                linkedHashMap.put(string2, arrayList);
            }
            int i16 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
            int iC2 = 0;
            while (iC2 != i16) {
                iC2 = f.c(PermissionSystemSettingsLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
            }
            int i17 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                String string3 = parcel.readString();
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                for (int i22 = 0; i22 != i19; i22++) {
                    arrayList2.add(ResultValue.valueOf(parcel.readString()));
                }
                linkedHashMap3.put(string3, arrayList2);
            }
            int i23 = parcel.readInt();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(i23);
            int iC3 = 0;
            while (iC3 != i23) {
                iC3 = f.c(PermissionSystemSettingsLink.class, parcel, linkedHashMap4, parcel.readString(), iC3, 1);
            }
            return new PermissionSystemSettingsLink(string, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, (ParametrizedEvent) parcel.readParcelable(PermissionSystemSettingsLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionSystemSettingsLink[] newArray(int i12) {
            return new PermissionSystemSettingsLink[i12];
        }
    }

    /* compiled from: PermissionSystemSettingsLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemSettingsLink$b;", "LJu/c$a;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ResultValue f169284b;

        public b(@k ResultValue resultValue) {
            this.f169284b = resultValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f169284b == ((b) obj).f169284b;
        }

        public final int hashCode() {
            return this.f169284b.hashCode();
        }

        @k
        public final String toString() {
            return "LinkResult(result=" + this.f169284b + ')';
        }
    }

    public PermissionSystemSettingsLink() {
        throw null;
    }

    public /* synthetic */ PermissionSystemSettingsLink(String str, Map map, Map map2, Map map3, Map map4, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
        this(str, (Map<String, ? extends List<? extends ResultValue>>) ((i12 & 2) != 0 ? P0.c() : map), (Map<String, ? extends DeepLink>) ((i12 & 4) != 0 ? P0.c() : map2), (Map<String, ? extends List<? extends ResultValue>>) ((i12 & 8) != 0 ? P0.c() : map3), (Map<String, ParametrizedEvent>) ((i12 & 16) != 0 ? P0.c() : map4), (i12 & 32) != 0 ? null : parametrizedEvent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionSystemSettingsLink)) {
            return false;
        }
        PermissionSystemSettingsLink permissionSystemSettingsLink = (PermissionSystemSettingsLink) obj;
        return L.f(this.f169273b, permissionSystemSettingsLink.f169273b) && L.f(this.f169274c, permissionSystemSettingsLink.f169274c) && L.f(this.f169275d, permissionSystemSettingsLink.f169275d) && L.f(this.f169276e, permissionSystemSettingsLink.f169276e) && L.f(this.f169277f, permissionSystemSettingsLink.f169277f) && L.f(this.f169278g, permissionSystemSettingsLink.f169278g);
    }

    public final int hashCode() {
        int iC2 = AK.c.c(AK.c.c(AK.c.c(AK.c.c(this.f169273b.hashCode() * 31, 31, this.f169274c), 31, this.f169275d), 31, this.f169276e), 31, this.f169277f);
        ParametrizedEvent parametrizedEvent = this.f169278g;
        return iC2 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionSystemSettingsLink(permission=");
        sb2.append(this.f169273b);
        sb2.append(", nextKeyToResult=");
        sb2.append(this.f169274c);
        sb2.append(", nextKeyToLink=");
        sb2.append(this.f169275d);
        sb2.append(", analyticKeyToResult=");
        sb2.append(this.f169276e);
        sb2.append(", analyticKeyToEvent=");
        sb2.append(this.f169277f);
        sb2.append(", openSettingsEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f169278g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169273b);
        Iterator itI = C0.i(parcel, this.f169274c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            Iterator itJ = C0.j((List) entry.getValue(), parcel);
            while (itJ.hasNext()) {
                parcel.writeString(((ResultValue) itJ.next()).name());
            }
        }
        Iterator itI2 = C0.i(parcel, this.f169275d);
        while (itI2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itI2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeParcelable((Parcelable) entry2.getValue(), i12);
        }
        Iterator itI3 = C0.i(parcel, this.f169276e);
        while (itI3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itI3.next();
            parcel.writeString((String) entry3.getKey());
            Iterator itJ2 = C0.j((List) entry3.getValue(), parcel);
            while (itJ2.hasNext()) {
                parcel.writeString(((ResultValue) itJ2.next()).name());
            }
        }
        Iterator itI4 = C0.i(parcel, this.f169277f);
        while (itI4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) itI4.next();
            parcel.writeString((String) entry4.getKey());
            parcel.writeParcelable((Parcelable) entry4.getValue(), i12);
        }
        parcel.writeParcelable(this.f169278g, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionSystemSettingsLink(@k String str, @k Map<String, ? extends List<? extends ResultValue>> map, @k Map<String, ? extends DeepLink> map2, @k Map<String, ? extends List<? extends ResultValue>> map3, @k Map<String, ParametrizedEvent> map4, @l ParametrizedEvent parametrizedEvent) {
        this.f169273b = str;
        this.f169274c = map;
        this.f169275d = map2;
        this.f169276e = map3;
        this.f169277f = map4;
        this.f169278g = parametrizedEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionSystemSettingsLink(String str, List list, List list2, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
        List list3 = (i12 & 2) != 0 ? C42784z0.f406748b : list;
        List list4 = (i12 & 4) != 0 ? C42784z0.f406748b : list2;
        ParametrizedEvent parametrizedEvent2 = (i12 & 8) != 0 ? null : parametrizedEvent;
        List list5 = list3;
        ArrayList arrayList = new ArrayList(C42745f0.q(list5, 10));
        int i13 = 0;
        int i14 = 0;
        for (Object obj : list5) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new Q(r.p("nextKey[", i14, ']'), (List) ((Q) obj).f406619b));
            i14 = i15;
        }
        Map mapP = P0.p(arrayList);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list5, 10));
        int i16 = 0;
        for (Object obj2 : list5) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList2.add(new Q(r.p("nextKey[", i16, ']'), (DeepLink) ((Q) obj2).f406620c));
            i16 = i17;
        }
        Map mapP2 = P0.p(arrayList2);
        List list6 = list4;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list6, 10));
        int i18 = 0;
        for (Object obj3 : list6) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList3.add(new Q(r.p("analyticsKey[", i18, ']'), (List) ((Q) obj3).f406619b));
            i18 = i19;
        }
        Map mapP3 = P0.p(arrayList3);
        ArrayList arrayList4 = new ArrayList(C42745f0.q(list6, 10));
        for (Object obj4 : list6) {
            int i22 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList4.add(new Q(r.p("nextKey[", i13, ']'), (ParametrizedEvent) ((Q) obj4).f406620c));
            i13 = i22;
        }
        this(str, (Map<String, ? extends List<? extends ResultValue>>) mapP, (Map<String, ? extends DeepLink>) mapP2, (Map<String, ? extends List<? extends ResultValue>>) mapP3, (Map<String, ParametrizedEvent>) P0.p(arrayList4), parametrizedEvent2);
    }
}

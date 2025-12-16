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

/* compiled from: PermissionSystemRequestLink.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemRequestLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "ResultValue", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class PermissionSystemRequestLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PermissionSystemRequestLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, List<ResultValue>> f169261c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, DeepLink> f169262d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, List<ResultValue>> f169263e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Map<String, ParametrizedEvent> f169264f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PermissionSystemRequestLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemRequestLink$ResultValue;", "", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultValue {

        /* renamed from: b, reason: collision with root package name */
        public static final ResultValue f169265b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResultValue f169266c;

        /* renamed from: d, reason: collision with root package name */
        public static final ResultValue f169267d;

        /* renamed from: e, reason: collision with root package name */
        public static final ResultValue f169268e;

        /* renamed from: f, reason: collision with root package name */
        public static final ResultValue f169269f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ ResultValue[] f169270g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f169271h;

        static {
            ResultValue resultValue = new ResultValue("ALREADY_GRANTED", 0);
            f169265b = resultValue;
            ResultValue resultValue2 = new ResultValue("ALREADY_FOREVER_DENIED", 1);
            f169266c = resultValue2;
            ResultValue resultValue3 = new ResultValue("REQUESTED_AND_GRANTED", 2);
            f169267d = resultValue3;
            ResultValue resultValue4 = new ResultValue("REQUESTED_AND_DENIED", 3);
            f169268e = resultValue4;
            ResultValue resultValue5 = new ResultValue("REQUESTED_AND_FOREVER_DENIED", 4);
            f169269f = resultValue5;
            ResultValue[] resultValueArr = {resultValue, resultValue2, resultValue3, resultValue4, resultValue5};
            f169270g = resultValueArr;
            f169271h = c.a(resultValueArr);
        }

        public ResultValue() {
            throw null;
        }

        public static ResultValue valueOf(String str) {
            return (ResultValue) Enum.valueOf(ResultValue.class, str);
        }

        public static ResultValue[] values() {
            return (ResultValue[]) f169270g.clone();
        }
    }

    /* compiled from: PermissionSystemRequestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionSystemRequestLink> {
        @Override // android.os.Parcelable.Creator
        public final PermissionSystemRequestLink createFromParcel(Parcel parcel) {
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
                iC2 = f.c(PermissionSystemRequestLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
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
                iC3 = f.c(PermissionSystemRequestLink.class, parcel, linkedHashMap4, parcel.readString(), iC3, 1);
            }
            return new PermissionSystemRequestLink(string, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionSystemRequestLink[] newArray(int i12) {
            return new PermissionSystemRequestLink[i12];
        }
    }

    /* compiled from: PermissionSystemRequestLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionSystemRequestLink$b;", "LJu/c$a;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ResultValue f169272b;

        public b(@k ResultValue resultValue) {
            this.f169272b = resultValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f169272b == ((b) obj).f169272b;
        }

        public final int hashCode() {
            return this.f169272b.hashCode();
        }

        @k
        public final String toString() {
            return "LinkResult(result=" + this.f169272b + ')';
        }
    }

    public PermissionSystemRequestLink() {
        throw null;
    }

    public /* synthetic */ PermissionSystemRequestLink(String str, Map map, Map map2, Map map3, Map map4, int i12, C42822w c42822w) {
        this(str, (Map<String, ? extends List<? extends ResultValue>>) ((i12 & 2) != 0 ? P0.c() : map), (Map<String, ? extends DeepLink>) ((i12 & 4) != 0 ? P0.c() : map2), (Map<String, ? extends List<? extends ResultValue>>) ((i12 & 8) != 0 ? P0.c() : map3), (Map<String, ParametrizedEvent>) ((i12 & 16) != 0 ? P0.c() : map4));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionSystemRequestLink)) {
            return false;
        }
        PermissionSystemRequestLink permissionSystemRequestLink = (PermissionSystemRequestLink) obj;
        return L.f(this.f169260b, permissionSystemRequestLink.f169260b) && L.f(this.f169261c, permissionSystemRequestLink.f169261c) && L.f(this.f169262d, permissionSystemRequestLink.f169262d) && L.f(this.f169263e, permissionSystemRequestLink.f169263e) && L.f(this.f169264f, permissionSystemRequestLink.f169264f);
    }

    public final int hashCode() {
        return this.f169264f.hashCode() + AK.c.c(AK.c.c(AK.c.c(this.f169260b.hashCode() * 31, 31, this.f169261c), 31, this.f169262d), 31, this.f169263e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionSystemRequestLink(permission=");
        sb2.append(this.f169260b);
        sb2.append(", nextKeyToResult=");
        sb2.append(this.f169261c);
        sb2.append(", nextKeyToLink=");
        sb2.append(this.f169262d);
        sb2.append(", analyticKeyToResult=");
        sb2.append(this.f169263e);
        sb2.append(", analyticKeyToEvent=");
        return r.w(sb2, this.f169264f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169260b);
        Iterator itI = C0.i(parcel, this.f169261c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            Iterator itJ = C0.j((List) entry.getValue(), parcel);
            while (itJ.hasNext()) {
                parcel.writeString(((ResultValue) itJ.next()).name());
            }
        }
        Iterator itI2 = C0.i(parcel, this.f169262d);
        while (itI2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itI2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeParcelable((Parcelable) entry2.getValue(), i12);
        }
        Iterator itI3 = C0.i(parcel, this.f169263e);
        while (itI3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itI3.next();
            parcel.writeString((String) entry3.getKey());
            Iterator itJ2 = C0.j((List) entry3.getValue(), parcel);
            while (itJ2.hasNext()) {
                parcel.writeString(((ResultValue) itJ2.next()).name());
            }
        }
        Iterator itI4 = C0.i(parcel, this.f169264f);
        while (itI4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) itI4.next();
            parcel.writeString((String) entry4.getKey());
            parcel.writeParcelable((Parcelable) entry4.getValue(), i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionSystemRequestLink(@k String str, @k Map<String, ? extends List<? extends ResultValue>> map, @k Map<String, ? extends DeepLink> map2, @k Map<String, ? extends List<? extends ResultValue>> map3, @k Map<String, ParametrizedEvent> map4) {
        this.f169260b = str;
        this.f169261c = map;
        this.f169262d = map2;
        this.f169263e = map3;
        this.f169264f = map4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionSystemRequestLink(String str, List list, List list2, int i12, C42822w c42822w) {
        List list3 = (i12 & 2) != 0 ? C42784z0.f406748b : list;
        List list4 = (i12 & 4) != 0 ? C42784z0.f406748b : list2;
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
        this(str, (Map<String, ? extends List<? extends ResultValue>>) mapP, (Map<String, ? extends DeepLink>) mapP2, (Map<String, ? extends List<? extends ResultValue>>) mapP3, (Map<String, ParametrizedEvent>) P0.p(arrayList4));
    }
}

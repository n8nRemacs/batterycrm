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
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: PermissionCheckLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionCheckLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "ResultValue", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class PermissionCheckLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PermissionCheckLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169249b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, List<ResultValue>> f169250c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, DeepLink> f169251d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, List<ResultValue>> f169252e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Map<String, ParametrizedEvent> f169253f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PermissionCheckLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionCheckLink$ResultValue;", "", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultValue {

        /* renamed from: b, reason: collision with root package name */
        public static final ResultValue f169254b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResultValue f169255c;

        /* renamed from: d, reason: collision with root package name */
        public static final ResultValue f169256d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ResultValue[] f169257e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f169258f;

        static {
            ResultValue resultValue = new ResultValue("GRANTED", 0);
            f169254b = resultValue;
            ResultValue resultValue2 = new ResultValue("DENIED", 1);
            f169255c = resultValue2;
            ResultValue resultValue3 = new ResultValue("FOREVER_DENIED", 2);
            f169256d = resultValue3;
            ResultValue[] resultValueArr = {resultValue, resultValue2, resultValue3};
            f169257e = resultValueArr;
            f169258f = c.a(resultValueArr);
        }

        public ResultValue() {
            throw null;
        }

        public static ResultValue valueOf(String str) {
            return (ResultValue) Enum.valueOf(ResultValue.class, str);
        }

        public static ResultValue[] values() {
            return (ResultValue[]) f169257e.clone();
        }
    }

    /* compiled from: PermissionCheckLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionCheckLink> {
        @Override // android.os.Parcelable.Creator
        public final PermissionCheckLink createFromParcel(Parcel parcel) {
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
                iC2 = f.c(PermissionCheckLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
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
                iC3 = f.c(PermissionCheckLink.class, parcel, linkedHashMap4, parcel.readString(), iC3, 1);
            }
            return new PermissionCheckLink(string, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionCheckLink[] newArray(int i12) {
            return new PermissionCheckLink[i12];
        }
    }

    /* compiled from: PermissionCheckLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/PermissionCheckLink$b;", "LJu/c$a;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ResultValue f169259b;

        public b(@k ResultValue resultValue) {
            this.f169259b = resultValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f169259b == ((b) obj).f169259b;
        }

        public final int hashCode() {
            return this.f169259b.hashCode();
        }

        @k
        public final String toString() {
            return "LinkResult(result=" + this.f169259b + ')';
        }
    }

    public /* synthetic */ PermissionCheckLink(String str, Map map, Map map2, Map map3, Map map4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? P0.c() : map, (i12 & 4) != 0 ? P0.c() : map2, (i12 & 8) != 0 ? P0.c() : map3, (i12 & 16) != 0 ? P0.c() : map4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionCheckLink)) {
            return false;
        }
        PermissionCheckLink permissionCheckLink = (PermissionCheckLink) obj;
        return L.f(this.f169249b, permissionCheckLink.f169249b) && L.f(this.f169250c, permissionCheckLink.f169250c) && L.f(this.f169251d, permissionCheckLink.f169251d) && L.f(this.f169252e, permissionCheckLink.f169252e) && L.f(this.f169253f, permissionCheckLink.f169253f);
    }

    public final int hashCode() {
        return this.f169253f.hashCode() + AK.c.c(AK.c.c(AK.c.c(this.f169249b.hashCode() * 31, 31, this.f169250c), 31, this.f169251d), 31, this.f169252e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionCheckLink(permission=");
        sb2.append(this.f169249b);
        sb2.append(", nextKeyToResult=");
        sb2.append(this.f169250c);
        sb2.append(", nextKeyToLink=");
        sb2.append(this.f169251d);
        sb2.append(", analyticKeyToResult=");
        sb2.append(this.f169252e);
        sb2.append(", analyticKeyToEvent=");
        return r.w(sb2, this.f169253f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169249b);
        Iterator itI = C0.i(parcel, this.f169250c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            Iterator itJ = C0.j((List) entry.getValue(), parcel);
            while (itJ.hasNext()) {
                parcel.writeString(((ResultValue) itJ.next()).name());
            }
        }
        Iterator itI2 = C0.i(parcel, this.f169251d);
        while (itI2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itI2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeParcelable((Parcelable) entry2.getValue(), i12);
        }
        Iterator itI3 = C0.i(parcel, this.f169252e);
        while (itI3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itI3.next();
            parcel.writeString((String) entry3.getKey());
            Iterator itJ2 = C0.j((List) entry3.getValue(), parcel);
            while (itJ2.hasNext()) {
                parcel.writeString(((ResultValue) itJ2.next()).name());
            }
        }
        Iterator itI4 = C0.i(parcel, this.f169253f);
        while (itI4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) itI4.next();
            parcel.writeString((String) entry4.getKey());
            parcel.writeParcelable((Parcelable) entry4.getValue(), i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionCheckLink(@k String str, @k Map<String, ? extends List<? extends ResultValue>> map, @k Map<String, ? extends DeepLink> map2, @k Map<String, ? extends List<? extends ResultValue>> map3, @k Map<String, ParametrizedEvent> map4) {
        this.f169249b = str;
        this.f169250c = map;
        this.f169251d = map2;
        this.f169252e = map3;
        this.f169253f = map4;
    }
}

package com.avito.android.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SummaryState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery/SummaryState;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SummaryState implements Parcelable {

    @k
    public static final Parcelable.Creator<SummaryState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f134757b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f134758c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f134759d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f134760e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Map<String, String> f134761f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f134762g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f134763h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f134764i;

    /* compiled from: SummaryState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SummaryState> {
        @Override // android.os.Parcelable.Creator
        public final SummaryState createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new SummaryState(string, string2, string3, string4, linkedHashMap, parcel.readInt() != 0, parcel.readString(), (DeepLink) parcel.readParcelable(SummaryState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SummaryState[] newArray(int i12) {
            return new SummaryState[i12];
        }
    }

    public SummaryState() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryState)) {
            return false;
        }
        SummaryState summaryState = (SummaryState) obj;
        return L.f(this.f134757b, summaryState.f134757b) && L.f(this.f134758c, summaryState.f134758c) && L.f(this.f134759d, summaryState.f134759d) && L.f(this.f134760e, summaryState.f134760e) && L.f(this.f134761f, summaryState.f134761f) && this.f134762g == summaryState.f134762g && L.f(this.f134763h, summaryState.f134763h) && L.f(this.f134764i, summaryState.f134764i);
    }

    public final int hashCode() {
        String str = this.f134757b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f134758c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f134759d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f134760e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.f134761f;
        int i12 = r.i((iHashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f134762g);
        String str5 = this.f134763h;
        int iHashCode5 = (i12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DeepLink deepLink = this.f134764i;
        return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SummaryState(markerId=");
        sb2.append(this.f134757b);
        sb2.append(", fiasGuid=");
        sb2.append(this.f134758c);
        sb2.append(", serviceId=");
        sb2.append(this.f134759d);
        sb2.append(", advertId=");
        sb2.append(this.f134760e);
        sb2.append(", contacts=");
        sb2.append(this.f134761f);
        sb2.append(", skipMap=");
        sb2.append(this.f134762g);
        sb2.append(", promocode=");
        sb2.append(this.f134763h);
        sb2.append(", summaryDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f134764i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f134757b);
        parcel.writeString(this.f134758c);
        parcel.writeString(this.f134759d);
        parcel.writeString(this.f134760e);
        Map<String, String> map = this.f134761f;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeInt(this.f134762g ? 1 : 0);
        parcel.writeString(this.f134763h);
        parcel.writeParcelable(this.f134764i, i12);
    }

    public SummaryState(@l String str, @l String str2, @l String str3, @l String str4, @l Map<String, String> map, boolean z12, @l String str5, @l DeepLink deepLink) {
        this.f134757b = str;
        this.f134758c = str2;
        this.f134759d = str3;
        this.f134760e = str4;
        this.f134761f = map;
        this.f134762g = z12;
        this.f134763h = str5;
        this.f134764i = deepLink;
    }

    public /* synthetic */ SummaryState(String str, String str2, String str3, String str4, Map map, boolean z12, String str5, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : map, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? null : str5, (i12 & 128) == 0 ? deepLink : null);
    }
}

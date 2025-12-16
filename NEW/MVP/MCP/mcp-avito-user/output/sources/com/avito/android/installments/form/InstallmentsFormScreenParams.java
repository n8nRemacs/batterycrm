package com.avito.android.installments.form;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.CancellationDialog;
import com.avito.android.deep_linking.links.Loader;
import com.avito.android.deep_linking.links.UxFeedbackActions;
import com.avito.android.util.OpenParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFormActivity.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/InstallmentsFormScreenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsFormScreenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<InstallmentsFormScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Uri f172598b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f172599c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f172600d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f172601e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, Map<String, Integer>> f172602f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f172603g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Loader f172604h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final UxFeedbackActions f172605i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final CancellationDialog f172606j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Map<String, Loader> f172607k;

    /* compiled from: InstallmentsFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsFormScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsFormScreenParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            Uri uri = (Uri) parcel.readParcelable(InstallmentsFormScreenParams.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(InstallmentsFormScreenParams.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    String string3 = parcel.readString();
                    int i15 = parcel.readInt();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        linkedHashMap5.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                    }
                    linkedHashMap4.put(string3, linkedHashMap5);
                }
                linkedHashMap2 = linkedHashMap4;
            }
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Loader loader = (Loader) parcel.readParcelable(InstallmentsFormScreenParams.class.getClassLoader());
            UxFeedbackActions uxFeedbackActions = (UxFeedbackActions) parcel.readParcelable(InstallmentsFormScreenParams.class.getClassLoader());
            CancellationDialog cancellationDialog = (CancellationDialog) parcel.readParcelable(InstallmentsFormScreenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i17);
                int iC3 = 0;
                while (iC3 != i17) {
                    iC3 = com.avito.android.bxcontent.mvi.entity.f.c(InstallmentsFormScreenParams.class, parcel, linkedHashMap6, parcel.readString(), iC3, 1);
                    linkedHashMap6 = linkedHashMap6;
                }
                linkedHashMap3 = linkedHashMap6;
            }
            return new InstallmentsFormScreenParams(uri, string, string2, linkedHashMap, linkedHashMap2, boolValueOf, loader, uxFeedbackActions, cancellationDialog, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsFormScreenParams[] newArray(int i12) {
            return new InstallmentsFormScreenParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstallmentsFormScreenParams(@Y61.l Uri uri, @Y61.l String str, @Y61.l String str2, @Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Map<String, Integer>> map2, @Y61.l Boolean bool, @Y61.l Loader loader, @Y61.l UxFeedbackActions uxFeedbackActions, @Y61.l CancellationDialog cancellationDialog, @Y61.l Map<String, Loader> map3) {
        this.f172598b = uri;
        this.f172599c = str;
        this.f172600d = str2;
        this.f172601e = map;
        this.f172602f = map2;
        this.f172603g = bool;
        this.f172604h = loader;
        this.f172605i = uxFeedbackActions;
        this.f172606j = cancellationDialog;
        this.f172607k = map3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsFormScreenParams)) {
            return false;
        }
        InstallmentsFormScreenParams installmentsFormScreenParams = (InstallmentsFormScreenParams) obj;
        return L.f(this.f172598b, installmentsFormScreenParams.f172598b) && L.f(this.f172599c, installmentsFormScreenParams.f172599c) && L.f(this.f172600d, installmentsFormScreenParams.f172600d) && L.f(this.f172601e, installmentsFormScreenParams.f172601e) && L.f(this.f172602f, installmentsFormScreenParams.f172602f) && L.f(this.f172603g, installmentsFormScreenParams.f172603g) && L.f(this.f172604h, installmentsFormScreenParams.f172604h) && L.f(this.f172605i, installmentsFormScreenParams.f172605i) && L.f(this.f172606j, installmentsFormScreenParams.f172606j) && L.f(this.f172607k, installmentsFormScreenParams.f172607k);
    }

    public final int hashCode() {
        Uri uri = this.f172598b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f172599c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172600d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.f172601e;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Map<String, Integer>> map2 = this.f172602f;
        int iHashCode5 = (iHashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.f172603g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Loader loader = this.f172604h;
        int iHashCode7 = (iHashCode6 + (loader == null ? 0 : loader.hashCode())) * 31;
        UxFeedbackActions uxFeedbackActions = this.f172605i;
        int iHashCode8 = (iHashCode7 + (uxFeedbackActions == null ? 0 : uxFeedbackActions.hashCode())) * 31;
        CancellationDialog cancellationDialog = this.f172606j;
        int iHashCode9 = (iHashCode8 + (cancellationDialog == null ? 0 : cancellationDialog.hashCode())) * 31;
        Map<String, Loader> map3 = this.f172607k;
        return iHashCode9 + (map3 != null ? map3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsFormScreenParams(formUrl=");
        sb2.append(this.f172598b);
        sb2.append(", requestUrl=");
        sb2.append(this.f172599c);
        sb2.append(", title=");
        sb2.append(this.f172600d);
        sb2.append(", analyticParams=");
        sb2.append(this.f172601e);
        sb2.append(", eventsMap=");
        sb2.append(this.f172602f);
        sb2.append(", showCloseDialog=");
        sb2.append(this.f172603g);
        sb2.append(", loader=");
        sb2.append(this.f172604h);
        sb2.append(", uxFeedbackActions=");
        sb2.append(this.f172605i);
        sb2.append(", cancellationDialog=");
        sb2.append(this.f172606j);
        sb2.append(", domainSpecificLoadersMap=");
        return androidx.appcompat.app.r.w(sb2, this.f172607k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f172598b, i12);
        parcel.writeString(this.f172599c);
        parcel.writeString(this.f172600d);
        Map<String, Object> map = this.f172601e;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        Map<String, Map<String, Integer>> map2 = this.f172602f;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                Iterator itI = C0.i(parcel, (Map) entry2.getValue());
                while (itI.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) itI.next();
                    parcel.writeString((String) entry3.getKey());
                    parcel.writeInt(((Number) entry3.getValue()).intValue());
                }
            }
        }
        Boolean bool = this.f172603g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f172604h, i12);
        parcel.writeParcelable(this.f172605i, i12);
        parcel.writeParcelable(this.f172606j, i12);
        Map<String, Loader> map3 = this.f172607k;
        if (map3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH3 = C0.h(parcel, 1, map3);
        while (itH3.hasNext()) {
            Map.Entry entry4 = (Map.Entry) itH3.next();
            parcel.writeString((String) entry4.getKey());
            parcel.writeParcelable((Parcelable) entry4.getValue(), i12);
        }
    }
}

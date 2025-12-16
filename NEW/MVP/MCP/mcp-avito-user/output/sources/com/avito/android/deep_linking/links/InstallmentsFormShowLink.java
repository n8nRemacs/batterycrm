package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.C4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: InstallmentsFormShowLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/InstallmentsFormShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class InstallmentsFormShowLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<InstallmentsFormShowLink> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Uri f133381b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133382c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133383d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f133384e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, Map<String, Integer>> f133385f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f133386g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Loader f133387h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f133388i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final UxFeedbackActions f133389j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final CancellationDialog f133390k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Map<String, Loader> f133391l;

    /* compiled from: InstallmentsFormShowLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/InstallmentsFormShowLink$a;", "Lcom/avito/android/util/C4;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements C4, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<BeduinAction> f133392b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.l List<? extends BeduinAction> list) {
            this.f133392b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f133392b, ((a) obj).f133392b);
        }

        @Override // com.avito.android.util.C4
        @Y61.l
        public final List<BeduinAction> getActions() {
            return this.f133392b;
        }

        public final int hashCode() {
            List<BeduinAction> list = this.f133392b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.p(new StringBuilder("Cancel(actions="), this.f133392b, ')');
        }
    }

    /* compiled from: InstallmentsFormShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InstallmentsFormShowLink> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsFormShowLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            Uri uri = (Uri) parcel.readParcelable(InstallmentsFormShowLink.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(InstallmentsFormShowLink.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
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
            Loader loaderCreateFromParcel = parcel.readInt() == 0 ? null : Loader.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            UxFeedbackActions uxFeedbackActionsCreateFromParcel = parcel.readInt() == 0 ? null : UxFeedbackActions.CREATOR.createFromParcel(parcel);
            CancellationDialog cancellationDialogCreateFromParcel = parcel.readInt() == 0 ? null : CancellationDialog.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    linkedHashMap6.put(parcel.readString(), Loader.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap3 = linkedHashMap6;
            }
            return new InstallmentsFormShowLink(uri, string, string2, linkedHashMap, linkedHashMap2, boolValueOf, loaderCreateFromParcel, string4, uxFeedbackActionsCreateFromParcel, cancellationDialogCreateFromParcel, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsFormShowLink[] newArray(int i12) {
            return new InstallmentsFormShowLink[i12];
        }
    }

    /* compiled from: InstallmentsFormShowLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/InstallmentsFormShowLink$c;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f133393b = new c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstallmentsFormShowLink(@Y61.l Uri uri, @Y61.l String str, @Y61.l String str2, @Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Map<String, Integer>> map2, @Y61.l Boolean bool, @Y61.l Loader loader, @Y61.l String str3, @Y61.l UxFeedbackActions uxFeedbackActions, @Y61.l CancellationDialog cancellationDialog, @Y61.l Map<String, Loader> map3) {
        this.f133381b = uri;
        this.f133382c = str;
        this.f133383d = str2;
        this.f133384e = map;
        this.f133385f = map2;
        this.f133386g = bool;
        this.f133387h = loader;
        this.f133388i = str3;
        this.f133389j = uxFeedbackActions;
        this.f133390k = cancellationDialog;
        this.f133391l = map3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsFormShowLink)) {
            return false;
        }
        InstallmentsFormShowLink installmentsFormShowLink = (InstallmentsFormShowLink) obj;
        return kotlin.jvm.internal.L.f(this.f133381b, installmentsFormShowLink.f133381b) && kotlin.jvm.internal.L.f(this.f133382c, installmentsFormShowLink.f133382c) && kotlin.jvm.internal.L.f(this.f133383d, installmentsFormShowLink.f133383d) && kotlin.jvm.internal.L.f(this.f133384e, installmentsFormShowLink.f133384e) && kotlin.jvm.internal.L.f(this.f133385f, installmentsFormShowLink.f133385f) && kotlin.jvm.internal.L.f(this.f133386g, installmentsFormShowLink.f133386g) && kotlin.jvm.internal.L.f(this.f133387h, installmentsFormShowLink.f133387h) && kotlin.jvm.internal.L.f(this.f133388i, installmentsFormShowLink.f133388i) && kotlin.jvm.internal.L.f(this.f133389j, installmentsFormShowLink.f133389j) && kotlin.jvm.internal.L.f(this.f133390k, installmentsFormShowLink.f133390k) && kotlin.jvm.internal.L.f(this.f133391l, installmentsFormShowLink.f133391l);
    }

    public final int hashCode() {
        Uri uri = this.f133381b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f133382c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133383d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.f133384e;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Map<String, Integer>> map2 = this.f133385f;
        int iHashCode5 = (iHashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.f133386g;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Loader loader = this.f133387h;
        int iHashCode7 = (iHashCode6 + (loader == null ? 0 : loader.hashCode())) * 31;
        String str3 = this.f133388i;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UxFeedbackActions uxFeedbackActions = this.f133389j;
        int iHashCode9 = (iHashCode8 + (uxFeedbackActions == null ? 0 : uxFeedbackActions.hashCode())) * 31;
        CancellationDialog cancellationDialog = this.f133390k;
        int iHashCode10 = (iHashCode9 + (cancellationDialog == null ? 0 : cancellationDialog.hashCode())) * 31;
        Map<String, Loader> map3 = this.f133391l;
        return iHashCode10 + (map3 != null ? map3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsFormShowLink(formUrl=");
        sb2.append(this.f133381b);
        sb2.append(", requestUrl=");
        sb2.append(this.f133382c);
        sb2.append(", title=");
        sb2.append(this.f133383d);
        sb2.append(", analyticParams=");
        sb2.append(this.f133384e);
        sb2.append(", eventsMap=");
        sb2.append(this.f133385f);
        sb2.append(", showCloseDialog=");
        sb2.append(this.f133386g);
        sb2.append(", loader=");
        sb2.append(this.f133387h);
        sb2.append(", onCloseActionsJson=");
        sb2.append(this.f133388i);
        sb2.append(", uxFeedbackActions=");
        sb2.append(this.f133389j);
        sb2.append(", cancellationDialog=");
        sb2.append(this.f133390k);
        sb2.append(", domainSpecificLoadersMap=");
        return androidx.appcompat.app.r.w(sb2, this.f133391l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133381b, i12);
        parcel.writeString(this.f133382c);
        parcel.writeString(this.f133383d);
        Map<String, Object> map = this.f133384e;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        Map<String, Map<String, Integer>> map2 = this.f133385f;
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
        Boolean bool = this.f133386g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Loader loader = this.f133387h;
        if (loader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loader.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133388i);
        UxFeedbackActions uxFeedbackActions = this.f133389j;
        if (uxFeedbackActions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uxFeedbackActions.writeToParcel(parcel, i12);
        }
        CancellationDialog cancellationDialog = this.f133390k;
        if (cancellationDialog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cancellationDialog.writeToParcel(parcel, i12);
        }
        Map<String, Loader> map3 = this.f133391l;
        if (map3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH3 = C0.h(parcel, 1, map3);
        while (itH3.hasNext()) {
            Map.Entry entry4 = (Map.Entry) itH3.next();
            parcel.writeString((String) entry4.getKey());
            ((Loader) entry4.getValue()).writeToParcel(parcel, i12);
        }
    }
}

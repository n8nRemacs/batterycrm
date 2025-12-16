package com.avito.android.publish.start_publish;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.publish.PublishInitialToast;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StartPublishBundle.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishBundle;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StartPublishBundle implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<StartPublishBundle> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Navigation f245279b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f245280c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final PublishInitialToast f245281d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f245282e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f245283f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f245284g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f245285h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f245286i;

    /* compiled from: StartPublishBundle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StartPublishBundle> {
        @Override // android.os.Parcelable.Creator
        public final StartPublishBundle createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            Navigation navigation2 = (Navigation) parcel.readParcelable(StartPublishBundle.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(StartPublishBundle.class.getClassLoader());
            PublishInitialToast publishInitialToast = (PublishInitialToast) parcel.readParcelable(StartPublishBundle.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(StartPublishBundle.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StartPublishBundle(deepLink, navigation2, publishInitialToast, boolValueOf, string, parcel.readString(), linkedHashMap, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final StartPublishBundle[] newArray(int i12) {
            return new StartPublishBundle[i12];
        }
    }

    public StartPublishBundle() {
        this(null, null, null, false, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPublishBundle)) {
            return false;
        }
        StartPublishBundle startPublishBundle = (StartPublishBundle) obj;
        return kotlin.jvm.internal.L.f(this.f245279b, startPublishBundle.f245279b) && kotlin.jvm.internal.L.f(this.f245280c, startPublishBundle.f245280c) && kotlin.jvm.internal.L.f(this.f245281d, startPublishBundle.f245281d) && this.f245282e == startPublishBundle.f245282e && kotlin.jvm.internal.L.f(this.f245283f, startPublishBundle.f245283f) && kotlin.jvm.internal.L.f(this.f245284g, startPublishBundle.f245284g) && kotlin.jvm.internal.L.f(this.f245285h, startPublishBundle.f245285h) && kotlin.jvm.internal.L.f(this.f245286i, startPublishBundle.f245286i);
    }

    public final int hashCode() {
        Navigation navigation2 = this.f245279b;
        int iHashCode = (navigation2 == null ? 0 : navigation2.hashCode()) * 31;
        DeepLink deepLink = this.f245280c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        PublishInitialToast publishInitialToast = this.f245281d;
        int i12 = androidx.appcompat.app.r.i((iHashCode2 + (publishInitialToast == null ? 0 : publishInitialToast.hashCode())) * 31, 31, this.f245282e);
        Map<String, Object> map = this.f245283f;
        int iHashCode3 = (i12 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f245284g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f245285h;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f245286i;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartPublishBundle(navigation=");
        sb2.append(this.f245279b);
        sb2.append(", startUpAction=");
        sb2.append(this.f245280c);
        sb2.append(", toast=");
        sb2.append(this.f245281d);
        sb2.append(", skipDraft=");
        sb2.append(this.f245282e);
        sb2.append(", params=");
        sb2.append(this.f245283f);
        sb2.append(", targetStepType=");
        sb2.append(this.f245284g);
        sb2.append(", needRootNavigation=");
        sb2.append(this.f245285h);
        sb2.append(", scenario=");
        return C22026a.c(sb2, this.f245286i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f245279b, i12);
        parcel.writeParcelable(this.f245280c, i12);
        parcel.writeParcelable(this.f245281d, i12);
        parcel.writeInt(this.f245282e ? 1 : 0);
        Map<String, Object> map = this.f245283f;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeString(this.f245284g);
        Boolean bool = this.f245285h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f245286i);
    }

    public StartPublishBundle(@Y61.l DeepLink deepLink, @Y61.l Navigation navigation2, @Y61.l PublishInitialToast publishInitialToast, @Y61.l Boolean bool, @Y61.l String str, @Y61.l String str2, @Y61.l Map map, boolean z12) {
        this.f245279b = navigation2;
        this.f245280c = deepLink;
        this.f245281d = publishInitialToast;
        this.f245282e = z12;
        this.f245283f = map;
        this.f245284g = str;
        this.f245285h = bool;
        this.f245286i = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StartPublishBundle(Navigation navigation2, DeepLink deepLink, PublishInitialToast publishInitialToast, boolean z12, Map map, String str, Boolean bool, String str2, int i12, C42822w c42822w) {
        Navigation navigation3 = (i12 & 1) != 0 ? null : navigation2;
        deepLink = (i12 & 2) != 0 ? null : deepLink;
        PublishInitialToast publishInitialToast2 = (i12 & 4) != 0 ? null : publishInitialToast;
        boolean z13 = (i12 & 8) != 0 ? false : z12;
        Map map2 = (i12 & 16) != 0 ? null : map;
        this(deepLink, navigation3, publishInitialToast2, (i12 & 64) != 0 ? null : bool, (i12 & 32) != 0 ? null : str, (i12 & 128) != 0 ? null : str2, map2, z13);
    }
}

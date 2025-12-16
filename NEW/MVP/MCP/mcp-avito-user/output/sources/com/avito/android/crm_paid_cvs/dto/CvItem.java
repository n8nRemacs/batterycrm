package com.avito.android.crm_paid_cvs.dto;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: CvItem.kt */
@d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/CvItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CvItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<CvItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f130326b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Uri f130327c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f130328d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f130329e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f130330f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final CvStatus f130331g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f130332h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<CvBadge> f130333i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f130334j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f130335k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final DeepLink f130336l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final DeepLink f130337m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final DeepLink f130338n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final DeepLink f130339o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f130340p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f130341q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f130342r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f130343s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f130344t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f130345u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f130346v;

    /* compiled from: CvItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvItem> {
        @Override // android.os.Parcelable.Creator
        public final CvItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(CvItem.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            CvStatus cvStatusCreateFromParcel = parcel.readInt() == 0 ? null : CvStatus.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CvBadge.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CvItem(string, uri, string2, string3, string4, cvStatusCreateFromParcel, string5, arrayList, parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(CvItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(CvItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(CvItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(CvItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CvItem[] newArray(int i12) {
            return new CvItem[i12];
        }
    }

    public CvItem(@k String str, @l Uri uri, @k String str2, @k String str3, @k String str4, @l CvStatus cvStatus, @k String str5, @k List<CvBadge> list, @k String str6, @k String str7, @l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3, @l DeepLink deepLink4, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f130326b = str;
        this.f130327c = uri;
        this.f130328d = str2;
        this.f130329e = str3;
        this.f130330f = str4;
        this.f130331g = cvStatus;
        this.f130332h = str5;
        this.f130333i = list;
        this.f130334j = str6;
        this.f130335k = str7;
        this.f130336l = deepLink;
        this.f130337m = deepLink2;
        this.f130338n = deepLink3;
        this.f130339o = deepLink4;
        this.f130340p = z12;
        this.f130341q = z13;
        this.f130342r = z14;
        this.f130343s = z15;
        this.f130344t = z16;
        this.f130345u = z17;
        this.f130346v = z18;
    }

    public static CvItem a(CvItem cvItem, boolean z12, boolean z13, int i12) {
        boolean z14;
        boolean z15;
        String str = cvItem.f130326b;
        Uri uri = cvItem.f130327c;
        String str2 = cvItem.f130328d;
        String str3 = cvItem.f130329e;
        String str4 = cvItem.f130330f;
        CvStatus cvStatus = cvItem.f130331g;
        String str5 = cvItem.f130332h;
        List<CvBadge> list = cvItem.f130333i;
        String str6 = cvItem.f130334j;
        String str7 = cvItem.f130335k;
        DeepLink deepLink = cvItem.f130336l;
        DeepLink deepLink2 = cvItem.f130337m;
        DeepLink deepLink3 = cvItem.f130338n;
        DeepLink deepLink4 = cvItem.f130339o;
        boolean z16 = cvItem.f130340p;
        if ((i12 & 32768) != 0) {
            z14 = z16;
            z15 = cvItem.f130341q;
        } else {
            z14 = z16;
            z15 = z12;
        }
        boolean z17 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? cvItem.f130342r : z13;
        boolean z18 = cvItem.f130343s;
        boolean z19 = cvItem.f130344t;
        boolean z22 = cvItem.f130345u;
        boolean z23 = cvItem.f130346v;
        cvItem.getClass();
        return new CvItem(str, uri, str2, str3, str4, cvStatus, str5, list, str6, str7, deepLink, deepLink2, deepLink3, deepLink4, z14, z15, z17, z18, z19, z22, z23);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvItem)) {
            return false;
        }
        CvItem cvItem = (CvItem) obj;
        return L.f(this.f130326b, cvItem.f130326b) && L.f(this.f130327c, cvItem.f130327c) && L.f(this.f130328d, cvItem.f130328d) && L.f(this.f130329e, cvItem.f130329e) && L.f(this.f130330f, cvItem.f130330f) && L.f(this.f130331g, cvItem.f130331g) && L.f(this.f130332h, cvItem.f130332h) && L.f(this.f130333i, cvItem.f130333i) && L.f(this.f130334j, cvItem.f130334j) && L.f(this.f130335k, cvItem.f130335k) && L.f(this.f130336l, cvItem.f130336l) && L.f(this.f130337m, cvItem.f130337m) && L.f(this.f130338n, cvItem.f130338n) && L.f(this.f130339o, cvItem.f130339o) && this.f130340p == cvItem.f130340p && this.f130341q == cvItem.f130341q && this.f130342r == cvItem.f130342r && this.f130343s == cvItem.f130343s && this.f130344t == cvItem.f130344t && this.f130345u == cvItem.f130345u && this.f130346v == cvItem.f130346v;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247679b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289510b() {
        return this.f130326b;
    }

    public final int hashCode() {
        int iHashCode = this.f130326b.hashCode() * 31;
        Uri uri = this.f130327c;
        int iD2 = H.d(H.d(H.d((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f130328d), 31, this.f130329e), 31, this.f130330f);
        CvStatus cvStatus = this.f130331g;
        int iD3 = H.d(H.d(H.e(H.d((iD2 + (cvStatus == null ? 0 : cvStatus.hashCode())) * 31, 31, this.f130332h), 31, this.f130333i), 31, this.f130334j), 31, this.f130335k);
        DeepLink deepLink = this.f130336l;
        int iHashCode2 = (iD3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f130337m;
        int iHashCode3 = (iHashCode2 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.f130338n;
        int iHashCode4 = (iHashCode3 + (deepLink3 == null ? 0 : deepLink3.hashCode())) * 31;
        DeepLink deepLink4 = this.f130339o;
        return Boolean.hashCode(this.f130346v) + r.i(r.i(r.i(r.i(r.i(r.i((iHashCode4 + (deepLink4 != null ? deepLink4.hashCode() : 0)) * 31, 31, this.f130340p), 31, this.f130341q), 31, this.f130342r), 31, this.f130343s), 31, this.f130344t), 31, this.f130345u);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvItem(stringId=");
        sb2.append(this.f130326b);
        sb2.append(", avatar=");
        sb2.append(this.f130327c);
        sb2.append(", title=");
        sb2.append(this.f130328d);
        sb2.append(", subtitle=");
        sb2.append(this.f130329e);
        sb2.append(", managerName=");
        sb2.append(this.f130330f);
        sb2.append(", status=");
        sb2.append(this.f130331g);
        sb2.append(", noteText=");
        sb2.append(this.f130332h);
        sb2.append(", badges=");
        sb2.append(this.f130333i);
        sb2.append(", description1=");
        sb2.append(this.f130334j);
        sb2.append(", description2=");
        sb2.append(this.f130335k);
        sb2.append(", cvDeeplink=");
        sb2.append(this.f130336l);
        sb2.append(", chatDeeplink=");
        sb2.append(this.f130337m);
        sb2.append(", callDeeplink=");
        sb2.append(this.f130338n);
        sb2.append(", buyDeeplink=");
        sb2.append(this.f130339o);
        sb2.append(", isActive=");
        sb2.append(this.f130340p);
        sb2.append(", isFavorite=");
        sb2.append(this.f130341q);
        sb2.append(", isCompared=");
        sb2.append(this.f130342r);
        sb2.append(", isPurchased=");
        sb2.append(this.f130343s);
        sb2.append(", isLoading=");
        sb2.append(this.f130344t);
        sb2.append(", loadingStarted=");
        sb2.append(this.f130345u);
        sb2.append(", isError=");
        return r.x(sb2, this.f130346v, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130326b);
        parcel.writeParcelable(this.f130327c, i12);
        parcel.writeString(this.f130328d);
        parcel.writeString(this.f130329e);
        parcel.writeString(this.f130330f);
        CvStatus cvStatus = this.f130331g;
        if (cvStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStatus.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f130332h);
        Iterator itJ = C0.j(this.f130333i, parcel);
        while (itJ.hasNext()) {
            ((CvBadge) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f130334j);
        parcel.writeString(this.f130335k);
        parcel.writeParcelable(this.f130336l, i12);
        parcel.writeParcelable(this.f130337m, i12);
        parcel.writeParcelable(this.f130338n, i12);
        parcel.writeParcelable(this.f130339o, i12);
        parcel.writeInt(this.f130340p ? 1 : 0);
        parcel.writeInt(this.f130341q ? 1 : 0);
        parcel.writeInt(this.f130342r ? 1 : 0);
        parcel.writeInt(this.f130343s ? 1 : 0);
        parcel.writeInt(this.f130344t ? 1 : 0);
        parcel.writeInt(this.f130345u ? 1 : 0);
        parcel.writeInt(this.f130346v ? 1 : 0);
    }

    public CvItem(String str, Uri uri, String str2, String str3, String str4, CvStatus cvStatus, String str5, List list, String str6, String str7, DeepLink deepLink, DeepLink deepLink2, DeepLink deepLink3, DeepLink deepLink4, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : uri, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? "" : str4, (i12 & 32) != 0 ? null : cvStatus, (i12 & 64) != 0 ? "" : str5, (i12 & 128) != 0 ? C42784z0.f406748b : list, (i12 & 256) != 0 ? "" : str6, (i12 & 512) == 0 ? str7 : "", (i12 & 1024) != 0 ? null : deepLink, (i12 & 2048) != 0 ? null : deepLink2, (i12 & 4096) != 0 ? null : deepLink3, (i12 & 8192) == 0 ? deepLink4 : null, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z12, (i12 & 32768) != 0 ? false : z13, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? false : z14, (i12 & 131072) != 0 ? false : z15, (i12 & 262144) != 0 ? false : z16, (i12 & 524288) != 0 ? false : z17, (i12 & 1048576) == 0 ? z18 : false);
    }
}

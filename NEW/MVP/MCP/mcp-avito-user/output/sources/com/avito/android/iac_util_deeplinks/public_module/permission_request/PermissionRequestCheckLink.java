package com.avito.android.iac_util_deeplinks.public_module.permission_request;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: PermissionRequestCheckLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class PermissionRequestCheckLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PermissionRequestCheckLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f169301b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f169302c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f169303d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f169304e;

    /* compiled from: PermissionRequestCheckLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionRequestCheckLink> {
        @Override // android.os.Parcelable.Creator
        public final PermissionRequestCheckLink createFromParcel(Parcel parcel) {
            return new PermissionRequestCheckLink(parcel.createStringArrayList(), (DeepLink) parcel.readParcelable(PermissionRequestCheckLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestCheckLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestCheckLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionRequestCheckLink[] newArray(int i12) {
            return new PermissionRequestCheckLink[i12];
        }
    }

    /* compiled from: PermissionRequestCheckLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b;", "LJu/c$a;", "a", "b", "c", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b$b;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b$c;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.a {

        /* compiled from: PermissionRequestCheckLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f169305b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 858739780;
            }

            @k
            public final String toString() {
                return "Denied";
            }
        }

        /* compiled from: PermissionRequestCheckLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b$b;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestCheckLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5006b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C5006b f169306b = new C5006b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C5006b);
            }

            public final int hashCode() {
                return 429717273;
            }

            @k
            public final String toString() {
                return "ForeverDenied";
            }
        }

        /* compiled from: PermissionRequestCheckLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b$c;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestCheckLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f169307b = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -420990158;
            }

            @k
            public final String toString() {
                return "Granted";
            }
        }
    }

    public /* synthetic */ PermissionRequestCheckLink(List list, DeepLink deepLink, DeepLink deepLink2, DeepLink deepLink3, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : deepLink2, (i12 & 8) != 0 ? null : deepLink3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionRequestCheckLink)) {
            return false;
        }
        PermissionRequestCheckLink permissionRequestCheckLink = (PermissionRequestCheckLink) obj;
        return L.f(this.f169301b, permissionRequestCheckLink.f169301b) && L.f(this.f169302c, permissionRequestCheckLink.f169302c) && L.f(this.f169303d, permissionRequestCheckLink.f169303d) && L.f(this.f169304e, permissionRequestCheckLink.f169304e);
    }

    public final int hashCode() {
        int iHashCode = this.f169301b.hashCode() * 31;
        DeepLink deepLink = this.f169302c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f169303d;
        int iHashCode3 = (iHashCode2 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.f169304e;
        return iHashCode3 + (deepLink3 != null ? deepLink3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionRequestCheckLink(permissions=");
        sb2.append(this.f169301b);
        sb2.append(", onGranted=");
        sb2.append(this.f169302c);
        sb2.append(", onDenied=");
        sb2.append(this.f169303d);
        sb2.append(", onForeverDenied=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169304e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f169301b);
        parcel.writeParcelable(this.f169302c, i12);
        parcel.writeParcelable(this.f169303d, i12);
        parcel.writeParcelable(this.f169304e, i12);
    }

    public PermissionRequestCheckLink(@k List<String> list, @l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3) {
        this.f169301b = list;
        this.f169302c = deepLink;
        this.f169303d = deepLink2;
        this.f169304e = deepLink3;
    }
}

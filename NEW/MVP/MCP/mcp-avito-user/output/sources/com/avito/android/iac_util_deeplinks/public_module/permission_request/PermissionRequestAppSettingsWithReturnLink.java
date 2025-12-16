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

/* compiled from: PermissionRequestAppSettingsWithReturnLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class PermissionRequestAppSettingsWithReturnLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PermissionRequestAppSettingsWithReturnLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f169294b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f169295c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f169296d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f169297e;

    /* compiled from: PermissionRequestAppSettingsWithReturnLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionRequestAppSettingsWithReturnLink> {
        @Override // android.os.Parcelable.Creator
        public final PermissionRequestAppSettingsWithReturnLink createFromParcel(Parcel parcel) {
            return new PermissionRequestAppSettingsWithReturnLink(parcel.createStringArrayList(), (DeepLink) parcel.readParcelable(PermissionRequestAppSettingsWithReturnLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestAppSettingsWithReturnLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestAppSettingsWithReturnLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionRequestAppSettingsWithReturnLink[] newArray(int i12) {
            return new PermissionRequestAppSettingsWithReturnLink[i12];
        }
    }

    /* compiled from: PermissionRequestAppSettingsWithReturnLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b;", "LJu/c$a;", "a", "b", "c", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b$b;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b$c;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.a {

        /* compiled from: PermissionRequestAppSettingsWithReturnLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f169298b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -814550658;
            }

            @k
            public final String toString() {
                return "AlreadyGranted";
            }
        }

        /* compiled from: PermissionRequestAppSettingsWithReturnLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b$b;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestAppSettingsWithReturnLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5005b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C5005b f169299b = new C5005b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C5005b);
            }

            public final int hashCode() {
                return -178974821;
            }

            @k
            public final String toString() {
                return "ReturnedFromSettingsAndGranted";
            }
        }

        /* compiled from: PermissionRequestAppSettingsWithReturnLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b$c;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestAppSettingsWithReturnLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f169300b = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 702503816;
            }

            @k
            public final String toString() {
                return "ReturnedFromSettingsAndNotGranted";
            }
        }
    }

    public /* synthetic */ PermissionRequestAppSettingsWithReturnLink(List list, DeepLink deepLink, DeepLink deepLink2, DeepLink deepLink3, int i12, C42822w c42822w) {
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
        if (!(obj instanceof PermissionRequestAppSettingsWithReturnLink)) {
            return false;
        }
        PermissionRequestAppSettingsWithReturnLink permissionRequestAppSettingsWithReturnLink = (PermissionRequestAppSettingsWithReturnLink) obj;
        return L.f(this.f169294b, permissionRequestAppSettingsWithReturnLink.f169294b) && L.f(this.f169295c, permissionRequestAppSettingsWithReturnLink.f169295c) && L.f(this.f169296d, permissionRequestAppSettingsWithReturnLink.f169296d) && L.f(this.f169297e, permissionRequestAppSettingsWithReturnLink.f169297e);
    }

    public final int hashCode() {
        int iHashCode = this.f169294b.hashCode() * 31;
        DeepLink deepLink = this.f169295c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f169296d;
        int iHashCode3 = (iHashCode2 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.f169297e;
        return iHashCode3 + (deepLink3 != null ? deepLink3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionRequestAppSettingsWithReturnLink(permissions=");
        sb2.append(this.f169294b);
        sb2.append(", onAlreadyGranted=");
        sb2.append(this.f169295c);
        sb2.append(", onReturnedFromSettingsAndGranted=");
        sb2.append(this.f169296d);
        sb2.append(", onReturnedFromSettingsAndNotGranted=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169297e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f169294b);
        parcel.writeParcelable(this.f169295c, i12);
        parcel.writeParcelable(this.f169296d, i12);
        parcel.writeParcelable(this.f169297e, i12);
    }

    public PermissionRequestAppSettingsWithReturnLink(@k List<String> list, @l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3) {
        this.f169294b = list;
        this.f169295c = deepLink;
        this.f169296d = deepLink2;
        this.f169297e = deepLink3;
    }
}

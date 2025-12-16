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

/* compiled from: PermissionRequestSystemPopupLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class PermissionRequestSystemPopupLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PermissionRequestSystemPopupLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f169308b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f169309c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f169310d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f169311e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f169312f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f169313g;

    /* compiled from: PermissionRequestSystemPopupLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionRequestSystemPopupLink> {
        @Override // android.os.Parcelable.Creator
        public final PermissionRequestSystemPopupLink createFromParcel(Parcel parcel) {
            return new PermissionRequestSystemPopupLink(parcel.createStringArrayList(), (DeepLink) parcel.readParcelable(PermissionRequestSystemPopupLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestSystemPopupLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestSystemPopupLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestSystemPopupLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(PermissionRequestSystemPopupLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PermissionRequestSystemPopupLink[] newArray(int i12) {
            return new PermissionRequestSystemPopupLink[i12];
        }
    }

    /* compiled from: PermissionRequestSystemPopupLink.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b;", "LJu/c$a;", "a", "b", "c", "d", "e", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$b;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$c;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$d;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$e;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.a {

        /* compiled from: PermissionRequestSystemPopupLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f169314b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -392092920;
            }

            @k
            public final String toString() {
                return "AlreadyForeverDenied";
            }
        }

        /* compiled from: PermissionRequestSystemPopupLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$b;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5007b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C5007b f169315b = new C5007b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C5007b);
            }

            public final int hashCode() {
                return 666615393;
            }

            @k
            public final String toString() {
                return "AlreadyGranted";
            }
        }

        /* compiled from: PermissionRequestSystemPopupLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$c;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f169316b = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1151900834;
            }

            @k
            public final String toString() {
                return "RequestedAndDenied";
            }
        }

        /* compiled from: PermissionRequestSystemPopupLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$d;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f169317b = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1756288773;
            }

            @k
            public final String toString() {
                return "RequestedAndForeverDenied";
            }
        }

        /* compiled from: PermissionRequestSystemPopupLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b$e;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink$b;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final e f169318b = new e();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 77067924;
            }

            @k
            public final String toString() {
                return "RequestedAndGranted";
            }
        }
    }

    public /* synthetic */ PermissionRequestSystemPopupLink(List list, DeepLink deepLink, DeepLink deepLink2, DeepLink deepLink3, DeepLink deepLink4, DeepLink deepLink5, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : deepLink2, (i12 & 8) != 0 ? null : deepLink3, (i12 & 16) != 0 ? null : deepLink4, (i12 & 32) == 0 ? deepLink5 : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionRequestSystemPopupLink)) {
            return false;
        }
        PermissionRequestSystemPopupLink permissionRequestSystemPopupLink = (PermissionRequestSystemPopupLink) obj;
        return L.f(this.f169308b, permissionRequestSystemPopupLink.f169308b) && L.f(this.f169309c, permissionRequestSystemPopupLink.f169309c) && L.f(this.f169310d, permissionRequestSystemPopupLink.f169310d) && L.f(this.f169311e, permissionRequestSystemPopupLink.f169311e) && L.f(this.f169312f, permissionRequestSystemPopupLink.f169312f) && L.f(this.f169313g, permissionRequestSystemPopupLink.f169313g);
    }

    public final int hashCode() {
        int iHashCode = this.f169308b.hashCode() * 31;
        DeepLink deepLink = this.f169309c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f169310d;
        int iHashCode3 = (iHashCode2 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.f169311e;
        int iHashCode4 = (iHashCode3 + (deepLink3 == null ? 0 : deepLink3.hashCode())) * 31;
        DeepLink deepLink4 = this.f169312f;
        int iHashCode5 = (iHashCode4 + (deepLink4 == null ? 0 : deepLink4.hashCode())) * 31;
        DeepLink deepLink5 = this.f169313g;
        return iHashCode5 + (deepLink5 != null ? deepLink5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionRequestSystemPopupLink(permissions=");
        sb2.append(this.f169308b);
        sb2.append(", onAlreadyGranted=");
        sb2.append(this.f169309c);
        sb2.append(", onAlreadyForeverDenied=");
        sb2.append(this.f169310d);
        sb2.append(", onRequestedAndGranted=");
        sb2.append(this.f169311e);
        sb2.append(", onRequestedAndDenied=");
        sb2.append(this.f169312f);
        sb2.append(", onRequestedAndForeverDenied=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169313g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f169308b);
        parcel.writeParcelable(this.f169309c, i12);
        parcel.writeParcelable(this.f169310d, i12);
        parcel.writeParcelable(this.f169311e, i12);
        parcel.writeParcelable(this.f169312f, i12);
        parcel.writeParcelable(this.f169313g, i12);
    }

    public PermissionRequestSystemPopupLink(@k List<String> list, @l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3, @l DeepLink deepLink4, @l DeepLink deepLink5) {
        this.f169308b = list;
        this.f169309c = deepLink;
        this.f169310d = deepLink2;
        this.f169311e = deepLink3;
        this.f169312f = deepLink4;
        this.f169313g = deepLink5;
    }
}

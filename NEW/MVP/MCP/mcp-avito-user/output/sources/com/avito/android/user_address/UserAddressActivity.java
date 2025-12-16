package com.avito.android.user_address;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC23487e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.SxAddAddressSource;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.impl.a;
import com.avito.android.di.C29972i;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.user_address.NavigationController;
import com.avito.android.util.C35961v3;
import com.avito.android.util.OpenParams;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import md.InterfaceC44055a;
import yA0.InterfaceC50095c;

/* compiled from: UserAddressActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/user_address/g;", "Lcom/avito/android/analytics/screens/j$a;", "Lmd/a;", "Lcom/avito/android/user_address/di/b;", "<init>", "()V", "a", "UserAddressActivityOpenParams", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAddressActivity extends com.avito.android.ui.activity.a implements g, InterfaceC28477j.a, InterfaceC44055a<com.avito.android.user_address.di.b> {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f307102p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC50095c f307103m;

    /* renamed from: n, reason: collision with root package name */
    public com.avito.android.user_address.di.b f307104n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final NavigationController f307105o = new NavigationController(getSupportFragmentManager(), new a.C4058a(this), new b());

    /* compiled from: UserAddressActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams;", "Lcom/avito/android/util/OpenParams;", "FragmentsParams", "GeoSessionId", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class UserAddressActivityOpenParams implements OpenParams {

        @k
        public static final Parcelable.Creator<UserAddressActivityOpenParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final GeoSessionId f307106b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final FragmentsParams f307107c;

        /* compiled from: UserAddressActivity.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams;", "Landroid/os/Parcelable;", "()V", "List", "Map", "Suggests", "SupportAddressMode", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$List;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class FragmentsParams implements Parcelable {

            /* compiled from: UserAddressActivity.kt */
            @K51.d
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$List;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$SupportAddressMode;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class List extends FragmentsParams implements SupportAddressMode {

                @k
                public static final Parcelable.Creator<List> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @l
                public final UserAddressLink.Result.Success f307108b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final String f307109c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final SupportAddressMode.Mode f307110d;

                /* compiled from: UserAddressActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<List> {
                    @Override // android.os.Parcelable.Creator
                    public final List createFromParcel(Parcel parcel) {
                        return new List((UserAddressLink.Result.Success) parcel.readParcelable(List.class.getClassLoader()), parcel.readString(), SupportAddressMode.Mode.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final List[] newArray(int i12) {
                        return new List[i12];
                    }
                }

                public List() {
                    this(null, null, null, 7, null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof List)) {
                        return false;
                    }
                    List list = (List) obj;
                    return L.f(this.f307108b, list.f307108b) && L.f(this.f307109c, list.f307109c) && this.f307110d == list.f307110d;
                }

                public final int hashCode() {
                    UserAddressLink.Result.Success success = this.f307108b;
                    int iHashCode = (success == null ? 0 : success.hashCode()) * 31;
                    String str = this.f307109c;
                    return this.f307110d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
                }

                @k
                public final String toString() {
                    return "List(toastInfo=" + this.f307108b + ", fromPage=" + this.f307109c + ", mode=" + this.f307110d + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f307108b, i12);
                    parcel.writeString(this.f307109c);
                    parcel.writeString(this.f307110d.name());
                }

                public /* synthetic */ List(UserAddressLink.Result.Success success, String str, SupportAddressMode.Mode mode, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? null : success, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? SupportAddressMode.Mode.f307183c : mode);
                }

                public List(@l UserAddressLink.Result.Success success, @l String str, @k SupportAddressMode.Mode mode) {
                    super(null);
                    this.f307108b = success;
                    this.f307109c = str;
                    this.f307110d = mode;
                }
            }

            /* compiled from: UserAddressActivity.kt */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams;", "<init>", "()V", "FullAddress", "MultiGeo", "SellerAddressFlow", "SellerFlow", "Short", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$MultiGeo;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$SellerAddressFlow;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$Short;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static abstract class Map extends FragmentsParams {

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map;", "<init>", "()V", "ByAddress", "ById", "BySuggest", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress$ByAddress;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress$ById;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress$BySuggest;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @K51.d
                public static abstract class FullAddress extends Map {

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress$ByAddress;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class ByAddress extends FullAddress {

                        @k
                        public static final Parcelable.Creator<ByAddress> CREATOR = new a();

                        /* renamed from: b, reason: collision with root package name */
                        @k
                        public final String f307111b;

                        /* renamed from: c, reason: collision with root package name */
                        public final double f307112c;

                        /* renamed from: d, reason: collision with root package name */
                        public final double f307113d;

                        /* renamed from: e, reason: collision with root package name */
                        @l
                        public final DeepLink f307114e;

                        /* renamed from: f, reason: collision with root package name */
                        @k
                        public final NavigationController.Mode f307115f;

                        /* renamed from: g, reason: collision with root package name */
                        public final boolean f307116g;

                        /* compiled from: UserAddressActivity.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class a implements Parcelable.Creator<ByAddress> {
                            @Override // android.os.Parcelable.Creator
                            public final ByAddress createFromParcel(Parcel parcel) {
                                return new ByAddress(parcel.readString(), parcel.readDouble(), parcel.readDouble(), (DeepLink) parcel.readParcelable(ByAddress.class.getClassLoader()), NavigationController.Mode.valueOf(parcel.readString()), parcel.readInt() != 0);
                            }

                            @Override // android.os.Parcelable.Creator
                            public final ByAddress[] newArray(int i12) {
                                return new ByAddress[i12];
                            }
                        }

                        public ByAddress(@k String str, double d12, double d13, @l DeepLink deepLink, @k NavigationController.Mode mode, boolean z12) {
                            super(null);
                            this.f307111b = str;
                            this.f307112c = d12;
                            this.f307113d = d13;
                            this.f307114e = deepLink;
                            this.f307115f = mode;
                            this.f307116g = z12;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                        @k
                        /* renamed from: c, reason: from getter */
                        public final NavigationController.Mode getF307155f() {
                            return this.f307115f;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                        @l
                        /* renamed from: d, reason: from getter */
                        public final DeepLink getF307154e() {
                            return this.f307114e;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress
                        /* renamed from: e, reason: from getter */
                        public final boolean getF307127h() {
                            return this.f307116g;
                        }

                        public final boolean equals(@l Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof ByAddress)) {
                                return false;
                            }
                            ByAddress byAddress = (ByAddress) obj;
                            return L.f(this.f307111b, byAddress.f307111b) && Double.compare(this.f307112c, byAddress.f307112c) == 0 && Double.compare(this.f307113d, byAddress.f307113d) == 0 && L.f(this.f307114e, byAddress.f307114e) && this.f307115f == byAddress.f307115f && this.f307116g == byAddress.f307116g;
                        }

                        public final int hashCode() {
                            int iD2 = androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d(this.f307111b.hashCode() * 31, 31, this.f307112c), 31, this.f307113d);
                            DeepLink deepLink = this.f307114e;
                            return Boolean.hashCode(this.f307116g) + ((this.f307115f.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31);
                        }

                        @k
                        public final String toString() {
                            StringBuilder sb2 = new StringBuilder("ByAddress(address=");
                            sb2.append(this.f307111b);
                            sb2.append(", longitude=");
                            sb2.append(this.f307112c);
                            sb2.append(", latitude=");
                            sb2.append(this.f307113d);
                            sb2.append(", successUrl=");
                            sb2.append(this.f307114e);
                            sb2.append(", mode=");
                            sb2.append(this.f307115f);
                            sb2.append(", enableDeleteAddress=");
                            return r.x(sb2, this.f307116g, ')');
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(@k Parcel parcel, int i12) {
                            parcel.writeString(this.f307111b);
                            parcel.writeDouble(this.f307112c);
                            parcel.writeDouble(this.f307113d);
                            parcel.writeParcelable(this.f307114e, i12);
                            parcel.writeString(this.f307115f.name());
                            parcel.writeInt(this.f307116g ? 1 : 0);
                        }
                    }

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress$ById;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class ById extends FullAddress {

                        @k
                        public static final Parcelable.Creator<ById> CREATOR = new a();

                        /* renamed from: b, reason: collision with root package name */
                        public final int f307117b;

                        /* renamed from: c, reason: collision with root package name */
                        @l
                        public final DeepLink f307118c;

                        /* renamed from: d, reason: collision with root package name */
                        @k
                        public final NavigationController.Mode f307119d;

                        /* renamed from: e, reason: collision with root package name */
                        public final boolean f307120e;

                        /* compiled from: UserAddressActivity.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class a implements Parcelable.Creator<ById> {
                            @Override // android.os.Parcelable.Creator
                            public final ById createFromParcel(Parcel parcel) {
                                return new ById(parcel.readInt(), (DeepLink) parcel.readParcelable(ById.class.getClassLoader()), NavigationController.Mode.valueOf(parcel.readString()), parcel.readInt() != 0);
                            }

                            @Override // android.os.Parcelable.Creator
                            public final ById[] newArray(int i12) {
                                return new ById[i12];
                            }
                        }

                        public ById(int i12, @l DeepLink deepLink, @k NavigationController.Mode mode, boolean z12) {
                            super(null);
                            this.f307117b = i12;
                            this.f307118c = deepLink;
                            this.f307119d = mode;
                            this.f307120e = z12;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                        @k
                        /* renamed from: c, reason: from getter */
                        public final NavigationController.Mode getF307155f() {
                            return this.f307119d;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                        @l
                        /* renamed from: d, reason: from getter */
                        public final DeepLink getF307154e() {
                            return this.f307118c;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress
                        /* renamed from: e, reason: from getter */
                        public final boolean getF307127h() {
                            return this.f307120e;
                        }

                        public final boolean equals(@l Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof ById)) {
                                return false;
                            }
                            ById byId = (ById) obj;
                            return this.f307117b == byId.f307117b && L.f(this.f307118c, byId.f307118c) && this.f307119d == byId.f307119d && this.f307120e == byId.f307120e;
                        }

                        public final int hashCode() {
                            int iHashCode = Integer.hashCode(this.f307117b) * 31;
                            DeepLink deepLink = this.f307118c;
                            return Boolean.hashCode(this.f307120e) + ((this.f307119d.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31);
                        }

                        @k
                        public final String toString() {
                            StringBuilder sb2 = new StringBuilder("ById(addressId=");
                            sb2.append(this.f307117b);
                            sb2.append(", successUrl=");
                            sb2.append(this.f307118c);
                            sb2.append(", mode=");
                            sb2.append(this.f307119d);
                            sb2.append(", enableDeleteAddress=");
                            return r.x(sb2, this.f307120e, ')');
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(@k Parcel parcel, int i12) {
                            parcel.writeInt(this.f307117b);
                            parcel.writeParcelable(this.f307118c, i12);
                            parcel.writeString(this.f307119d.name());
                            parcel.writeInt(this.f307120e ? 1 : 0);
                        }
                    }

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress$BySuggest;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$FullAddress;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final /* data */ class BySuggest extends FullAddress {

                        @k
                        public static final Parcelable.Creator<BySuggest> CREATOR = new a();

                        /* renamed from: b, reason: collision with root package name */
                        public final int f307121b;

                        /* renamed from: c, reason: collision with root package name */
                        @k
                        public final String f307122c;

                        /* renamed from: d, reason: collision with root package name */
                        public final double f307123d;

                        /* renamed from: e, reason: collision with root package name */
                        public final double f307124e;

                        /* renamed from: f, reason: collision with root package name */
                        @l
                        public final DeepLink f307125f;

                        /* renamed from: g, reason: collision with root package name */
                        @k
                        public final NavigationController.Mode f307126g;

                        /* renamed from: h, reason: collision with root package name */
                        public final boolean f307127h;

                        /* compiled from: UserAddressActivity.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        public static final class a implements Parcelable.Creator<BySuggest> {
                            @Override // android.os.Parcelable.Creator
                            public final BySuggest createFromParcel(Parcel parcel) {
                                return new BySuggest(parcel.readInt(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), (DeepLink) parcel.readParcelable(BySuggest.class.getClassLoader()), NavigationController.Mode.valueOf(parcel.readString()), parcel.readInt() != 0);
                            }

                            @Override // android.os.Parcelable.Creator
                            public final BySuggest[] newArray(int i12) {
                                return new BySuggest[i12];
                            }
                        }

                        public BySuggest(int i12, @k String str, double d12, double d13, @l DeepLink deepLink, @k NavigationController.Mode mode, boolean z12) {
                            super(null);
                            this.f307121b = i12;
                            this.f307122c = str;
                            this.f307123d = d12;
                            this.f307124e = d13;
                            this.f307125f = deepLink;
                            this.f307126g = mode;
                            this.f307127h = z12;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                        @k
                        /* renamed from: c, reason: from getter */
                        public final NavigationController.Mode getF307155f() {
                            return this.f307126g;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                        @l
                        /* renamed from: d, reason: from getter */
                        public final DeepLink getF307154e() {
                            return this.f307125f;
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress
                        /* renamed from: e, reason: from getter */
                        public final boolean getF307127h() {
                            return this.f307127h;
                        }

                        public final boolean equals(@l Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof BySuggest)) {
                                return false;
                            }
                            BySuggest bySuggest = (BySuggest) obj;
                            return this.f307121b == bySuggest.f307121b && L.f(this.f307122c, bySuggest.f307122c) && Double.compare(this.f307123d, bySuggest.f307123d) == 0 && Double.compare(this.f307124e, bySuggest.f307124e) == 0 && L.f(this.f307125f, bySuggest.f307125f) && this.f307126g == bySuggest.f307126g && this.f307127h == bySuggest.f307127h;
                        }

                        public final int hashCode() {
                            int iD2 = androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d(H.d(Integer.hashCode(this.f307121b) * 31, 31, this.f307122c), 31, this.f307123d), 31, this.f307124e);
                            DeepLink deepLink = this.f307125f;
                            return Boolean.hashCode(this.f307127h) + ((this.f307126g.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31);
                        }

                        @k
                        public final String toString() {
                            StringBuilder sb2 = new StringBuilder("BySuggest(oldAddressId=");
                            sb2.append(this.f307121b);
                            sb2.append(", newAddress=");
                            sb2.append(this.f307122c);
                            sb2.append(", longitude=");
                            sb2.append(this.f307123d);
                            sb2.append(", latitude=");
                            sb2.append(this.f307124e);
                            sb2.append(", successUrl=");
                            sb2.append(this.f307125f);
                            sb2.append(", mode=");
                            sb2.append(this.f307126g);
                            sb2.append(", enableDeleteAddress=");
                            return r.x(sb2, this.f307127h, ')');
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(@k Parcel parcel, int i12) {
                            parcel.writeInt(this.f307121b);
                            parcel.writeString(this.f307122c);
                            parcel.writeDouble(this.f307123d);
                            parcel.writeDouble(this.f307124e);
                            parcel.writeParcelable(this.f307125f, i12);
                            parcel.writeString(this.f307126g.name());
                            parcel.writeInt(this.f307127h ? 1 : 0);
                        }
                    }

                    public /* synthetic */ FullAddress(C42822w c42822w) {
                        this();
                    }

                    /* renamed from: e */
                    public abstract boolean getF307127h();

                    public FullAddress() {
                        super(null);
                    }
                }

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$MultiGeo;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class MultiGeo extends Map {

                    @k
                    public static final Parcelable.Creator<MultiGeo> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @k
                    public final String f307128b;

                    /* renamed from: c, reason: collision with root package name */
                    @k
                    public final String f307129c;

                    /* renamed from: d, reason: collision with root package name */
                    @l
                    public final Integer f307130d;

                    /* renamed from: e, reason: collision with root package name */
                    public final double f307131e;

                    /* renamed from: f, reason: collision with root package name */
                    public final double f307132f;

                    /* renamed from: g, reason: collision with root package name */
                    @k
                    public final JobMultiGeoLink.FlowType f307133g;

                    /* renamed from: h, reason: collision with root package name */
                    @k
                    public final NavigationController.Mode f307134h;

                    /* renamed from: i, reason: collision with root package name */
                    @l
                    public final DeepLink f307135i;

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<MultiGeo> {
                        @Override // android.os.Parcelable.Creator
                        public final MultiGeo createFromParcel(Parcel parcel) {
                            return new MultiGeo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readDouble(), parcel.readDouble(), JobMultiGeoLink.FlowType.valueOf(parcel.readString()), NavigationController.Mode.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(MultiGeo.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final MultiGeo[] newArray(int i12) {
                            return new MultiGeo[i12];
                        }
                    }

                    public MultiGeo(@k String str, @k String str2, @l Integer num, double d12, double d13, @k JobMultiGeoLink.FlowType flowType, @k NavigationController.Mode mode, @l DeepLink deepLink) {
                        super(null);
                        this.f307128b = str;
                        this.f307129c = str2;
                        this.f307130d = num;
                        this.f307131e = d12;
                        this.f307132f = d13;
                        this.f307133g = flowType;
                        this.f307134h = mode;
                        this.f307135i = deepLink;
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                    @k
                    /* renamed from: c, reason: from getter */
                    public final NavigationController.Mode getF307155f() {
                        return this.f307134h;
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                    @l
                    /* renamed from: d, reason: from getter */
                    public final DeepLink getF307154e() {
                        return this.f307135i;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MultiGeo)) {
                            return false;
                        }
                        MultiGeo multiGeo = (MultiGeo) obj;
                        return L.f(this.f307128b, multiGeo.f307128b) && L.f(this.f307129c, multiGeo.f307129c) && L.f(this.f307130d, multiGeo.f307130d) && Double.compare(this.f307131e, multiGeo.f307131e) == 0 && Double.compare(this.f307132f, multiGeo.f307132f) == 0 && this.f307133g == multiGeo.f307133g && this.f307134h == multiGeo.f307134h && L.f(this.f307135i, multiGeo.f307135i);
                    }

                    public final int hashCode() {
                        int iD2 = H.d(this.f307128b.hashCode() * 31, 31, this.f307129c);
                        Integer num = this.f307130d;
                        int iHashCode = (this.f307134h.hashCode() + ((this.f307133g.hashCode() + androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d((iD2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f307131e), 31, this.f307132f)) * 31)) * 31;
                        DeepLink deepLink = this.f307135i;
                        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MultiGeo(jwt=");
                        sb2.append(this.f307128b);
                        sb2.append(", address=");
                        sb2.append(this.f307129c);
                        sb2.append(", addressId=");
                        sb2.append(this.f307130d);
                        sb2.append(", longitude=");
                        sb2.append(this.f307131e);
                        sb2.append(", latitude=");
                        sb2.append(this.f307132f);
                        sb2.append(", flowType=");
                        sb2.append(this.f307133g);
                        sb2.append(", mode=");
                        sb2.append(this.f307134h);
                        sb2.append(", successUrl=");
                        return com.avito.android.actions_sheet.a.v(sb2, this.f307135i, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.f307128b);
                        parcel.writeString(this.f307129c);
                        Integer num = this.f307130d;
                        if (num == null) {
                            parcel.writeInt(0);
                        } else {
                            com.avito.android.actions_sheet.a.C(parcel, 1, num);
                        }
                        parcel.writeDouble(this.f307131e);
                        parcel.writeDouble(this.f307132f);
                        parcel.writeString(this.f307133g.name());
                        parcel.writeString(this.f307134h.name());
                        parcel.writeParcelable(this.f307135i, i12);
                    }
                }

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$SellerAddressFlow;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$SellerFlow;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class SellerAddressFlow extends Map implements SellerFlow {

                    @k
                    public static final Parcelable.Creator<SellerAddressFlow> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @l
                    public final String f307136b;

                    /* renamed from: c, reason: collision with root package name */
                    @l
                    public final Long f307137c;

                    /* renamed from: d, reason: collision with root package name */
                    @k
                    public final String f307138d;

                    /* renamed from: e, reason: collision with root package name */
                    public final double f307139e;

                    /* renamed from: f, reason: collision with root package name */
                    public final double f307140f;

                    /* renamed from: g, reason: collision with root package name */
                    public final int f307141g;

                    /* renamed from: h, reason: collision with root package name */
                    @l
                    public final Boolean f307142h;

                    /* renamed from: i, reason: collision with root package name */
                    @k
                    public final SxAddAddressSource f307143i;

                    /* renamed from: j, reason: collision with root package name */
                    @k
                    public final NavigationController.Mode f307144j;

                    /* renamed from: k, reason: collision with root package name */
                    @l
                    public final DeepLink f307145k;

                    /* renamed from: l, reason: collision with root package name */
                    @k
                    public final SellerFlow.Flow f307146l;

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<SellerAddressFlow> {
                        @Override // android.os.Parcelable.Creator
                        public final SellerAddressFlow createFromParcel(Parcel parcel) {
                            Boolean boolValueOf;
                            String string = parcel.readString();
                            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                            String string2 = parcel.readString();
                            double d12 = parcel.readDouble();
                            double d13 = parcel.readDouble();
                            int i12 = parcel.readInt();
                            if (parcel.readInt() == 0) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            return new SellerAddressFlow(string, lValueOf, string2, d12, d13, i12, boolValueOf, SxAddAddressSource.valueOf(parcel.readString()), NavigationController.Mode.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(SellerAddressFlow.class.getClassLoader()), SellerFlow.Flow.valueOf(parcel.readString()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final SellerAddressFlow[] newArray(int i12) {
                            return new SellerAddressFlow[i12];
                        }
                    }

                    public SellerAddressFlow(@l String str, @l Long l12, @k String str2, double d12, double d13, int i12, @l Boolean bool, @k SxAddAddressSource sxAddAddressSource, @k NavigationController.Mode mode, @l DeepLink deepLink, @k SellerFlow.Flow flow) {
                        super(null);
                        this.f307136b = str;
                        this.f307137c = l12;
                        this.f307138d = str2;
                        this.f307139e = d12;
                        this.f307140f = d13;
                        this.f307141g = i12;
                        this.f307142h = bool;
                        this.f307143i = sxAddAddressSource;
                        this.f307144j = mode;
                        this.f307145k = deepLink;
                        this.f307146l = flow;
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                    @k
                    /* renamed from: c, reason: from getter */
                    public final NavigationController.Mode getF307155f() {
                        return this.f307144j;
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                    @l
                    /* renamed from: d, reason: from getter */
                    public final DeepLink getF307154e() {
                        return this.f307145k;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof SellerAddressFlow)) {
                            return false;
                        }
                        SellerAddressFlow sellerAddressFlow = (SellerAddressFlow) obj;
                        return L.f(this.f307136b, sellerAddressFlow.f307136b) && L.f(this.f307137c, sellerAddressFlow.f307137c) && L.f(this.f307138d, sellerAddressFlow.f307138d) && Double.compare(this.f307139e, sellerAddressFlow.f307139e) == 0 && Double.compare(this.f307140f, sellerAddressFlow.f307140f) == 0 && this.f307141g == sellerAddressFlow.f307141g && L.f(this.f307142h, sellerAddressFlow.f307142h) && this.f307143i == sellerAddressFlow.f307143i && this.f307144j == sellerAddressFlow.f307144j && L.f(this.f307145k, sellerAddressFlow.f307145k) && this.f307146l == sellerAddressFlow.f307146l;
                    }

                    public final int hashCode() {
                        String str = this.f307136b;
                        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                        Long l12 = this.f307137c;
                        int iE2 = r.e(this.f307141g, androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d(H.d((iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f307138d), 31, this.f307139e), 31, this.f307140f), 31);
                        Boolean bool = this.f307142h;
                        int iHashCode2 = (this.f307144j.hashCode() + ((this.f307143i.hashCode() + ((iE2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
                        DeepLink deepLink = this.f307145k;
                        return this.f307146l.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
                    }

                    @k
                    public final String toString() {
                        return "SellerAddressFlow(esid=" + this.f307136b + ", addressId=" + this.f307137c + ", newAddress=" + this.f307138d + ", longitude=" + this.f307139e + ", latitude=" + this.f307140f + ", verticalId=" + this.f307141g + ", showsSuccessToast=" + this.f307142h + ", source=" + this.f307143i + ", mode=" + this.f307144j + ", successUrl=" + this.f307145k + ", flow=" + this.f307146l + ')';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.f307136b);
                        Long l12 = this.f307137c;
                        if (l12 == null) {
                            parcel.writeInt(0);
                        } else {
                            C0.m(parcel, 1, l12);
                        }
                        parcel.writeString(this.f307138d);
                        parcel.writeDouble(this.f307139e);
                        parcel.writeDouble(this.f307140f);
                        parcel.writeInt(this.f307141g);
                        Boolean bool = this.f307142h;
                        if (bool == null) {
                            parcel.writeInt(0);
                        } else {
                            C0.l(parcel, 1, bool);
                        }
                        parcel.writeString(this.f307143i.name());
                        parcel.writeString(this.f307144j.name());
                        parcel.writeParcelable(this.f307145k, i12);
                        parcel.writeString(this.f307146l.name());
                    }
                }

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$SellerFlow;", "", "Flow", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$SellerAddressFlow;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$SellerAddressFlow;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public interface SellerFlow {

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$SellerFlow$Flow;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    public static final class Flow {

                        /* renamed from: b, reason: collision with root package name */
                        public static final Flow f307147b;

                        /* renamed from: c, reason: collision with root package name */
                        public static final Flow f307148c;

                        /* renamed from: d, reason: collision with root package name */
                        public static final /* synthetic */ Flow[] f307149d;

                        /* renamed from: e, reason: collision with root package name */
                        public static final /* synthetic */ kotlin.enums.a f307150e;

                        static {
                            Flow flow = new Flow("ADD", 0);
                            f307147b = flow;
                            Flow flow2 = new Flow("EDIT", 1);
                            f307148c = flow2;
                            Flow[] flowArr = {flow, flow2};
                            f307149d = flowArr;
                            f307150e = kotlin.enums.c.a(flowArr);
                        }

                        public Flow() {
                            throw null;
                        }

                        public static Flow valueOf(String str) {
                            return (Flow) Enum.valueOf(Flow.class, str);
                        }

                        public static Flow[] values() {
                            return (Flow[]) f307149d.clone();
                        }
                    }
                }

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$Short;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Short extends Map {

                    @k
                    public static final Parcelable.Creator<Short> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @k
                    public final String f307151b;

                    /* renamed from: c, reason: collision with root package name */
                    public final double f307152c;

                    /* renamed from: d, reason: collision with root package name */
                    public final double f307153d;

                    /* renamed from: e, reason: collision with root package name */
                    @l
                    public final DeepLink f307154e;

                    /* renamed from: f, reason: collision with root package name */
                    @k
                    public final NavigationController.Mode f307155f;

                    /* renamed from: g, reason: collision with root package name */
                    public final boolean f307156g;

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Short> {
                        @Override // android.os.Parcelable.Creator
                        public final Short createFromParcel(Parcel parcel) {
                            return new Short(parcel.readString(), parcel.readDouble(), parcel.readDouble(), (DeepLink) parcel.readParcelable(Short.class.getClassLoader()), NavigationController.Mode.valueOf(parcel.readString()), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Short[] newArray(int i12) {
                            return new Short[i12];
                        }
                    }

                    public /* synthetic */ Short(String str, double d12, double d13, DeepLink deepLink, NavigationController.Mode mode, boolean z12, int i12, C42822w c42822w) {
                        this(str, d12, d13, deepLink, mode, (i12 & 32) != 0 ? false : z12);
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                    @k
                    /* renamed from: c, reason: from getter */
                    public final NavigationController.Mode getF307155f() {
                        return this.f307155f;
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map
                    @l
                    /* renamed from: d, reason: from getter */
                    public final DeepLink getF307154e() {
                        return this.f307154e;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Short)) {
                            return false;
                        }
                        Short r82 = (Short) obj;
                        return L.f(this.f307151b, r82.f307151b) && Double.compare(this.f307152c, r82.f307152c) == 0 && Double.compare(this.f307153d, r82.f307153d) == 0 && L.f(this.f307154e, r82.f307154e) && this.f307155f == r82.f307155f && this.f307156g == r82.f307156g;
                    }

                    public final int hashCode() {
                        int iD2 = androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d(this.f307151b.hashCode() * 31, 31, this.f307152c), 31, this.f307153d);
                        DeepLink deepLink = this.f307154e;
                        return Boolean.hashCode(this.f307156g) + ((this.f307155f.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31)) * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("Short(address=");
                        sb2.append(this.f307151b);
                        sb2.append(", longitude=");
                        sb2.append(this.f307152c);
                        sb2.append(", latitude=");
                        sb2.append(this.f307153d);
                        sb2.append(", successUrl=");
                        sb2.append(this.f307154e);
                        sb2.append(", mode=");
                        sb2.append(this.f307155f);
                        sb2.append(", realEstate=");
                        return r.x(sb2, this.f307156g, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.f307151b);
                        parcel.writeDouble(this.f307152c);
                        parcel.writeDouble(this.f307153d);
                        parcel.writeParcelable(this.f307154e, i12);
                        parcel.writeString(this.f307155f.name());
                        parcel.writeInt(this.f307156g ? 1 : 0);
                    }

                    public Short(@k String str, double d12, double d13, @l DeepLink deepLink, @k NavigationController.Mode mode, boolean z12) {
                        super(null);
                        this.f307151b = str;
                        this.f307152c = d12;
                        this.f307153d = d13;
                        this.f307154e = deepLink;
                        this.f307155f = mode;
                        this.f307156g = z12;
                    }
                }

                public /* synthetic */ Map(C42822w c42822w) {
                    this();
                }

                @k
                /* renamed from: c */
                public abstract NavigationController.Mode getF307155f();

                @l
                /* renamed from: d */
                public abstract DeepLink getF307154e();

                public Map() {
                    super(null);
                }
            }

            /* compiled from: UserAddressActivity.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$SupportAddressMode;", "<init>", "()V", "Create", "Edit", "MultiGeo", "SellerAddressFlow", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$Create;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$Edit;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$MultiGeo;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$SellerAddressFlow;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static abstract class Suggests extends FragmentsParams implements SupportAddressMode {

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$MultiGeo;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class MultiGeo extends Suggests {

                    @k
                    public static final Parcelable.Creator<MultiGeo> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @k
                    public final String f307166b;

                    /* renamed from: c, reason: collision with root package name */
                    @k
                    public final String f307167c;

                    /* renamed from: d, reason: collision with root package name */
                    @l
                    public final Integer f307168d;

                    /* renamed from: e, reason: collision with root package name */
                    @k
                    public final NavigationController.Mode f307169e;

                    /* renamed from: f, reason: collision with root package name */
                    @k
                    public final JobMultiGeoLink.FlowType f307170f;

                    /* renamed from: g, reason: collision with root package name */
                    @k
                    public final SupportAddressMode.Mode f307171g;

                    /* renamed from: h, reason: collision with root package name */
                    @l
                    public final DeepLink f307172h;

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<MultiGeo> {
                        @Override // android.os.Parcelable.Creator
                        public final MultiGeo createFromParcel(Parcel parcel) {
                            return new MultiGeo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), NavigationController.Mode.valueOf(parcel.readString()), JobMultiGeoLink.FlowType.valueOf(parcel.readString()), SupportAddressMode.Mode.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(MultiGeo.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final MultiGeo[] newArray(int i12) {
                            return new MultiGeo[i12];
                        }
                    }

                    public MultiGeo(@k String str, @k String str2, @l Integer num, @k NavigationController.Mode mode, @k JobMultiGeoLink.FlowType flowType, @k SupportAddressMode.Mode mode2, @l DeepLink deepLink) {
                        super(null);
                        this.f307166b = str;
                        this.f307167c = str2;
                        this.f307168d = num;
                        this.f307169e = mode;
                        this.f307170f = flowType;
                        this.f307171g = mode2;
                        this.f307172h = deepLink;
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests
                    @l
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getF307179h() {
                        return this.f307172h;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MultiGeo)) {
                            return false;
                        }
                        MultiGeo multiGeo = (MultiGeo) obj;
                        return L.f(this.f307166b, multiGeo.f307166b) && L.f(this.f307167c, multiGeo.f307167c) && L.f(this.f307168d, multiGeo.f307168d) && this.f307169e == multiGeo.f307169e && this.f307170f == multiGeo.f307170f && this.f307171g == multiGeo.f307171g && L.f(this.f307172h, multiGeo.f307172h);
                    }

                    public final int hashCode() {
                        int iD2 = H.d(this.f307166b.hashCode() * 31, 31, this.f307167c);
                        Integer num = this.f307168d;
                        int iHashCode = (this.f307171g.hashCode() + ((this.f307170f.hashCode() + ((this.f307169e.hashCode() + ((iD2 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31)) * 31;
                        DeepLink deepLink = this.f307172h;
                        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MultiGeo(jwt=");
                        sb2.append(this.f307166b);
                        sb2.append(", address=");
                        sb2.append(this.f307167c);
                        sb2.append(", addressId=");
                        sb2.append(this.f307168d);
                        sb2.append(", navigationMode=");
                        sb2.append(this.f307169e);
                        sb2.append(", flowType=");
                        sb2.append(this.f307170f);
                        sb2.append(", mode=");
                        sb2.append(this.f307171g);
                        sb2.append(", successUrl=");
                        return com.avito.android.actions_sheet.a.v(sb2, this.f307172h, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.f307166b);
                        parcel.writeString(this.f307167c);
                        Integer num = this.f307168d;
                        if (num == null) {
                            parcel.writeInt(0);
                        } else {
                            com.avito.android.actions_sheet.a.C(parcel, 1, num);
                        }
                        parcel.writeString(this.f307169e.name());
                        parcel.writeString(this.f307170f.name());
                        parcel.writeString(this.f307171g.name());
                        parcel.writeParcelable(this.f307172h, i12);
                    }
                }

                public /* synthetic */ Suggests(C42822w c42822w) {
                    this();
                }

                @l
                /* renamed from: c */
                public abstract DeepLink getF307179h();

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$Create;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Create extends Suggests {

                    @k
                    public static final Parcelable.Creator<Create> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @l
                    public final String f307157b;

                    /* renamed from: c, reason: collision with root package name */
                    @k
                    public final SupportAddressMode.Mode f307158c;

                    /* renamed from: d, reason: collision with root package name */
                    @l
                    public final DeepLink f307159d;

                    /* renamed from: e, reason: collision with root package name */
                    public final boolean f307160e;

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Create> {
                        @Override // android.os.Parcelable.Creator
                        public final Create createFromParcel(Parcel parcel) {
                            return new Create(parcel.readString(), SupportAddressMode.Mode.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(Create.class.getClassLoader()), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Create[] newArray(int i12) {
                            return new Create[i12];
                        }
                    }

                    public /* synthetic */ Create(String str, SupportAddressMode.Mode mode, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
                        this(str, (i12 & 2) != 0 ? SupportAddressMode.Mode.f307183c : mode, deepLink, (i12 & 8) != 0 ? false : z12);
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests
                    @l
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getF307179h() {
                        return this.f307159d;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Create)) {
                            return false;
                        }
                        Create create = (Create) obj;
                        return L.f(this.f307157b, create.f307157b) && this.f307158c == create.f307158c && L.f(this.f307159d, create.f307159d) && this.f307160e == create.f307160e;
                    }

                    public final int hashCode() {
                        String str = this.f307157b;
                        int iHashCode = (this.f307158c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
                        DeepLink deepLink = this.f307159d;
                        return Boolean.hashCode(this.f307160e) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("Create(addressToSuggest=");
                        sb2.append(this.f307157b);
                        sb2.append(", mode=");
                        sb2.append(this.f307158c);
                        sb2.append(", successUrl=");
                        sb2.append(this.f307159d);
                        sb2.append(", realEstate=");
                        return r.x(sb2, this.f307160e, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.f307157b);
                        parcel.writeString(this.f307158c.name());
                        parcel.writeParcelable(this.f307159d, i12);
                        parcel.writeInt(this.f307160e ? 1 : 0);
                    }

                    public Create(@l String str, @k SupportAddressMode.Mode mode, @l DeepLink deepLink, boolean z12) {
                        super(null);
                        this.f307157b = str;
                        this.f307158c = mode;
                        this.f307159d = deepLink;
                        this.f307160e = z12;
                    }
                }

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$Edit;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Edit extends Suggests {

                    @k
                    public static final Parcelable.Creator<Edit> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    public final int f307161b;

                    /* renamed from: c, reason: collision with root package name */
                    @k
                    public final String f307162c;

                    /* renamed from: d, reason: collision with root package name */
                    @k
                    public final SupportAddressMode.Mode f307163d;

                    /* renamed from: e, reason: collision with root package name */
                    @l
                    public final DeepLink f307164e;

                    /* renamed from: f, reason: collision with root package name */
                    public final boolean f307165f;

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Edit> {
                        @Override // android.os.Parcelable.Creator
                        public final Edit createFromParcel(Parcel parcel) {
                            return new Edit(parcel.readInt(), parcel.readString(), SupportAddressMode.Mode.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(Edit.class.getClassLoader()), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Edit[] newArray(int i12) {
                            return new Edit[i12];
                        }
                    }

                    public /* synthetic */ Edit(int i12, String str, SupportAddressMode.Mode mode, DeepLink deepLink, boolean z12, int i13, C42822w c42822w) {
                        this(i12, str, (i13 & 4) != 0 ? SupportAddressMode.Mode.f307183c : mode, deepLink, z12);
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests
                    @l
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getF307179h() {
                        return this.f307164e;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Edit)) {
                            return false;
                        }
                        Edit edit = (Edit) obj;
                        return this.f307161b == edit.f307161b && L.f(this.f307162c, edit.f307162c) && this.f307163d == edit.f307163d && L.f(this.f307164e, edit.f307164e) && this.f307165f == edit.f307165f;
                    }

                    public final int hashCode() {
                        int iHashCode = (this.f307163d.hashCode() + H.d(Integer.hashCode(this.f307161b) * 31, 31, this.f307162c)) * 31;
                        DeepLink deepLink = this.f307164e;
                        return Boolean.hashCode(this.f307165f) + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("Edit(oldAddressId=");
                        sb2.append(this.f307161b);
                        sb2.append(", addressToSuggest=");
                        sb2.append(this.f307162c);
                        sb2.append(", mode=");
                        sb2.append(this.f307163d);
                        sb2.append(", successUrl=");
                        sb2.append(this.f307164e);
                        sb2.append(", enableDeleteAddress=");
                        return r.x(sb2, this.f307165f, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeInt(this.f307161b);
                        parcel.writeString(this.f307162c);
                        parcel.writeString(this.f307163d.name());
                        parcel.writeParcelable(this.f307164e, i12);
                        parcel.writeInt(this.f307165f ? 1 : 0);
                    }

                    public Edit(int i12, @k String str, @k SupportAddressMode.Mode mode, @l DeepLink deepLink, boolean z12) {
                        super(null);
                        this.f307161b = i12;
                        this.f307162c = str;
                        this.f307163d = mode;
                        this.f307164e = deepLink;
                        this.f307165f = z12;
                    }
                }

                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests$SellerAddressFlow;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Suggests;", "Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$Map$SellerFlow;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class SellerAddressFlow extends Suggests implements Map.SellerFlow {

                    @k
                    public static final Parcelable.Creator<SellerAddressFlow> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @l
                    public final String f307173b;

                    /* renamed from: c, reason: collision with root package name */
                    public final int f307174c;

                    /* renamed from: d, reason: collision with root package name */
                    @k
                    public final String f307175d;

                    /* renamed from: e, reason: collision with root package name */
                    @l
                    public final Integer f307176e;

                    /* renamed from: f, reason: collision with root package name */
                    @l
                    public final Boolean f307177f;

                    /* renamed from: g, reason: collision with root package name */
                    @k
                    public final SxAddAddressSource f307178g;

                    /* renamed from: h, reason: collision with root package name */
                    @l
                    public final DeepLink f307179h;

                    /* renamed from: i, reason: collision with root package name */
                    @k
                    public final SupportAddressMode.Mode f307180i;

                    /* renamed from: j, reason: collision with root package name */
                    @k
                    public final Map.SellerFlow.Flow f307181j;

                    /* compiled from: UserAddressActivity.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<SellerAddressFlow> {
                        @Override // android.os.Parcelable.Creator
                        public final SellerAddressFlow createFromParcel(Parcel parcel) {
                            Boolean boolValueOf;
                            String string = parcel.readString();
                            int i12 = parcel.readInt();
                            String string2 = parcel.readString();
                            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                            if (parcel.readInt() == 0) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            return new SellerAddressFlow(string, i12, string2, numValueOf, boolValueOf, SxAddAddressSource.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(SellerAddressFlow.class.getClassLoader()), SupportAddressMode.Mode.valueOf(parcel.readString()), Map.SellerFlow.Flow.valueOf(parcel.readString()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final SellerAddressFlow[] newArray(int i12) {
                            return new SellerAddressFlow[i12];
                        }
                    }

                    public /* synthetic */ SellerAddressFlow(String str, int i12, String str2, Integer num, Boolean bool, SxAddAddressSource sxAddAddressSource, DeepLink deepLink, SupportAddressMode.Mode mode, Map.SellerFlow.Flow flow, int i13, C42822w c42822w) {
                        this(str, i12, str2, num, bool, sxAddAddressSource, deepLink, (i13 & 128) != 0 ? SupportAddressMode.Mode.f307183c : mode, flow);
                    }

                    @Override // com.avito.android.user_address.UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Suggests
                    @l
                    /* renamed from: c, reason: from getter */
                    public final DeepLink getF307179h() {
                        return this.f307179h;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof SellerAddressFlow)) {
                            return false;
                        }
                        SellerAddressFlow sellerAddressFlow = (SellerAddressFlow) obj;
                        return L.f(this.f307173b, sellerAddressFlow.f307173b) && this.f307174c == sellerAddressFlow.f307174c && L.f(this.f307175d, sellerAddressFlow.f307175d) && L.f(this.f307176e, sellerAddressFlow.f307176e) && L.f(this.f307177f, sellerAddressFlow.f307177f) && this.f307178g == sellerAddressFlow.f307178g && L.f(this.f307179h, sellerAddressFlow.f307179h) && this.f307180i == sellerAddressFlow.f307180i && this.f307181j == sellerAddressFlow.f307181j;
                    }

                    public final int hashCode() {
                        String str = this.f307173b;
                        int iD2 = H.d(r.e(this.f307174c, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f307175d);
                        Integer num = this.f307176e;
                        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
                        Boolean bool = this.f307177f;
                        int iHashCode2 = (this.f307178g.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
                        DeepLink deepLink = this.f307179h;
                        return this.f307181j.hashCode() + ((this.f307180i.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31)) * 31);
                    }

                    @k
                    public final String toString() {
                        return "SellerAddressFlow(esid=" + this.f307173b + ", verticalId=" + this.f307174c + ", address=" + this.f307175d + ", addressId=" + this.f307176e + ", showsSuccessToast=" + this.f307177f + ", source=" + this.f307178g + ", successUrl=" + this.f307179h + ", mode=" + this.f307180i + ", flow=" + this.f307181j + ')';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.f307173b);
                        parcel.writeInt(this.f307174c);
                        parcel.writeString(this.f307175d);
                        Integer num = this.f307176e;
                        if (num == null) {
                            parcel.writeInt(0);
                        } else {
                            com.avito.android.actions_sheet.a.C(parcel, 1, num);
                        }
                        Boolean bool = this.f307177f;
                        if (bool == null) {
                            parcel.writeInt(0);
                        } else {
                            C0.l(parcel, 1, bool);
                        }
                        parcel.writeString(this.f307178g.name());
                        parcel.writeParcelable(this.f307179h, i12);
                        parcel.writeString(this.f307180i.name());
                        parcel.writeString(this.f307181j.name());
                    }

                    public SellerAddressFlow(@l String str, int i12, @k String str2, @l Integer num, @l Boolean bool, @k SxAddAddressSource sxAddAddressSource, @l DeepLink deepLink, @k SupportAddressMode.Mode mode, @k Map.SellerFlow.Flow flow) {
                        super(null);
                        this.f307173b = str;
                        this.f307174c = i12;
                        this.f307175d = str2;
                        this.f307176e = num;
                        this.f307177f = bool;
                        this.f307178g = sxAddAddressSource;
                        this.f307179h = deepLink;
                        this.f307180i = mode;
                        this.f307181j = flow;
                    }
                }

                public Suggests() {
                    super(null);
                }
            }

            /* compiled from: UserAddressActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$SupportAddressMode;", "", "Mode", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public interface SupportAddressMode {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: UserAddressActivity.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$FragmentsParams$SupportAddressMode$Mode;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Mode {

                    /* renamed from: b, reason: collision with root package name */
                    public static final Mode f307182b;

                    /* renamed from: c, reason: collision with root package name */
                    public static final Mode f307183c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final /* synthetic */ Mode[] f307184d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final /* synthetic */ kotlin.enums.a f307185e;

                    static {
                        Mode mode = new Mode("FULL", 0);
                        f307182b = mode;
                        Mode mode2 = new Mode("SHORT", 1);
                        f307183c = mode2;
                        Mode[] modeArr = {mode, mode2};
                        f307184d = modeArr;
                        f307185e = kotlin.enums.c.a(modeArr);
                    }

                    public Mode() {
                        throw null;
                    }

                    public static Mode valueOf(String str) {
                        return (Mode) Enum.valueOf(Mode.class, str);
                    }

                    public static Mode[] values() {
                        return (Mode[]) f307184d.clone();
                    }
                }
            }

            public /* synthetic */ FragmentsParams(C42822w c42822w) {
                this();
            }

            public FragmentsParams() {
            }
        }

        /* compiled from: UserAddressActivity.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$UserAddressActivityOpenParams$GeoSessionId;", "Landroid/os/Parcelable;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GeoSessionId implements Parcelable {

            @k
            public static final Parcelable.Creator<GeoSessionId> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f307186b;

            /* compiled from: UserAddressActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<GeoSessionId> {
                @Override // android.os.Parcelable.Creator
                public final GeoSessionId createFromParcel(Parcel parcel) {
                    return new GeoSessionId(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final GeoSessionId[] newArray(int i12) {
                    return new GeoSessionId[i12];
                }
            }

            public GeoSessionId(@k String str) {
                this.f307186b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GeoSessionId) && L.f(this.f307186b, ((GeoSessionId) obj).f307186b);
            }

            public final int hashCode() {
                return this.f307186b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("GeoSessionId(geoX="), this.f307186b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f307186b);
            }
        }

        /* compiled from: UserAddressActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UserAddressActivityOpenParams> {
            @Override // android.os.Parcelable.Creator
            public final UserAddressActivityOpenParams createFromParcel(Parcel parcel) {
                return new UserAddressActivityOpenParams(parcel.readInt() == 0 ? null : GeoSessionId.CREATOR.createFromParcel(parcel), (FragmentsParams) parcel.readParcelable(UserAddressActivityOpenParams.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final UserAddressActivityOpenParams[] newArray(int i12) {
                return new UserAddressActivityOpenParams[i12];
            }
        }

        public UserAddressActivityOpenParams(@l GeoSessionId geoSessionId, @k FragmentsParams fragmentsParams) {
            this.f307106b = geoSessionId;
            this.f307107c = fragmentsParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserAddressActivityOpenParams)) {
                return false;
            }
            UserAddressActivityOpenParams userAddressActivityOpenParams = (UserAddressActivityOpenParams) obj;
            return L.f(this.f307106b, userAddressActivityOpenParams.f307106b) && L.f(this.f307107c, userAddressActivityOpenParams.f307107c);
        }

        public final int hashCode() {
            GeoSessionId geoSessionId = this.f307106b;
            return this.f307107c.hashCode() + ((geoSessionId == null ? 0 : geoSessionId.f307186b.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "UserAddressActivityOpenParams(geoSessionId=" + this.f307106b + ", fragmentsParams=" + this.f307107c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            GeoSessionId geoSessionId = this.f307106b;
            if (geoSessionId == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                geoSessionId.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f307107c, i12);
        }
    }

    /* compiled from: UserAddressActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/UserAddressActivity$a;", "", "<init>", "()V", "", "SUCCESS_URL_EXTRA", "Ljava/lang/String;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static Intent a(@k Context context, @k UserAddressActivityOpenParams userAddressActivityOpenParams, @l DeepLink deepLink) {
            Intent intent = new Intent(context, (Class<?>) UserAddressActivity.class);
            if (deepLink != null) {
                intent.putExtra("success_url_extra", deepLink);
            }
            C35961v3.b(intent, userAddressActivityOpenParams);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, UserAddressActivityOpenParams userAddressActivityOpenParams) {
            aVar.getClass();
            return a(context, userAddressActivityOpenParams, null);
        }

        public a() {
        }
    }

    /* compiled from: UserAddressActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            UserAddressActivity.this.finish();
            return G0.f406611a;
        }
    }

    /* compiled from: UserAddressActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            UserAddressActivity.this.finish();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.user_address.g
    public final void D(int i12, @k String str, @l DeepLink deepLink, boolean z12) {
        this.f307105o.c(new UserAddressActivityOpenParams.FragmentsParams.Suggests.Edit(i12, str, UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307182b, deepLink, z12), false);
    }

    @Override // com.avito.android.user_address.g
    public final void K() {
        NavigationController navigationController = this.f307105o;
        FragmentManager fragmentManager = navigationController.f307095a;
        if (fragmentManager.P().size() <= 1) {
            ((b) navigationController.f307097c).invoke();
            return;
        }
        androidx.fragment.app.H hE2 = fragmentManager.e();
        hE2.m((Fragment) C42745f0.Q(fragmentManager.P()));
        hE2.e();
    }

    @Override // com.avito.android.user_address.g
    public final void M(@l String str, int i12, @k String str2, @l Boolean bool) {
        Integer num = null;
        this.f307105o.c(new UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow(str, i12, str2, num, bool, SxAddAddressSource.f67543b, null, null, UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.f307148c, 128, null), true);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.user_address.g
    public final void O() {
        NavigationController navigationController = this.f307105o;
        FragmentManager fragmentManager = navigationController.f307095a;
        Fragment fragment = (Fragment) C42745f0.E(fragmentManager.P());
        boolean zF2 = L.f(fragment.getTag(), "UserAddressListFragment");
        androidx.fragment.app.H hE2 = fragmentManager.e();
        if (zF2) {
            hE2.n(R.id.fragment_container, fragment, "UserAddressListFragment");
        } else {
            ((b) navigationController.f307097c).invoke();
        }
        hE2.e();
    }

    @Override // com.avito.android.user_address.g
    public final void Q(@l UserAddressLink.Result.Success success) {
        Intent intent = new Intent();
        intent.putExtra("result.user_address", success);
        G0 g02 = G0.f406611a;
        setResult(-1, intent);
    }

    @Override // com.avito.android.user_address.g
    public final void U(int i12, @l String str, @k String str2) {
        Integer num = null;
        this.f307105o.c(new UserAddressActivityOpenParams.FragmentsParams.Suggests.SellerAddressFlow(str, i12, str2, num, Boolean.TRUE, SxAddAddressSource.f67543b, null, null, UserAddressActivityOpenParams.FragmentsParams.Map.SellerFlow.Flow.f307147b, 128, null), true);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        UserAddressActivityOpenParams.GeoSessionId geoSessionId = ((UserAddressActivityOpenParams) C35961v3.a(this).getValue()).f307106b;
        String string = geoSessionId != null ? geoSessionId.f307186b : null;
        if (string == null || C43066x.K(string)) {
            string = UUID.randomUUID().toString();
        }
        com.avito.android.user_address.di.b bVarA = com.avito.android.user_address.di.a.a().a((com.avito.android.user_address.di.c) C29972i.a(C29972i.b(this), com.avito.android.user_address.di.c.class), this, getResources(), string);
        this.f307104n = bVarA;
        bVarA.b(this);
    }

    @Override // com.avito.android.user_address.g
    public final void Z0() {
        ParametrizedEvent parametrizedEvent = null;
        int i12 = 4;
        b.a.a(cv.c.a(this).u4(), new WebViewLink.OnlyAvitoDomain(Uri.parse("https://www.avito.ru/legal/rules/privacy-policy"), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), parametrizedEvent, i12, null), null, null, 6);
    }

    @Override // com.avito.android.user_address.g
    public final void o1(@l String str, @k UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode, @l DeepLink deepLink) {
        this.f307105o.c(new UserAddressActivityOpenParams.FragmentsParams.Suggests.Create(str, mode, deepLink, false, 8, null), false);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        InterfaceC23487e interfaceC23487ePrevious;
        List<Fragment> listP = getSupportFragmentManager().P();
        ListIterator<Fragment> listIterator = listP.listIterator(listP.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                interfaceC23487ePrevious = null;
                break;
            } else {
                interfaceC23487ePrevious = listIterator.previous();
                if (((Fragment) interfaceC23487ePrevious) instanceof com.avito.android.ui.fragments.c) {
                    break;
                }
            }
        }
        InterfaceC23487e interfaceC23487e = (Fragment) interfaceC23487ePrevious;
        if (interfaceC23487e == null || !((com.avito.android.ui.fragments.c) interfaceC23487e).i0()) {
            super.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            UserAddressActivityOpenParams.FragmentsParams fragmentsParams = ((UserAddressActivityOpenParams) C35961v3.a(this).getValue()).f307107c;
            boolean z12 = fragmentsParams instanceof UserAddressActivityOpenParams.FragmentsParams.Suggests;
            NavigationController navigationController = this.f307105o;
            if (z12) {
                navigationController.c((UserAddressActivityOpenParams.FragmentsParams.Suggests) fragmentsParams, false);
            } else if (fragmentsParams instanceof UserAddressActivityOpenParams.FragmentsParams.Map) {
                navigationController.b((UserAddressActivityOpenParams.FragmentsParams.Map) fragmentsParams);
            } else if (fragmentsParams instanceof UserAddressActivityOpenParams.FragmentsParams.List) {
                navigationController.a((UserAddressActivityOpenParams.FragmentsParams.List) fragmentsParams);
            }
            com.avito.android.ui.fragments.e.b(this, getSupportFragmentManager(), new c());
        }
    }

    @Override // com.avito.android.user_address.g
    public final void q1() {
        this.f307105o.f307097c.invoke();
    }

    @Override // md.InterfaceC44055a
    public final com.avito.android.user_address.di.b r0() {
        com.avito.android.user_address.di.b bVar = this.f307104n;
        if (bVar == null) {
            return null;
        }
        return bVar;
    }

    @Override // com.avito.android.user_address.g
    public final void v0(@k String str, @k String str2, @l Integer num, @k NavigationController.Mode mode, @k JobMultiGeoLink.FlowType flowType, @l DeepLink deepLink) {
        this.f307105o.c(new UserAddressActivityOpenParams.FragmentsParams.Suggests.MultiGeo(str, str2, num, mode, flowType, UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode.f307183c, deepLink), false);
    }

    @Override // com.avito.android.user_address.g
    public final void x1(@l String str, long j12, long j13, @l Boolean bool, @k SxAddAddressSource sxAddAddressSource) {
        InterfaceC50095c interfaceC50095c = this.f307103m;
        if (interfaceC50095c == null) {
            interfaceC50095c = null;
        }
        NavigationController navigationController = this.f307105o;
        navigationController.getClass();
        Intent intentF = interfaceC50095c.f(this, str, j12, j13, bool, sxAddAddressSource);
        intentF.addFlags(1073741824);
        navigationController.f307096b.R(intentF, com.avito.android.deeplink_handler.view.b.f134588l);
    }

    @Override // com.avito.android.user_address.g
    public final void z(@k UserAddressActivityOpenParams.FragmentsParams.Map map) {
        UserAddressActivityOpenParams.FragmentsParams.Map sellerAddressFlow;
        DeepLink deepLink = (DeepLink) getIntent().getParcelableExtra("success_url_extra");
        if (map instanceof UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress) {
            UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress byAddress = (UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress) map;
            sellerAddressFlow = new UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ByAddress(byAddress.f307111b, byAddress.f307112c, byAddress.f307113d, deepLink, byAddress.f307115f, byAddress.f307116g);
        } else if (map instanceof UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) {
            UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById byId = (UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById) map;
            sellerAddressFlow = new UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.ById(byId.f307117b, deepLink, byId.f307119d, byId.f307120e);
        } else if (map instanceof UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) {
            UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest bySuggest = (UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest) map;
            sellerAddressFlow = new UserAddressActivityOpenParams.FragmentsParams.Map.FullAddress.BySuggest(bySuggest.f307121b, bySuggest.f307122c, bySuggest.f307123d, bySuggest.f307124e, deepLink, bySuggest.f307126g, bySuggest.f307127h);
        } else if (map instanceof UserAddressActivityOpenParams.FragmentsParams.Map.Short) {
            UserAddressActivityOpenParams.FragmentsParams.Map.Short r02 = (UserAddressActivityOpenParams.FragmentsParams.Map.Short) map;
            sellerAddressFlow = new UserAddressActivityOpenParams.FragmentsParams.Map.Short(r02.f307151b, r02.f307152c, r02.f307153d, deepLink, r02.f307155f, r02.f307156g);
        } else if (map instanceof UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) {
            UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo multiGeo = (UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo) map;
            sellerAddressFlow = new UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo(multiGeo.f307128b, multiGeo.f307129c, multiGeo.f307130d, multiGeo.f307131e, multiGeo.f307132f, multiGeo.f307133g, multiGeo.f307134h, deepLink);
        } else {
            if (!(map instanceof UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow)) {
                throw new NoWhenBranchMatchedException();
            }
            UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow sellerAddressFlow2 = (UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow) map;
            sellerAddressFlow = new UserAddressActivityOpenParams.FragmentsParams.Map.SellerAddressFlow(sellerAddressFlow2.f307136b, sellerAddressFlow2.f307137c, sellerAddressFlow2.f307138d, sellerAddressFlow2.f307139e, sellerAddressFlow2.f307140f, sellerAddressFlow2.f307141g, sellerAddressFlow2.f307142h, sellerAddressFlow2.f307143i, sellerAddressFlow2.f307144j, deepLink, sellerAddressFlow2.f307146l);
        }
        this.f307105o.b(sellerAddressFlow);
    }

    @Override // com.avito.android.user_address.g
    public final void z0(@l UserAddressLink.Result.Success success, @k UserAddressActivityOpenParams.FragmentsParams.SupportAddressMode.Mode mode) {
        this.f307105o.a(new UserAddressActivityOpenParams.FragmentsParams.List(success, null, mode));
    }
}

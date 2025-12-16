package com.avito.android.user_address.map.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.user_address.map.domain.SellerAddNewAddressData;
import kotlin.Metadata;

/* compiled from: UserAddressMapMviOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lcom/avito/android/user_address/map/mvi/Z$a;", "Lcom/avito/android/user_address/map/mvi/Z$b;", "Lcom/avito/android/user_address/map/mvi/Z$c;", "Lcom/avito/android/user_address/map/mvi/Z$d;", "Lcom/avito/android/user_address/map/mvi/Z$e;", "Lcom/avito/android/user_address/map/mvi/Z$f;", "Lcom/avito/android/user_address/map/mvi/Z$g;", "Lcom/avito/android/user_address/map/mvi/Z$h;", "Lcom/avito/android/user_address/map/mvi/Z$i;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Z {

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$a;", "Lcom/avito/android/user_address/map/mvi/Z;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Z {
        static {
            new a();
        }
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$b;", "Lcom/avito/android/user_address/map/mvi/Z;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f307818a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307819b;

        public b(@Y61.k String str, @Y61.k String str2) {
            this.f307818a = str;
            this.f307819b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f307818a, bVar.f307818a) && kotlin.jvm.internal.L.f(this.f307819b, bVar.f307819b);
        }

        public final int hashCode() {
            return this.f307819b.hashCode() + (this.f307818a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToSuggest(geoX=");
            sb2.append(this.f307818a);
            sb2.append(", address=");
            return C22026a.c(sb2, this.f307819b, ')');
        }
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$c;", "Lcom/avito/android/user_address/map/mvi/Z;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f307820a = new c();
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$d;", "Lcom/avito/android/user_address/map/mvi/Z;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements Z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SellerAddNewAddressData f307821a;

        public d(@Y61.k SellerAddNewAddressData sellerAddNewAddressData) {
            this.f307821a = sellerAddNewAddressData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.L.f(this.f307821a, ((d) obj).f307821a);
        }

        public final int hashCode() {
            return this.f307821a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ProceedSellerAddAddressSuccess(data=" + this.f307821a + ')';
        }
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$e;", "Lcom/avito/android/user_address/map/mvi/Z;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements Z {

        /* renamed from: a, reason: collision with root package name */
        public final int f307822a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307823b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f307824c;

        public e(int i12, @Y61.k String str, @Y61.l String str2) {
            this.f307822a = i12;
            this.f307823b = str;
            this.f307824c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f307822a == eVar.f307822a && kotlin.jvm.internal.L.f(this.f307823b, eVar.f307823b) && kotlin.jvm.internal.L.f(this.f307824c, eVar.f307824c);
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(Integer.hashCode(this.f307822a) * 31, 31, this.f307823b);
            String str = this.f307824c;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProceedSuccessDelete(addressId=");
            sb2.append(this.f307822a);
            sb2.append(", address=");
            sb2.append(this.f307823b);
            sb2.append(", addressKind=");
            return C22026a.c(sb2, this.f307824c, ')');
        }
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$f;", "Lcom/avito/android/user_address/map/mvi/Z;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements Z {

        /* renamed from: a, reason: collision with root package name */
        public final int f307825a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f307826b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f307827c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f307828d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f307829e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Double f307830f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Double f307831g;

        public f(int i12, @Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Double d12, @Y61.l Double d13) {
            this.f307825a = i12;
            this.f307826b = num;
            this.f307827c = str;
            this.f307828d = str2;
            this.f307829e = str3;
            this.f307830f = d12;
            this.f307831g = d13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f307825a == fVar.f307825a && kotlin.jvm.internal.L.f(this.f307826b, fVar.f307826b) && kotlin.jvm.internal.L.f(this.f307827c, fVar.f307827c) && kotlin.jvm.internal.L.f(this.f307828d, fVar.f307828d) && kotlin.jvm.internal.L.f(this.f307829e, fVar.f307829e) && kotlin.jvm.internal.L.f(this.f307830f, fVar.f307830f) && kotlin.jvm.internal.L.f(this.f307831g, fVar.f307831g);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f307825a) * 31;
            Integer num = this.f307826b;
            int iD2 = androidx.compose.foundation.H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f307827c);
            String str = this.f307828d;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f307829e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d12 = this.f307830f;
            int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f307831g;
            return iHashCode4 + (d13 != null ? d13.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProceedSuccessSave(addressId=");
            sb2.append(this.f307825a);
            sb2.append(", locationId=");
            sb2.append(this.f307826b);
            sb2.append(", address=");
            sb2.append(this.f307827c);
            sb2.append(", addressKind=");
            sb2.append(this.f307828d);
            sb2.append(", jwt=");
            sb2.append(this.f307829e);
            sb2.append(", longitude=");
            sb2.append(this.f307830f);
            sb2.append(", latitude=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f307831g, ')');
        }
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$g;", "Lcom/avito/android/user_address/map/mvi/Z;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements Z {

        /* renamed from: a, reason: collision with root package name */
        public final int f307832a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f307833b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f307834c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f307835d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f307836e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Double f307837f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Double f307838g;

        public g(int i12, @Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Double d12, @Y61.l Double d13) {
            this.f307832a = i12;
            this.f307833b = num;
            this.f307834c = str;
            this.f307835d = str2;
            this.f307836e = str3;
            this.f307837f = d12;
            this.f307838g = d13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f307832a == gVar.f307832a && kotlin.jvm.internal.L.f(this.f307833b, gVar.f307833b) && kotlin.jvm.internal.L.f(this.f307834c, gVar.f307834c) && kotlin.jvm.internal.L.f(this.f307835d, gVar.f307835d) && kotlin.jvm.internal.L.f(this.f307836e, gVar.f307836e) && kotlin.jvm.internal.L.f(this.f307837f, gVar.f307837f) && kotlin.jvm.internal.L.f(this.f307838g, gVar.f307838g);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f307832a) * 31;
            Integer num = this.f307833b;
            int iD2 = androidx.compose.foundation.H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f307834c);
            String str = this.f307835d;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f307836e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d12 = this.f307837f;
            int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f307838g;
            return iHashCode4 + (d13 != null ? d13.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProceedSuccessUpdate(addressId=");
            sb2.append(this.f307832a);
            sb2.append(", locationId=");
            sb2.append(this.f307833b);
            sb2.append(", address=");
            sb2.append(this.f307834c);
            sb2.append(", addressKind=");
            sb2.append(this.f307835d);
            sb2.append(", jwt=");
            sb2.append(this.f307836e);
            sb2.append(", longitude=");
            sb2.append(this.f307837f);
            sb2.append(", latitude=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f307838g, ')');
        }
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$h;", "Lcom/avito/android/user_address/map/mvi/Z;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements Z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f307839a = new h();
    }

    /* compiled from: UserAddressMapMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/Z$i;", "Lcom/avito/android/user_address/map/mvi/Z;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements Z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f307840a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f307841b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f307842c;

        public i(@Y61.k com.avito.android.component.toast.f fVar, @Y61.k String str, boolean z12) {
            this.f307840a = str;
            this.f307841b = z12;
            this.f307842c = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.L.f(this.f307840a, iVar.f307840a) && this.f307841b == iVar.f307841b && kotlin.jvm.internal.L.f(this.f307842c, iVar.f307842c);
        }

        public final int hashCode() {
            return this.f307842c.hashCode() + androidx.appcompat.app.r.i(this.f307840a.hashCode() * 31, 31, this.f307841b);
        }

        @Y61.k
        public final String toString() {
            return "ShowToastBar(text=" + this.f307840a + ", anchorToBottom=" + this.f307841b + ", toastBarType=" + this.f307842c + ')';
        }
    }
}

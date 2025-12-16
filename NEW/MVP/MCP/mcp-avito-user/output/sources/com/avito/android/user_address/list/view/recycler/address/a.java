package com.avito.android.user_address.list.view.recycler.address;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressListItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/list/view/recycler/address/a;", "Lcom/avito/conveyor_item/a;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f307456b;

    /* renamed from: c, reason: collision with root package name */
    public final int f307457c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f307458d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f307459e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C9447a f307460f;

    /* compiled from: AddressListItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/view/recycler/address/a$a;", "", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_address.list.view.recycler.address.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9447a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f307461a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f307462b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f307463c;

        public C9447a(@k String str, @l String str2, @l String str3) {
            this.f307461a = str;
            this.f307462b = str2;
            this.f307463c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9447a)) {
                return false;
            }
            C9447a c9447a = (C9447a) obj;
            return L.f(this.f307461a, c9447a.f307461a) && L.f(this.f307462b, c9447a.f307462b) && L.f(this.f307463c, c9447a.f307463c);
        }

        public final int hashCode() {
            int iHashCode = this.f307461a.hashCode() * 31;
            String str = this.f307462b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f307463c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Description(location=");
            sb2.append(this.f307461a);
            sb2.append(", house=");
            sb2.append(this.f307462b);
            sb2.append(", details=");
            return C22026a.c(sb2, this.f307463c, ')');
        }
    }

    public a(@k String str, int i12, boolean z12, @l String str2, @k C9447a c9447a) {
        this.f307456b = str;
        this.f307457c = i12;
        this.f307458d = z12;
        this.f307459e = str2;
        this.f307460f = c9447a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f307456b, aVar.f307456b) && this.f307457c == aVar.f307457c && this.f307458d == aVar.f307458d && L.f(this.f307459e, aVar.f307459e) && L.f(this.f307460f, aVar.f307460f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF300713b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF300713b() {
        return this.f307456b;
    }

    public final int hashCode() {
        int i12 = r.i(r.e(this.f307457c, this.f307456b.hashCode() * 31, 31), 31, this.f307458d);
        String str = this.f307459e;
        return this.f307460f.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "AddressListItem(stringId=" + this.f307456b + ", addressId=" + this.f307457c + ", isDefault=" + this.f307458d + ", kind=" + this.f307459e + ", description=" + this.f307460f + ')';
    }
}

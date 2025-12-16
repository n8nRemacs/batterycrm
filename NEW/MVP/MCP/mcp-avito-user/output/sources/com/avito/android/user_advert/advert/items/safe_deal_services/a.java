package com.avito.android.user_advert.advert.items.safe_deal_services;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SafeDealServiceItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/a$a;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/a$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: SafeDealServiceItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/a$a;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.items.safe_deal_services.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9501a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f310025a;

        /* renamed from: b, reason: collision with root package name */
        public final int f310026b;

        public C9501a() {
            super(null);
            this.f310025a = R.attr.ic_deliveryOutline24;
            this.f310026b = R.attr.black;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9501a)) {
                return false;
            }
            C9501a c9501a = (C9501a) obj;
            return this.f310025a == c9501a.f310025a && this.f310026b == c9501a.f310026b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f310026b) + (Integer.hashCode(this.f310025a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Attr(id=");
            sb2.append(this.f310025a);
            sb2.append(", color=");
            return r.t(sb2, this.f310026b, ')');
        }
    }

    /* compiled from: SafeDealServiceItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/a$b;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f310027a;

        public b(@InterfaceC42165v int i12) {
            super(null);
            this.f310027a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f310027a == ((b) obj).f310027a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f310027a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Res(id="), this.f310027a, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}

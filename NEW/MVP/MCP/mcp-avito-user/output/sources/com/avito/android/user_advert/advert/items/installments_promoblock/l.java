package com.avito.android.user_advert.advert.items.installments_promoblock;

import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsPromoBlockItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/l;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/l$a;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/l$b;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/l$c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class l {

    /* compiled from: InstallmentsPromoBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/l$a;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ParametrizedClickStreamEvent f309536a;

        public a(@Y61.l ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
            super(null);
            this.f309536a = parametrizedClickStreamEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f309536a, ((a) obj).f309536a);
        }

        public final int hashCode() {
            ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f309536a;
            if (parametrizedClickStreamEvent == null) {
                return 0;
            }
            return parametrizedClickStreamEvent.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LogEventAction(event=" + this.f309536a + ')';
        }
    }

    /* compiled from: InstallmentsPromoBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/l$b;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f309537a;

        public b(@Y61.l DeepLink deepLink) {
            super(null);
            this.f309537a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f309537a, ((b) obj).f309537a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f309537a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenLinkSwitcherAction(deeplink="), this.f309537a, ')');
        }
    }

    /* compiled from: InstallmentsPromoBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/l$c;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f309538a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Map<String, Object> f309539b;

        public c(@Y61.l String str, @Y61.l Map<String, ? extends Object> map) {
            super(null);
            this.f309538a = str;
            this.f309539b = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f309538a, cVar.f309538a) && L.f(this.f309539b, cVar.f309539b);
        }

        public final int hashCode() {
            String str = this.f309538a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Map<String, Object> map = this.f309539b;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleSwitcherAction(requestUrl=");
            sb2.append(this.f309538a);
            sb2.append(", paramsMap=");
            return r.w(sb2, this.f309539b, ')');
        }
    }

    public /* synthetic */ l(C42822w c42822w) {
        this();
    }

    public l() {
    }
}

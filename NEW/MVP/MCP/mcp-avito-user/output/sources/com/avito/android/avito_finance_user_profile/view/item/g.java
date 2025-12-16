package com.avito.android.avito_finance_user_profile.view.item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceItemAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/g;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/avito_finance_user_profile/view/item/g$a;", "Lcom/avito/android/avito_finance_user_profile/view/item/g$b;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class g {

    /* compiled from: AvitoFinanceItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/g$a;", "Lcom/avito/android/avito_finance_user_profile/view/item/g;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f98003a;

        public a(@k DeepLink deepLink) {
            super(null);
            this.f98003a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f98003a, ((a) obj).f98003a);
        }

        public final int hashCode() {
            return this.f98003a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f98003a, ')');
        }
    }

    /* compiled from: AvitoFinanceItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/item/g$b;", "Lcom/avito/android/avito_finance_user_profile/view/item/g;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final long f98004a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Map<String, Object> f98005b;

        /* renamed from: c, reason: collision with root package name */
        public final long f98006c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f98007d;

        public b(long j12, @l Map<String, ? extends Object> map, long j13, @l Boolean bool) {
            super(null);
            this.f98004a = j12;
            this.f98005b = map;
            this.f98006c = j13;
            this.f98007d = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f98004a == bVar.f98004a && L.f(this.f98005b, bVar.f98005b) && this.f98006c == bVar.f98006c && L.f(this.f98007d, bVar.f98007d);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f98004a) * 31;
            Map<String, Object> map = this.f98005b;
            int iG2 = r.g((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.f98006c);
            Boolean bool = this.f98007d;
            return iG2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendEvent(id=");
            sb2.append(this.f98004a);
            sb2.append(", params=");
            sb2.append(this.f98005b);
            sb2.append(", version=");
            sb2.append(this.f98006c);
            sb2.append(", hasSensitiveData=");
            return C0.g(sb2, this.f98007d, ')');
        }
    }

    public /* synthetic */ g(C42822w c42822w) {
        this();
    }

    public g() {
    }
}

package eJ0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertsListNextPageDomain;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsListResultDomain.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LeJ0/b;", "", "a", "b", "LeJ0/b$a;", "LeJ0/b$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eJ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC40015b {

    /* compiled from: UserAdvertsListResultDomain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeJ0/b$a;", "LeJ0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eJ0.b$a */
    public static final /* data */ class a implements InterfaceC40015b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f395102a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f395103b;

        public a(@k ApiError apiError, @l Throwable th2) {
            this.f395102a = apiError;
            this.f395103b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f395102a, aVar.f395102a) && L.f(this.f395103b, aVar.f395103b);
        }

        public final int hashCode() {
            int iHashCode = this.f395102a.hashCode() * 31;
            Throwable th2 = this.f395103b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.f395102a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f395103b, ')');
        }
    }

    /* compiled from: UserAdvertsListResultDomain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeJ0/b$b;", "LeJ0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eJ0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11066b implements InterfaceC40015b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f395104a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsListNextPageDomain f395105b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f395106c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UserAdvertActionsInfoDomain f395107d;

        public C11066b(@k ArrayList arrayList, @k UserAdvertsListNextPageDomain userAdvertsListNextPageDomain, @l Integer num, @l UserAdvertActionsInfoDomain userAdvertActionsInfoDomain) {
            this.f395104a = arrayList;
            this.f395105b = userAdvertsListNextPageDomain;
            this.f395106c = num;
            this.f395107d = userAdvertActionsInfoDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11066b)) {
                return false;
            }
            C11066b c11066b = (C11066b) obj;
            return this.f395104a.equals(c11066b.f395104a) && L.f(this.f395105b, c11066b.f395105b) && L.f(this.f395106c, c11066b.f395106c) && L.f(this.f395107d, c11066b.f395107d);
        }

        public final int hashCode() {
            int iHashCode = (this.f395105b.hashCode() + (this.f395104a.hashCode() * 31)) * 31;
            Integer num = this.f395106c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = this.f395107d;
            return iHashCode2 + (userAdvertActionsInfoDomain != null ? userAdvertActionsInfoDomain.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Success(list=" + this.f395104a + ", nextPage=" + this.f395105b + ", totalCount=" + this.f395106c + ", actionsInfo=" + this.f395107d + ')';
        }
    }
}

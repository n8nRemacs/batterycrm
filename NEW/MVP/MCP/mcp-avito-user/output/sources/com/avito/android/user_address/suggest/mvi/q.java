package com.avito.android.user_address.suggest.mvi;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.geo_common.model.CoordsByAddressResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAddressSuggestMviOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/q;", "", "a", "b", "c", "d", "Lcom/avito/android/user_address/suggest/mvi/q$a;", "Lcom/avito/android/user_address/suggest/mvi/q$b;", "Lcom/avito/android/user_address/suggest/mvi/q$c;", "Lcom/avito/android/user_address/suggest/mvi/q$d;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface q {

    /* compiled from: UserAddressSuggestMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/q$a;", "Lcom/avito/android/user_address/suggest/mvi/q;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f308145a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f308146b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final CoordsByAddressResult.Point f308147c;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k CoordsByAddressResult.Point point) {
            this.f308145a = str;
            this.f308146b = str2;
            this.f308147c = point;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f308145a, aVar.f308145a) && L.f(this.f308146b, aVar.f308146b) && L.f(this.f308147c, aVar.f308147c);
        }

        public final int hashCode() {
            return this.f308147c.hashCode() + H.d(this.f308145a.hashCode() * 31, 31, this.f308146b);
        }

        @Y61.k
        public final String toString() {
            return "NavigateToMap(geoX=" + this.f308145a + ", address=" + this.f308146b + ", point=" + this.f308147c + ')';
        }
    }

    /* compiled from: UserAddressSuggestMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/q$b;", "Lcom/avito/android/user_address/suggest/mvi/q;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f308148a;

        public b(@Y61.k String str) {
            this.f308148a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f308148a, ((b) obj).f308148a);
        }

        public final int hashCode() {
            return this.f308148a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetInput(query="), this.f308148a, ')');
        }
    }

    /* compiled from: UserAddressSuggestMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/q$c;", "Lcom/avito/android/user_address/suggest/mvi/q;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f308149a = new c();
    }

    /* compiled from: UserAddressSuggestMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/q$d;", "Lcom/avito/android/user_address/suggest/mvi/q;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f308150a = new d();
    }
}

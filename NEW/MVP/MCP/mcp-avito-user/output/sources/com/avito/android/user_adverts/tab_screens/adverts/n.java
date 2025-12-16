package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.deep_linking.links.MyAdvertDetailsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsListResultListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/n;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface n {

    /* compiled from: UserAdvertsListResultListener.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/n$a;", "", "a", "b", "Lcom/avito/android/user_adverts/tab_screens/adverts/n$a$a;", "Lcom/avito/android/user_adverts/tab_screens/adverts/n$a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertsListResultListener.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/n$a$a;", "Lcom/avito/android/user_adverts/tab_screens/adverts/n$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.n$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9775a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MyAdvertDetailsResult f315528a;

            public C9775a(@Y61.k MyAdvertDetailsResult myAdvertDetailsResult) {
                this.f315528a = myAdvertDetailsResult;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9775a) && L.f(this.f315528a, ((C9775a) obj).f315528a);
            }

            public final int hashCode() {
                return this.f315528a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "AdvertDetailsResult(result=" + this.f315528a + ')';
            }
        }

        /* compiled from: UserAdvertsListResultListener.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/n$a$b;", "Lcom/avito/android/user_adverts/tab_screens/adverts/n$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f315529a;

            public b(@Y61.l String str) {
                this.f315529a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    return L.f(this.f315529a, ((b) obj).f315529a);
                }
                return false;
            }

            public final int hashCode() {
                String str = this.f315529a;
                return Boolean.hashCode(true) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                return AK.c.s(new StringBuilder("AdvertStatusChanged(statusMessage="), this.f315529a, ", updateContents=true)");
            }
        }
    }

    void a(@Y61.k a aVar);
}

package com.avito.android.user_adverts_filters.host;

import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.appcompat.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/d;", "", "a", "b", "_avito_user-adverts-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: UserAdvertsFiltersIntentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/d$a;", "", "_avito_user-adverts-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<String, Object> f315958a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f315959b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public a(@k Map<String, ? extends Object> map, @l String str) {
            this.f315958a = map;
            this.f315959b = str;
        }

        public /* synthetic */ a(Map map, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? P0.c() : map, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: UserAdvertsFiltersIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/d$b;", "", "a", "b", "Lcom/avito/android/user_adverts_filters/host/d$b$a;", "Lcom/avito/android/user_adverts_filters/host/d$b$b;", "_avito_user-adverts-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: UserAdvertsFiltersIntentFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/d$b$a;", "Lcom/avito/android/user_adverts_filters/host/d$b;", "_avito_user-adverts-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Map<String, Object> f315960a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Map<String, Object> f315961b;

            public a(@k Map<String, ? extends Object> map, @k Map<String, ? extends Object> map2) {
                this.f315960a = map;
                this.f315961b = map2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f315960a, aVar.f315960a) && L.f(this.f315961b, aVar.f315961b);
            }

            public final int hashCode() {
                return this.f315961b.hashCode() + (this.f315960a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AppliedFilters(filterParams=");
                sb2.append(this.f315960a);
                sb2.append(", defaultFiltersParams=");
                return r.w(sb2, this.f315961b, ')');
            }
        }

        /* compiled from: UserAdvertsFiltersIntentFactory.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/d$b$b;", "Lcom/avito/android/user_adverts_filters/host/d$b;", "<init>", "()V", "_avito_user-adverts-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts_filters.host.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9797b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C9797b f315962a = new C9797b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C9797b);
            }

            public final int hashCode() {
                return 802613145;
            }

            @k
            public final String toString() {
                return "Canceled";
            }
        }
    }

    @k
    Intent a(@k a aVar);

    @k
    b b(int i12, @l Intent intent);
}

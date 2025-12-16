package rJ0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MainFiltersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LrJ0/b;", "", "a", "b", "c", "d", "LrJ0/b$a;", "LrJ0/b$b;", "LrJ0/b$c;", "LrJ0/b$d;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rJ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47555b {

    /* compiled from: MainFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrJ0/b$a;", "LrJ0/b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rJ0.b$a */
    public static final /* data */ class a implements InterfaceC47555b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429736a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1496859643;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: MainFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrJ0/b$b;", "LrJ0/b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rJ0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12369b implements InterfaceC47555b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertsFiltersData f429737a;

        public C12369b(@k UserAdvertsFiltersData userAdvertsFiltersData) {
            this.f429737a = userAdvertsFiltersData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12369b) && L.f(this.f429737a, ((C12369b) obj).f429737a);
        }

        public final int hashCode() {
            return this.f429737a.hashCode();
        }

        @k
        public final String toString() {
            return "FiltersApplied(filtersData=" + this.f429737a + ')';
        }
    }

    /* compiled from: MainFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrJ0/b$c;", "LrJ0/b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rJ0.b$c */
    public static final /* data */ class c implements InterfaceC47555b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f429738a;

        public c(@k ApiError apiError) {
            this.f429738a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f429738a, ((c) obj).f429738a);
        }

        public final int hashCode() {
            return this.f429738a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("RequestFailed(apiError="), this.f429738a, ')');
        }
    }

    /* compiled from: MainFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrJ0/b$d;", "LrJ0/b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rJ0.b$d */
    public static final /* data */ class d implements InterfaceC47555b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Collection<UserAdvertsFiltersBeduinScreen> f429739a;

        public d(@k Collection<UserAdvertsFiltersBeduinScreen> collection) {
            this.f429739a = collection;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f429739a, ((d) obj).f429739a);
        }

        public final int hashCode() {
            return this.f429739a.hashCode();
        }

        @k
        public final String toString() {
            return "ResetScreens(screens=" + this.f429739a + ')';
        }
    }
}

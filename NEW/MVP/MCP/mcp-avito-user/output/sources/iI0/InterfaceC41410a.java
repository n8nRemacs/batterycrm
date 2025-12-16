package ii0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DistrictAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lii0/a;", "", "a", "b", "c", "d", "Lii0/a$a;", "Lii0/a$b;", "Lii0/a$c;", "Lii0/a$d;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC41410a {

    /* compiled from: DistrictAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lii0/a$a;", "Lii0/a;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11387a implements InterfaceC41410a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11387a f398688a = new C11387a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11387a);
        }

        public final int hashCode() {
            return 1336529074;
        }

        @k
        public final String toString() {
            return "OnApplyButtonClicked";
        }
    }

    /* compiled from: DistrictAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii0/a$b;", "Lii0/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.a$b */
    public static final /* data */ class b implements InterfaceC41410a {

        /* renamed from: a, reason: collision with root package name */
        public final int f398689a;

        public b(int i12) {
            this.f398689a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f398689a == ((b) obj).f398689a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f398689a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnDistrictItemClicked(position="), this.f398689a, ')');
        }
    }

    /* compiled from: DistrictAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii0/a$c;", "Lii0/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.a$c */
    public static final /* data */ class c implements InterfaceC41410a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398690a;

        public c(@k String str) {
            this.f398690a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f398690a, ((c) obj).f398690a);
        }

        public final int hashCode() {
            return this.f398690a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnQueryStringUpdated(query="), this.f398690a, ')');
        }
    }

    /* compiled from: DistrictAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lii0/a$d;", "Lii0/a;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.a$d */
    public static final /* data */ class d implements InterfaceC41410a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f398691a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1402073999;
        }

        @k
        public final String toString() {
            return "OnResetButtonClicked";
        }
    }
}

package ji0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationSuggestAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lji0/a;", "", "a", "b", "c", "Lji0/a$a;", "Lji0/a$b;", "Lji0/a$c;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ji0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC42386a {

    /* compiled from: LocationSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lji0/a$a;", "Lji0/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ji0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11575a implements InterfaceC42386a {

        /* renamed from: a, reason: collision with root package name */
        public final long f405763a;

        public C11575a(long j12) {
            this.f405763a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11575a) && this.f405763a == ((C11575a) obj).f405763a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f405763a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("OnLocationItemSelected(locationId="), this.f405763a, ')');
        }
    }

    /* compiled from: LocationSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lji0/a$b;", "Lji0/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ji0.a$b */
    public static final /* data */ class b implements InterfaceC42386a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405764a;

        public b(@k String str) {
            this.f405764a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f405764a, ((b) obj).f405764a);
        }

        public final int hashCode() {
            return this.f405764a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnQueryStringUpdated(query="), this.f405764a, ')');
        }
    }

    /* compiled from: LocationSuggestAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji0/a$c;", "Lji0/a;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ji0.a$c */
    public static final /* data */ class c implements InterfaceC42386a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f405765a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 615351148;
        }

        @k
        public final String toString() {
            return "OnRefreshButtonClicked";
        }
    }
}

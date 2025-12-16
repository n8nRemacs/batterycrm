package dh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: RatingFormAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ldh0/a;", "", "a", "b", "c", "d", "Ldh0/a$a;", "Ldh0/a$b;", "Ldh0/a$c;", "Ldh0/a$d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC39727a {

    /* compiled from: RatingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/a$a;", "Ldh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11031a implements InterfaceC39727a {

        /* renamed from: a, reason: collision with root package name */
        public final int f393996a;

        public C11031a(int i12) {
            this.f393996a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11031a) && this.f393996a == ((C11031a) obj).f393996a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f393996a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Back(entryCount="), this.f393996a, ')');
        }
    }

    /* compiled from: RatingFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/a$b;", "Ldh0/a;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.a$b */
    public static final /* data */ class b implements InterfaceC39727a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f393997a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 733088107;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RatingFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldh0/a$c;", "Ldh0/a;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.a$c */
    public static final /* data */ class c implements InterfaceC39727a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f393998a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1963581203;
        }

        @k
        public final String toString() {
            return "Load";
        }
    }

    /* compiled from: RatingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldh0/a$d;", "Ldh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dh0.a$d */
    public static final /* data */ class d implements InterfaceC39727a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f393999a;

        public d(boolean z12) {
            this.f393999a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f393999a == ((d) obj).f393999a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f393999a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateStepProgress(hideProgress="), this.f393999a, ')');
        }
    }
}

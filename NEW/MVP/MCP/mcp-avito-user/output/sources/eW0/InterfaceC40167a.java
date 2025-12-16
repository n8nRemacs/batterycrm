package ew0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeViewState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lew0/a;", "", "a", "b", "c", "Lew0/a$a;", "Lew0/a$b;", "Lew0/a$c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ew0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40167a {

    /* compiled from: PromoCodeViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/a$a;", "Lew0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11114a implements InterfaceC40167a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395451a;

        public C11114a(@k String str) {
            this.f395451a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11114a) && L.f(this.f395451a, ((C11114a) obj).f395451a);
        }

        public final int hashCode() {
            return this.f395451a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(error="), this.f395451a, ')');
        }
    }

    /* compiled from: PromoCodeViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lew0/a$b;", "Lew0/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.a$b */
    public static final /* data */ class b implements InterfaceC40167a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395452a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1387125801;
        }

        @k
        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: PromoCodeViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/a$c;", "Lew0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.a$c */
    public static final /* data */ class c implements InterfaceC40167a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "Regular(text=null)";
        }
    }
}

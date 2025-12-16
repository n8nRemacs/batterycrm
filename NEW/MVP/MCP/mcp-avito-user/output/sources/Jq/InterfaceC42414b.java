package jq;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderCallOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ljq/b;", "", "a", "b", "c", "Ljq/b$a;", "Ljq/b$b;", "Ljq/b$c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC42414b {

    /* compiled from: OrderCallOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljq/b$a;", "Ljq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jq.b$a */
    public static final /* data */ class a implements InterfaceC42414b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f405823a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1926406244;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: OrderCallOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljq/b$b;", "Ljq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jq.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11583b implements InterfaceC42414b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11583b f405824a = new C11583b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11583b);
        }

        public final int hashCode() {
            return 367305643;
        }

        @k
        public final String toString() {
            return "NavigateToSuccess";
        }
    }

    /* compiled from: OrderCallOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljq/b$c;", "Ljq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jq.b$c */
    public static final /* data */ class c implements InterfaceC42414b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405825a;

        public c(@k String str) {
            this.f405825a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f405825a, ((c) obj).f405825a);
        }

        public final int hashCode() {
            return this.f405825a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(error="), this.f405825a, ')');
        }
    }
}

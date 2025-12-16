package mq;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lmq/b;", "", "a", "b", "c", "d", "Lmq/b$a;", "Lmq/b$b;", "Lmq/b$c;", "Lmq/b$d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44120b {

    /* compiled from: PromoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/b$a;", "Lmq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.b$a */
    public static final /* data */ class a implements InterfaceC44120b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f414769a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -33532508;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: PromoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/b$b;", "Lmq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11845b implements InterfaceC44120b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11845b f414770a = new C11845b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11845b);
        }

        public final int hashCode() {
            return -919194005;
        }

        @k
        public final String toString() {
            return "NavigateToSuccess";
        }
    }

    /* compiled from: PromoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/b$c;", "Lmq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.b$c */
    public static final /* data */ class c implements InterfaceC44120b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f414771a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 423209185;
        }

        @k
        public final String toString() {
            return "ScrollToTop";
        }
    }

    /* compiled from: PromoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmq/b$d;", "Lmq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mq.b$d */
    public static final /* data */ class d implements InterfaceC44120b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414772a;

        public d(@k String str) {
            this.f414772a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f414772a, ((d) obj).f414772a);
        }

        public final int hashCode() {
            return this.f414772a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(error="), this.f414772a, ')');
        }
    }
}

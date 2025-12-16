package CG0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TransactionAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"LCG0/a;", "", "a", "b", "c", "d", "e", "f", "LCG0/a$b;", "LCG0/a$c;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TransactionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCG0/a$a;", "LCG0/a$b;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: CG0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0098a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f2057a;

        public C0098a(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f2057a = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0098a) && L.f(this.f2057a, ((C0098a) obj).f2057a);
        }

        public final int hashCode() {
            return this.f2057a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f2057a + ')';
        }
    }

    /* compiled from: TransactionAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LCG0/a$b;", "LCG0/a;", "LCG0/a$a;", "LCG0/a$e;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends a {
    }

    /* compiled from: TransactionAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LCG0/a$c;", "LCG0/a;", "LCG0/a$d;", "LCG0/a$f;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends a {
    }

    /* compiled from: TransactionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCG0/a$d;", "LCG0/a$c;", "<init>", "()V", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f2058a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 218428129;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: TransactionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCG0/a$e;", "LCG0/a$b;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC40048c f2059a;

        public e(@k AbstractC40048c abstractC40048c) {
            this.f2059a = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f2059a, ((e) obj).f2059a);
        }

        public final int hashCode() {
            return this.f2059a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateBeduinState(beduinState=" + this.f2059a + ')';
        }
    }

    /* compiled from: TransactionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCG0/a$f;", "LCG0/a$c;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BG0.a f2060a;

        public f(@k BG0.a aVar) {
            this.f2060a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f2060a, ((f) obj).f2060a);
        }

        public final int hashCode() {
            return this.f2060a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateTransactionParams(transactionParams=" + this.f2060a + ')';
        }
    }
}

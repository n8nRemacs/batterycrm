package CG0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TransactionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LCG0/b;", "", "a", "b", "c", "d", "LCG0/b$c;", "LCG0/b$d;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TransactionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCG0/b$a;", "LCG0/b$d;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f2061a;

        public a(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f2061a = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f2061a, ((a) obj).f2061a);
        }

        public final int hashCode() {
            return this.f2061a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f2061a + ')';
        }
    }

    /* compiled from: TransactionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCG0/b$b;", "LCG0/b$c;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: CG0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0099b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2062a;

        public C0099b(@k String str) {
            this.f2062a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0099b) && L.f(this.f2062a, ((C0099b) obj).f2062a);
        }

        public final int hashCode() {
            return this.f2062a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleBeduinState(content="), this.f2062a, ')');
        }
    }

    /* compiled from: TransactionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"LCG0/b$c;", "LCG0/b;", "LCG0/b$b;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends b {
    }

    /* compiled from: TransactionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"LCG0/b$d;", "LCG0/b;", "LCG0/b$a;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends b {
    }
}

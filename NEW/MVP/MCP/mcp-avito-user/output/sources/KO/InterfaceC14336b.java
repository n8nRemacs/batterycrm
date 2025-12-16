package Ko;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TimerState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LKo/b;", "", "a", "b", "LKo/b$a;", "LKo/b$b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ko.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14336b {

    /* compiled from: TimerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKo/b$a;", "LKo/b;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ko.b$a */
    public static final class a implements InterfaceC14336b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9655a = new a();
    }

    /* compiled from: TimerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKo/b$b;", "LKo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ko.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0597b implements InterfaceC14336b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9656a;

        public C0597b(@k String str) {
            this.f9656a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0597b) && L.f(this.f9656a, ((C0597b) obj).f9656a);
        }

        public final int hashCode() {
            return this.f9656a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Ticking(formattedTime="), this.f9656a, ')');
        }
    }
}

package m10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendingConfirmAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lm10/a;", "", "a", "b", "Lm10/a$a;", "Lm10/a$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m10.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC43859a {

    /* compiled from: SendingConfirmAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm10/a$a;", "Lm10/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11812a implements InterfaceC43859a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414257a;

        public C11812a(@k String str) {
            this.f414257a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11812a) && L.f(this.f414257a, ((C11812a) obj).f414257a);
        }

        public final int hashCode() {
            return this.f414257a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CheckboxChanged(key="), this.f414257a, ')');
        }
    }

    /* compiled from: SendingConfirmAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm10/a$b;", "Lm10/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m10.a$b */
    public static final /* data */ class b implements InterfaceC43859a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f414258a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1797013713;
        }

        @k
        public final String toString() {
            return "Confirm";
        }
    }
}

package Jo;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LJo/a;", "", "a", "b", "LJo/a$a;", "LJo/a$b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14224a {

    /* compiled from: CodeConfirmAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/a$a;", "LJo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0541a implements InterfaceC14224a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9136a;

        public C0541a(@k String str) {
            this.f9136a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0541a) && L.f(this.f9136a, ((C0541a) obj).f9136a);
        }

        public final int hashCode() {
            return this.f9136a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ConfirmCode(code="), this.f9136a, ')');
        }
    }

    /* compiled from: CodeConfirmAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/a$b;", "LJo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.a$b */
    public static final /* data */ class b implements InterfaceC14224a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9137a;

        public b(@k String str) {
            this.f9137a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f9137a, ((b) obj).f9137a);
        }

        public final int hashCode() {
            return this.f9137a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ModifyInput(newText="), this.f9137a, ')');
        }
    }
}

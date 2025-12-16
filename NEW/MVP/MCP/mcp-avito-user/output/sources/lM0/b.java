package LM0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmRequisitesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LLM0/b;", "", "a", "b", "c", "d", "LLM0/b$a;", "LLM0/b$b;", "LLM0/b$c;", "LLM0/b$d;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ConfirmRequisitesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLM0/b$a;", "LLM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9931a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1131238995;
        }

        @k
        public final String toString() {
            return "FinishActivity";
        }
    }

    /* compiled from: ConfirmRequisitesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLM0/b$b;", "LLM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: LM0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0612b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0612b f9932a = new C0612b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0612b);
        }

        public final int hashCode() {
            return -1526807607;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: ConfirmRequisitesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/b$c;", "LLM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Arguments f9933a;

        public c(@k Arguments arguments) {
            this.f9933a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9933a, ((c) obj).f9933a);
        }

        public final int hashCode() {
            return this.f9933a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("OpenBottomSheet(arguments="), this.f9933a, ')');
        }
    }

    /* compiled from: ConfirmRequisitesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/b$d;", "LLM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9934a;

        public d(@k String str) {
            this.f9934a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f9934a, ((d) obj).f9934a);
        }

        public final int hashCode() {
            return this.f9934a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(text="), this.f9934a, ')');
        }
    }
}

package LM0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.verification.inn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmRequisitesState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LLM0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LLM0/c$a;", "LLM0/c$b;", "LLM0/c$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class c extends q {

    /* compiled from: ConfirmRequisitesState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/c$a;", "LLM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f9935b;

        public a(@k String str) {
            super(null);
            this.f9935b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f9935b, ((a) obj).f9935b);
        }

        public final int hashCode() {
            return this.f9935b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f9935b, ')');
        }
    }

    /* compiled from: ConfirmRequisitesState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/c$b;", "LLM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9936b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a.C10030a f9937c;

        public b(boolean z12, @k a.C10030a c10030a) {
            super(null);
            this.f9936b = z12;
            this.f9937c = c10030a;
        }

        public static b a(b bVar, a.C10030a c10030a) {
            boolean z12 = bVar.f9936b;
            bVar.getClass();
            return new b(z12, c10030a);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9936b == bVar.f9936b && L.f(this.f9937c, bVar.f9937c);
        }

        public final int hashCode() {
            return this.f9937c.hashCode() + (Boolean.hashCode(this.f9936b) * 31);
        }

        @k
        public final String toString() {
            return "Loaded(isClosable=" + this.f9936b + ", listState=" + this.f9937c + ')';
        }
    }

    /* compiled from: ConfirmRequisitesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLM0/c$c;", "LLM0/c;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: LM0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0613c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0613c f9938b = new C0613c();

        public C0613c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0613c);
        }

        public final int hashCode() {
            return -20862231;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}

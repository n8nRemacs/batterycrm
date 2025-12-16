package TM0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.verification.verification_form_builder.FormBuilderScreenData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FormBuilderState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LTM0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LTM0/c$a;", "LTM0/c$b;", "LTM0/c$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class c extends q {

    /* compiled from: FormBuilderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/c$a;", "LTM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f15623b;

        public a(@k PrintableText printableText) {
            super(null);
            this.f15623b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f15623b, ((a) obj).f15623b);
        }

        public final int hashCode() {
            return this.f15623b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(message="), this.f15623b, ')');
        }
    }

    /* compiled from: FormBuilderState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/c$b;", "LTM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FormBuilderScreenData f15624b;

        public b(@k FormBuilderScreenData formBuilderScreenData) {
            super(null);
            this.f15624b = formBuilderScreenData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15624b, ((b) obj).f15624b);
        }

        public final int hashCode() {
            return this.f15624b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(screenData=" + this.f15624b + ')';
        }
    }

    /* compiled from: FormBuilderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTM0/c$c;", "LTM0/c;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: TM0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1067c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1067c f15625b = new C1067c();

        public C1067c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1067c);
        }

        public final int hashCode() {
            return 165475187;
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

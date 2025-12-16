package TM0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormBuilderOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LTM0/b;", "", "a", "b", "c", "d", "LTM0/b$a;", "LTM0/b$b;", "LTM0/b$c;", "LTM0/b$d;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: FormBuilderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTM0/b$a;", "LTM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f15619a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2019901250;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: FormBuilderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTM0/b$b;", "LTM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: TM0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1066b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1066b f15620a = new C1066b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1066b);
        }

        public final int hashCode() {
            return -1806307587;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: FormBuilderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/b$c;", "LTM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Arguments f15621a;

        public c(@k Arguments arguments) {
            this.f15621a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f15621a, ((c) obj).f15621a);
        }

        public final int hashCode() {
            return this.f15621a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("ShowSelect(args="), this.f15621a, ')');
        }
    }

    /* compiled from: FormBuilderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/b$d;", "LTM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f15622a;

        public d(@k PrintableText printableText) {
            this.f15622a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f15622a, ((d) obj).f15622a);
        }

        public final int hashCode() {
            return this.f15622a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f15622a, ')');
        }
    }
}

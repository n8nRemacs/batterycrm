package o10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SignOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lo10/c;", "", "a", "b", "c", "Lo10/c$a;", "Lo10/c$b;", "Lo10/c$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC44505c {

    /* compiled from: SignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo10/c$a;", "Lo10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.c$a */
    public static final /* data */ class a implements InterfaceC44505c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f419301a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1916332167;
        }

        @k
        public final String toString() {
            return "ClearSignEvent";
        }
    }

    /* compiled from: SignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo10/c$b;", "Lo10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.c$b */
    public static final /* data */ class b implements InterfaceC44505c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f419302a;

        public b(@k PrintableText printableText) {
            this.f419302a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f419302a, ((b) obj).f419302a);
        }

        public final int hashCode() {
            return this.f419302a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(message="), this.f419302a, ')');
        }
    }

    /* compiled from: SignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo10/c$c;", "Lo10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o10.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12157c implements InterfaceC44505c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12157c f419303a = new C12157c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12157c);
        }

        public final int hashCode() {
            return -199767436;
        }

        @k
        public final String toString() {
            return "SignUploaded";
        }
    }
}

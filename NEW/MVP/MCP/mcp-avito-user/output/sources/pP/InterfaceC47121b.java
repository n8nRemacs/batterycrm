package pp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContractSignOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lpp/b;", "", "a", "b", "c", "d", "e", "Lpp/b$a;", "Lpp/b$b;", "Lpp/b$c;", "Lpp/b$d;", "Lpp/b$e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC47121b {

    /* compiled from: ContractSignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpp/b$a;", "Lpp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pp.b$a */
    public static final /* data */ class a implements InterfaceC47121b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f428767a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1428084696;
        }

        @k
        public final String toString() {
            return "FinishWithCancelledResult";
        }
    }

    /* compiled from: ContractSignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpp/b$b;", "Lpp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pp.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12290b implements InterfaceC47121b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12290b f428768a = new C12290b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12290b);
        }

        public final int hashCode() {
            return -1955794865;
        }

        @k
        public final String toString() {
            return "FinishWithErrorResult";
        }
    }

    /* compiled from: ContractSignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpp/b$c;", "Lpp/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pp.b$c */
    public static final /* data */ class c implements InterfaceC47121b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428769a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -514860150;
        }

        @k
        public final String toString() {
            return "FinishWithSuccessResult";
        }
    }

    /* compiled from: ContractSignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpp/b$d;", "Lpp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pp.b$d */
    public static final /* data */ class d implements InterfaceC47121b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f428770a;

        public d(@k String str) {
            this.f428770a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f428770a, ((d) obj).f428770a);
        }

        public final int hashCode() {
            return this.f428770a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenContractLink(url="), this.f428770a, ')');
        }
    }

    /* compiled from: ContractSignOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpp/b$e;", "Lpp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pp.b$e */
    public static final /* data */ class e implements InterfaceC47121b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f428771a;

        public e(@k PrintableText printableText) {
            this.f428771a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f428771a, ((e) obj).f428771a);
        }

        public final int hashCode() {
            return this.f428771a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(text="), this.f428771a, ')');
        }
    }
}

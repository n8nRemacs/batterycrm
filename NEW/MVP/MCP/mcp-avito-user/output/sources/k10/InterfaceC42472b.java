package k10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectedAppealOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lk10/b;", "", "a", "b", "c", "Lk10/b$a;", "Lk10/b$b;", "Lk10/b$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC42472b {

    /* compiled from: SelectedAppealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk10/b$a;", "Lk10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k10.b$a */
    public static final /* data */ class a implements InterfaceC42472b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f405989a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1050084984;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: SelectedAppealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk10/b$b;", "Lk10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k10.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11601b implements InterfaceC42472b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11601b f405990a = new C11601b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11601b);
        }

        public final int hashCode() {
            return 1556410665;
        }

        @k
        public final String toString() {
            return "DismissWithReloadApplication";
        }
    }

    /* compiled from: SelectedAppealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk10/b$c;", "Lk10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k10.b$c */
    public static final /* data */ class c implements InterfaceC42472b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f405991a;

        public c(@k PrintableText printableText) {
            this.f405991a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f405991a, ((c) obj).f405991a);
        }

        public final int hashCode() {
            return this.f405991a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(message="), this.f405991a, ')');
        }
    }
}

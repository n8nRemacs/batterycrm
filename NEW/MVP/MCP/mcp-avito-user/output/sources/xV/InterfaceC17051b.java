package Xv;

import X41.g;
import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorRegionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LXv/b;", "", "a", "b", "c", "LXv/b$a;", "LXv/b$b;", "LXv/b$c;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC17051b {

    /* compiled from: TarifikatorRegionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXv/b$a;", "LXv/b;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xv.b$a */
    public static final /* data */ class a implements InterfaceC17051b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f19144a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1803832197;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TarifikatorRegionOneTimeEvent.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LXv/b$b;", "LXv/b;", "message", "Lcom/avito/android/printable_text/PrintableText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xv.b$b, reason: collision with other inner class name */
    public static final class C1355b implements InterfaceC17051b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f19145a;

        private /* synthetic */ C1355b(PrintableText printableText) {
            this.f19145a = printableText;
        }

        public static final /* synthetic */ C1355b a(PrintableText printableText) {
            return new C1355b(printableText);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C1355b) {
                return L.f(this.f19145a, ((C1355b) obj).f19145a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f19145a.hashCode();
        }

        public final String toString() {
            return "ShowErrorToast(message=" + this.f19145a + ')';
        }
    }

    /* compiled from: TarifikatorRegionOneTimeEvent.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LXv/b$c;", "LXv/b;", "message", "Lcom/avito/android/printable_text/PrintableText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xv.b$c */
    public static final class c implements InterfaceC17051b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f19146a;

        private /* synthetic */ c(PrintableText printableText) {
            this.f19146a = printableText;
        }

        public static final /* synthetic */ c a(PrintableText printableText) {
            return new c(printableText);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return L.f(this.f19146a, ((c) obj).f19146a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f19146a.hashCode();
        }

        public final String toString() {
            return "ShowToast(message=" + this.f19146a + ')';
        }
    }
}

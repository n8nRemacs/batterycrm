package Tv;

import X41.g;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorMainOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LTv/d;", "", "a", "b", "c", "d", "LTv/d$a;", "LTv/d$b;", "LTv/d$c;", "LTv/d$d;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tv.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15413d {

    /* compiled from: TarifikatorMainOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTv/d$a;", "LTv/d;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.d$a */
    public static final /* data */ class a implements InterfaceC15413d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f16007a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -450058545;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TarifikatorMainOneTimeEvent.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LTv/d$b;", "LTv/d;", "regionName", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.d$b */
    public static final class b implements InterfaceC15413d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16008a;

        private /* synthetic */ b(String str) {
            this.f16008a = str;
        }

        public static final /* synthetic */ b a(String str) {
            return new b(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return L.f(this.f16008a, ((b) obj).f16008a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16008a.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("NavigateToRegionScreen(regionName="), this.f16008a, ')');
        }
    }

    /* compiled from: TarifikatorMainOneTimeEvent.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LTv/d$c;", "LTv/d;", "message", "Lcom/avito/android/printable_text/PrintableText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.d$c */
    public static final class c implements InterfaceC15413d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f16009a;

        private /* synthetic */ c(PrintableText printableText) {
            this.f16009a = printableText;
        }

        public static final /* synthetic */ c a(PrintableText printableText) {
            return new c(printableText);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return L.f(this.f16009a, ((c) obj).f16009a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16009a.hashCode();
        }

        public final String toString() {
            return "ShowErrorToast(message=" + this.f16009a + ')';
        }
    }

    /* compiled from: TarifikatorMainOneTimeEvent.kt */
    @g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LTv/d$d;", "LTv/d;", "message", "Lcom/avito/android/printable_text/PrintableText;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Tv.d$d, reason: collision with other inner class name */
    public static final class C1089d implements InterfaceC15413d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f16010a;

        private /* synthetic */ C1089d(PrintableText printableText) {
            this.f16010a = printableText;
        }

        public static final /* synthetic */ C1089d a(PrintableText printableText) {
            return new C1089d(printableText);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C1089d) {
                return L.f(this.f16010a, ((C1089d) obj).f16010a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16010a.hashCode();
        }

        public final String toString() {
            return "ShowToast(message=" + this.f16010a + ')';
        }
    }
}

package fh0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormSelectItemOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lfh0/c;", "", "a", "Lfh0/c$a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: RatingFormSelectItemOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfh0/c$a;", "Lfh0/c;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f396056a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f396057b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f396058c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final InterfaceC40422a f396059d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final InterfaceC40422a f396060e;

        public a(@l PrintableText printableText, @l Throwable th2, @l PrintableText printableText2, @l InterfaceC40422a interfaceC40422a, @l InterfaceC40422a interfaceC40422a2) {
            this.f396056a = printableText;
            this.f396057b = th2;
            this.f396058c = printableText2;
            this.f396059d = interfaceC40422a;
            this.f396060e = interfaceC40422a2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f396056a, aVar.f396056a) && L.f(this.f396057b, aVar.f396057b) && L.f(this.f396058c, aVar.f396058c) && L.f(this.f396059d, aVar.f396059d) && L.f(this.f396060e, aVar.f396060e);
        }

        public final int hashCode() {
            PrintableText printableText = this.f396056a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            Throwable th2 = this.f396057b;
            int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
            PrintableText printableText2 = this.f396058c;
            int iHashCode3 = (iHashCode2 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
            InterfaceC40422a interfaceC40422a = this.f396059d;
            int iHashCode4 = (iHashCode3 + (interfaceC40422a == null ? 0 : interfaceC40422a.hashCode())) * 31;
            InterfaceC40422a interfaceC40422a2 = this.f396060e;
            return iHashCode4 + (interfaceC40422a2 != null ? interfaceC40422a2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToastBar(message=" + this.f396056a + ", error=" + this.f396057b + ", actionText=" + this.f396058c + ", onClickedAction=" + this.f396059d + ", onDismissedAction=" + this.f396060e + ')';
        }

        public /* synthetic */ a(PrintableText printableText, Throwable th2, PrintableText printableText2, InterfaceC40422a interfaceC40422a, InterfaceC40422a interfaceC40422a2, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? null : th2, (i12 & 4) != 0 ? null : printableText2, (i12 & 8) != 0 ? null : interfaceC40422a, (i12 & 16) != 0 ? null : interfaceC40422a2);
        }
    }
}

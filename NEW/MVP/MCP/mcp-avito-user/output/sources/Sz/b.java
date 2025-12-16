package SZ;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.acceptance_dialog.model.ButtonStyle;
import com.avito.android.mortgage.root.model.ApplicationDeleteAction;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationsListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LSZ/b;", "", "a", "b", "c", "d", "LSZ/b$a;", "LSZ/b$b;", "LSZ/b$c;", "LSZ/b$d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: ApplicationsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSZ/b$a;", "LSZ/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f15052a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -692792352;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: ApplicationsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSZ/b$b;", "LSZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SZ.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1026b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15053a;

        public C1026b(@k DeepLink deepLink) {
            this.f15053a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1026b) && L.f(this.f15053a, ((C1026b) obj).f15053a);
        }

        public final int hashCode() {
            return this.f15053a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f15053a, ')');
        }
    }

    /* compiled from: ApplicationsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSZ/b$c;", "LSZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f15054a;

        public c(@k PrintableText printableText) {
            this.f15054a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f15054a, ((c) obj).f15054a);
        }

        public final int hashCode() {
            return this.f15054a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(message="), this.f15054a, ')');
        }
    }

    /* compiled from: ApplicationsListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSZ/b$d;", "LSZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f15055a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f15056b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f15057c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f15058d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ApplicationDeleteAction f15059e;

        public d(@k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3, @k PrintableText printableText4, @k ApplicationDeleteAction applicationDeleteAction) {
            Parcelable.Creator<ButtonStyle> creator = ButtonStyle.CREATOR;
            this.f15055a = printableText;
            this.f15056b = printableText2;
            this.f15057c = printableText3;
            this.f15058d = printableText4;
            this.f15059e = applicationDeleteAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            if (!this.f15055a.equals(dVar.f15055a) || !this.f15056b.equals(dVar.f15056b) || !this.f15057c.equals(dVar.f15057c)) {
                return false;
            }
            Parcelable.Creator<ButtonStyle> creator = ButtonStyle.CREATOR;
            return this.f15058d.equals(dVar.f15058d) && this.f15059e.equals(dVar.f15059e);
        }

        public final int hashCode() {
            return this.f15059e.f202930b.hashCode() + com.avito.android.actions_sheet.a.f(this.f15058d, (ButtonStyle.f198196c.hashCode() + com.avito.android.actions_sheet.a.f(this.f15057c, com.avito.android.actions_sheet.a.f(this.f15056b, com.avito.android.actions_sheet.a.f(this.f15055a, 1456339151, 31), 31), 31)) * 31, 31);
        }

        @k
        public final String toString() {
            return "ShowMoreDialog(requestKey=DELETE_MORTGAGE_APPLICATION_REQUEST_KEY, title=" + this.f15055a + ", description=" + this.f15056b + ", acceptButton=" + this.f15057c + ", acceptButtonStyle=" + ButtonStyle.f198196c + ", declineButton=" + this.f15058d + ", requestedAction=" + this.f15059e + ')';
        }
    }
}

package SM;

import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.important_addresses_selection.data.model.ImportantAddressesData;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LSM/b;", "", "a", "b", "c", "d", "LSM/b$a;", "LSM/b$b;", "LSM/b$c;", "LSM/b$d;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: ImportantAddressesSelectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSM/b$a;", "LSM/b;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ImportantAddressesData f14922a;

        public a(@k ImportantAddressesData importantAddressesData) {
            this.f14922a = importantAddressesData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f14922a, ((a) obj).f14922a);
        }

        public final int hashCode() {
            return this.f14922a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(importantAddressesData=" + this.f14922a + ')';
        }
    }

    /* compiled from: ImportantAddressesSelectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSM/b$b;", "LSM/b;", "<init>", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SM.b$b, reason: collision with other inner class name */
    public static final class C1008b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1008b f14923a = new C1008b();
    }

    /* compiled from: ImportantAddressesSelectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSM/b$c;", "LSM/b;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14924a;

        public c(@k DeepLink deepLink) {
            this.f14924a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14924a, ((c) obj).f14924a);
        }

        public final int hashCode() {
            return this.f14924a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeepLink(deepLink="), this.f14924a, ')');
        }
    }

    /* compiled from: ImportantAddressesSelectionOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSM/b$d;", "LSM/b;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f14925a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f14926b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ToastBarPosition f14927c;

        public d(@k f fVar, @k ToastBarPosition toastBarPosition, @k PrintableText printableText) {
            this.f14925a = printableText;
            this.f14926b = fVar;
            this.f14927c = toastBarPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f14925a, dVar.f14925a) && L.f(this.f14926b, dVar.f14926b) && this.f14927c == dVar.f14927c;
        }

        public final int hashCode() {
            return this.f14927c.hashCode() + ((this.f14926b.hashCode() + (this.f14925a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(message=" + this.f14925a + ", type=" + this.f14926b + ", position=" + this.f14927c + ')';
        }

        public /* synthetic */ d(PrintableText printableText, f fVar, ToastBarPosition toastBarPosition, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? f.a.f125253a : fVar, (i12 & 4) != 0 ? ToastBarPosition.f181047e : toastBarPosition, printableText);
        }
    }
}

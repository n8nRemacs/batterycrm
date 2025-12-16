package J9;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferBottomSheetInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LJ9/b;", "", "a", "b", "c", "LJ9/b$a;", "LJ9/b$b;", "LJ9/b$c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: OfferBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ9/b$a;", "LJ9/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final OfferOpenParams f8806a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8807b;

        public a(@k OfferOpenParams offerOpenParams, int i12) {
            this.f8806a = offerOpenParams;
            this.f8807b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f8806a, aVar.f8806a) && this.f8807b == aVar.f8807b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8807b) + (this.f8806a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeContentByPosition(openParams=");
            sb2.append(this.f8806a);
            sb2.append(", newPosition=");
            return r.t(sb2, this.f8807b, ')');
        }
    }

    /* compiled from: OfferBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ9/b$b;", "LJ9/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J9.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0509b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8808a;

        public C0509b(@k DeepLink deepLink) {
            this.f8808a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0509b) && L.f(this.f8808a, ((C0509b) obj).f8808a);
        }

        public final int hashCode() {
            return this.f8808a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CloseAndHandleLinkInternal(uri="), this.f8808a, ')');
        }
    }

    /* compiled from: OfferBottomSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ9/b$c;", "LJ9/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final OfferOpenParams f8809a;

        public c(@k OfferOpenParams offerOpenParams) {
            this.f8809a = offerOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f8809a, ((c) obj).f8809a);
        }

        public final int hashCode() {
            return this.f8809a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowInitialContent(openParams=" + this.f8809a + ')';
        }
    }
}

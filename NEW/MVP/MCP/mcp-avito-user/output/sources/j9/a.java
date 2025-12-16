package J9;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferBottomSheetAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LJ9/a;", "", "a", "b", "LJ9/a$a;", "LJ9/a$b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: OfferBottomSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ9/a$a;", "LJ9/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J9.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0508a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8804a;

        public C0508a(@k DeepLink deepLink) {
            this.f8804a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0508a) && L.f(this.f8804a, ((C0508a) obj).f8804a);
        }

        public final int hashCode() {
            return this.f8804a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnButtonClicked(uri="), this.f8804a, ')');
        }
    }

    /* compiled from: OfferBottomSheetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ9/a$b;", "LJ9/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8805a;

        public b(int i12) {
            this.f8805a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f8805a == ((b) obj).f8805a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8805a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnOfferPositionChanged(newPosition="), this.f8805a, ')');
        }
    }
}

package J9;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferBottomSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LJ9/c;", "", "a", "LJ9/c$a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c {

    /* compiled from: OfferBottomSheetOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ9/c$a;", "LJ9/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8810a;

        public a(@k DeepLink deepLink) {
            this.f8810a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f8810a, ((a) obj).f8810a);
        }

        public final int hashCode() {
            return this.f8810a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CloseAndHandleLink(uri="), this.f8810a, ')');
        }
    }
}

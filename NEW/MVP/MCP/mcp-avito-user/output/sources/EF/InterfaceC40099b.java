package ef;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectConfirmationBottomSheetOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lef/b;", "", "a", "Lef/b$a;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ef.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40099b {

    /* compiled from: AutoSelectConfirmationBottomSheetOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lef/b$a;", "Lef/b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ef.b$a */
    public static final /* data */ class a implements InterfaceC40099b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395308a;

        public a(@k DeepLink deepLink) {
            this.f395308a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f395308a, ((a) obj).f395308a);
        }

        public final int hashCode() {
            return this.f395308a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleLink(uri="), this.f395308a, ')');
        }
    }
}

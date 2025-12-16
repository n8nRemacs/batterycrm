package zB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfMenuAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LzB0/a;", "", "a", "LzB0/a$a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50432a {

    /* compiled from: TariffCpxInfoSfMenuAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzB0/a$a;", "LzB0/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zB0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12946a implements InterfaceC50432a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443943a;

        public C12946a(@k DeepLink deepLink) {
            this.f443943a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12946a) && L.f(this.f443943a, ((C12946a) obj).f443943a);
        }

        public final int hashCode() {
            return this.f443943a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnActionClicked(deeplink="), this.f443943a, ')');
        }
    }
}

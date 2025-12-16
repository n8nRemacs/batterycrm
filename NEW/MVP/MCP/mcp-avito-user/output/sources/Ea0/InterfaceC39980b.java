package eA0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LeA0/b;", "", "a", "LeA0/b$a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eA0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC39980b {

    /* compiled from: SuccessOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA0/b$a;", "LeA0/b;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eA0.b$a */
    public static final /* data */ class a implements InterfaceC39980b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f395033a;

        public a(@l DeepLink deepLink) {
            this.f395033a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f395033a, ((a) obj).f395033a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f395033a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeepLink(deepLink="), this.f395033a, ')');
        }
    }
}

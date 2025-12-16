package Kf;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaDirectPurchaseAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LKf/a;", "", "a", "LKf/a$a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC14310a {

    /* compiled from: AutotekaDirectPurchaseAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKf/a$a;", "LKf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Kf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0589a implements InterfaceC14310a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9592a;

        public C0589a(@k DeepLink deepLink) {
            this.f9592a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0589a) && L.f(this.f9592a, ((C0589a) obj).f9592a);
        }

        public final int hashCode() {
            return this.f9592a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f9592a, ')');
        }
    }
}

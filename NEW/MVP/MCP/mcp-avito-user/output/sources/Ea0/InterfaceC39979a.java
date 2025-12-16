package eA0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LeA0/a;", "", "a", "b", "LeA0/a$a;", "LeA0/a$b;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC39979a {

    /* compiled from: SuccessAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeA0/a$a;", "LeA0/a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eA0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11056a implements InterfaceC39979a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395031a;

        public C11056a(@k DeepLink deepLink) {
            this.f395031a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11056a) && L.f(this.f395031a, ((C11056a) obj).f395031a);
        }

        public final int hashCode() {
            return this.f395031a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeepLink(deeplink="), this.f395031a, ')');
        }
    }

    /* compiled from: SuccessAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeA0/a$b;", "LeA0/a;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eA0.a$b */
    public static final /* data */ class b implements InterfaceC39979a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395032a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1231966204;
        }

        @k
        public final String toString() {
            return "ReloadContent";
        }
    }
}

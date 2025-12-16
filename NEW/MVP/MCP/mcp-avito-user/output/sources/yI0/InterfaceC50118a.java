package yI0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryRestrictionAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LyI0/a;", "", "a", "b", "LyI0/a$a;", "LyI0/a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yI0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC50118a {

    /* compiled from: DeliveryRestrictionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyI0/a$a;", "LyI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yI0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12896a implements InterfaceC50118a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12896a f443021a = new C12896a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12896a);
        }

        public final int hashCode() {
            return 180732059;
        }

        @k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: DeliveryRestrictionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyI0/a$b;", "LyI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yI0.a$b */
    public static final /* data */ class b implements InterfaceC50118a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443022a;

        public b(@k DeepLink deepLink) {
            this.f443022a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443022a, ((b) obj).f443022a);
        }

        public final int hashCode() {
            return this.f443022a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Show(deeplink="), this.f443022a, ')');
        }
    }
}

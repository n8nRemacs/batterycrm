package pz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpz0/c;", "", "a", "b", "Lpz0/c$a;", "Lpz0/c$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47172c {

    /* compiled from: StrOrdersBuyerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpz0/c$a;", "Lpz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.c$a */
    public static final class a implements InterfaceC47172c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f428928a = new a();
    }

    /* compiled from: StrOrdersBuyerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/c$b;", "Lpz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.c$b */
    public static final /* data */ class b implements InterfaceC47172c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f428929a;

        public b(@k DeepLink deepLink) {
            this.f428929a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f428929a, ((b) obj).f428929a);
        }

        public final int hashCode() {
            return this.f428929a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f428929a, ')');
        }
    }
}

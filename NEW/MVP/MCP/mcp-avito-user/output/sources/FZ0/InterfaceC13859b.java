package Fz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersRangeOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LFz0/b;", "", "a", "b", "LFz0/b$a;", "LFz0/b$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13859b {

    /* compiled from: StrSellerOrdersRangeOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFz0/b$a;", "LFz0/b;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fz0.b$a */
    public static final class a implements InterfaceC13859b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f6113a = new a();
    }

    /* compiled from: StrSellerOrdersRangeOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFz0/b$b;", "LFz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0319b implements InterfaceC13859b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f6114a;

        public C0319b(@k DeepLink deepLink) {
            this.f6114a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0319b) && L.f(this.f6114a, ((C0319b) obj).f6114a);
        }

        public final int hashCode() {
            return this.f6114a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f6114a, ')');
        }
    }
}

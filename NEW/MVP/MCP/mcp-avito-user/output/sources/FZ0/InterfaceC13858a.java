package Fz0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersRangeAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LFz0/a;", "", "a", "b", "c", "LFz0/a$a;", "LFz0/a$b;", "LFz0/a$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13858a {

    /* compiled from: StrSellerOrdersRangeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFz0/a$a;", "LFz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fz0.a$a, reason: collision with other inner class name */
    public static final class C0318a implements InterfaceC13858a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0318a f6110a = new C0318a();
    }

    /* compiled from: StrSellerOrdersRangeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFz0/a$b;", "LFz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fz0.a$b */
    public static final /* data */ class b implements InterfaceC13858a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f6111a;

        public b(@k DeepLink deepLink) {
            this.f6111a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6111a, ((b) obj).f6111a);
        }

        public final int hashCode() {
            return this.f6111a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OrderClicked(deeplink="), this.f6111a, ')');
        }
    }

    /* compiled from: StrSellerOrdersRangeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFz0/a$c;", "LFz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fz0.a$c */
    public static final class c implements InterfaceC13858a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f6112a = new c();
    }
}

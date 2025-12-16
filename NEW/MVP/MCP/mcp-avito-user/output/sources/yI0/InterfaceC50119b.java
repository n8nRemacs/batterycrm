package yI0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryRestrictionState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LyI0/b;", "", "a", "b", "LyI0/b$a;", "LyI0/b$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yI0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC50119b {

    /* compiled from: DeliveryRestrictionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyI0/b$a;", "LyI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yI0.b$a */
    public static final /* data */ class a implements InterfaceC50119b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f443023a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 929030654;
        }

        @k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: DeliveryRestrictionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyI0/b$b;", "LyI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12897b implements InterfaceC50119b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443024a;

        public C12897b(@k DeepLink deepLink) {
            this.f443024a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12897b) && L.f(this.f443024a, ((C12897b) obj).f443024a);
        }

        public final int hashCode() {
            return this.f443024a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Show(deeplink="), this.f443024a, ')');
        }
    }
}

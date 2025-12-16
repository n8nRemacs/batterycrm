package qL0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasDiscountV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LqL0/b;", "", "a", "b", "c", "LqL0/b$a;", "LqL0/b$b;", "LqL0/b$c;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qL0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47318b {

    /* compiled from: VasDiscountV2OneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqL0/b$a;", "LqL0/b;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qL0.b$a */
    public static final /* data */ class a implements InterfaceC47318b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429197a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1474666752;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: VasDiscountV2OneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqL0/b$b;", "LqL0/b;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qL0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12322b implements InterfaceC47318b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429198a;

        public C12322b(@k DeepLink deepLink) {
            this.f429198a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12322b) && L.f(this.f429198a, ((C12322b) obj).f429198a);
        }

        public final int hashCode() {
            return this.f429198a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NavigateToDeepLinkAndClose(deepLink="), this.f429198a, ')');
        }
    }

    /* compiled from: VasDiscountV2OneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqL0/b$c;", "LqL0/b;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qL0.b$c */
    public static final /* data */ class c implements InterfaceC47318b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f429199a;

        public c(@k ApiException apiException) {
            this.f429199a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f429199a.equals(((c) obj).f429199a);
        }

        public final int hashCode() {
            return this.f429199a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("ShowError(error="), this.f429199a, ')');
        }
    }
}

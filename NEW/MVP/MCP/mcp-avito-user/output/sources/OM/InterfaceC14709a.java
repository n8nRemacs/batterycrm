package Om;

import Pm.C14806a;
import Pm.C14809d;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartBundlesAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LOm/a;", "", "a", "b", "c", "LOm/a$a;", "LOm/a$b;", "LOm/a$c;", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Om.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14709a {

    /* compiled from: CartBundlesAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LOm/a$a;", "LOm/a;", "LPm/d;", "sellerHash", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Om.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0805a implements InterfaceC14709a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12504a;

        public C0805a(String str, C42822w c42822w) {
            this.f12504a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0805a) {
                return L.f(this.f12504a, ((C0805a) obj).f12504a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12504a.hashCode();
        }

        @k
        public final String toString() {
            return "RefreshBundleInfoForSeller(sellerHash=" + ((Object) C14809d.b(this.f12504a)) + ')';
        }
    }

    /* compiled from: CartBundlesAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LOm/a$b;", "LOm/a;", "LPm/d;", "sellerHash", "LPm/a;", "bundleInfo", "<init>", "(Ljava/lang/String;LPm/a;Lkotlin/jvm/internal/w;)V", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Om.a$b */
    public static final /* data */ class b implements InterfaceC14709a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12505a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C14806a f12506b;

        public b(String str, C14806a c14806a, C42822w c42822w) {
            this.f12505a = str;
            this.f12506b = c14806a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f12505a, bVar.f12505a) && L.f(this.f12506b, bVar.f12506b);
        }

        public final int hashCode() {
            return this.f12506b.hashCode() + (this.f12505a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "SetBundleInfoBySeller(sellerHash=" + ((Object) C14809d.b(this.f12505a)) + ", bundleInfo=" + this.f12506b + ')';
        }
    }

    /* compiled from: CartBundlesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOm/a$c;", "LOm/a;", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Om.a$c */
    public static final /* data */ class c implements InterfaceC14709a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "SetBundleInfoBySellers(bundleInfos=null)";
        }
    }
}

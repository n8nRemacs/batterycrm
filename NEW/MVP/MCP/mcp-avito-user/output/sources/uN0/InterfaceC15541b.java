package Un0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LUn0/b;", "", "a", "b", "c", "LUn0/b$a;", "LUn0/b$b;", "LUn0/b$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Un0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15541b {

    /* compiled from: UniversalDeliveryTypeOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUn0/b$a;", "LUn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.b$a */
    public static final /* data */ class a implements InterfaceC15541b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f16590a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1183254919;
        }

        @k
        public final String toString() {
            return "CheckoutSuccess";
        }
    }

    /* compiled from: UniversalDeliveryTypeOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUn0/b$b;", "LUn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1144b implements InterfaceC15541b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinDeliveryMethodSelectTabAction f16591a;

        public C1144b(@k BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction) {
            this.f16591a = beduinDeliveryMethodSelectTabAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1144b) && L.f(this.f16591a, ((C1144b) obj).f16591a);
        }

        public final int hashCode() {
            return this.f16591a.hashCode();
        }

        @k
        public final String toString() {
            return "DeliveryMethodSelectTab(tabAction=" + this.f16591a + ')';
        }
    }

    /* compiled from: UniversalDeliveryTypeOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUn0/b$c;", "LUn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Un0.b$c */
    public static final /* data */ class c implements InterfaceC15541b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16592a;

        public c(@k String str) {
            this.f16592a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f16592a, ((c) obj).f16592a);
        }

        public final int hashCode() {
            return this.f16592a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectedTabEvent(tabType="), this.f16592a, ')');
        }
    }
}

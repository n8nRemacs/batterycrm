package vI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.historical_suggests.model.AddressType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HistoricalSuggestsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LvI/b;", "", "a", "b", "LvI/b$a;", "LvI/b$b;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49217b {

    /* compiled from: HistoricalSuggestsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvI/b$a;", "LvI/b;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.b$a */
    public static final /* data */ class a implements InterfaceC49217b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AddressParameter.Value f440654a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AddressType f440655b;

        public a(@l AddressParameter.Value value, @l AddressType addressType) {
            this.f440654a = value;
            this.f440655b = addressType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f440654a, aVar.f440654a) && this.f440655b == aVar.f440655b;
        }

        public final int hashCode() {
            AddressParameter.Value value = this.f440654a;
            int iHashCode = (value == null ? 0 : value.hashCode()) * 31;
            AddressType addressType = this.f440655b;
            return iHashCode + (addressType != null ? addressType.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "DataLoaded(firstAddress=" + this.f440654a + ", addressType=" + this.f440655b + ')';
        }
    }

    /* compiled from: HistoricalSuggestsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvI/b$b;", "LvI/b;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12762b implements InterfaceC49217b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressParameter.Value f440656a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AddressType f440657b;

        public C12762b(@k AddressParameter.Value value, @l AddressType addressType) {
            this.f440656a = value;
            this.f440657b = addressType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12762b)) {
                return false;
            }
            C12762b c12762b = (C12762b) obj;
            return L.f(this.f440656a, c12762b.f440656a) && this.f440657b == c12762b.f440657b;
        }

        public final int hashCode() {
            int iHashCode = this.f440656a.hashCode() * 31;
            AddressType addressType = this.f440657b;
            return iHashCode + (addressType == null ? 0 : addressType.hashCode());
        }

        @k
        public final String toString() {
            return "Select(address=" + this.f440656a + ", addressType=" + this.f440657b + ')';
        }
    }
}

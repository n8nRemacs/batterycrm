package zk;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lzk/b;", "", "a", "b", "Lzk/b$a;", "Lzk/b$b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zk.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC50578b {

    /* compiled from: B2bBusinessTripInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/b$a;", "Lzk/b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zk.b$a */
    public static final /* data */ class a implements InterfaceC50578b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444199a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 855005906;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: B2bBusinessTripInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzk/b$b;", "Lzk/b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zk.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12971b implements InterfaceC50578b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectItemsInfo f444200a;

        public C12971b(@k SelectItemsInfo selectItemsInfo) {
            this.f444200a = selectItemsInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12971b) && L.f(this.f444200a, ((C12971b) obj).f444200a);
        }

        public final int hashCode() {
            return this.f444200a.hashCode();
        }

        @k
        public final String toString() {
            return "GoToSelectItems(selectInfo=" + this.f444200a + ')';
        }
    }
}

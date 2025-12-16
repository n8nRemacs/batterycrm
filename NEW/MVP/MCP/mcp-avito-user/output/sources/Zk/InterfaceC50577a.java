package zk;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lzk/a;", "", "a", "b", "c", "Lzk/a$a;", "Lzk/a$b;", "Lzk/a$c;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC50577a {

    /* compiled from: B2bBusinessTripInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzk/a$a;", "Lzk/a;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zk.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12970a implements InterfaceC50577a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectItemsInfo f444196a;

        public C12970a(@k SelectItemsInfo selectItemsInfo) {
            this.f444196a = selectItemsInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12970a) && L.f(this.f444196a, ((C12970a) obj).f444196a);
        }

        public final int hashCode() {
            return this.f444196a.hashCode();
        }

        @k
        public final String toString() {
            return "ContinueButtonClicked(selectInfo=" + this.f444196a + ')';
        }
    }

    /* compiled from: B2bBusinessTripInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/a$b;", "Lzk/a;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zk.a$b */
    public static final /* data */ class b implements InterfaceC50577a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f444197a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1397457715;
        }

        @k
        public final String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* compiled from: B2bBusinessTripInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/a$c;", "Lzk/a;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zk.a$c */
    public static final /* data */ class c implements InterfaceC50577a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f444198a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -399713030;
        }

        @k
        public final String toString() {
            return "OnRetryClicked";
        }
    }
}

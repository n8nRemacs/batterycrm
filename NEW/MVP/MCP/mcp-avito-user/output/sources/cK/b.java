package CK;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.socket_subscription.app_startup_task.CallDeliveredBySocketMessage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacSocketSubscriptionDialerMediatorAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LCK/b;", "", "a", "b", "LCK/b$a;", "LCK/b$b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: IacSocketSubscriptionDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCK/b$a;", "LCK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CallDeliveredBySocketMessage f2081a;

        public a(@k CallDeliveredBySocketMessage callDeliveredBySocketMessage) {
            this.f2081a = callDeliveredBySocketMessage;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f2081a, ((a) obj).f2081a);
        }

        public final int hashCode() {
            return this.f2081a.hashCode();
        }

        @k
        public final String toString() {
            return "OnCallDeliveredBySocket(message=" + this.f2081a + ')';
        }
    }

    /* compiled from: IacSocketSubscriptionDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCK/b$b;", "LCK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: CK.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0102b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final IacPiiString f2082a;

        public C0102b(@k IacPiiString iacPiiString) {
            this.f2082a = iacPiiString;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0102b) && L.f(this.f2082a, ((C0102b) obj).f2082a);
        }

        public final int hashCode() {
            return this.f2082a.hashCode();
        }

        @k
        public final String toString() {
            return "OnSocketMessage(json=" + this.f2082a + ')';
        }
    }
}

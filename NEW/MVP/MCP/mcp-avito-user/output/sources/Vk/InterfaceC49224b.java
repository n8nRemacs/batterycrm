package vK;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.push_handler.IacVoipPush;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacPushHandlerDialerMediatorAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LvK/b;", "", "a", "LvK/b$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vK.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49224b {

    /* compiled from: IacPushHandlerDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvK/b$a;", "LvK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vK.b$a */
    public static final /* data */ class a implements InterfaceC49224b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final IacVoipPush f440681a;

        public a(@k IacVoipPush iacVoipPush) {
            this.f440681a = iacVoipPush;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f440681a, ((a) obj).f440681a);
        }

        public final int hashCode() {
            return this.f440681a.hashCode();
        }

        @k
        public final String toString() {
            return "OnIncomingCallPushViaProvider(push=" + this.f440681a + ')';
        }
    }
}

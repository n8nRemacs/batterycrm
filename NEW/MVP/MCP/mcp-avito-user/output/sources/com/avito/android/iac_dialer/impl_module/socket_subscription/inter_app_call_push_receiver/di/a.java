package com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di;

import com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.IacInterAppCallPushReceiver;
import com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.b;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerIacInterAppCallPushReceiverComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacInterAppCallPushReceiverComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.b.a
        public final com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.b a(com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerIacInterAppCallPushReceiverComponent.java */
    public static final class c implements com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.c f166379a;

        public c(com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.c cVar, C4939a c4939a) {
            this.f166379a = cVar;
        }

        @Override // com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.b
        public final void a(IacInterAppCallPushReceiver iacInterAppCallPushReceiver) {
            CK.a aVarMc = this.f166379a.Mc();
            t.c(aVarMc);
            iacInterAppCallPushReceiver.f166378a = aVarMc;
        }
    }

    public static b.a a() {
        return new b();
    }
}

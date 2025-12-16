package com.avito.android.analytics.clickstream;

import androidx.work.F;
import com.avito.android.analytics.clickstream.H;
import com.avito.android.analytics.inhouse_transport.A;
import com.avito.android.certificate_pinning.NetworkState;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_outgoing_call_ability.impl_module.can_call.IacCanCallInteractorImpl;
import com.avito.android.messenger.conversation.mvi.file_upload.C32097u;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t;
import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.util.K5;
import com.avito.android.util.P2;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.time.Duration;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import uF.AbstractC48888a;
import uF.c;
import uF.d;
import uF.e;
import uF.f;
import vW.t;
import yW.AbstractC50189b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class I implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89749b;

    public /* synthetic */ I(int i12) {
        this.f89749b = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f89749b) {
            case 0:
                return th2 instanceof IOException ? new H.c.a(th2) : new H.c.C2665c(th2);
            case 1:
                return ShortTask.Status.f274031c;
            case 2:
                Duration duration = com.avito.android.analytics.statsd.L.f91038e;
                return th2 instanceof IOException ? new A.a(null) : new A.c(th2);
            case 3:
                return Boolean.TRUE;
            case 4:
                return new F.a.b();
            case 5:
                return Boolean.FALSE;
            case 6:
                return new P2.a(com.avito.android.remote.error.j.d(2, "Failed when try to write bitmap to file"));
            case 7:
                return new P2.a(com.avito.android.remote.error.j.d(2, "Can't decode file from disk"));
            case 8:
                return new P2.a(com.avito.android.remote.error.j.d(2, "Failed when try save image to file"));
            case 9:
                return new P2.a(com.avito.android.remote.error.j.d(2, "Can't decode file from disk"));
            case 10:
                return th2 instanceof IOException ? new NetworkState(3L, null, 2, null) : new NetworkState(4L, null, 2, null);
            case 11:
                return K5.c(th2) ? new NetworkState(2L, null, 2, null) : K5.e(th2) ? new NetworkState(3L, null, 2, null) : new NetworkState(4L, null, 2, null);
            case 12:
                return P0.c();
            case 13:
                return C42784z0.f406748b;
            case 14:
                return C42784z0.f406748b;
            case 15:
                return SendPushTokenInteractor.TokenRegistrationResult.f246087c;
            case 16:
                int i12 = IacCanCallInteractorImpl.f168511m;
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacCanCallInteractor", "Can't call: canCall", th2);
                return new IacCanCallResult.CanNot(null, null, 3, null);
            case 17:
                int i13 = IacCanCallInteractorImpl.f168511m;
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacCanCallInteractor", "Can't call: canCall", th2);
                return new IacCanCallResult.CanNot(null, null, 3, null);
            case 18:
                int i14 = IacCanCallInteractorImpl.f168511m;
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacCanCallInteractor", "Can't call: canCall", th2);
                return new IacCanCallResult.CanNot(null, null, 3, null);
            case 19:
                return new t.a(null, 1, null);
            case 20:
                return e.b.f439869a;
            case 21:
                return new f.b();
            case 22:
                return new d.b(th2);
            case 23:
                return new c.a();
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return new AbstractC48888a.b();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new AbstractC50189b.a();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return C42784z0.f406748b;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return P0.c();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i15 = C32097u.f191231i;
                return new InterfaceC32095t.a.C5648a(th2);
            default:
                int i16 = C32097u.f191231i;
                return new InterfaceC32095t.b.a(th2);
        }
    }
}

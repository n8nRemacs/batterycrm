package com.avito.android.quic.cronet;

import com.avito.android.quic.cronet.CronetException;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.chromium.net.NetworkException;

/* compiled from: CronetExceptionsConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/quic/cronet/CronetException;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class n extends N implements Y41.l<Throwable, CronetException> {

    /* renamed from: l, reason: collision with root package name */
    public static final n f246219l = new n();

    public n() {
        super(1);
    }

    @Override // Y41.l
    public final CronetException invoke(Throwable th2) {
        CronetException hostnameNotResolved;
        Throwable th3 = th2;
        CronetException.f246178b.getClass();
        if (!(th3 instanceof NetworkException)) {
            return null;
        }
        NetworkException networkException = (NetworkException) th3;
        if (networkException.getCronetInternalErrorCode() != -101) {
            switch (networkException.getErrorCode()) {
                case 1:
                    hostnameNotResolved = new CronetException.HostnameNotResolved(networkException, null);
                    break;
                case 2:
                    hostnameNotResolved = new CronetException.InternetDisconnected(networkException, null);
                    break;
                case 3:
                    hostnameNotResolved = new CronetException.NetworkChanged(networkException, null);
                    break;
                case 4:
                    hostnameNotResolved = new CronetException.TimedOut(networkException, null);
                    break;
                case 5:
                    hostnameNotResolved = new CronetException.ConnectionClosed(networkException, null);
                    break;
                case 6:
                    hostnameNotResolved = new CronetException.ConnectionTimedOut(networkException, null);
                    break;
                case 7:
                    hostnameNotResolved = new CronetException.ConnectionRefused(networkException, null);
                    break;
                case 8:
                    hostnameNotResolved = new CronetException.ConnectionReset(networkException, null);
                    break;
                case 9:
                    hostnameNotResolved = new CronetException.AddressUnreachable(networkException, null);
                    break;
                case 10:
                    hostnameNotResolved = new CronetException.QuicProtocolFailed(networkException, null);
                    break;
                case 11:
                    hostnameNotResolved = new CronetException.Other(networkException, null);
                    break;
                default:
                    hostnameNotResolved = new CronetException.Other(networkException, null);
                    break;
            }
        } else {
            hostnameNotResolved = new CronetException.TcpReset(networkException, null);
        }
        return hostnameNotResolved;
    }
}

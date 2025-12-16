package ru.ok.android.externcalls.sdk.net.internal;

import defpackage.dea;
import defpackage.jg0;
import defpackage.k01;
import defpackage.mdg;
import defpackage.qdg;
import kotlin.Metadata;
import org.webrtc.NetworkMonitor;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/NetworkConnectionManagerImpl;", "Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "Lk01;", "call", "<init>", "(Lk01;)V", "Ljg0;", "callback", "Lqqg;", "registerBadConnectionCallback", "(Ljg0;)V", "unregisterBadConnectionCallback", "Ldea;", "listener", "addNetworkConnectivityListener", "(Ldea;)V", "removeNetworkConnectivityListener", "Lqdg;", "plusAssign", "(Lqdg;)V", "minusAssign", "Lk01;", "Lmdg;", "getTopology", "()Lmdg;", "topology", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkConnectionManagerImpl implements NetworkConnectionManager {
    private final k01 call;

    public NetworkConnectionManagerImpl(k01 k01Var) {
        this.call = k01Var;
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void addNetworkConnectivityListener(dea listener) {
        if (this.call.l0.add(listener)) {
            NetworkMonitor.isOnline();
            listener.a();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public mdg getTopology() {
        return this.call.o0.v();
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void minusAssign(qdg listener) {
        this.call.m0.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void plusAssign(qdg listener) {
        this.call.m0.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void registerBadConnectionCallback(jg0 callback) {
        k01 k01Var = this.call;
        if (k01Var.R) {
            k01Var.Q.k.add(callback);
        } else {
            k01Var.P.log("OKRTCCall", "Using registerBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void removeNetworkConnectivityListener(dea listener) {
        this.call.l0.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.net.NetworkConnectionManager
    public void unregisterBadConnectionCallback(jg0 callback) {
        k01 k01Var = this.call;
        if (k01Var.R) {
            k01Var.Q.k.remove(callback);
        } else {
            k01Var.P.log("OKRTCCall", "Using unregisterBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }
}

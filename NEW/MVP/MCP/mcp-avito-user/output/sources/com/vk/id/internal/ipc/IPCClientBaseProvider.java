package com.vk.id.internal.ipc;

import Y61.k;
import Y61.l;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.Signature;
import android.os.IBinder;
import androidx.camera.core.impl.r0;
import androidx.camera.core.internal.compat.workaround.e;
import androidx.compose.runtime.internal.P;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: IPCClientBaseProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0004R\"\u0010\"\u001a\u00020!8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010+\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R,\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/vk/id/internal/ipc/IPCClientBaseProvider;", "T", "", "<init>", "()V", "Lcom/vk/id/internal/ipc/ConnectionInfo;", "connectionInfo", "", "startTime", "timeout", "", "waitForConnection", "(Lcom/vk/id/internal/ipc/ConnectionInfo;JJ)Z", "calculateActualTimeout", "(JJ)J", "Landroid/os/IBinder;", "service", "Lkotlin/G0;", "setProvider", "(Lcom/vk/id/internal/ipc/ConnectionInfo;Landroid/os/IBinder;)V", "Landroid/content/ComponentName;", "component", "getProvider", "(Landroid/content/ComponentName;JJ)Ljava/lang/Object;", "Landroid/content/pm/Signature;", "getSignature", "()Landroid/content/pm/Signature;", "prepareSpecificApp", "(Landroid/content/ComponentName;)Lcom/vk/id/internal/ipc/ConnectionInfo;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "getLogger$annotations", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "providerComparator", "Ljava/util/Comparator;", "getProviderComparator", "()Ljava/util/Comparator;", "componentComparator", "getComponentComparator", "Ljava/util/concurrent/ConcurrentHashMap;", "connectionsMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getConnectionsMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "getIntentName", "()Ljava/lang/String;", "intentName", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class IPCClientBaseProvider<T> {
    public Context appContext;

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("IPCClientBaseProvider");

    @k
    private final Comparator<String> providerComparator = new r0(8);

    @k
    private final Comparator<ComponentName> componentComparator = new e(this, 1);

    @k
    private final ConcurrentHashMap<ComponentName, ConnectionInfo<T>> connectionsMap = new ConcurrentHashMap<>();

    private final long calculateActualTimeout(long startTime, long timeout) {
        return Math.max(timeout - (System.currentTimeMillis() - startTime), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int componentComparator$lambda$1(IPCClientBaseProvider iPCClientBaseProvider, ComponentName componentName, ComponentName componentName2) {
        return iPCClientBaseProvider.providerComparator.compare(componentName != null ? componentName.getPackageName() : null, componentName2 != null ? componentName2.getPackageName() : null);
    }

    private final <T> boolean waitForConnection(ConnectionInfo<T> connectionInfo, long startTime, long timeout) {
        try {
            return connectionInfo.getLatch().await(calculateActualTimeout(startTime, timeout), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e12) {
            this.logger.error("Interrupted wait for connection", e12);
            return false;
        }
    }

    @k
    public Context getAppContext() {
        Context context = this.appContext;
        if (context != null) {
            return context;
        }
        return null;
    }

    @k
    public final ConcurrentHashMap<ComponentName, ConnectionInfo<T>> getConnectionsMap() {
        return this.connectionsMap;
    }

    @k
    public abstract String getIntentName();

    @l
    public final T getProvider(@k ComponentName component, long startTime, long timeout) {
        int i12 = 3;
        T provider = null;
        while (provider == null) {
            int i13 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            ConnectionInfo<T> connectionInfoPrepareSpecificApp = prepareSpecificApp(component);
            if (connectionInfoPrepareSpecificApp != null) {
                provider = connectionInfoPrepareSpecificApp.getProvider();
                if (provider != null) {
                    break;
                }
                if (!waitForConnection(connectionInfoPrepareSpecificApp, startTime, timeout)) {
                    return null;
                }
                T provider2 = connectionInfoPrepareSpecificApp.getProvider();
                if (provider2 != null) {
                    provider = provider2;
                } else {
                    ConnectionInfo<T> connectionInfo = this.connectionsMap.get(component);
                    if (connectionInfo != null) {
                        provider2 = connectionInfo.getProvider();
                        provider = provider2;
                    } else {
                        provider = null;
                    }
                }
            }
            i12 = i13;
        }
        return provider;
    }

    @l
    public final Signature getSignature() {
        Signature[] signatureArr = getAppContext().getPackageManager().getPackageInfo(getAppContext().getPackageName(), 64).signatures;
        if (signatureArr.length == 0) {
            return null;
        }
        return signatureArr[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final ConnectionInfo<T> prepareSpecificApp(@k final ComponentName component) {
        boolean zBindService;
        final l0.h hVar = new l0.h();
        ConnectionInfo<T> connectionInfo = this.connectionsMap.get(component);
        hVar.f406842b = connectionInfo;
        ConnectionInfo<T> connectionInfo2 = connectionInfo;
        if ((connectionInfo2 != null ? connectionInfo2.getProvider() : null) != null) {
            return (ConnectionInfo) hVar.f406842b;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        T t12 = hVar.f406842b;
        if (t12 == null) {
            T t13 = (T) new ConnectionInfo(countDownLatch, new ServiceConnection(this) { // from class: com.vk.id.internal.ipc.IPCClientBaseProvider$prepareSpecificApp$connection$1
                final /* synthetic */ IPCClientBaseProvider<T> this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    ConnectionInfo connectionInfo3 = (ConnectionInfo) this.this$0.getConnectionsMap().get(component);
                    if (connectionInfo3 != null) {
                        IPCClientBaseProvider<T> iPCClientBaseProvider = this.this$0;
                        l0.h<ConnectionInfo<T>> hVar2 = hVar;
                        synchronized (connectionInfo3.getLock()) {
                            iPCClientBaseProvider.setProvider((ConnectionInfo) hVar2.f406842b, service);
                            connectionInfo3.setConnectionState(1);
                            connectionInfo3.getLatch().countDown();
                            G0 g02 = G0.f406611a;
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                    ConnectionInfo connectionInfo3 = (ConnectionInfo) this.this$0.getConnectionsMap().get(component);
                    if (connectionInfo3 != null) {
                        synchronized (connectionInfo3.getLock()) {
                            connectionInfo3.setProvider(null);
                            connectionInfo3.setConnectionState(2);
                            G0 g02 = G0.f406611a;
                        }
                    }
                }
            });
            hVar.f406842b = t13;
            this.connectionsMap.put(component, t13);
        } else {
            synchronized (((ConnectionInfo) t12).getLock()) {
                try {
                    if (((ConnectionInfo) hVar.f406842b).getConnectionState() != 0 && ((ConnectionInfo) hVar.f406842b).getConnectionState() != 1 && ((ConnectionInfo) hVar.f406842b).getConnectionState() == 2) {
                        ((ConnectionInfo) hVar.f406842b).getLatch().countDown();
                        ((ConnectionInfo) hVar.f406842b).setLatch(countDownLatch);
                    }
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (((ConnectionInfo) hVar.f406842b).getLock()) {
            zBindService = false;
            ((ConnectionInfo) hVar.f406842b).setConnectionState(0);
            G0 g03 = G0.f406611a;
        }
        try {
            zBindService = getAppContext().bindService(new Intent(getIntentName()).setComponent(component), ((ConnectionInfo) hVar.f406842b).getConnection(), 1);
        } catch (Exception e12) {
            this.logger.error("Error while binding to " + component.getPackageName(), e12);
        }
        if (zBindService) {
            return (ConnectionInfo) hVar.f406842b;
        }
        return null;
    }

    public abstract void setProvider(@l ConnectionInfo<T> connectionInfo, @l IBinder service);
}

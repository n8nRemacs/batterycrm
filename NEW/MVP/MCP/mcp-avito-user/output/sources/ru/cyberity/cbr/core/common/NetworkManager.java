package ru.cyberity.cbr.core.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.telephony.TelephonyManager;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NetworkManager.kt */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0006*\u0001\u001e\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000fJ)\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0007\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u0007\u0010\u001c\"\u0004\b\u0007\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/cyberity/cbr/core/common/NetworkManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/cyberity/cbr/core/common/NetworkManager$NetworkType;", "a", "(Landroid/content/Context;)Lru/cyberity/cbr/core/common/NetworkManager$NetworkType;", "", "dataNetworkType", "(I)Lru/cyberity/cbr/core/common/NetworkManager$NetworkType;", "", "permission", "", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lkotlin/Function1;", "Lkotlin/G0;", "availableListener", "(Landroid/content/Context;LY41/l;)V", "c", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "b", "Lkotlin/C;", "()Landroid/net/ConnectivityManager;", "connectivityManager", "LY41/l;", "()LY41/l;", "(LY41/l;)V", "ru/cyberity/cbr/core/common/NetworkManager$b", "d", "Lru/cyberity/cbr/core/common/NetworkManager$b;", "networkCallback", "NetworkType", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class NetworkManager {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private Y41.l<? super NetworkType, G0> availableListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C connectivityManager = C42727D.c(new a());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final b networkCallback = new b();

    /* compiled from: NetworkManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/common/NetworkManager$NetworkType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "OTHER", "WIFI", "MOBILE", "ETHERNET", "M_2G", "M_3G", "M_4G", "M_5G", "LTE", "NONE", "NO_PERMISSION", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum NetworkType {
        OTHER("Other"),
        WIFI("WiFi"),
        MOBILE("Mobile"),
        ETHERNET("Ethernet"),
        M_2G("2G"),
        M_3G("3G"),
        M_4G("4G"),
        M_5G("5G"),
        LTE("LTE"),
        NONE("None"),
        NO_PERMISSION("No permission");


        @Y61.k
        private final String type;

        NetworkType(String str) {
            this.type = str;
        }

        @Y61.k
        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: NetworkManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/net/ConnectivityManager;", "a", "()Landroid/net/ConnectivityManager;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<ConnectivityManager> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConnectivityManager invoke() {
            Context context = NetworkManager.this.context;
            return (ConnectivityManager) (context != null ? context.getSystemService("connectivity") : null);
        }
    }

    /* compiled from: NetworkManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/cyberity/cbr/core/common/NetworkManager$b", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Lkotlin/G0;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@Y61.k Network network) {
            super.onAvailable(network);
            try {
                Y41.l<NetworkType, G0> lVarA = NetworkManager.this.a();
                if (lVarA != null) {
                    NetworkManager networkManager = NetworkManager.this;
                    lVarA.invoke(networkManager.a(networkManager.context));
                }
            } catch (Throwable th2) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Ooops", th2);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@Y61.k Network network) {
            super.onLost(network);
            try {
                Y41.l<NetworkType, G0> lVarA = NetworkManager.this.a();
                if (lVarA != null) {
                    NetworkManager networkManager = NetworkManager.this;
                    lVarA.invoke(networkManager.a(networkManager.context));
                }
            } catch (Throwable th2) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Ooops", th2);
            }
        }
    }

    private final ConnectivityManager b() {
        return (ConnectivityManager) this.connectivityManager.getValue();
    }

    public final void c() {
        ConnectivityManager connectivityManagerB;
        try {
            Context context = this.context;
            if (context == null || !a(context, "android.permission.CHANGE_NETWORK_STATE") || (connectivityManagerB = b()) == null) {
                return;
            }
            connectivityManagerB.unregisterNetworkCallback(this.networkCallback);
        } catch (Exception e12) {
            ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Can't stop network manager", e12);
        }
    }

    @Y61.l
    public final Y41.l<NetworkType, G0> a() {
        return this.availableListener;
    }

    public final void a(@Y61.k Context context, @Y61.k Y41.l<? super NetworkType, G0> availableListener) {
        this.context = context;
        try {
            if (!a(context, "android.permission.CHANGE_NETWORK_STATE")) {
                availableListener.invoke(NetworkType.NO_PERMISSION);
            } else {
                this.availableListener = availableListener;
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
                ConnectivityManager connectivityManagerB = b();
                if (connectivityManagerB != null) {
                    connectivityManagerB.requestNetwork(networkRequestBuild, this.networkCallback);
                }
            }
        } catch (Throwable th2) {
            ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Can't start network manager", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final NetworkType a(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            if (context == null) {
                return NetworkType.NONE;
            }
            if (!a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                return NetworkType.NO_PERMISSION;
            }
            ConnectivityManager connectivityManagerB = b();
            if (connectivityManagerB != null && (activeNetwork = connectivityManagerB.getActiveNetwork()) != null) {
                ConnectivityManager connectivityManagerB2 = b();
                if (connectivityManagerB2 != null && (networkCapabilities = connectivityManagerB2.getNetworkCapabilities(activeNetwork)) != null) {
                    if (networkCapabilities.hasTransport(1)) {
                        return NetworkType.WIFI;
                    }
                    if (networkCapabilities.hasTransport(3)) {
                        return NetworkType.ETHERNET;
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        if (a(context, "android.permission.READ_PHONE_STATE")) {
                            return a(((TelephonyManager) context.getSystemService("phone")).getDataNetworkType());
                        }
                        return NetworkType.NONE;
                    }
                    return NetworkType.OTHER;
                }
                return NetworkType.NONE;
            }
            return NetworkType.OTHER;
        } catch (Throwable unused) {
            ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Error while getting network type", null, 4, null);
            return NetworkType.NONE;
        }
    }

    private final NetworkType a(int dataNetworkType) {
        switch (dataNetworkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.M_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.M_3G;
            case 13:
                return NetworkType.LTE;
            case 18:
                return NetworkType.M_4G;
            case 19:
            default:
                return NetworkType.OTHER;
            case 20:
                return NetworkType.M_5G;
        }
    }

    private final boolean a(Context context, String permission) {
        return androidx.core.content.d.checkSelfPermission(context, permission) == 0;
    }
}

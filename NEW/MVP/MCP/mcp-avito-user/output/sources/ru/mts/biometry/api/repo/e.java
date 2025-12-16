package ru.mts.biometry.api.repo;

import Y61.k;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* compiled from: VpnConnectionRepo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/mts/biometry/api/repo/e;", "Lru/mts/biometry/api/repo/c;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f436360a = C42727D.c(new a());

    /* renamed from: b, reason: collision with root package name */
    public boolean f436361b;

    /* compiled from: VpnConnectionRepo.kt */
    @Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"ru/mts/biometry/api/repo/d", "invoke", "()Lru/mts/biometry/api/repo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<d> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final d invoke() {
            return new d(e.this);
        }
    }

    @Override // ru.mts.biometry.api.repo.c
    public final void a(@k BiometryActivity biometryActivity) {
        ConnectivityManager connectivityManager = (ConnectivityManager) biometryActivity.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback((d) this.f436360a.getValue());
        }
    }

    @Override // ru.mts.biometry.api.repo.c
    /* renamed from: b, reason: from getter */
    public final boolean getF436361b() {
        return this.f436361b;
    }

    @Override // ru.mts.biometry.api.repo.c
    public final void c(@k BiometryActivity biometryActivity) {
        ConnectivityManager connectivityManager = (ConnectivityManager) biometryActivity.getSystemService(ConnectivityManager.class);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().removeCapability(15).addTransportType(4).build();
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(networkRequestBuild, (d) this.f436360a.getValue());
        }
    }
}

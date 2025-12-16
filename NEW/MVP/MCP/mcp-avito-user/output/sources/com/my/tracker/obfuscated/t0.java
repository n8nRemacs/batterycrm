package com.my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes7.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private int f365827a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f365828b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f365829c;

    public void a(Context context) {
        this.f365827a = -1;
        this.f365828b = -1;
        this.f365829c = null;
        if (w0.a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        this.f365827a = 2;
                    } else if (type != 1) {
                        this.f365827a = 1;
                    } else {
                        this.f365827a = 3;
                    }
                    this.f365829c = activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
                }
            } catch (SecurityException unused) {
                e2.a("No permissions for access to network state");
            }
        }
        if (w0.a() || !w0.a("android.permission.BLUETOOTH", context)) {
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                this.f365828b = defaultAdapter.isEnabled() ? 1 : 0;
            }
        } catch (SecurityException unused2) {
            e2.a("Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
        }
    }

    public void a(a1 a1Var, Context context) {
        a1Var.a(this.f365827a, this.f365829c);
        int i12 = this.f365828b;
        if (i12 != -1) {
            a1Var.g(i12);
        }
    }

    public void b(Context context) {
    }
}

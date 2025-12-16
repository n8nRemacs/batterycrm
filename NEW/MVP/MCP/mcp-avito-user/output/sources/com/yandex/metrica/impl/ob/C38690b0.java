package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.yandex.metrica.impl.ob.b0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38690b0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final BroadcastReceiver f380140a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f380141b = false;

    /* renamed from: com.yandex.metrica.impl.ob.b0$a */
    public static class a {
        @j.N
        public C38690b0 a(@j.P BroadcastReceiver broadcastReceiver) {
            return new C38690b0(broadcastReceiver);
        }
    }

    public C38690b0(@j.P BroadcastReceiver broadcastReceiver) {
        this.f380140a = broadcastReceiver;
    }

    @j.P
    public synchronized Intent a(@j.N Context context, @j.N IntentFilter intentFilter) {
        Intent intentRegisterReceiver;
        try {
            intentRegisterReceiver = context.registerReceiver(this.f380140a, intentFilter);
            try {
                this.f380141b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intentRegisterReceiver = null;
        }
        return intentRegisterReceiver;
    }

    public synchronized void a(@j.N Context context) {
        if (this.f380141b) {
            try {
                context.unregisterReceiver(this.f380140a);
                this.f380141b = false;
            } catch (Throwable unused) {
            }
        }
    }
}

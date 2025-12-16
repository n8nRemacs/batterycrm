package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* loaded from: classes7.dex */
public class Kl extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38936km<Context, Intent> f378709a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f378710b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f378711a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f378712b;

        public a(Context context, Intent intent) {
            this.f378711a = context;
            this.f378712b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Kl.this.f378709a.a(this.f378711a, this.f378712b);
        }
    }

    public Kl(@j.N InterfaceC38936km<Context, Intent> interfaceC38936km, @j.N ICommonExecutor iCommonExecutor) {
        this.f378709a = interfaceC38936km;
        this.f378710b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f378710b.execute(new a(context, intent));
    }
}

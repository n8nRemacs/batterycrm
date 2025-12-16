package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C38690b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class J2 implements InterfaceC38941l2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38961lm<Context, Intent, Void>> f378554a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f378555b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f378556c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Context f378557d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38690b0 f378558e;

    public class a implements InterfaceC38936km<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38936km
        public void a(Context context, Intent intent) {
            J2.a(J2.this, context, intent);
        }
    }

    public J2(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, new C38690b0.a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public synchronized void a() {
        this.f378556c = true;
        if (!this.f378554a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f378558e.a(this.f378557d, intentFilter);
            this.f378555b = true;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public synchronized void b() {
        this.f378556c = false;
        if (this.f378555b) {
            this.f378558e.a(this.f378557d);
            this.f378555b = false;
        }
    }

    @j.k0
    public J2(@j.N Context context, @j.N ICommonExecutor iCommonExecutor, @j.N C38690b0.a aVar) {
        this.f378554a = new ArrayList();
        this.f378555b = false;
        this.f378556c = false;
        this.f378557d = context;
        this.f378558e = aVar.a(new Kl(new a(), iCommonExecutor));
    }

    public synchronized void b(@j.N InterfaceC38961lm<Context, Intent, Void> interfaceC38961lm) {
        this.f378554a.remove(interfaceC38961lm);
        if (this.f378554a.isEmpty() && this.f378555b) {
            this.f378558e.a(this.f378557d);
            this.f378555b = false;
        }
    }

    public synchronized void a(@j.N InterfaceC38961lm<Context, Intent, Void> interfaceC38961lm) {
        this.f378554a.add(interfaceC38961lm);
        if (this.f378556c && !this.f378555b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f378558e.a(this.f378557d, intentFilter);
            this.f378555b = true;
        }
    }

    public static void a(J2 j22, Context context, Intent intent) {
        synchronized (j22) {
            Iterator<InterfaceC38961lm<Context, Intent, Void>> it = j22.f378554a.iterator();
            while (it.hasNext()) {
                it.next().a(context, intent);
            }
        }
    }
}

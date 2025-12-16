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
public class C implements InterfaceC38941l2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<InterfaceC38986mm<Intent>> f377869a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private Intent f377870b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Context f377871c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38690b0 f377872d;

    public class a implements InterfaceC38936km<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38936km
        public void a(Context context, Intent intent) {
            Intent intent2 = intent;
            synchronized (C.this) {
                C.this.f377870b = intent2;
                C.this.a(intent2);
            }
        }
    }

    public C(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, new C38690b0.a());
    }

    @j.P
    public synchronized Intent c(@j.N InterfaceC38986mm<Intent> interfaceC38986mm) {
        this.f377869a.add(interfaceC38986mm);
        return this.f377870b;
    }

    @j.k0
    public C(@j.N Context context, @j.N ICommonExecutor iCommonExecutor, @j.N C38690b0.a aVar) {
        this.f377869a = new ArrayList();
        this.f377870b = null;
        this.f377871c = context;
        this.f377872d = aVar.a(new Kl(new a(), iCommonExecutor));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public synchronized void a() {
        Intent intentA = this.f377872d.a(this.f377871c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f377870b = intentA;
        a(intentA);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38941l2
    public synchronized void b() {
        this.f377870b = null;
        this.f377872d.a(this.f377871c);
        a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@j.P Intent intent) {
        Iterator<InterfaceC38986mm<Intent>> it = this.f377869a.iterator();
        while (it.hasNext()) {
            it.next().b(intent);
        }
    }
}

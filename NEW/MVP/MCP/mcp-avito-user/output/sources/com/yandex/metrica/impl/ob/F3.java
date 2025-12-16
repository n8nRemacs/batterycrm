package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.adjust.sdk.Constants;
import com.yandex.metrica.impl.ob.D3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class F3 implements P3, InterfaceC38932ki, R3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378119a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I3 f378120b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38783ei f378121c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39104ri f378122d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38719c4 f378123e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39241xb f378124f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final N4<M4, F3> f378125g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final C39208w2<F3> f378126h;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final J3 f378128j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private Jf f378129k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final M f378130l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final C39174ug f378131m;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private List<V0> f378127i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private final Object f378132n = new Object();

    public class a implements InterfaceC38731cg {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResultReceiver f378133a;

        public a(F3 f32, ResultReceiver resultReceiver) {
            this.f378133a = resultReceiver;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38731cg
        public void a(@j.P C38756dg c38756dg) {
            ResultReceiver resultReceiver = this.f378133a;
            int i12 = ResultReceiverC38781eg.f380489b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray(Constants.REFERRER, c38756dg == null ? null : c38756dg.a());
                resultReceiver.send(1, bundle);
            }
        }
    }

    @j.k0
    public F3(@j.N Context context, @j.N C38783ei c38783ei, @j.N I3 i32, @j.N D3 d32, @j.N C38719c4 c38719c4, @j.N C39126sg c39126sg, @j.N J3 j32, @j.N H3 h32, @j.N N n12, @j.N C39241xb c39241xb, @j.N C39174ug c39174ug) {
        Context applicationContext = context.getApplicationContext();
        this.f378119a = applicationContext;
        this.f378120b = i32;
        this.f378121c = c38783ei;
        this.f378123e = c38719c4;
        this.f378128j = j32;
        this.f378125g = h32.a(this);
        C39104ri c39104riA = c38783ei.a(applicationContext, i32, d32.f377929a);
        this.f378122d = c39104riA;
        this.f378124f = c39241xb;
        c39241xb.a(applicationContext, c39104riA.d());
        this.f378130l = n12.a(c39104riA, c39241xb, applicationContext);
        this.f378126h = h32.a(this, c39104riA);
        this.f378131m = c39174ug;
        c38783ei.a(i32, this);
    }

    public void a(@j.N D3.a aVar) {
        this.f378123e.a(aVar);
    }

    public synchronized void b(@j.N C38993n4 c38993n4) {
        this.f378128j.b(c38993n4);
    }

    public synchronized void a(@j.N C38993n4 c38993n4) {
        this.f378128j.a(c38993n4);
        c38993n4.a(this.f378130l.a(Tl.a(this.f378122d.d().v())));
    }

    @j.N
    public Context b() {
        return this.f378119a;
    }

    public void a(@j.N C38715c0 c38715c0, @j.N C38993n4 c38993n4) {
        this.f378125g.a(c38715c0, c38993n4);
    }

    @j.N
    public D3.a a() {
        return this.f378123e.a();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public void a(@j.N C39057pi c39057pi) {
        this.f378124f.a(c39057pi);
        synchronized (this.f378132n) {
            try {
                Iterator<InterfaceC38918k4> it = this.f378128j.a().iterator();
                while (it.hasNext()) {
                    ((K) it.next()).a(this.f378130l.a(Tl.a(c39057pi.v())));
                }
                ArrayList arrayList = new ArrayList();
                for (V0 v02 : this.f378127i) {
                    if (v02.a(c39057pi)) {
                        a(v02.c(), v02.a());
                    } else {
                        arrayList.add(v02);
                    }
                }
                this.f378127i = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f378126h.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f378129k == null) {
            this.f378129k = F0.g().l();
        }
        this.f378129k.a(c39057pi);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public void a(@j.N EnumC38833gi enumC38833gi, @j.P C39057pi c39057pi) {
        synchronized (this.f378132n) {
            try {
                for (V0 v02 : this.f378127i) {
                    ResultReceiver resultReceiverC = v02.c();
                    L lA2 = this.f378130l.a(v02.a());
                    int i12 = ResultReceiverC38790f0.f380512b;
                    if (resultReceiverC != null) {
                        Bundle bundle = new Bundle();
                        enumC38833gi.a(bundle);
                        lA2.c(bundle);
                        resultReceiverC.send(2, bundle);
                    }
                }
                this.f378127i.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(@j.P V0 v02) {
        ResultReceiver resultReceiverC;
        Map<String, String> mapA;
        List<String> listB;
        HashMap map = new HashMap();
        if (v02 != null) {
            listB = v02.b();
            resultReceiverC = v02.c();
            mapA = v02.a();
        } else {
            resultReceiverC = null;
            mapA = map;
            listB = null;
        }
        boolean zA2 = this.f378122d.a(listB, mapA);
        if (!zA2) {
            a(resultReceiverC, mapA);
        }
        if (!this.f378122d.e()) {
            if (zA2) {
                a(resultReceiverC, mapA);
                return;
            }
            return;
        }
        synchronized (this.f378132n) {
            if (zA2 && v02 != null) {
                try {
                    this.f378127i.add(v02);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f378126h.d();
    }

    public void a(@j.P ResultReceiver resultReceiver) {
        this.f378131m.a(new a(this, resultReceiver));
    }

    @Override // com.yandex.metrica.impl.ob.R3
    public void a(@j.N D3 d32) {
        this.f378122d.a(d32.f377929a);
        this.f378123e.a(d32.f377930b);
    }

    private void a(@j.P ResultReceiver resultReceiver, @j.P Map<String, String> map) {
        L lA2 = this.f378130l.a(map);
        int i12 = ResultReceiverC38790f0.f380512b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            lA2.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}

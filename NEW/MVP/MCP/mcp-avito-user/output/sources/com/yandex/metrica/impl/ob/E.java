package com.yandex.metrica.impl.ob;

import android.content.Intent;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f377986a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private volatile b f377987b;

    /* renamed from: c, reason: collision with root package name */
    private final List<c> f377988c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC38986mm<Intent> f377989d;

    public class a implements InterfaceC38986mm<Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.P Intent intent) {
            Intent intent2 = intent;
            b bVar = E.this.f377987b;
            b.a aVar = bVar == null ? null : bVar.f377992b;
            b bVarA = E.this.a(intent2);
            E.this.f377987b = bVarA;
            if (aVar != bVarA.f377992b) {
                E.this.f377986a.execute(new D(this, bVarA));
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final Integer f377991a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final a f377992b;

        public enum a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);


            /* renamed from: a, reason: collision with root package name */
            private final int f377999a;

            a(int i12) {
                this.f377999a = i12;
            }

            public int a() {
                return this.f377999a;
            }

            public static a a(Integer num) {
                if (num != null) {
                    a[] aVarArrValues = values();
                    for (int i12 = 0; i12 < 5; i12++) {
                        a aVar = aVarArrValues[i12];
                        if (aVar.f377999a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }
        }

        public b(@j.P Integer num, @j.N a aVar) {
            this.f377991a = num;
            this.f377992b = aVar;
        }
    }

    public interface c {
        void a(@j.N b.a aVar);
    }

    public E(@j.N ICommonExecutor iCommonExecutor, @j.N C c12) {
        a aVar = new a();
        this.f377989d = aVar;
        this.f377986a = iCommonExecutor;
        this.f377987b = a(c12.c(aVar));
    }

    @j.N
    public b.a b() {
        b bVar = this.f377987b;
        return bVar == null ? b.a.UNKNOWN : bVar.f377992b;
    }

    @j.P
    public Integer a() {
        b bVar = this.f377987b;
        if (bVar == null) {
            return null;
        }
        return bVar.f377991a;
    }

    public synchronized void a(@j.N c cVar) {
        this.f377988c.add(cVar);
        ((C39075qc) cVar).a(b());
    }

    public static void a(E e12, b.a aVar) {
        synchronized (e12) {
            Iterator<c> it = e12.f377988c.iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @j.N
    public b a(@j.P Intent intent) {
        b.a aVar = b.a.UNKNOWN;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            aVar = b.a.NONE;
            if (intExtra3 == 1) {
                aVar = b.a.AC;
            } else if (intExtra3 == 2) {
                aVar = b.a.USB;
            } else if (intExtra3 == 4) {
                aVar = b.a.WIRELESS;
            }
        }
        return new b(numValueOf, aVar);
    }
}

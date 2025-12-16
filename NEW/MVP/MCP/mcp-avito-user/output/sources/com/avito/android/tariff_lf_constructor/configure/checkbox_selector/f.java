package com.avito.android.tariff_lf_constructor.configure.checkbox_selector;

import SK0.b;
import dI0.C39585a;
import dI0.C39587c;
import i91.C41256a;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C42745f0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import lD.C43617a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f299484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f299485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f299486d;

    public /* synthetic */ f(int i12, Object obj, Object obj2) {
        this.f299484b = i12;
        this.f299485c = obj;
        this.f299486d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List listSingletonList;
        switch (this.f299484b) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f299485c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof d) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    String str = (String) this.f299486d;
                    if (!zHasNext) {
                        List<d> listB0 = C42745f0.B0(arrayList3, new i(str));
                        ArrayList arrayList4 = new ArrayList();
                        for (d dVar : listB0) {
                            String f299462d = dVar.getF299462d();
                            if (f299462d == null || (listSingletonList = C42745f0.U(f299462d, dVar.getF317973b())) == null) {
                                listSingletonList = Collections.singletonList(dVar.getF317973b());
                            }
                            C42745f0.h(listSingletonList, arrayList4);
                        }
                        return arrayList4;
                    }
                    Object next = it.next();
                    if (C43066x.q(((d) next).getF299460b(), new C43059p("\\p{InCombiningDiacriticalMarks}+").f(Normalizer.normalize(str, Normalizer.Form.NFD), ""), true)) {
                        arrayList3.add(next);
                    }
                }
                break;
            case 1:
                throw null;
            case 2:
                C39587c c39587c = (C39587c) this.f299485c;
                C43617a c43617a = c39587c.f393779b;
                c43617a.getClass();
                kotlin.reflect.n<Object> nVar = C43617a.f413588V[32];
                if (!((Boolean) c43617a.f413596H.a().invoke()).booleanValue() || !((String) this.f299486d).equals("11")) {
                    return Boolean.FALSE;
                }
                b.a.a(c39587c.f393778a, new C39585a(), null, null, null, 14);
                return Boolean.TRUE;
            case 3:
                C41256a c41256a = (C41256a) this.f299485c;
                Y81.a aVar = (Y81.a) this.f299486d;
                Y81.a aVar2 = c41256a.f398408b;
                if (aVar2 != null) {
                    return aVar2;
                }
                synchronized (c41256a.f398407a) {
                    Y81.a aVar3 = c41256a.f398408b;
                    if (aVar3 == null) {
                        c41256a.f398408b = aVar;
                    } else {
                        aVar = aVar3;
                    }
                }
                return aVar;
            default:
                return ru.cyberity.input.tools.threading.safe.c.a((AtomicReference) this.f299485c, (Y41.a) this.f299486d);
        }
    }

    public /* synthetic */ f(ArrayList arrayList, j jVar, String str) {
        this.f299484b = 0;
        this.f299485c = arrayList;
        this.f299486d = str;
    }
}

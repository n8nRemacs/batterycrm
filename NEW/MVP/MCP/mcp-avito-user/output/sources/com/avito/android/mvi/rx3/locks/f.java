package com.avito.android.mvi.rx3.locks;

import Y41.p;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RxExecutor.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/rx3/concurrent/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f207059b;

    public f(e eVar) {
        this.f207059b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        e eVar = this.f207059b;
        boolean z12 = eVar.f207044d;
        String str = eVar.f207042b;
        p<String, String, G0> pVar = eVar.f207045e;
        if (z12) {
            pVar.invoke(str, "processOpQueueFromTheHead()");
        }
        AbstractCollection abstractCollection = eVar.f207049i;
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            pVar.invoke(str, "attemptToStartOperation " + cVar2);
            StringBuilder sb2 = new StringBuilder("attemptToStartOperation contestingOperations=");
            LinkedList<c<KeyT>> linkedList = eVar.f207050j;
            sb2.append(linkedList);
            sb2.append(" ongoingOpKeys=");
            sb2.append(e.a(eVar));
            pVar.invoke(str, sb2.toString());
            Set setA = e.a(eVar);
            Object obj = cVar2.f207041c;
            if (eVar.b(obj, setA)) {
                Iterator it2 = linkedList.iterator();
                do {
                    boolean zHasNext = it2.hasNext();
                    long j12 = cVar2.f207039a;
                    if (zHasNext) {
                        cVar = (c) it2.next();
                        if (j12 == cVar.f207039a) {
                        }
                    }
                    boolean z13 = eVar.f207044d;
                    if (z13) {
                        pVar.invoke(str, "Dequeue '" + cVar2 + "' ");
                    }
                    eVar.f207046f.invoke(str, "startOperation(" + cVar2 + ')');
                    if (z13) {
                        pVar.invoke(str, "startOperation(" + cVar2 + "): adding " + obj + " to ongoingOpKeys = " + e.a(eVar));
                    }
                    eVar.f207051k.add(cVar2);
                    if (z13) {
                        pVar.invoke(str, "startOperation(" + cVar2 + "): removing " + cVar2 + " from opQueue = " + abstractCollection);
                    }
                    it.remove();
                    if (linkedList.remove(cVar2)) {
                        if (z13) {
                            pVar.invoke(str, "startOperation(" + cVar2 + "): removed " + obj + " from contestingOperations = " + linkedList);
                        }
                        eVar.f207052l.execute(new f(eVar));
                    }
                    if (z13) {
                        pVar.invoke(str, "startOperation(" + cVar2 + "): sending " + j12 + " to opStartTriggerStream");
                    }
                    eVar.f207047g.accept(Long.valueOf(j12));
                    return;
                } while (eVar.b(obj, cVar.f207041c));
                if (!linkedList.contains(cVar2)) {
                    linkedList.add(cVar2);
                }
            } else if (!linkedList.contains(cVar2)) {
                linkedList.add(cVar2);
            }
        }
    }
}

package com.avito.android.mvi.rx3.locks.legacy;

import Y41.p;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
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
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f207112b;

    public e(a aVar) {
        this.f207112b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f207112b;
        boolean z12 = aVar.f207084d;
        String str = aVar.f207082b;
        p<String, String, G0> pVar = aVar.f207085e;
        if (z12) {
            pVar.invoke(str, "processOpQueueFromTheHead()");
        }
        AbstractCollection abstractCollection = aVar.f207087g;
        Iterator it = abstractCollection.iterator();
        loop0: while (it.hasNext()) {
            com.avito.android.mvi.rx3.locks.c cVar = (com.avito.android.mvi.rx3.locks.c) it.next();
            pVar.invoke(str, "attemptToStartOperation " + cVar);
            HashSet hashSet = aVar.f207089i;
            Collection collection = cVar.f207041c;
            boolean zA2 = aVar.a(collection, hashSet);
            LinkedList<Set<KeyT>> linkedList = aVar.f207088h;
            if (zA2) {
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    Set set = (Set) it2.next();
                    if (collection.equals(set)) {
                        break loop0;
                    } else if (!aVar.a(collection, set)) {
                        if (!linkedList.contains(collection)) {
                            linkedList.add(collection);
                        }
                    }
                }
                boolean z13 = aVar.f207084d;
                if (z13) {
                    pVar.invoke(str, "Dequeue '" + cVar + "' ");
                }
                aVar.f207086f.invoke(str, "startOperation(" + cVar + ')');
                if (z13) {
                    pVar.invoke(str, "startOperation(" + cVar + "): adding " + collection + " to ongoingOpKeys = " + hashSet);
                }
                hashSet.addAll(collection);
                if (z13) {
                    pVar.invoke(str, "startOperation(" + cVar + "): removing " + cVar + " from opQueue = " + abstractCollection);
                }
                it.remove();
                if (linkedList.remove(collection)) {
                    if (z13) {
                        pVar.invoke(str, "startOperation(" + cVar + "): removed " + collection + " from contestedKeys = " + linkedList);
                    }
                    aVar.f207090j.execute(new e(aVar));
                }
                long j12 = cVar.f207039a;
                if (z13) {
                    pVar.invoke(str, "startOperation(" + cVar + "): sending " + j12 + " to opStartTriggerStream");
                }
                aVar.f207094n.accept(Long.valueOf(j12));
                return;
            }
            if (!linkedList.contains(collection)) {
                linkedList.add(collection);
            }
        }
    }
}

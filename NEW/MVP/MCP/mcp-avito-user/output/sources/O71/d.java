package o71;

import Y61.k;
import Y61.l;
import android.content.ComponentCallbacks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.instance.g;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;
import s71.C48010a;
import w71.C49465d;
import w71.InterfaceC49462a;
import x71.C49789c;
import x71.f;

/* compiled from: Koin.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo71/d;", "", "<init>", "()V", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f419397a = new f(this);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C49789c f419398b = new C49789c(this);

    /* renamed from: c, reason: collision with root package name */
    @k
    public AbstractC48011b f419399c;

    public d() {
        org.koin.mp.d.f421487a.getClass();
        new ConcurrentHashMap();
        new HashMap();
        this.f419399c = new C48010a();
    }

    @k
    public final org.koin.core.scope.a a(@k String str, @k C49465d c49465d, @l ComponentCallbacks componentCallbacks) throws ScopeAlreadyCreatedException {
        f fVar = this.f419397a;
        d dVar = fVar.f442255a;
        AbstractC48011b abstractC48011b = dVar.f419399c;
        String str2 = "|- (+) Scope - id:'" + str + "' q:" + c49465d;
        Level level = Level.f421465b;
        if (abstractC48011b.b(level)) {
            abstractC48011b.a(level, str2);
        }
        HashSet<InterfaceC49462a> hashSet = fVar.f442256b;
        if (!hashSet.contains(c49465d)) {
            AbstractC48011b abstractC48011b2 = dVar.f419399c;
            String str3 = "| Scope '" + c49465d + "' not defined. Creating it ...";
            Level level2 = Level.f421467d;
            if (abstractC48011b2.b(level2)) {
                abstractC48011b2.a(level2, str3);
            }
            hashSet.add(c49465d);
        }
        ConcurrentHashMap concurrentHashMap = fVar.f442257c;
        if (concurrentHashMap.containsKey(str)) {
            throw new ScopeAlreadyCreatedException(AK.c.k("Scope with id '", str, "' is already created"));
        }
        org.koin.core.scope.a aVar = new org.koin.core.scope.a(c49465d, str, false, fVar.f442255a, 4, null);
        if (componentCallbacks != null) {
            aVar.f421476f = componentCallbacks;
        }
        org.koin.core.scope.a[] aVarArr = {fVar.f442258d};
        if (aVar.f421473c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        C42745f0.i(aVar.f421475e, aVarArr);
        concurrentHashMap.put(str, aVar);
        return aVar;
    }

    @l
    public final org.koin.core.scope.a b(@k String str) {
        return (org.koin.core.scope.a) this.f419397a.f442257c.get(str);
    }

    public final void c(@k List<t71.c> list, boolean z12) throws DefinitionOverrideException {
        Set setI = B0.f406639b;
        List<t71.c> listSubList = list;
        while (!listSubList.isEmpty()) {
            t71.c cVar = (t71.c) C42745f0.E(listSubList);
            if (cVar == null) {
                throw new IllegalStateException("Flatten - No head element in list");
            }
            listSubList = listSubList.subList(1, listSubList.size());
            ArrayList arrayList = cVar.f439155f;
            if (arrayList.isEmpty()) {
                setI = b1.i(setI, cVar);
            } else {
                listSubList = C42745f0.h0(listSubList, arrayList);
                setI = b1.i(setI, cVar);
            }
        }
        C49789c c49789c = this.f419398b;
        c49789c.getClass();
        Set<t71.c> set = setI;
        for (t71.c cVar2 : set) {
            for (Map.Entry<String, org.koin.core.instance.e<?>> entry : cVar2.f439153d.entrySet()) {
                String key = entry.getKey();
                org.koin.core.instance.e<?> value = entry.getValue();
                ConcurrentHashMap concurrentHashMap = c49789c.f442251b;
                boolean zContainsKey = concurrentHashMap.containsKey(key);
                org.koin.core.definition.a<?> aVar = value.f421460a;
                d dVar = c49789c.f442250a;
                if (zContainsKey) {
                    if (!z12) {
                        throw new DefinitionOverrideException("Already existing definition for " + aVar + " at " + key);
                    }
                    AbstractC48011b abstractC48011b = dVar.f419399c;
                    String str = "(+) override index '" + key + "' -> '" + aVar + '\'';
                    Level level = Level.f421467d;
                    if (abstractC48011b.b(level)) {
                        abstractC48011b.a(level, str);
                    }
                }
                AbstractC48011b abstractC48011b2 = dVar.f419399c;
                String str2 = "(+) index '" + key + "' -> '" + aVar + '\'';
                Level level2 = Level.f421465b;
                if (abstractC48011b2.b(level2)) {
                    abstractC48011b2.a(level2, str2);
                }
                concurrentHashMap.put(key, value);
            }
            Iterator<g<?>> it = cVar2.f439152c.iterator();
            while (it.hasNext()) {
                g<?> next = it.next();
                c49789c.f442252c.put(Integer.valueOf(next.f421460a.hashCode()), next);
            }
        }
        f fVar = this.f419397a;
        fVar.getClass();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            fVar.f442256b.addAll(((t71.c) it2.next()).f439154e);
        }
    }
}

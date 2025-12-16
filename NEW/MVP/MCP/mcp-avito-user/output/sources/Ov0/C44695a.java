package oV0;

import Y61.k;
import Y61.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: KeyValueInMemoryStorage.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LoV0/a;", "Key", "Value", "LoV0/c;", "<init>", "()V", "key-value-storage_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oV0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44695a<Key, Value> implements c<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f419806a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f419807b = new LinkedHashMap();

    @Override // oV0.d
    public final void a(String str) {
        Set set;
        if (this.f419806a.remove(str) == null || (set = (Set) this.f419807b.get(str)) == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(null);
        }
    }

    @Override // oV0.d
    @l
    public final Value b(Key key) {
        return (Value) this.f419806a.get(key);
    }

    @Override // oV0.d
    public final void c(@l Object obj, String str) {
        Set set;
        if (obj == null) {
            a(str);
        } else {
            if (L.f(this.f419806a.put(str, obj), obj) || (set = (Set) this.f419807b.get(str)) == null) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(obj);
            }
        }
    }

    @k
    public final HV0.c d(Key key, @k e<Value> eVar) {
        LinkedHashMap linkedHashMap = this.f419807b;
        Set set = (Set) linkedHashMap.get(key);
        if (set != null) {
            set.add(eVar);
        } else {
            linkedHashMap.put(key, b1.g(eVar));
        }
        eVar.a(this.f419806a.get(key));
        return new FX0.b(this, key, eVar, 21);
    }
}

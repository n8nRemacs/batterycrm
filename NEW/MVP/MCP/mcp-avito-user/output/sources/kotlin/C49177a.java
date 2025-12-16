package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import t71.InterfaceC48513b;

/* compiled from: ParametersHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv71/a;", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC48513b
/* renamed from: v71.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49177a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Object> f440473a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Boolean f440474b;

    /* renamed from: c, reason: collision with root package name */
    public int f440475c;

    public C49177a() {
        this(null, null, 3, null);
    }

    public final <T> T a(kotlin.reflect.d<?> dVar) {
        int i12 = this.f440475c;
        List<Object> list = this.f440473a;
        Object obj = list.get(i12);
        T t12 = null;
        if (!dVar.n0(obj)) {
            obj = null;
        }
        if (obj != null) {
            t12 = (T) obj;
        }
        if (t12 != null && this.f440475c < C42745f0.J(list)) {
            this.f440475c++;
        }
        return t12;
    }

    @Y61.l
    public <T> T b(@Y61.k kotlin.reflect.d<?> dVar) {
        Object next;
        List<Object> list = this.f440473a;
        if (list.isEmpty()) {
            return null;
        }
        Boolean bool = this.f440474b;
        if (bool == null) {
            next = a(dVar);
            if (next == null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (dVar.n0(next)) {
                        break;
                    }
                }
                if (next == null) {
                    return null;
                }
            }
        } else {
            if (bool.equals(Boolean.TRUE)) {
                return (T) a(dVar);
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (dVar.n0(next)) {
                    break;
                }
            }
            if (next == null) {
                return null;
            }
        }
        return (T) next;
    }

    @Y61.k
    public final String toString() {
        return "DefinitionParameters" + C42745f0.M0(this.f440473a);
    }

    public C49177a(List list, Boolean bool, int i12, C42822w c42822w) {
        list = (i12 & 1) != 0 ? new ArrayList() : list;
        bool = (i12 & 2) != 0 ? null : bool;
        this.f440473a = list;
        this.f440474b = bool;
    }
}

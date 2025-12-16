package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: UrlDecodedParametersBuilder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/a1;", "Lio/ktor/http/w0;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a1 implements InterfaceC41552w0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41554x0 f399923a;

    public a1(@Y61.k C41554x0 c41554x0) {
        this.f399923a = c41554x0;
        boolean z12 = c41554x0.f400384a;
    }

    @Override // io.ktor.util.A0
    @Y61.l
    public final List<String> a(@Y61.k String str) {
        List<String> listA = this.f399923a.a(C41508b.f(str, false));
        if (listA == null) {
            return null;
        }
        List<String> list = listA;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C41508b.e(0, 0, (String) it.next(), 11));
        }
        return arrayList;
    }

    @Override // io.ktor.util.A0
    @Y61.k
    public final Set<Map.Entry<String, List<String>>> b() {
        return ((io.ktor.util.D0) b1.a(this.f399923a)).b();
    }

    @Override // io.ktor.util.A0
    public final void c(@Y61.k Iterable iterable, @Y61.k String str) {
        String strF = C41508b.f(str, false);
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(C41508b.f((String) it.next(), true));
        }
        this.f399923a.c(arrayList, strF);
    }

    @Override // io.ktor.util.A0
    @Y61.k
    public final Set<String> names() {
        Set<String> setKeySet = this.f399923a.f400385b.keySet();
        ArrayList arrayList = new ArrayList(C42745f0.q(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(C41508b.e(0, 0, (String) it.next(), 15));
        }
        return C42745f0.P0(arrayList);
    }
}

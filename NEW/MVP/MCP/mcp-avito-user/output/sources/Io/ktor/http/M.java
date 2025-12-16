package io.ktor.http;

import io.ktor.http.C41524i;
import io.ktor.util.C41613u;
import io.ktor.util.C41616x;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* compiled from: FileContentType.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f399874a = C42727D.c(a.f399876l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f399875b = C42727D.c(b.f399877l);

    /* compiled from: FileContentType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "", "Lio/ktor/http/i;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Map<String, List<? extends C41524i>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f399876l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, List<? extends C41524i>> invoke() {
            C41613u c41613u = new C41613u();
            c41613u.putAll(M.c(new C42770s0((List) C41548u0.f400121a.getValue())));
            return c41613u;
        }
    }

    /* compiled from: FileContentType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/ktor/http/i;", "", "", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Map<C41524i, ? extends List<? extends String>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f399877l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<C41524i, ? extends List<? extends String>> invoke() {
            return M.c(new kotlin.sequences.o0(new C42770s0((List) C41548u0.f400121a.getValue()), N.f399879l));
        }
    }

    @Y61.k
    public static final C41524i a(@Y61.k String str) {
        C41524i.c cVar = C41524i.f400031f;
        int iH2 = C43066x.H('.', C43066x.O(str, C41616x.a("/\\")) + 1, 4, str);
        return d(iH2 == -1 ? C42784z0.f406748b : b(str.substring(iH2 + 1)));
    }

    @Y61.k
    public static final List b(@Y61.k String str) {
        for (String strA = io.ktor.util.I0.a(C43066x.U(".", str)); strA.length() > 0; strA = C43066x.m0(strA, ".", "")) {
            List list = (List) ((Map) f399874a.getValue()).get(strA);
            if (list != null) {
                return list;
            }
        }
        return C42784z0.f406748b;
    }

    @Y61.k
    public static final LinkedHashMap c(@Y61.k InterfaceC43030m interfaceC43030m) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC43030m) {
            Object obj2 = ((kotlin.Q) obj).f406619b;
            Object arrayList = linkedHashMap.get(obj2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(obj2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.P0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kotlin.Q) it.next()).f406620c);
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    @Y61.k
    public static final C41524i d(@Y61.k List<C41524i> list) {
        C41524i c41524i = (C41524i) C42745f0.G(list);
        if (c41524i == null) {
            C41524i.a.f400035a.getClass();
            c41524i = C41524i.a.f400037c;
        }
        if (!kotlin.jvm.internal.L.f(c41524i.f400033d, "text") || C41528k.a(c41524i) != null) {
            return c41524i;
        }
        Charset charset = C43047d.f410589b;
        CharBuffer charBuffer = W31.a.f17734a;
        return c41524i.c("charset", charset.name());
    }
}

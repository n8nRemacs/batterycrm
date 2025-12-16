package io.ktor.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: StringValues.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/B0;", "Lio/ktor/util/A0;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class B0 implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f400384a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, List<String>> f400385b;

    /* compiled from: StringValues.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "name", "", "values", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<String, List<? extends String>, kotlin.G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(String str, List<? extends String> list) {
            B0.this.c(list, str);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B0() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // io.ktor.util.A0
    @Y61.l
    public final List<String> a(@Y61.k String str) {
        return this.f400385b.get(str);
    }

    @Override // io.ktor.util.A0
    @Y61.k
    public final Set<Map.Entry<String, List<String>>> b() {
        return Collections.unmodifiableSet(this.f400385b.entrySet());
    }

    @Override // io.ktor.util.A0
    public final void c(@Y61.k Iterable iterable, @Y61.k String str) {
        List<String> listG = g(str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            k(str2);
            listG.add(str2);
        }
    }

    public final void d(@Y61.k String str, @Y61.k String str2) {
        k(str2);
        g(str).add(str2);
    }

    public final void e(@Y61.k z0 z0Var) {
        z0Var.c(new a());
    }

    public final void f() {
        this.f400385b.clear();
    }

    public final List<String> g(String str) {
        Map<String, List<String>> map = this.f400385b;
        List<String> list = map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        j(str);
        map.put(str, arrayList);
        return arrayList;
    }

    @Y61.l
    public final String h(@Y61.k String str) {
        List<String> listA = a(str);
        if (listA != null) {
            return (String) C42745f0.G(listA);
        }
        return null;
    }

    public final void i(@Y61.k String str) {
        this.f400385b.remove(str);
    }

    @Override // io.ktor.util.A0
    @Y61.k
    public final Set<String> names() {
        return this.f400385b.keySet();
    }

    public B0(boolean z12, int i12) {
        this.f400384a = z12;
        this.f400385b = z12 ? new C41613u<>() : new LinkedHashMap<>(i12);
    }

    public /* synthetic */ B0(boolean z12, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? false : z12, (i13 & 2) != 0 ? 8 : i12);
    }

    public void j(@Y61.k String str) {
    }

    public void k(@Y61.k String str) {
    }
}

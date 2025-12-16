package io.ktor.client.plugins.cache;

import io.ktor.client.engine.C;
import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: HttpCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "header", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class q extends N implements Y41.l<String, String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.ktor.http.content.p f399177l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f399178m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H f399179n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(io.ktor.http.content.p pVar, Y41.l<? super String, String> lVar, Y41.l<? super String, ? extends List<String>> lVar2) {
        super(1);
        this.f399177l = pVar;
        this.f399178m = (H) lVar;
        this.f399179n = (H) lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Y41.l, kotlin.jvm.internal.H] */
    /* JADX WARN: Type inference failed for: r8v4, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // Y41.l
    public final String invoke(String str) {
        String string;
        String str2 = str;
        C41519f0.f400005a.getClass();
        boolean zEquals = str2.equals(C41519f0.f400013i);
        io.ktor.http.content.p pVar = this.f399177l;
        if (zEquals) {
            Long f399593a = pVar.getF399980d();
            if (f399593a == null || (string = f399593a.toString()) == null) {
                return "";
            }
        } else {
            if (!str2.equals(C41519f0.f400014j)) {
                String str3 = C41519f0.f400001A;
                if (!str2.equals(str3)) {
                    List<String> listA = pVar.c().a(str2);
                    if (listA == null && (listA = (List) this.f399179n.invoke(str2)) == null) {
                        listA = C42784z0.f406748b;
                    }
                    return C42745f0.O(listA, ";", null, null, null, 62);
                }
                String str4 = pVar.c().get(str3);
                if (str4 != null) {
                    return str4;
                }
                String str5 = (String) this.f399178m.invoke(str3);
                if (str5 != null) {
                    return str5;
                }
                Set<String> set = C.f398853a;
                return "Ktor client";
            }
            C41524i f399594b = pVar.getF399978b();
            if (f399594b == null || (string = f399594b.toString()) == null) {
                return "";
            }
        }
        return string;
    }
}

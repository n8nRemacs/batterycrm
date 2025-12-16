package io.ktor.client.engine;

import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.T;
import io.ktor.http.U;
import io.ktor.http.V;
import io.ktor.util.InterfaceC41603j0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Set<String> f398853a;

    static {
        C41519f0 c41519f0 = C41519f0.f400005a;
        c41519f0.getClass();
        String str = C41519f0.f400016l;
        c41519f0.getClass();
        String str2 = C41519f0.f400018n;
        c41519f0.getClass();
        String str3 = C41519f0.f400022r;
        c41519f0.getClass();
        String str4 = C41519f0.f400019o;
        c41519f0.getClass();
        f398853a = C42756l.l0(new String[]{str, str2, str3, str4, C41519f0.f400021q});
    }

    @InterfaceC41603j0
    public static final void a(@Y61.k V v12, @Y61.k io.ktor.http.content.p pVar, @Y61.k Y41.p pVar2) {
        String string;
        String string2;
        A a12 = new A(v12, pVar);
        U u12 = new U(0, 1, null);
        a12.invoke(u12);
        u12.l().c(new B(pVar2));
        C41519f0.f400005a.getClass();
        String str = C41519f0.f400001A;
        if (v12.get(str) == null && pVar.c().get(str) == null) {
            io.ktor.util.s0.f400547a.getClass();
            pVar2.invoke(str, "Ktor client");
        }
        C41524i f399581b = pVar.getF399581b();
        if (f399581b == null || (string = f399581b.toString()) == null) {
            T tC2 = pVar.c();
            String str2 = C41519f0.f400014j;
            string = tC2.get(str2);
            if (string == null) {
                string = v12.get(str2);
            }
        }
        Long f399580a = pVar.getF399580a();
        if (f399580a == null || (string2 = f399580a.toString()) == null) {
            T tC3 = pVar.c();
            String str3 = C41519f0.f400013i;
            String str4 = tC3.get(str3);
            string2 = str4 == null ? v12.get(str3) : str4;
        }
        if (string != null) {
            pVar2.invoke(C41519f0.f400014j, string);
        }
        if (string2 != null) {
            pVar2.invoke(C41519f0.f400013i, string2);
        }
    }
}

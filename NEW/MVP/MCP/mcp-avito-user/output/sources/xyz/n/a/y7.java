package xyz.n.a;

import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import org.joda.time.AbstractC44854a;
import org.joda.time.C44856c;
import org.joda.time.C44866h;
import org.joda.time.chrono.x;
import org.joda.time.convert.d;

/* loaded from: classes9.dex */
public final class y7 implements o<C44856c>, h<C44856c> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        return new m(((C44856c) obj).toString());
    }

    @Override // com.google.gson.h
    public final C44856c deserialize(i iVar, Type type, g gVar) {
        String strS = iVar.s();
        C44856c c44856c = new C44856c();
        if (d.f420665f == null) {
            d.f420665f = new d();
        }
        org.joda.time.convert.h hVarA = d.f420665f.a(strS);
        AbstractC44854a abstractC44854aB = hVarA.b(strS);
        C44866h.b bVar = C44866h.f420908a;
        if (abstractC44854aB == null) {
            abstractC44854aB = x.V();
        }
        c44856c.f420463c = abstractC44854aB;
        c44856c.f420462b = hVarA.c(strS, null);
        c44856c.e();
        return c44856c;
    }
}

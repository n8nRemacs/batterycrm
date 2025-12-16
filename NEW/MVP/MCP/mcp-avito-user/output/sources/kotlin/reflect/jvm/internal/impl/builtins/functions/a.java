package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Y61.k;
import Y61.l;
import f51.InterfaceC40236b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;
import kotlin.text.C43066x;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
@s0
/* loaded from: classes8.dex */
public final class a implements InterfaceC40236b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kotlin.reflect.jvm.internal.impl.storage.f f407200a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G f407201b;

    public a(@k kotlin.reflect.jvm.internal.impl.storage.f fVar, @k G g12) {
        this.f407200a = fVar;
        this.f407201b = g12;
    }

    @Override // f51.InterfaceC40236b
    public final boolean a(@k kotlin.reflect.jvm.internal.impl.name.c cVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        String strB = fVar.b();
        if (!C43066x.h0(strB, "Function", false) && !C43066x.h0(strB, "KFunction", false) && !C43066x.h0(strB, "SuspendFunction", false) && !C43066x.h0(strB, "KSuspendFunction", false)) {
            return false;
        }
        f.f407219c.getClass();
        return f.f407220d.a(strB, cVar) != null;
    }

    @Override // f51.InterfaceC40236b
    @k
    public final Collection<InterfaceC42851d> b(@k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return B0.f406639b;
    }

    @Override // f51.InterfaceC40236b
    @l
    public final InterfaceC42851d c(@k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (bVar.f409241c || !bVar.f409240b.e().d()) {
            return null;
        }
        String strB = bVar.h().b();
        if (!C43066x.q(strB, "Function", false)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c cVarG = bVar.g();
        f.f407219c.getClass();
        f.b bVarA = f.f407220d.a(strB, cVarG);
        if (bVarA == null) {
            return null;
        }
        List<K> listW = this.f407201b.i0(cVarG).w();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof kotlin.reflect.jvm.internal.impl.builtins.f) {
                arrayList2.add(next);
            }
        }
        kotlin.reflect.jvm.internal.impl.builtins.b bVar2 = (kotlin.reflect.jvm.internal.impl.builtins.f) C42745f0.G(arrayList2);
        if (bVar2 == null) {
            bVar2 = (kotlin.reflect.jvm.internal.impl.builtins.b) C42745f0.E(arrayList);
        }
        return new b(this.f407200a, bVar2, bVarA.f407223a, bVarA.f407224b);
    }
}

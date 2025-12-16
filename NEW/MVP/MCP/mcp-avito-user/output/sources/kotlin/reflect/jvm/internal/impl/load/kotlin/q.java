package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.load.kotlin.x;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42950g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42951h;

/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes8.dex */
public final class q implements InterfaceC42951h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g f408541a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f408542b;

    public q(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar, @Y61.k o oVar) {
        this.f408541a = gVar;
        this.f408542b = oVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42951h
    @Y61.l
    public final C42950g a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) throws ClassNotFoundException {
        o oVar = this.f408542b;
        C42954k c42954k = oVar.f408539a;
        if (c42954k == null) {
            c42954k = null;
        }
        c42954k.f409916c.getClass();
        m51.e eVar = m51.e.f414319g;
        x.a.b bVarA = this.f408541a.a(bVar);
        z zVar = bVarA != null ? bVarA.f408560a : null;
        if (zVar == null) {
            return null;
        }
        zVar.c().equals(bVar);
        return oVar.f(zVar);
    }
}

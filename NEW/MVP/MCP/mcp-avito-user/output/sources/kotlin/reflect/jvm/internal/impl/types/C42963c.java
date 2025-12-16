package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;
import u51.InterfaceC48806h;

/* compiled from: AbstractTypeChecker.kt */
@kotlin.jvm.internal.s0
/* renamed from: kotlin.reflect.jvm.internal.impl.types.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42963c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42963c f410086a = new C42963c();

    public static boolean a(@Y61.k TypeCheckerState typeCheckerState, @Y61.k u51.i iVar, @Y61.k TypeCheckerState.b bVar) {
        InterfaceC42966b interfaceC42966b = typeCheckerState.f410053c;
        if ((interfaceC42966b.a0(iVar) && !interfaceC42966b.g(iVar)) || interfaceC42966b.l(iVar)) {
            return true;
        }
        typeCheckerState.c();
        ArrayDeque<u51.i> arrayDeque = typeCheckerState.f410057g;
        kotlin.reflect.jvm.internal.impl.utils.g gVar = typeCheckerState.f410058h;
        arrayDeque.push(iVar);
        while (!arrayDeque.isEmpty()) {
            if (gVar.f410369c > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + iVar + ". Supertypes = " + C42745f0.O(gVar, null, null, null, null, 63)).toString());
            }
            u51.i iVarPop = arrayDeque.pop();
            if (gVar.add(iVarPop)) {
                TypeCheckerState.b bVar2 = interfaceC42966b.g(iVarPop) ? TypeCheckerState.b.c.f410063a : bVar;
                if (kotlin.jvm.internal.L.f(bVar2, TypeCheckerState.b.c.f410063a)) {
                    bVar2 = null;
                }
                if (bVar2 == null) {
                    continue;
                } else {
                    Iterator<InterfaceC48806h> it = interfaceC42966b.n0(interfaceC42966b.w(iVarPop)).iterator();
                    while (it.hasNext()) {
                        u51.i iVarA = bVar2.a(typeCheckerState, it.next());
                        if ((interfaceC42966b.a0(iVarA) && !interfaceC42966b.g(iVarA)) || interfaceC42966b.l(iVarA)) {
                            typeCheckerState.a();
                            return true;
                        }
                        arrayDeque.add(iVarA);
                    }
                }
            }
        }
        typeCheckerState.a();
        return false;
    }

    public static boolean b(TypeCheckerState typeCheckerState, u51.i iVar, u51.m mVar) {
        InterfaceC42966b interfaceC42966b = typeCheckerState.f410053c;
        if (interfaceC42966b.Y(iVar)) {
            return true;
        }
        if (interfaceC42966b.g(iVar)) {
            return false;
        }
        if (typeCheckerState.f410052b && interfaceC42966b.j(iVar)) {
            return true;
        }
        return interfaceC42966b.e0(interfaceC42966b.w(iVar), mVar);
    }
}

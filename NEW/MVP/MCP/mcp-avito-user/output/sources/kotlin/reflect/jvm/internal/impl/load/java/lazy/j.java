package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k51.y;
import k51.z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.B;

/* compiled from: resolvers.kt */
/* loaded from: classes8.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f408259a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42883l f408260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f408261c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f408262d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j<y, B> f408263e;

    public j(@Y61.k h hVar, @Y61.k InterfaceC42883l interfaceC42883l, @Y61.k z zVar, int i12) {
        this.f408259a = hVar;
        this.f408260b = interfaceC42883l;
        this.f408261c = i12;
        ArrayList typeParameters = zVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i13));
            i13++;
        }
        this.f408262d = linkedHashMap;
        c cVar = this.f408259a.f408253a;
        this.f408263e = cVar.f408076a.b(new i(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.m
    @Y61.l
    public final g0 a(@Y61.k y yVar) {
        B bInvoke = this.f408263e.invoke(yVar);
        return bInvoke != null ? bInvoke : this.f408259a.f408254b.a(yVar);
    }
}

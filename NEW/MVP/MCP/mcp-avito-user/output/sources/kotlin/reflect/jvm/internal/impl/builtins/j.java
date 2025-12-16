package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes8.dex */
class j implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, InterfaceC42851d> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f407227b;

    public j(k kVar) {
        this.f407227b = kVar;
    }

    @Override // Y41.l
    public final InterfaceC42851d invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
        G gK2 = this.f407227b.k();
        kotlin.reflect.jvm.internal.impl.name.c cVar = n.f407339l;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = gK2.i0(cVar).n();
        if (jVarN == null) {
            k.a(11);
            throw null;
        }
        InterfaceC42853f interfaceC42853fG = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.a) jVarN).g(fVar2, NoLookupLocation.f407884b);
        if (interfaceC42853fG == null) {
            throw new AssertionError("Built-in class " + cVar.c(fVar2) + " is not found");
        }
        if (interfaceC42853fG instanceof InterfaceC42851d) {
            return (InterfaceC42851d) interfaceC42853fG;
        }
        throw new AssertionError("Must be a class descriptor " + fVar2 + ", but was " + interfaceC42853fG);
    }
}

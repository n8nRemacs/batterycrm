package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C42930h;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42938a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.s;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42931i extends C42930h.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f408526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C42930h f408527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42851d f408528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b f408529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f408530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f408531g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42931i(C42930h c42930h, InterfaceC42851d interfaceC42851d, kotlin.reflect.jvm.internal.impl.name.b bVar, List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list, b0 b0Var) {
        super();
        this.f408527c = c42930h;
        this.f408528d = interfaceC42851d;
        this.f408529e = bVar;
        this.f408530f = list;
        this.f408531g = b0Var;
        this.f408526b = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z.a
    public final void a() {
        HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map = this.f408526b;
        C42930h c42930h = this.f408527c;
        c42930h.getClass();
        e51.b.f394954a.getClass();
        kotlin.reflect.jvm.internal.impl.name.b bVar = e51.b.f394956c;
        kotlin.reflect.jvm.internal.impl.name.b bVar2 = this.f408529e;
        boolean zQ2 = false;
        if (bVar2.equals(bVar)) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar = map.get(kotlin.reflect.jvm.internal.impl.name.f.e("value"));
            kotlin.reflect.jvm.internal.impl.resolve.constants.s sVar = gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.s ? (kotlin.reflect.jvm.internal.impl.resolve.constants.s) gVar : null;
            if (sVar != null) {
                T t12 = sVar.f409586a;
                s.b.C11686b c11686b = t12 instanceof s.b.C11686b ? (s.b.C11686b) t12 : null;
                if (c11686b != null) {
                    zQ2 = c42930h.q(c11686b.f409605a.f409584a);
                }
            }
        }
        if (zQ2 || c42930h.q(bVar2)) {
            return;
        }
        this.f408530f.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.f408528d.q(), map, this.f408531g));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.C42930h.a
    public final void g(@Y61.k ArrayList arrayList, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        k0 k0VarB = kotlin.reflect.jvm.internal.impl.load.java.components.b.b(fVar, this.f408528d);
        if (k0VarB != null) {
            HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map = this.f408526b;
            kotlin.reflect.jvm.internal.impl.resolve.constants.i iVar = kotlin.reflect.jvm.internal.impl.resolve.constants.i.f409588a;
            List listB = kotlin.reflect.jvm.internal.impl.utils.a.b(arrayList);
            O type = k0VarB.getType();
            iVar.getClass();
            map.put(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.y(listB, type));
            return;
        }
        if (this.f408527c.q(this.f408529e) && kotlin.jvm.internal.L.f(fVar.b(), "value")) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C42938a) {
                    arrayList2.add(next);
                }
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list = this.f408530f;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                list.add((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) ((C42938a) it2.next()).f409586a);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.C42930h.a
    public final void h(@Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        this.f408526b.put(fVar, gVar);
    }
}
